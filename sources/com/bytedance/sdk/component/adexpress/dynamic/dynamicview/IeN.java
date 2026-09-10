package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class IeN extends lc {
    com.bytedance.sdk.component.adexpress.dynamic.ZU.OY LD;
    String Lxb;

    public IeN(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, String str) {
        super(context, dynamicRootView, oy);
        this.Lxb = str;
        this.LD = oy;
        com.bytedance.sdk.component.adexpress.lc.nBu lottieView = getLottieView();
        if (lottieView != null) {
            addView(lottieView, getWidgetLayoutParams());
        }
    }

    private com.bytedance.sdk.component.adexpress.lc.nBu getLottieView() {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy = this.NXR;
        if (oy == null || oy.nBu() == null || this.JVA == null || TextUtils.isEmpty(this.Lxb)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs = this.NXR.nBu().JXs();
        String strBG = lcVarJXs != null ? lcVarJXs.bG() : "";
        if (TextUtils.isEmpty(strBG)) {
            return null;
        }
        String strN = DM.n(new StringBuilder(), this.Lxb, "static/lotties/", strBG, ".json");
        com.bytedance.sdk.component.adexpress.lc.nBu nbu = new com.bytedance.sdk.component.adexpress.lc.nBu(this.JVA);
        nbu.setImageLottieTosPath(strN);
        nbu.OY();
        return nbu;
    }
}
