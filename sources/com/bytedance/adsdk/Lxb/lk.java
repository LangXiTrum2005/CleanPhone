package com.bytedance.adsdk.Lxb;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lk implements JXs {
    @Override // com.bytedance.adsdk.Lxb.JXs
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public String Lxb(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 3) {
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
            return jSONObject2.optString(strValueOf2, String.valueOf(objArr[2]));
        } catch (JSONException unused) {
            return null;
        }
    }
}
