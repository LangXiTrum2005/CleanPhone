package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Sfi implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private com.bytedance.adsdk.Lxb.LD.ZU.ZU Lxb;

    public Sfi(com.bytedance.adsdk.Lxb.LD.ZU.ZU zu) {
        this.Lxb = zu;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        return this.Lxb.Lxb();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return this.Lxb;
    }
}
