package com.nayottama.catatanpenjualansederhana.activity.report.presenter

import com.nayottama.catatanpenjualansederhana.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}