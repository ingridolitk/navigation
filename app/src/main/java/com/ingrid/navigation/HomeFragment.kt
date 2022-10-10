package com.ingrid.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

        clickedButtonListPhone()

    }

    fun clickedButtonListPhone(){
        //val buttonPhoneList:Button = findViewById(R.id.buttonListPhone)

        findNavController().navigate(R.id.action_HomeApp_to_listPhone2)
    }
}