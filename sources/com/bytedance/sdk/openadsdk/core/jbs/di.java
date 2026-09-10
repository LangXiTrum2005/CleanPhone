package com.bytedance.sdk.openadsdk.core.jbs;

import android.content.Context;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.sdk.component.adexpress.dynamic.ri.ri {
    private final com.bytedance.sdk.component.mj.lr.ik ik;
    private final Runnable ka;
    private com.bytedance.sdk.component.adexpress.lr.xha lr;
    private final com.bytedance.sdk.component.adexpress.lr.aw ri;

    public di(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.fi.mj mjVar, com.bytedance.sdk.component.adexpress.lr.aw awVar, com.bytedance.sdk.component.adexpress.dynamic.di.ri riVar) {
        super(context, themeStatusBroadcastReceiver, z, mjVar, awVar, riVar);
        this.ik = new com.bytedance.sdk.component.mj.lr.ik("dynamic_render_template") { // from class: com.bytedance.sdk.openadsdk.core.jbs.di.1
            @Override // java.lang.Runnable
            public void run() {
                di.this.ri.ik();
                com.bytedance.sdk.openadsdk.core.vr.ik().post(di.this.ka);
            }
        };
        this.ka = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jbs.di.2
            @Override // java.lang.Runnable
            public void run() {
                if (di.this.lr != null) {
                    di diVar = di.this;
                    di.super.ri(diVar.lr);
                }
            }
        };
        this.ri = awVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ri.ri
    public void lr() {
        super.lr();
        com.bytedance.sdk.openadsdk.core.vr.ik().removeCallbacks(this.ka);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ri.ri, com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
        this.lr = xhaVar;
        dzy.ik((Runnable) this.ik);
    }
}
