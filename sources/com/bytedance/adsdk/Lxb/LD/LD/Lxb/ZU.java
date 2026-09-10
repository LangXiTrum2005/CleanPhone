package com.bytedance.adsdk.Lxb.LD.LD.Lxb;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ZU extends kqm {
    public ZU() {
        super(com.bytedance.adsdk.Lxb.LD.ZU.lk.EQ);
    }

    @Override // com.bytedance.adsdk.Lxb.LD.LD.Lxb
    public Object Lxb(Map<String, JSONObject> map) {
        Object objLxb = this.Lxb.Lxb(map);
        Object objLxb2 = this.LD.Lxb(map);
        if (objLxb == null && objLxb2 == null) {
            return Boolean.TRUE;
        }
        if (objLxb == null && objLxb2 != null) {
            return Boolean.FALSE;
        }
        if (objLxb == null || objLxb2 != null) {
            return ((objLxb instanceof Number) && (objLxb2 instanceof Number)) ? Boolean.valueOf(com.bytedance.adsdk.Lxb.LD.JXs.Lxb.LD.Lxb((Number) objLxb, (Number) objLxb2)) : Boolean.valueOf(objLxb.equals(objLxb2));
        }
        return Boolean.FALSE;
    }
}
