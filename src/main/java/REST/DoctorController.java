package REST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DoctorController
{
    @RequestMapping("/doctor")
    public String Doctor(Model model)
    {
        return "test";
    }
}
