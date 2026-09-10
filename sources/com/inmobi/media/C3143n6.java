package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3143n6 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f23827a;

    public C3143n6(InMobiInterstitial interstitial) {
        Intrinsics.f(interstitial, "interstitial");
        this.f23827a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3047h6 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onAdDismissed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3047h6 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onAdDisplayFailed(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onAdDisplayed(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onAdFetchFailed(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(Yd yd) {
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        AbstractC3047h6 mPubListener$media_release = inMobiInterstitial != null ? inMobiInterstitial.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (yd != null) {
                yd.c();
            }
        } else {
            mPubListener$media_release.a(inMobiInterstitial);
            if (yd != null) {
                yd.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3047h6 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onAdWillDisplay(inMobiInterstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(reason, "reason");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC3047h6 mPubListener$media_release;
        Intrinsics.f(rewards, "rewards");
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onRewardsUnlocked(inMobiInterstitial, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3047h6 mPubListener$media_release;
        InMobiInterstitial inMobiInterstitial = this.f23827a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3063i6) mPubListener$media_release).f23691a.onUserLeftApplication(inMobiInterstitial);
    }
}
