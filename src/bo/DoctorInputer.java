/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import utils.ValidationAndNormalizingTextUtils;
import entity.Doctor;

/**
 *
 * @author Thuong
 */
public class DoctorInputer {

    private Doctor doctor;

    public DoctorInputer() {
        doctor = new Doctor();
    }

    public Doctor getDocdor() {
        inputInfoDoctor();
        return doctor;
    }

    private void inputInfoDoctor() {
        doctor.setCode(ValidationAndNormalizingTextUtils.getStringByRegex("Input code ", "please input charactor", "[A-Za-z]+"));
        doctor.setName(ValidationAndNormalizingTextUtils.getStringByRegex("Input name ", "please input charactor", "[A-Za-z]+"));
        doctor.setSpecialization(ValidationAndNormalizingTextUtils.getStringByRegex("Input specia.. ", "please input charactor", "[A-Za-z]+"));
        doctor.setAvailability(ValidationAndNormalizingTextUtils.getInt("input availability", "input number only", "out off ranger", 0, Integer.MAX_VALUE));

    }

}
