package com.p004ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.applovin.impl.H0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.ISBannerSize;
import com.p004ironsource.mediationsdk.IronSourceBannerLayout;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u0005H\u0014J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R$\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/ironsource/x5;", "Lcom/ironsource/z;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/BannerAdListener;", "Lcom/ironsource/mediationsdk/ISBannerSize;", "H", "", "K", "J", "I", "Lcom/unity3d/mediation/LevelPlayAdInfo;", "e", "Lcom/ironsource/i0;", "adInstancePresenter", "a", "Lcom/ironsource/xw;", "viewBinder", "z", "b", "Landroid/view/View;", "adView", "Landroid/widget/FrameLayout$LayoutParams;", "frameLayoutParams", "onAdLoadSuccess", sv.k, sv.f27219l, sv.m, "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/z5;", "kotlin.jvm.PlatformType", "w", "Ljava/lang/ref/WeakReference;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "x", "Landroid/view/View;", "y", "Landroid/widget/FrameLayout$LayoutParams;", "bannerLayoutParams", "Lcom/ironsource/u2;", "adTools", "Lcom/ironsource/a0;", "instanceData", "Lcom/ironsource/g0;", "adInstancePayload", "<init>", "(Lcom/ironsource/u2;Lcom/ironsource/a0;Lcom/ironsource/g0;Lcom/ironsource/z5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class x5 extends AbstractC3389z implements BannerAdListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private WeakReference<z5> listener;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private View adView;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private FrameLayout.LayoutParams bannerLayoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(u2 adTools, C3344a0 instanceData, C3357g0 adInstancePayload, z5 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(instanceData, "instanceData");
        Intrinsics.f(adInstancePayload, "adInstancePayload");
        Intrinsics.f(listener, "listener");
        this.listener = new WeakReference<>(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(x5 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(x5 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.K();
    }

    @Override // com.p004ironsource.AbstractC3389z
    public void a(InterfaceC3361i0 adInstancePresenter) {
        Intrinsics.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.p004ironsource.AbstractC3389z
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(getInstanceSignature());
        xm.a(getAdTools(), new O0(this, 0), 0L, 2, (Object) null);
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterBannerInterface) {
                Object objG = g();
                Intrinsics.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
                ((AdapterBannerInterface) objG).destroyAd(getCurrentAdData());
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbP = a.p("destroyBanner - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            getAdTools().getEventSender().getTroubleshoot().g(string);
        }
        super.b();
    }

    @Override // com.p004ironsource.AbstractC3389z
    public LevelPlayAdInfo e() {
        String string = getInstanceData().i().getAdProperties().getCom.ironsource.sdk.controller.f.b.c java.lang.String().toString();
        Intrinsics.e(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = getInstanceData().i().getAdProperties().getAdUnitId();
        String string2 = getInstanceData().getAdFormat().toString();
        Intrinsics.e(string2, "instanceData.adFormat.toString()");
        ImpressionData impressionDataA = getInstanceData().n().a(k());
        cn cnVarD = getInstanceData().n().d();
        u1 u1VarI = getInstanceData().i();
        Intrinsics.d(u1VarI, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, impressionDataA, cnVarD, ((m6) u1VarI).getAdProperties().getAdSize(), null, 64, null);
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new O0(this, 3));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.f(adView, "adView");
        Intrinsics.f(frameLayoutParams, "frameLayoutParams");
        xm.a(getAdTools(), new H0(this, adView, frameLayoutParams, 23), 0L, 2, (Object) null);
        super.onAdLoadSuccess();
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new O0(this, 2));
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new O0(this, 4));
    }

    @Override // com.p004ironsource.AbstractC3389z
    public void z() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData currentAdData = getCurrentAdData();
        ISBannerSize iSBannerSizeH = H();
        Map<String, Object> adUnitData = currentAdData.getAdUnitData();
        Intrinsics.e(adUnitData, "adData.adUnitData");
        adUnitData.put("bannerLayout", new IronSourceBannerLayout(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeH));
        Object objG = g();
        Intrinsics.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(currentAdData, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeH, this);
    }

    private final ISBannerSize H() {
        u2 adTools = getAdTools();
        u1 u1VarI = getInstanceData().i();
        Intrinsics.d(u1VarI, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return adTools.a(((m6) u1VarI).getAdProperties().getAdSize());
    }

    private final void I() {
        Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().f(placementJ.getPlacementName());
        }
        z5 z5Var = this.listener.get();
        if (z5Var != null) {
            z5Var.a(this);
        }
    }

    private final void J() {
        Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().c(placementJ.getPlacementName());
        }
        z5 z5Var = this.listener.get();
        if (z5Var != null) {
            z5Var.b(this);
        }
    }

    private final void K() {
        Placement placementJ = j();
        if (placementJ != null) {
            getAdTools().getEventSender().getAdInteraction().h(placementJ.getPlacementName());
        }
        z5 z5Var = this.listener.get();
        if (z5Var != null) {
            z5Var.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.adView = null;
        this$0.bannerLayoutParams = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(x5 this$0) {
        String placementName;
        Intrinsics.f(this$0, "this$0");
        C3369m0 c3369m0A = this$0.getAdTools().getEventSender().getAdInteraction();
        Placement placementJ = this$0.j();
        if (placementJ == null || (placementName = placementJ.getPlacementName()) == null) {
            placementName = "";
        }
        c3369m0A.j(placementName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adView, "$adView");
        Intrinsics.f(frameLayoutParams, "$frameLayoutParams");
        this$0.adView = adView;
        this$0.bannerLayoutParams = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(x5 this$0, xw viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(viewBinder, "$viewBinder");
        View view = this$0.adView;
        if (view == null || (layoutParams = this$0.bannerLayoutParams) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.getAdTools());
        IronLog.INTERNAL.verbose(m1.a(this$0.getAdTools(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.getAdTools().d(new O0(this$0, 1));
    }

    public final void a(xw viewBinder) {
        Intrinsics.f(viewBinder, "viewBinder");
        xm.a(getAdTools(), new H0(4, this, viewBinder), 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(x5 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.I();
    }
}
