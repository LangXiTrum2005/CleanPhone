package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.ub, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0606ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0606ub f30810a = new C0606ub();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C0624vb f30811b = new C0624vb();

    /* JADX INFO: renamed from: com.ironsource.ub$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0591te {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitRequest f30812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0350g5 f30814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f30815d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C0350g5 c0350g5, LevelPlayInitListener levelPlayInitListener) {
            this.f30812a = levelPlayInitRequest;
            this.f30813b = context;
            this.f30814c = c0350g5;
            this.f30815d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0484ne sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            C0606ub.f30811b.c(new com.applovin.impl.z8(sdkConfig, this.f30812a, this.f30813b, this.f30814c, this.f30815d, 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C0484ne sdkConfig, LevelPlayInitRequest initRequest, Context context, C0350g5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C0282c9 c0282c9A;
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.f(initRequest, "$initRequest");
            kotlin.jvm.internal.n.f(context, "$context");
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            C0300d9 c0300d9F = sdkConfig.f();
            if (c0300d9F != null && (c0282c9A = c0300d9F.a()) != null) {
                new C0390i9().a(c0282c9A.f(), c0282c9A.e().d(), c0282c9A.e().e(), c0282c9A.e().f(), c0282c9A.d());
            }
            C0606ub.f30810a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC0591te
        public void a(C0520pe error, C0300d9 c0300d9) {
            kotlin.jvm.internal.n.f(error, "error");
            C0606ub.f30811b.c(new ph(this.f30815d, this.f30814c, error, 17));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C0350g5 initDuration, C0520pe error) {
            kotlin.jvm.internal.n.f(initDuration, "$initDuration");
            kotlin.jvm.internal.n.f(error, "$error");
            C0606ub.f30810a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ub$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Va f30816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0350g5 f30817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30818c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ LevelPlayInitListener f30819d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Va va2, C0350g5 c0350g5, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f30816a = va2;
            this.f30817b = c0350g5;
            this.f30818c = j10;
            this.f30819d = levelPlayInitListener;
        }

        public final void a() {
            C0606ub.f30810a.a(this.f30816a, this.f30817b, this.f30818c, this.f30819d);
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ub$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends kotlin.jvm.internal.o implements jk.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<String> f30821b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.f30820a = str;
            this.f30821b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.f30820a, this.f30821b);
        }

        @Override // jk.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return wj.r.f53297a;
        }
    }

    private C0606ub() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        f30810a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog ironLog = IronLog.API;
        String appKey = levelPlayInitRequest.getAppKey();
        String userId = levelPlayInitRequest.getUserId();
        List<LevelPlay.AdFormat> legacyAdFormats = levelPlayInitRequest.getLegacyAdFormats();
        String simpleName = context.getClass().getSimpleName();
        StringBuilder sbV = defpackage.e.v("LevelPlay.init() appkey: ", appKey, ", userId: ", userId, ", legacyAdFormats: ");
        sbV.append(legacyAdFormats);
        sbV.append(", context: ");
        sbV.append(simpleName);
        ironLog.info(sbV.toString());
        C0350g5 c0350g5 = new C0350g5();
        C0624vb c0624vb = f30811b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ce.f25903a.a(context, new C0627ve(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), xj.k.D0(c0624vb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c0350g5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment segment) {
        kotlin.jvm.internal.n.f(segment, "segment");
        com.ironsource.mediationsdk.p.h().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        com.ironsource.mediationsdk.p.h().a(new C0248ab(listener));
    }

    public static /* synthetic */ void a(C0606ub c0606ub, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        c0606ub.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        f30811b.c(new ph(context, initRequest, levelPlayInitListener, 16));
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.n.f(listener, "listener");
        com.ironsource.mediationsdk.p.h().b(new C0248ab(listener));
    }

    public final void b(jk.a task) {
        kotlin.jvm.internal.n.f(task, "task");
        if (Kb.f26413u.c().h().D()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC0430ke.f29068a.a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }

    private final C0265ba a(LevelPlaySegment levelPlaySegment) {
        C0265ba c0265ba = new C0265ba();
        c0265ba.a(levelPlaySegment.getLevel());
        c0265ba.a(levelPlaySegment.getIapTotal());
        c0265ba.a(levelPlaySegment.isPaying());
        c0265ba.a(levelPlaySegment.getUserCreationDate());
        c0265ba.a(levelPlaySegment.getSegmentName());
        for (wj.f fVar : levelPlaySegment.getCustoms$mediationsdk_release()) {
            c0265ba.a((String) fVar.f53283a, (String) fVar.f53284b);
        }
        return c0265ba;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C0484ne c0484ne, Context context, C0350g5 c0350g5, LevelPlayInitListener levelPlayInitListener) {
        Kb.b bVar = Kb.f26413u;
        I8.a aVarE = bVar.a().E();
        C0568s9.f30210a.a();
        Va va2 = new Va(c0484ne);
        if (va2.n()) {
            f30811b.a(context);
        }
        K7.a aVarB = bVar.a().b();
        C0624vb c0624vb = f30811b;
        va2.b(c0624vb).a(aVarB);
        va2.a(c0624vb).a(bVar.a().l());
        va2.c(c0624vb).a(bVar.a().v());
        C0606ub c0606ub = f30810a;
        c0606ub.a(levelPlayInitRequest, va2);
        bVar.d().B().a(va2);
        bVar.d().F().a(va2);
        long jN = bVar.d().h().n();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        IronSourceThreadManager ironSourceThreadManager = IronSourceThreadManager.INSTANCE;
        ironSourceThreadManager.changeToUISchedulerIfNeeded();
        com.ironsource.mediationsdk.c.b().g();
        c0606ub.a(jN, new b(va2, c0350g5, jN, levelPlayInitListener));
        aVarE.a(va2);
        if (c0484ne.a().e()) {
            new Od(null, null, null, ironSourceThreadManager.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j10, jk.a aVar) {
        if (!Kb.f26413u.d().f().c() && j10 > 0) {
            Ef ef = new Ef(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            gi giVar = new gi(aVar, 2);
            int i10 = bn.a.f5743d;
            ef.a(giVar, d0.c.P(j10, bn.c.MILLISECONDS));
            return;
        }
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(jk.a tmp0) {
        kotlin.jvm.internal.n.f(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Va va2, C0350g5 c0350g5, long j10, LevelPlayInitListener levelPlayInitListener) {
        Kb.f26413u.a().E().d();
        long jA = C0350g5.a(c0350g5);
        C0624vb c0624vb = f30811b;
        C0624vb.a(c0624vb, jA, va2.g(), j10, null, 8, null);
        c0624vb.d(new ki(29, levelPlayInitListener, va2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Va levelPlayConfig) {
        kotlin.jvm.internal.n.f(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m(), levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Va va2) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && va2.d().c().f() != null) {
            C0287ce.a aVar = C0287ce.f28376z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            C0287ce c0287ceA = aVar.a(new C0363h0(aVar2, C0638w7.f30930a.a(), "", null, null, null, 56, null), va2, true);
            List<C0679yc> listD = va2.d(adFormat);
            F0.b bVar = F0.b.MEDIATION;
            new Dd(new V0(new C0506p0(aVar2, bVar), c0287ceA, bVar), adFormat, listD, c0287ceA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && va2.d().c().d() != null) {
            C9.a aVar3 = C9.f25859z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            C9 c9A = aVar3.a(new C0363h0(aVar4, C0638w7.f30930a.a(), "", null, null, null, 56, null), va2, true);
            List<C0679yc> listD2 = va2.d(adFormat2);
            F0.b bVar2 = F0.b.MEDIATION;
            new Dd(new V0(new C0506p0(aVar4, bVar2), c9A, bVar2), adFormat2, listD2, c9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || va2.d().c().c() == null) {
            return;
        }
        M2 m2A = M2.f26533z.a(new J2(), va2, true);
        List<C0679yc> listD3 = va2.d(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        F0.b bVar3 = F0.b.MEDIATION;
        new Dd(new V0(new C0506p0(aVar5, bVar3), m2A, bVar3), adFormat3, listD3, m2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitListener levelPlayInitListener, C0350g5 c0350g5, C0520pe c0520pe) {
        long jA = C0350g5.a(c0350g5);
        C0624vb c0624vb = f30811b;
        C0520pe c0520peB = c0624vb.b(c0520pe);
        C0624vb.a(c0624vb, c0520peB, jA, null, 4, null);
        c0624vb.d(new ph(c0520pe, levelPlayInitListener, c0520peB, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0520pe error, LevelPlayInitListener levelPlayInitListener, C0520pe eventError) {
        kotlin.jvm.internal.n.f(error, "$error");
        kotlin.jvm.internal.n.f(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(f30811b.a(eventError)));
        }
    }

    public final void a(String key, String value) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(String key, List<String> values) {
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(values, "values");
        b(new c(key, values));
    }
}
