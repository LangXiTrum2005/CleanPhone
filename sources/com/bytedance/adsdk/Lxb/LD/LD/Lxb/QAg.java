package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class QAg extends kqm {
    public QAg() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.LT);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb;
        Object objLxb2 = this.Lxb.Lxb(map);
        if (objLxb2 == null || (objLxb = this.LD.Lxb(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.Lxb.LD.JXs.Lxb.ZU.Lxb(objLxb2, (Number) objLxb);
    }
}
