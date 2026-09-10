package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q0.b;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\tB7\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\bD\u0010EJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u001c\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00102R\u001a\u00105\u001a\u000601R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006F"}, d2 = {"Lcom/ironsource/cw;", "Lcom/ironsource/i7;", "Lcom/ironsource/k2;", "Lcom/ironsource/w1;", "", "j", "", "Lcom/ironsource/iq;", "triggers", "a", "([Lcom/ironsource/iq;)V", "l", h.f36614b, "k", f.j, "Lcom/ironsource/r1;", "adUnitCallback", "c", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "b", "e", g.f40227p, "Lcom/ironsource/m1;", "d", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/w6;", "Lcom/ironsource/w6;", "bannerContainer", "Lcom/ironsource/l7;", "Lcom/ironsource/l7;", "bannerStrategyListener", "Lcom/ironsource/n6;", "Lcom/ironsource/n6;", "bannerAdUnitFactory", "Lcom/ironsource/kw;", "Lcom/ironsource/kw;", "taskScheduler", "Lcom/ironsource/v3;", i.f37957c, "Lcom/ironsource/v3;", "appLifecycleTrigger", "Lcom/ironsource/ax;", "Lcom/ironsource/ax;", "viewVisibilityTrigger", "Lcom/ironsource/mn;", "Lcom/ironsource/mn;", "manualTrigger", "Lcom/ironsource/cw$a;", "Lcom/ironsource/cw$a;", "currentBanner", "m", "nextBanner", "", dc.q, "Z", "isShowCountdownFinished", "o", "isFirstShow", "p", "Lcom/ironsource/r1;", "q", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "Lcom/ironsource/i7$b;", b.i0, "Lcom/ironsource/j6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/w6;Lcom/ironsource/i7$b;Lcom/ironsource/j6;Lcom/ironsource/l7;Lcom/ironsource/n6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cw extends i7 implements k2, w1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w6 bannerContainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final l7 bannerStrategyListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final n6 bannerAdUnitFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private kw taskScheduler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final v3 appLifecycleTrigger;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final ax viewVisibilityTrigger;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final mn manualTrigger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private a currentBanner;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private a nextBanner;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isShowCountdownFinished;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean isFirstShow;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private r1 adUnitCallback;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private IronSourceError error;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f\"\u0004\b\u0006\u0010\u0010R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\n\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/ironsource/cw$a;", "", "", "e", "", "isPublisherDestroy", "a", "d", "Lcom/ironsource/l6;", "Lcom/ironsource/l6;", "b", "()Lcom/ironsource/l6;", "bannerAdUnit", "Lcom/ironsource/r1;", "Lcom/ironsource/r1;", "()Lcom/ironsource/r1;", "(Lcom/ironsource/r1;)V", "adUnitCallback", "c", "Z", "()Z", "(Z)V", "isLoading", "Lcom/ironsource/n6;", "bannerAdUnitFactory", "isPublisherLoad", "<init>", "(Lcom/ironsource/cw;Lcom/ironsource/n6;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l6 bannerAdUnit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public r1 adUnitCallback;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isLoading;
        final /* synthetic */ cw d;

        public a(cw cwVar, n6 bannerAdUnitFactory, boolean z2) {
            Intrinsics.f(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.d = cwVar;
            this.bannerAdUnit = bannerAdUnitFactory.a(z2);
            this.isLoading = true;
        }

        public final r1 a() {
            r1 r1Var = this.adUnitCallback;
            if (r1Var != null) {
                return r1Var;
            }
            Intrinsics.m("adUnitCallback");
            throw null;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final l6 getBannerAdUnit() {
            return this.bannerAdUnit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final boolean d() {
            return this.bannerAdUnit.d().getIsReady();
        }

        public final void e() {
            this.bannerAdUnit.a((k2) this.d);
        }

        public final void a(r1 r1Var) {
            Intrinsics.f(r1Var, "<set-?>");
            this.adUnitCallback = r1Var;
        }

        public final void b(boolean z2) {
            this.isLoading = z2;
        }

        public final void a(boolean isPublisherDestroy) {
            this.bannerAdUnit.a(isPublisherDestroy);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(m1 adTools, w6 bannerContainer, i7.b config, j6 bannerAdProperties, l7 bannerStrategyListener, n6 bannerAdUnitFactory) {
        super(config, bannerAdProperties);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(bannerContainer, "bannerContainer");
        Intrinsics.f(config, "config");
        Intrinsics.f(bannerAdProperties, "bannerAdProperties");
        Intrinsics.f(bannerStrategyListener, "bannerStrategyListener");
        Intrinsics.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        this.adTools = adTools;
        this.bannerContainer = bannerContainer;
        this.bannerStrategyListener = bannerStrategyListener;
        this.bannerAdUnitFactory = bannerAdUnitFactory;
        IronLog.INTERNAL.verbose(m1.a(adTools, "refresh interval: " + i() + ", auto refresh: " + d(), (String) null, 2, (Object) null));
        this.appLifecycleTrigger = new v3(adTools.b());
        this.viewVisibilityTrigger = new ax(bannerContainer);
        this.manualTrigger = new mn(d() ^ true);
        this.nextBanner = new a(this, bannerAdUnitFactory, true);
        this.isFirstShow = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cw this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.isShowCountdownFinished = true;
        if (this$0.nextBanner.d()) {
            this$0.l();
        } else {
            if (this$0.nextBanner.getIsLoading()) {
                return;
            }
            this$0.k();
            this$0.h();
            this$0.a(this$0.appLifecycleTrigger, this$0.manualTrigger);
        }
    }

    private final void l() {
        this.isFirstShow = false;
        this.nextBanner.getBannerAdUnit().a(this.bannerContainer.getViewBinder(), this);
        this.bannerStrategyListener.a(this.nextBanner.a());
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(false);
        }
        this.currentBanner = this.nextBanner;
        h();
        a(this.viewVisibilityTrigger, this.appLifecycleTrigger, this.manualTrigger);
    }

    @Override // com.p004ironsource.w1
    public void b() {
        this.bannerStrategyListener.l();
    }

    @Override // com.p004ironsource.i7
    public void c() {
        if (d()) {
            this.manualTrigger.e();
        }
    }

    @Override // com.p004ironsource.i7
    public void e() {
        if (d()) {
            this.manualTrigger.f();
        }
    }

    @Override // com.p004ironsource.i7
    public void f() {
        this.nextBanner.e();
    }

    @Override // com.p004ironsource.i7
    public void g() {
        this.appLifecycleTrigger.e();
        this.viewVisibilityTrigger.e();
        kw kwVar = this.taskScheduler;
        if (kwVar != null) {
            kwVar.c();
        }
        this.taskScheduler = null;
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(true);
        }
        this.nextBanner.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cw this$0, iq[] triggers) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(triggers, "$triggers");
        kw kwVar = this$0.taskScheduler;
        if (kwVar != null) {
            kwVar.c();
        }
        this$0.taskScheduler = new kw(this$0.adTools, new I(this$0, 0), this$0.i(), ArraysKt.M(triggers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cw this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.j();
    }

    private final void h() {
        if (d()) {
            a aVar = new a(this, this.bannerAdUnitFactory, false);
            this.nextBanner = aVar;
            aVar.e();
        }
    }

    private final void j() {
        this.adTools.a(new I(this, 1));
    }

    private final void k() {
        this.bannerStrategyListener.c(this.error);
        this.adUnitCallback = null;
        this.error = null;
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        this.nextBanner.a(adUnitCallback);
        this.nextBanner.b(false);
        if (this.isShowCountdownFinished || this.isFirstShow) {
            l();
        }
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.nextBanner.b(false);
        this.error = error;
        if (this.isFirstShow) {
            k();
            a(this.appLifecycleTrigger, this.manualTrigger);
        } else if (this.isShowCountdownFinished) {
            k();
            h();
            a(this.appLifecycleTrigger, this.manualTrigger);
        }
    }

    @Override // com.p004ironsource.w1
    public void b(IronSourceError error) {
        this.bannerStrategyListener.d(error);
    }

    private final void a(iq... triggers) {
        this.isShowCountdownFinished = false;
        this.adTools.c(new G0(8, this, triggers));
    }
}
