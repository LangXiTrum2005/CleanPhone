package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0243a6 implements InterfaceC0408ja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ye f28173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28174b;

    public C0243a6(InterfaceC0441l7 applicationLifecycleService, Ye task) {
        kotlin.jvm.internal.n.f(applicationLifecycleService, "applicationLifecycleService");
        kotlin.jvm.internal.n.f(task, "task");
        this.f28173a = task;
        applicationLifecycleService.a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.f28174b;
    }

    private final void f() {
        this.f28174b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void a() {
        this.f28173a.a(Long.valueOf(e()));
        this.f28173a.run();
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void b() {
        f();
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void c() {
    }

    @Override // com.ironsource.InterfaceC0408ja
    public void d() {
    }
}
