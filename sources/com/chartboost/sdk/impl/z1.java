package com.chartboost.sdk.impl;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
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
public final class z1 extends com.chartboost.sdk.impl.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f15680l;
    public final k0 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lh f15681n;
    public final AtomicReference o;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f15682b = new a();

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
        public final /* synthetic */ BannerCallback f15683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Banner f15684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f15683b = bannerCallback;
            this.f15684c = banner;
        }

        public final void a() {
            this.f15683b.onAdLoaded(new CacheEvent(null, this.f15684c), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BannerCallback f15685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Banner f15686c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f15685b = bannerCallback;
            this.f15686c = banner;
        }

        public final void a() {
            this.f15685b.onAdLoaded(new CacheEvent(null, this.f15686c), new CacheError(CacheError.Code.BANNER_DISABLED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BannerCallback f15687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Banner f15688c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f15687b = bannerCallback;
            this.f15688c = banner;
        }

        public final void a() {
            this.f15687b.onAdShown(new ShowEvent(null, this.f15688c), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BannerCallback f15689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Banner f15690c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f15689b = bannerCallback;
            this.f15690c = banner;
        }

        public final void a() {
            this.f15689b.onAdShown(new ShowEvent(null, this.f15690c), new ShowError(ShowError.Code.BANNER_DISABLED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BannerCallback f15691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Banner f15692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f15691b = bannerCallback;
            this.f15692c = banner;
        }

        public final void a() {
            this.f15691b.onAdShown(new ShowEvent(null, this.f15692c), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(c0 adUnitLoader, k0 adUnitRenderer, lh uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutor, com.chartboost.sdk.impl.e adApiCallbackSender, uf session, b2 base64Wrapper, z6 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutor, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.f(adUnitLoader, "adUnitLoader");
        Intrinsics.f(adUnitRenderer, "adUnitRenderer");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(sdkConfig, "sdkConfig");
        Intrinsics.f(backgroundExecutor, "backgroundExecutor");
        Intrinsics.f(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.f(session, "session");
        Intrinsics.f(base64Wrapper, "base64Wrapper");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(androidVersion, "androidVersion");
        this.f15680l = adUnitLoader;
        this.m = adUnitRenderer;
        this.f15681n = uiPoster;
        this.o = sdkConfig;
    }

    @Override // com.chartboost.sdk.impl.d, com.chartboost.sdk.impl.m0
    public void a(String str) {
    }

    public final void b(Banner ad, BannerCallback callback) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        if (g(ad.getLocation())) {
            this.f15681n.a(new d(callback, ad));
            a(fh.i.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", y.a.g, ad.getLocation());
        } else if (!e()) {
            this.f15681n.a(new e(callback, ad));
        } else if (b()) {
            a((Ad) ad, (AdCallback) callback);
        } else {
            this.f15681n.a(new f(callback, ad));
        }
    }

    public final void d() {
        this.m.E();
        this.f15680l.b();
    }

    public final boolean e() {
        qf.a aVarA;
        qf qfVar = (qf) this.o.get();
        if (qfVar == null || (aVarA = qfVar.a()) == null) {
            return true;
        }
        return aVarA.a();
    }

    public final void a(Banner ad, BannerCallback callback) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        a(ad, callback, (String) null);
    }

    public final void a(Banner ad, BannerCallback callback, String str) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(callback, "callback");
        if (g(ad.getLocation())) {
            this.f15681n.a(new b(callback, ad));
            a(fh.a.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", y.a.g, ad.getLocation());
        } else if (!e()) {
            this.f15681n.a(new c(callback, ad));
        } else {
            a(ad.getLocation(), ad, callback, str);
        }
    }

    public /* synthetic */ z1(c0 c0Var, k0 k0Var, lh lhVar, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, com.chartboost.sdk.impl.e eVar, uf ufVar, b2 b2Var, z6 z6Var, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0Var, k0Var, lhVar, atomicReference, scheduledExecutorService, eVar, ufVar, b2Var, z6Var, (i2 & 512) != 0 ? a.f15682b : function0);
    }

    public final void a(Banner banner) {
        Intrinsics.f(banner, "banner");
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int bannerWidth = banner.getBannerWidth();
        Intrinsics.c(displayMetrics);
        layoutParams2.width = (int) a(bannerWidth, displayMetrics);
        banner.getLayoutParams().height = (int) a(banner.getBannerHeight(), displayMetrics);
    }

    public final float a(int i2, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i2, displayMetrics);
    }
}
