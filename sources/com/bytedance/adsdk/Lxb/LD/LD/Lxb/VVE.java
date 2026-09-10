package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VVE implements com.bytedance.adsdk.Lxb.LD.LD.Lxb {
    private final com.bytedance.adsdk.Lxb.LD.ZU.lk Lxb;

    public VVE(com.bytedance.adsdk.Lxb.LD.ZU.lk lkVar) {
        this.Lxb = lkVar;
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
