package com.thinkup.core.oo;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mm {
    private static String nm = "ofm_tk_sw";
    private static String nn = "ofm_da_sw";
    private static String no = "ofm_logger";
    private static String o00 = "tk_address";
    private static String o0m = "tk_interval";
    private static String o0n = "da_rt_keys_ft";
    private static String o0o = "tk_max_amount";
    private static String om0 = "ofm_firm_info";
    private static String omo = "ofm_st_vt";
    private static String oo0 = "tk_no_t_ft";
    private static String oom = "ofm_system";
    private static String oon = "ofm_tid";
    private static String ooo = "da_not_keys_ft";
    public Map<String, Object> m;
    private int m0;
    private int mm;
    private long mn;
    private String mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f42454n;
    private Map<String, String> n0;
    String o = String.valueOf(hashCode());
    private int o0;
    private long om;
    private int on;
    private int oo;

    private Map<String, Object> m(String str) {
        try {
            Map<String, Object> map = this.m;
            if (map != null) {
                return com.thinkup.core.common.ooo.o00.n(map.get(str).toString());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private long m0() {
        return this.mn;
    }

    private String mm() {
        return this.o;
    }

    private boolean mn() {
        return this.f42454n;
    }

    private Map<String, String> mo() {
        return this.n0;
    }

    private int n() {
        return this.oo;
    }

    private int o0() {
        return this.on;
    }

    private String om() {
        return this.mo;
    }

    private int on() {
        return this.mm;
    }

    private int oo() {
        return this.m0;
    }

    public final long o() {
        return this.om;
    }

    private static mm n(String str) {
        try {
            mm mmVar = new mm();
            JSONObject jSONObject = new JSONObject(str);
            mmVar.f42454n = true;
            mmVar.o0 = jSONObject.optInt(oom);
            mmVar.m = com.thinkup.core.common.ooo.o00.n(jSONObject.optString(om0));
            mmVar.on = 1;
            mmVar.m0 = 1;
            return mmVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static mm o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            mm mmVar = new mm();
            JSONObject jSONObject = new JSONObject(str);
            mmVar.o0 = jSONObject.optInt(oom);
            mmVar.oo = jSONObject.optInt(oon);
            mmVar.om = jSONObject.optLong(omo);
            mmVar.m = com.thinkup.core.common.ooo.o00.n(jSONObject.optString(om0));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(no);
            if (jSONObjectOptJSONObject != null) {
                mmVar.on = jSONObjectOptJSONObject.optInt(nm);
                mmVar.m0 = jSONObjectOptJSONObject.optInt(nn);
                mmVar.mo = jSONObjectOptJSONObject.optString(o00);
                mmVar.mm = jSONObjectOptJSONObject.optInt(o0o);
                mmVar.mn = jSONObjectOptJSONObject.optLong(o0m);
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString(oo0));
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.optString(next));
                    }
                    mmVar.n0 = map;
                } catch (Throwable unused) {
                }
            }
            return mmVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private int m() {
        return this.o0;
    }
}
