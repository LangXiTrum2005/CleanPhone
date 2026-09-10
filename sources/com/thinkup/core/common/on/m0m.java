package com.thinkup.core.common.on;

import androidx.media3.extractor.text.ttml.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m0m {
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f42192n;
    private String o;
    private long o0;

    private m0m() {
    }

    public static m0m o(String str, int i2) {
        m0m m0mVar = new m0m();
        m0mVar.o = str;
        m0mVar.m = i2;
        return m0mVar;
    }

    public final long m() {
        return this.f42192n;
    }

    public final String n() {
        String str = this.o;
        return str == null ? "" : str;
    }

    public final int o0() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynWFAdSourceFilterEntity{adSourceId='");
        sb.append(this.o);
        sb.append("', filterReason=");
        sb.append(this.m);
        sb.append(", reqLimitIntervalTime=");
        sb.append(this.f42192n);
        sb.append(", reqLimitEndTime=");
        return a.o(sb, this.o0, AbstractJsonLexerKt.END_OBJ);
    }

    public final void o(long j) {
        this.f42192n = j;
        if (j > 0) {
            this.o0 = System.currentTimeMillis() + j;
        }
    }

    public final long o() {
        return this.o0;
    }
}
