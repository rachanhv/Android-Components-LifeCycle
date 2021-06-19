import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kumbri.android_components_lifecycle.R

class FragmentOne : Fragment(){

    val TAG = "Lifecycle : "

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "FragmentOne "+"onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "FragmentOne "+"onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(TAG, "FragmentOne "+"onCreateView")
        return inflater!!.inflate(R.layout.fragment_one, container,false);
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "FragmentOne "+"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "FragmentOne "+"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "FragmentOne "+"onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "FragmentOne "+"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "FragmentOne "+"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "FragmentOne "+"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "FragmentOne "+"onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "FragmentOne "+"onDetach")
    }
}