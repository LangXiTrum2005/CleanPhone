package com.thinkup.core.common.inner.ui.thirdparty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public class ThirdPartyMediaView extends FrameLayout {
    private boolean o;

    public ThirdPartyMediaView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.o;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 || action == 1 || action == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setInterceptTouchEvent(boolean z2) {
        this.o = z2;
    }

    public ThirdPartyMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
