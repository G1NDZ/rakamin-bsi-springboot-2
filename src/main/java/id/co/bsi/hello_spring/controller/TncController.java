package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.TncRequest;
import id.co.bsi.hello_spring.dto.response.TncResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TncController {

    @GetMapping("/api/tncpopups")
    public ResponseEntity<TncResponse> tnc(@RequestBody TncRequest tncRequest) {
        TncResponse tnCResponse = new TncResponse();
        tnCResponse.setStatus("success");
        tnCResponse.setToken("initokeninitokeninitokeninitoken");

        return ResponseEntity.ok(tnCResponse);
    }
}
