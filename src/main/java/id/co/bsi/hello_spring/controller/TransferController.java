package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.LoginRequest;
import id.co.bsi.hello_spring.dto.request.TransferRequest;
import id.co.bsi.hello_spring.dto.response.AccountHistoryResponse;
import id.co.bsi.hello_spring.dto.response.TransferResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {

    @PostMapping("/api/transfers")
    public ResponseEntity<TransferResponse> transfer(@RequestBody TransferRequest transferRequest) {
        TransferResponse transferResponse = new TransferResponse();
        transferResponse.setStatus("success");
        transferResponse.setMessage("Transfer success");
        return ResponseEntity.ok(transferResponse);
    }

    @GetMapping("/accountHistory")
    public ResponseEntity<AccountHistoryResponse> accountHistory() {
        AccountHistoryResponse accountHistoryResponse = new AccountHistoryResponse();
        accountHistoryResponse.setNameAccount("John Doe");
        accountHistoryResponse.setNumberAccount("222222");
        return ResponseEntity.ok(accountHistoryResponse);
    }

}
