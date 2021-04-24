package com.nayottama.catatanpenjualansederhana.activity.data_barang._add

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.nayottama.catatanpenjualansederhana.R
import com.nayottama.catatanpenjualansederhana.activity.data_barang.presenter.DataBarangView
import com.nayottama.catatanpenjualansederhana.base.BaseActivity
import com.nayottama.catatanpenjualansederhana.model.Barang
import kotlinx.android.synthetic.main.activity_add_barang.*
import java.io.Serializable

class AddBarangActivity : BaseActivity(), DataBarangView {

    override fun onCreate(savedInstanceState: Bundle?) {
        cekSesi(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_barang)

        val intent = intent.getSerializableExtra(TAGS.BARANG)

        if (intent != null) {
            setActionEditButton(intent)
        } else {
            setActionTambahButton()
        }
    }

    // edit barang
    private fun setActionEditButton(serializable: Serializable) {
        btAddBarang.text = "Simpan"
        val barang = serializable as Barang
        etAddBarangBarcode.setText(barang.barcode)
        etAddBarangNamaBarang.setText(barang.namaBarang)
        etAddBarangKategori.setText(barang.kategori)
        etAddBarangHargaBeli.setText(barang.hargaBeli.toString())
        etAddBarangHargaJual.setText(barang.hargaJual.toString())

        btAddBarang.setOnClickListener {
            val barcode = etAddBarangBarcode.text.toString()
            val nama_barang = etAddBarangNamaBarang.text.toString()
            val kategori = etAddBarangKategori.text.toString()
            val harga_beli_s = etAddBarangHargaBeli.text.toString()
            val harga_jual_s = etAddBarangHargaJual.text.toString()

            if (harga_beli_s.isNotBlank() && harga_jual_s.isNotBlank()) {
                val harga_beli = harga_beli_s.toDouble()
                val harga_jual = harga_jual_s.toDouble()

                // buat objek barang
                barang.idUser = user?.idUser.toString()
                barang.barcode = barcode
                barang.namaBarang = nama_barang.toUpperCase()
                barang.kategori = kategori.toLowerCase().capitalize()
                barang.hargaBeli = harga_beli
                barang.hargaJual = harga_jual

                // simpan ke database
//                DataBarangPresenter(this@AddBarangActivity).updateBarang(barang)
            } else {
                // jangan input
                Snackbar.make(it, "Harga tidak boleh kosong", Snackbar.LENGTH_SHORT)
            }
        }
    }
    // tambah barang
    private fun setActionTambahButton() {
        btAddBarang.setOnClickListener {
            btAddBarang.text = "Tambah"
            val barcode = etAddBarangBarcode.text.toString()
            val nama_barang = etAddBarangNamaBarang.text.toString()
            val kategori = etAddBarangKategori.text.toString()
            val harga_beli_s = etAddBarangHargaBeli.text.toString()
            val harga_jual_s = etAddBarangHargaJual.text.toString()

            if (harga_beli_s.isNotBlank() && harga_jual_s.isNotBlank()) {
                val harga_beli = harga_beli_s.toDouble()
                val harga_jual = harga_jual_s.toDouble()

                // buat objek barang
                val barang = Barang()
                barang.idUser = user?.idUser.toString()
                barang.barcode = barcode
                barang.namaBarang = nama_barang.toUpperCase()
                barang.kategori = kategori.toLowerCase().capitalize()
                barang.hargaBeli = harga_beli
                barang.hargaJual = harga_jual

                // simpan ke database
//                DataBarangPresenter(this@AddBarangActivity).addBarang(barang)
            } else {
                // jangan input
                Snackbar.make(it, "Harga tidak boleh kosong", Snackbar.LENGTH_SHORT)
            }
        }
    }

    override fun onSuccessDataBarang(data: List<Barang?>?) {
        TODO("Not yet implemented")
    }

    override fun onErrorDataBarang(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun onSuccessDeleteBarang(msg: String?) {
        TODO("Not yet implemented")
    }

    override fun onErrorDeleteBarang(msg: String?) {
        TODO("Not yet implemented")
    }

    /**
     * Result baik edit ataupun hapus sama saja
     */
//
//   override fun onSuccessAddBarang(msg: String?) {
//        toast(msg ?: "").show()
//        finish()
//    }
//
//    override fun onErrorAddBarang(msg: String?) {
//        toast(msg ?: "").show()
//    }

}
