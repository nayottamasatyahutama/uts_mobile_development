package com.nayottama.catatanpenjualansederhana.activity.report.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment

import com.nayottama.catatanpenjualansederhana.R
import com.nayottama.catatanpenjualansederhana.model.Keranjang

class DetailReportFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.window?.requestFeature(Window.FEATURE_NO_TITLE)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_report, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val data = arguments?.getSerializable("penjualan")

        if (data != null) {
            val penjualan = data as Keranjang

//            ReportPresenter()
//                .getPenjualan(Integer.parseInt(penjualan.idUser),Integer.parseInt(penjualan.idKeranjang), object: ReportPresenter.OnResult{
//                    override fun onFailed(msg: String?) {
//
//                    }
//                    override fun onResult(resultItemKeranjang: ResultKeranjang) {
//                        view?.list?.adapter = ReportAdapter(resultItemKeranjang)
//                        view?.tvStatus?.text = resultItemKeranjang.keranjang?.status
//                        view?.tvQty?.text = resultItemKeranjang.keranjang?.qty.toString()
//                        view?.tvGrandTotal?.text = resultItemKeranjang.keranjang?.totalHarga?.let {
//                            Uang.indonesia(it)
//                        }
//                    }
//
//                })
        }
    }
}
