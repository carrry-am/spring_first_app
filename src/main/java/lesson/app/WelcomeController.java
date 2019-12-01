package lesson.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "hello from controller");
        return "index";
    }
}
