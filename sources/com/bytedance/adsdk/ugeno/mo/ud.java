package com.bytedance.adsdk.ugeno.mo;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class ud extends qdl<com.bytedance.adsdk.ugeno.ud.lnr> {
    private com.bytedance.adsdk.ugeno.mml mml;

    public ud(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        super.onLayout(z2, i2, i3, i4, i5);
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i2, i3);
            super.onMeasure(iArrQdl[0], iArrQdl[1]);
        } else {
            super.onMeasure(i2, i3);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.mml;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        com.bytedance.adsdk.ugeno.mml mmlVar = this.mml;
        if (mmlVar != null) {
            mmlVar.ud(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
    }

    public void qdl(com.bytedance.adsdk.ugeno.mml mmlVar) {
        this.mml = mmlVar;
    }

    @Override // com.bytedance.adsdk.ugeno.mo.qdl
    public View to(int i2) {
        return ((com.bytedance.adsdk.ugeno.ud.lnr) this.qdl.get(i2)).rq();
    }
}
