package com.bytedance.adsdk.ugeno.qdl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class jpc implements wd {
    private float lnr;
    private float mml;
    private float mo;
    private float mzz;
    private View qdl;
    private float ud;

    public jpc(View view) {
        this.qdl = view;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRipple() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getRubIn() {
        return this.mo;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getShine() {
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ugeno.qdl.wd
    public float getStretch() {
        return this.mzz;
    }

    public void lnr(float f) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.mml = f;
        view.postInvalidate();
    }

    public void mml(float f) {
        this.mzz = f;
        this.qdl.postInvalidate();
    }

    public void mzz(float f) {
        this.mo = f;
        this.qdl.postInvalidate();
    }

    public void qdl(float f) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.ud = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public void ud(float f) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        this.lnr = f;
        view.postInvalidate();
    }

    public float qdl() {
        return this.ud;
    }

    public void qdl(int i2) {
        View view = this.qdl;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i2);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i2);
        }
    }
}
