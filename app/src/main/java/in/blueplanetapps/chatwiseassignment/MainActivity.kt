package `in`.blueplanetapps.chatwiseassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewImagesButton: Button = findViewById(R.id.view_images_button)
        viewImagesButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ImageListActivity::class.java)
            startActivity(intent)
        }
    }
}
