package com.thinkup.core.common.on;

import com.thinkup.core.mg.api.MgComparedResult;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class oo0m {
    private n0 m;
    private String m0;
    private double mm;
    private double mn;
    private double mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0mm f42252n;
    private double n0;
    private Double nm = null;
    private String nn = null;
    private int no;
    int o;
    private String o0;
    private Double o00;
    private int o0m;
    private boolean o0n;
    private Double o0o;
    private String om;
    private String on;
    private String oo;
    private double oo0;

    private String m00() {
        n0 n0Var = this.m;
        return n0Var != null ? String.valueOf(n0Var.oomo()) : "";
    }

    private String m0m() {
        n0 n0Var = this.m;
        return n0Var != null ? n0Var.oomm() : "";
    }

    private String m0o() {
        n0 n0Var = this.m;
        return n0Var != null ? n0Var.oomn() : "";
    }

    private String onm() {
        n0 n0Var = this.m;
        return n0Var != null ? n0Var.oon0() : "";
    }

    private String onn() {
        n0 n0Var = this.m;
        return n0Var != null ? String.valueOf(n0Var.no0()) : "";
    }

    public final String m() {
        return this.nn;
    }

    public final String m0() {
        return this.on;
    }

    public final String mm() {
        return this.m0;
    }

    public final int mn() {
        n0 n0Var = this.m;
        if (n0Var != null) {
            return n0Var.n0n();
        }
        return 0;
    }

    public final String mo() {
        n0 n0Var = this.m;
        return n0Var != null ? n0Var.nn() : "";
    }

    public final Double n() {
        return this.o00;
    }

    public final String n0() {
        n0 n0Var = this.m;
        return n0Var != null ? n0Var.mon() : "";
    }

    public final JSONObject nm() {
        n0 n0Var = this.m;
        if (n0Var != null) {
            return n0Var.oo00();
        }
        return null;
    }

    public final double nn() {
        return this.mo;
    }

    public final String no() {
        n0 n0Var = this.m;
        if (n0Var != null) {
            return n0Var.oono();
        }
        return null;
    }

    public final void o(Double d, String str) {
        this.nm = d;
        this.nn = str;
    }

    public final int o0() {
        return this.o;
    }

    public final double o00() {
        return this.mm;
    }

    public final double o0m() {
        return this.mn;
    }

    public final void o0n() {
        this.mn = 0.0d;
    }

    public final double o0o() {
        return this.oo0;
    }

    public final String om() {
        return this.oo;
    }

    public final int om0() {
        return this.o0m;
    }

    public final o0mm omm() {
        return this.f42252n;
    }

    public final int omn() {
        n0 n0Var = this.m;
        if (n0Var != null) {
            return n0Var.mn();
        }
        return 0;
    }

    public final n0 omo() {
        return this.m;
    }

    public final String on() {
        return this.om;
    }

    public final String on0() {
        return this.o0n ? "1" : "0";
    }

    public final MgComparedResult ono() {
        n0 n0Var = this.m;
        MgPreLoadAdRequest preLoadInfo = (n0Var == null || n0Var.o() == null) ? null : n0Var.o().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final String oo() {
        return this.o0;
    }

    public final double oo0() {
        return this.n0;
    }

    public final boolean oom() {
        return this.no == 1;
    }

    public final Double oon() {
        return this.o0o;
    }

    public final int ooo() {
        return this.no;
    }

    public final void m(double d) {
        this.mm = d;
    }

    public final void n(double d) {
        this.oo0 = d;
    }

    public final void o0(double d) {
        this.n0 = d;
    }

    public final void m(String str) {
        this.on = str;
    }

    public final Double o() {
        return this.nm;
    }

    public final void m(Double d) {
        this.o0o = d;
    }

    public final void o(n0 n0Var) {
        this.m = n0Var;
    }

    public final void o(Double d) {
        this.o00 = d;
    }

    public final void o(o0mm o0mmVar) {
        this.m0 = "0";
        if (o0mmVar == null) {
            return;
        }
        this.f42252n = o0mmVar;
        int iOm0 = o0mmVar.om0();
        if (iOm0 == 2) {
            this.m0 = "2";
        } else if (iOm0 != 5 && iOm0 != 6) {
            this.m0 = "1";
        } else {
            this.m0 = "3";
        }
        this.no = o0mmVar.oomn();
    }

    public final void o(Map<String, Object> map) {
        this.o0 = o(map, "offer_id");
        this.oo = o(map, "dsp_id");
        if (map != null) {
            Object obj = map.get("ws_imp_switch");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                if (num.intValue() != 0) {
                    this.o = num.intValue();
                }
            }
        }
    }

    private static String o(Map<String, Object> map, String str) {
        if (map != null) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return obj.toString();
            }
            if (obj != null) {
                return obj.toString();
            }
            return "";
        }
        return "";
    }

    public final void o(double d) {
        this.mo = d;
    }

    public final void o(String str) {
        this.om = str;
    }

    public final void o(int i2) {
        this.o0m = i2;
    }

    public final void o(boolean z2) {
        this.o0n = z2;
    }
}
