package com.p004ironsource;

import android.app.Activity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Be\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\b\b\u0002\u0010)\u001a\u00020&\u0012\b\b\u0002\u0010-\u001a\u00020*\u0012\b\b\u0002\u00101\u001a\u00020.\u0012\b\b\u0002\u00105\u001a\u000202\u0012\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000006¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0005\u0010\u000bJ\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0004R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0000068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u0010?\u001a\u00020:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b\u001c\u0010=\"\u0004\b\u0005\u0010>R$\u0010E\u001a\u0004\u0018\u00010@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b \u0010C\"\u0004\b\u0005\u0010D¨\u0006H"}, d2 = {"Lcom/ironsource/pr;", "Lcom/ironsource/dd;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", "a", "", "d", "()Z", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)V", "onAdInstanceDidShow", "", "description", "onAdInstanceDidBecomeVisible", "()V", "onAdInstanceDidClick", "onAdInstanceDidDismiss", "demandSourceId", "", "amount", "onAdInstanceDidReward", "finalize", "Lcom/ironsource/zj;", "Lcom/ironsource/zj;", d9.h.p0, "Lcom/ironsource/z0;", "b", "Lcom/ironsource/z0;", "adNetworkShow", "Lcom/ironsource/w4;", "c", "Lcom/ironsource/w4;", "auctionDataReporter", "Lcom/ironsource/o3;", "Lcom/ironsource/o3;", "analytics", "Lcom/ironsource/oo;", "e", "Lcom/ironsource/oo;", "networkDestroyAPI", "Lcom/ironsource/zv;", f.j, "Lcom/ironsource/zv;", "threadManager", "Lcom/ironsource/ii;", g.f40227p, "Lcom/ironsource/ii;", "sessionDepthService", "Lcom/ironsource/ii$a;", h.f36614b, "Lcom/ironsource/ii$a;", "sessionDepthServiceEditor", "", i.f37957c, "Ljava/util/Map;", "retainer", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "j", "Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "()Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;", "(Lcom/unity3d/ironsourceads/rewarded/RewardedAdInfo;)V", "adInfo", "Lcom/ironsource/qr;", "k", "Lcom/ironsource/qr;", "()Lcom/ironsource/qr;", "(Lcom/ironsource/qr;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/zj;Lcom/ironsource/z0;Lcom/ironsource/w4;Lcom/ironsource/o3;Lcom/ironsource/oo;Lcom/ironsource/zv;Lcom/ironsource/ii;Lcom/ironsource/ii$a;Ljava/util/Map;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class pr implements dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private zj adInstance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private z0 adNetworkShow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private w4 auctionDataReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private o3 analytics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private oo networkDestroyAPI;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private zv threadManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private ii sessionDepthService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ii.a sessionDepthServiceEditor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<String, pr> retainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private RewardedAdInfo adInfo;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private qr listener;

    public pr(zj adInstance, z0 adNetworkShow, w4 auctionDataReporter, o3 analytics, oo networkDestroyAPI, zv threadManager, ii sessionDepthService, ii.a sessionDepthServiceEditor, Map<String, pr> retainer) {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(adNetworkShow, "adNetworkShow");
        Intrinsics.f(auctionDataReporter, "auctionDataReporter");
        Intrinsics.f(analytics, "analytics");
        Intrinsics.f(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.f(threadManager, "threadManager");
        Intrinsics.f(sessionDepthService, "sessionDepthService");
        Intrinsics.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.f(retainer, "retainer");
        this.adInstance = adInstance;
        this.adNetworkShow = adNetworkShow;
        this.auctionDataReporter = auctionDataReporter;
        this.analytics = analytics;
        this.networkDestroyAPI = networkDestroyAPI;
        this.threadManager = threadManager;
        this.sessionDepthService = sessionDepthService;
        this.sessionDepthServiceEditor = sessionDepthServiceEditor;
        this.retainer = retainer;
        String strF = adInstance.f();
        Intrinsics.e(strF, "adInstance.instanceId");
        String strE = this.adInstance.e();
        Intrinsics.e(strE, "adInstance.id");
        this.adInfo = new RewardedAdInfo(strF, strE);
        bd bdVar = new bd();
        this.adInstance.a(bdVar);
        bdVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(pr this$0) {
        Intrinsics.f(this$0, "this$0");
        qr qrVar = this$0.listener;
        if (qrVar != null) {
            qrVar.onUserEarnedReward();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(pr this$0) {
        Intrinsics.f(this$0, "this$0");
        qr qrVar = this$0.listener;
        if (qrVar != null) {
            qrVar.onRewardedAdShown();
        }
    }

    public final void a() {
        zv.a(this.threadManager, new C0(this, 4), 0L, 2, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RewardedAdInfo getAdInfo() {
        return this.adInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final qr getListener() {
        return this.listener;
    }

    public final void finalize() {
        a();
    }

    @Override // com.p004ironsource.dd
    public void onAdInstanceDidBecomeVisible() {
        h3.a.INSTANCE.f(new l3[0]).a(this.analytics);
    }

    @Override // com.p004ironsource.dd
    public void onAdInstanceDidClick() {
        h3.a.INSTANCE.a().a(this.analytics);
        this.threadManager.a(new C0(this, 0));
    }

    @Override // com.p004ironsource.dd
    public void onAdInstanceDidDismiss() {
        this.retainer.remove(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String());
        h3.a.INSTANCE.a(new l3[0]).a(this.analytics);
        this.threadManager.a(new C0(this, 1));
    }

    @Override // com.p004ironsource.dd
    public void onAdInstanceDidReward(String demandSourceId, int amount) {
        k3.u uVar = new k3.u("Virtual Item");
        k3.t tVar = new k3.t(1);
        k3.q qVar = new k3.q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.adInstance.g());
        Intrinsics.e(transId, "getTransId(System.curren…illis(), adInstance.name)");
        h3.a.INSTANCE.c(uVar, tVar, qVar, new k3.y(transId)).a(this.analytics);
        this.threadManager.a(new C0(this, 2));
    }

    @Override // com.p004ironsource.dd
    public void onAdInstanceDidShow() {
        ii iiVar = this.sessionDepthService;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        h3.a.INSTANCE.b(new k3.w(iiVar.a(ad_unit))).a(this.analytics);
        this.sessionDepthServiceEditor.b(ad_unit);
        this.auctionDataReporter.c("onAdInstanceDidShow");
        this.threadManager.a(new C0(this, 3));
    }

    public /* synthetic */ pr(zj zjVar, z0 z0Var, w4 w4Var, o3 o3Var, oo ooVar, zv zvVar, ii iiVar, ii.a aVar, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(zjVar, z0Var, w4Var, o3Var, (i2 & 16) != 0 ? new po() : ooVar, (i2 & 32) != 0 ? pg.f26494a : zvVar, (i2 & 64) != 0 ? on.INSTANCE.d().k() : iiVar, (i2 & 128) != 0 ? on.INSTANCE.a().e() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(pr this$0) {
        Intrinsics.f(this$0, "this$0");
        qr qrVar = this$0.listener;
        if (qrVar != null) {
            qrVar.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(pr this$0) {
        Intrinsics.f(this$0, "this$0");
        qr qrVar = this$0.listener;
        if (qrVar != null) {
            qrVar.onRewardedAdDismissed();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.f(activity, "activity");
        this.retainer.put(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String(), this);
        if (!this.adNetworkShow.a(this.adInstance)) {
            a(wb.f27568a.t());
        } else {
            h3.a.INSTANCE.d(new l3[0]).a(this.analytics);
            this.adNetworkShow.a(activity, this.adInstance);
        }
    }

    public final boolean d() {
        boolean zA = this.adNetworkShow.a(this.adInstance);
        h3.a.INSTANCE.a(zA).a(this.analytics);
        return zA;
    }

    private final void a(IronSourceError error) {
        this.retainer.remove(this.adInfo.getCom.ironsource.sdk.controller.f.b.c java.lang.String());
        h3.a.INSTANCE.a(new k3.j(error.getErrorCode()), new k3.k(error.getErrorMessage())).a(this.analytics);
        this.threadManager.a(new G0(22, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pr this$0) {
        Intrinsics.f(this$0, "this$0");
        h3.d.INSTANCE.b().a(this$0.analytics);
        this$0.networkDestroyAPI.a(this$0.adInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pr this$0, IronSourceError error) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(error, "$error");
        qr qrVar = this$0.listener;
        if (qrVar != null) {
            qrVar.onRewardedAdFailedToShow(error);
        }
    }

    public final void a(qr qrVar) {
        this.listener = qrVar;
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        Intrinsics.f(rewardedAdInfo, "<set-?>");
        this.adInfo = rewardedAdInfo;
    }

    @Override // com.p004ironsource.dd
    public void a(String description) {
        a(wb.f27568a.c(new IronSourceError(0, description)));
    }
}
