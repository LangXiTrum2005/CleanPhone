package com.bytedance.adsdk.ri;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public String ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strValueOf);
            String strValueOf2 = String.valueOf(objArr[1]);
            if (TextUtils.isEmpty(strValueOf2)) {
                return null;
            }
            Object objRi = com.bytedance.adsdk.ri.lr.ri.ri(strValueOf2).ri(jSONObject2);
            if (!TextUtils.isEmpty(String.valueOf(objRi))) {
                return String.valueOf(objRi);
            }
            if (objArr.length >= 3) {
                return String.valueOf(objArr[2]);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }
}
