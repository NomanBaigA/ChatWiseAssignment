package `in`.blueplanetapps.chatwiseassignment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ImageViewModel(private val repository: ImageRepository = ImageRepository()) : ViewModel() {

    private val _images = MutableLiveData<List<Image>>()
    val images: LiveData<List<Image>> = _images


    fun fetchImages() {
        viewModelScope.launch {
            try {
                val result = repository.getImages()
                _images.value = result
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}
