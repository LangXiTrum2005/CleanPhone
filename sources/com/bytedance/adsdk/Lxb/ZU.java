package com.bytedance.adsdk.Lxb;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ZU implements JXs {
    @Override // com.bytedance.adsdk.Lxb.JXs
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public Boolean Lxb(JSONObject jSONObject, Object[] objArr) {
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
