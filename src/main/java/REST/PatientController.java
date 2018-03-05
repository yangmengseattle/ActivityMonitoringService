package REST;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/patient")
public class PatientController
{
    @RequestMapping(method = RequestMethod.GET)
    public String LoadPage(@RequestParam String patientId, Model model)
    {
        // TODO: Use p to fill in data in patient.html (since we can't use Javascript in IntelliJ without paying wtf)
        Patient p = Patient.GetPatient(Integer.parseInt(patientId));

        model.addAttribute("name", p.name);
        model.addAttribute("id", p.id);
        model.addAttribute("treatment", p.treatment);
        model.addAttribute("activityLevel", 80);    // Dummy data
        model.addAttribute("avgBed", "22:57");      // Dummy data
        model.addAttribute("avgWake", "5:21");      // Dummy data
        model.addAttribute("avgSleep", "6.3");      // Dummy data
        model.addAttribute("avgNap", "0.68");       // Dummy data
        model.addAttribute("bikeGoal", "72");       // Dummy data
        model.addAttribute("bikeActual", "62");     // Dummy data

        // Return the doctor page with all the data filled in
        return "doctor";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String ChangeTreatment(@RequestParam String patientId, @RequestParam String newTreatment, Model model)
    {
        Patient p = Patient.GetPatient(Integer.parseInt(patientId));
        p.treatment = newTreatment;
        model.addAttribute("name", p.name);
        model.addAttribute("id", p.id);
        model.addAttribute("treatment", p.treatment);
        model.addAttribute("activityLevel", 80);    // Dummy data
        model.addAttribute("avgBed", "22:57");      // Dummy data
        model.addAttribute("avgWake", "5:21");      // Dummy data
        model.addAttribute("avgSleep", "6.3 hrs");  // Dummy data
        model.addAttribute("avgNap", "0.68 hrs");   // Dummy data
        model.addAttribute("bikeGoal", "72");       // Dummy data
        model.addAttribute("bikeActual", "62");     // Dummy data

        return "doctor";
    }
}
