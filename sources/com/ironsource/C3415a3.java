package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3415a3 implements InterfaceC3827xb, E2 {
    private final BannerAdRequest a;
    private final AdSize b;
    private final InterfaceC3683p2 c;
    private final C3844yb d;
    private final InterfaceC3693pc e;
    private final InterfaceC3732s1 f;
    private final V<BannerAdView> g;
    private final H2 h;
    private final Qf.c i;
    private final Executor j;
    private C3507f5 k;
    private Qf l;
    private Y1 m;
    private boolean n;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    public static final class a implements Qf.a {
        public a() {
        }

        @Override // com.ironsource.Qf.a
        public void a() {
            C3415a3.this.a(C3753t5.a.s());
        }
    }

    public C3415a3(BannerAdRequest adRequest, AdSize size, InterfaceC3683p2 auctionResponseFetcher, C3844yb loadTaskConfig, InterfaceC3693pc networkLoadApi, InterfaceC3732s1 analytics, V<BannerAdView> adLoadTaskListener, H2 adLayoutFactory, Qf.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.checkNotNullParameter(loadTaskConfig, "loadTaskConfig");
        Intrinsics.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(adLayoutFactory, "adLayoutFactory");
        Intrinsics.checkNotNullParameter(timerFactory, "timerFactory");
        Intrinsics.checkNotNullParameter(taskFinishedExecutor, "taskFinishedExecutor");
        this.a = adRequest;
        this.b = size;
        this.c = auctionResponseFetcher;
        this.d = loadTaskConfig;
        this.e = networkLoadApi;
        this.f = analytics;
        this.g = adLoadTaskListener;
        this.h = adLayoutFactory;
        this.i = timerFactory;
        this.j = taskFinishedExecutor;
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

    @Override // com.ironsource.E2
    public void onBannerLoadFail(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        a(C3753t5.a.c(description));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(final H9 adInstance, final C3492e8 adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.julian
                @Override // java.lang.Runnable
                public final void run() {
                    C3415a3.a(this.f23279kowloon, adInstance, adContainer);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.InterfaceC3827xb
    public void start() {
        this.k = new C3507f5();
        this.f.a(new C3664o1.s(this.d.f()), new C3664o1.n(this.d.g().b()), new C3664o1.c(this.b), new C3664o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC3610l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long jH = this.d.h();
        Qf.c cVar = this.i;
        Qf.b bVar = new Qf.b();
        bVar.b(jH);
        Unit unit = Unit.f29295attabal;
        Qf qfA = cVar.a(bVar);
        this.l = qfA;
        if (qfA != null) {
            qfA.a(new a());
        }
        Object objA = this.c.a();
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
        EnumC3636m9 enumC3636m9G = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C3456c8 c3456c8 = new C3456c8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Ec ec = new Ec();
        ec.a(this);
        H9 adInstance = new I9(this.a.getProviderName$mediationsdk_release().value(), ec).a(enumC3636m9G.b(EnumC3636m9.Bidder)).a(c3456c8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(p002kotlin.collections.seminary.monoploid(new C3568ic().a(), O5.a.a(this.a.getExtraParams()))).a();
        C3726rc c3726rc = new C3726rc(c3629m2, this.d.j());
        this.m = new Y1(new C3618l9(this.a.getInstanceId(), enumC3636m9G.b(), c3629m2.a()), new com.ironsource.mediationsdk.d(), c3629m2.c());
        InterfaceC3610l1.d.a.c().a(this.f);
        InterfaceC3693pc interfaceC3693pc = this.e;
        Intrinsics.checkNotNullExpressionValue(adInstance, "adInstance");
        interfaceC3693pc.a(adInstance, c3726rc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415a3 this$0, H9 adInstance, C3492e8 adContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstance, "$adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "$adContainer");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        Qf qf = this$0.l;
        if (qf != null) {
            qf.cancel();
        }
        C3507f5 c3507f5 = this$0.k;
        if (c3507f5 == null) {
            Intrinsics.preprohormone("taskStartedTime");
            c3507f5 = null;
        }
        InterfaceC3610l1.c.a.a(new C3664o1.f(C3507f5.a(c3507f5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.c("onBannerLoadSuccess");
        }
        H2 h2 = this$0.h;
        Y1 y2 = this$0.m;
        Intrinsics.beachfront(y2);
        this$0.g.a(h2.a(adInstance, adContainer, y2));
    }

    public /* synthetic */ C3415a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC3683p2 interfaceC3683p2, C3844yb c3844yb, InterfaceC3693pc interfaceC3693pc, InterfaceC3732s1 interfaceC3732s1, V v, H2 h2, Qf.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC3683p2, c3844yb, interfaceC3693pc, interfaceC3732s1, v, h2, (i & 256) != 0 ? new Qf.d() : cVar, (i & 512) != 0 ? P7.a.d() : executor);
    }

    public final void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            this.j.execute(new Runnable() { // from class: com.ironsource.achondroplasia
                @Override // java.lang.Runnable
                public final void run() {
                    C3415a3.a(this.f23135kowloon, error);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3415a3 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        if (this$0.n) {
            return;
        }
        this$0.n = true;
        Qf qf = this$0.l;
        if (qf != null) {
            qf.cancel();
        }
        InterfaceC3610l1.c.a aVar = InterfaceC3610l1.c.a;
        C3664o1.j jVar = new C3664o1.j(error.getErrorCode());
        C3664o1.k kVar = new C3664o1.k(error.getErrorMessage());
        C3507f5 c3507f5 = this$0.k;
        if (c3507f5 == null) {
            Intrinsics.preprohormone("taskStartedTime");
            c3507f5 = null;
        }
        aVar.a(jVar, kVar, new C3664o1.f(C3507f5.a(c3507f5))).a(this$0.f);
        Y1 y1 = this$0.m;
        if (y1 != null) {
            y1.a("onBannerLoadFail");
        }
        this$0.g.b(error);
    }

    private final void a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC3610l1.d.a.a(new C3664o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
