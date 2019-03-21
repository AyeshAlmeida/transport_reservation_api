package reservation.io.reservation.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        return "Hello World!";
    }
}
