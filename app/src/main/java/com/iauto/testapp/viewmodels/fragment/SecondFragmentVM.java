package com.iauto.testapp.viewmodels.fragment;

import android.app.Application;
import android.os.Handler;

import androidx.lifecycle.MutableLiveData;

import com.iauto.testapp.base.viewmodel.MViewModelBase;

public class SecondFragmentVM extends MViewModelBase {
    public SecondFragmentVM(Application application) {
        super(application);
        initLiveData();
    }

    int mValue = 1;
    Handler mHandler;

    public void initLiveData() {
        mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mValue++;
                mTextView1String.postValue(String.valueOf(mValue));
                mHandler.postDelayed(this, 2000);
            }
        }, 2000);

    }

    MutableLiveData<String> mTextView1String = new MutableLiveData<>();

    public MutableLiveData<String> getTextView1String() {
        return mTextView1String;
    }
}