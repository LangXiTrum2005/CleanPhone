package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class J4 extends Vg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Vc f26335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pg f26336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J4(V0 adTools, Vc outcomeReporter, Pg waterfallInstances) {
        super(adTools, outcomeReporter);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(outcomeReporter, "outcomeReporter");
        kotlin.jvm.internal.n.f(waterfallInstances, "waterfallInstances");
        this.f26335d = outcomeReporter;
        this.f26336e = waterfallInstances;
    }

    @Override // com.ironsource.Vg
    public void a() {
    }

    @Override // com.ironsource.Vg
    public void b(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f26335d.a(this.f26336e.b(), instance);
    }

    @Override // com.ironsource.Vg
    public void c(B instanceToShow) {
        kotlin.jvm.internal.n.f(instanceToShow, "instanceToShow");
    }

    @Override // com.ironsource.Vg
    public void a(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
    }
}
