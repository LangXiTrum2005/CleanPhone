package com.bytedance.adsdk.ugeno.yoga;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Lxb) {
            throw null;
        }
        sLN slnLxb = NXR.Lxb();
        OY.Lxb(new OY.Lxb(layoutParams), slnLxb, view);
        slnLxb.Lxb(view);
        slnLxb.Lxb((QAg) new OY.LD());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OY.Lxb;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OY.Lxb(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OY.Lxb(layoutParams);
    }

    public sLN getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
