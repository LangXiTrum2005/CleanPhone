package com.ironsource;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.y9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0676y9 implements Bb, InterfaceC0279c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f31295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Cb f31296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V<InterstitialAd> f31297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0508p2 f31298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0607uc f31299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0560s1 f31300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC0309e0<InterstitialAd> f31301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0414jg.c f31302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f31303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C0350g5 f31304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC0414jg f31305k;
    private Y1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f31306m;

    /* JADX INFO: renamed from: com.ironsource.y9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0414jg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0414jg.a
        public void a() {
            C0676y9.this.a(C0600u5.f30795a.s());
        }
    }

    public C0676y9(InterstitialAdRequest adRequest, Cb loadTaskConfig, V<InterstitialAd> adLoadTaskListener, InterfaceC0508p2 auctionResponseFetcher, InterfaceC0607uc networkLoadApi, InterfaceC0560s1 analytics, InterfaceC0309e0<InterstitialAd> adObjectFactory, InterfaceC0414jg.c timerFactory, Executor taskFinishedExecutor) {
        kotlin.jvm.internal.n.f(adRequest, "adRequest");
        kotlin.jvm.internal.n.f(loadTaskConfig, "loadTaskConfig");
        kotlin.jvm.internal.n.f(adLoadTaskListener, "adLoadTaskListener");
        kotlin.jvm.internal.n.f(auctionResponseFetcher, "auctionResponseFetcher");
        kotlin.jvm.internal.n.f(networkLoadApi, "networkLoadApi");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(adObjectFactory, "adObjectFactory");
        kotlin.jvm.internal.n.f(timerFactory, "timerFactory");
        kotlin.jvm.internal.n.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.f31295a = adRequest;
        this.f31296b = loadTaskConfig;
        this.f31297c = adLoadTaskListener;
        this.f31298d = auctionResponseFetcher;
        this.f31299e = networkLoadApi;
        this.f31300f = analytics;
        this.f31301g = adObjectFactory;
        this.f31302h = timerFactory;
        this.f31303i = taskFinishedExecutor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> mapA = R5.f27122a.a(bundle);
        for (String str : mapA.keySet()) {
            InterfaceC0435l1.c.f29094a.a(new C0489o1.l(wi.d.i(str, X3.j.f27830b, String.valueOf(mapA.get(str))))).a(this.f31300f);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.f31304j = new C0350g5();
        this.f31300f.a(new C0489o1.s(this.f31296b.f()), new C0489o1.n(this.f31296b.g().b()), new C0489o1.b(this.f31295a.getAdId$mediationsdk_release()));
        InterfaceC0435l1.c.f29094a.a().a(this.f31300f);
        a(this.f31295a.getExtraParams());
        long jH = this.f31296b.h();
        InterfaceC0414jg.c cVar = this.f31302h;
        InterfaceC0414jg.b bVar = new InterfaceC0414jg.b();
        bVar.b(jH);
        InterfaceC0414jg interfaceC0414jgA = cVar.a(bVar);
        this.f31305k = interfaceC0414jgA;
        if (interfaceC0414jgA != null) {
            interfaceC0414jgA.a(new a());
        }
        Object objA = this.f31298d.a();
        Throwable thA = wj.h.a(objA);
        if (thA != null) {
            a(((C0263b8) thA).a());
            objA = null;
        }
        C0454m2 c0454m2 = (C0454m2) objA;
        if (c0454m2 == null) {
            return;
        }
        InterfaceC0560s1 interfaceC0560s1 = this.f31300f;
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
        EnumC0515p9 enumC0515p9G = this.f31296b.g();
        C0261b6 c0261b6 = new C0261b6();
        c0261b6.a(this);
        K9 k9A = new L9(this.f31295a.getProviderName$mediationsdk_release().value(), c0261b6).a(enumC0515p9G.b(EnumC0515p9.Bidder)).b(this.f31296b.i()).a(this.f31295a.getAdId$mediationsdk_release()).a(xj.b0.T(new C0482nc().a(), R5.f27122a.a(this.f31295a.getExtraParams()))).a();
        InterfaceC0560s1 interfaceC0560s2 = this.f31300f;
        String strE = k9A.e();
        kotlin.jvm.internal.n.e(strE, "adInstance.id");
        interfaceC0560s2.a(new C0489o1.b(strE));
        C0643wc c0643wc = new C0643wc(c0454m2, this.f31296b.j());
        this.l = new Y1(new C0479n9(this.f31295a.getInstanceId(), enumC0515p9G.b(), c0454m2.a()), new com.ironsource.mediationsdk.d(), c0454m2.c());
        InterfaceC0435l1.d.f29103a.c().a(this.f31300f);
        this.f31299e.a(k9A, c0643wc);
    }

    public /* synthetic */ C0676y9(InterstitialAdRequest interstitialAdRequest, Cb cb2, V v4, InterfaceC0508p2 interfaceC0508p2, InterfaceC0607uc interfaceC0607uc, InterfaceC0560s1 interfaceC0560s1, InterfaceC0309e0 interfaceC0309e0, InterfaceC0414jg.c cVar, Executor executor, int i10, kotlin.jvm.internal.g gVar) {
        this(interstitialAdRequest, cb2, v4, interfaceC0508p2, interfaceC0607uc, interfaceC0560s1, interfaceC0309e0, (i10 & 128) != 0 ? new InterfaceC0414jg.d() : cVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? R7.f27125a.d() : executor);
    }

    @Override // com.ironsource.InterfaceC0279c6
    public void a(K9 adInstance) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        try {
            this.f31303i.execute(new si(2, this, adInstance));
        } catch (Exception e10) {
            a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0676y9 this$0, K9 adInstance) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstance, "$adInstance");
        if (this$0.f31306m) {
            return;
        }
        this$0.f31306m = true;
        InterfaceC0414jg interfaceC0414jg = this$0.f31305k;
        if (interfaceC0414jg != null) {
            interfaceC0414jg.cancel();
        }
        C0350g5 c0350g5 = this$0.f31304j;
        if (c0350g5 != null) {
            InterfaceC0435l1.c.f29094a.a(new C0489o1.f(C0350g5.a(c0350g5))).a(this$0.f31300f);
            Y1 y10 = this$0.l;
            if (y10 != null) {
                y10.c("onAdInstanceDidLoad");
            }
            InterfaceC0309e0<InterstitialAd> interfaceC0309e0 = this$0.f31301g;
            Y1 y11 = this$0.l;
            kotlin.jvm.internal.n.c(y11);
            this$0.f31297c.a(interfaceC0309e0.a(adInstance, y11));
            return;
        }
        kotlin.jvm.internal.n.l("taskStartedTime");
        throw null;
    }

    @Override // com.ironsource.InterfaceC0279c6
    public void a(String description) {
        kotlin.jvm.internal.n.f(description, "description");
        a(C0600u5.f30795a.c(description));
    }

    public final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        try {
            this.f31303i.execute(new si(1, this, error));
        } catch (Exception e10) {
            a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0676y9 this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        if (this$0.f31306m) {
            return;
        }
        this$0.f31306m = true;
        InterfaceC0414jg interfaceC0414jg = this$0.f31305k;
        if (interfaceC0414jg != null) {
            interfaceC0414jg.cancel();
        }
        InterfaceC0435l1.c.a aVar = InterfaceC0435l1.c.f29094a;
        C0489o1.j jVar = new C0489o1.j(error.getErrorCode());
        C0489o1.k kVar = new C0489o1.k(error.getErrorMessage());
        C0350g5 c0350g5 = this$0.f31304j;
        if (c0350g5 != null) {
            aVar.a(jVar, kVar, new C0489o1.f(C0350g5.a(c0350g5))).a(this$0.f31300f);
            Y1 y10 = this$0.l;
            if (y10 != null) {
                y10.a("onAdInstanceDidFailToLoad");
            }
            this$0.f31297c.b(error);
            return;
        }
        kotlin.jvm.internal.n.l("taskStartedTime");
        throw null;
    }

    private final void a(Exception exc) {
        IronSourceError ironSourceErrorBuildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC0435l1.d.f29103a.a(new C0489o1.k(ironSourceErrorBuildLoadFailedError.getErrorMessage())).a(this.f31300f);
        IronLog.CALLBACK.error(ironSourceErrorBuildLoadFailedError.getErrorMessage());
    }
}
