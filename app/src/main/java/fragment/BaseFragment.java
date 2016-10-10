package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by zyc on 2016/10/9.
 */

public abstract class BaseFragment extends Fragment {
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
        initEvent();

    }
    public abstract void initView();
    public abstract void initEvent();
    public abstract void initData();
}
