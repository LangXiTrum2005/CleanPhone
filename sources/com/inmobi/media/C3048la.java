package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3048la;
import com.ironsource.C3676od;
import com.ironsource.C3700q2;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3048la extends Dk {
    public static final /* synthetic */ int j = 0;
    public C2998ja h;
    public boolean i;

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void a() throws JSONException {
        this.d.post(new Runnable() { // from class: adsuki.idolatry
            @Override // java.lang.Runnable
            public final void run() {
                C3048la.a(this.f3476kowloon);
            }
        });
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.a = (byte) 0;
        this.b = null;
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            c2998ja.d();
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
    }

    public final void b(PublisherCallbacks callbacks) {
        C2998ja c2998ja;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (this.c == null) {
            this.c = callbacks;
        }
        if (Intrinsics.wireman(this.b, Boolean.FALSE)) {
            C2998ja c2998ja2 = this.h;
            if (c2998ja2 != null) {
                c2998ja2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3097n9 c3097n9 = this.f;
            if (c3097n9 != null) {
                c3097n9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Kb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.i) {
            C2998ja c2998ja3 = this.h;
            if (c2998ja3 != null) {
                c2998ja3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.b = Boolean.TRUE;
        C2998ja c2998ja4 = this.h;
        if (c2998ja4 == null || !a("InMobi", String.valueOf(c2998ja4.l), callbacks) || (c2998ja = this.h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c2998ja.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.a = (byte) 1;
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                C2998ja c2998ja5 = this.h;
                c3097n11.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2998ja5 != null ? c2998ja5.l : null));
            }
            C2998ja c2998ja6 = this.h;
            Kb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c2998ja6 != null ? c2998ja6.l : null));
            C2998ja c2998ja7 = this.h;
            if (c2998ja7 != null) {
                c2998ja7.e(this);
            }
            C2998ja c2998ja8 = this.h;
            if (c2998ja8 != null) {
                c2998ja8.C();
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void c(AdMetaInfo info) throws JSONException {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.h != null) {
            d(info);
            return;
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            c3097n10.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b = this.a;
        if (b == 8 || b == 1) {
            b((AbstractC3039l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b == 2) {
            Kb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                c3097n11.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b != 5) {
            Kb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3097n9 c3097n12 = this.f;
            if (c3097n12 != null) {
                c3097n12.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Kb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3097n9 c3097n13 = this.f;
        if (c3097n13 != null) {
            c3097n13.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            c2998ja.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c("InterstitialUnifiedAdManager", C3676od.f);
        }
        super.c(adMetaInfo);
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            c3097n10.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.a = (byte) 2;
        this.d.post(new Runnable() { // from class: adsuki.stonecrop
            @Override // java.lang.Runnable
            public final void run() {
                C3048la.b(this.f3684kowloon, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3039l1 f() {
        return this.h;
    }

    public final boolean h() throws JSONException {
        byte b = this.a;
        if (b == 1) {
            C3097n9 c3097n9 = this.f;
            if (c3097n9 != null) {
                c3097n9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b == 7) {
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b != 5) {
            if (!this.i) {
                return true;
            }
            C2998ja c2998ja = this.h;
            if (c2998ja != null) {
                c2998ja.d((short) 2149);
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                c3097n11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C2998ja c2998ja2 = this.h;
        if (c2998ja2 != null) {
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c2998ja2.l);
            C3097n9 c3097n12 = this.f;
            if (c3097n12 != null) {
                C2998ja c2998ja3 = this.h;
                c3097n12.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c2998ja3 != null ? c2998ja3.l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() throws JSONException {
        C2998ja c2998ja;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "render");
        }
        C2998ja c2998ja2 = this.h;
        if (c2998ja2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c2998ja2.b == 4 && this.e != null) {
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.e;
            Intrinsics.beachfront(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.i) {
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                c3097n11.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2998ja c2998ja3 = this.h;
            if (c2998ja3 != null) {
                c2998ja3.c((short) 2128);
                return;
            }
            return;
        }
        com.inmobi.media.ads.network.common.model.Ad adB = c2998ja2.b(0);
        C2998ja c2998ja4 = this.h;
        boolean zA = a("InMobi", String.valueOf(c2998ja4 != null ? c2998ja4.l : null));
        if (adB == null) {
            C3097n9 c3097n12 = this.f;
            if (c3097n12 != null) {
                c3097n12.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2998ja c2998ja5 = this.h;
            if (c2998ja5 != null) {
                c2998ja5.b((short) 2166);
            }
        }
        if (this.e == null) {
            C3097n9 c3097n13 = this.f;
            if (c3097n13 != null) {
                c3097n13.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C2998ja c2998ja6 = this.h;
            if (c2998ja6 != null) {
                c2998ja6.b((short) 2167);
            }
        }
        if (adB == null || !zA) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c2998ja = this.h) != null) {
            c2998ja.d((byte) 1);
        }
        C3097n9 c3097n14 = this.f;
        if (c3097n14 != null) {
            c3097n14.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.a = (byte) 8;
        C2998ja c2998ja7 = this.h;
        if (c2998ja7 != null) {
            c2998ja7.X();
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void d() throws JSONException {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            byte b = c2998ja.b;
            if (b != 6 && b != 7) {
                a(true, (short) 2159);
            } else {
                c2998ja.f(this);
            }
        }
    }

    public static final void a(C3048la c3048la) {
        C3097n9 c3097n9 = c3048la.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3048la.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3048la c3048la, AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = c3048la.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3048la.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z, short s) throws JSONException {
        C2998ja c2998ja;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s != 0 && (c2998ja = this.h) != null) {
            c2998ja.d(s);
        }
        this.d.post(new Runnable() { // from class: adsuki.acoelomate
            @Override // java.lang.Runnable
            public final void run() {
                C3048la.c(this.f3302kowloon);
            }
        });
        if (z) {
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.a = (byte) 6;
            C2998ja c2998ja2 = this.h;
            if (c2998ja2 != null) {
                c2998ja2.d();
            }
        }
        C3097n9 c3097n11 = this.f;
        if (c3097n11 != null) {
            c3097n11.a();
        }
    }

    public static final void c(C3048la c3048la) {
        C3097n9 c3097n9 = c3048la.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3048la.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3097n9 c3097n10 = c3048la.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
        C2998ja c2998ja = c3048la.h;
        if (c2998ja != null) {
            c2998ja.b((byte) 4);
        }
    }

    public final void a(Activity activity) throws JSONException {
        Pj pj;
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", C3700q2.v);
        }
        C2998ja c2998ja = this.h;
        if (c2998ja != null && (pj = c2998ja.H) != null) {
            pj.b = true;
        }
        if (c2998ja != null) {
            c2998ja.Q();
        }
        if (h()) {
            if (!W6.a()) {
                if (this.h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C2998ja c2998ja2 = this.h;
            if (c2998ja2 == null || !c2998ja2.d((byte) 4)) {
                return;
            }
            this.i = true;
            C2998ja c2998ja3 = this.h;
            if (c2998ja3 != null) {
                c2998ja3.a(this, activity);
            }
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void b() throws JSONException {
        this.d.post(new Runnable() { // from class: adsuki.leh
            @Override // java.lang.Runnable
            public final void run() {
                C3048la.b(this.f3513kowloon);
            }
        });
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.a = (byte) 6;
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            c2998ja.d();
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
    }

    public final void a(Jg pubSettings, Context context, boolean z, String logType) {
        C2998ja c2998ja;
        GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciI;
        C2998ja c2998ja2;
        String str;
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.h == null) {
            Intrinsics.checkNotNullParameter("int", "mAdType");
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            long j2 = pubSettings.a;
            String str2 = pubSettings.b;
            Map map = pubSettings.c;
            String str3 = pubSettings.g;
            String str4 = pubSettings.e;
            if (j2 != Long.MIN_VALUE) {
                if (map == null || (str = (String) map.get("tp")) == null) {
                    str = "";
                }
                C3287v0 c3287v0 = new C3287v0(j2, str, "int", str3);
                c3287v0.d = str2;
                c3287v0.c = map;
                Intrinsics.checkNotNullParameter("", "<set-?>");
                c3287v0.h = "";
                Intrinsics.checkNotNullParameter("activity", "<set-?>");
                c3287v0.i = "activity";
                c3287v0.g = string;
                c3287v0.j = false;
                c3287v0.k = str4;
                this.h = new C2998ja(context, c3287v0, this);
            } else {
                throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
        }
        if (z) {
            g();
        }
        String str5 = pubSettings.g;
        if (str5 != null) {
            C3097n9 c3097n9 = this.f;
            if (c3097n9 != null) {
                c3097n9.a();
            }
            C3097n9 c3097n9A = Jh.a(logType, str5);
            this.f = c3097n9A;
            if (c3097n9A != null) {
                c3097n9A.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3097n9 logger = this.f;
            if (logger != null && (c2998ja2 = this.h) != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c2998ja2.i = logger;
                C2785b0 c2785b0 = c2998ja2.u;
                c2785b0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c2785b0.f = logger;
            }
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C2998ja c2998ja3 = this.h;
            Intrinsics.beachfront(c2998ja3);
            Jh.a(c2998ja3, this.f);
        }
        C2998ja c2998ja4 = this.h;
        if (c2998ja4 != null) {
            c2998ja4.a(context);
        }
        C2998ja c2998ja5 = this.h;
        if (c2998ja5 != null) {
            c2998ja5.a(pubSettings.c);
        }
        C2998ja c2998ja6 = this.h;
        if (c2998ja6 != null) {
            c2998ja6.K();
        }
        if (pubSettings.d && (c2998ja = this.h) != null && (gestureDetectorOnGestureListenerC2829ciI = c2998ja.i()) != null) {
            c2998ja.G = true;
            gestureDetectorOnGestureListenerC2829ciI.k();
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C2998ja c2998ja7 = this.h;
            if (c2998ja7 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c2998ja7.A = watermarkData;
                GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ = c2998ja7.q();
                if (gestureDetectorOnGestureListenerC2829ciQ != null) {
                    gestureDetectorOnGestureListenerC2829ciQ.setWatermark(watermarkData);
                }
            }
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                c3097n11.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.e = info;
        if (this.h == null) {
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC3039l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: adsuki.pimpled
            @Override // java.lang.Runnable
            public final void run() {
                C3048la.a(this.f3593kowloon, info);
            }
        });
    }

    public static final void b(C3048la c3048la) {
        C3097n9 c3097n9 = c3048la.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3048la.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C2998ja c2998ja = c3048la.h;
        if (c2998ja != null) {
            c2998ja.b((byte) 4);
        }
    }

    public static final void b(C3048la c3048la, AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = c3048la.f;
        if (c3097n9 != null) {
            c3097n9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3048la.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC2915g1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            c2998ja.R();
        }
        this.i = false;
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C2998ja c2998ja = this.h;
        if (c2998ja != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c2998ja.A = watermarkData;
            GestureDetectorOnGestureListenerC2829ci gestureDetectorOnGestureListenerC2829ciQ = c2998ja.q();
            if (gestureDetectorOnGestureListenerC2829ciQ != null) {
                gestureDetectorOnGestureListenerC2829ciQ.setWatermark(watermarkData);
            }
        }
    }
}
