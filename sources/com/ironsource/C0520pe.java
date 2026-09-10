package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0520pe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30014c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30015d = 2070;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30016e = 2080;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30017f = 2090;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30018g = 2100;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f30019h = 2110;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30021b;

    /* JADX INFO: renamed from: com.ironsource.pe$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C0520pe(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        this.f30020a = i10;
        this.f30021b = errorMessage;
    }

    public final int a() {
        return this.f30020a;
    }

    public final String b() {
        return this.f30021b;
    }

    public final int c() {
        return this.f30020a;
    }

    public final String d() {
        return this.f30021b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0520pe)) {
            return false;
        }
        C0520pe c0520pe = (C0520pe) obj;
        return this.f30020a == c0520pe.f30020a && kotlin.jvm.internal.n.a(this.f30021b, c0520pe.f30021b);
    }

    public int hashCode() {
        return this.f30021b.hashCode() + (Integer.hashCode(this.f30020a) * 31);
    }

    public String toString() {
        return "SdkError(errorCode=" + this.f30020a + ", errorMessage=" + this.f30021b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0520pe(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        int errorCode = error.getErrorCode();
        String errorMessage = error.getErrorMessage();
        kotlin.jvm.internal.n.e(errorMessage, "error.errorMessage");
        this(errorCode, errorMessage);
    }

    public final C0520pe a(int i10, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        return new C0520pe(i10, errorMessage);
    }

    public static /* synthetic */ C0520pe a(C0520pe c0520pe, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c0520pe.f30020a;
        }
        if ((i11 & 2) != 0) {
            str = c0520pe.f30021b;
        }
        return c0520pe.a(i10, str);
    }
}
