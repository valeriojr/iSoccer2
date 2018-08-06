package UserTypes.Jobs;

import UserInformation.Model.*;
import UserTypes.Employee;

public class Driver extends Employee {
    private DriverData driverData;

    public Driver(Employee e, DriverData driverData) {
        super(e.getPersonalData(), e.getAddress(), e.getContact(), e.getProfessionalData());
        this.driverData = driverData;
    }

    @Override
    public String toString() {
        return super.toString() + driverData.toString();
    }
}
