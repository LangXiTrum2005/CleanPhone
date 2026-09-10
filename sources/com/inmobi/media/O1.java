package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public class O1 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiBanner> f23026a;

    public O1(InMobiBanner banner) {
        Intrinsics.f(banner, "banner");
        this.f23026a = new WeakReference<>(banner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.f23026a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        H1 mPubListener;
        Intrinsics.f(params, "params");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null) {
            return;
        }
        H1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            ((I1) mPubListener).f22875a.onAdDismissed(inMobiBanner);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        H1 mPubListener;
        Intrinsics.f(info, "info");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onAdDisplayed(inMobiBanner);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        H1 mPubListener;
        Intrinsics.f(status, "status");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onAdFetchFailed(inMobiBanner, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        H1 mPubListener;
        Intrinsics.f(info, "info");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(Yd yd) {
        InMobiBanner inMobiBanner = this.f23026a.get();
        H1 mPubListener = inMobiBanner != null ? inMobiBanner.getMPubListener() : null;
        if (mPubListener == null) {
            if (yd != null) {
                yd.c();
            }
        } else {
            mPubListener.a(inMobiBanner);
            if (yd != null) {
                yd.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        Intrinsics.f(status, "status");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null) {
            return;
        }
        H1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        R1 mAdManager;
        Intrinsics.f(info, "info");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.B() && mAdManager.x()) {
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            H1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.B()) {
            S0 s0J = mAdManager.j();
            if (s0J != null) {
                s0J.b((short) 2173);
                return;
            }
            return;
        }
        S0 s0J2 = mAdManager.j();
        if (s0J2 != null) {
            s0J2.b((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(D1 audioStatusInternal) {
        AudioStatus audioStatus;
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(audioStatusInternal);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            D1.f22754b.getClass();
            int iOrdinal = audioStatusInternal.ordinal();
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
        H1 mPubListener;
        Intrinsics.f(log, "log");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        H1 mPubListener;
        Intrinsics.f(request, "request");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        H1 mPubListener;
        Intrinsics.f(reason, "reason");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        H1 mPubListener;
        Intrinsics.f(rewards, "rewards");
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onRewardsUnlocked(inMobiBanner, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        H1 mPubListener;
        InMobiBanner inMobiBanner = this.f23026a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((I1) mPubListener).f22875a.onUserLeftApplication(inMobiBanner);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        Intrinsics.f(weakReference, "<set-?>");
        this.f23026a = weakReference;
    }
}
