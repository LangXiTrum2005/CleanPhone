package com.thinkup.core.common.on;

import com.thinkup.core.api.TUAdMixBidInfo;
import com.thinkup.core.mg.api.MgComparedResult;
import com.thinkup.core.mg.api.MgPreLoadAdRequest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mnn {
    o0mm m;
    private int m0;
    private String mm;
    private String mn;
    private double mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    TUAdMixBidInfo.BidEntity f42202n;
    private Double n0;
    private double nm;
    private String nn;
    private int no;
    double o;
    private int o0;
    private boolean o00;
    private int o0m;
    private int o0n;
    private String o0o;
    private boolean om;
    private String om0;
    private String on;
    private n0 oo;
    private int oo0;
    private double oom;
    private double oon;
    private double ooo;

    public mnn(int i2, o0mm o0mmVar, n0 n0Var) {
        this.n0 = null;
        this.o0m = 1;
        this.o0 = i2;
        this.m = o0mmVar;
        this.om = o0mmVar.o0on();
        if (n0Var != null) {
            n0 n0VarNmm = n0Var.nmm();
            this.oo = n0VarNmm;
            com.thinkup.core.common.ooo.m0m.o(n0VarNmm, o0mmVar, 0, false);
        }
        this.on = "0";
        int iOm0 = o0mmVar.om0();
        if (iOm0 == 2) {
            this.on = "2";
        } else if (iOm0 == 5 || iOm0 == 6) {
            this.on = "3";
        } else {
            this.on = "1";
        }
        this.m0 = o0mmVar.oon0();
        if (o0mmVar.nm() == 8) {
            try {
                this.o0o = o0mmVar.o0n().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.o0m = o0mmVar.m00o();
    }

    private String mom() {
        n0 n0Var = this.oo;
        return n0Var != null ? String.valueOf(n0Var.oomo()) : "";
    }

    private String moo() {
        n0 n0Var = this.oo;
        return n0Var != null ? String.valueOf(n0Var.no0()) : "";
    }

    public final int m() {
        return this.o0n;
    }

    public final int m0() {
        return this.o0;
    }

    public final MgComparedResult m00() {
        n0 n0Var = this.oo;
        MgPreLoadAdRequest preLoadInfo = (n0Var == null || n0Var.o() == null) ? null : n0Var.o().getPreLoadInfo();
        if (preLoadInfo != null) {
            return preLoadInfo.getMgComparedResult();
        }
        return null;
    }

    public final double m0m() {
        return this.oom;
    }

    public final double m0n() {
        return this.oon;
    }

    public final double m0o() {
        return this.ooo;
    }

    public final String mm() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.oomn() : "";
    }

    public final int mn() {
        n0 n0Var = this.oo;
        if (n0Var != null) {
            return n0Var.n0n();
        }
        return 0;
    }

    public final String mo() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.oon0() : "";
    }

    public final String mo0() {
        return this.om0;
    }

    public final double n() {
        return this.mo;
    }

    public final String n0() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.mon() : "";
    }

    public final String nm() {
        n0 n0Var = this.oo;
        if (n0Var != null) {
            return n0Var.oono();
        }
        return null;
    }

    public final String nn() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.ooo0() : "";
    }

    public final String no() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.oomm() : "";
    }

    public final TUAdMixBidInfo.BidEntity o() {
        return this.f42202n;
    }

    public final String o0() {
        return this.mm;
    }

    public final String o00() {
        n0 n0Var = this.oo;
        return n0Var != null ? n0Var.oooo() : "";
    }

    public final int o0m() {
        n0 n0Var = this.oo;
        if (n0Var != null) {
            return n0Var.mn();
        }
        return 0;
    }

    public final String o0n() {
        return this.on;
    }

    public final JSONObject o0o() {
        n0 n0Var = this.oo;
        if (n0Var != null) {
            return n0Var.oo00();
        }
        return null;
    }

    public final boolean om() {
        return this.om;
    }

    public final double om0() {
        return this.nm;
    }

    public final n0 omm() {
        return this.oo;
    }

    public final o0mm omn() {
        return this.m;
    }

    public final String omo() {
        return this.nn;
    }

    public final double on() {
        return this.o;
    }

    public final String on0() {
        return this.o00 ? "1" : "0";
    }

    public final int onm() {
        return this.o0m;
    }

    public final int onn() {
        return this.oo0;
    }

    public final String ono() {
        return this.o0o;
    }

    public final String oo() {
        return this.mn;
    }

    public final int oo0() {
        return this.m0;
    }

    public final Double oom() {
        return this.n0;
    }

    public final int oon() {
        return this.no;
    }

    public final boolean ooo() {
        return this.m0 == 1;
    }

    private void o0(int i2) {
        this.o0m = i2;
    }

    public final void m(int i2) {
        this.no = i2;
    }

    public final void n(int i2) {
        this.oo0 = i2;
    }

    public final void o(TUAdMixBidInfo.BidEntity bidEntity) {
        this.f42202n = bidEntity;
    }

    public final void m(double d) {
        this.ooo = d;
    }

    public final void n(double d) {
        this.oom = d;
    }

    public final void o(int i2) {
        this.o0n = i2;
    }

    public final void o0(double d) {
        this.oon = d;
    }

    public final void m(String str) {
        this.om0 = str;
    }

    public final void o(double d, String str, String str2) {
        this.mo = d;
        this.mm = str;
        this.mn = str2;
    }

    private void o(o0mm o0mmVar) {
        this.on = "0";
        if (o0mmVar == null) {
            return;
        }
        int iOm0 = o0mmVar.om0();
        if (iOm0 == 2) {
            this.on = "2";
        } else if (iOm0 != 5 && iOm0 != 6) {
            this.on = "1";
        } else {
            this.on = "3";
        }
        this.m0 = o0mmVar.oon0();
        if (o0mmVar.nm() == 8) {
            try {
                this.o0o = o0mmVar.o0n().get("unit_id").toString();
            } catch (Throwable unused) {
            }
        }
        this.o0m = o0mmVar.m00o();
    }

    public final void o(Double d) {
        this.n0 = d;
    }

    public final void o(double d) {
        this.nm = d;
    }

    public mnn(int i2, o0mm o0mmVar, n0 n0Var, double d) {
        this(i2, o0mmVar, n0Var);
        this.o = d;
    }

    public final void o(String str) {
        this.nn = str;
    }

    public final void o(boolean z2) {
        this.o00 = z2;
    }
}
