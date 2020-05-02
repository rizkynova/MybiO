package com.rizkynova.mybio;

/*
Nama  : Rizky Novayandi
Kelas : IF4
NIM   : 10117140
Waktu Pengerjaan ProgressBar : 2 Mei 2020 18:49 WIB
*/


import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;

public class ProgressBarAnimation extends Animation{
    private ProgressBar mProgressBar;
    private int mTo;
    private int mFrom;
    private long mStepDuration;

    public ProgressBarAnimation(ProgressBar progressBar, long fullDuration){
        super();
        mProgressBar = progressBar;
        mStepDuration = fullDuration / progressBar.getMax();
    }
    public void setProgress(int progress){
        if (progress<0){
            progress=0;
        }
        if (progress> mProgressBar.getMax()){
            progress = mProgressBar.getMax();
        }

        mTo = progress;

        mFrom = mProgressBar.getProgress();
        setDuration(Math.abs(mTo - mFrom)*mStepDuration);
        mProgressBar.startAnimation(this);
    }
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t){
        float value = mFrom + (mTo - mFrom) * interpolatedTime;
        mProgressBar.setProgress((int) value);
    }
}
