package com.bytedance.adsdk.ri.lr.lr.ri;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bgr extends bu {
    public bgr() {
        super(com.bytedance.adsdk.ri.lr.ka.ik.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi = this.ri.ri(map);
        Object objRi2 = this.lr.ri(map);
        if (objRi == null && objRi2 == null) {
            return Boolean.FALSE;
        }
        if (objRi == null && objRi2 != null) {
            return Boolean.TRUE;
        }
        if (objRi == null || objRi2 != null) {
            return ((objRi instanceof Number) && (objRi2 instanceof Number)) ? Boolean.valueOf(!com.bytedance.adsdk.ri.lr.fi.ri.lr.ri((Number) objRi, (Number) objRi2)) : Boolean.valueOf(!objRi.equals(objRi2));
        }
        return Boolean.TRUE;
    }
}
