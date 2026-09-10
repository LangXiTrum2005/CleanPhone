package com.ironsource;

import android.graphics.Rect;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ga implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Long f26157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Ff.a f26158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26159e;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC0330f3.c f26161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f26162c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0330f3.c cVar, long j10) {
            super(0);
            this.f26161b = cVar;
            this.f26162c = j10;
        }

        public final void a() {
            Ga.this.f26155a.a(Ga.this.f26156b, this.f26161b, Long.valueOf(this.f26162c));
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    public Ga(Ca strategy, L2 currentAdUnit, Long l) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        this.f26155a = strategy;
        this.f26156b = currentAdUnit;
        this.f26157c = l;
        this.f26159e = strategy.p().a();
        strategy.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ga this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        C0624vb.a(this$0.f26155a.a(), new th(this$0, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ga this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        if (!Ig.a(this$0.f26155a.k(), new Rect())) {
            this$0.e();
            return;
        }
        long jA = this$0.f26155a.p().a();
        long j10 = jA - this$0.f26159e;
        Long l = this$0.f26157c;
        this$0.f26155a.a().c(AbstractRunnableC0430ke.f29068a.a(this$0.new a(new AbstractC0330f3.c(l != null ? jA - l.longValue() : 0L, new AbstractC0330f3.d.f(j10)), jA)));
    }

    private final void e() {
        long jQ = this.f26155a.q();
        Ff ffO = this.f26155a.o();
        th thVar = new th(this, 1);
        int i10 = bn.a.f5743d;
        this.f26158d = ffO.a(thVar, d0.c.P(jQ, bn.c.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        this.f26155a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26155a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ff.a aVar = this.f26158d;
        if (aVar != null) {
            aVar.a();
        }
        this.f26156b.a(true);
        Ca ca2 = this.f26155a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.f26155a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ff.a aVar = this.f26158d;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca2 = this.f26155a;
        ca2.a((Ma) new Ia(ca2, this.f26156b));
    }
}
