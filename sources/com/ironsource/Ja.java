package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ja implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ca f26344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L2 f26345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L2 f26346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f26347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0499ob<LevelPlayAdInfo> f26349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ff.a f26350g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26351a = new a();

        public a() {
            super(1);
        }

        public final void a(Ja weak) {
            kotlin.jvm.internal.n.f(weak, "$this$weak");
            weak.e();
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ja) obj);
            return wj.r.f53297a;
        }
    }

    public Ja(Ca strategy, L2 currentAdUnit, L2 reloadingAdUnit, long j10, boolean z10) {
        kotlin.jvm.internal.n.f(strategy, "strategy");
        kotlin.jvm.internal.n.f(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.n.f(reloadingAdUnit, "reloadingAdUnit");
        this.f26344a = strategy;
        this.f26345b = currentAdUnit;
        this.f26346c = reloadingAdUnit;
        this.f26347d = j10;
        this.f26348e = z10;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC0499ob<LevelPlayAdInfo> interfaceC0499ob = this.f26349f;
        if (interfaceC0499ob == null) {
            Ca ca2 = this.f26344a;
            ca2.a((Ma) new La(ca2, this.f26345b, this.f26346c, this.f26347d, this.f26348e));
        } else if (interfaceC0499ob instanceof InterfaceC0499ob.b) {
            a((LevelPlayAdInfo) ((InterfaceC0499ob.b) interfaceC0499ob).b());
        } else if (interfaceC0499ob instanceof InterfaceC0499ob.a) {
            b(((InterfaceC0499ob.a) interfaceC0499ob).b());
        }
    }

    private final void g() {
        Ff ffO = this.f26344a.o();
        Ff.b bVarA = Gf.a(this, a.f26351a);
        int i10 = bn.a.f5743d;
        this.f26350g = ffO.a(bVarA, d0.c.P(this.f26344a.l(), bn.c.MILLISECONDS));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.f26344a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ff.a aVar = this.f26350g;
        if (aVar != null) {
            aVar.a();
        }
        this.f26345b.a(true);
        this.f26346c.a(true);
        Ca ca2 = this.f26344a;
        ca2.a((Ma) new Fa(ca2));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ff.a aVar = this.f26350g;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca2 = this.f26344a;
        ca2.a((Ma) new Ia(ca2, this.f26345b));
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca ca2 = this.f26344a;
        ca2.a((Ma) new Ja(ca2, this.f26345b, this.f26346c, ca2.p().a(), false, 16, null));
    }

    private final void b(IronSourceError ironSourceError) {
        this.f26344a.a(ironSourceError, this.f26345b, (AbstractC0330f3) new AbstractC0330f3.c(this.f26344a.p().a() - this.f26347d, AbstractC0330f3.d.g.f28623a), this.f26348e, false, Long.valueOf(this.f26347d));
    }

    @Override // com.ironsource.M0
    public void a(C0595u0 adUnitCallback) {
        kotlin.jvm.internal.n.f(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            a(new InterfaceC0499ob.b(levelPlayAdInfoC));
        } else {
            a(new InterfaceC0499ob.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC0499ob.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long jA = this.f26344a.p().a() - this.f26347d;
        this.f26344a.a(new C0595u0(this.f26346c, levelPlayAdInfo), this.f26346c, this.f26345b, (AbstractC0330f3) new AbstractC0330f3.c(jA, AbstractC0330f3.d.h.f28624a), false, Long.valueOf(this.f26347d));
    }

    public /* synthetic */ Ja(Ca ca2, L2 l10, L2 l11, long j10, boolean z10, int i10, kotlin.jvm.internal.g gVar) {
        this(ca2, l10, l11, j10, (i10 & 16) != 0 ? true : z10);
    }

    private final void a(InterfaceC0499ob<LevelPlayAdInfo> interfaceC0499ob) {
        if (this.f26349f != null) {
            this.f26344a.a("Received excessive load " + Ka.b(interfaceC0499ob) + " while reloading");
            return;
        }
        this.f26349f = interfaceC0499ob;
    }
}
