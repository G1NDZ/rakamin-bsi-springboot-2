package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.LoginRequest;
import id.co.bsi.hello_spring.dto.request.RegisterRequest;
import id.co.bsi.hello_spring.dto.request.TncRequest;
import id.co.bsi.hello_spring.dto.response.LoginResponse;
import id.co.bsi.hello_spring.dto.response.RegisterResponse;
import id.co.bsi.hello_spring.dto.response.TnCResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/api/logins")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setStatus("success");
        loginResponse.setToken("initokeninitokeninitokeninitoken");

        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/api/registers")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setStatus("success");
        registerResponse.setToken("initokeninitokeninitokeninitoken");

        return ResponseEntity.ok(registerResponse);
    }

    @GetMapping("/api/tncpopups")
    public ResponseEntity<TnCResponse> tnc(@RequestBody TncRequest tncRequest) {
        TnCResponse tnCResponse = new TnCResponse();
        tnCResponse.setStatus("success");
        tnCResponse.setToken("initokeninitokeninitokeninitoken");

        return ResponseEntity.ok(tnCResponse);
    }

}
