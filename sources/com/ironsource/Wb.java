package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wb extends B implements NativeAdListener {
    private AdapterNativeAdViewBinder A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private AdapterNativeAdData f27593z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wb(V0 adTools, C instanceData, I adInstancePayload, F listener) {
        super(adTools, instanceData, adInstancePayload, null, listener, 8, null);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(instanceData, "instanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.n.f(listener, "listener");
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataI = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().d().h().g("activity must not be null");
            return;
        }
        Object objG = g();
        kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        kotlin.jvm.internal.n.e(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
    }

    public final AdapterNativeAdData K() {
        return this.f27593z;
    }

    public final AdapterNativeAdViewBinder L() {
        return this.A;
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
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object objG = g();
                kotlin.jvm.internal.n.d(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strN));
            f().d().h().g(strN);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        this.f27593z = adapterNativeAdData;
        this.A = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(Pb nativeAdBinder) {
        kotlin.jvm.internal.n.f(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.f27593z);
        nativeAdBinder.a(this.A);
    }
}
