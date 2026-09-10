package com.bytedance.adsdk.ugeno.mo.ud;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class mml implements com.bytedance.adsdk.ugeno.jpc.lnr.mzz {
    private String qdl;

    public void qdl(String str) {
        this.qdl = str;
    }

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mzz
    public void qdl(View view, float f) {
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        }
        if (TextUtils.equals(this.qdl, "cube")) {
            float height = f < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }
}
