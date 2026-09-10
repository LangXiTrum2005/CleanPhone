package com.bytedance.sdk.openadsdk.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class STP extends View {
    private View LD;
    private final Lxb Lxb;

    public interface Lxb {
        View Lxb(Context context);
    }

    public STP(Context context, Lxb lxb) {
        super(context);
        this.Lxb = lxb;
        Lxb();
    }

    private View LD() {
        Lxb lxb;
        if (this.LD == null && (lxb = this.Lxb) != null) {
            this.LD = lxb.Lxb(getContext());
            Lxb(this.LD, (ViewGroup) getParent());
        }
        return this.LD;
    }

    private void Lxb() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.LD;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            LD();
        }
    }

    private void Lxb(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
