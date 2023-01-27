import lesson_19.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Integer ab;

    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Car("LADA", "XRAY", 2, BodyType.SEDAN);
        transports[1] = new Truck("MAN", "TGS", 5, LoadCapacity.N1);
        transports[2] = new Bus("JAC", "HK6118G", 4, BusCapacity.SMALL);

        for (Transport ts : transports) {
            ts.passDiagnostic();
        }

    }// main
}// Main