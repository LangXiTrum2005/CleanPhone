package com.ironsource.mediationsdk.ads.nativead;

import android.app.Activity;
import com.ironsource.C0267bc;
import com.ironsource.C0358gd;
import com.ironsource.C0474n4;
import com.ironsource.Zb;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.p;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import q1.c;
import w1.b;
import we.a;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class LevelPlayNativeAd implements NativeAdInterface, NativeAdDataInterface, InternalNativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0358gd f29296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LevelPlayNativeAdListener f29297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Zb f29298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdapterNativeAdData f29299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdapterNativeAdViewBinder f29300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f29301g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LevelPlayNativeAdListener f29303b;

        public final LevelPlayNativeAd build() {
            return new LevelPlayNativeAd(this, null);
        }

        public final LevelPlayNativeAdListener getMListener$mediationsdk_release() {
            return this.f29303b;
        }

        public final String getMPlacementName$mediationsdk_release() {
            return this.f29302a;
        }

        public final void setMListener$mediationsdk_release(LevelPlayNativeAdListener levelPlayNativeAdListener) {
            this.f29303b = levelPlayNativeAdListener;
        }

        public final void setMPlacementName$mediationsdk_release(String str) {
            this.f29302a = str;
        }

        public final Builder withActivity(Activity activity) {
            ContextProvider.getInstance().updateActivity(activity);
            IronLog.INTERNAL.verbose("activity is updated to: " + (activity != null ? activity.hashCode() : 0));
            return this;
        }

        public final Builder withListener(LevelPlayNativeAdListener listener) {
            n.f(listener, "listener");
            this.f29303b = listener;
            return this;
        }

        public final Builder withPlacementName(String str) {
            this.f29302a = str;
            return this;
        }
    }

    public /* synthetic */ LevelPlayNativeAd(Builder builder, g gVar) {
        this(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0) {
        r rVar;
        n.f(this$0, "this$0");
        this$0.b();
        Zb zb2 = this$0.f29298d;
        if (zb2 != null) {
            zb2.a(this$0.f29296b);
            rVar = r.f53297a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            this$0.a();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void destroyAd() {
        IronLog.API.info(String.valueOf(this));
        try {
            Zb zb2 = this.f29298d;
            if (zb2 != null) {
                zb2.J();
            }
        } catch (Throwable th2) {
            C0474n4.d().a(th2);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getAdvertiser() {
        AdapterNativeAdData adapterNativeAdData = this.f29299e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getBody() {
        AdapterNativeAdData adapterNativeAdData = this.f29299e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getCallToAction() {
        AdapterNativeAdData adapterNativeAdData = this.f29299e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public NativeAdDataInterface.Image getIcon() {
        AdapterNativeAdData adapterNativeAdData = this.f29299e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getIcon();
        }
        return null;
    }

    public final AdapterNativeAdViewBinder getNativeAdViewBinder() {
        return this.f29300f;
    }

    public final UUID getObjectId() {
        Zb zb2 = this.f29298d;
        if (zb2 != null) {
            return zb2.h();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public String getTitle() {
        AdapterNativeAdData adapterNativeAdData = this.f29299e;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdInterface
    public void loadAd() {
        IronLog.API.info(String.valueOf(this));
        String initError = p.h().b();
        n.e(initError, "initError");
        if (initError.length() <= 0) {
            IronSourceThreadManager.INSTANCE.getInitHandler().post(new c(this, 9));
            return;
        }
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("loadAd(): ".concat(initError), IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdClicked(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(this, adInfo, 0), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdImpression(AdInfo adInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new a(this, adInfo, 1), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new b(1, this, ironSourceError), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener
    public void onNativeAdLoaded(AdInfo adInfo, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        n.f(adapterNativeAdData, "adapterNativeAdData");
        n.f(nativeAdViewBinder, "nativeAdViewBinder");
        IronLog.CALLBACK.info(String.valueOf(this));
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new bc.r(this, adapterNativeAdData, nativeAdViewBinder, adInfo, 28), 0L, 2, null);
    }

    public final void setListener(LevelPlayNativeAdListener levelPlayNativeAdListener) {
        this.f29297c = levelPlayNativeAdListener;
    }

    private LevelPlayNativeAd(Builder builder) {
        this.f29301g = new AtomicBoolean(false);
        this.f29295a = builder.getMPlacementName$mediationsdk_release();
        this.f29297c = builder.getMListener$mediationsdk_release();
    }

    private final void b() {
        if (this.f29301g.compareAndSet(false, true)) {
            Zb zbC = p.h().c();
            this.f29298d = zbC;
            if (zbC != null) {
                zbC.a(this);
                C0267bc c0267bcI = p.h().i(this.f29295a);
                n.e(c0267bcI, "getInstance().getNativeAdPlacement(mPlacementName)");
                this.f29296b = new C0358gd(c0267bcI);
            }
        }
    }

    private final void a() {
        LevelPlayNativeAdListener levelPlayNativeAdListener = this.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this, ErrorBuilder.buildInitFailedError("init() has failed", IronSourceConstants.NATIVE_AD_UNIT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        n.f(this$0, "this$0");
        n.f(adapterNativeAdData, "$adapterNativeAdData");
        n.f(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.f29299e = adapterNativeAdData;
        this$0.f29300f = nativeAdViewBinder;
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoaded(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(LevelPlayNativeAd this$0, AdInfo adInfo) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdImpression(this$0, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, IronSourceError ironSourceError) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdLoadFailed(this$0, ironSourceError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayNativeAd this$0, AdInfo adInfo) {
        n.f(this$0, "this$0");
        LevelPlayNativeAdListener levelPlayNativeAdListener = this$0.f29297c;
        if (levelPlayNativeAdListener != null) {
            levelPlayNativeAdListener.onAdClicked(this$0, adInfo);
        }
    }
}
