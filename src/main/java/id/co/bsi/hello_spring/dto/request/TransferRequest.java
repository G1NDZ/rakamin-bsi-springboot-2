package id.co.bsi.hello_spring.dto.request;

import lombok.Data;

@Data
public class TransferRequest {
    private String accountNumber;
    private String amount;
    private String transactionDate;
    private String note;
}
