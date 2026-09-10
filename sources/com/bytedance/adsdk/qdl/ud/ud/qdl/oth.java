package com.bytedance.adsdk.qdl.ud.ud.qdl;

import android.support.v4.media.a;
import android.text.TextUtils;
import com.p004ironsource.d9;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oth implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final String qdl;

    public oth(String str) {
        this.qdl = str;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl;
        if (map == null || map.size() <= 0 || (objQdl = qdl(this.qdl, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objQdl;
    }

    public String toString() {
        return a.r(new StringBuilder("VariableNode [literals="), this.qdl, d9.i.f24752e);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.VARIABLE;
    }

    public Object qdl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return qdl(str.split("\\."), 0, jSONObject);
    }

    private Object qdl(String[] strArr, int i2, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i2 < strArr.length && jSONObject != null) {
            String str = strArr[i2];
            int iIndexOf = str.indexOf(d9.i.d);
            int iIndexOf2 = str.indexOf(d9.i.f24752e);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i3 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i3) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i2 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return qdl(strArr, i2 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return qdl(strArr, i2 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
