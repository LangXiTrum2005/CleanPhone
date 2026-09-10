package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh f13702a;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ad f13703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13704c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CacheError f13705e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ad ad, AdCallback adCallback, String str, CacheError cacheError, e eVar) {
            super(0);
            this.f13703b = ad;
            this.f13704c = adCallback;
            this.d = str;
            this.f13705e = cacheError;
            this.f = eVar;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.f13703b;
            if (ad != null) {
                AdCallback adCallback = this.f13704c;
                String str = this.d;
                CacheError cacheError = this.f13705e;
                e eVar = this.f;
                unit = Unit.f43263a;
                if (adCallback != null) {
                    adCallback.onAdLoaded(new CacheEvent(str, ad), cacheError);
                    unit2 = unit;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    za.c(android.support.v4.media.a.n("Callback missing for ", eVar.a(ad), " on onAdLoaded"), null, 2, null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Ad is missing on onAdLoaded", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ad f13706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13707c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ClickError f13708e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ad ad, AdCallback adCallback, String str, ClickError clickError, e eVar) {
            super(0);
            this.f13706b = ad;
            this.f13707c = adCallback;
            this.d = str;
            this.f13708e = clickError;
            this.f = eVar;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.f13706b;
            if (ad != null) {
                AdCallback adCallback = this.f13707c;
                String str = this.d;
                ClickError clickError = this.f13708e;
                e eVar = this.f;
                unit = Unit.f43263a;
                if (adCallback != null) {
                    adCallback.onAdClicked(new ClickEvent(str, ad), clickError);
                    unit2 = unit;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    za.c(android.support.v4.media.a.n("Callback missing for ", eVar.a(ad), " on onAdClicked"), null, 2, null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Ad is missing on onAdClicked", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad f13710c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdCallback adCallback, Ad ad, String str) {
            super(0);
            this.f13709b = adCallback;
            this.f13710c = ad;
            this.d = str;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.f13709b;
            if (adCallback != null) {
                Ad ad = this.f13710c;
                String str = this.d;
                boolean z2 = adCallback instanceof DismissibleAdCallback;
                unit = Unit.f43263a;
                if (z2) {
                    if (ad != null) {
                        ((DismissibleAdCallback) adCallback).onAdDismiss(new DismissEvent(str, ad));
                        unit2 = unit;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        za.b("Ad is missing on onAdDismiss", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    za.b("Invalid ad type to send onAdDismiss", (Throwable) null, 2, (Object) null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Missing callback on sendDismissCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExpirationEvent f13712c;
        public final /* synthetic */ e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdCallback adCallback, ExpirationEvent expirationEvent, e eVar) {
            super(0);
            this.f13711b = adCallback;
            this.f13712c = expirationEvent;
            this.d = eVar;
        }

        public final void a() {
            Unit unit;
            try {
                AdCallback adCallback = this.f13711b;
                if (adCallback != null) {
                    adCallback.onAdExpired(this.f13712c);
                    unit = Unit.f43263a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    za.c("Callback missing for " + this.d.a(this.f13712c.getAd()) + " on onAdExpired", null, 2, null);
                }
            } catch (Exception e2) {
                za.b("Error delivering onAdExpired callback", e2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$e, reason: collision with other inner class name */
    public static final class C0165e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ad f13713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13714c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f13715e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0165e(Ad ad, AdCallback adCallback, String str, e eVar) {
            super(0);
            this.f13713b = ad;
            this.f13714c = adCallback;
            this.d = str;
            this.f13715e = eVar;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.f13713b;
            if (ad != null) {
                AdCallback adCallback = this.f13714c;
                String str = this.d;
                e eVar = this.f13715e;
                unit = Unit.f43263a;
                if (adCallback != null) {
                    adCallback.onImpressionRecorded(new ImpressionEvent(str, ad));
                    unit2 = unit;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    za.c(android.support.v4.media.a.n("Callback missing for ", eVar.a(ad), " on onImpressionRecorded"), null, 2, null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Ad is missing on onImpressionRecorded", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ad f13716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13717c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f13718e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ad ad, AdCallback adCallback, String str, e eVar) {
            super(0);
            this.f13716b = ad;
            this.f13717c = adCallback;
            this.d = str;
            this.f13718e = eVar;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.f13716b;
            if (ad != null) {
                AdCallback adCallback = this.f13717c;
                String str = this.d;
                e eVar = this.f13718e;
                unit = Unit.f43263a;
                if (adCallback != null) {
                    adCallback.onAdRequestedToShow(new ShowEvent(str, ad));
                    unit2 = unit;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    za.c(android.support.v4.media.a.n("Callback missing for ", eVar.a(ad), " on onAdRequestedToShow"), null, 2, null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Ad is missing on onAdRequestedToShow", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ad f13720c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f13721e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdCallback adCallback, Ad ad, String str, int i2) {
            super(0);
            this.f13719b = adCallback;
            this.f13720c = ad;
            this.d = str;
            this.f13721e = i2;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.f13719b;
            if (adCallback != null) {
                Ad ad = this.f13720c;
                String str = this.d;
                int i2 = this.f13721e;
                boolean z2 = adCallback instanceof RewardedCallback;
                unit = Unit.f43263a;
                if (z2) {
                    if (ad != null) {
                        ((RewardedCallback) adCallback).onRewardEarned(new RewardEvent(str, ad, i2));
                        unit2 = unit;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        za.b("Ad is missing on didEarnReward", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    za.b("Invalid ad type to send a reward", (Throwable) null, 2, (Object) null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Missing callback on sendRewardCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ad f13722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdCallback f13723c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ShowError f13724e;
        public final /* synthetic */ e f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Ad ad, AdCallback adCallback, String str, ShowError showError, e eVar) {
            super(0);
            this.f13722b = ad;
            this.f13723c = adCallback;
            this.d = str;
            this.f13724e = showError;
            this.f = eVar;
        }

        public final void a() {
            Unit unit;
            Unit unit2;
            Ad ad = this.f13722b;
            if (ad != null) {
                AdCallback adCallback = this.f13723c;
                String str = this.d;
                ShowError showError = this.f13724e;
                e eVar = this.f;
                unit = Unit.f43263a;
                if (adCallback != null) {
                    adCallback.onAdShown(new ShowEvent(str, ad), showError);
                    unit2 = unit;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    za.c(android.support.v4.media.a.n("Callback missing for ", eVar.a(ad), " on onAdShown"), null, 2, null);
                }
            } else {
                unit = null;
            }
            if (unit == null) {
                za.b("Ad is missing on onAdShown", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f43263a;
        }
    }

    public e(lh uiPoster) {
        Intrinsics.f(uiPoster, "uiPoster");
        this.f13702a = uiPoster;
    }

    public final void b(String str, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new C0165e(ad, adCallback, str, this));
    }

    public final void c(String str, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new f(ad, adCallback, str, this));
    }

    public final String a(Ad ad) {
        if (ad instanceof Interstitial) {
            return y.b.g.b();
        }
        if (ad instanceof Rewarded) {
            return y.c.g.b();
        }
        if (ad instanceof Banner) {
            return y.a.g.b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a(String str, CacheError cacheError, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new a(ad, adCallback, str, cacheError, this));
    }

    public final void a(String str, ClickError clickError, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new b(ad, adCallback, str, clickError, this));
    }

    public final void a(String str, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new c(adCallback, ad, str));
    }

    public final void a(ExpirationEvent event, AdCallback adCallback) {
        Intrinsics.f(event, "event");
        this.f13702a.a(new d(adCallback, event, this));
    }

    public final void a(String str, Ad ad, AdCallback adCallback, int i2) {
        this.f13702a.a(new g(adCallback, ad, str, i2));
    }

    public final void a(String str, ShowError showError, Ad ad, AdCallback adCallback) {
        this.f13702a.a(new h(ad, adCallback, str, showError, this));
    }
}
