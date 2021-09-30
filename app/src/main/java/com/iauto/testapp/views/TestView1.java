package com.iauto.testapp.views;

import android.app.Application;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;


import androidx.databinding.DataBindingUtil;
import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MViewBase;
import com.iauto.testapp.databinding.ViewTest1Binding;
import com.iauto.testapp.viewmodels.view.TestView1VM;

public class TestView1 extends MViewBase {
    private TestView1VM mVM = null;
    private ViewTest1Binding mBinding = null;
    public TestView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_test1, this, true);
        mVM = new TestView1VM((Application)context.getApplicationContext());
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(this);
    }
}
