package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public class SplashBottomContainer extends LinearLayout {
    public SplashBottomContainer(Context context) {
        super(context);
        a();
    }

    private void a() {
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public SplashBottomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SplashBottomContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
