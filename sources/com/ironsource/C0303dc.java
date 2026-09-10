package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0303dc extends AbstractC0401j3<R0> implements NativeAdListener, E0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdapterNativeAdData f28471r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private AdapterNativeAdViewBinder f28472s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0303dc(InterfaceC0537qd threadInterface, C0470n0 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C0358gd c0358gd, C0526q2 item, R0 r0) {
        super(threadInterface, adSmashData, baseAdAdapter, new C0310e1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), item, r0);
        kotlin.jvm.internal.n.f(threadInterface, "threadInterface");
        kotlin.jvm.internal.n.f(adSmashData, "adSmashData");
        kotlin.jvm.internal.n.f(item, "item");
        this.f28934g = c0358gd;
    }

    private final void J() {
        C0540qg c0540qg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f28932e != AbstractC0401j3.h.FAILED) {
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f28932e}, 2));
            F0 f10 = this.f28931d;
            if (f10 == null || (c0540qg = f10.f26035j) == null) {
                return;
            }
            c0540qg.q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0303dc this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC0401j3
    public void G() {
        C0540qg c0540qg;
        if (!(this.f28930c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            F0 f10 = this.f28931d;
            if (f10 == null || (c0540qg = f10.f26035j) == null) {
                return;
            }
            c0540qg.g("activity must not be null");
            return;
        }
        Object obj = this.f28930c;
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f28938k;
        kotlin.jvm.internal.n.e(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.n.e(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final AdapterNativeAdViewBinder R() {
        return this.f28472s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.n.f(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.n.f(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new ph(this, adapterNativeAdData, nativeAdViewBinder, 12));
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC0401j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new androidx.fragment.app.n(this, 27));
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        throw new cn.c0("An operation is not implemented: Not yet implemented", 4);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f28471r = adapterNativeAdData;
        this.f28472s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void P() {
        C0540qg c0540qg;
        C0696zb c0696zb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC0401j3.h.NONE);
        Object obj = this.f28930c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                AdData mCurrentAdData = this.f28938k;
                kotlin.jvm.internal.n.e(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            String strN = defpackage.e.n("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strN));
            F0 f10 = this.f28931d;
            if (f10 != null && (c0540qg = f10.f26035j) != null) {
                c0540qg.g(strN);
            }
        }
        F0 f11 = this.f28931d;
        if (f11 == null || (c0696zb = f11.f26031f) == null) {
            return;
        }
        Integer sessionDepth = r();
        kotlin.jvm.internal.n.e(sessionDepth, "sessionDepth");
        c0696zb.a(sessionDepth.intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.f28471r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0303dc this$0) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC0401j3, com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        kotlin.jvm.internal.n.f(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.f28934g != null) {
            kotlin.jvm.internal.n.e(data, "data");
            data.put("placement", j());
        }
        kotlin.jvm.internal.n.e(data, "data");
        return data;
    }
}
