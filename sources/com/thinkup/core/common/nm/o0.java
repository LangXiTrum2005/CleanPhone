package com.thinkup.core.common.nm;

import android.support.v4.media.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o0 {
    protected int m;
    protected int m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f41983n;
    protected int o;
    protected int o0;
    protected long om;
    protected long on;
    protected int oo;

    public final int m() {
        return this.m;
    }

    public final int m0() {
        return this.m0;
    }

    public final int n() {
        return this.f41983n;
    }

    public final int o() {
        return this.o;
    }

    public final int o0() {
        return this.o0;
    }

    public final long om() {
        return this.om;
    }

    public final long on() {
        return this.on;
    }

    public final int oo() {
        return this.oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerformaceEntry{totalMemory=");
        sb.append(this.o);
        sb.append(", phoneVailMemory=");
        sb.append(this.m);
        sb.append(", appJavaMemory=");
        sb.append(this.f41983n);
        sb.append(", appMaxJavaMemory=");
        sb.append(this.o0);
        sb.append(", cpuNum=");
        sb.append(this.oo);
        sb.append(", totalStorage=");
        sb.append(this.om);
        sb.append(", lastStorage=");
        sb.append(this.on);
        sb.append(", cpuRate=");
        return a.p(sb, this.m0, AbstractJsonLexerKt.END_OBJ);
    }

    private void m(int i2) {
        this.m = i2;
    }

    private void n(int i2) {
        this.f41983n = i2;
    }

    private void o(int i2) {
        this.o = i2;
    }

    private void o0(int i2) {
        this.o0 = i2;
    }

    private void om(int i2) {
        this.m0 = i2;
    }

    private void oo(int i2) {
        this.oo = i2;
    }

    private void m(long j) {
        this.on = j;
    }

    private void o(long j) {
        this.om = j;
    }
}
