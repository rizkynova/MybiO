package com.rizkynova.mybio.ClassUtama;
/*
Nama  : Rizky Novayandi
Kelas : IF4
NIM   : 10117140
Waktu Pengerjaan Walkthroug / Onboarding Screen : 3 Mei 2020 15:24 WIB
*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rizkynova.mybio.ClassPendukung.SliderAdapter;
import com.rizkynova.mybio.R;

public class MainActivity extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter sliderAdapter;
    private Button mNextBtn;
    private Button mBackBtn;
    private Button mGetStarted;
    private int mCurrentPage;
    private TextView[] mDots;
    private Animation animation;

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        mSlideViewPager = findViewById(R.id.slideViewPager);
        mDotLayout = findViewById(R.id.dotsLayout);
        mNextBtn = findViewById(R.id.nextBtn);
        mBackBtn = findViewById(R.id.prevBtn);
        mGetStarted = findViewById(R.id.getStarted);
        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage + 1);
                }

        });
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });

    }
    public void addDotsIndicator(int a){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();
        for(int i=0;i<mDots.length;i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentoren));

            mDotLayout.addView(mDots[i]);


        }
        if (mDots.length > 0){
            mDots[a].setTextColor(getResources().getColor(R.color.oren));
        }
    }
   ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
       @Override
       public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

       }

       @Override
       public void onPageSelected(int position) {
           addDotsIndicator(position);
           mCurrentPage=position;
           if (position==0){
               mNextBtn.setEnabled(true);
               mBackBtn.setEnabled(false);
               mGetStarted.setEnabled(false);
               mBackBtn.setVisibility(View.INVISIBLE);
               mNextBtn.setVisibility(View.VISIBLE);
               mGetStarted.setVisibility(View.INVISIBLE);
               mNextBtn.setText("Next");
               mBackBtn.setText("");
           }else if(position==mDots.length - 1){
               animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_anim);
               mGetStarted.setAnimation(animation);
               mNextBtn.setEnabled(false);
               mBackBtn.setEnabled(true);
               mGetStarted.setEnabled(true);
               mNextBtn.setVisibility(View.INVISIBLE);
               mBackBtn.setVisibility(View.VISIBLE);
               mGetStarted.setVisibility(View.VISIBLE);
               mNextBtn.setText("Finish");
               mGetStarted.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent homeIntent = new Intent(MainActivity.this, Home.class);
                       startActivity(homeIntent);
                       finish();
                   }

               });
               mBackBtn.setText("Back");
           }else{
               mNextBtn.setEnabled(true);
               mBackBtn.setEnabled(true);
               mGetStarted.setEnabled(false);
               mBackBtn.setVisibility(View.VISIBLE);
               mGetStarted.setVisibility(View.INVISIBLE);
               mNextBtn.setVisibility(View.VISIBLE);
               mNextBtn.setText("Next");
               mBackBtn.setText("Back");
           }

       }

       @Override
       public void onPageScrollStateChanged(int state) {

       }

   };

}
