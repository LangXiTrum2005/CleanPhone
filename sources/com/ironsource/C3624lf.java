package com.ironsource;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.lf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3624lf extends Cg {
    private final Qc d;
    private final wg e;
    private final H f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3624lf(V0 adTools, Qc outcomeReporter, wg waterfallInstances, H adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.d = outcomeReporter;
        this.e = waterfallInstances;
        this.f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.Cg
    public void a(B instance) {
        B bA;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (this.f.a(instance)) {
            this.d.a(this.e.b(), instance);
        } else {
            if (!this.f.a() || (bA = this.f.c().a()) == null) {
                return;
            }
            this.d.a(this.e.b(), bA);
        }
    }

    @Override // com.ironsource.Cg
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.Cg
    public void c(B instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.d.a(this.e.b(), instanceToShow);
    }

    @Override // com.ironsource.Cg
    public void a() {
        B bA = this.f.c().a();
        if (bA != null) {
            this.d.a(this.e.b(), bA);
        }
    }
}
