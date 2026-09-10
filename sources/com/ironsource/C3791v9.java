package com.ironsource;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3791v9 implements InterfaceC3827xb, Z5 {
    private final InterstitialAdRequest a;
    private final C3844yb b;
    private final V<InterstitialAd> c;
    private final InterfaceC3683p2 d;
    private final InterfaceC3693pc e;
    private final InterfaceC3732s1 f;
    private final InterfaceC3484e0<InterstitialAd> g;
    private final Qf.c h;
    private final Executor i;
    private C3507f5 j;
    private Qf k;
    private Y1 l;
    private boolean m;

    /* JADX INFO: renamed from: com.ironsource.v9$a */
    public static final class a implements Qf.a {
        public a() {
        }

        @Override // com.ironsource.Qf.a
        public void a() {
            C3791v9.this.a(C3753t5.a.s());
        }
    }

    public C3791v9(InterstitialAdRequest adRequest, C3844yb loadTaskConfig, V<InterstitialAd> adLoadTaskListener, InterfaceC3683p2 auctionResponseFetcher, InterfaceC3693pc networkLoadApi, InterfaceC3732s1 analytics, InterfaceC3484e0<InterstitialAd> adObjectFactory, Qf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adObjectFactory, "adObjectFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = loadTaskConfig;
        this.c = adLoadTaskListener;
        this.d = auctionResponseFetcher;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adObjectFactory;
        this.h = timerFactory;
        this.i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = O5.a.a(bundle);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            InterfaceC3610l1.c.a.a(new C3664o1.l(str + X3.j.b + strValueOf)).a(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC3827xb
    public void start() {
        this.j = new C3507f5();
        this.f.a(new C3664o1.s(this.b.f()), new C3664o1.n(this.b.g().b()), new C3664o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC3610l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long jH = this.b.h();
        Qf.c cVar = this.h;
        Qf.b bVar = new Qf.b();
        bVar.b(jH);
        Unit unit = Unit.f29295attabal;
        Qf qfA = cVar.a(bVar);
        this.k = qfA;
        if (qfA != null) {
            qfA.a(new a());
        }
        Object objA = this.d.a();
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objA);
        if (thM3354exceptionOrNullimpl != null) {
            Intrinsics.competently(thM3354exceptionOrNullimpl, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.error.ISException");
            a(((Z7) thM3354exceptionOrNullimpl).a());
            objA = null;
        }
        C3629m2 c3629m2 = (C3629m2) objA;
        if (c3629m2 == null) {
            return;
        }
        InterfaceC3732s1 interfaceC3732s1 = this.f;
        String strB = c3629m2.b();
        if (strB != null) {
            interfaceC3732s1.a(new C3664o1.d(strB));
        }
        JSONObject jSONObjectF = c3629m2.f();
        if (jSONObjectF != null) {
            interfaceC3732s1.a(new C3664o1.m(jSONObjectF));
        }
        String strA = c3629m2.a();
        if (strA != null) {
            interfaceC3732s1.a(new C3664o1.g(strA));
        }
        EnumC3636m9 enumC3636m9G = this.b.g();
        Y5 y5 = new Y5();
        y5.a(this);
        H9 adInstance = new I9(this.a.getProviderName$mediationsdk_release().value(), y5).a(enumC3636m9G.b(EnumC3636m9.Bidder)).b(this.b.i()).a(this.a.getAdId$mediationsdk_release()).a(p002kotlin.collections.seminary.monoploid(new C3568ic().a(), O5.a.a(this.a.getExtraParams()))).a();
        InterfaceC3732s1 interfaceC3732s2 = this.f;
        String strE = adInstance.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        interfaceC3732s2.a(new C3664o1.b(strE));
        C3726rc c3726rc = new C3726rc(c3629m2, this.b.j());
        this.l = new Y1(new C3618l9(this.a.getInstanceId(), enumC3636m9G.b(), c3629m2.a()), new com.ironsource.mediationsdk.d(), c3629m2.c());
        InterfaceC3610l1.d.a.c().a(this.f);
        InterfaceC3693pc interfaceC3693pc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3693pc.a(adInstance, c3726rc);
    }

    @Override // com.ironsource.Z5
    public void a(final H9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.nomenclative
                @Override // java.lang.Runnable
                public final void run() {
                    C3791v9.a(this.f23355kowloon, adInstance);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3791v9 this$0, H9 adInstance) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        Qf qf = this$0.k;
        if (qf != null) {
            qf.cancel();
        }
        C3507f5 c3507f5 = this$0.j;
        if (c3507f5 == null) {
            Intrinsics.preprohormone("taskStartedTime");
            c3507f5 = null;
        }
        InterfaceC3610l1.c.a.a(new C3664o1.f(C3507f5.a(c3507f5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.c("onAdInstanceDidLoad");
        }
        InterfaceC3484e0<InterstitialAd> interfaceC3484e0 = this$0.g;
        Y1 y2 = this$0.l;
        Intrinsics.beachfront(y2);
        this$0.c.a(interfaceC3484e0.a(adInstance, y2));
    }

    public /* synthetic */ C3791v9(InterstitialAdRequest interstitialAdRequest, C3844yb c3844yb, V v, InterfaceC3683p2 interfaceC3683p2, InterfaceC3693pc interfaceC3693pc, InterfaceC3732s1 interfaceC3732s1, InterfaceC3484e0 interfaceC3484e0, Qf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, c3844yb, v, interfaceC3683p2, interfaceC3693pc, interfaceC3732s1, interfaceC3484e0, (i & 128) != 0 ? new Qf.d() : cVar, (i & 256) != 0 ? P7.a.d() : executor);
    }

    @Override // com.ironsource.Z5
    public void a(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C3753t5.a.c(description));
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.i.execute(new Runnable() { // from class: com.ironsource.hypokinesis
                @Override // java.lang.Runnable
                public final void run() {
                    C3791v9.a(this.f23263kowloon, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3791v9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.m) {
            return;
        }
        this$0.m = true;
        Qf qf = this$0.k;
        if (qf != null) {
            qf.cancel();
        }
        InterfaceC3610l1.c.a aVar = InterfaceC3610l1.c.a;
        C3664o1.j jVar = new C3664o1.j(error.getErrorCode());
        C3664o1.k kVar = new C3664o1.k(error.getErrorMessage());
        C3507f5 c3507f5 = this$0.j;
        if (c3507f5 == null) {
            Intrinsics.preprohormone("taskStartedTime");
            c3507f5 = null;
        }
        aVar.a(jVar, kVar, new C3664o1.f(C3507f5.a(c3507f5))).a(this$0.f);
        Y1 y1 = this$0.l;
        if (y1 != null) {
            y1.a("onAdInstanceDidFailToLoad");
        }
        this$0.c.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC3610l1.d.a.a(new C3664o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
