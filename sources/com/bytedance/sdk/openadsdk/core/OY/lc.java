package com.bytedance.sdk.openadsdk.core.OY;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.hg;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb {
    private com.bytedance.sdk.component.adexpress.LD.ebl LD;
    private final com.bytedance.sdk.component.adexpress.LD.NXR Lxb;
    private final Runnable ZU;
    private final com.bytedance.sdk.component.OY.OY lk;

    public lc(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JXs.OY oy, com.bytedance.sdk.component.adexpress.LD.NXR nxr, com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb lxb) {
        super(context, themeStatusBroadcastReceiver, z, oy, nxr, lxb);
        this.lk = new com.bytedance.sdk.component.OY.OY("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.OY.lc.1
            @Override // java.lang.Runnable
            public void run() {
                lc.this.Lxb.lk();
                com.bytedance.sdk.openadsdk.core.STP.lk().post(lc.this.ZU);
            }
        };
        this.ZU = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.OY.lc.2
            @Override // java.lang.Runnable
            public void run() {
                if (lc.this.LD != null) {
                    lc lcVar = lc.this;
                    lc.super.Lxb(lcVar.LD);
                }
            }
        };
        this.Lxb = nxr;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb
    public void LD() {
        super.LD();
        com.bytedance.sdk.openadsdk.core.STP.lk().removeCallbacks(this.ZU);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb, com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(com.bytedance.sdk.component.adexpress.LD.ebl eblVar) {
        this.LD = eblVar;
        hg.LD(this.lk);
    }
}
