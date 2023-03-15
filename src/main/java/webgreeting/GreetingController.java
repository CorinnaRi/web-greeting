package webgreeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting/{lang}/{name}")
    public String greeting(@PathVariable String lang, @PathVariable String name, Model model) {

        String greeting = greetingService.getHello(lang, name);
        model.addAttribute("greeting", greeting);
        return "greetingTemplate";
    }

    // ToDo: Cookie einbauen


}
