package com.kotlin.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sv1:SinhVien= SinhVien("A","A1",2007)    //khai bao bien va khoi tao
//        sv1.HoTen = "A"
//        sv1.DiaChi = "A1"
//        sv1.NamSinh = 2003 //phai lon hon 18 tuoi
//        sv1.setHoTen("A")
//        sv1.setDiaChi("A1")
//        sv1.setNamSinh(2006)
        Log.d("AAA", sv1.getHoTen()+sv1.getDiaChi()+sv1.getNamSinh()+"    "+sv1.tinhTuoi())
        val phuongTien:PhuongTien=PhuongTien("A","B",2)
        Log.d("AAA", "Phuong tien: ${phuongTien.ten}")
    }
}