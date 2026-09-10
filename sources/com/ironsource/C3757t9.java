package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3757t9 implements InterfaceC3418a6 {
    private H9 a;
    private InterfaceC3448c0 b;
    private Z1 c;
    private InterfaceC3732s1 d;
    private InterfaceC3532gc e;
    private Pf f;
    private K8 g;
    private K8.a h;
    private final Map<String, C3757t9> i;
    private InterstitialAdInfo j;
    private InterfaceC3774u9 k;

    public C3757t9(H9 adInstance, InterfaceC3448c0 adNetworkShow, Z1 auctionDataReporter, InterfaceC3732s1 analytics, InterfaceC3532gc networkDestroyAPI, Pf threadManager, K8 sessionDepthService, K8.a sessionDepthServiceEditor, Map<String, C3757t9> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.a = adInstance;
        this.b = adNetworkShow;
        this.c = auctionDataReporter;
        this.d = analytics;
        this.e = networkDestroyAPI;
        this.f = threadManager;
        this.g = sessionDepthService;
        this.h = sessionDepthServiceEditor;
        this.i = retainer;
        String strF = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(strF, "adInstance.instanceId");
        String strE = this.a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        this.j = new InterstitialAdInfo(strF, strE);
        Y5 y5 = new Y5();
        this.a.a(y5);
        y5.a(this);
    }

    public final void a(InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.j = interstitialAdInfo;
    }

    public final InterstitialAdInfo b() {
        return this.j;
    }

    public final InterfaceC3774u9 c() {
        return this.k;
    }

    public final boolean d() {
        boolean zA = this.b.a(this.a);
        InterfaceC3610l1.a.a.a(zA).a(this.d);
        return zA;
    }

    public final void finalize() {
        a();
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC3610l1.a.a.f(new InterfaceC3682p1[0]).a(this.d);
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void onAdInstanceDidClick() {
        InterfaceC3610l1.a.a.a().a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.likeable
            @Override // java.lang.Runnable
            public final void run() {
                C3757t9.b(this.f23302kowloon);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void onAdInstanceDidDismiss() {
        this.i.remove(this.j.getAdId());
        InterfaceC3610l1.a.a.a(new InterfaceC3682p1[0]).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.genii
            @Override // java.lang.Runnable
            public final void run() {
                C3757t9.c(this.f23245kowloon);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void onAdInstanceDidShow() {
        K8 k8 = this.g;
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        InterfaceC3610l1.a.a.b(new C3664o1.w(k8.a(aVar))).a(this.d);
        this.h.b(aVar);
        this.c.b("onAdInstanceDidShow");
        this.f.a(new Runnable() { // from class: com.ironsource.homophylic
            @Override // java.lang.Runnable
            public final void run() {
                C3757t9.d(this.f23255kowloon);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C3757t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC3774u9 interfaceC3774u9 = this$0.k;
        if (interfaceC3774u9 != null) {
            interfaceC3774u9.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3757t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC3774u9 interfaceC3774u9 = this$0.k;
        if (interfaceC3774u9 != null) {
            interfaceC3774u9.onAdInstanceDidDismiss();
        }
    }

    public final void a(InterfaceC3774u9 interfaceC3774u9) {
        this.k = interfaceC3774u9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C3757t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC3774u9 interfaceC3774u9 = this$0.k;
        if (interfaceC3774u9 != null) {
            interfaceC3774u9.onAdInstanceDidShow();
        }
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.i.put(this.j.getAdId(), this);
        if (!this.b.a(this.a)) {
            a(C3753t5.a.t());
        } else {
            InterfaceC3610l1.a.a.d(new InterfaceC3682p1[0]).a(this.d);
            this.b.a(activity, this.a);
        }
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void a(String str) {
        a(C3753t5.a.c(new IronSourceError(0, str)));
    }

    private final void a(final IronSourceError ironSourceError) {
        this.i.remove(this.j.getAdId());
        InterfaceC3610l1.a.a.a(new C3664o1.j(ironSourceError.getErrorCode()), new C3664o1.k(ironSourceError.getErrorMessage())).a(this.d);
        this.f.a(new Runnable() { // from class: com.ironsource.saccharic
            @Override // java.lang.Runnable
            public final void run() {
                C3757t9.a(this.f23402kowloon, ironSourceError);
            }
        });
    }

    public /* synthetic */ C3757t9(H9 h9, InterfaceC3448c0 interfaceC3448c0, Z1 z1, InterfaceC3732s1 interfaceC3732s1, InterfaceC3532gc interfaceC3532gc, Pf pf, K8 k8, K8.a aVar, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(h9, interfaceC3448c0, z1, interfaceC3732s1, (i & 16) != 0 ? new C3550hc() : interfaceC3532gc, (i & 32) != 0 ? P7.a : pf, (i & 64) != 0 ? Gb.s.d().s() : k8, (i & 128) != 0 ? Gb.s.a().i() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3757t9 this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        InterfaceC3774u9 interfaceC3774u9 = this$0.k;
        if (interfaceC3774u9 != null) {
            interfaceC3774u9.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a() {
        Pf.a(this.f, new Runnable() { // from class: com.ironsource.alloy
            @Override // java.lang.Runnable
            public final void run() {
                C3757t9.a(this.f23137kowloon);
            }
        }, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3757t9 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC3610l1.d.a.b().a(this$0.d);
        this$0.e.a(this$0.a);
    }

    @Override // com.ironsource.InterfaceC3418a6
    public void onAdInstanceDidReward(String str, int i) {
    }
}
