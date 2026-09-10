package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006$"}, d2 = {"Lcom/ironsource/ul;", "Lcom/ironsource/xl;", "", "b", "Lcom/ironsource/r1;", "adUnitCallback", "a", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "Lcom/ironsource/hr;", "result", h.f36614b, f.j, "c", "e", g.f40227p, "", i.f37957c, "", "d", "Lcom/ironsource/nl;", "Lcom/ironsource/nl;", a.r.f36787A, "Lcom/ironsource/l6;", "Lcom/ironsource/l6;", "currentAdUnit", "reloadingAdUnit", "J", "reloadStart", "Lcom/ironsource/hr;", "reloadResult", "Lcom/ironsource/zu$a;", "Lcom/ironsource/zu$a;", "refreshTask", "<init>", "(Lcom/ironsource/nl;Lcom/ironsource/l6;Lcom/ironsource/l6;J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ul implements xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nl strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l6 currentAdUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l6 reloadingAdUnit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long reloadStart;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private hr reloadResult;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private zu.a refreshTask;

    public ul(nl strategy, l6 currentAdUnit, l6 reloadingAdUnit, long j) {
        Intrinsics.f(strategy, "strategy");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(reloadingAdUnit, "reloadingAdUnit");
        this.strategy = strategy;
        this.currentAdUnit = currentAdUnit;
        this.reloadingAdUnit = reloadingAdUnit;
        this.reloadStart = j;
        h();
    }

    private final void a(hr result) {
        if (this.reloadResult == null) {
            this.reloadResult = result;
            return;
        }
        this.strategy.a("Received excessive load " + vl.b(result) + " while reloading");
        if (result instanceof hr.b) {
            return;
        }
        boolean z2 = result instanceof hr.a;
    }

    private final void h() {
        zu zuVarQ = this.strategy.getTaskScheduler();
        D d = new D(this, 11);
        Duration.Companion companion = Duration.f44719Y;
        this.refreshTask = zuVarQ.a(d, DurationKt.h(this.strategy.getCom.ironsource.v6.d java.lang.String(), DurationUnit.SECONDS));
    }

    @Override // com.p004ironsource.xl
    public void c() {
        zu.a aVar = this.refreshTask;
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
        nl nlVar = this.strategy;
        nlVar.a((xl) new ul(nlVar, this.currentAdUnit, this.reloadingAdUnit, nlVar.getTimeProvider().a()));
    }

    @Override // com.p004ironsource.xl
    public void f() {
        this.strategy.a("Loading an ad while reloading");
    }

    @Override // com.p004ironsource.xl
    public void g() {
        zu.a aVar = this.refreshTask;
        if (aVar != null) {
            aVar.a();
        }
        this.currentAdUnit.a(true);
        this.reloadingAdUnit.a(true);
        nl nlVar = this.strategy;
        nlVar.a((xl) new ql(nlVar));
    }

    @Override // com.p004ironsource.xl
    public long i() {
        return this.strategy.getCom.ironsource.v6.d java.lang.String();
    }

    private final void b() {
        hr hrVar = this.reloadResult;
        if (hrVar == null) {
            nl nlVar = this.strategy;
            nlVar.a((xl) new wl(nlVar, this.currentAdUnit, this.reloadingAdUnit, this.reloadStart));
        } else if (hrVar instanceof hr.b) {
            a(((hr.b) hrVar).b());
        } else if (hrVar instanceof hr.a) {
            b(((hr.a) hrVar).b());
        }
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        if (error == null) {
            error = new IronSourceError(0, "Unknown error");
        }
        a(new hr.a(error));
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        a(new hr.b(adUnitCallback));
    }

    private final void a(r1 adUnitCallback) {
        this.strategy.a(adUnitCallback, this.reloadingAdUnit, this.currentAdUnit, (j7) new j7.c(this.strategy.getTimeProvider().a() - this.reloadStart, j7.d.h.f25402a), false, Long.valueOf(this.reloadStart));
    }

    private final void b(IronSourceError error) {
        this.strategy.a(error, this.currentAdUnit, (j7) new j7.c(this.strategy.getTimeProvider().a() - this.reloadStart, j7.d.g.f25401a), true, false, Long.valueOf(this.reloadStart));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ul this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.b();
    }
}
