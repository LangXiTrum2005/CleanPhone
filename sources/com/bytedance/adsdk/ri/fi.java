package com.bytedance.adsdk.ri;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    public Object ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "null")) {
                    return strValueOf;
                }
            }
        }
        return null;
    }
}
