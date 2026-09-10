package com.thinkup.core.common;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oo {
    public static final String m = "cp_event_callback_info";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42258n = "type_start_load";
    public static String o = "oo";

    private static JSONObject o(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.thinkup.core.oo.n0.o.mnm, str);
                jSONObject.put("request_id", str2);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static void o(Object obj, String str, String str2, String str3, String str4) {
        if (obj == null) {
            return;
        }
        obj.toString();
        try {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                JSONObject jSONObjectO = o(str3, str4);
                if (jSONObjectO != null) {
                    map.put(str, jSONObjectO);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void o(Object obj, String str, com.thinkup.core.common.on.n0 n0Var) {
        if (n0Var == null) {
            return;
        }
        o(obj, str, n0Var.oomn(), n0Var.ooo0(), n0Var.oon0());
    }

    public static void o(Map<String, Object> map, String str, String str2, String str3, String str4) {
        if (map == null) {
            return;
        }
        o(map.get(m), str, str2, str3, str4);
    }
}
