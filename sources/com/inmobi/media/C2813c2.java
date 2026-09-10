package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2813c2 extends PublisherCallbacks {
    private WeakReference<InMobiBanner> a;

    public C2813c2(InMobiBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.a = new WeakReference<>(banner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner ad = this.a.get();
        if (ad == null) {
            return;
        }
        Y1 mPubListener = ad.getMPubListener();
        if (mPubListener != null) {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((Z1) mPubListener).a.onAdDismissed(ad);
        }
        ad.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((Z1) mPubListener).a.onAdDisplayed(ad);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((Z1) mPubListener).a.onAdFetchFailed(ad, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C2934gk c2934gk) {
        InMobiBanner ad = this.a.get();
        Y1 mPubListener = ad != null ? ad.getMPubListener() : null;
        if (mPubListener == null) {
            if (c2934gk != null) {
                c2934gk.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad, "ad");
            ((Z1) mPubListener).a.onAdImpression(ad);
            if (c2934gk != null) {
                c2934gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(C2813c2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        C2864e2 mAdManager;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            AbstractC3039l1 abstractC3039l1F = mAdManager.f();
            if (abstractC3039l1F != null) {
                abstractC3039l1F.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC3039l1 abstractC3039l1F2 = mAdManager.f();
        if (abstractC3039l1F2 != null) {
            abstractC3039l1F2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(V1 item) {
        AudioStatus audioStatus;
        Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            V1.b.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            int iOrdinal = item.ordinal();
            if (iOrdinal != 1) {
                audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            mAudioListener.onAudioStatusChanged(inMobiBanner, audioStatus);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((Z1) mPubListener).a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiBanner inMobiBanner = this.a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((Z1) mPubListener).a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((Z1) mPubListener).a.onRewardsUnlocked(ad, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        Y1 mPubListener;
        InMobiBanner ad = this.a.get();
        if (ad == null || (mPubListener = ad.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad, "ad");
        ((Z1) mPubListener).a.onUserLeftApplication(ad);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.a = weakReference;
    }
}
