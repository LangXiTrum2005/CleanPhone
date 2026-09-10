package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.fco;

/* JADX INFO: loaded from: classes3.dex */
public class mo extends com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl {
    private final com.bytedance.sdk.component.jpc.jpc lnr;
    private final Runnable mml;
    private final com.bytedance.sdk.component.adexpress.ud.exu qdl;
    private com.bytedance.sdk.component.adexpress.ud.wd ud;

    public mo(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z2, com.bytedance.sdk.component.adexpress.dynamic.mzz.jpc jpcVar, com.bytedance.sdk.component.adexpress.ud.exu exuVar, com.bytedance.sdk.component.adexpress.dynamic.mo.qdl qdlVar) {
        super(context, themeStatusBroadcastReceiver, z2, jpcVar, exuVar, qdlVar);
        this.lnr = new com.bytedance.sdk.component.jpc.jpc("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.tvp.mo.1
            @Override // java.lang.Runnable
            public void run() {
                mo.this.qdl.lnr();
                com.bytedance.sdk.openadsdk.core.rdp.lnr().post(mo.this.mml);
            }
        };
        this.mml = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tvp.mo.2
            @Override // java.lang.Runnable
            public void run() {
                if (mo.this.ud != null) {
                    mo moVar = mo.this;
                    mo.super.qdl(moVar.ud);
                }
            }
        };
        this.qdl = exuVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl
    public void ud() {
        super.ud();
        com.bytedance.sdk.openadsdk.core.rdp.lnr().removeCallbacks(this.mml);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qdl.qdl, com.bytedance.sdk.component.adexpress.ud.mml
    public void qdl(com.bytedance.sdk.component.adexpress.ud.wd wdVar) {
        this.ud = wdVar;
        fco.ud(this.lnr);
    }
}
