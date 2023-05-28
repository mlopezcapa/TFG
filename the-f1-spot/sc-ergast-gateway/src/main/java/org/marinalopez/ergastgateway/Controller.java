package org.marinalopez.ergastgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/index")
    public String index(){
        return "que hay de nuevo viejo?";
    }
}
