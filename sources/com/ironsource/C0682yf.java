package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.yf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0682yf extends Vg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vc f31324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pg f31325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H f31326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0682yf(V0 adTools, Vc outcomeReporter, Pg waterfallInstances, H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        kotlin.jvm.internal.n.f(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f31324d = outcomeReporter;
        this.f31325e = waterfallInstances;
        this.f31326f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Vg
    public void a(B instance) {
        B bA;
        kotlin.jvm.internal.n.f(instance, "instance");
        if (this.f31326f.a(instance)) {
            this.f31324d.a(this.f31325e.b(), instance);
        } else {
            if (!this.f31326f.a() || (bA = this.f31326f.c().a()) == null) {
                return;
            }
            this.f31324d.a(this.f31325e.b(), bA);
        }
    }

    @Override // com.ironsource.Vg
    public void b(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
    }

    @Override // com.ironsource.Vg
    public void c(B instanceToShow) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
        this.f31324d.a(this.f31325e.b(), instanceToShow);
    }

    @Override // com.ironsource.Vg
    public void a() {
        B bA = this.f31326f.c().a();
        if (bA != null) {
            this.f31324d.a(this.f31325e.b(), bA);
        }
    }
}
