package com.bytedance.sdk.openadsdk.rq.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.mrf;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class jl extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private ljh ud;

    public jl(ljh ljhVar) {
        this.ud = ljhVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, ljh ljhVar) {
        bjyVar.qdl(qdl, new jl(ljhVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        String strYot;
        ljh ljhVar = this.ud;
        if (ljhVar == null || (strYot = ljhVar.yot()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getStorageItem":
                String strOptString = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString) && mrf.qdl().ud(strYot, strOptString)) {
                    jSONObject2.put("value", mrf.qdl().qdl(strYot, strOptString));
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case "removeAllStorage":
                mrf.qdl().qdl(strYot);
                jSONObject2.put("code", "0");
                return jSONObject2;
            case "setStorageItem":
                String strOptString2 = jSONObject.optString("key");
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    mrf.qdl().qdl(strYot, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case "removeStorageItem":
                String strOptString4 = jSONObject.optString("key");
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", mrf.qdl().lnr(strYot, strOptString4) ? "0" : "1");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
