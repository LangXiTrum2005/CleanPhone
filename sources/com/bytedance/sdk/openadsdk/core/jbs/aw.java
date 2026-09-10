package com.bytedance.sdk.openadsdk.core.jbs;

import com.bytedance.sdk.openadsdk.utils.dzy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class aw implements com.bytedance.adsdk.ugeno.core.nr, com.bytedance.sdk.component.adexpress.lr.jbs {
    private boolean di;
    private long fi;
    private final com.bytedance.sdk.openadsdk.core.model.wjv ik;
    private final String ka;
    private final String lr;
    private final com.bytedance.sdk.openadsdk.ka.ka.fi ri;

    public aw(com.bytedance.sdk.openadsdk.ka.ka.fi fiVar, String str, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str2, boolean z) {
        this.ri = fiVar;
        this.lr = str;
        this.ka = str2;
        this.ik = wjvVar;
        this.di = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void di(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.ri.xha("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.ri.xha("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.ri.ri(true);
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.jbs.aw.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ka.ik.lr(aw.this.ik, aw.this.lr, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void fi() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ik(int i) {
        if (i == 3) {
            this.ri.ka("dynamic_sub_analysis2_end");
        } else {
            this.ri.ka("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void jbs() {
        this.ri.lr();
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ka() {
        this.ri.ri();
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void mj() {
        this.ri.bgr();
    }

    public void qt() {
        this.ri.qt();
        this.ri.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void xha(int i) {
        this.ri.ri(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void fi(int i) {
        if (i == 3) {
            this.ri.ka("dynamic_sub_render2_end");
        } else {
            this.ri.ka("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ka(int i) {
        if (i == 3) {
            this.ri.ka("dynamic_sub_render2_start");
        } else {
            this.ri.ka("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void lr(int i) {
        if (i == 3) {
            this.ri.ka("dynamic_sub_analysis2_start");
        } else {
            this.ri.ka("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ri(boolean z) {
        this.ri.lr(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void xha() {
        this.ri.aw();
    }

    @Override // com.bytedance.adsdk.ugeno.core.nr
    public void ik() {
        this.ri.fi("ugen_sub_render_start");
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ri(int i, String str) {
        this.ri.ri(i, str);
        sf.ri("Web", i, str, this.lr, this.ka, this.ik);
    }

    @Override // com.bytedance.adsdk.ugeno.core.nr
    public void lr() {
        this.ri.fi("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ri(int i) {
        this.fi = System.currentTimeMillis();
        if (i == 3) {
            this.ri.ik("dynamic_render2_start");
        } else {
            this.ri.ik("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void di() {
        this.ri.ri(true);
        this.ri.co();
        dzy.lr(new com.bytedance.sdk.component.mj.lr.ik("native_success") { // from class: com.bytedance.sdk.openadsdk.core.jbs.aw.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ka.ik.lr(aw.this.ik, aw.this.lr, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.jbs
    public void ri(int i, int i2, String str, boolean z) {
        if (!z) {
            this.ri.ri(true);
        }
        if (i == 3) {
            this.ri.lr(i2, "dynamic_render2_error");
        } else {
            this.ri.lr(i2, "dynamic_render_error");
        }
        sf.ri("NDR", i2, str, this.lr, this.ka, this.ik);
    }

    @Override // com.bytedance.adsdk.ugeno.core.nr
    public void ri() {
        this.ri.ri("ugen_render_start", this.di);
        this.ri.fi("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.nr
    public void ri(com.bytedance.adsdk.ugeno.core.bu buVar) {
        if (buVar.ri() == 0) {
            this.ri.fi("ugen_sub_render_end");
            this.ri.di("ugen_render_success");
        } else {
            this.ri.ik(buVar.ri(), "ugen_render_error");
            sf.ri("UGen", buVar.ri(), buVar.lr(), this.lr, this.ka, this.ik);
        }
        this.ri.ri(true);
    }
}
