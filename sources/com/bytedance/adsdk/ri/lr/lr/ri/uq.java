package com.bytedance.adsdk.ri.lr.lr.ri;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uq implements com.bytedance.adsdk.ri.lr.lr.ri {
    private final String ri;

    public uq(String str) {
        this.ri = str;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public String lr() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public Object ri(Map<String, JSONObject> map) {
        Object objRi;
        if (map == null || map.size() <= 0 || (objRi = ri(this.ri, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objRi;
    }

    public String toString() {
        return "VariableNode [literals=" + this.ri + X3.j.e;
    }

    @Override // com.bytedance.adsdk.ri.lr.lr.ri
    public com.bytedance.adsdk.ri.lr.ka.fi ri() {
        return com.bytedance.adsdk.ri.lr.ka.di.VARIABLE;
    }

    public Object ri(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ri(str.split("\\."), 0, jSONObject);
    }

    private Object ri(String[] strArr, int i, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int iIndexOf = str.indexOf(X3.j.d);
            int iIndexOf2 = str.indexOf(X3.j.e);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i2 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i2) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return ri(strArr, i + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return ri(strArr, i + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
