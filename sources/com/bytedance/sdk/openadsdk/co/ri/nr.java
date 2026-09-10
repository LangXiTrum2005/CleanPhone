package com.bytedance.sdk.openadsdk.co.ri;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.qd;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class nr extends com.bytedance.sdk.component.ri.nr<JSONObject, JSONObject> {
    public static final HashSet<String> ri = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));
    private wjv lr;

    public nr(wjv wjvVar) {
        this.lr = wjvVar;
    }

    public static void ri(com.bytedance.sdk.component.ri.vr vrVar, wjv wjvVar) {
        vrVar.ri(ri, new nr(wjvVar));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.sdk.component.ri.ka
    public JSONObject ri(String str, JSONObject jSONObject, com.bytedance.sdk.component.ri.fi fiVar) throws Exception {
        String strPnk;
        wjv wjvVar = this.lr;
        if (wjvVar == null || (strPnk = wjvVar.pnk()) == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1166163208:
                if (str.equals("getStorageItem")) {
                    b = 0;
                }
                break;
            case 541948222:
                if (str.equals("removeAllStorage")) {
                    b = 1;
                }
                break;
            case 1357067884:
                if (str.equals("setStorageItem")) {
                    b = 2;
                }
                break;
            case 1498706186:
                if (str.equals("removeStorageItem")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
                String strOptString = jSONObject.optString(X3.i.W);
                if (!TextUtils.isEmpty(strOptString) && qd.ri().lr(strPnk, strOptString)) {
                    jSONObject2.put("value", qd.ri().ri(strPnk, strOptString));
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case 1:
                qd.ri().ri(strPnk);
                jSONObject2.put("code", "0");
                return jSONObject2;
            case 2:
                String strOptString2 = jSONObject.optString(X3.i.W);
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    qd.ri().ri(strPnk, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            case 3:
                String strOptString4 = jSONObject.optString(X3.i.W);
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", qd.ri().ik(strPnk, strOptString4) ? "0" : "1");
                    return jSONObject2;
                }
                jSONObject2.put("code", "1");
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
