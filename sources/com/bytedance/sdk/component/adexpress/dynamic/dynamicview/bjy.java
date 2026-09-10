package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;

/* JADX INFO: loaded from: classes.dex */
public class bjy extends mo {
    String qdl;
    com.bytedance.sdk.component.adexpress.dynamic.mml.jpc ud;

    public bjy(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar, String str) {
        super(context, dynamicRootView, jpcVar);
        this.qdl = str;
        this.ud = jpcVar;
        com.bytedance.sdk.component.adexpress.mo.to lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.mo.to getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.mml.jpc jpcVar = this.exu;
        if (jpcVar == null || jpcVar.to() == null || this.rq == null || TextUtils.isEmpty(this.qdl)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.mml.mo moVarMzz = this.exu.to().mzz();
        String strZy = moVarMzz != null ? moVarMzz.zy() : "";
        if (TextUtils.isEmpty(strZy)) {
            return null;
        }
        String strQ = a.q(new StringBuilder(), this.qdl, "static/lotties/", strZy, ".json");
        com.bytedance.sdk.component.adexpress.mo.to toVar = new com.bytedance.sdk.component.adexpress.mo.to(this.rq);
        toVar.setImageLottieTosPath(strQ);
        toVar.jpc();
        return toVar;
    }
}
