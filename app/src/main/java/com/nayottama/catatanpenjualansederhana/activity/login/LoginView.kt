package com.nayottama.catatanpenjualansederhana.activity.login

import com.nayottama.catatanpenjualansederhana.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}