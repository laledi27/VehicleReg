package Cars.com;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Collection<car> cars = new ArrayList<car>(); 

        System.out.println("Good day welcome to the app");
        System.out.println("(1) Capture vehicle details\n" +
                "(2) View vehicle report\n" +
                "(3) Exit app");

        int menuOption = input.nextInt();

        while ((menuOption == 1) || (menuOption == 2)) {

            if (menuOption == 1) {
                car carObj = new car();
                int year;
                int millage;
                String make;
                String model;
                String plateNum ="";
                String vinNum;

                System.out.println("Enter make");
                make = input.next();

                System.out.println("Enter model");
                model = input.next();

                System.out.println("Enter vin");
                vinNum = input.next();
                while (!(vinNum.length() == 17)) {
                    System.out.println("Enter vin and make sure its 17 characters long");
                    vinNum = input.next();


                }
                System.out.println("Please enter (1) for old format licence plate number, and 2 for new format licence plate number");
                int plateChoice = input.nextInt();

                if (plateChoice == 1) {
                    System.out.println("Enter plate number e.g NK271122GP");
                    plateNum = input.next();
                } else if (plateChoice == 2) {
                    System.out.println("Enter plate number e.g NK27MNGP");
                    plateNum = input.next();
                }

                System.out.println("Enter millage");
                millage = input.nextInt();

                System.out.println("Enter year");
                year = input.nextInt();

                carObj.setMake(make);
                carObj.setModel(model);
                carObj.setPlateNumber(plateNum);
                carObj.setVin(vinNum);
                carObj.setYear(year);
                carObj.setMillage(millage);

                cars.add(carObj);


            } else if (menuOption == 2) {
                if (cars.isEmpty())
                    ;
                System.out.println("There are no cars captured");
            } else {
                ;
                System.out.println("******************************\n" +
                        "VEHICLE REPORT \n" +
                        "******************************");
                for (car carObj : cars) {
                    System.out.println("MAKE: " + carObj.getMake() +
                            "\n MODEL: " + carObj.getModel());
                }
            }
        }


        
     System.out.println("1) Capture vehicle details\n" +
             "(2) View vehicle report\n" +
             "(3) Exit app");
        menuOption = input.nextInt();

        System.out.println("Thank you for using the app");

    }

}

