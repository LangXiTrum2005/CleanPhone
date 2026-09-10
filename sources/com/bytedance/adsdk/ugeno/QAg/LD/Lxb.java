package com.bytedance.adsdk.ugeno.QAg.LD;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.nBu;
import com.bytedance.adsdk.ugeno.lk;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends FrameLayout {
    private Map<Integer, nBu> LD;
    private lk Lxb;

    public Lxb(Context context) {
        super(context);
    }

    public void Lxb(lk lkVar) {
        this.Lxb = lkVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, nBu> map = this.LD;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.lc();
        }
        super.onLayout(z, i, i2, i3, i4);
        lk lkVar2 = this.Lxb;
        if (lkVar2 != null) {
            lkVar2.Lxb(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            super.onMeasure(iArrLxb[0], iArrLxb[1]);
        } else {
            super.onMeasure(i, i2);
        }
        lk lkVar2 = this.Lxb;
        if (lkVar2 != null) {
            lkVar2.JXs();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setEventMap(Map<Integer, nBu> map) {
        this.LD = map;
    }
}
