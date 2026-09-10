package com.bytedance.adsdk.ugeno.yoga.ud;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.rq;
import com.bytedance.adsdk.ugeno.yoga.to;
import com.bytedance.adsdk.ugeno.yoga.wd;

/* JADX INFO: loaded from: classes.dex */
public class ud extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof ud) {
            throw null;
        }
        to toVarQdl = rq.qdl();
        lnr.qdl(new lnr.qdl(layoutParams), toVarQdl, view);
        toVarQdl.qdl(view);
        toVarQdl.qdl((wd) new lnr.ud());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof lnr.qdl;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new lnr.qdl(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new lnr.qdl(layoutParams);
    }

    public to getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
