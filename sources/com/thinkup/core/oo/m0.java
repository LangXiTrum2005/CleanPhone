package com.thinkup.core.oo;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m0 extends oo {
    public static final int m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42451n = 3;
    public static final int o = 1;
    public static final long om = 604800000;
    public static final int oo = 5;
    private o m0;
    private long mm;
    private long mn;
    private JSONObject mo;
    private int on;

    public static class m {
        public static String m = "updateTime";
        private static String m0 = "st_timeout";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static String f42452n = "rule";
        public static String o = "adap_c";
        private static String o0 = "group_st";
        private static String om = "value_times";
        private static String on = "cold_times";
        private static String oo = "num";
    }

    public static class o {
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f42453n;
        public int o;
    }

    private void o(long j) {
        this.mn = j;
    }

    private long o0() {
        return this.mn;
    }

    private long om() {
        return this.mm;
    }

    private JSONObject oo() {
        return this.mo;
    }

    public final o m() {
        return this.m0;
    }

    public final boolean n() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.mn > this.mm;
    }

    private void m(long j) {
        this.mm = j;
    }

    private void oo(JSONObject jSONObject) {
        this.mo = jSONObject;
    }

    public final int o() {
        return this.on;
    }

    private void o(int i2) {
        this.on = i2;
    }

    private void o(o oVar) {
        this.m0 = oVar;
    }

    public static m0 o(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        m0 m0Var = new m0();
        try {
            m0Var.m(jSONObject);
            m0Var.n(jSONObject);
            m0Var.o0(jSONObject);
            m0Var.on = jSONObject.optInt(m.f42452n, 1);
            String strOptString = jSONObject.optString(m.o0);
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    o oVar = new o();
                    oVar.o = jSONObject2.optInt(m.oo, 3);
                    oVar.m = jSONObject2.optInt(m.om, 3);
                    oVar.f42453n = jSONObject2.optInt(m.on, 5);
                    m0Var.m0 = oVar;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            m0Var.mo = jSONObject.optJSONObject(m.o);
            m0Var.mn = jSONObject.optLong(m.m, 0L);
            m0Var.mm = jSONObject.optLong(m.m0, om);
        } catch (Throwable unused) {
        }
        return m0Var;
    }
}
