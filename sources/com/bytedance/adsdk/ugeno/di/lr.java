package com.bytedance.adsdk.ugeno.di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ri<com.bytedance.adsdk.ugeno.lr.ik> {
    private com.bytedance.adsdk.ugeno.ka ka;

    public lr(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.xha();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.mj();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.di();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.ka kaVar2 = this.ka;
        if (kaVar2 != null) {
            kaVar2.ri(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.ka kaVar = this.ka;
        if (kaVar != null) {
            int[] iArrRi = kaVar.ri(i, i2);
            super.onMeasure(iArrRi[0], iArrRi[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.ka kaVar2 = this.ka;
        if (kaVar2 != null) {
            kaVar2.fi();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.ka kaVar = this.ka;
        if (kaVar != null) {
            kaVar.lr(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.adsdk.ugeno.di.ri
    public View qt(int i) {
        return ((com.bytedance.adsdk.ugeno.lr.ik) this.ri.get(i)).sf();
    }

    public void ri(com.bytedance.adsdk.ugeno.ka kaVar) {
        this.ka = kaVar;
    }
}
