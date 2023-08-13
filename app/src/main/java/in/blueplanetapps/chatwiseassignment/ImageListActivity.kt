package `in`.blueplanetapps.chatwiseassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ImageListActivity : AppCompatActivity() {
    private lateinit var imageViewModel: ImageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_list)

        val recyclerView: RecyclerView = findViewById(R.id.image_recycler_view)

        imageViewModel = ViewModelProvider(this)[ImageViewModel::class.java]

        val imageAdapter = ImageAdapter(emptyList()) // Pass an empty list initially

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = imageAdapter

        imageViewModel.images.observe(this) { images ->
            // Update the UI with the list of images
            val adapter = ImageAdapter(images)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this)
        }

        imageViewModel.fetchImages()
    }
}
