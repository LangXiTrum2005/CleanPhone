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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB7\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f¢\u0006\u0004\b:\u0010;J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J#\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\b\u0018\u000100R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00105\u001a\u000600R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102¨\u0006<"}, d2 = {"Lcom/ironsource/bw;", "Lcom/ironsource/i7;", "Lcom/ironsource/k2;", "Lcom/ironsource/w1;", "", "j", h.f36614b, "", "Lcom/ironsource/iq;", "triggers", "a", "([Lcom/ironsource/iq;)V", "Lcom/ironsource/r1;", "adUnitCallback", f.j, "c", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "b", "e", g.f40227p, "Lcom/ironsource/m1;", "d", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/w6;", "Lcom/ironsource/w6;", "bannerContainer", "Lcom/ironsource/l7;", "Lcom/ironsource/l7;", "bannerStrategyListener", "Lcom/ironsource/n6;", "Lcom/ironsource/n6;", "bannerAdUnitFactory", "Lcom/ironsource/kw;", "Lcom/ironsource/kw;", "loadScheduler", "Lcom/ironsource/v3;", i.f37957c, "Lcom/ironsource/v3;", "appLifecycleTrigger", "Lcom/ironsource/ax;", "Lcom/ironsource/ax;", "viewVisibilityTrigger", "Lcom/ironsource/mn;", "k", "Lcom/ironsource/mn;", "manualTrigger", "Lcom/ironsource/bw$a;", "l", "Lcom/ironsource/bw$a;", "currentBanner", "m", "nextBanner", "Lcom/ironsource/i7$b;", b.i0, "Lcom/ironsource/j6;", "bannerAdProperties", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/w6;Lcom/ironsource/i7$b;Lcom/ironsource/j6;Lcom/ironsource/l7;Lcom/ironsource/n6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class bw extends i7 implements k2, w1 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w6 bannerContainer;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final l7 bannerStrategyListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final n6 bannerAdUnitFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private kw loadScheduler;

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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u0006\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ironsource/bw$a;", "", "", "d", "", "isPublisherDestroy", "a", "Lcom/ironsource/h1;", "c", "Lcom/ironsource/l6;", "Lcom/ironsource/l6;", "b", "()Lcom/ironsource/l6;", "bannerAdUnit", "Lcom/ironsource/r1;", "Lcom/ironsource/r1;", "()Lcom/ironsource/r1;", "(Lcom/ironsource/r1;)V", "adUnitCallback", "Lcom/ironsource/n6;", "bannerAdUnitFactory", "isPublisherLoad", "<init>", "(Lcom/ironsource/bw;Lcom/ironsource/n6;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final l6 bannerAdUnit;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public r1 adUnitCallback;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ bw f24474c;

        public a(bw bwVar, n6 bannerAdUnitFactory, boolean z2) {
            Intrinsics.f(bannerAdUnitFactory, "bannerAdUnitFactory");
            this.f24474c = bwVar;
            this.bannerAdUnit = bannerAdUnitFactory.a(z2);
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

        public final h1 c() {
            return this.bannerAdUnit.d();
        }

        public final void d() {
            this.bannerAdUnit.a((k2) this.f24474c);
        }

        public final void a(r1 r1Var) {
            Intrinsics.f(r1Var, "<set-?>");
            this.adUnitCallback = r1Var;
        }

        public final void a(boolean isPublisherDestroy) {
            this.bannerAdUnit.a(isPublisherDestroy);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(m1 adTools, w6 bannerContainer, i7.b config, j6 bannerAdProperties, l7 bannerStrategyListener, n6 bannerAdUnitFactory) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bw this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.h();
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
        this.nextBanner.d();
    }

    @Override // com.p004ironsource.i7
    public void g() {
        this.appLifecycleTrigger.e();
        this.viewVisibilityTrigger.e();
        kw kwVar = this.loadScheduler;
        if (kwVar != null) {
            kwVar.c();
        }
        this.loadScheduler = null;
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(true);
        }
        this.currentBanner = null;
        this.nextBanner.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bw this$0, iq[] triggers) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(triggers, "$triggers");
        this$0.loadScheduler = new kw(this$0.adTools, new F(this$0, 0), this$0.i(), ArraysKt.M(triggers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(bw this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.j();
    }

    private final void h() {
        this.currentBanner = this.nextBanner;
        a aVar = new a(this, this.bannerAdUnitFactory, false);
        this.nextBanner = aVar;
        aVar.d();
    }

    private final void j() {
        this.adTools.a(new F(this, 1));
    }

    @Override // com.p004ironsource.k2
    public void c(r1 adUnitCallback) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        a(adUnitCallback);
        a(this.viewVisibilityTrigger, this.appLifecycleTrigger, this.manualTrigger);
    }

    @Override // com.p004ironsource.k2
    public void a(IronSourceError error) {
        this.bannerStrategyListener.c(error);
        a(this.appLifecycleTrigger, this.manualTrigger);
    }

    @Override // com.p004ironsource.w1
    public void b(IronSourceError error) {
        this.bannerStrategyListener.d(error);
    }

    private final void a(r1 adUnitCallback) {
        this.nextBanner.a(adUnitCallback);
        this.nextBanner.getBannerAdUnit().a(this.bannerContainer.getViewBinder(), this);
        this.bannerStrategyListener.a(this.nextBanner.a());
        a aVar = this.currentBanner;
        if (aVar != null) {
            aVar.a(false);
        }
        this.currentBanner = null;
    }

    private final void a(iq... triggers) {
        this.adTools.c(new G0(4, this, triggers));
    }
}
