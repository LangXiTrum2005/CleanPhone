package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f5 f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxError f7794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f7796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7797h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(e5 e5Var);
    }

    private e5(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(f5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (f5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new e5(f5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f7796g;
    }

    public MaxError c() {
        return this.f7794e;
    }

    public String d() {
        return this.f7791b;
    }

    public String e() {
        return this.f7793d;
    }

    public f5 f() {
        return this.f7790a;
    }

    public boolean g() {
        return this.f7797h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f7790a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f7791b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f7792c);
        sb2.append("', mSignalDataLength='");
        String str = this.f7793d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append("', mErrorMessage=");
        MaxError maxError = this.f7794e;
        return wi.d.k(sb2, maxError != null ? maxError.getMessage() : "", '}');
    }

    private e5(f5 f5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f7790a = f5Var;
        this.f7793d = str;
        this.f7794e = maxError;
        this.f7795f = j10;
        this.f7796g = j11;
        this.f7791b = str2;
        this.f7792c = str3;
        this.f7797h = z10;
    }

    public static e5 a(f5 f5Var, MaxError maxError) {
        return a(f5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static e5 a(f5 f5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (f5Var != null) {
            return new e5(f5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static e5 a(e5 e5Var) {
        return new e5(e5Var.f(), e5Var.e(), e5Var.c(), e5Var.f7795f, e5Var.f7796g, e5Var.d(), e5Var.a(), true);
    }

    public String a() {
        return this.f7792c;
    }
}
