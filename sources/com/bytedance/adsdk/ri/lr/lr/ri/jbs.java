package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends bu {
    public jbs() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.LT);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi;
        Object objRi2 = this.ri.ri(map);
        if (objRi2 == null || (objRi = this.lr.ri(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.ri.lr.fi.ri.ka.ri(objRi2, (Number) objRi);
    }
}
