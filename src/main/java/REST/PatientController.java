package REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient")
public class PatientController
{
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity LoadPage(@RequestParam String patientId)
    {
        Patient p = Patient.GetPatient(Integer.parseInt(patientId));

        // TODO: Use p to fill in data in patient.html (since we can't use Javascript in IntelliJ without paying wtf)


        return ResponseEntity.status(HttpStatus.OK).body(p.treatment);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void ChangeTreatment(int id, String newTreatment)
    {
        Patient.GetPatient(id).treatment = newTreatment;
    }
}
