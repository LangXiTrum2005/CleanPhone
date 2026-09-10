package com.p004ironsource;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.H0;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.AdapterUtils;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\u0006\u00102\u001a\u00020/\u0012\b\b\u0002\u00106\u001a\u000203\u0012\b\b\u0002\u0010:\u001a\u000207¢\u0006\u0004\bK\u0010LJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lcom/ironsource/c7;", "Lcom/ironsource/dn;", "Lcom/ironsource/a6;", "Landroid/os/Bundle;", "extraParams", "", "a", "start", "Lcom/ironsource/zj;", d9.h.p0, "Lcom/ironsource/dh;", "adContainer", "onBannerLoadSuccess", "", "description", "onBannerLoadFail", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "Lcom/unity3d/ironsourceads/banner/BannerAdRequest;", "adRequest", "Lcom/unity3d/ironsourceads/AdSize;", "b", "Lcom/unity3d/ironsourceads/AdSize;", "size", "Lcom/ironsource/l5;", "c", "Lcom/ironsource/l5;", "auctionResponseFetcher", "Lcom/ironsource/en;", "d", "Lcom/ironsource/en;", "loadTaskConfig", "Lcom/ironsource/xo;", "e", "Lcom/ironsource/xo;", "networkLoadApi", "Lcom/ironsource/o3;", f.j, "Lcom/ironsource/o3;", "analytics", "Lcom/ironsource/s0;", "Lcom/unity3d/ironsourceads/banner/BannerAdView;", g.f40227p, "Lcom/ironsource/s0;", "adLoadTaskListener", "Lcom/ironsource/d6;", h.f36614b, "Lcom/ironsource/d6;", "adLayoutFactory", "Lcom/ironsource/dw$c;", i.f37957c, "Lcom/ironsource/dw$c;", "timerFactory", "Ljava/util/concurrent/Executor;", "j", "Ljava/util/concurrent/Executor;", "taskFinishedExecutor", "Lcom/ironsource/ib;", "k", "Lcom/ironsource/ib;", "taskStartedTime", "Lcom/ironsource/dw;", "l", "Lcom/ironsource/dw;", "loadTimeoutTimer", "Lcom/ironsource/v4;", "m", "Lcom/ironsource/v4;", "auctionDataReporter", "", dc.q, "Z", "isTaskFinished", "<init>", "(Lcom/unity3d/ironsourceads/banner/BannerAdRequest;Lcom/unity3d/ironsourceads/AdSize;Lcom/ironsource/l5;Lcom/ironsource/en;Lcom/ironsource/xo;Lcom/ironsource/o3;Lcom/ironsource/s0;Lcom/ironsource/d6;Lcom/ironsource/dw$c;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class c7 implements dn, a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BannerAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AdSize size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l5 auctionResponseFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final en loadTaskConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xo networkLoadApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o3 analytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final s0<BannerAdView> adLoadTaskListener;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d6 adLayoutFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final dw.c timerFactory;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final Executor taskFinishedExecutor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private ib taskStartedTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private dw loadTimeoutTimer;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private v4 auctionDataReporter;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isTaskFinished;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/c7$a", "Lcom/ironsource/dw$a;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements dw.a {
        public a() {
        }

        @Override // com.ironsource.dw.a
        public void a() {
            c7.this.a(wb.f27568a.s());
        }
    }

    public c7(BannerAdRequest adRequest, AdSize size, l5 auctionResponseFetcher, en loadTaskConfig, xo networkLoadApi, o3 analytics, s0<BannerAdView> adLoadTaskListener, d6 adLayoutFactory, dw.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.f(adRequest, "adRequest");
        Intrinsics.f(size, "size");
        Intrinsics.f(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.f(loadTaskConfig, "loadTaskConfig");
        Intrinsics.f(networkLoadApi, "networkLoadApi");
        Intrinsics.f(analytics, "analytics");
        Intrinsics.f(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.f(adLayoutFactory, "adLayoutFactory");
        Intrinsics.f(timerFactory, "timerFactory");
        Intrinsics.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.adRequest = adRequest;
        this.size = size;
        this.auctionResponseFetcher = auctionResponseFetcher;
        this.loadTaskConfig = loadTaskConfig;
        this.networkLoadApi = networkLoadApi;
        this.analytics = analytics;
        this.adLoadTaskListener = adLoadTaskListener;
        this.adLayoutFactory = adLayoutFactory;
        this.timerFactory = timerFactory;
        this.taskFinishedExecutor = taskFinishedExecutor;
    }

    private final void a(Bundle extraParams) {
        if (extraParams == null) {
            return;
        }
        Map<String, String> mapA = rc.f26667a.a(extraParams);
        for (String str : mapA.keySet()) {
            String strValueOf = String.valueOf(mapA.get(str));
            h3.c.INSTANCE.a(new k3.l(str + dc.T + strValueOf)).a(this.analytics);
        }
    }

    @Override // com.p004ironsource.a6
    public void onBannerLoadFail(String description) {
        Intrinsics.f(description, "description");
        a(wb.f27568a.c(description));
    }

    @Override // com.p004ironsource.a6
    public void onBannerLoadSuccess(zj adInstance, dh adContainer) {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(adContainer, "adContainer");
        this.taskFinishedExecutor.execute(new H0(this, adInstance, adContainer, 13));
    }

    @Override // com.p004ironsource.dn
    public void start() {
        this.taskStartedTime = new ib();
        this.analytics.a(new k3.s(this.loadTaskConfig.f()), new k3.n(this.loadTaskConfig.g().getValue()), new k3.c(this.size), new k3.b(this.adRequest.getAdId()));
        h3.c.INSTANCE.a().a(this.analytics);
        a(this.adRequest.getExtraParams());
        long jH = this.loadTaskConfig.h();
        dw.c cVar = this.timerFactory;
        dw.b bVar = new dw.b();
        bVar.b(jH);
        dw dwVarA = cVar.a(bVar);
        this.loadTimeoutTimer = dwVarA;
        if (dwVarA != null) {
            dwVarA.a(new a());
        }
        Object objA = this.auctionResponseFetcher.a();
        Throwable thA = Result.a(objA);
        if (thA != null) {
            a(((yg) thA).getError());
            objA = null;
        }
        i5 i5Var = (i5) objA;
        if (i5Var == null) {
            return;
        }
        o3 o3Var = this.analytics;
        String strB = i5Var.getAuctionId();
        if (strB != null) {
            o3Var.a(new k3.d(strB));
        }
        JSONObject jSONObjectF = i5Var.getGenericParams();
        if (jSONObjectF != null) {
            o3Var.a(new k3.m(jSONObjectF));
        }
        String strA = i5Var.a();
        if (strA != null) {
            o3Var.a(new k3.g(strA));
        }
        ej ejVarG = this.loadTaskConfig.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        bh bhVar = new bh(AdapterUtils.dpToPixels(applicationContext, this.size.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.size.getHeight()), this.size.getSizeDescription());
        mp mpVar = new mp();
        mpVar.a(this);
        zj adInstance = new ak(this.adRequest.getProviderName().value(), mpVar).a(ejVarG.b(ej.Bidder)).a(bhVar).b(this.loadTaskConfig.i()).a(this.adRequest.getAdId()).a(MapsKt.m(new qo().a(), rc.f26667a.a(this.adRequest.getExtraParams()))).a();
        zo zoVar = new zo(i5Var, this.loadTaskConfig.j());
        this.auctionDataReporter = new v4(new dj(this.adRequest.getInstanceId(), ejVarG.getValue(), i5Var.a()), new d(), i5Var.getAuctionReportUrls());
        h3.d.INSTANCE.c().a(this.analytics);
        xo xoVar = this.networkLoadApi;
        Intrinsics.e(adInstance, "adInstance");
        xoVar.a(adInstance, zoVar);
    }

    public /* synthetic */ c7(BannerAdRequest bannerAdRequest, AdSize adSize, l5 l5Var, en enVar, xo xoVar, o3 o3Var, s0 s0Var, d6 d6Var, dw.c cVar, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, l5Var, enVar, xoVar, o3Var, s0Var, d6Var, (i2 & 256) != 0 ? new dw.d() : cVar, (i2 & 512) != 0 ? pg.f26494a.c() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, IronSourceError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        if (this$0.isTaskFinished) {
            return;
        }
        this$0.isTaskFinished = true;
        dw dwVar = this$0.loadTimeoutTimer;
        if (dwVar != null) {
            dwVar.cancel();
        }
        h3.c.Companion aVar = h3.c.INSTANCE;
        k3.j jVar = new k3.j(error.getErrorCode());
        k3.k kVar = new k3.k(error.getErrorMessage());
        ib ibVar = this$0.taskStartedTime;
        if (ibVar == null) {
            Intrinsics.m("taskStartedTime");
            throw null;
        }
        aVar.a(jVar, kVar, new k3.f(ib.a(ibVar))).a(this$0.analytics);
        v4 v4Var = this$0.auctionDataReporter;
        if (v4Var != null) {
            v4Var.a("onBannerLoadFail");
        }
        this$0.adLoadTaskListener.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c7 this$0, zj adInstance, dh adContainer) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInstance, "$adInstance");
        Intrinsics.f(adContainer, "$adContainer");
        if (this$0.isTaskFinished) {
            return;
        }
        this$0.isTaskFinished = true;
        dw dwVar = this$0.loadTimeoutTimer;
        if (dwVar != null) {
            dwVar.cancel();
        }
        ib ibVar = this$0.taskStartedTime;
        if (ibVar == null) {
            Intrinsics.m("taskStartedTime");
            throw null;
        }
        h3.c.INSTANCE.a(new k3.f(ib.a(ibVar))).a(this$0.analytics);
        v4 v4Var = this$0.auctionDataReporter;
        if (v4Var != null) {
            v4Var.b("onBannerLoadSuccess");
        }
        d6 d6Var = this$0.adLayoutFactory;
        v4 v4Var2 = this$0.auctionDataReporter;
        Intrinsics.c(v4Var2);
        this$0.adLoadTaskListener.a(d6Var.a(adInstance, adContainer, v4Var2));
    }

    public final void a(IronSourceError error) {
        Intrinsics.f(error, "error");
        this.taskFinishedExecutor.execute(new G0(5, this, error));
    }
}
