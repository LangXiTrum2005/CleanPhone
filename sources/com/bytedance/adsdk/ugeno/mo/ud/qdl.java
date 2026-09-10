package com.bytedance.adsdk.ugeno.mo.ud;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class qdl implements com.bytedance.adsdk.ugeno.jpc.lnr.mzz {
    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mzz
    public void qdl(View view, float f) {
        float width = f < 0.0f ? view.getWidth() : 0.0f;
        float height = view.getHeight() * 0.5f;
        view.setPivotX(width);
        view.setPivotY(height);
        view.setRotationY(f * 90.0f);
    }
}
