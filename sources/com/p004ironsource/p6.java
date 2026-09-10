package com.p004ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.IronSource;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001BQ\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001e\u0012\b\b\u0002\u0010%\u001a\u00020\"\u0012\b\b\u0002\u0010)\u001a\u00020&¢\u0006\u0004\b;\u0010<J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0004R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b\u0014\u0010-\"\u0004\b\u0003\u0010.R(\u00106\u001a\b\u0012\u0004\u0012\u000201008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b\u001b\u00104\"\u0004\b\u0003\u00105R6\u0010:\u001a\b\u0012\u0004\u0012\u000207002\f\u00108\u001a\b\u0012\u0004\u0012\u000207008\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b\u001f\u00104\"\u0004\b\u0006\u00105¨\u0006="}, d2 = {"Lcom/ironsource/p6;", "Lcom/ironsource/c6;", "com/ironsource/p6$a", "a", "()Lcom/ironsource/p6$a;", "", "b", "()V", "onBannerShowSuccess", "onBannerClick", "finalize", "Lcom/ironsource/zj;", "Lcom/ironsource/zj;", d9.h.p0, "Lcom/ironsource/dh;", "Lcom/ironsource/dh;", "d", "()Lcom/ironsource/dh;", "container", "Lcom/ironsource/v4;", "c", "Lcom/ironsource/v4;", "auctionDataReporter", "Lcom/ironsource/o3;", "Lcom/ironsource/o3;", "analytics", "Lcom/ironsource/oo;", "e", "Lcom/ironsource/oo;", "networkDestroyAPI", "Lcom/ironsource/zv;", f.j, "Lcom/ironsource/zv;", "threadManager", "Lcom/ironsource/ii;", g.f40227p, "Lcom/ironsource/ii;", "sessionDepthService", "Lcom/ironsource/ii$a;", h.f36614b, "Lcom/ironsource/ii$a;", "sessionDepthServiceEditor", "Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", i.f37957c, "Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", "()Lcom/unity3d/ironsourceads/banner/BannerAdInfo;", "(Lcom/unity3d/ironsourceads/banner/BannerAdInfo;)V", "adInfo", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/q6;", "j", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/widget/FrameLayout;", "value", "k", "view", "<init>", "(Lcom/ironsource/zj;Lcom/ironsource/dh;Lcom/ironsource/v4;Lcom/ironsource/o3;Lcom/ironsource/oo;Lcom/ironsource/zv;Lcom/ironsource/ii;Lcom/ironsource/ii$a;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class p6 implements c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zj adInstance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dh container;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v4 auctionDataReporter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final o3 analytics;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oo networkDestroyAPI;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final zv threadManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ii sessionDepthService;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ii.a sessionDepthServiceEditor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private BannerAdInfo adInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private WeakReference<q6> listener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private WeakReference<FrameLayout> view;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/p6$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.f(v, "v");
            bh size = p6.this.getContainer().getSize();
            ((FrameLayout) v).addView(p6.this.getContainer(), 0, new FrameLayout.LayoutParams(size.c(), size.a(), 17));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.f(v, "v");
            ((FrameLayout) v).removeAllViews();
        }
    }

    public p6(zj adInstance, dh container, v4 auctionDataReporter, o3 analytics, oo networkDestroyAPI, zv threadManager, ii sessionDepthService, ii.a sessionDepthServiceEditor) {
        Intrinsics.f(adInstance, "adInstance");
        Intrinsics.f(container, "container");
        Intrinsics.f(auctionDataReporter, "auctionDataReporter");
        Intrinsics.f(analytics, "analytics");
        Intrinsics.f(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.f(threadManager, "threadManager");
        Intrinsics.f(sessionDepthService, "sessionDepthService");
        Intrinsics.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        this.adInstance = adInstance;
        this.container = container;
        this.auctionDataReporter = auctionDataReporter;
        this.analytics = analytics;
        this.networkDestroyAPI = networkDestroyAPI;
        this.threadManager = threadManager;
        this.sessionDepthService = sessionDepthService;
        this.sessionDepthServiceEditor = sessionDepthServiceEditor;
        String strF = adInstance.f();
        Intrinsics.e(strF, "adInstance.instanceId");
        String strE = adInstance.e();
        Intrinsics.e(strE, "adInstance.id");
        this.adInfo = new BannerAdInfo(strF, strE);
        this.listener = new WeakReference<>(null);
        this.view = new WeakReference<>(null);
        mp mpVar = new mp();
        adInstance.a(mpVar);
        mpVar.a(this);
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        zv.a(this.threadManager, new B0(this, 1), 0L, 2, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BannerAdInfo getAdInfo() {
        return this.adInfo;
    }

    public final void finalize() {
        b();
    }

    @Override // com.p004ironsource.c6
    public void onBannerClick() {
        h3.a.INSTANCE.a().a(this.analytics);
        this.threadManager.a(new B0(this, 2));
    }

    @Override // com.p004ironsource.c6
    public void onBannerShowSuccess() {
        ii iiVar = this.sessionDepthService;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
        h3.a.INSTANCE.f(new k3.w(iiVar.a(ad_unit))).a(this.analytics);
        this.sessionDepthServiceEditor.b(ad_unit);
        this.auctionDataReporter.c("onBannerShowSuccess");
        this.threadManager.a(new B0(this, 0));
    }

    public /* synthetic */ p6(zj zjVar, dh dhVar, v4 v4Var, o3 o3Var, oo ooVar, zv zvVar, ii iiVar, ii.a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(zjVar, dhVar, v4Var, o3Var, (i2 & 16) != 0 ? new po() : ooVar, (i2 & 32) != 0 ? pg.f26494a : zvVar, (i2 & 64) != 0 ? on.INSTANCE.d().k() : iiVar, (i2 & 128) != 0 ? on.INSTANCE.a().e() : aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p6 this$0) {
        Intrinsics.f(this$0, "this$0");
        h3.d.INSTANCE.b().a(this$0.analytics);
        this$0.networkDestroyAPI.a(this$0.adInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p6 this$0) {
        Intrinsics.f(this$0, "this$0");
        q6 q6Var = this$0.listener.get();
        if (q6Var != null) {
            q6Var.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p6 this$0) {
        Intrinsics.f(this$0, "this$0");
        q6 q6Var = this$0.listener.get();
        if (q6Var != null) {
            q6Var.onBannerAdShown();
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final dh getContainer() {
        return this.container;
    }

    public final WeakReference<q6> e() {
        return this.listener;
    }

    public final WeakReference<FrameLayout> f() {
        return this.view;
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        Intrinsics.f(bannerAdInfo, "<set-?>");
        this.adInfo = bannerAdInfo;
    }

    public final void b(WeakReference<FrameLayout> value) {
        Intrinsics.f(value, "value");
        this.view = value;
        FrameLayout frameLayout = value.get();
        if (frameLayout != null) {
            frameLayout.addOnAttachStateChangeListener(a());
        }
    }

    public final void a(WeakReference<q6> weakReference) {
        Intrinsics.f(weakReference, "<set-?>");
        this.listener = weakReference;
    }
}
