package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class La implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L2 f26504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26506e;

    public La(Ca strategy, L2 currentAdUnit, L2 reloadingAdUnit, long j10, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadingAdUnit, "reloadingAdUnit");
        this.f26502a = strategy;
        this.f26503b = currentAdUnit;
        this.f26504c = reloadingAdUnit;
        this.f26505d = j10;
        this.f26506e = z10;
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26502a.a(adUnitCallback, this.f26504c, this.f26503b, (AbstractC0330f3) new AbstractC0330f3.c(this.f26502a.p().a() - this.f26505d, AbstractC0330f3.d.C0071d.f28620a), false, Long.valueOf(this.f26505d));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26502a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.f26503b.a(true);
        this.f26504c.a(true);
        Ca ca2 = this.f26502a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ca ca2 = this.f26502a;
        ca2.a((Ma) new Ia(ca2, this.f26503b));
    }

    public /* synthetic */ La(Ca ca2, L2 l10, L2 l11, long j10, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(ca2, l10, l11, j10, (i10 & 16) != 0 ? true : z10);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26502a.a(ironSourceError, this.f26503b, (AbstractC0330f3) new AbstractC0330f3.c(this.f26502a.p().a() - this.f26505d, AbstractC0330f3.d.c.f28619a), this.f26506e, false, Long.valueOf(this.f26505d));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }
}
