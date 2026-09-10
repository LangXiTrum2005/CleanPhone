package com.bytedance.sdk.openadsdk.component.reward.LD;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.openadsdk.core.Ivz;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.hg;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends LD implements com.bytedance.sdk.openadsdk.sLN.lc {
    private final DY IeN;
    private boolean VVE;

    public lc(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        super(lxb);
        this.IeN = (DY) lxb.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean JXs() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean KPU() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.Lxb
    public boolean LD() {
        return this.VVE;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(FrameLayout frameLayout) {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void ebl() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void id() {
        Ivz jsObject;
        if (this.Lxb.Pw.isFinishing()) {
            return;
        }
        if (this.Lxb.id.OY() || this.VVE) {
            super.id();
            if (this.Lxb.id.OY()) {
                foI();
                this.Lxb.le.LD();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.LD ldLxb = this.Lxb.id.Lxb();
        if (ldLxb == null || (jsObject = ldLxb.getJsObject()) == null) {
            return;
        }
        jsObject.Lxb(this);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public boolean lc() {
        return true;
    }

    public static void Lxb(tD tDVar, boolean z, String str) {
        HashMap map = new HashMap();
        map.put("is_backup", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("choose_ad_start_show", tDVar, str, map);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("req_id", tDVar.xNP());
            jSONObject.put("is_backup", z);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb("choose_ad_start_show", jSONObject);
    }

    public void LD(boolean z) {
        if (this.VVE) {
            return;
        }
        HashMap map = new HashMap();
        map.put("has_focus", Boolean.valueOf(z));
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb("choose_ad_focus_changed", this.IeN, this.Lxb.JXs, map);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.LD.LD
    public void Lxb(com.bytedance.sdk.openadsdk.component.reward.view.ebl eblVar) {
        if (ZU.Lxb(this.IeN)) {
            ZU.Lxb(this.IeN, eblVar, this.Lxb);
        } else {
            super.Lxb(eblVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.lc
    public void Lxb(int i, long j) {
        this.VVE = true;
        int i2 = i - 1;
        this.IeN.sRq(i2);
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.IeN, this.Lxb.JXs, i, j);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb(this.IeN.foF(), i2, this.Lxb.ZU);
        hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.LD.lc.1
            @Override // java.lang.Runnable
            public void run() {
                lc.this.id();
                lc lcVar = lc.this;
                com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = lcVar.Lxb;
                if (lxb.VU) {
                    lcVar.foI();
                    lc.this.Lxb.le.LD();
                } else {
                    com.bytedance.sdk.openadsdk.component.reward.Lxb.JXs.Lxb lxbLc = lxb.le.lc();
                    if (lxbLc != null) {
                        lxbLc.VVE();
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.lc
    public void Lxb(STP stp) {
        this.Lxb.id.Lxb().LD(stp);
    }
}
