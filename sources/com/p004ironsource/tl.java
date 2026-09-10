package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/ironsource/tl;", "Lcom/ironsource/xl;", "", f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "Lcom/ironsource/nl;", "Lcom/ironsource/nl;", a.r.f36787A, "Lcom/ironsource/l6;", "b", "Lcom/ironsource/l6;", "currentAdUnit", "<init>", "(Lcom/ironsource/nl;Lcom/ironsource/l6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class tl implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l6 currentAdUnit;

    public tl(nl strategy, l6 currentAdUnit) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.strategy.a("Received load failed while paused");
    }

    @Override // com.p004ironsource.xl
    public void c() {
    }

    @Override // com.p004ironsource.xl
    public boolean d() {
        return true;
    }

    @Override // com.p004ironsource.xl
    public void e() {
        this.strategy.a(this.currentAdUnit, new j7.a(j7.b.c.f25392a));
    }

    @Override // com.p004ironsource.xl
    public void f() {
        this.strategy.a("Loading a loaded ad");
    }

    @Override // com.p004ironsource.xl
    public void g() {
        this.currentAdUnit.a(true);
        nl nlVar = this.strategy;
        nlVar.a((xl) new ql(nlVar));
    }

    @Override // com.p004ironsource.xl
    public long i() {
        return this.strategy.getCom.ironsource.v6.d java.lang.String();
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        this.strategy.a("Received load success while paused");
    }
}
