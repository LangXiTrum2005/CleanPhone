package com.bytedance.adsdk.qdl;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class jpc implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
    public Boolean qdl(JSONObject jSONObject, Object[] objArr) {
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
