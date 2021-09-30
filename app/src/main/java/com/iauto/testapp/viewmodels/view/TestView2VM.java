package com.iauto.testapp.viewmodels.view;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import com.iauto.testapp.base.viewmodel.MViewModelBase;

import android.os.Handler;
import android.os.Looper;

public class TestView2VM extends MViewModelBase {
    public TestView2VM(Application application) {
        super(application);
        initLiveData();
    }

    int mValue = 1;
    Handler mHandler;
    void initLiveData() {
        mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mValue++;
                setTestView1String(String.valueOf(mValue));
                mHandler.postDelayed(this, 2000);
            }
        }, 2000);
    }

    // mvvm绑定的数据格式
    MutableLiveData<String> mTextView1String =  new MutableLiveData<>();
    public MutableLiveData<String> getTextView1String() {
        return mTextView1String;
    }

    // funmode调用接口设置绑定的数据
    public void setTestView1String(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mTextView1String.setValue(str);
        }
        else {
            mTextView1String.postValue(str);
        }
    }

}
