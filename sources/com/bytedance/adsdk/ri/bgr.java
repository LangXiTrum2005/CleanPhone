package com.bytedance.adsdk.ri;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bgr implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public String ri(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Number) {
            return obj.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        return null;
    }
}
