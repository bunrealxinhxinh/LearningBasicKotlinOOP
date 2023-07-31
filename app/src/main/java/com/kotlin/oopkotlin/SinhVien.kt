package com.kotlin.oopkotlin

class SinhVien(hoten:String, diachi:String, namsinh:Int) {
    private var HoTen: String = ""
    private var DiaChi:String = ""
    private var NamSinh:Int = 0

    init {
        HoTen = hoten
        DiaChi = diachi
        NamSinh = namsinh
    }
//    constructor()
//    constructor(hoten:String, diachi:String, namsinh:Int){
//        HoTen = hoten
//        DiaChi = diachi
//        NamSinh = namsinh
//    }
    fun setHoTen(ht:String){
        HoTen = ht
    }
    fun getHoTen(): String{
        return HoTen
    }
    fun setDiaChi(dc:String){
        DiaChi = dc
    }
    fun getDiaChi(): String{
        return DiaChi
    }
    fun setNamSinh(ns: Int){
        if (ns > 2005){
            NamSinh = 2005
        }else{
            NamSinh = ns
        }
    }
    fun getNamSinh() :Int{
        return NamSinh
    }
    fun tinhTuoi() :Int{
        return 2023-NamSinh
    }
}