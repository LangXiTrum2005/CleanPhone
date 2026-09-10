package com.bytedance.adsdk.ugeno.Lxb;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class lc implements JXs {
    private float JXs;
    private float LD;
    private View Lxb;
    private float ZU;
    private float lc;
    private float lk;

    public lc(View view) {
        this.Lxb = view;
    }

    public void JXs(float f) {
        this.lc = f;
        this.Lxb.postInvalidate();
    }

    public void LD(float f) {
        View view = this.Lxb;
        if (view == null) {
            return;
        }
        this.lk = f;
        view.postInvalidate();
    }

    public void Lxb(float f) {
        View view = this.Lxb;
        if (view == null) {
            return;
        }
        this.LD = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public void ZU(float f) {
        this.JXs = f;
        this.Lxb.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRipple() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getRubIn() {
        return this.lc;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getShine() {
        return this.ZU;
    }

    @Override // com.bytedance.adsdk.ugeno.Lxb.JXs
    public float getStretch() {
        return this.JXs;
    }

    public void lk(float f) {
        View view = this.Lxb;
        if (view == null) {
            return;
        }
        this.ZU = f;
        view.postInvalidate();
    }

    public float Lxb() {
        return this.LD;
    }

    public void Lxb(int i) {
        View view = this.Lxb;
        if (view == null) {
            return;
        }
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else if (background instanceof ColorDrawable) {
            ((ColorDrawable) background.mutate()).setColor(i);
        }
    }
}
