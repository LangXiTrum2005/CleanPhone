package com.thinkup.nativead.api;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class TUNativeAdView extends FrameLayout {
    private static final String TAG = "TUNativeAdView";
    View mAdView;
    NativeAd.ImpressionEventListener mImpressionEventListener;
    boolean mIsInWindow;
    NativeAd mNativeAd;
    int mNativeAdId;

    public TUNativeAdView(Context context) {
        super(context);
    }

    private void callbackImpression() {
        NativeAd.ImpressionEventListener impressionEventListener = this.mImpressionEventListener;
        if (impressionEventListener != null) {
            impressionEventListener.onImpression();
        }
    }

    public synchronized void attachNativeAd(NativeAd nativeAd) {
        this.mNativeAd = nativeAd;
    }

    public synchronized void clear() {
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            try {
                nativeAd.clear(this);
            } catch (Throwable unused) {
            }
            this.mNativeAd = null;
        }
    }

    public void clearImpressionListener(int i2) {
        if (this.mNativeAdId == i2) {
            this.mImpressionEventListener = null;
        }
    }

    public void destory() {
        this.mImpressionEventListener = null;
    }

    public boolean isAttachInWindow() {
        return this.mIsInWindow;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsInWindow = true;
        if (getVisibility() == 0) {
            callbackImpression();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        Log.w(TAG, "Native ads of some video types may display abnormally, because this view is attached to a window that does not enable hardware acceleration.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsInWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0 && getVisibility() == 0) {
            callbackImpression();
        }
    }

    public void renderView(int i2, View view, NativeAd.ImpressionEventListener impressionEventListener) {
        View view2 = this.mAdView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mAdView = view;
        this.mNativeAdId = i2;
        this.mImpressionEventListener = impressionEventListener;
        addView(view);
        if (this.mIsInWindow && getVisibility() == 0) {
            callbackImpression();
        }
    }

    public TUNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TUNativeAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
