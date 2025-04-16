package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.LoginRequest;
import id.co.bsi.hello_spring.dto.response.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping("/api/UserNames")
    public ResponseEntity<UserNameResponse> getUserNames() {
        UserNameResponse userNameResponse = new UserNameResponse();
        userNameResponse.setUserName("admin");
        return  ResponseEntity.ok(userNameResponse);
    }

    @GetMapping("api/Balances")
    public ResponseEntity<BalanceResponse> getBalance() {
        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setBalance(5000000);
        return  ResponseEntity.ok(balanceResponse);
    }

    @GetMapping("api/AccountNo")
    public ResponseEntity<AccountNoResponse> getAccountNo() {
        AccountNoResponse accountNoResponse = new AccountNoResponse();
        accountNoResponse.setAccountNo("12345");
        return  ResponseEntity.ok(accountNoResponse);
    }

    @GetMapping("api/Histories/1")
    public ResponseEntity<HistoryResponse> getHistories() {
        HistoryResponse historyResponse = new HistoryResponse();
        historyResponse.setDate("30 June 2020");
        historyResponse.setAmount(5000000);
        historyResponse.setDescription("This is the description");
        historyResponse.setType("Transfer");
        historyResponse.setFromTo("fadil");

        return  ResponseEntity.ok(historyResponse);
    }

}
