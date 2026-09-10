package com.thinkup.core.common.on;

import android.os.SystemClock;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class oo00 {
    private com.thinkup.core.oo.n0 m;
    private int m0;
    private long mm;
    private int mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private mmm f42251n;
    private long n0;
    private final String o = "oo00";
    private boolean o0;
    private boolean om;
    private int on;
    private long oo;

    public oo00(mmm mmmVar, com.thinkup.core.oo.n0 n0Var) {
        int i2 = mmmVar.f42198n;
        this.f42251n = mmmVar;
        this.m = n0Var;
        boolean z2 = false;
        this.o0 = (TUAdxSetting.getInstance().isAdxNetworkMode(n0Var.mo()) || n0Var.m00() != 1 || i2 == 8 || i2 == 16) ? false : true;
        this.oo = n0Var.o0m();
        if (n0Var.o00() != 1 && n0Var.m00() == 1) {
            z2 = true;
        }
        this.om = z2;
        this.on = i2 == 9 ? n0Var.nm() : n0Var.m0o();
        this.m0 = i2 == 9 ? n0Var.nn() : n0Var.o0on();
        this.mo = n0Var.n();
        this.mm = n0Var.o();
        this.mn = n0Var.m();
        this.n0 = -1L;
        toString();
    }

    private long o0m() {
        return this.mm;
    }

    private long o0n() {
        return this.mn;
    }

    private long o0o() {
        return this.m.moo();
    }

    public final boolean m() {
        return this.o0;
    }

    public final long m0() {
        return this.m.nnm();
    }

    public final int mm() {
        return this.m.omo();
    }

    public final long mn() {
        return this.m.no0();
    }

    public final long mo() {
        mmm mmmVar = this.f42251n;
        if (!mmmVar.mm) {
            return this.m.m0n();
        }
        long j = this.n0;
        if (j >= 0) {
            return j;
        }
        long jElapsedRealtime = (((long) mmmVar.m0) - (SystemClock.elapsedRealtime() - this.f42251n.mn)) - 100;
        this.n0 = jElapsedRealtime;
        if (jElapsedRealtime < 0) {
            this.n0 = 0L;
        }
        return this.n0;
    }

    public final long n() {
        return this.oo;
    }

    public final long n0() {
        return this.m.n00();
    }

    public final long nm() {
        return this.m.mmm();
    }

    public final boolean nn() {
        com.thinkup.core.oo.n0 n0Var = this.m;
        return n0Var != null && n0Var.omon() == 1;
    }

    public final long no() {
        return this.m.nnn();
    }

    public final com.thinkup.core.oo.n0 o() {
        return this.m;
    }

    public final boolean o0() {
        return this.om;
    }

    public final int o00() {
        return this.mo;
    }

    public final int om() {
        return this.m0;
    }

    public final int on() {
        return this.m.oo0n();
    }

    public final int oo() {
        return this.on;
    }

    public final String toString() {
        return "WaterfallSetting{canLoadFailRetry=" + this.o0 + ", loadFailRetryDelayTime=" + this.oo + ", cannBiddingFailRetry=" + this.om + ", requestType=" + this.on + ", requestNum=" + this.m0 + ", cacheNum:" + this.m.oo0n() + AbstractJsonLexerKt.END_OBJ;
    }
}
