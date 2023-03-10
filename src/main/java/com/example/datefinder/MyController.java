package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
@RestController
public class MyController {
    @GetMapping("/")
    public String vennela() {
    LocalDate srn=LocalDate.now();
    LocalDate next_one=srn.plusDays(100);
    DateTimeFormatter one=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String dt=next_one.format(one);
    return dt;


    }
}
