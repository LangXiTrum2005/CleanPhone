package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;

/* JADX INFO: renamed from: com.ironsource.r6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0547r6 implements InterfaceC0422k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kb f30136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V0 f30137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0649x0 f30138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0601u6 f30139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jk.c f30140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Ff f30141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0510p4 f30142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0440l6 f30143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f30144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f30145j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Kg f30146k;
    private Ff.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Long f30147m;

    /* JADX INFO: renamed from: com.ironsource.r6$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(C0547r6 c0547r6, IronSourceError ironSourceError);

        void a(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.r6$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(C0547r6 c0547r6);

        void b(C0547r6 c0547r6, IronSourceError ironSourceError);

        void b(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C0547r6 c0547r6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.r6$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30148a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30148a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r6$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public /* synthetic */ class e extends kotlin.jvm.internal.k implements jk.c {
        public e(Object obj) {
            super(2, obj, C0547r6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // jk.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0404j6 invoke(C p10, I p11) {
            kotlin.jvm.internal.n.f(p10, "p0");
            kotlin.jvm.internal.n.f(p11, "p1");
            return ((C0547r6) this.receiver).a(p10, p11);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.r6$f */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class f extends kotlin.jvm.internal.o implements jk.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f30150a = new f();

        public f() {
            super(1);
        }

        public final void a(C0547r6 weak) {
            kotlin.jvm.internal.n.f(weak, "$this$weak");
            b bVar = weak.f30144i;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.f30146k.a();
        }

        @Override // jk.b
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C0547r6) obj);
            return wj.r.f53297a;
        }
    }

    public C0547r6(Kb mediationServices, V0 adUnitTools, AbstractC0649x0 adUnitData, InterfaceC0601u6 fullscreenListener, Mg mg2, jk.c cVar, Ff taskScheduler, InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(mediationServices, "mediationServices");
        kotlin.jvm.internal.n.f(adUnitTools, "adUnitTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(fullscreenListener, "fullscreenListener");
        kotlin.jvm.internal.n.f(taskScheduler, "taskScheduler");
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f30136a = mediationServices;
        this.f30137b = adUnitTools;
        this.f30138c = adUnitData;
        this.f30139d = fullscreenListener;
        this.f30140e = cVar;
        this.f30141f = taskScheduler;
        this.f30142g = currentTimeProvider;
        this.f30146k = a(mg2);
    }

    private final void i() {
        String strC = c();
        if (strC.length() > 0) {
            this.f30136a.b().b(strC, b());
            G3 g3A = this.f30136a.p().a(strC, b());
            if (g3A.d()) {
                this.f30137b.d().a().b(strC, g3A.e());
            }
        }
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30137b, "finalizing ad unit", (String) null, 2, (Object) null));
        Ff.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B b(C0547r6 this$0, C instanceData, I adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        jk.c eVar = this$0.f30140e;
        if (eVar == null) {
            eVar = new e(this$0);
        }
        C0404j6 c0404j6 = (C0404j6) eVar.invoke(instanceData, adInstancePayload);
        c0404j6.a(this$0);
        return c0404j6;
    }

    private final InterfaceC0644wd f() {
        int i10 = c.f30148a[b().ordinal()];
        if (i10 == 1) {
            return this.f30136a.B();
        }
        if (i10 != 2) {
            return null;
        }
        return this.f30136a.F();
    }

    private final InterfaceC0499ob<wj.r> g() {
        if (!this.f30146k.h()) {
            return new InterfaceC0499ob.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.f30136a.p().a(c(), b()).d()) {
            return new InterfaceC0499ob.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, defpackage.e.o("placement ", c(), " is capped")));
        }
        return this.f30136a.g().a(this.f30138c.b().c()).d() ? new InterfaceC0499ob.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, defpackage.e.o("adUnitId ", this.f30138c.b().c(), " is capped"))) : new InterfaceC0499ob.b(wj.r.f53297a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        Ff.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.f30137b.b(b());
        Ff ff = this.f30141f;
        Ff.b bVarA = Gf.a(this, f.f30150a);
        int i10 = bn.a.f5743d;
        this.l = ff.a(bVarA, d0.c.P(jB, bn.c.MILLISECONDS));
    }

    public final InterfaceC0601u6 d() {
        return this.f30139d;
    }

    public final LevelPlayAdInfo e() {
        B bE = this.f30146k.e();
        if (bE != null) {
            return bE.e();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.f30138c.l();
    }

    public final void a(InterfaceC0601u6 interfaceC0601u6) {
        kotlin.jvm.internal.n.f(interfaceC0601u6, "<set-?>");
        this.f30139d = interfaceC0601u6;
    }

    public final void a(b loadListener) {
        kotlin.jvm.internal.n.f(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30137b, (String) null, (String) null, 3, (Object) null));
        this.f30144i = loadListener;
        this.f30147m = Long.valueOf(this.f30142g.a());
        this.f30137b.a(new C0559s0(this.f30138c.b()));
        a4.a aVar = new a4.a(this, 17);
        this.f30137b.d().e().a(this.f30138c.u());
        this.f30146k.a(aVar);
    }

    /* JADX INFO: renamed from: com.ironsource.r6$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d implements Sg {
        public d() {
        }

        @Override // com.ironsource.Sg
        public void a(int i10, String errorReason) {
            Long lValueOf;
            kotlin.jvm.internal.n.f(errorReason, "errorReason");
            Long l = C0547r6.this.f30147m;
            if (l != null) {
                lValueOf = Long.valueOf(C0547r6.this.f30142g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C0547r6.this.f30137b.d().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i10, errorReason, C0547r6.this.f30138c.u());
            b bVar = C0547r6.this.f30144i;
            if (bVar != null) {
                bVar.b(C0547r6.this, new IronSourceError(i10, errorReason));
            }
        }

        @Override // com.ironsource.Sg
        public void b(B instance) {
            Long lValueOf;
            kotlin.jvm.internal.n.f(instance, "instance");
            Long l = C0547r6.this.f30147m;
            if (l != null) {
                lValueOf = Long.valueOf(C0547r6.this.f30142g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C0547r6.this.f30137b.d().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C0547r6.this.f30138c.u());
            C0547r6.this.h();
            b bVar = C0547r6.this.f30144i;
            if (bVar != null) {
                bVar.b(C0547r6.this, instance.e());
            }
        }

        @Override // com.ironsource.Sg
        public void a(B instance) {
            kotlin.jvm.internal.n.f(instance, "instance");
            C0547r6.this.f30137b.d().a().e(C0547r6.this.c());
            C0547r6.this.h();
            b bVar = C0547r6.this.f30144i;
            if (bVar != null) {
                bVar.c(C0547r6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.F
    public void b(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f30146k.d(instance);
        this.f30137b.d().a().g(c());
        this.f30136a.i().b(com.unity3d.mediation.a.a(b()));
    }

    @Override // com.ironsource.InterfaceC0422k6
    public void b(C0404j6 fullscreenInstance) {
        InterfaceC0644wd interfaceC0644wdF;
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        if (fullscreenInstance.A() && (interfaceC0644wdF = f()) != null) {
            interfaceC0644wdF.a(this.f30138c.b().c(), true);
        }
        this.f30137b.d().a().b(c());
        this.f30146k.c();
        this.f30143h = null;
        this.f30139d.onClosed();
    }

    public /* synthetic */ C0547r6(Kb kb2, V0 v4, AbstractC0649x0 abstractC0649x0, InterfaceC0601u6 interfaceC0601u6, Mg mg2, jk.c cVar, Ff ff, InterfaceC0510p4 interfaceC0510p4, int i10, kotlin.jvm.internal.g gVar) {
        this(kb2, v4, abstractC0649x0, interfaceC0601u6, (i10 & 16) != 0 ? null : mg2, (i10 & 32) != 0 ? null : cVar, (i10 & 64) != 0 ? new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : ff, (i10 & 128) != 0 ? new InterfaceC0510p4.a() : interfaceC0510p4);
    }

    public final void a(Activity activity, a displayListener) {
        kotlin.jvm.internal.n.f(activity, "activity");
        kotlin.jvm.internal.n.f(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C0506p0.a(this.f30137b, (String) null, (String) null, 3, (Object) null));
        this.f30145j = displayListener;
        this.f30137b.d().a().a(activity, c());
        InterfaceC0499ob<wj.r> interfaceC0499obG = g();
        if (interfaceC0499obG instanceof InterfaceC0499ob.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC0499ob.a) interfaceC0499obG).b();
            ironLog.verbose(C0506p0.a(this.f30137b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.f30137b.d().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), this.f30146k.g());
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        Ff.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        C0440l6 c0440l6 = new C0440l6(activity);
        this.f30143h = c0440l6;
        this.f30146k.a((K) c0440l6, false);
    }

    private final LevelPlay.AdFormat b() {
        return this.f30138c.b().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0404j6 a(C c4, I i10) {
        return new C0404j6(new V0(this.f30137b, F0.b.PROVIDER), c4, i10);
    }

    private final Kg a(Mg mg2) {
        Sg sgA = a();
        if (mg2 != null) {
            return mg2.a(sgA, this);
        }
        return new Kg(this.f30137b, this.f30138c, Kb.f26413u.c().h().u(), sgA, f(), this);
    }

    private final Sg a() {
        return new d();
    }

    @Override // com.ironsource.InterfaceC0422k6
    public void a(C0404j6 fullscreenInstance) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        this.f30146k.c();
        this.f30143h = null;
        a aVar = this.f30145j;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        i();
        this.f30136a.l().b(this.f30138c.b().c());
    }

    @Override // com.ironsource.F
    public void a(B instance, IronSourceError error) {
        InterfaceC0644wd interfaceC0644wdF;
        kotlin.jvm.internal.n.f(instance, "instance");
        kotlin.jvm.internal.n.f(error, "error");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30137b, error.toString(), (String) null, 2, (Object) null));
        if (instance.A() && (interfaceC0644wdF = f()) != null) {
            interfaceC0644wdF.a(this.f30138c.b().c(), true);
        }
        C0440l6 c0440l6 = this.f30143h;
        Nd ndG = this.f30146k.g();
        a(ndG);
        if (ndG == Nd.CAN_RECOVER && c0440l6 != null) {
            this.f30146k.a((K) c0440l6, true);
            return;
        }
        this.f30146k.c();
        this.f30143h = null;
        this.f30137b.d().a().a(c(), error.getErrorCode(), error.getErrorMessage(), ndG);
        a aVar = this.f30145j;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(Nd nd2) {
        if (nd2 == Nd.CAN_RECOVER || nd2 == Nd.NO_LOADED_ADS) {
            this.f30137b.d().h().a(nd2);
        }
    }

    @Override // com.ironsource.InterfaceC0422k6
    public void a(C0404j6 fullscreenInstance, LevelPlayReward reward) {
        kotlin.jvm.internal.n.f(fullscreenInstance, "fullscreenInstance");
        kotlin.jvm.internal.n.f(reward, "reward");
        IronLog.INTERNAL.verbose(C0506p0.a(this.f30137b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.f30139d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(B instance) {
        kotlin.jvm.internal.n.f(instance, "instance");
        this.f30137b.d().a().a(c());
        this.f30139d.e();
    }
}
