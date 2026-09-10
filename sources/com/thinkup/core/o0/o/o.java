package com.thinkup.core.o0.o;

import android.support.v4.media.a;
import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final int m = 4;
    public static final int o = 10;
    private String m0;
    private long mm;
    private String mn;
    private double mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42448n;
    private int n0;
    private String o0;
    private int om;
    private String on;
    private String oo;

    public final String m() {
        return this.oo;
    }

    public final String m0() {
        return this.mn;
    }

    public final String mm() {
        return this.o0;
    }

    public final int mn() {
        return this.f42448n;
    }

    public final JSONObject mo() {
        JSONObject jSONObject = new JSONObject();
        try {
            o(jSONObject, "req_id", this.oo);
            o(jSONObject, "unit_id", this.on);
            o(jSONObject, "dsp_id", this.m0);
            o(jSONObject, "ecpm", Double.valueOf(this.mo));
            o(jSONObject, "ts", Long.valueOf(this.mm));
            o(jSONObject, "lc_id", this.mn);
            o(jSONObject, "nw_firm_id", Integer.valueOf(this.om));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final int n() {
        return this.om;
    }

    public final int o() {
        return this.n0;
    }

    public final String o0() {
        return this.on;
    }

    public final double om() {
        return this.mo;
    }

    public final long on() {
        return this.mm;
    }

    public final String oo() {
        return this.m0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementStatisticsBean{requestId='");
        sb.append(this.oo);
        sb.append("', networkFirmId=");
        sb.append(this.om);
        sb.append(", adSourceId='");
        sb.append(this.on);
        sb.append("', dspId='");
        sb.append(this.m0);
        sb.append("', price=");
        sb.append(this.mo);
        sb.append(", recordTime=");
        sb.append(this.mm);
        sb.append(", psId='");
        sb.append(this.mn);
        sb.append("', placementId='");
        sb.append(this.o0);
        sb.append("', type= ");
        sb.append(this.f42448n);
        sb.append("', segmentId= ");
        return a.p(sb, this.n0, AbstractJsonLexerKt.END_OBJ);
    }

    public final void m(int i2) {
        this.om = i2;
    }

    public final void n(String str) {
        this.m0 = str;
    }

    public final void o(int i2) {
        this.n0 = i2;
    }

    public final void o0(String str) {
        this.mn = str;
    }

    public final void oo(String str) {
        this.o0 = str;
    }

    public final void m(String str) {
        this.on = str;
    }

    public final void n(int i2) {
        this.f42448n = i2;
    }

    public final void o(String str) {
        this.oo = str;
    }

    public final void o(double d) {
        this.mo = d;
    }

    public final void o(long j) {
        this.mm = j;
    }

    private static void o(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj == null || TextUtils.isEmpty(str)) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
            return;
        }
        if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
            return;
        }
        if ((obj instanceof Double) && ((Double) obj).doubleValue() == 0.0d) {
            return;
        }
        if (str.equals("ecpm")) {
            jSONObject.put(str, String.valueOf(obj));
        } else {
            jSONObject.put(str, obj);
        }
    }
}
