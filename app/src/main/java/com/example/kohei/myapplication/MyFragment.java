package com.example.kohei.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Kohei on 2016/04/12.
 */
public class MyFragment extends Fragment {
    public MyFragment() {}

    public static Fragment onCreate(int hoge) {
        Fragment fragment = new MyFragment();
        Bundle args = new Bundle();
        args.putInt("hoge", hoge);
        fragment.setArguments(args);
        return fragment;
    }
}
