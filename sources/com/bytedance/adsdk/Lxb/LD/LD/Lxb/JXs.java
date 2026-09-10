package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JXs extends kqm {
    public JXs() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.GT_EQ);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.Lxb.LD.JXs.Lxb.ZU.Lxb(objLxb2, (Number) objLxb)).booleanValue());
    }
}
