package de.flapdoodle.fightcorona

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.google.zxing.integration.android.IntentIntegrator

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ScanCodeStartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_code_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            if (false) findNavController().navigate(R.id.action_First2Fragment_to_Second2Fragment)

            IntentIntegrator.forSupportFragment(this).apply {
                    setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES);
                    setPrompt("Scan a barcode");
                    setCameraId(-1);  // Use a specific camera of the device
                    setBeepEnabled(true);
                    setBarcodeImageEnabled(true);
                }
                .initiateScan()
        }
    }
}
