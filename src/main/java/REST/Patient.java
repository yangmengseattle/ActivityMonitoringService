package REST;

import java.util.ArrayList;

// Patient: Encapsulate the data of the patient. For now most of the data is hard-coded
//  at the controller level because we could not connect this with an analytics service
//  in the time given to implement this project.
public class Patient
{
    int id;             // Patient ID number in system
    String name;        // Patient name
    String treatment;   // Doctor assigned treatment for the patient

    // Cache of patients
    static ArrayList<Patient> patients = new ArrayList<>();

    // GetPatient:
    //  This is a static method that retrieve a Patient object from the cache or
    //  database based on the given ID number.
    public static Patient GetPatient(int id)
    {
        // TODO: read file based on patient ID number
        for (Patient p : patients)
        {
            // Check if patient is in the cache
            if (p.id == id)
            {
                return p;
            }
        }

        // TODO: create new patient based on file parameters
        // Just create a sample name and treatment for now, and add to cache
        Patient patient = new Patient(id, "Hubert Cumberdale", "Needs moderate exercise and to reduce alcoholic beverage consumption.");
        patients.add(patient);
        return patient;
    }

    // Constructor
    public Patient(int id, String name, String treatment)
    {
        this.id = id;
        this.name = name;
        this.treatment = treatment;
    }
}
