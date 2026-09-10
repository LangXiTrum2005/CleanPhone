package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Dk;
import java.util.HashMap;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Dk extends AbstractC2915g1 {
    public byte a;
    public Boolean b;
    public PublisherCallbacks c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public AdMetaInfo e;
    public C3097n9 f;
    public WatermarkData g;

    public static final void a(AbstractC3039l1 abstractC3039l1, Dk dk, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3039l1 != null) {
            abstractC3039l1.b((byte) 1);
        }
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3097n9 c3097n10 = dk.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
    }

    public final void b(final AbstractC3039l1 abstractC3039l1, final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onLoadFailure " + this);
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n10.d("Dk", "AdManager state - LOAD_FAILED");
        }
        this.a = (byte) 3;
        this.d.post(new Runnable() { // from class: adsuki.arytenoidectomy
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(abstractC3039l1, this, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void c() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdWillShow " + this);
        }
        byte b = this.a;
        if (b == 4 || b == 5) {
            return;
        }
        this.d.post(new Runnable() { // from class: adsuki.monoploid
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f3543kowloon);
            }
        });
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n10.d("Dk", "AdManager state - WILL_DISPLAY");
        }
        this.a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void e() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onUserLeftApplication " + this);
        }
        this.d.post(new Runnable() { // from class: adsuki.polloi
            @Override // java.lang.Runnable
            public final void run() {
                Dk.c(this.f3598kowloon);
            }
        });
    }

    public abstract AbstractC3039l1 f();

    public void g() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "submitAdLoadCalled " + this);
        }
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F != null) {
            abstractC3039l1F.O();
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(final InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdFetchFailed " + this);
        }
        this.a = (byte) 3;
        this.d.post(new Runnable() { // from class: adsuki.molybdenite
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3542kowloon, status);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public void b(AdMetaInfo info) {
        AbstractC3039l1 abstractC3039l1F;
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdFetchSuccess " + this);
        }
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n10.d("Dk", "AdManager state - FETCHED");
        }
        this.a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (abstractC3039l1F = f()) == null) {
            return;
        }
        abstractC3039l1F.b((byte) 2);
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdLoadSucceeded " + this);
        }
        this.e = info;
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F != null) {
            abstractC3039l1F.b((byte) 1);
        }
    }

    public static final void a(Dk dk, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3097n9 c3097n10 = dk.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
    }

    public static final void c(Dk dk) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    public static final void b(Dk dk) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public void a(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdDisplayed " + this);
        }
        if (this.a != 5) {
            this.e = info;
            this.d.post(new Runnable() { // from class: adsuki.adultoid
                @Override // java.lang.Runnable
                public final void run() {
                    Dk.a(this.f3305kowloon, info);
                }
            });
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n10.d("Dk", "AdManager state - DISPLAYED");
            }
            this.a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void b(final HashMap rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdRewardActionCompleted " + this);
        }
        this.d.post(new Runnable() { // from class: adsuki.kowloon
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f3503kowloon, rewards);
            }
        });
    }

    public static final void b(Dk dk, Map map) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void a(Dk dk, AdMetaInfo adMetaInfo) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public void a(AbstractC3039l1 abstractC3039l1, InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdLoadFailed " + this);
        }
        b(abstractC3039l1, status);
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(final HashMap params) {
        Intrinsics.checkNotNullParameter(params, "params");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdInteraction " + this);
        }
        this.d.post(new Runnable() { // from class: adsuki.impassible
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3481kowloon, params);
            }
        });
    }

    public static final void a(Dk dk, Map map) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public final void a(PublisherCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "getSignals " + this);
        }
        if (f() != null) {
            this.c = callbacks;
            callbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    public void a(byte[] bArr, PublisherCallbacks callbacks) {
        C2998ja c2998ja;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "load " + this);
        }
        if (Intrinsics.wireman(this.b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n10.a("Dk", "Cannot call load(byte[]) API after load() API is called");
            }
            C3048la c3048la = (C3048la) this;
            b(c3048la.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C2998ja c2998ja2 = c3048la.h;
            if (c2998ja2 != null) {
                c2998ja2.b((short) 2140);
                return;
            }
            return;
        }
        this.b = Boolean.FALSE;
        this.a = (byte) 1;
        C3097n9 logger = this.f;
        if (logger != null && (c2998ja = ((C3048la) this).h) != null) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            c2998ja.i = logger;
            C2785b0 c2785b0 = c2998ja.u;
            c2785b0.getClass();
            Intrinsics.checkNotNullParameter(logger, "logger");
            c2785b0.f = logger;
        }
        C3048la c3048la2 = (C3048la) this;
        C2998ja c2998ja3 = c3048la2.h;
        if (c2998ja3 == null || !c2998ja3.d((byte) 1)) {
            return;
        }
        C3097n9 c3097n11 = this.f;
        if (c3097n11 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n11.a("Dk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.c = callbacks;
        C2998ja c2998ja4 = c3048la2.h;
        if (c2998ja4 != null) {
            c2998ja4.a(bArr);
        }
    }

    public void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.g = watermarkData;
    }

    public final boolean a(String tag, String placementString, PublisherCallbacks publisherCallbacks) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            c3097n9.c(tag, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            Kb.a((byte) 1, "Dk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                c3097n10.b(tag, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3039l1 abstractC3039l1F = f();
            if (abstractC3039l1F != null) {
                abstractC3039l1F.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b = this.a;
        if (b == 8) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                c3097n11.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3039l1 abstractC3039l1F2 = f();
            if (abstractC3039l1F2 != null) {
                abstractC3039l1F2.b((short) 2002);
            }
            return false;
        }
        if (b == 1) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3097n9 c3097n12 = this.f;
            if (c3097n12 != null) {
                c3097n12.b(tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            }
            AbstractC3039l1 abstractC3039l1F3 = f();
            if (abstractC3039l1F3 != null) {
                abstractC3039l1F3.b((short) 2001);
            }
            return false;
        }
        if (b != 5) {
            return true;
        }
        Kb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3097n9 c3097n13 = this.f;
        if (c3097n13 != null) {
            c3097n13.b(tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3039l1 abstractC3039l1F4 = f();
        if (abstractC3039l1F4 != null) {
            abstractC3039l1F4.c((short) 2003);
        }
        return false;
    }

    public final boolean a(String tag, String placementString) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(placementString, "placementString");
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "canRender " + this);
        }
        byte b = this.a;
        if (b == 1) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3097n9 c3097n10 = this.f;
            if (c3097n10 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n10.b("Dk", "adload in progress");
            }
            AbstractC3039l1 abstractC3039l1F = f();
            if (abstractC3039l1F != null) {
                abstractC3039l1F.c((short) 2129);
            }
            return false;
        }
        if (b == 8) {
            Kb.a((byte) 1, tag, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + placementString);
            C3097n9 c3097n11 = this.f;
            if (c3097n11 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n11.b("Dk", "ad loading into view is in progress");
            }
            AbstractC3039l1 abstractC3039l1F2 = f();
            if (abstractC3039l1F2 != null) {
                abstractC3039l1F2.c((short) 2164);
            }
            return false;
        }
        if (b != 5) {
            if (b == 7) {
                return true;
            }
            C3097n9 c3097n12 = this.f;
            if (c3097n12 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n12.b("Dk", "ad in illegal state");
            }
            AbstractC3039l1 abstractC3039l1F3 = f();
            if (abstractC3039l1F3 != null) {
                abstractC3039l1F3.c((short) 2165);
            }
            AbstractC3039l1 abstractC3039l1F4 = f();
            if (abstractC3039l1F4 != null) {
                abstractC3039l1F4.J();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Kb.a((byte) 1, tag, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + placementString);
        C3097n9 c3097n13 = this.f;
        if (c3097n13 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n13.b("Dk", "ad active before renderAd");
        }
        AbstractC3039l1 abstractC3039l1F5 = f();
        if (abstractC3039l1F5 != null) {
            abstractC3039l1F5.c((short) 2130);
        }
        AbstractC3039l1 abstractC3039l1F6 = f();
        if (abstractC3039l1F6 != null) {
            abstractC3039l1F6.J();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public void a() {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdDismissed " + this);
        }
        this.d.post(new Runnable() { // from class: adsuki.formularize
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3440kowloon);
            }
        });
        C3097n9 c3097n10 = this.f;
        if (c3097n10 != null) {
            c3097n10.a();
        }
    }

    public static final void a(Dk dk) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3097n9 c3097n10 = dk.f;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n10.b("Dk", "callback is null");
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(final C2934gk c2934gk) {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "onAdImpression " + this);
        }
        this.d.post(new Runnable() { // from class: adsuki.apical
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3312kowloon, c2934gk);
            }
        });
    }

    public static final void a(Dk dk, C2934gk c2934gk) {
        if (dk.c == null) {
            C3097n9 c3097n9 = dk.f;
            if (c3097n9 != null) {
                Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
                c3097n9.b("Dk", "callback is null");
            }
            if (c2934gk != null) {
                c2934gk.b();
                return;
            }
            return;
        }
        C3097n9 c3097n10 = dk.f;
        if (c3097n10 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n10.a("Dk", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c2934gk);
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(final V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        this.d.post(new Runnable() { // from class: adsuki.graveside
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3452kowloon, audioStatusInternal);
            }
        });
    }

    public static final void a(Dk dk, V1 v1) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onAudioStatusChanged - " + v1.a);
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v1);
        }
    }

    @Override // com.inmobi.media.AbstractC2915g1
    public final void a(final String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        this.d.post(new Runnable() { // from class: adsuki.triweekly
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f3722kowloon, log);
            }
        });
    }

    public static final void a(Dk dk, String str) {
        C3097n9 c3097n9 = dk.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.a("Dk", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = dk.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public void a(short s) {
        C3097n9 c3097n9 = this.f;
        if (c3097n9 != null) {
            Intrinsics.checkNotNullExpressionValue("Dk", "TAG");
            c3097n9.c("Dk", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3039l1 abstractC3039l1F = f();
        if (abstractC3039l1F != null) {
            abstractC3039l1F.b(s);
        }
    }
}
