package com.bytedance.adsdk.ugeno.tvp.ud;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.mml;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends FrameLayout {
    private mml qdl;
    private Map<Integer, exu> ud;

    public qdl(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, exu> map = this.ud;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z2, i2, i3, i4, i5);
        mml mmlVar2 = this.qdl;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        mml mmlVar2 = this.qdl;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        mml mmlVar = this.qdl;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void qdl(mml mmlVar) {
        this.qdl = mmlVar;
    }

    public void setEventMap(Map<Integer, exu> map) {
        this.ud = map;
    }
}
