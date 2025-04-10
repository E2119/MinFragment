package edu.msudenver.cs3013.minfragment
//Ermiyas Hailu
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun startFragment(view: View) {
        val blueFragment = BlueFragment.newInstance("FIRST")

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, blueFragment)
            .addToBackStack(null)
            .commit()
    }
}
