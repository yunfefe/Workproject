package com.girl.mylove;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/want")
public String saylove(){
    return "I do";
}
}
