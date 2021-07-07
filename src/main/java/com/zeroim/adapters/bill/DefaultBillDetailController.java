package com.zeroim.adapters.bill;

import com.zeroim.facades.command.bill.BillDetailCommandFacade;
import com.zeroim.facades.query.bill.BillDetailQueryFacade;
import com.zeroim.ports.primary.bill.BillDetailController;
import com.zeroim.requests.bill.BillDetailDTO;
import com.zeroim.requests.util.ResError;
import com.zeroim.requests.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.UUID;

@RestController
public class DefaultBillDetailController implements BillDetailController {
    @Autowired
    private final BillDetailCommandFacade commandFacade;
    @Autowired
    private final BillDetailQueryFacade queryFacade;

    public DefaultBillDetailController(BillDetailCommandFacade commandFacade, BillDetailQueryFacade queryFacade) {
        this.commandFacade = commandFacade;
        this.queryFacade = queryFacade;
    }

    @Override
    public ResponseEntity<Response<BillDetailDTO>> getById(UUID id) {
        Response<BillDetailDTO> response = new Response<>();
        ResError error = new ResError();
        BillDetailDTO billDetailDTO = queryFacade.getById(id);
        response.setData(billDetailDTO);
        if (Objects.isNull(billDetailDTO)) {
            error.setErrorCode(HttpStatus.NOT_FOUND.value());
            error.setMessage("Bill detail not found");
            return getResponseEntity(response, error, HttpStatus.NOT_FOUND);
        } else {
            return getResponseEntity(response, error, HttpStatus.OK);
        }
    }

    private <T> ResponseEntity<Response<T>> getResponseEntity(Response<T> response, ResError error, HttpStatus status) {
        response.setError(error);
        return ResponseEntity.status(status).body(response);
    }
}
