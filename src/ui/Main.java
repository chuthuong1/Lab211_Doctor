/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import DoctorController.DoctorController;
import entity.Doctor;
import java.util.ArrayList;
import utils.ValidationAndNormalizingTextUtils;

/**
 *
 * @author Thuong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoctorController doctorController = new DoctorController();
        while (true) {
            System.out.println("===  Menu==");
            System.out.println("1. Add Doctor: ");
            System.out.println("2. Update Doctor: ");
            System.out.println("3. Delete Doctor: ");
            System.out.println("4. Search Doctor: ");
            System.out.println("5. exit ");

            int choice = ValidationAndNormalizingTextUtils.getInt("Input choice ", "Enter number", "1-5", 1, 5);
            switch (choice) {
                case 1:
                    try {
                        Doctor d = doctorController.addDoctorr();
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        System.out.println(d);
                        System.out.println("add sucessfully");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        Doctor update = doctorController.updateDoctor();
                        System.out.println(update);
                        System.out.println("Update successfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        Doctor delete = doctorController.deleteDoctorById();
                        System.out.println(delete);
                        System.out.println("Delete succesfully");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        ArrayList<Doctor> listDoctor = doctorController.searchDoctor();
                        System.out.println(Doctor.STRINNG_DOCTOR);
                        for (Doctor doctor : listDoctor) {
                            System.out.println(doctor);
                        }
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        }
    }

}
