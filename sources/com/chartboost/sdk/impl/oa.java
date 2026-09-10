package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oa extends com.chartboost.sdk.impl.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lh f14771l;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14772b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterstitialCallback f14773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Interstitial f14774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterstitialCallback interstitialCallback, Interstitial interstitial) {
            super(0);
            this.f14773b = interstitialCallback;
            this.f14774c = interstitial;
        }

        public final void a() {
            this.f14773b.onAdLoaded(new CacheEvent(null, this.f14774c), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterstitialCallback f14775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Interstitial f14776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterstitialCallback interstitialCallback, Interstitial interstitial) {
            super(0);
            this.f14775b = interstitialCallback;
            this.f14776c = interstitial;
        }

        public final void a() {
            this.f14775b.onAdShown(new ShowEvent(null, this.f14776c), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterstitialCallback f14777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Interstitial f14778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterstitialCallback interstitialCallback, Interstitial interstitial) {
            super(0);
            this.f14777b = interstitialCallback;
            this.f14778c = interstitial;
        }

        public final void a() {
            this.f14777b.onAdShown(new ShowEvent(null, this.f14778c), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(c0 adUnitLoader, k0 adUnitRenderer, lh uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, e adApiCallbackSender, uf session, b2 base64Wrapper, z6 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutorService, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.f(adUnitLoader, "adUnitLoader");
        Intrinsics.f(adUnitRenderer, "adUnitRenderer");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.f(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.f(session, "session");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(androidVersion, "androidVersion");
        this.f14771l = uiPoster;
    }

    public final void a(Interstitial ad, InterstitialCallback callback) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        a(ad, callback, (String) null);
    }

    public final void b(Interstitial ad, InterstitialCallback callback) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        if (g(ad.getLocation())) {
            this.f14771l.a(new c(callback, ad));
            a(fh.i.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", y.b.g, ad.getLocation());
        } else if (b()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.f14771l.a(new d(callback, ad));
        }
    }

    public final void a(Interstitial ad, InterstitialCallback callback, String str) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        if (g(ad.getLocation())) {
            this.f14771l.a(new b(callback, ad));
            a(fh.a.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", y.b.g, ad.getLocation());
        } else {
            a(ad.getLocation(), ad, callback, str);
        }
    }

    public /* synthetic */ oa(c0 c0Var, k0 k0Var, lh lhVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, e eVar, uf ufVar, b2 b2Var, z6 z6Var, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, k0Var, lhVar, atomicReference, scheduledExecutorService, eVar, ufVar, b2Var, z6Var, (i2 & 512) != 0 ? a.f14772b : function0);
    }
}
