package com.bytedance.adsdk.ugeno.ri;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class mj implements xha {
    private float di;
    private float fi;
    private float ik;
    private float ka;
    private float lr;
    private View ri;

    public mj(View view) {
        this.ri = view;
    }

    public void fi(float f) {
        this.di = f;
        this.ri.postInvalidate();
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRipple() {
        return this.ik;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getRubIn() {
        return this.di;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getShine() {
        return this.ka;
    }

    @Override // com.bytedance.adsdk.ugeno.ri.xha
    public float getStretch() {
        return this.fi;
    }

    public void ik(float f) {
        View view = this.ri;
        if (view == null) {
            return;
        }
        this.ka = f;
        view.postInvalidate();
    }

    public void ka(float f) {
        this.fi = f;
        this.ri.postInvalidate();
    }

    public void lr(float f) {
        View view = this.ri;
        if (view == null) {
            return;
        }
        this.ik = f;
        view.postInvalidate();
    }

    public void ri(float f) {
        View view = this.ri;
        if (view == null) {
            return;
        }
        this.lr = f;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setCornerRadius(f);
        }
    }

    public float ri() {
        return this.lr;
    }

    public void ri(int i) {
        View view = this.ri;
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
