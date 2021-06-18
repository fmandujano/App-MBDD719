package com.sae.taller.app2021_1

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main_menu.*
import kotlinx.android.synthetic.main.fragment_main_menu.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainMenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val vista : View

        vista = inflater.inflate(R.layout.fragment_main_menu, container, false)

        vista.buttonAboutus.setOnClickListener {
            Log.d("Appify", "click en boton de aboutus")
            findNavController().navigate( R.id.action_mainMenuFragment_to_aboutUsFragment)
        }

        vista.buttonContact.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_contactFragment)
        }

        vista.buttonAwards.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_awardsFragment)
        }
        vista.buttonPortfolio.setOnClickListener {
            //findNavController().navigate(R.id.action_mainMenuFragment_to_placeholder)
        }
        vista.buttonClients.setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_webFragment)
        }

        return vista
    }

}