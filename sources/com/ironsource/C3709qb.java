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
import java.util.Iterator;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3709qb {
    public static final C3709qb a = new C3709qb();
    private static final C3725rb b = new C3725rb();

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    public static final class a implements InterfaceC3534ge {
        final /* synthetic */ LevelPlayInitRequest a;
        final /* synthetic */ Context b;
        final /* synthetic */ C3507f5 c;
        final /* synthetic */ LevelPlayInitListener d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C3507f5 c3507f5, LevelPlayInitListener levelPlayInitListener) {
            this.a = levelPlayInitRequest;
            this.b = context;
            this.c = c3507f5;
            this.d = levelPlayInitListener;
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3426ae sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            C3725rb c3725rb = C3709qb.b;
            final LevelPlayInitRequest levelPlayInitRequest = this.a;
            final Context context = this.b;
            final C3507f5 c3507f5 = this.c;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            c3725rb.a(new Runnable() { // from class: com.ironsource.microanalysis
                @Override // java.lang.Runnable
                public final void run() {
                    C3709qb.a.a(sdkConfig, levelPlayInitRequest, context, c3507f5, levelPlayInitListener);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3426ae sdkConfig, LevelPlayInitRequest initRequest, Context context, C3507f5 initDuration, LevelPlayInitListener levelPlayInitListener) {
            C3421a9 c3421a9A;
            Intrinsics.checkNotNullParameter(sdkConfig, "$sdkConfig");
            Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
            Intrinsics.checkNotNullParameter(context, "$context");
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            C3439b9 c3439b9F = sdkConfig.f();
            if (c3439b9F != null && (c3421a9A = c3439b9F.a()) != null) {
                new C3529g9().a(c3421a9A.f(), c3421a9A.e().d(), c3421a9A.e().e(), c3421a9A.e().f(), c3421a9A.d());
            }
            C3709qb.a.a(initRequest, sdkConfig, context, initDuration, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC3534ge
        public void a(final C3462ce error, C3439b9 c3439b9) {
            Intrinsics.checkNotNullParameter(error, "error");
            C3725rb c3725rb = C3709qb.b;
            final LevelPlayInitListener levelPlayInitListener = this.d;
            final C3507f5 c3507f5 = this.c;
            c3725rb.a(new Runnable() { // from class: com.ironsource.ethene
                @Override // java.lang.Runnable
                public final void run() {
                    C3709qb.a.a(levelPlayInitListener, c3507f5, error);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C3507f5 initDuration, C3462ce error) {
            Intrinsics.checkNotNullParameter(initDuration, "$initDuration");
            Intrinsics.checkNotNullParameter(error, "$error");
            C3709qb.a.a(levelPlayInitListener, initDuration, error);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qb$b */
    public static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Sa a;
        final /* synthetic */ C3507f5 b;
        final /* synthetic */ long c;
        final /* synthetic */ LevelPlayInitListener d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Sa sa, C3507f5 c3507f5, long j, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.a = sa;
            this.b = c3507f5;
            this.c = j;
            this.d = levelPlayInitListener;
        }

        public final void a() {
            C3709qb.a.a(this.a, this.b, this.c, this.d);
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qb$c */
    public static final class c extends Lambda implements Function0<Unit> {
        final /* synthetic */ String a;
        final /* synthetic */ List<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.a = str;
            this.b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.p.h().a(this.a, this.b);
        }

        @Override // p002kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f29295attabal;
        }
    }

    private C3709qb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        a.c(context, initRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C3507f5 c3507f5 = new C3507f5();
        C3725rb c3725rb = b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        C3695pe.a.a(context, new C3570ie(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), p002kotlin.collections.polloi.mastfed(c3725rb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c3507f5, levelPlayInitListener));
    }

    public final void b(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.p.h().a(a(segment));
    }

    public final void b(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().a(new Xa(listener));
    }

    public static /* synthetic */ void a(C3709qb c3709qb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i, Object obj) {
        if ((i & 4) != 0) {
            levelPlayInitListener = null;
        }
        c3709qb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public final void a(final Context context, final LevelPlayInitRequest initRequest, final LevelPlayInitListener levelPlayInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        b.d(new Runnable() { // from class: com.ironsource.tout
            @Override // java.lang.Runnable
            public final void run() {
                C3709qb.b(context, initRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.p.h().b(new Xa(listener));
    }

    private final Y9 a(LevelPlaySegment levelPlaySegment) {
        Y9 y9 = new Y9();
        y9.a(levelPlaySegment.getLevel());
        y9.a(levelPlaySegment.getIapTotal());
        y9.a(levelPlaySegment.isPaying());
        y9.a(levelPlaySegment.getUserCreationDate());
        y9.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            y9.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return y9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C3426ae c3426ae, Context context, C3507f5 c3507f5, LevelPlayInitListener levelPlayInitListener) {
        Gb.b bVar = Gb.s;
        G8.a aVarD = bVar.a().D();
        Sa sa = new Sa(c3426ae);
        if (sa.n()) {
            b.a(context);
        }
        I7.a aVarB = bVar.a().b();
        C3725rb c3725rb = b;
        sa.b(c3725rb).a(aVarB);
        sa.a(c3725rb).a(bVar.a().l());
        sa.c(c3725rb).a(bVar.a().v());
        C3709qb c3709qb = a;
        c3709qb.a(levelPlayInitRequest, sa);
        long jL = bVar.d().h().l();
        ContextProvider.getInstance().updateStrategyIfNeeded();
        c3709qb.a(jL, new b(sa, c3507f5, jL, levelPlayInitListener));
        aVarD.a(sa);
        if (c3426ae.a().e()) {
            new Bd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final void a(long j, Function0<Unit> function0) {
        if (!Gb.s.d().f().c() && j > 0) {
            b.a(function0, j);
        } else {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final Sa sa, C3507f5 c3507f5, long j, final LevelPlayInitListener levelPlayInitListener) {
        Gb.s.a().D().d();
        long jA = C3507f5.a(c3507f5);
        C3725rb c3725rb = b;
        C3725rb.a(c3725rb, jA, sa.g(), j, null, 8, null);
        c3725rb.e(new Runnable() { // from class: com.ironsource.rajahship
            @Override // java.lang.Runnable
            public final void run() {
                C3709qb.a(levelPlayInitListener, sa);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, Sa levelPlayConfig) {
        Intrinsics.checkNotNullParameter(levelPlayConfig, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(levelPlayConfig.m(), levelPlayConfig.j()));
        }
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, Sa sa) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && sa.d().c().f() != null) {
            Pd.a aVar = Pd.z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            Pd pdA = aVar.a(new C3538h0(aVar2, C3772u7.a.a(), "", null, null, null, 56, null), sa, true);
            List<C3760tc> listC = sa.c(adFormat);
            F0.b bVar = F0.b.MEDIATION;
            new C3711qd(new V0(new C3681p0(aVar2, bVar), pdA, bVar), adFormat, listC, pdA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && sa.d().c().d() != null) {
            C3859z9.a aVar3 = C3859z9.z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            C3859z9 c3859z9A = aVar3.a(new C3538h0(aVar4, C3772u7.a.a(), "", null, null, null, 56, null), sa, true);
            List<C3760tc> listC2 = sa.c(adFormat2);
            F0.b bVar2 = F0.b.MEDIATION;
            new C3711qd(new V0(new C3681p0(aVar4, bVar2), c3859z9A, bVar2), adFormat2, listC2, c3859z9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || sa.d().c().c() == null) {
            return;
        }
        M2 m2A = M2.z.a(new J2(), sa, true);
        List<C3760tc> listC3 = sa.c(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        F0.b bVar3 = F0.b.MEDIATION;
        new C3711qd(new V0(new C3681p0(aVar5, bVar3), m2A, bVar3), adFormat3, listC3, m2A).a();
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C3507f5 c3507f5, final C3462ce c3462ce) {
        long jA = C3507f5.a(c3507f5);
        C3725rb c3725rb = b;
        final C3462ce c3462ceB = c3725rb.b(c3462ce);
        C3725rb.a(c3725rb, c3462ceB, jA, null, 4, null);
        c3725rb.e(new Runnable() { // from class: com.ironsource.undecorated
            @Override // java.lang.Runnable
            public final void run() {
                C3709qb.a(c3462ce, levelPlayInitListener, c3462ceB);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3462ce error, LevelPlayInitListener levelPlayInitListener, C3462ce eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + error);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(b.a(eventError)));
        }
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        a(key, arrayList);
    }

    public final void a(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        a(new c(key, values));
    }

    public final void a(Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (Gb.s.c().h().x()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, Xd.a.a(task), 0L, 2, null);
        } else {
            task.invoke();
        }
    }
}
