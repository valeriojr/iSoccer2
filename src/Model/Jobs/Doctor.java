package Model.Jobs;

import Model.Employee;

public class Doctor extends Employee {
    private Model.Data.Doctor doctorData;

    public Doctor(Employee e, Model.Data.Doctor doctorData) {
        super(e.getPersonalData(), e.getAddress(), e.getContact(), e.getProfessionalData());
        this.doctorData = doctorData;
    }

    @Override
    public String toString() {
        return super.toString() + doctorData.toString();
    }
}
