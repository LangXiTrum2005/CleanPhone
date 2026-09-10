package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Fa implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26093a;

    public Fa(Ca strategy) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        this.f26093a = strategy;
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26093a.a("Received load success on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26093a.a("Loading a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.f26093a.a("Destroying a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void d() {
        this.f26093a.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.Ma
    public void f() {
        this.f26093a.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26093a.a("Received load failed on a destroyed ad");
    }
}
