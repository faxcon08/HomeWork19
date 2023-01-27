package lesson_19;

public class CarDriver <T extends Car> extends Driver{

    public CarDriver(String fullName, int experience) {
        super(fullName,DriverLicence.CAR_LICENCE,experience);
    }
}
