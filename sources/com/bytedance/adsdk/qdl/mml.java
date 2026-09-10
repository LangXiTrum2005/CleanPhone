package com.bytedance.adsdk.qdl;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class mml implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    public Object qdl(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        if (TextUtils.isEmpty(strValueOf)) {
            return null;
        }
        return Uri.encode(strValueOf);
    }
}
