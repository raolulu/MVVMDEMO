package com.iauto.testapp.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MActivityBase;
import com.iauto.testapp.databinding.ActivityTest2Binding;
import com.iauto.testapp.viewmodels.acitivity.TestActivity2VM;

public class TestActivity2 extends MActivityBase {

    private TestActivity2VM mVM = null;
    private ActivityTest2Binding mBinding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_test2);
        mVM = new ViewModelProvider(this).get(TestActivity2VM.class);
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(this);
    }

    // 画面的button动作
    public void onClickButtonActivity(View v) {
        // 调用vm的接口去设置funmode的数据
        // mVM.xxxxx
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), TestActivity1.class);
        startActivity(intent);
    }
}
