package com.iauto.testapp.viewmodels.fragment;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

import androidx.lifecycle.MutableLiveData;

import com.iauto.testapp.base.viewmodel.MViewModelBase;


public class FirstFragmentVM extends MViewModelBase {
    public FirstFragmentVM(Application application) {
        super(application);
        mTextView1String.setValue("FitstFragment = 0");
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
                setTestView1String( "FitstFragment = " + String.valueOf(mValue));
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