package com.bytedance.sdk.openadsdk.core.OY;

import com.bytedance.sdk.openadsdk.utils.hg;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR implements com.bytedance.adsdk.ugeno.core.IeN, com.bytedance.sdk.component.adexpress.LD.QAg {
    private long JXs;
    private final String LD;
    private final com.bytedance.sdk.openadsdk.ZU.ZU.JXs Lxb;
    private final String ZU;
    private final com.bytedance.sdk.openadsdk.core.model.tD lk;

    public NXR(com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs, String str, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str2) {
        this.Lxb = jXs;
        this.LD = str;
        this.ZU = str2;
        this.lk = tDVar;
    }

    public void JVA() {
        this.Lxb.JVA();
        this.Lxb.sLN();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void JXs() {
        this.Lxb.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void OY() {
        this.Lxb.STP();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void QAg() {
        this.Lxb.IeN();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void ZU() {
        this.Lxb.Lxb();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void ebl() {
        this.Lxb.Lxb(true);
        this.Lxb.NXR();
        hg.LD(new com.bytedance.sdk.component.OY.OY("native_success") { // from class: com.bytedance.sdk.openadsdk.core.OY.NXR.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ZU.lk.LD(NXR.this.lk, NXR.this.LD, "dynamic_backup_render", (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void lc(int i) {
        final String str;
        System.currentTimeMillis();
        if (i == 3) {
            this.Lxb.ebl("dynamic_render2_success");
            str = "dynamic2_render";
        } else {
            this.Lxb.ebl("dynamic_render_success");
            str = "dynamic_backup_native_render";
        }
        this.Lxb.Lxb(true);
        hg.LD(new com.bytedance.sdk.component.OY.OY("dynamic_success") { // from class: com.bytedance.sdk.openadsdk.core.OY.NXR.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.ZU.lk.LD(NXR.this.lk, NXR.this.LD, str, (JSONObject) null);
            }
        }, 10);
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void lk(int i) {
        if (i == 3) {
            this.Lxb.ZU("dynamic_sub_analysis2_end");
        } else {
            this.Lxb.ZU("dynamic_sub_analysis_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void nBu() {
        this.Lxb.LD();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void JXs(int i) {
        if (i == 3) {
            this.Lxb.ZU("dynamic_sub_render2_end");
        } else {
            this.Lxb.ZU("dynamic_sub_render_end");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void LD(int i) {
        if (i == 3) {
            this.Lxb.ZU("dynamic_sub_analysis2_start");
        } else {
            this.Lxb.ZU("dynamic_sub_analysis_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void Lxb(boolean z) {
        this.Lxb.Lxb(z ? 1 : 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void ZU(int i) {
        if (i == 3) {
            this.Lxb.ZU("dynamic_sub_render2_start");
        } else {
            this.Lxb.ZU("dynamic_sub_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void Lxb(int i, String str) {
        this.Lxb.Lxb(i, str);
        JVA.Lxb("Web", i, str, this.LD, this.ZU, this.lk);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IeN
    public void lk() {
        this.Lxb.JXs("ugen_sub_render_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.IeN
    public void LD() {
        this.Lxb.JXs("ugen_sub_analysis_end");
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void Lxb(int i) {
        this.JXs = System.currentTimeMillis();
        if (i == 3) {
            this.Lxb.lk("dynamic_render2_start");
        } else {
            this.Lxb.lk("dynamic_render_start");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void lc() {
        this.Lxb.lk();
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.QAg
    public void Lxb(int i, int i2, String str, boolean z) {
        if (!z) {
            this.Lxb.Lxb(true);
        }
        if (i == 3) {
            this.Lxb.LD(i2, "dynamic_render2_error");
        } else {
            this.Lxb.LD(i2, "dynamic_render_error");
        }
        JVA.Lxb("NDR", i2, str, this.LD, this.ZU, this.lk);
    }

    @Override // com.bytedance.adsdk.ugeno.core.IeN
    public void Lxb() {
        this.Lxb.JXs("ugen_render_start");
        this.Lxb.JXs("ugen_sub_analysis_start");
    }

    @Override // com.bytedance.adsdk.ugeno.core.IeN
    public void Lxb(com.bytedance.adsdk.ugeno.core.STP stp) {
        if (stp.Lxb() == 0) {
            this.Lxb.JXs("ugen_sub_render_end");
            this.Lxb.lc("ugen_render_success");
        } else {
            this.Lxb.lk(stp.Lxb(), "ugen_render_error");
            JVA.Lxb("UGen", stp.Lxb(), stp.LD(), this.LD, this.ZU, this.lk);
        }
        this.Lxb.Lxb(true);
    }
}
