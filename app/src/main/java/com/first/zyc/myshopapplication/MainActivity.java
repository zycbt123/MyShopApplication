package com.first.zyc.myshopapplication;




import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import fragment.BaseFragment;
import fragment.CartFragment;
import fragment.MainFragment;
import fragment.PersonFragment;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg_tab;
    private CartFragment cartFragment;
    private MainFragment mainFragment;
    private PersonFragment personFragment;
    private Fragment newFragment;
    private Fragment oldFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void initview(){
        rg_tab = ((RadioGroup) findViewById(R.id.rg_tab));

    }



    private void initdata(){
        rg_tab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                    switch (checkedId){
                        case R.id.rb_rb1:
                            if (mainFragment==null){
                              mainFragment=new MainFragment();

                            }
                            newFragment=mainFragment;
                            switchfragment(newFragment);

                            break;
                        case  R.id.rb_rb2:

                            if (cartFragment==null){
                                cartFragment=new CartFragment();

                            }
                            newFragment=cartFragment;
                            switchfragment(newFragment);
                            break;

                        case  R.id.rb_rb3:
                            if (personFragment==null){
                                personFragment=new PersonFragment();

                            }
                            newFragment=personFragment;
                            switchfragment(newFragment);
                            break;




                            }
            }
        });

    }

    private void switchfragment(Fragment fragment) {
        if(fragment == null){
            fragment= mainFragment  = new MainFragment();
        }


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        //http://www.cnblogs.com/hixin/p/4427276.html
        if(oldFragment!=null && !oldFragment.isHidden() && oldFragment.isAdded()){

            ft.hide(oldFragment);
        }
        if(fragment!=null && fragment.isAdded() && fragment.isHidden()){
            ft.show(fragment);
        }else {
            //fragment1
            Bundle bundle = new Bundle();
            bundle.putString("str","jack");
            fragment.setArguments(bundle);
            ft.add(R.id.fl_content,fragment);
            ft.addToBackStack(null);
        }

        oldFragment = fragment;

        ft.commit();

    }


}
