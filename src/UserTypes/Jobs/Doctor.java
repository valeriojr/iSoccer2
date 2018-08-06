package UserTypes.Jobs;

import UserInformation.Model.*;
import UserTypes.Employee;

public class Doctor extends Employee {
    private DoctorData doctorData;

    public Doctor(Employee e, DoctorData doctorData) {
        super(e.getPersonalData(), e.getAddress(), e.getContact(), e.getProfessionalData());
        this.doctorData = doctorData;
    }

    @Override
    public String toString() {
        return super.toString() + doctorData.toString();
    }
}
