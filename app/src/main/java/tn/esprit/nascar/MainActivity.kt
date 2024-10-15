package tn.esprit.nascar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import tn.esprit.nascar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO 11 Bind the toolbar to the activity
        setSupportActionBar(binding.root.findViewById(R.id.toolbar))






        //TODO 1 Implement the click on the 3 buttons (btnNews|btnEvents|btnProfile) to call changeFragment(...)

        binding.btnNews.setOnClickListener {
            changeFragment(NewsFragment(), "")
        }
        binding.btnEvents.setOnClickListener {
            changeFragment(EventsFragment(), "")
        }
        binding.btnProfile.setOnClickListener {
            changeFragment(ProfileFragment(), "")
        }
        //TODO 2 Implement the first call of the first fragment

        changeFragment(NewsFragment(), "")

    }

    private fun changeFragment(fragment: Fragment, tag: String) {

        //TODO 3 Check if tag is empty then replace the new fragment in the activity.
        //    If tag is not empty replace the new fragment in the activity and use addToBackStack

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        if (tag.isNotEmpty()) {
            transaction.addToBackStack(tag)
        }
        transaction.commit()

    }

    //TODO 12 Override the method onCreateOptionsMenu()

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    //TODO 13 Override the method onOptionsItemSelected() and Implement info and logout behavior
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.infoItem -> {
                changeFragment(AboutFragment(), "AboutFragment")
                true
            }
            R.id.logoutItem -> {
                MaterialAlertDialogBuilder(this)
                    .setTitle("Logout")
                    .setMessage("Are you sure you want to logout and close the app?")
                    .setPositiveButton("OK") { _, _ ->
                        finish()
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


}