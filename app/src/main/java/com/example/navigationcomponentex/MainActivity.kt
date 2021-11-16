package com.example.navigationcomponentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.example.navigationcomponentex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        //To be on the safer side, (within an Activity) avoid using findNavController(Int)
        // to initialize a NavController instead initialize it from NavHostFragment as shown
        //val navController = this.findNavController(R.id.navhost)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navhost) as NavHostFragment

        drawerLayout = binding.drawerLayout
        NavigationUI.setupWithNavController(binding.navView, navHostFragment.navController)
        //to displau the hamburger menu icon for nav drawer
        NavigationUI.setupActionBarWithNavController(this,navHostFragment.navController, drawerLayout)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val navController = findNavController(R.id.navhost)
        return item.onNavDestinationSelected(navController) ||
                super.onOptionsItemSelected(item)

    }

//
//    Edit the onSupportNavigateUp() method to return NavigationUI.navigateUp instead of returning navController.navigateUp. Pass the navigation controller and the drawer layout to navigateUp(). The method will look like as follows:

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navhost)
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}
