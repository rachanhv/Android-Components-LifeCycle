import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kumbri.android_components_lifecycle.R

class FragmentTwo : Fragment() {

    val TAG = "Lifecycle : "

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "FragmentTwo " + "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "FragmentTwo " + "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "FragmentTwo " + "onCreateView")
        return inflater!!.inflate(R.layout.fragment_two, container, false);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "FragmentTwo " + "onActivityCreated")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "FragmentTwo " + "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "FragmentTwo " + "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "FragmentTwo " + "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "FragmentTwo " + "onDetach")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "FragmentTwo " + "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "FragmentTwo " + "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "FragmentTwo " + "onPause")
    }


}