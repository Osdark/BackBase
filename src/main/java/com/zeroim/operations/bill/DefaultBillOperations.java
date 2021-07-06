package com.zeroim.operations.bill;

import com.zeroim.converter.Converter;
import com.zeroim.domain.bill.Bill;
import com.zeroim.domain.bill.BillDetail;
import com.zeroim.populators.Populator;
import com.zeroim.populators.bill.BillDetailRequestPopulator;
import com.zeroim.populators.bill.BillRequestPopulator;
import com.zeroim.populators.bill.BillResponsePopulator;
import com.zeroim.ports.primary.bill.BillDetailService;
import com.zeroim.ports.primary.bill.BillService;
import com.zeroim.requests.bill.BillDTO;
import com.zeroim.requests.bill.BillDetailDTO;
import com.zeroim.requests.bill.CreateBillDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultBillOperations implements BillOperations {
    @Autowired
    private final BillService billService;
    @Autowired
    private final BillDetailService billDetailService;

    public DefaultBillOperations(BillService billService, BillDetailService billDetailService) {
        this.billService = billService;
        this.billDetailService = billDetailService;
    }

    @Override
    public BillDTO createBill(CreateBillDTO billDTO) {
        billDetailService.massiveCreation(convertBillDetailList(billDTO.getBillDetailDTOS()));
        Bill billSaved = billService.create(convertBillDTO(billDTO.getBillDTO()));
        return convertBill(billSaved);
    }

    private BillDTO convertBill(Bill bill) {
        Converter<Bill, BillDTO> responseConverter = buildBillResponseConverter();
        return responseConverter.convert(bill);
    }

    private Converter<Bill, BillDTO> buildBillResponseConverter() {
        Populator<Bill, BillDTO> responsePopulator = new BillResponsePopulator();
        return Converter.of(BillDTO.class).withPopulator(responsePopulator);
    }

    private Bill convertBillDTO(BillDTO billDTO) {
        Converter<BillDTO, Bill> requestConverter = buildBillRequestConverter();
        return requestConverter.convert(billDTO);
    }

    private Converter<BillDTO, Bill> buildBillRequestConverter() {
        Populator<BillDTO, Bill> requestPopulator = new BillRequestPopulator();
        return Converter.of(Bill.class).withPopulator(requestPopulator);
    }

    private List<BillDetail> convertBillDetailList(List<BillDetailDTO> billDetailDTOS) {
        Converter<BillDetailDTO, BillDetail> requestConverter = buildBillDetailRequestConverter();
        return requestConverter.convertAll(billDetailDTOS);
    }

    private Converter<BillDetailDTO, BillDetail> buildBillDetailRequestConverter() {
        Populator<BillDetailDTO, BillDetail> requestPopulator = new BillDetailRequestPopulator();
        return Converter.of(BillDetail.class).withPopulator(requestPopulator);
    }
}
