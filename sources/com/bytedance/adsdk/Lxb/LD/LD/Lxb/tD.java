package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class tD implements com.bytedance.adsdk.Lxb.LD.LD.LD {
    private com.bytedance.adsdk.Lxb.LD.LD.Lxb LD;
    private com.bytedance.adsdk.Lxb.LD.LD.Lxb Lxb;
    private com.bytedance.adsdk.Lxb.LD.LD.Lxb lk;

    @Override // com.bytedance.adsdk.Lxb.LD.LD.LD
    public void LD(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb) {
        this.LD = lxb;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb = this.Lxb.Lxb(map);
        if (objLxb == null) {
            return null;
        }
        return ((Boolean) objLxb).booleanValue() ? this.LD.Lxb(map) : this.lk.Lxb(map);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.LD
    public void lk(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb) {
        this.lk = lxb;
    }

    public String toString() {
        return LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public String LD() {
        return this.Lxb.LD() + "?" + this.LD.LD() + ":" + this.lk.LD();
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public com.bytedance.adsdk.Lxb.LD.ZU.JXs Lxb() {
        return com.bytedance.adsdk.Lxb.LD.ZU.lc.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.LD
    public void Lxb(com.bytedance.adsdk.Lxb.LD.LD.Lxb lxb) {
        this.Lxb = lxb;
    }
}
