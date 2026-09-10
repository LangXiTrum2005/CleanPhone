package com.bytedance.adsdk.ri;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr implements jbs {
    @Override // com.bytedance.adsdk.ri.jbs
    public Object ri(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        return Uri.decode(strValueOf);
    }
}
