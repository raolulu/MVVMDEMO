package com.iauto.testapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.iauto.testapp.R;
import com.iauto.testapp.base.view.MFragmentBase;
import com.iauto.testapp.databinding.FragmentFirstBinding;
import com.iauto.testapp.viewmodels.fragment.FirstFragmentVM;
import com.iauto.testapp.viewmodels.fragment.SecondFragmentVM;

public class FirstFragment extends MFragmentBase {

    private FirstFragmentVM mVM = null;
    private FragmentFirstBinding mBinding = null;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
        mVM = new ViewModelProvider(this).get(FirstFragmentVM.class);
        mBinding.setVm(mVM);
        mBinding.setLifecycleOwner(getActivity());
        return mBinding.getRoot();
    }

}