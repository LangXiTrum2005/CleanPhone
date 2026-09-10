package com.p004ironsource;

import android.app.Activity;
import com.applovin.impl.H0;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.p004ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.p004ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004BI\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0014\u0010$\u001a\u0010\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010(\u001a\u00020'\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0014J\u0006\u0010\r\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/ironsource/go;", "Lcom/ironsource/s7;", "Lcom/ironsource/p2;", "Lcom/ironsource/mediationsdk/adunit/adapter/listener/NativeAdListener;", "Lcom/ironsource/b2;", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "adapterNativeAdData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "nativeAdViewBinder", "", "a", "J", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "P", "onAdLoadSuccess", sv.f27215c, "Lcom/ironsource/z1;", "event", "", "", "", "<set-?>", "r", "Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "Q", "()Lcom/ironsource/mediationsdk/ads/nativead/AdapterNativeAdData;", "s", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "R", "()Lcom/ironsource/mediationsdk/adunit/adapter/internal/nativead/AdapterNativeAdViewBinder;", "Lcom/ironsource/vq;", "threadInterface", "Lcom/ironsource/k1;", "adSmashData", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;", "Lcom/ironsource/mediationsdk/adunit/adapter/internal/listener/AdapterAdListener;", ne.E1, "Lcom/ironsource/mediationsdk/model/Placement;", "placement", "Lcom/ironsource/m5;", "item", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/vq;Lcom/ironsource/k1;Lcom/ironsource/mediationsdk/adunit/adapter/internal/BaseAdAdapter;Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/m5;Lcom/ironsource/p2;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class go extends s7<p2> implements NativeAdListener, b2 {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private AdapterNativeAdData adapterNativeAdData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private AdapterNativeAdViewBinder nativeAdViewBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(vq threadInterface, k1 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, Placement placement, m5 item, p2 p2Var) {
        super(threadInterface, adSmashData, baseAdAdapter, new a3(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.AD_UNIT.NATIVE_AD), item, p2Var);
        Intrinsics.f(threadInterface, "threadInterface");
        Intrinsics.f(adSmashData, "adSmashData");
        Intrinsics.f(item, "item");
        this.g = placement;
    }

    private final void J() {
        lw lwVar;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f26762e != s7.h.FAILED) {
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.f26762e}, 2));
            c2 c2Var = this.d;
            if (c2Var == null || (lwVar = c2Var.j) == null) {
                return;
            }
            lwVar.q(str);
        }
    }

    @Override // com.p004ironsource.s7
    public void G() {
        lw lwVar;
        if (!(this.f26761c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            c2 c2Var = this.d;
            if (c2Var == null || (lwVar = c2Var.j) == null) {
                return;
            }
            lwVar.g("activity must not be null");
            return;
        }
        Object obj = this.f26761c;
        Intrinsics.d(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.k;
        Intrinsics.e(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.e(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.nativeAdViewBinder;
    }

    @Override // com.p004ironsource.s7, com.p004ironsource.b2
    public Map<String, Object> a(z1 event) {
        Intrinsics.f(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.g != null) {
            Intrinsics.e(data, "data");
            data.put("placement", j());
        }
        Intrinsics.e(data, "data");
        return data;
    }

    @Override // com.p004ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.f(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.f(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new H0(this, adapterNativeAdData, nativeAdViewBinder, 16));
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.p004ironsource.s7, com.p004ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new D(this, 5));
        } else {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(go this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.J();
    }

    public final void P() {
        lw lwVar;
        bn bnVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(s7.h.NONE);
        Object obj = this.f26761c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                AdData mCurrentAdData = this.k;
                Intrinsics.e(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            StringBuilder sbP = a.p("destroyNativeAd - exception = ", th);
            sbP.append(th.getLocalizedMessage());
            String string = sbP.toString();
            IronLog.INTERNAL.error(a(string));
            c2 c2Var = this.d;
            if (c2Var != null && (lwVar = c2Var.j) != null) {
                lwVar.g(string);
            }
        }
        c2 c2Var2 = this.d;
        if (c2Var2 == null || (bnVar = c2Var2.f) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.e(sessionDepth, "sessionDepth");
        bnVar.a(sessionDepth.intValue());
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final AdapterNativeAdData getAdapterNativeAdData() {
        return this.adapterNativeAdData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(go this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.f(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        this.adapterNativeAdData = adapterNativeAdData;
        this.nativeAdViewBinder = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }
}
