package com.thinkup.core.common.on;

import androidx.media3.extractor.text.ttml.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class mm {
    private static final int o = 10;
    private int m;
    private long m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42195n;
    private int o0;
    private int om;
    private int on;
    private long oo;

    public interface o {
        public static final int m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42196n = 3;
        public static final int o = 1;
    }

    private mm() {
    }

    public static mm o(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        long jOptLong = jSONObject.optLong("req_pacing");
        if (jOptLong <= 0) {
            return null;
        }
        mm mmVar = new mm();
        int iOptInt = jSONObject.optInt("id");
        if (iOptInt == 1) {
            mmVar.f42195n = jSONObject.optInt("req_no_fill_nc");
        } else if (iOptInt == 2) {
            mmVar.o0 = jSONObject.optInt("req_no_fill_s");
            mmVar.oo = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (iOptInt != 3) {
                return null;
            }
            mmVar.om = jSONObject.optInt("req_no_fill_sr");
            mmVar.oo = jSONObject.optLong("req_no_fill_sgt");
            mmVar.on = jSONObject.optInt(com.thinkup.core.common.oo.o.C0684o.nm, 10);
        }
        mmVar.m = iOptInt;
        mmVar.m0 = jOptLong;
        if (mmVar.f42195n > 0 || mmVar.o0 > 0 || mmVar.oo > 0 || mmVar.om > 0 || jOptLong > 0) {
            return mmVar;
        }
        return null;
    }

    public final int m() {
        return this.f42195n;
    }

    public final int n() {
        return this.o0;
    }

    public final long o0() {
        return this.oo;
    }

    public final long om() {
        return this.m0;
    }

    public final int on() {
        return this.on;
    }

    public final int oo() {
        return this.om;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSourceFltRuleEntity{id=");
        sb.append(this.m);
        sb.append(", reqNoFillNc=");
        sb.append(this.f42195n);
        sb.append(", reqNoFillS=");
        sb.append(this.o0);
        sb.append(", reqNoFillSgtTime=");
        sb.append(this.oo);
        sb.append(", reqNoFillSr=");
        sb.append(this.om);
        sb.append(", reqPacingTime=");
        return a.o(sb, this.m0, AbstractJsonLexerKt.END_OBJ);
    }

    private void m(int i2) {
        this.f42195n = i2;
    }

    private void n(int i2) {
        this.o0 = i2;
    }

    private void o0(int i2) {
        this.om = i2;
    }

    private void oo(int i2) {
        this.on = i2;
    }

    private void m(long j) {
        this.m0 = j;
    }

    public final int o() {
        return this.m;
    }

    private void o(int i2) {
        this.m = i2;
    }

    private void o(long j) {
        this.oo = j;
    }
}
