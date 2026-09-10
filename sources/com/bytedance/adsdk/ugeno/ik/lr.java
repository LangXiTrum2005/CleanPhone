package com.bytedance.adsdk.ugeno.ik;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fi;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    public static String ri(String str, JSONObject jSONObject) {
        ri riVarIk;
        ri.InterfaceC0189ri interfaceC0189riRi;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (riVarIk = fi.ri().ik()) != null && (interfaceC0189riRi = riVarIk.ri(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0189riRi.ri(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
