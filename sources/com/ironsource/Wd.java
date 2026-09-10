package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wd implements InterfaceC0297d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K9 f27596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0273c0 f27597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Z1 f27598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0560s1 f27599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0446lc f27600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0379hg f27601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private M8 f27602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private M8.a f27603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, Wd> f27604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private RewardedAdInfo f27605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Xd f27606k;

    public Wd(K9 adInstance, InterfaceC0273c0 adNetworkShow, Z1 auctionDataReporter, InterfaceC0560s1 analytics, InterfaceC0446lc networkDestroyAPI, InterfaceC0379hg threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor, Map<String, Wd> retainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.n.f(retainer, "retainer");
        this.f27596a = adInstance;
        this.f27597b = adNetworkShow;
        this.f27598c = auctionDataReporter;
        this.f27599d = analytics;
        this.f27600e = networkDestroyAPI;
        this.f27601f = threadManager;
        this.f27602g = sessionDepthService;
        this.f27603h = sessionDepthServiceEditor;
        this.f27604i = retainer;
        String strF = adInstance.f();
        kotlin.jvm.internal.n.e(strF, "adInstance.instanceId");
        String strE = this.f27596a.e();
        kotlin.jvm.internal.n.e(strE, "adInstance.id");
        this.f27605j = new RewardedAdInfo(strF, strE);
        C0261b6 c0261b6 = new C0261b6();
        this.f27596a.a(c0261b6);
        c0261b6.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Wd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Xd xd2 = this$0.f27606k;
        if (xd2 != null) {
            xd2.onRewardedAdShown();
        }
    }

    public final void a(RewardedAdInfo rewardedAdInfo) {
        kotlin.jvm.internal.n.f(rewardedAdInfo, "<set-?>");
        this.f27605j = rewardedAdInfo;
    }

    public final RewardedAdInfo b() {
        return this.f27605j;
    }

    public final Xd c() {
        return this.f27606k;
    }

    public final boolean d() {
        boolean zA = this.f27597b.a(this.f27596a);
        InterfaceC0435l1.a.f29080a.a(zA).a(this.f27599d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC0435l1.a.f29080a.f(new InterfaceC0507p1[0]).a(this.f27599d);
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidClick() {
        InterfaceC0435l1.a.f29080a.a().a(this.f27599d);
        this.f27601f.a(new ci(this, 1));
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidDismiss() {
        this.f27604i.remove(this.f27605j.getAdId());
        InterfaceC0435l1.a.f29080a.a(new InterfaceC0507p1[0]).a(this.f27599d);
        this.f27601f.a(new ci(this, 3));
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidReward(String str, int i10) {
        C0489o1.u uVar = new C0489o1.u("Virtual Item");
        C0489o1.t tVar = new C0489o1.t(1);
        C0489o1.q qVar = new C0489o1.q("DefaultRewardedVideo");
        String strA = IronSourceUtils.a(System.currentTimeMillis(), this.f27596a.g());
        kotlin.jvm.internal.n.e(strA, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC0435l1.a.f29080a.c(uVar, tVar, qVar, new C0489o1.y(strA)).a(this.f27599d);
        this.f27601f.a(new ci(this, 0));
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidShow() {
        M8 m10 = this.f27602g;
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        InterfaceC0435l1.a.f29080a.b(new C0489o1.w(m10.a(aVar))).a(this.f27599d);
        this.f27603h.b(aVar);
        this.f27598c.b("onAdInstanceDidShow");
        this.f27601f.a(new ci(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Wd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Xd xd2 = this$0.f27606k;
        if (xd2 != null) {
            xd2.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Wd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Xd xd2 = this$0.f27606k;
        if (xd2 != null) {
            xd2.onRewardedAdDismissed();
        }
    }

    public final void a(Xd xd2) {
        this.f27606k = xd2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Wd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Xd xd2 = this$0.f27606k;
        if (xd2 != null) {
            xd2.onUserEarnedReward();
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f27604i.put(this.f27605j.getAdId(), this);
        if (!this.f27597b.a(this.f27596a)) {
            a(C0600u5.f30795a.t());
        } else {
            InterfaceC0435l1.a.f29080a.d(new InterfaceC0507p1[0]).a(this.f27599d);
            this.f27597b.a(activity, this.f27596a);
        }
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void a(String str) {
        a(C0600u5.f30795a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.f27604i.remove(this.f27605j.getAdId());
        InterfaceC0435l1.a.f29080a.a(new C0489o1.j(ironSourceError.getErrorCode()), new C0489o1.k(ironSourceError.getErrorMessage())).a(this.f27599d);
        this.f27601f.a(new ki(13, this, ironSourceError));
    }

    public /* synthetic */ Wd(K9 k10, InterfaceC0273c0 interfaceC0273c0, Z1 z10, InterfaceC0560s1 interfaceC0560s1, InterfaceC0446lc interfaceC0446lc, InterfaceC0379hg interfaceC0379hg, M8 m10, M8.a aVar, Map map, int i10, kotlin.jvm.internal.g gVar) {
        this(k10, interfaceC0273c0, z10, interfaceC0560s1, (i10 & 16) != 0 ? new C0464mc() : interfaceC0446lc, (i10 & 32) != 0 ? R7.f27125a : interfaceC0379hg, (i10 & 64) != 0 ? Kb.f26413u.d().s() : m10, (i10 & 128) != 0 ? Kb.f26413u.a().i() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        Xd xd2 = this$0.f27606k;
        if (xd2 != null) {
            xd2.onRewardedAdFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC0379hg.a(this.f27601f, new ci(this, 4), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Wd this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0435l1.d.f29103a.b().a(this$0.f27599d);
        this$0.f27600e.a(this$0.f27596a);
    }
}
