package Model.Jobs;

import Model.Data.DoctorData;
import Model.Employee;

public class Doctor extends Employee {
    private DoctorData doctorDataData;

    public Doctor(Employee e, DoctorData doctorDataData) {
        super(e.getPersonalData(), e.getAddress(), e.getContact(), e.getProfessionalData());
        this.doctorDataData = doctorDataData;
    }

    @Override
    public String toString() {
        return super.toString() + doctorDataData.toString();
    }
}
