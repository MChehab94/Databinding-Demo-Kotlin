package mchehab.com.databindingdemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import mchehab.com.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R
                .layout.activity_main)
        binding.person = Person("Mohamad", "Chehab", "https://www.w3schools" +
                ".com/w3css/img_lights.jpg", 23);
    }
}