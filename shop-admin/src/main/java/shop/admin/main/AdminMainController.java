package shop.admin.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminMainController {

    @RequestMapping("/main")
    public String main() {
        return "/main/main";
    }
}
