package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class co extends bu {
    public co() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.MOD);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi;
        Object objRi2 = this.ri.ri(map);
        if (objRi2 == null || (objRi = this.lr.ri(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.ri.lr.fi.ri.di.ri((Number) objRi2, (Number) objRi);
    }
}
