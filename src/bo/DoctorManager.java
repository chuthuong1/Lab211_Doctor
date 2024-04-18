/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Doctor;
import java.util.ArrayList;

/**
 *
 * @author Thuong
 */
public class DoctorManager {

    ArrayList<Doctor> listdoctor;

    public DoctorManager() {
        listdoctor = new ArrayList<>();
    }

    public boolean addDoctor(Doctor d) {
        return listdoctor.add(d);
    }

    public ArrayList<Doctor> getListDoctor(String name) {
        ArrayList<Doctor> listSearch = new ArrayList<>();
        for (Doctor doctor : listSearch) {
            if (doctor.getName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(doctor);
            }
        }
        return listSearch;
    }

    private int findIdDoctor(String code) {
        for (int i = 0; i < listdoctor.size(); i++) {
            if (listdoctor.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor deleteDoctorById(String code) {
        int index = findIdDoctor(code);
        if (index != -1) {
            return listdoctor.remove(index);
        }
        return null;
    }

    public Doctor UpdateDoctorById(Doctor d) {
        int index = findIdDoctor(d.getCode());
        if (index != -1) {
            return listdoctor.set(index, d);
        }
        return null;
    }

    public ArrayList<Doctor> searchDoctorByName(String name) {
        ArrayList<Doctor> listSearch = new ArrayList<>();
        for (Doctor doctor : listSearch) {
            if (doctor.getName().toLowerCase().contains(name.toLowerCase())) {
                listSearch.add(doctor);
            }
        }
        return  listSearch;
    }

}
