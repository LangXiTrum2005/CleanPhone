package com.bytedance.sdk.openadsdk.ZU.JXs.LD;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HK;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class STP implements lk {
    private final String JXs;
    private long LD;
    private long Lxb;
    private final int ZU;
    private final int lk;

    public STP(HK hk) {
        this.lk = hk.f3167a;
        this.ZU = hk.b;
        this.JXs = hk.c;
    }

    public void LD(long j) {
        this.LD = j;
    }

    public void Lxb(long j) {
        this.Lxb = j;
    }

    @Override // com.bytedance.sdk.openadsdk.ZU.JXs.LD.lk
    public void Lxb(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.Lxb);
            jSONObject.put("total_duration", this.LD);
            jSONObject.put("error_code", this.lk);
            jSONObject.put("extra_error_code", this.ZU);
            jSONObject.put("error_message", this.JXs);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("PlayErrorModel", th.getMessage());
        }
    }
}
