package com.bytedance.adsdk.ri;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public Boolean ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return Boolean.FALSE;
        }
        try {
            Double.parseDouble(String.valueOf(objArr[0]));
            return Boolean.TRUE;
        } catch (NumberFormatException unused) {
            return Boolean.FALSE;
        }
    }
}
