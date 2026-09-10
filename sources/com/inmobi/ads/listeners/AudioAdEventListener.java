package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J$\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0014"}, d2 = {"Lcom/inmobi/ads/listeners/AudioAdEventListener;", "Lcom/inmobi/ads/listeners/AdEventListener;", "Lcom/inmobi/ads/InMobiAudio;", "()V", "onAdDismissed", "", "ad", "onAdDisplayFailed", "onAdDisplayed", "onAdFetchFailed", "status", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "onAudioStatusChanged", "audioStatus", "Lcom/inmobi/ads/AudioStatus;", "onRewardsUnlocked", "rewards", "", "", "onUserLeftApplication", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(InMobiAudio ad) {
        Intrinsics.f(ad, "ad");
    }

    public void onAdDisplayFailed(InMobiAudio ad) {
        Intrinsics.f(ad, "ad");
    }

    public void onAdDisplayed(InMobiAudio ad) {
        Intrinsics.f(ad, "ad");
    }

    public void onAdFetchFailed(InMobiAudio ad, InMobiAdRequestStatus status) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(status, "status");
    }

    public void onAudioStatusChanged(InMobiAudio ad, AudioStatus audioStatus) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(InMobiAudio ad, Map<Object, ? extends Object> rewards) {
        Intrinsics.f(ad, "ad");
        Intrinsics.f(rewards, "rewards");
    }

    public void onUserLeftApplication(InMobiAudio ad) {
        Intrinsics.f(ad, "ad");
    }
}
