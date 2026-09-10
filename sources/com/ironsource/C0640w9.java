package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.w9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0640w9 implements InterfaceC0297d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K9 f30933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0273c0 f30934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Z1 f30935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0560s1 f30936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0446lc f30937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0379hg f30938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private M8 f30939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private M8.a f30940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, C0640w9> f30941i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterstitialAdInfo f30942j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC0658x9 f30943k;

    public C0640w9(K9 adInstance, InterfaceC0273c0 adNetworkShow, Z1 auctionDataReporter, InterfaceC0560s1 analytics, InterfaceC0446lc networkDestroyAPI, InterfaceC0379hg threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor, Map<String, C0640w9> retainer) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(adNetworkShow, "adNetworkShow");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.n.f(retainer, "retainer");
        this.f30933a = adInstance;
        this.f30934b = adNetworkShow;
        this.f30935c = auctionDataReporter;
        this.f30936d = analytics;
        this.f30937e = networkDestroyAPI;
        this.f30938f = threadManager;
        this.f30939g = sessionDepthService;
        this.f30940h = sessionDepthServiceEditor;
        this.f30941i = retainer;
        String strF = adInstance.f();
        kotlin.jvm.internal.n.e(strF, "adInstance.instanceId");
        String strE = this.f30933a.e();
        kotlin.jvm.internal.n.e(strE, "adInstance.id");
        this.f30942j = new InterstitialAdInfo(strF, strE);
        C0261b6 c0261b6 = new C0261b6();
        this.f30933a.a(c0261b6);
        c0261b6.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        kotlin.jvm.internal.n.f(interstitialAdInfo, "<set-?>");
        this.f30942j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.f30942j;
    }

    public final InterfaceC0658x9 c() {
        return this.f30943k;
    }

    public final boolean d() {
        boolean zA = this.f30934b.a(this.f30933a);
        InterfaceC0435l1.a.f29080a.a(zA).a(this.f30936d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC0435l1.a.f29080a.f(new InterfaceC0507p1[0]).a(this.f30936d);
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidClick() {
        InterfaceC0435l1.a.f29080a.a().a(this.f30936d);
        this.f30938f.a(new ri(this, 2));
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidDismiss() {
        this.f30941i.remove(this.f30942j.getAdId());
        InterfaceC0435l1.a.f29080a.a(new InterfaceC0507p1[0]).a(this.f30936d);
        this.f30938f.a(new ri(this, 1));
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidShow() {
        M8 m10 = this.f30939g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC0435l1.a.f29080a.b(new C0489o1.w(m10.a(aVar))).a(this.f30936d);
        this.f30940h.b(aVar);
        this.f30935c.b("onAdInstanceDidShow");
        this.f30938f.a(new ri(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C0640w9 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0658x9 interfaceC0658x9 = this$0.f30943k;
        if (interfaceC0658x9 != null) {
            interfaceC0658x9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0640w9 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0658x9 interfaceC0658x9 = this$0.f30943k;
        if (interfaceC0658x9 != null) {
            interfaceC0658x9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC0658x9 interfaceC0658x9) {
        this.f30943k = interfaceC0658x9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C0640w9 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0658x9 interfaceC0658x9 = this$0.f30943k;
        if (interfaceC0658x9 != null) {
            interfaceC0658x9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f30941i.put(this.f30942j.getAdId(), this);
        if (!this.f30934b.a(this.f30933a)) {
            a(C0600u5.f30795a.t());
        } else {
            InterfaceC0435l1.a.f29080a.d(new InterfaceC0507p1[0]).a(this.f30936d);
            this.f30934b.a(activity, this.f30933a);
        }
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void a(String str) {
        a(C0600u5.f30795a.c(new IronSourceError(0, str)));
    }

    private final void a(IronSourceError ironSourceError) {
        this.f30941i.remove(this.f30942j.getAdId());
        InterfaceC0435l1.a.f29080a.a(new C0489o1.j(ironSourceError.getErrorCode()), new C0489o1.k(ironSourceError.getErrorMessage())).a(this.f30936d);
        this.f30938f.a(new si(0, this, ironSourceError));
    }

    public /* synthetic */ C0640w9(K9 k10, InterfaceC0273c0 interfaceC0273c0, Z1 z10, InterfaceC0560s1 interfaceC0560s1, InterfaceC0446lc interfaceC0446lc, InterfaceC0379hg interfaceC0379hg, M8 m10, M8.a aVar, Map map, int i10, kotlin.jvm.internal.g gVar) {
        this(k10, interfaceC0273c0, z10, interfaceC0560s1, (i10 & 16) != 0 ? new C0464mc() : interfaceC0446lc, (i10 & 32) != 0 ? R7.f27125a : interfaceC0379hg, (i10 & 64) != 0 ? Kb.f26413u.d().s() : m10, (i10 & 128) != 0 ? Kb.f26413u.a().i() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0640w9 this$0, IronSourceError error) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(error, "$error");
        InterfaceC0658x9 interfaceC0658x9 = this$0.f30943k;
        if (interfaceC0658x9 != null) {
            interfaceC0658x9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        InterfaceC0379hg.a(this.f30938f, new ri(this, 0), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0640w9 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0435l1.d.f29103a.b().a(this$0.f30936d);
        this$0.f30937e.a(this$0.f30933a);
    }

    @Override // com.ironsource.InterfaceC0297d6
    public void onAdInstanceDidReward(String str, int i10) {
    }
}
