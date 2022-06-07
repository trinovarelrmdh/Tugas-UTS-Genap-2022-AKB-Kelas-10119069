package com.example.tugasutsgenap2022akbif_210119069.ui.slideshow;
//Nama : Tri Novarel Rahmadhani
//Kelas : IF-2
//NIM : 10119069
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}