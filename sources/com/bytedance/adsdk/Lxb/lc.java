package com.bytedance.adsdk.Lxb;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class lc implements JXs {
    @Override // com.bytedance.adsdk.Lxb.JXs
    public Object Lxb(JSONObject jSONObject, Object[] objArr) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (objArr == null || objArr.length != 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[2]);
        String strValueOf2 = String.valueOf(objArr[1]);
        String strValueOf3 = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf3) || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) == null) {
            return strValueOf;
        }
        String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
        return TextUtils.isEmpty(strOptString) ? strValueOf : strOptString;
    }
}
