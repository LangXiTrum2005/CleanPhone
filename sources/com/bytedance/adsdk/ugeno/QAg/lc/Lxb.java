package com.bytedance.adsdk.ugeno.QAg.lc;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.Lxb.JXs;
import com.bytedance.adsdk.ugeno.Lxb.lc;
import com.bytedance.adsdk.ugeno.core.IAnimation;
import com.bytedance.adsdk.ugeno.lk;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends TextView implements JXs, IAnimation {
    private float LD;
    private lk Lxb;
    private lc lk;

    public Lxb(Context context) {
        super(context);
        this.lk = new lc(this);
    }

    public void Lxb(lk lkVar) {
        this.Lxb = lkVar;
    }

    public float getBorderRadius() {
        return this.lk.Lxb();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRipple() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRubIn() {
        return this.lk.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getShine() {
        return this.lk.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getStretch() {
        return this.lk.getStretch();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.ebl();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.OY();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.Lxb(canvas, this);
            this.Lxb.Lxb(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.Lxb(i, i2, i3, i4);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        lk lkVar = this.Lxb;
        if (lkVar == null) {
            super.onMeasure(i, i2);
        } else {
            int[] iArrLxb = lkVar.Lxb(i, i2);
            super.onMeasure(iArrLxb[0], iArrLxb[1]);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        lk lkVar = this.Lxb;
        if (lkVar != null) {
            lkVar.LD(i, i2, i3, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.lk.Lxb(i);
    }

    public void setBorderRadius(float f) {
        lc lcVar = this.lk;
        if (lcVar != null) {
            lcVar.Lxb(f);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.IAnimation
    public void setRipple(float f) {
        this.LD = f;
        lc lcVar = this.lk;
        if (lcVar != null) {
            lcVar.LD(f);
        }
        postInvalidate();
    }

    public void setRubIn(float f) {
        lc lcVar = this.lk;
        if (lcVar != null) {
            lcVar.JXs(f);
        }
    }

    public void setShine(float f) {
        lc lcVar = this.lk;
        if (lcVar != null) {
            lcVar.lk(f);
        }
    }

    public void setStretch(float f) {
        lc lcVar = this.lk;
        if (lcVar != null) {
            lcVar.ZU(f);
        }
    }
}
