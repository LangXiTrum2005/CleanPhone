package com.p004ironsource;

import android.graphics.Rect;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00100\u001a\u00020\u0010\u0012\u0006\u00102\u001a\u00020\u0010\u0012\u0006\u00107\u001a\u000203\u0012\u0006\u0010<\u001a\u00020\u001b\u0012\u0006\u0010A\u001a\u00020=\u0012\b\b\u0002\u0010G\u001a\u00020B\u0012\b\b\u0002\u0010L\u001a\u00020H¢\u0006\u0004\bc\u0010dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0005\u0010\bJC\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0005\u0010\u0012JC\u0010\u0005\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0005\u0010\u0016J)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0005\u0010\u0017J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016R\u001a\u0010&\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b\u0005\u0010%R\u001a\u0010,\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00100\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010-\u001a\u0004\b1\u0010/R\u001a\u00107\u001a\u0002038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u00104\u001a\u0004\b5\u00106R\"\u0010<\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010:\"\u0004\b(\u0010;R\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010G\u001a\u00020B8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010L\u001a\u00020H8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010I\u001a\u0004\bJ\u0010KR\"\u0010R\u001a\u00020M8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bC\u0010P\"\u0004\b\u0005\u0010QR\"\u0010W\u001a\u00020S8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010T\u001a\u0004\bN\u0010U\"\u0004\b\u0005\u0010VR\"\u0010\\\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010Y\u001a\u0004\b(\u0010Z\"\u0004\b\u0005\u0010[R\"\u0010b\u001a\u00020]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010^\u001a\u0004\b_\u0010`\"\u0004\b\u0005\u0010a¨\u0006e"}, d2 = {"Lcom/ironsource/nl;", "Lcom/ironsource/kl;", "Lcom/ironsource/j7;", "reloadReason", "", "a", "", PglCryptUtils.KEY_MESSAGE, "(Ljava/lang/String;)V", "Lcom/ironsource/r1;", "adUnitCallback", "Lcom/ironsource/l6;", "currentAdUnit", "previousAdUnit", "", "isAutoRefreshPaused", "", "reloadStart", "(Lcom/ironsource/r1;Lcom/ironsource/l6;Lcom/ironsource/l6;Lcom/ironsource/j7;ZLjava/lang/Long;)V", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "shouldCheckVisibility", "(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/l6;Lcom/ironsource/j7;ZZLjava/lang/Long;)V", "(Lcom/ironsource/l6;Lcom/ironsource/j7;Ljava/lang/Long;)V", "(Lcom/ironsource/l6;Lcom/ironsource/j7;)V", "t", "()V", "Lcom/ironsource/ll;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, f.j, g.f40227p, i.f37957c, "d", "c", "e", "Lcom/ironsource/m1;", "Lcom/ironsource/m1;", "()Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/w6;", "b", "Lcom/ironsource/w6;", "m", "()Lcom/ironsource/w6;", "bannerContainer", "J", dc.q, "()J", v6.d, "s", "visibilityCheckerInterval", "Lcom/ironsource/j6;", "Lcom/ironsource/j6;", "k", "()Lcom/ironsource/j6;", "bannerAdProperties", "Lcom/ironsource/ll;", "p", "()Lcom/ironsource/ll;", "(Lcom/ironsource/ll;)V", "strategyListener", "Lcom/ironsource/n6;", "Lcom/ironsource/n6;", "l", "()Lcom/ironsource/n6;", "bannerAdUnitFactory", "Lcom/ironsource/zu;", h.f36614b, "Lcom/ironsource/zu;", "q", "()Lcom/ironsource/zu;", "taskScheduler", "Lcom/ironsource/aw;", "Lcom/ironsource/aw;", "r", "()Lcom/ironsource/aw;", "timeProvider", "Lcom/ironsource/k2;", "j", "Lcom/ironsource/k2;", "()Lcom/ironsource/k2;", "(Lcom/ironsource/k2;)V", "adUnitLoadListener", "Lcom/ironsource/w1;", "Lcom/ironsource/w1;", "()Lcom/ironsource/w1;", "(Lcom/ironsource/w1;)V", "adUnitShowListener", "Lcom/ironsource/o6;", "Lcom/ironsource/o6;", "()Lcom/ironsource/o6;", "(Lcom/ironsource/o6;)V", "adUnitInteractionListener", "Lcom/ironsource/xl;", "Lcom/ironsource/xl;", "o", "()Lcom/ironsource/xl;", "(Lcom/ironsource/xl;)V", "state", "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/w6;JJLcom/ironsource/j6;Lcom/ironsource/ll;Lcom/ironsource/n6;Lcom/ironsource/zu;Lcom/ironsource/aw;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class nl implements kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m1 adTools;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w6 bannerContainer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long refreshInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long visibilityCheckerInterval;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j6 bannerAdProperties;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private ll strategyListener;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final n6 bannerAdUnitFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zu taskScheduler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final aw timeProvider;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private k2 adUnitLoadListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private w1 adUnitShowListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private o6 adUnitInteractionListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private xl state;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/nl$a", "Lcom/ironsource/o6;", "", "a", "c", "b", h.f36614b, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements o6 {
        public a() {
        }

        public void a() {
            nl.this.getStrategyListener().a();
        }

        public void b() {
            nl.this.getStrategyListener().c();
        }

        public void c() {
            nl.this.getStrategyListener().d();
        }

        @Override // com.p004ironsource.i2
        public void h() {
            nl.this.getStrategyListener().e();
        }

        @Override // com.p004ironsource.o6
        public /* bridge */ /* synthetic */ Unit j() {
            a();
            return Unit.f43263a;
        }

        @Override // com.p004ironsource.o6
        public /* bridge */ /* synthetic */ Unit k() {
            c();
            return Unit.f43263a;
        }

        @Override // com.p004ironsource.o6
        public /* bridge */ /* synthetic */ Unit m() {
            b();
            return Unit.f43263a;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, d2 = {"com/ironsource/nl$b", "Lcom/ironsource/k2;", "Lcom/ironsource/r1;", "adUnitCallback", "", "c", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements k2 {
        public b() {
        }

        @Override // com.p004ironsource.k2
        public void a(IronSourceError error) {
            nl.this.getState().a(error);
        }

        @Override // com.p004ironsource.k2
        public void c(r1 adUnitCallback) {
            Intrinsics.f(adUnitCallback, "adUnitCallback");
            nl.this.getState().c(adUnitCallback);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/nl$c", "Lcom/ironsource/w1;", "", "b", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements w1 {
        public c() {
        }

        @Override // com.p004ironsource.w1
        public void b() {
            nl.this.getStrategyListener().d();
        }

        @Override // com.p004ironsource.w1
        public void b(IronSourceError error) {
            nl.this.getStrategyListener().b(error);
        }
    }

    public nl(m1 adTools, w6 bannerContainer, long j, long j2, j6 bannerAdProperties, ll strategyListener, n6 bannerAdUnitFactory, zu taskScheduler, aw timeProvider) {
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(bannerContainer, "bannerContainer");
        Intrinsics.f(bannerAdProperties, "bannerAdProperties");
        Intrinsics.f(strategyListener, "strategyListener");
        Intrinsics.f(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.f(taskScheduler, "taskScheduler");
        Intrinsics.f(timeProvider, "timeProvider");
        this.adTools = adTools;
        this.bannerContainer = bannerContainer;
        this.refreshInterval = j;
        this.visibilityCheckerInterval = j2;
        this.bannerAdProperties = bannerAdProperties;
        this.strategyListener = strategyListener;
        this.bannerAdUnitFactory = bannerAdUnitFactory;
        this.taskScheduler = taskScheduler;
        this.timeProvider = timeProvider;
        this.adUnitLoadListener = new b();
        this.adUnitShowListener = new c();
        this.adUnitInteractionListener = new a();
        this.state = new pl(this, false, 2, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m1 getAdTools() {
        return this.adTools;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o6 getAdUnitInteractionListener() {
        return this.adUnitInteractionListener;
    }

    @Override // com.p004ironsource.kl
    public void c() {
        this.state.c();
    }

    @Override // com.p004ironsource.kl
    public boolean d() {
        return this.state.d();
    }

    @Override // com.p004ironsource.kl
    public void e() {
        this.state.e();
    }

    @Override // com.p004ironsource.kl
    public void f() {
        this.state.f();
    }

    @Override // com.p004ironsource.kl
    public void g() {
        this.state.g();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k2 getAdUnitLoadListener() {
        return this.adUnitLoadListener;
    }

    @Override // com.p004ironsource.kl
    public long i() {
        return this.state.i();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final w1 getAdUnitShowListener() {
        return this.adUnitShowListener;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final j6 getBannerAdProperties() {
        return this.bannerAdProperties;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final n6 getBannerAdUnitFactory() {
        return this.bannerAdUnitFactory;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final w6 getBannerContainer() {
        return this.bannerContainer;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getRefreshInterval() {
        return this.refreshInterval;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final xl getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final ll getStrategyListener() {
        return this.strategyListener;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final zu getTaskScheduler() {
        return this.taskScheduler;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final aw getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getVisibilityCheckerInterval() {
        return this.visibilityCheckerInterval;
    }

    public final void t() {
        this.adTools.getEventSender().getTroubleshoot().h("Banner view is not visible");
    }

    public /* synthetic */ nl(m1 m1Var, w6 w6Var, long j, long j2, j6 j6Var, ll llVar, n6 n6Var, zu zuVar, aw awVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(m1Var, w6Var, j, j2, j6Var, llVar, n6Var, (i2 & 128) != 0 ? new te(Handler.a(m1Var.a())) : zuVar, (i2 & 256) != 0 ? new xu() : awVar);
    }

    private final void a(j7 reloadReason) {
        this.adTools.getEventSender().getTroubleshoot().a(reloadReason.c(), reloadReason.b(), reloadReason.a());
    }

    public final void b(ll llVar) {
        Intrinsics.f(llVar, "<set-?>");
        this.strategyListener = llVar;
    }

    public final void a(k2 k2Var) {
        Intrinsics.f(k2Var, "<set-?>");
        this.adUnitLoadListener = k2Var;
    }

    public final void a(l6 currentAdUnit, j7 reloadReason) {
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(reloadReason, "reloadReason");
        l6 l6VarA = this.bannerAdUnitFactory.a(false);
        ul ulVar = new ul(this, currentAdUnit, l6VarA, this.timeProvider.a());
        a(reloadReason);
        this.state = ulVar;
        l6VarA.a(this.adUnitLoadListener);
    }

    public final void a(l6 currentAdUnit, j7 reloadReason, Long reloadStart) {
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(reloadReason, "reloadReason");
        if (View.a(this.bannerContainer, new Rect())) {
            a(currentAdUnit, reloadReason);
        } else {
            this.state = new rl(this, currentAdUnit, reloadStart);
        }
    }

    @Override // com.p004ironsource.kl
    public void a(ll listener) {
        Intrinsics.f(listener, "listener");
        this.strategyListener = listener;
    }

    public final void a(IronSourceError error, l6 currentAdUnit, j7 reloadReason, boolean shouldCheckVisibility, boolean isAutoRefreshPaused, Long reloadStart) {
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(reloadReason, "reloadReason");
        this.strategyListener.a(error);
        if (isAutoRefreshPaused) {
            this.state = new tl(this, currentAdUnit);
        } else if (shouldCheckVisibility) {
            a(currentAdUnit, reloadReason, reloadStart);
        } else {
            a(currentAdUnit, reloadReason);
        }
    }

    public final void a(o6 o6Var) {
        Intrinsics.f(o6Var, "<set-?>");
        this.adUnitInteractionListener = o6Var;
    }

    public final void a(r1 adUnitCallback, l6 currentAdUnit, l6 previousAdUnit, j7 reloadReason, boolean isAutoRefreshPaused, Long reloadStart) {
        Intrinsics.f(adUnitCallback, "adUnitCallback");
        Intrinsics.f(currentAdUnit, "currentAdUnit");
        Intrinsics.f(reloadReason, "reloadReason");
        currentAdUnit.a(this.bannerContainer.getViewBinder(), this.adUnitShowListener);
        this.strategyListener.a(adUnitCallback);
        if (previousAdUnit != null) {
            previousAdUnit.a(false);
        }
        if (isAutoRefreshPaused) {
            this.state = new tl(this, currentAdUnit);
        } else {
            a(currentAdUnit, reloadReason, reloadStart);
        }
    }

    public final void a(w1 w1Var) {
        Intrinsics.f(w1Var, "<set-?>");
        this.adUnitShowListener = w1Var;
    }

    public final void a(xl xlVar) {
        Intrinsics.f(xlVar, "<set-?>");
        this.state = xlVar;
    }

    public final void a(String message) {
        Intrinsics.f(message, "message");
        this.adTools.getEventSender().getTroubleshoot().f("Banner Reload Strategy - ".concat(message));
    }
}
