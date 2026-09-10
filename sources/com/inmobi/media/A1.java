package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.AudioAdEventListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class A1 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiAudio> f22672a;

    public A1(InMobiAudio audio) {
        Intrinsics.f(audio, "audio");
        this.f22672a = new WeakReference<>(audio);
    }

    public final WeakReference<InMobiAudio> a() {
        return this.f22672a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(params, "params");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdClicked(inMobiAudio, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDismissed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayFailed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(info, "info");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdDisplayed(inMobiAudio);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(info, "info");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdFetchSuccessful(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(Yd yd) {
        InMobiAudio inMobiAudio = this.f22672a.get();
        AudioAdEventListener mPubListener = inMobiAudio != null ? inMobiAudio.getMPubListener() : null;
        if (mPubListener == null) {
            if (yd != null) {
                yd.c();
            }
        } else {
            mPubListener.onAdImpression(inMobiAudio);
            if (yd != null) {
                yd.d();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(status, "status");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadFailed(inMobiAudio, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(info, "info");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onAdLoadSucceeded(inMobiAudio, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(D1 audioStatusInternal) {
        AudioAdEventListener mPubListener;
        AudioStatus audioStatus;
        Intrinsics.f(audioStatusInternal, "audioStatusInternal");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        D1.f22754b.getClass();
        int iOrdinal = audioStatusInternal.ordinal();
        if (iOrdinal != 1) {
            audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
        } else {
            audioStatus = AudioStatus.PLAYING;
        }
        mPubListener.onAudioStatusChanged(inMobiAudio, audioStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(request, "request");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus reason) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(reason, "reason");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRequestPayloadCreationFailed(reason);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AudioAdEventListener mPubListener;
        Intrinsics.f(rewards, "rewards");
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onRewardsUnlocked(inMobiAudio, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AudioAdEventListener mPubListener;
        InMobiAudio inMobiAudio = this.f22672a.get();
        if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
            return;
        }
        mPubListener.onUserLeftApplication(inMobiAudio);
    }

    public final void a(WeakReference<InMobiAudio> weakReference) {
        Intrinsics.f(weakReference, "<set-?>");
        this.f22672a = weakReference;
    }
}
