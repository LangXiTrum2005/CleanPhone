package com.ironsource;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.ironsourceads.banner.BannerAdInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class P2 implements G2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K9 f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0353g8 f26819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y1 f26820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0560s1 f26821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0446lc f26822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0379hg f26823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final M8 f26824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final M8.a f26825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f26826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BannerAdInfo f26827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private WeakReference<Q2> f26828k;
    private View.OnAttachStateChangeListener l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference<FrameLayout> f26829m;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v4) {
            kotlin.jvm.internal.n.f(v4, "v");
            C0317e8 size = P2.this.d().getSize();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size.c(), size.a(), 17);
            if (P2.this.f26826i) {
                ViewParent parent = P2.this.d().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(P2.this.d());
                }
            }
            ((FrameLayout) v4).addView(P2.this.d(), 0, layoutParams);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v4) {
            kotlin.jvm.internal.n.f(v4, "v");
            ((FrameLayout) v4).removeAllViews();
        }
    }

    public P2(K9 adInstance, C0353g8 container, Y1 auctionDataReporter, InterfaceC0560s1 analytics, InterfaceC0446lc networkDestroyAPI, InterfaceC0379hg threadManager, M8 sessionDepthService, M8.a sessionDepthServiceEditor, A7 epService) {
        kotlin.jvm.internal.n.f(adInstance, "adInstance");
        kotlin.jvm.internal.n.f(container, "container");
        kotlin.jvm.internal.n.f(auctionDataReporter, "auctionDataReporter");
        kotlin.jvm.internal.n.f(analytics, "analytics");
        kotlin.jvm.internal.n.f(networkDestroyAPI, "networkDestroyAPI");
        kotlin.jvm.internal.n.f(threadManager, "threadManager");
        kotlin.jvm.internal.n.f(sessionDepthService, "sessionDepthService");
        kotlin.jvm.internal.n.f(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        kotlin.jvm.internal.n.f(epService, "epService");
        this.f26818a = adInstance;
        this.f26819b = container;
        this.f26820c = auctionDataReporter;
        this.f26821d = analytics;
        this.f26822e = networkDestroyAPI;
        this.f26823f = threadManager;
        this.f26824g = sessionDepthService;
        this.f26825h = sessionDepthServiceEditor;
        this.f26826i = epService.m();
        String strF = adInstance.f();
        kotlin.jvm.internal.n.e(strF, "adInstance.instanceId");
        String strE = adInstance.e();
        kotlin.jvm.internal.n.e(strE, "adInstance.id");
        this.f26827j = new BannerAdInfo(strF, strE);
        this.f26828k = new WeakReference<>(null);
        this.f26829m = new WeakReference<>(null);
        Jc jc2 = new Jc();
        adInstance.a(jc2);
        jc2.a(this);
    }

    public final void b(WeakReference<FrameLayout> value) {
        FrameLayout frameLayout;
        kotlin.jvm.internal.n.f(value, "value");
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.l;
        if (onAttachStateChangeListener != null && (frameLayout = this.f26829m.get()) != null) {
            frameLayout.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.f26829m = value;
        a aVarA = a();
        this.l = aVarA;
        FrameLayout frameLayout2 = value.get();
        if (frameLayout2 != null) {
            frameLayout2.addOnAttachStateChangeListener(aVarA);
        }
    }

    public final BannerAdInfo c() {
        return this.f26827j;
    }

    public final C0353g8 d() {
        return this.f26819b;
    }

    public final void finalize() {
        b();
    }

    @Override // com.ironsource.G2
    public void onBannerClick() {
        InterfaceC0435l1.a.f29080a.a().a(this.f26821d);
        this.f26823f.a(new wh(this, 1));
    }

    @Override // com.ironsource.G2
    public void onBannerShowSuccess() {
        M8 m10 = this.f26824g;
        IronSource.a aVar = IronSource.a.BANNER;
        InterfaceC0435l1.a.f29080a.f(new C0489o1.w(m10.a(aVar))).a(this.f26821d);
        this.f26825h.b(aVar);
        this.f26820c.b("onBannerShowSuccess");
        this.f26823f.a(new wh(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(P2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Q2 q6 = this$0.f26828k.get();
        if (q6 != null) {
            q6.onBannerAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(P2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        Q2 q6 = this$0.f26828k.get();
        if (q6 != null) {
            q6.onBannerAdShown();
        }
    }

    public final void a(BannerAdInfo bannerAdInfo) {
        kotlin.jvm.internal.n.f(bannerAdInfo, "<set-?>");
        this.f26827j = bannerAdInfo;
    }

    public final WeakReference<Q2> e() {
        return this.f26828k;
    }

    public final WeakReference<FrameLayout> f() {
        return this.f26829m;
    }

    public final void a(WeakReference<Q2> weakReference) {
        kotlin.jvm.internal.n.f(weakReference, "<set-?>");
        this.f26828k = weakReference;
    }

    private final a a() {
        return new a();
    }

    public final void b() {
        InterfaceC0379hg.a(this.f26823f, new wh(this, 2), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(P2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        InterfaceC0435l1.d.f29103a.b().a(this$0.f26821d);
        this$0.f26822e.a(this$0.f26818a);
    }

    public /* synthetic */ P2(K9 k10, C0353g8 c0353g8, Y1 y10, InterfaceC0560s1 interfaceC0560s1, InterfaceC0446lc interfaceC0446lc, InterfaceC0379hg interfaceC0379hg, M8 m10, M8.a aVar, A7 a8, int i10, kotlin.jvm.internal.g gVar) {
        this(k10, c0353g8, y10, interfaceC0560s1, (i10 & 16) != 0 ? new C0464mc() : interfaceC0446lc, (i10 & 32) != 0 ? R7.f27125a : interfaceC0379hg, (i10 & 64) != 0 ? Kb.f26413u.d().s() : m10, (i10 & 128) != 0 ? Kb.f26413u.a().i() : aVar, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? Kb.f26413u.d().h() : a8);
    }
}
