package com.nayottama.catatanpenjualansederhana.activity.data_barang.presenter

import com.nayottama.catatanpenjualansederhana.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}