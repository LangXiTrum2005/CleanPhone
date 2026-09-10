package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ironsource/ql;", "Lcom/ironsource/xl;", "", f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "Lcom/ironsource/nl;", "Lcom/ironsource/nl;", a.r.f36787A, "<init>", "(Lcom/ironsource/nl;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ql implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl strategy;

    public ql(nl strategy) {
        Intrinsics.f(strategy, "strategy");
        this.strategy = strategy;
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.strategy.a("Received load failed on a destroyed ad");
    }

    @Override // com.p004ironsource.xl
    public void c() {
        this.strategy.a("Pausing auto refresh on a destroyed ad");
    }

    @Override // com.p004ironsource.xl
    public boolean d() {
        return true;
    }

    @Override // com.p004ironsource.xl
    public void e() {
        this.strategy.a("Resuming auto refresh on a destroyed ad");
    }

    @Override // com.p004ironsource.xl
    public void f() {
        this.strategy.a("Loading an ad after ad unit destroyed");
    }

    @Override // com.p004ironsource.xl
    public void g() {
        this.strategy.a("Destroying a destroyed ad");
    }

    @Override // com.p004ironsource.xl
    public long i() {
        return this.strategy.getCom.ironsource.v6.d java.lang.String();
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        this.strategy.a("Received load success on a destroyed ad");
    }
}
