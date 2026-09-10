package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.va, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0623va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0506p0 f30847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f30849c;

    public AbstractC0623va(C0506p0 adTools) {
        kotlin.jvm.internal.n.f(adTools, "adTools");
        this.f30847a = adTools;
        this.f30848b = "";
    }

    public final C0506p0 a() {
        return this.f30847a;
    }

    public final String b() {
        return this.f30848b;
    }

    public final boolean c() {
        return this.f30849c;
    }

    public abstract boolean d();

    public final void a(String str) {
        kotlin.jvm.internal.n.f(str, "<set-?>");
        this.f30848b = str;
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.n.f(callback, "callback");
        this.f30847a.d(callback);
    }

    public final void a(boolean z10) {
        this.f30849c = z10;
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        this.f30847a.c(runnable);
    }

    public final void a(C0363h0 adProperties) {
        kotlin.jvm.internal.n.f(adProperties, "adProperties");
        this.f30847a.d().a(new D0(this.f30847a, adProperties, null, 4, null));
    }
}
