package com.bytedance.adsdk.ugeno.lk;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.ZU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class LD {
    public static String Lxb(String str, JSONObject jSONObject) {
        Lxb lxbLk;
        Lxb.InterfaceC0041Lxb interfaceC0041LxbLxb;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                return (!str.startsWith("${") || !str.endsWith("}") || (lxbLk = ZU.Lxb().lk()) == null || (interfaceC0041LxbLxb = lxbLk.Lxb(str.substring(2, str.length() + (-1)))) == null) ? str : (String) interfaceC0041LxbLxb.Lxb(jSONObject);
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
