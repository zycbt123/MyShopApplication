package fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.first.zyc.myshopapplication.R;

import butterknife.ButterKnife;


public class CartFragment extends BaseFragment {


    public CartFragment() {
        System.out.println("11");
        // Required empty public constructor
    }

    @Override
    public void initView() {

    }

    @Override
    public void initEvent() {

    }

    @Override
    public void initData() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cart, null);

        return v;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
