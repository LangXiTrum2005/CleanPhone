package com.thinkup.core.common.on;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class no extends mnm {
    public o0mo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f42216n;
    public int o;

    @Override // com.thinkup.core.common.on.mnm
    public final JSONObject o() {
        JSONObject jSONObjectMmo = this.m.mmo(this.o);
        if (jSONObjectMmo != null) {
            try {
                jSONObjectMmo.put("sdk_time", this.f42216n);
                return jSONObjectMmo;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return jSONObjectMmo;
    }
}
