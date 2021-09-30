package com.iauto.testapp.screens;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MActivityBase;
import com.iauto.testapp.databinding.ActivityTest1Binding;
import com.iauto.testapp.fragments.FirstFragment;
import com.iauto.testapp.fragments.SecondFragment;
import com.iauto.testapp.viewmodels.acitivity.TestActivity1VM;

public class TestActivity1 extends MActivityBase {
    private TestActivity1VM mVM = null;
    private ActivityTest1Binding mBinding = null;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_test1);
        mVM = new ViewModelProvider(this).get(TestActivity1VM.class);
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(this);
    }

    private void changeFragment(int type) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (type == 1) {
            if (null == firstFragment) {
                firstFragment = new FirstFragment();
                transaction.add(R.id.firstframent, firstFragment);
            }
            if (null != secondFragment) {
                transaction.hide(secondFragment);
            }
            transaction.show(firstFragment);
        }
        else {
            if (null == secondFragment) {
                secondFragment = new SecondFragment();
                transaction.add(R.id.secondframent, secondFragment);
            }
            if (null != firstFragment) {
                transaction.hide(firstFragment);
            }
            transaction.show(secondFragment);
        }
        transaction.commit();
    }

    public void onClickButton1(View v) {
//        String btn = (String)v.getTag();
        changeFragment(1);
    }

    public void onClickButton2(View v) {
//        String btn = (String)v.getTag();
        changeFragment(2);
    }

    // 画面的button动作
    public void onClickButtonActivity(View v) {
        // 调用vm的接口去设置funmode的数据
        // mVM.xxxxx
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), TestActivity2.class);
        startActivity(intent);
    }
}