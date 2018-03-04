package REST;

import java.util.ArrayList;

public class Patient
{
    int id;
    String treatment;
    int timestamp;
    static ArrayList<Patient> patients = new ArrayList<>();

    public static Patient GetPatient(int id)
    {
        // If not updated since last check, return cached Patient
        // TODO: read file based on patient ID number an get the timestamp
        int ts = 12345;
        for (Patient p : patients)
        {
            if (p.id == id)
            {
                if (p.timestamp == ts)
                {
                    return p;
                }
                p.UpdateCachedPatient("", ts);
                return p;
            }
        }

        // TODO: create new patient based on file parameters
        Patient patient = new Patient(id, "Needs 30 minutes of exercise per day.", 0);
        patients.add(patient);
        return patient;
    }

    private void UpdateCachedPatient(String treatment, int timestamp)
    {
        this.treatment = treatment;
        this.timestamp = timestamp;
    }

    public Patient(int id, String treatment, int timestamp)
    {
        this.id = id;
        this.treatment = treatment;
        this.timestamp = timestamp;
    }
}
