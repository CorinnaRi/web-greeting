package de.awacademy.webgreeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting/{lang}/{name}")
    public ResponseEntity<String> greeting(@PathVariable String lang, @PathVariable String name) {

        String greeting = greetingService.getHello(lang, name);

        return ResponseEntity.ok(greeting);
    }

    // ToDo: Cookie einbauen


}
