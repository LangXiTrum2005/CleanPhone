package com.p004ironsource;

import android.os.Bundle;
import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170'\u0012\b\b\u0002\u0010.\u001a\u00020+\u0012\b\b\u0002\u00102\u001a\u00020/¢\u0006\u0004\bC\u0010DJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lcom/ironsource/rr;", "Lcom/ironsource/dn;", "Lcom/ironsource/cd;", "Landroid/os/Bundle;", "extraParams", "", "a", "start", "Lcom/ironsource/zj;", d9.h.p0, "", "description", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;", "adRequest", "Lcom/ironsource/en;", "b", "Lcom/ironsource/en;", "loadTaskConfig", "Lcom/ironsource/s0;", "Lcom/unity3d/ironsourceads/rewarded/RewardedAd;", "c", "Lcom/ironsource/s0;", "adLoadTaskListener", "Lcom/ironsource/l5;", "d", "Lcom/ironsource/l5;", "auctionResponseFetcher", "Lcom/ironsource/xo;", "e", "Lcom/ironsource/xo;", "networkLoadApi", "Lcom/ironsource/o3;", f.j, "Lcom/ironsource/o3;", "analytics", "Lcom/ironsource/b1;", g.f40227p, "Lcom/ironsource/b1;", "adObjectFactory", "Lcom/ironsource/dw$c;", h.f36614b, "Lcom/ironsource/dw$c;", "timerFactory", "Ljava/util/concurrent/Executor;", i.f37957c, "Ljava/util/concurrent/Executor;", "taskFinishedExecutor", "Lcom/ironsource/ib;", "j", "Lcom/ironsource/ib;", "taskStartedTime", "Lcom/ironsource/dw;", "k", "Lcom/ironsource/dw;", "loadTimeoutTimer", "Lcom/ironsource/v4;", "l", "Lcom/ironsource/v4;", "auctionDataReporter", "", "m", "Z", "isTaskFinished", "<init>", "(Lcom/unity3d/ironsourceads/rewarded/RewardedAdRequest;Lcom/ironsource/en;Lcom/ironsource/s0;Lcom/ironsource/l5;Lcom/ironsource/xo;Lcom/ironsource/o3;Lcom/ironsource/b1;Lcom/ironsource/dw$c;Ljava/util/concurrent/Executor;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rr implements dn, cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RewardedAdRequest adRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final en loadTaskConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s0<RewardedAd> adLoadTaskListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final l5 auctionResponseFetcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xo networkLoadApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final o3 analytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final b1<RewardedAd> adObjectFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final dw.c timerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Executor taskFinishedExecutor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ib taskStartedTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private dw loadTimeoutTimer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private v4 auctionDataReporter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private boolean isTaskFinished;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/rr$a", "Lcom/ironsource/dw$a;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements dw.a {
        public a() {
        }

        @Override // com.ironsource.dw.a
        public void a() {
            rr.this.a(wb.f27568a.s());
        }
    }

    public rr(RewardedAdRequest adRequest, en loadTaskConfig, s0<RewardedAd> adLoadTaskListener, l5 auctionResponseFetcher, xo networkLoadApi, o3 analytics, b1<RewardedAd> adObjectFactory, dw.c timerFactory, Executor taskFinishedExecutor) {
        Intrinsics.f(adRequest, "adRequest");
        Intrinsics.f(loadTaskConfig, "loadTaskConfig");
        Intrinsics.f(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.f(auctionResponseFetcher, "auctionResponseFetcher");
        Intrinsics.f(networkLoadApi, "networkLoadApi");
        Intrinsics.f(analytics, "analytics");
        Intrinsics.f(adObjectFactory, "adObjectFactory");
        Intrinsics.f(timerFactory, "timerFactory");
        Intrinsics.f(taskFinishedExecutor, "taskFinishedExecutor");
        this.adRequest = adRequest;
        this.loadTaskConfig = loadTaskConfig;
        this.adLoadTaskListener = adLoadTaskListener;
        this.auctionResponseFetcher = auctionResponseFetcher;
        this.networkLoadApi = networkLoadApi;
        this.analytics = analytics;
        this.adObjectFactory = adObjectFactory;
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

    @Override // com.p004ironsource.dn
    public void start() {
        this.taskStartedTime = new ib();
        this.analytics.a(new k3.s(this.loadTaskConfig.f()), new k3.n(this.loadTaskConfig.g().getValue()), new k3.b(this.adRequest.getCom.ironsource.sdk.controller.f.b.c java.lang.String()));
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
        bd bdVar = new bd();
        bdVar.a(this);
        zj zjVarA = new ak(this.adRequest.getProviderName().value(), bdVar).a(ejVarG.b(ej.Bidder)).b(this.loadTaskConfig.i()).c().a(this.adRequest.getCom.ironsource.sdk.controller.f.b.c java.lang.String()).a(MapsKt.m(new qo().a(), rc.f26667a.a(this.adRequest.getExtraParams()))).a();
        o3 o3Var2 = this.analytics;
        String strE = zjVarA.e();
        Intrinsics.e(strE, "adInstance.id");
        o3Var2.a(new k3.b(strE));
        zo zoVar = new zo(i5Var, this.loadTaskConfig.j());
        this.auctionDataReporter = new v4(new dj(this.adRequest.getInstanceId(), ejVarG.getValue(), i5Var.a()), new d(), i5Var.getAuctionReportUrls());
        h3.d.INSTANCE.c().a(this.analytics);
        this.networkLoadApi.a(zjVarA, zoVar);
    }

    public /* synthetic */ rr(RewardedAdRequest rewardedAdRequest, en enVar, s0 s0Var, l5 l5Var, xo xoVar, o3 o3Var, b1 b1Var, dw.c cVar, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, enVar, s0Var, l5Var, xoVar, o3Var, b1Var, (i2 & 128) != 0 ? new dw.d() : cVar, (i2 & 256) != 0 ? pg.f26494a.c() : executor);
    }

    public final void a(IronSourceError error) {
        Intrinsics.f(error, "error");
        this.taskFinishedExecutor.execute(new G0(27, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rr this$0, IronSourceError error) {
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
            v4Var.a("onAdInstanceLoadFail");
        }
        this$0.adLoadTaskListener.onAdLoadFailed(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(rr this$0, zj adInstance) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInstance, "$adInstance");
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
            v4Var.b("onAdInstanceLoadSuccess");
        }
        b1<RewardedAd> b1Var = this$0.adObjectFactory;
        v4 v4Var2 = this$0.auctionDataReporter;
        Intrinsics.c(v4Var2);
        this$0.adLoadTaskListener.a(b1Var.a(adInstance, v4Var2));
    }

    @Override // com.p004ironsource.cd
    public void a(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        this.taskFinishedExecutor.execute(new G0(26, this, adInstance));
    }

    @Override // com.p004ironsource.cd
    public void a(String description) {
        Intrinsics.f(description, "description");
        a(wb.f27568a.c(description));
    }
}
