package com.bytedance.adsdk.ugeno.yoga.lr;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.qt;
import com.bytedance.adsdk.ugeno.yoga.sf;
import com.bytedance.adsdk.ugeno.yoga.xha;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof lr) {
            throw null;
        }
        qt qtVarRi = sf.ri();
        ik.ri(new ik.ri(layoutParams), qtVarRi, view);
        qtVarRi.ri(view);
        qtVarRi.ri((xha) new ik.lr());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ik.ri;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ik.ri(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ik.ri(layoutParams);
    }

    public qt getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
