package com.iauto.testapp.views;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import androidx.databinding.DataBindingUtil;

import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MViewBase;
import com.iauto.testapp.databinding.ViewTest2Binding;
import com.iauto.testapp.viewmodels.view.TestView2VM;

public class TestView2 extends MViewBase {


    private TestView2VM mVM = null;
    private ViewTest2Binding mBinding = null;
    public TestView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        mBinding =  DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_test2, this, true);
        mVM = new TestView2VM((Application)context.getApplicationContext());
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(this);
    }
}
