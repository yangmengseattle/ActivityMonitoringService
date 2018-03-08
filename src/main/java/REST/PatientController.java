package REST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// PatientController:
//  This controller handles displaying of patient data using the
//  Thymeleaf template variables in the doctor.html page. This controller
//  is an attempt at RESTful calls without actually being a RESTful
//  controller due to the inability to make calls from Javascript.
@Controller
@RequestMapping("/patient")
public class PatientController
{
    @RequestMapping(method = RequestMethod.GET)
    public String LoadPage(@RequestParam String patientId, Model model)
    {
        // TODO: Use p to fill in data in patient.html (since we can't use Javascript in IntelliJ without paying wtf)
        // Get the patient's info from the cache or database
        Patient p = Patient.GetPatient(Integer.parseInt(patientId));

        // Use hard-coded data to match database for now
        model.addAttribute("name", p.name);
        model.addAttribute("id", p.id);
        model.addAttribute("treatment", p.treatment);
        model.addAttribute("activityLevel", 4563);
        model.addAttribute("bed", "21:30");
        model.addAttribute("wake", "6:30");
        model.addAttribute("midWake", "20");
        model.addAttribute("sleep", "8.66 hrs");
        model.addAttribute("bikeActual", "45");
        model.addAttribute("stepsActual", "1800");
        model.addAttribute("fruit", "2");
        model.addAttribute("meat", "2");
        model.addAttribute("veggies", "2");
        model.addAttribute("sweets", "1");
        model.addAttribute("beer", "2");

        // Return the doctor page with all the data filled in
        return "doctor";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String ChangeTreatment(@RequestParam String patientId, @RequestParam String newTreatment, Model model)
    {
        // Get the patient from the cache and update the treatment
        Patient p = Patient.GetPatient(Integer.parseInt(patientId));
        p.treatment = newTreatment;

        // Use hard-coded data to match database for now
        model.addAttribute("name", p.name);
        model.addAttribute("id", p.id);
        model.addAttribute("treatment", p.treatment);
        model.addAttribute("activityLevel", 4563);
        model.addAttribute("bed", "21:30");
        model.addAttribute("wake", "6:30");
        model.addAttribute("midWake", "20");
        model.addAttribute("sleep", "8.66 hrs");
        model.addAttribute("bikeActual", "45");
        model.addAttribute("stepsActual", "1800");
        model.addAttribute("fruit", "2");
        model.addAttribute("meat", "2");
        model.addAttribute("veggies", "2");
        model.addAttribute("sweets", "1");
        model.addAttribute("beer", "2");

        // Return the doctor page with the data filled in
        return "doctor";
    }
}
