package com.bytedance.adsdk.ugeno.lc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class LD extends Lxb<com.bytedance.adsdk.ugeno.LD.lk> {
    private com.bytedance.adsdk.ugeno.lk lk;

    public LD(Context context) {
        super(context);
    }

    public void Lxb(com.bytedance.adsdk.ugeno.lk lkVar) {
        this.lk = lkVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lc.Lxb
    public View ebl(int i) {
        return ((com.bytedance.adsdk.ugeno.LD.lk) this.Lxb.get(i)).QAg();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.lc();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.lk;
        if (lkVar2 != null) {
            lkVar2.Lxb(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            super.onMeasure(iArrLxb[0], iArrLxb[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.lk lkVar2 = this.lk;
        if (lkVar2 != null) {
            lkVar2.JXs();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.lk lkVar = this.lk;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
