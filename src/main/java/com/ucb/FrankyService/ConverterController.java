package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {


//    ConverterService converterService;
//    ConverterController(ConverterService converterService) {
//        this.converterService = converterService;
//    }

    @Autowired
    ConverterService converterService;

    @GetMapping("/status")
    public String getStatus() {
        return "OK";
    }

    @PostMapping("/converter/celsius-to-fahrenheit")
    public ResponseEntity<ConverterResponseDto> celsiusToFahrenheit(@RequestBody ConverterRequestDto converterRequestDto) {
         ConverterResponseDto response = new ConverterResponseDto(
                 converterService.celsiusToFahrenheit(
                         converterRequestDto.value()
                 ),
                 "F"
         );
         return ResponseEntity.ok(response);
    }

    @PostMapping("/converter/fahrenheit-to-celsius")
    public ResponseEntity<ConverterResponseDto> fahrenheitToCelsius(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.fahrenheitToCelsius(
                        converterRequestDto.value()
                ),
                "C"
        );
        return ResponseEntity.ok(response);
    }

    @PostMapping("/converter/bs-to-dollar")
    public ResponseEntity<ConverterResponseDto> bsToDollar(@RequestBody ConverterRequestDto converterRequestDto) {
        ConverterResponseDto response = new ConverterResponseDto(
                converterService.bsToDollars(
                        converterRequestDto.value()
                ),
                "$"
        );
        return ResponseEntity.ok(response);
    }
}
