package com.example.KTNC_Lan3.Service;

import com.example.KTNC_Lan3.Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();
    public void themSinhVien(SinhVien sinhVien){
        if(sinhVien == null || sinhVien.getMaSinhVien().isEmpty() || sinhVien.getTenSinhVien().isEmpty()){
            throw new IllegalArgumentException("Ma hoac ten khong hop le");
        }
    }
}
