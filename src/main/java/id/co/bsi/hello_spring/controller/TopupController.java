package id.co.bsi.hello_spring.controller;
import id.co.bsi.hello_spring.dto.request.TopupRequest;
import id.co.bsi.hello_spring.dto.response.TopupResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopupController {
    @PostMapping("api/TopUp")
    public ResponseEntity<TopupResponse> topUp(@RequestBody TopupRequest topupRequest) {
        TopupResponse topupResponse = new TopupResponse();
        topupResponse.setStatus("Success");
        topupResponse.setMessage("Success Melakukan Top Up");
        return ResponseEntity.ok(topupResponse);
    }
}
