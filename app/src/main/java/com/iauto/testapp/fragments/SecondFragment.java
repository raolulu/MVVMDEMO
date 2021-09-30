package com.iauto.testapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MFragmentBase;
import com.iauto.testapp.databinding.FragmentSecondBinding;
import com.iauto.testapp.viewmodels.fragment.SecondFragmentVM;

public class SecondFragment extends MFragmentBase {

    private SecondFragmentVM mVM = null;
    private FragmentSecondBinding mBinding = null;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
        mVM = new ViewModelProvider(this).get(SecondFragmentVM.class);
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(getActivity());
        return mBinding.getRoot();
    }
}