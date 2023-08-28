package com.odukabdulbasit.displayingsnackbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.snackbar.Snackbar


class SnackbarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_snackbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val message = "This is a Snackbar message"
            val duration = Snackbar.LENGTH_LONG

            val snackbar = Snackbar.make(view, message, duration)
            snackbar.setAction("Dismiss") {
                // Optional: Define action to be taken when the user clicks on the action button
            }

            snackbar.show()
        }
    }

}