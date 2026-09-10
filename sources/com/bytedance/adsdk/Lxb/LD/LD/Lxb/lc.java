package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lc extends kqm {
    public lc() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.GT);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.lk.Lxb(objLxb2, (Number) objLxb);
    }
}
