package com.zeroim.adapters.bill;

import com.zeroim.facades.command.bill.BillCommandFacade;
import com.zeroim.facades.query.bill.BillQueryFacade;
import com.zeroim.operations.bill.BillOperations;
import com.zeroim.ports.primary.bill.BillController;
import com.zeroim.requests.bill.BillDTO;
import com.zeroim.requests.bill.CreateBillDTO;
import com.zeroim.requests.util.ResError;
import com.zeroim.requests.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
public class DefaultBillController implements BillController {
    @Autowired
    private final BillCommandFacade commandFacade;
    @Autowired
    private final BillOperations operations;
    @Autowired
    private final BillQueryFacade queryFacade;

    public DefaultBillController(BillCommandFacade commandFacade, BillOperations operations,
                                 BillQueryFacade queryFacade) {
        this.commandFacade = commandFacade;
        this.operations = operations;
        this.queryFacade = queryFacade;
    }

    @Override
    public ResponseEntity<Response<BillDTO>> create(CreateBillDTO createBillDTO) {
        Response<BillDTO> response = new Response<>();
        ResError error = new ResError();
        BillDTO billDTO = operations.createBill(createBillDTO);
        response.setData(billDTO);

        if (Objects.isNull(billDTO)) {
            return getBadResponseEntity(response, error, HttpStatus.INTERNAL_SERVER_ERROR, "Bill not created");
        } else {
            return getResponseEntityOk(response, error);
        }
    }


    @Override
    public ResponseEntity<Response<List<BillDTO>>> getAll() {
        Response<List<BillDTO>> response = new Response<>();
        ResError error = new ResError();
        List<BillDTO> billDTOS = queryFacade.getAll();
        response.setData(billDTOS);

        if (Objects.isNull(billDTOS)) {
            return getBadResponseEntity(response, error, HttpStatus.NOT_FOUND, "List not found");
        } else {
            return getResponseEntityOk(response, error);
        }
    }

    @Override
    public ResponseEntity<Response<BillDTO>> getById(UUID id) {
        Response<BillDTO> response = new Response<>();
        ResError error = new ResError();
        BillDTO billDTO = queryFacade.getById(id);
        response.setData(billDTO);

        if (Objects.isNull(billDTO)) {
            return getBadResponseEntity(response, error, HttpStatus.NOT_FOUND, "List not found");
        } else {
            return getResponseEntityOk(response, error);
        }
    }

    private <T> ResponseEntity<Response<T>> getResponseEntityOk(Response<T> response, ResError error) {
        response.setError(error);
        return ResponseEntity.ok().body(response);
    }

    private <T> ResponseEntity<Response<T>> getBadResponseEntity(Response<T> response, ResError error,
                                                                 HttpStatus status, String message) {
        error.setErrorCode(status.value());
        error.setMessage(message);
        response.setError(error);
        return ResponseEntity.status(status).build();
    }
}
