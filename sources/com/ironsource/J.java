package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0541r0.a f26314a;

    public J(C0541r0.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        this.f26314a = performance;
    }

    public final C0541r0.a a() {
        return this.f26314a;
    }

    public final C0541r0.a b() {
        return this.f26314a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f26314a == ((J) obj).f26314a;
    }

    public int hashCode() {
        return this.f26314a.hashCode();
    }

    public String toString() {
        return "AdInstancePerformance(performance=" + this.f26314a + ")";
    }

    public final J a(C0541r0.a performance) {
        kotlin.jvm.internal.n.f(performance, "performance");
        return new J(performance);
    }

    public final void b(C0541r0.a aVar) {
        kotlin.jvm.internal.n.f(aVar, "<set-?>");
        this.f26314a = aVar;
    }

    public static /* synthetic */ J a(J j10, C0541r0.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = j10.f26314a;
        }
        return j10.a(aVar);
    }
}
