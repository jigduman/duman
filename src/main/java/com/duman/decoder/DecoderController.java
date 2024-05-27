package com.duman.decoder;


import org.springframework.web.bind.annotation.*;

import java.util.Base64;

@RestController
@RequestMapping("/api")
public class DecoderController {

    @PostMapping("/decode")
    public String decodeBase64(@RequestBody String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        return new String(decodedBytes);
    }
}
