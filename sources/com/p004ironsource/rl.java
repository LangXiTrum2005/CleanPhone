package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c¨\u0006 "}, d2 = {"Lcom/ironsource/rl;", "Lcom/ironsource/xl;", "", "b", f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "Lcom/ironsource/nl;", "Lcom/ironsource/nl;", a.r.f36787A, "Lcom/ironsource/l6;", "Lcom/ironsource/l6;", "currentAdUnit", "Ljava/lang/Long;", "reloadStart", "Lcom/ironsource/zu$a;", "Lcom/ironsource/zu$a;", "visibilityCheckerTask", "J", "notVisibleStart", "<init>", "(Lcom/ironsource/nl;Lcom/ironsource/l6;Ljava/lang/Long;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rl implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l6 currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Long reloadStart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private zu.a visibilityCheckerTask;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long notVisibleStart;

    public rl(nl strategy, l6 currentAdUnit, Long l2) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.reloadStart = l2;
        this.notVisibleStart = strategy.getTimeProvider().a();
        b();
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.strategy.a("Ad unit is already loaded");
    }

    @Override // com.p004ironsource.xl
    public void c() {
        zu.a aVar = this.visibilityCheckerTask;
        if (aVar != null) {
            aVar.a();
        }
        nl nlVar = this.strategy;
        nlVar.a((xl) new tl(nlVar, this.currentAdUnit));
    }

    @Override // com.p004ironsource.xl
    public boolean d() {
        return true;
    }

    @Override // com.p004ironsource.xl
    public void e() {
    }

    @Override // com.p004ironsource.xl
    public void f() {
        this.strategy.a("Loading a loaded ad");
    }

    @Override // com.p004ironsource.xl
    public void g() {
        zu.a aVar = this.visibilityCheckerTask;
        if (aVar != null) {
            aVar.a();
        }
        this.currentAdUnit.a(true);
        nl nlVar = this.strategy;
        nlVar.a((xl) new ql(nlVar));
    }

    @Override // com.p004ironsource.xl
    public long i() {
        return this.strategy.getCom.ironsource.v6.d java.lang.String();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rl this$0) {
        Intrinsics.f(this$0, "this$0");
        long jA = this$0.strategy.getTimeProvider().a();
        long j = jA - this$0.notVisibleStart;
        Long l2 = this$0.reloadStart;
        this$0.strategy.a(this$0.currentAdUnit, new j7.c(l2 != null ? jA - l2.longValue() : 0L, new j7.d.f(j)), this$0.reloadStart);
    }

    private final void b() {
        this.strategy.t();
        zu zuVarQ = this.strategy.getTaskScheduler();
        D d = new D(this, 9);
        Duration.Companion companion = Duration.f44719Y;
        this.visibilityCheckerTask = zuVarQ.a(d, DurationKt.h(this.strategy.getVisibilityCheckerInterval(), DurationUnit.MILLISECONDS));
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        this.strategy.a("Ad unit is already loaded");
    }
}
