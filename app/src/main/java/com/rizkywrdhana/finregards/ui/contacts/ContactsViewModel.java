package com.rizkywrdhana.finregards.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactsViewModel extends ViewModel {
    private String nameUrl;
    private String photoUrl;
    private MutableLiveData<String> mText;

    public ContactsViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public void setNameUrl(String name) { this.nameUrl = name; }

    public String getNameUrl() { return nameUrl; }

    public void setPhotoUrl(String photo) { this.photoUrl = photo; }

    public String getPhotoUrl() { return photoUrl; }
}