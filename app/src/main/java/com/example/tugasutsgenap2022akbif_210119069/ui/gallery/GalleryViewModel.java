package com.example.tugasutsgenap2022akbif_210119069.ui.gallery;
//Nama : Tri Novarel Rahmadhani
//Kelas : IF-2
//NIM : 10119069
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}