package com.thinkup.splashad.api;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class TUSplashSkipInfo {
    public static final String TAG = "TUSplashSkipInfo";
    long mCallbackInterval;
    ViewGroup mContainer;
    long mCountDownDuration;
    View mSkipView;
    TUSplashSkipAdListener mTUSplashSkipAdListener;

    public TUSplashSkipInfo(View view, long j, long j2, TUSplashSkipAdListener tUSplashSkipAdListener) {
        this.mSkipView = view;
        this.mCountDownDuration = j;
        this.mCallbackInterval = j2;
        this.mTUSplashSkipAdListener = tUSplashSkipAdListener;
        if (j < 2000) {
            Log.e(TAG, "mCountDownDuration is less than or equal to 2000, reset to 2000");
            this.mCountDownDuration = 2000L;
        }
        long j3 = this.mCallbackInterval;
        if (j3 <= 0) {
            Log.e(TAG, "mCallbackInterval is less than or equal to 0, reset to 1000");
            this.mCallbackInterval = 1000L;
        } else if (j3 < 20) {
            Log.e(TAG, "mCallbackInterval is less than 10, reset to 20");
            this.mCallbackInterval = 20L;
        }
    }

    public boolean canUseCustomSkipView() {
        return this.mSkipView != null;
    }

    public void destroy() {
        View view = this.mSkipView;
        if (view != null) {
            view.setOnClickListener(null);
            this.mSkipView = null;
        }
        this.mTUSplashSkipAdListener = null;
    }

    public long getCallbackInterval() {
        return this.mCallbackInterval;
    }

    public ViewGroup getContainer() {
        return this.mContainer;
    }

    public long getCountDownDuration() {
        return this.mCountDownDuration;
    }

    public View getSkipView() {
        return this.mSkipView;
    }

    public TUSplashSkipAdListener getTUSplashSkipAdListener() {
        return this.mTUSplashSkipAdListener;
    }

    public void setContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    public TUSplashSkipInfo(View view, TUSplashSkipAdListener tUSplashSkipAdListener) {
        this(view, 5000L, 1000L, tUSplashSkipAdListener);
    }
}
