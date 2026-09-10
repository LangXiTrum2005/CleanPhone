package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends bu {
    public fi() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.GT_EQ);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi;
        Object objRi2 = this.ri.ri(map);
        if (objRi2 == null || (objRi = this.lr.ri(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.ri.lr.fi.ri.ka.ri(objRi2, (Number) objRi)).booleanValue());
    }
}
