package com.example.navigationcomponentex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.add
import androidx.fragment.app.commit
import kotlinx.parcelize.Parcelize
import java.io.Serializable

class FragmentExActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_ex)

//        if (savedInstanceState == null) {
//            supportFragmentManager.commit {
//                setReorderingAllowed(true)
//                add<ExFragment>(R.id.fragment_container_view)
//            }
//        }
    }
}

@Parcelize
data class ProfileInfo(val username: String, val email: String): Parcelable