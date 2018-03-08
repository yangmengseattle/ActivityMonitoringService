package REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// DoctorController:
//  Show the doctor view. All interaction in this view will use the PatientController.
@Controller
@RequestMapping("/doctor")
public class DoctorController
{
    @RequestMapping(method = RequestMethod.GET)
    public String Doctor()
    {
        return "doctor";
    }
}
