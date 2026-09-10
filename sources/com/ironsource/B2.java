package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class B2 extends B implements BannerAdListener {
    private FrameLayout.LayoutParams A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View f25687z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(V0 adTools, C instanceData, I adInstancePayload, D2 listener) {
        super(adTools, instanceData, adInstancePayload, null, null, 24, null);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
        a(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(B2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.O();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataI = i();
        ISBannerSize iSBannerSizeL = L();
        Map<String, Object> adUnitData = adDataI.getAdUnitData();
        kotlin.jvm.internal.n.e(adUnitData, "adData.adUnitData");
        adUnitData.put(K2.f26381t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeL));
        Object objG = g();
        kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objG).loadAd(adDataI, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeL, this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        kotlin.jvm.internal.n.f(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C0624vb.a(f(), new oh(this, 2), 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        try {
            if (!(g() instanceof AdapterBannerInterface)) {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
                return;
            }
            Object objG = g();
            kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
            ((AdapterBannerInterface) objG).destroyAd(i());
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("destroyBanner - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strN));
            f().d().h().g(strN);
        }
    }

    @Override // com.ironsource.B
    public LevelPlayAdInfo e() {
        String string = n().j().b().b().toString();
        kotlin.jvm.internal.n.e(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strC = n().j().b().c();
        String string2 = n().i().toString();
        kotlin.jvm.internal.n.e(string2, "instanceData.adFormat.toString()");
        C0526q2 c0526q2O = n().o();
        AbstractC0649x0 abstractC0649x0J = n().j();
        kotlin.jvm.internal.n.d(abstractC0649x0J, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strC, string2, c0526q2O, ((M2) abstractC0649x0J).b().i(), n().j().l(), xj.b0.X(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new oh(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.n.f(adView, "adView");
        kotlin.jvm.internal.n.f(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        kotlin.jvm.internal.n.f(extraData, "extraData");
        a(new ki(7, this, extraData));
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new oh(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new oh(this, 1));
    }

    private final D2 K() {
        F fS = s();
        if (fS instanceof D2) {
            return (D2) fS;
        }
        return null;
    }

    private final ISBannerSize L() {
        V0 v0F = f();
        AbstractC0649x0 abstractC0649x0J = n().j();
        kotlin.jvm.internal.n.d(abstractC0649x0J, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return v0F.a(((M2) abstractC0649x0J).b().i());
    }

    private final void M() {
        C0358gd c0358gdJ = j();
        if (c0358gdJ != null) {
            f().d().a().f(c0358gdJ.c());
        }
        D2 d2K = K();
        if (d2K != null) {
            d2K.a(this);
        }
    }

    private final void N() {
        C0358gd c0358gdJ = j();
        if (c0358gdJ != null) {
            f().d().a().c(c0358gdJ.c());
        }
        D2 d2K = K();
        if (d2K != null) {
            d2K.b(this);
        }
    }

    private final void O() {
        C0358gd c0358gdJ = j();
        if (c0358gdJ != null) {
            f().d().a().h(c0358gdJ.c());
        }
        D2 d2K = K();
        if (d2K != null) {
            d2K.c(this);
        }
    }

    public final void a(Eg viewBinder) {
        kotlin.jvm.internal.n.f(viewBinder, "viewBinder");
        C0624vb.a(f(), new ki(6, this, viewBinder), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams, Map<String, Object> extraData) {
        kotlin.jvm.internal.n.f(adView, "adView");
        kotlin.jvm.internal.n.f(frameLayoutParams, "frameLayoutParams");
        kotlin.jvm.internal.n.f(extraData, "extraData");
        C0624vb.a(f(), new ph(this, adView, frameLayoutParams, 0), 0L, 2, null);
        super.onAdLoadSuccess(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0, Eg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(viewBinder, "$viewBinder");
        View view = this$0.f25687z;
        if (view == null || (layoutParams = this$0.A) == null) {
            return;
        }
        viewBinder.a(view, layoutParams, this$0.f());
        IronLog.INTERNAL.verbose(C0506p0.a(this$0.f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.f().c(new oh(this$0, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.f25687z = null;
        this$0.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adView, "$adView");
        kotlin.jvm.internal.n.f(frameLayoutParams, "$frameLayoutParams");
        this$0.f25687z = adView;
        this$0.A = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(B2 this$0) {
        String strC;
        kotlin.jvm.internal.n.f(this$0, "this$0");
        O oA = this$0.f().d().a();
        C0358gd c0358gdJ = this$0.j();
        if (c0358gdJ == null || (strC = c0358gdJ.c()) == null) {
            strC = "";
        }
        oA.j(strC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 this$0, Map extraData) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(extraData, "$extraData");
        this$0.l().putAll(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B2 this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.N();
    }
}
