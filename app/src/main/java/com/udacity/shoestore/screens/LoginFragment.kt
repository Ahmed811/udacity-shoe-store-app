package com.udacity.shoestore.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
        binding.apply {
            loginButton.setOnClickListener { loginSuccess() }
            registerButton.setOnClickListener {loginSuccess()  }
        }
        // Inflate the layout for this fragment
        return binding.root
    }

fun loginSuccess(){
    val userEmail=binding.emailInput.text.toString()
    val userPassword=binding.passwordInput.text.toString()
    if (userEmail.isNotEmpty()&&!userEmail.isNullOrBlank()&&userPassword.isNotEmpty()&&!userPassword.isNullOrBlank()){
        findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment())
    }else{
        Toast.makeText(context,"Please fill all fields!",Toast.LENGTH_LONG).show()
    }

}
}