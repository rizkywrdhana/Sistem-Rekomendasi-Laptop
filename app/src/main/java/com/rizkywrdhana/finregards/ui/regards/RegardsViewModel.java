package com.rizkywrdhana.finregards.ui.regards;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RegardsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RegardsViewModel() {
        mText = new MutableLiveData<>();
//        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}