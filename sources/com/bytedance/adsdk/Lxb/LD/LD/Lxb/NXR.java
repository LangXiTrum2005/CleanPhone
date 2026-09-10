package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NXR extends kqm {
    public NXR() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.MULTI);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.ebl.Lxb((Number) objLxb2, (Number) objLxb);
    }
}
