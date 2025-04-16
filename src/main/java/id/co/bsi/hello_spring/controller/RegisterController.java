package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.RegisterRequest;
import id.co.bsi.hello_spring.dto.response.RegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RegisterController {

    @PostMapping("/api/registers")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = new RegisterResponse();
        registerResponse.setStatus("success");
        registerResponse.setToken("initokeninitokeninitokeninitoken");

        return ResponseEntity.ok(registerResponse);
    }
}
