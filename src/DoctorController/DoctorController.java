/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorController;

import bo.DoctorInputer;
import bo.DoctorManager;
import entity.Doctor;
import java.util.ArrayList;
import utils.ValidationAndNormalizingTextUtils;

/**
 *
 * @author Thuong
 */
public class DoctorController {

    private DoctorInputer doctorInputer;
    private DoctorManager doctorManager;

    public DoctorController() {
        doctorManager = new DoctorManager();
    }

    public Doctor addDoctorr() {
        doctorInputer = new DoctorInputer();
        Doctor d = doctorInputer.getDocdor();
        doctorManager.addDoctor(d);
        return d;
    }

    public ArrayList<Doctor> searchDoctor() {
        String name = ValidationAndNormalizingTextUtils.getStringByRegex("Enter name search", "Erro format", "[A-Za-z]+");
        return doctorManager.searchDoctorByName(name);
    }

    public Doctor deleteDoctorById() {
        String code = ValidationAndNormalizingTextUtils.getStringByRegex("Enter code docter delete", "Erroformat", "[A-Za-z]+");
        return doctorManager.deleteDoctorById(code);

    }

    public Doctor updateDoctor() {
        doctorInputer = new DoctorInputer();
        Doctor d = doctorInputer.getDocdor();
        doctorManager.UpdateDoctorById(d);
        return d;
    }
}
