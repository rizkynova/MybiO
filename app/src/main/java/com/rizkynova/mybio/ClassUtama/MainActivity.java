package com.rizkynova.mybio.ClassUtama;
/*
Nama  : Rizky Novayandi
Kelas : IF4
NIM   : 10117140
Waktu Pengerjaan Walkthroug / Onboarding Screen : 3 Mei 2020 15:24 WIB
*/
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rizkynova.mybio.ClassPendukung.SliderAdapter;
import com.rizkynova.mybio.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter sliderAdapter;

    private TextView[] mDots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSlideViewPager = findViewById(R.id.slideViewPager);
        mDotLayout = findViewById(R.id.dotsLayout);

        sliderAdapter = new SliderAdapter(this);
        mSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);
        mSlideViewPager.addOnPageChangeListener(viewListener);
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
       }

       @Override
       public void onPageScrollStateChanged(int state) {

       }
   };
}
