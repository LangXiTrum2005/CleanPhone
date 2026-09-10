package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JVA extends kqm {
    public JVA() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.MINUS);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.JXs.Lxb((Number) objLxb2, (Number) objLxb);
    }
}
