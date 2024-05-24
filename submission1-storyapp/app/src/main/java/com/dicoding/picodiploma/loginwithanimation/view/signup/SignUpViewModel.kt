package com.dicoding.picodiploma.loginwithanimation.view.signup

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.loginwithanimation.data.UserRepository

class SignUpViewModel (private val repository: UserRepository): ViewModel(){
    fun register(name:String, email: String, password: String) = repository.sign
}