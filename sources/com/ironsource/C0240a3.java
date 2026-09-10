package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0240a3 implements Bb, E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f28157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSize f28158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0508p2 f28159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Cb f28160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0607uc f28161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0560s1 f28162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final V<BannerAdView> f28163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final H2 f28164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC0414jg.c f28165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Executor f28166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0350g5 f28167k;
    private InterfaceC0414jg l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Y1 f28168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28169n;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0414jg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0414jg.a
        public void a() {
            C0240a3.this.a(C0600u5.f30795a.s());
        }
    }

    public C0240a3(BannerAdRequest adRequest, AdSize size, InterfaceC0508p2 auctionResponseFetcher, Cb loadTaskConfig, InterfaceC0607uc networkLoadApi, InterfaceC0560s1 analytics, V<BannerAdView> adLoadTaskListener, H2 adLayoutFactory, InterfaceC0414jg.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(size, "size");
        kotlin.jvm.internal.n.f(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.n.f(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(adLayoutFactory, "adLayoutFactory");
        kotlin.jvm.internal.n.f(timerFactory, "timerFactory");
        kotlin.jvm.internal.n.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.f28157a = adRequest;
        this.f28158b = size;
        this.f28159c = auctionResponseFetcher;
        this.f28160d = loadTaskConfig;
        this.f28161e = networkLoadApi;
        this.f28162f = analytics;
        this.f28163g = adLoadTaskListener;
        this.f28164h = adLayoutFactory;
        this.f28165i = timerFactory;
        this.f28166j = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = R5.f27122a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC0435l1.c.f29094a.a(new C0489o1.l(wi.d.i(str, X3.j.f27830b, String.valueOf(mapA.get(str))))).a(this.f28162f);
        }
    }

    @Override // com.ironsource.E2
    public void onBannerLoadFail(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        a(C0600u5.f30795a.c(description));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(K9 adInstance, C0353g8 adContainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adContainer, "adContainer");
        try {
            this.f28166j.execute(new ph(this, adInstance, adContainer, 11));
        } catch (Exception e10) {
            a(e10);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.f28167k = new C0350g5();
        this.f28162f.a(new C0489o1.s(this.f28160d.f()), new C0489o1.n(this.f28160d.g().b()), new C0489o1.c(this.f28158b), new C0489o1.b(this.f28157a.getAdId$mediationsdk_release()));
        InterfaceC0435l1.c.f29094a.a().a(this.f28162f);
        a(this.f28157a.getExtraParams());
        long jH = this.f28160d.h();
        InterfaceC0414jg.c cVar = this.f28165i;
        InterfaceC0414jg.b bVar = new InterfaceC0414jg.b();
        bVar.b(jH);
        InterfaceC0414jg interfaceC0414jgA = cVar.a(bVar);
        this.l = interfaceC0414jgA;
        if (interfaceC0414jgA != null) {
            interfaceC0414jgA.a(new a());
        }
        Object objA = this.f28159c.a();
        Throwable thA = wj.h.a(objA);
        if (thA != null) {
            a(((C0263b8) thA).a());
            objA = null;
        }
        C0454m2 c0454m2 = (C0454m2) objA;
        if (c0454m2 == null) {
            return;
        }
        InterfaceC0560s1 interfaceC0560s1 = this.f28162f;
        String strB = c0454m2.b();
        if (strB != null) {
            interfaceC0560s1.a(new C0489o1.d(strB));
        }
        JSONObject jSONObjectF = c0454m2.f();
        if (jSONObjectF != null) {
            interfaceC0560s1.a(new C0489o1.m(jSONObjectF));
        }
        String strA = c0454m2.a();
        if (strA != null) {
            interfaceC0560s1.a(new C0489o1.g(strA));
        }
        EnumC0515p9 enumC0515p9G = this.f28160d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C0317e8 c0317e8 = new C0317e8(AdapterUtils.dpToPixels(applicationContext, this.f28158b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.f28158b.getHeight()), this.f28158b.getSizeDescription());
        Jc jc2 = new Jc();
        jc2.a(this);
        K9 adInstance = new L9(this.f28157a.getProviderName$mediationsdk_release().value(), jc2).a(enumC0515p9G.b(EnumC0515p9.Bidder)).a(c0317e8).b(this.f28160d.i()).a(this.f28157a.getAdId$mediationsdk_release()).a(xj.b0.T(new C0482nc().a(), R5.f27122a.a(this.f28157a.getExtraParams()))).a();
        C0643wc c0643wc = new C0643wc(c0454m2, this.f28160d.j());
        this.f28168m = new Y1(new C0479n9(this.f28157a.getInstanceId(), enumC0515p9G.b(), c0454m2.a()), new com.ironsource.mediationsdk.d(), c0454m2.c());
        InterfaceC0435l1.d.f29103a.c().a(this.f28162f);
        InterfaceC0607uc interfaceC0607uc = this.f28161e;
        kotlin.jvm.internal.n.e(adInstance, "adInstance");
        interfaceC0607uc.a(adInstance, c0643wc);
    }

    public /* synthetic */ C0240a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC0508p2 interfaceC0508p2, Cb cb2, InterfaceC0607uc interfaceC0607uc, InterfaceC0560s1 interfaceC0560s1, V v4, H2 h7, InterfaceC0414jg.c cVar, Executor executor, int i10, kotlin.jvm.internal.g gVar) {
        this(bannerAdRequest, adSize, interfaceC0508p2, cb2, interfaceC0607uc, interfaceC0560s1, v4, h7, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new InterfaceC0414jg.d() : cVar, (i10 & 512) != 0 ? R7.f27125a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0240a3 this$0, K9 adInstance, C0353g8 adContainer) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstance, "$adInstance");
        kotlin.jvm.internal.n.f(adContainer, "$adContainer");
        if (this$0.f28169n) {
            return;
        }
        this$0.f28169n = true;
        InterfaceC0414jg interfaceC0414jg = this$0.l;
        if (interfaceC0414jg != null) {
            interfaceC0414jg.cancel();
        }
        C0350g5 c0350g5 = this$0.f28167k;
        if (c0350g5 != null) {
            InterfaceC0435l1.c.f29094a.a(new C0489o1.f(C0350g5.a(c0350g5))).a(this$0.f28162f);
            Y1 y10 = this$0.f28168m;
            if (y10 != null) {
                y10.c("onBannerLoadSuccess");
            }
            H2 h7 = this$0.f28164h;
            Y1 y11 = this$0.f28168m;
            kotlin.jvm.internal.n.c(y11);
            this$0.f28163g.a(h7.a(adInstance, adContainer, y11));
            return;
        }
        kotlin.jvm.internal.n.l("taskStartedTime");
        throw null;
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        try {
            this.f28166j.execute(new ki(17, this, error));
        } catch (Exception e10) {
            a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0240a3 this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        if (this$0.f28169n) {
            return;
        }
        this$0.f28169n = true;
        InterfaceC0414jg interfaceC0414jg = this$0.l;
        if (interfaceC0414jg != null) {
            interfaceC0414jg.cancel();
        }
        InterfaceC0435l1.c.a aVar = InterfaceC0435l1.c.f29094a;
        C0489o1.j jVar = new C0489o1.j(error.getErrorCode());
        C0489o1.k kVar = new C0489o1.k(error.getErrorMessage());
        C0350g5 c0350g5 = this$0.f28167k;
        if (c0350g5 != null) {
            aVar.a(jVar, kVar, new C0489o1.f(C0350g5.a(c0350g5))).a(this$0.f28162f);
            Y1 y10 = this$0.f28168m;
            if (y10 != null) {
                y10.a("onBannerLoadFail");
            }
            this$0.f28163g.b(error);
            return;
        }
        kotlin.jvm.internal.n.l("taskStartedTime");
        throw null;
    }

    private final void a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC0435l1.d.f29103a.a(new C0489o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).a(this.f28162f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
