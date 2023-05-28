package org.marinalopez.registry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/email")
    public String get() {
        return "Buenas, este es el servicio que registrará la información de los usuarios en la base de datos y devolvera su ";
    }
}
