package id.co.bsi.hello_spring.dto.request;

import lombok.Data;

@Data
public class TopupRequest {
    private static int ammount;
    private static String from;
    private static String notes;
}
