package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.FunctionReferenceImpl;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.time.DurationUnit;

/* JADX INFO: renamed from: com.ironsource.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3669o6 implements InterfaceC3544h6 {
    private final Gb a;
    private final V0 b;
    private final AbstractC3816x0 c;
    private InterfaceC3720r6 d;
    private final tetrahedral.triweekly<C, I, InterfaceC3544h6, C3526g6> e;
    private final InterfaceC3729rf f;
    private final InterfaceC3667o4 g;
    private C3562i6 h;
    private b i;
    private a j;
    private final rg k;
    private InterfaceC3729rf.a l;
    private Long m;

    /* JADX INFO: renamed from: com.ironsource.o6$a */
    public interface a {
        void a(C3669o6 c3669o6, IronSourceError ironSourceError);

        void a(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$b */
    public interface b {
        void a(C3669o6 c3669o6);

        void b(C3669o6 c3669o6, IronSourceError ironSourceError);

        void b(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);

        void c(C3669o6 c3669o6, LevelPlayAdInfo levelPlayAdInfo);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$d */
    public /* synthetic */ class d extends FunctionReferenceImpl implements tetrahedral.triweekly<C, I, InterfaceC3544h6, C3526g6> {
        public d(Object obj) {
            super(3, obj, C3669o6.class, "createAdInstance", "createAdInstance(Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstanceData;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/AdInstancePayload;Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/listeners/FullscreenAdInstanceListener;)Lcom/unity3d/mediation/internal/ads/controllers/adunits/adinstances/FullscreenAdInstance;", 0);
        }

        @Override // tetrahedral.triweekly
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3526g6 invoke(C p0, I p1, InterfaceC3544h6 p2) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            Intrinsics.checkNotNullParameter(p2, "p2");
            return ((C3669o6) this.receiver).a(p0, p1, p2);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.o6$e */
    public static final class e extends Lambda implements Function1<C3669o6, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(C3669o6 weak) {
            Intrinsics.checkNotNullParameter(weak, "$this$weak");
            b bVar = weak.i;
            if (bVar != null) {
                bVar.a(weak);
            }
            weak.k.a();
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C3669o6 c3669o6) {
            a(c3669o6);
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3669o6(Gb mediationServices, V0 adUnitTools, AbstractC3816x0 adUnitData, InterfaceC3720r6 fullscreenListener, tg tgVar, tetrahedral.triweekly<? super C, ? super I, ? super InterfaceC3544h6, C3526g6> triweeklyVar, InterfaceC3729rf taskScheduler, InterfaceC3667o4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(mediationServices, "mediationServices");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(fullscreenListener, "fullscreenListener");
        Intrinsics.checkNotNullParameter(taskScheduler, "taskScheduler");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = mediationServices;
        this.b = adUnitTools;
        this.c = adUnitData;
        this.d = fullscreenListener;
        this.e = triweeklyVar;
        this.f = taskScheduler;
        this.g = currentTimeProvider;
        this.k = a(tgVar);
    }

    public final void finalize() {
        IronLog.INTERNAL.verbose(C3681p0.a(this.b, "finalizing ad unit", (String) null, 2, (Object) null));
        InterfaceC3729rf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return this.c.l();
    }

    private final InterfaceC3602kb<Unit> f() {
        if (!this.k.h()) {
            return new InterfaceC3602kb.a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "show called while ad unit is not ready to show"));
        }
        if (this.a.p().a(c(), b()).d()) {
            return new InterfaceC3602kb.a(new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, "placement " + c() + " is capped"));
        }
        if (!this.a.g().a(this.c.b().c()).d()) {
            return new InterfaceC3602kb.b(Unit.f29295attabal);
        }
        return new InterfaceC3602kb.a(new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "adUnitId " + this.c.b().c() + " is capped"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC3729rf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        long jB = this.b.b(b());
        InterfaceC3729rf interfaceC3729rf = this.f;
        InterfaceC3729rf.b bVarA = S6.a(this, e.a);
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.l = interfaceC3729rf.a(bVarA, p002kotlin.time.dern.graveside(jB, DurationUnit.MILLISECONDS));
    }

    private final void h() {
        String strC = c();
        if (strC.length() > 0) {
            this.a.b().b(strC, b());
            G3 g3A = this.a.p().a(strC, b());
            if (g3A.d()) {
                this.b.e().a().b(strC, g3A.e());
            }
        }
    }

    @Override // com.ironsource.F
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k.c(instance);
        this.b.e().a().g(c());
        this.a.i().b(com.unity3d.mediation.a.a(b()));
    }

    public final InterfaceC3720r6 d() {
        return this.d;
    }

    public final LevelPlayAdInfo e() {
        B bE = this.k.e();
        if (bE != null) {
            return bE.e();
        }
        return null;
    }

    public final void a(InterfaceC3720r6 interfaceC3720r6) {
        Intrinsics.checkNotNullParameter(interfaceC3720r6, "<set-?>");
        this.d = interfaceC3720r6;
    }

    public final void a(b loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        IronLog.INTERNAL.verbose(C3681p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.i = loadListener;
        this.m = Long.valueOf(this.g.a());
        this.b.a(new C3731s0(this.c.b()));
        E e2 = new E() { // from class: com.ironsource.pruinose
            @Override // com.ironsource.E
            public final B a(C c2, I i) {
                return C3669o6.a(this.f23391attabal, c2, i);
            }
        };
        this.b.e().e().a(this.c.u());
        this.k.a(e2);
    }

    /* JADX INFO: renamed from: com.ironsource.o6$c */
    public static final class c implements zg {
        public c() {
        }

        @Override // com.ironsource.zg
        public void a(int i, String errorReason) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            Long l = C3669o6.this.m;
            if (l != null) {
                lValueOf = Long.valueOf(C3669o6.this.g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C3669o6.this.b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, i, errorReason, C3669o6.this.c.u());
            b bVar = C3669o6.this.i;
            if (bVar != null) {
                bVar.b(C3669o6.this, new IronSourceError(i, errorReason));
            }
        }

        @Override // com.ironsource.zg
        public void b(B instance) {
            Long lValueOf;
            Intrinsics.checkNotNullParameter(instance, "instance");
            Long l = C3669o6.this.m;
            if (l != null) {
                lValueOf = Long.valueOf(C3669o6.this.g.a() - l.longValue());
            } else {
                lValueOf = null;
            }
            C3669o6.this.b.e().e().a(lValueOf != null ? lValueOf.longValue() : 0L, C3669o6.this.c.u());
            C3669o6.this.g();
            b bVar = C3669o6.this.i;
            if (bVar != null) {
                bVar.b(C3669o6.this, instance.e());
            }
        }

        @Override // com.ironsource.zg
        public void a(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            C3669o6.this.b.e().a().e(C3669o6.this.c());
            C3669o6.this.g();
            b bVar = C3669o6.this.i;
            if (bVar != null) {
                bVar.c(C3669o6.this, instance.e());
            }
        }
    }

    @Override // com.ironsource.InterfaceC3544h6
    public void b(C3526g6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.b.e().a().b(c());
        this.k.c();
        this.h = null;
        this.d.onClosed();
    }

    private final LevelPlay.AdFormat b() {
        return this.c.b().e();
    }

    public /* synthetic */ C3669o6(Gb gb, V0 v0, AbstractC3816x0 abstractC3816x0, InterfaceC3720r6 interfaceC3720r6, tg tgVar, tetrahedral.triweekly triweeklyVar, InterfaceC3729rf interfaceC3729rf, InterfaceC3667o4 interfaceC3667o4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(gb, v0, abstractC3816x0, interfaceC3720r6, (i & 16) != 0 ? null : tgVar, (i & 32) != 0 ? null : triweeklyVar, (i & 64) != 0 ? new R6(S6.a(v0.a())) : interfaceC3729rf, (i & 128) != 0 ? new InterfaceC3667o4.a() : interfaceC3667o4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C3669o6 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        tetrahedral.triweekly dVar = this$0.e;
        if (dVar == null) {
            dVar = new d(this$0);
        }
        return (B) dVar.invoke(instanceData, adInstancePayload, this$0);
    }

    public final void a(Activity activity, a displayListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(C3681p0.a(this.b, (String) null, (String) null, 3, (Object) null));
        this.j = displayListener;
        this.b.e().a().a(activity, c());
        InterfaceC3602kb<Unit> interfaceC3602kbF = f();
        if (interfaceC3602kbF instanceof InterfaceC3602kb.a) {
            IronSourceError ironSourceErrorB = ((InterfaceC3602kb.a) interfaceC3602kbF).b();
            ironLog.verbose(C3681p0.a(this.b, ironSourceErrorB.getErrorMessage(), (String) null, 2, (Object) null));
            this.b.e().a().a(c(), ironSourceErrorB.getErrorCode(), ironSourceErrorB.getErrorMessage(), this.k.g());
            displayListener.a(this, ironSourceErrorB);
            return;
        }
        InterfaceC3729rf.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        C3562i6 c3562i6 = new C3562i6(activity);
        this.h = c3562i6;
        this.k.a((K) c3562i6, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3526g6 a(C c2, I i, InterfaceC3544h6 interfaceC3544h6) {
        return new C3526g6(new V0(this.b, F0.b.PROVIDER), c2, i, interfaceC3544h6);
    }

    private final rg a(tg tgVar) {
        zg zgVarA = a();
        if (tgVar != null) {
            return tgVar.a(zgVarA);
        }
        return new rg(this.b, this.c, Gb.s.c().h().s(), zgVarA);
    }

    private final zg a() {
        return new c();
    }

    @Override // com.ironsource.InterfaceC3544h6
    public void a(C3526g6 fullscreenInstance) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        this.k.c();
        this.h = null;
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, fullscreenInstance.e());
        }
        h();
        this.a.l().b(this.c.b().c());
    }

    @Override // com.ironsource.F
    public void a(B instance, IronSourceError error) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.INTERNAL.verbose(C3681p0.a(this.b, error.toString(), (String) null, 2, (Object) null));
        C3562i6 c3562i6 = this.h;
        Ad adG = this.k.g();
        a(adG);
        if (adG == Ad.CAN_RECOVER && c3562i6 != null) {
            this.k.a((K) c3562i6, true);
            return;
        }
        this.k.c();
        this.h = null;
        this.b.e().a().a(c(), error.getErrorCode(), error.getErrorMessage(), adG);
        a aVar = this.j;
        if (aVar != null) {
            aVar.a(this, error);
        }
    }

    private final void a(Ad ad) {
        if (ad == Ad.CAN_RECOVER || ad == Ad.NO_LOADED_ADS) {
            this.b.e().h().a(ad);
        }
    }

    @Override // com.ironsource.InterfaceC3544h6
    public void a(C3526g6 fullscreenInstance, LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(fullscreenInstance, "fullscreenInstance");
        Intrinsics.checkNotNullParameter(reward, "reward");
        IronLog.INTERNAL.verbose(C3681p0.a(this.b, fullscreenInstance.q(), (String) null, 2, (Object) null));
        this.d.a(reward);
    }

    @Override // com.ironsource.F
    public void a(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.b.e().a().a(c());
        this.d.e();
    }
}
