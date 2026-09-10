package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/ironsource/pl;", "Lcom/ironsource/xl;", "", f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "Lcom/ironsource/nl;", "Lcom/ironsource/nl;", a.r.f36787A, "b", "Z", "isAutoRefreshPaused", "<init>", "(Lcom/ironsource/nl;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pl implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAutoRefreshPaused;

    public pl(nl strategy, boolean z2) {
        Intrinsics.f(strategy, "strategy");
        this.strategy = strategy;
        this.isAutoRefreshPaused = z2;
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.strategy.a("Received load failed before load");
    }

    @Override // com.p004ironsource.xl
    public void c() {
        this.isAutoRefreshPaused = true;
    }

    @Override // com.p004ironsource.xl
    public boolean d() {
        return true;
    }

    @Override // com.p004ironsource.xl
    public void e() {
        this.isAutoRefreshPaused = false;
    }

    @Override // com.p004ironsource.xl
    public void f() {
        l6 l6VarA = this.strategy.getBannerAdUnitFactory().a(true);
        l6VarA.a(this.strategy.getAdUnitLoadListener());
        this.strategy.a((xl) new sl(this.strategy, l6VarA, this.isAutoRefreshPaused));
    }

    @Override // com.p004ironsource.xl
    public void g() {
        nl nlVar = this.strategy;
        nlVar.a((xl) new ql(nlVar));
    }

    @Override // com.p004ironsource.xl
    public long i() {
        return this.strategy.getCom.ironsource.v6.d java.lang.String();
    }

    public /* synthetic */ pl(nl nlVar, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nlVar, (i2 & 2) != 0 ? false : z2);
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        this.strategy.a("Received load success before load");
    }
}
