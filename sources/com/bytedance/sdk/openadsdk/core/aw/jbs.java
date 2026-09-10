package com.bytedance.sdk.openadsdk.core.aw;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends xha {
    private boolean di;
    private final MediaEvents fi;

    public jbs(AdSession adSession, AdEvents adEvents, View view, MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.fi = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.aw.xha
    public void lr(int i) {
        if (ri()) {
            switch (i) {
                case 0:
                    this.fi.pause();
                    break;
                case 1:
                    this.fi.resume();
                    break;
                case 2:
                case 14:
                    this.fi.skipped();
                    break;
                case 4:
                    this.fi.bufferStart();
                    break;
                case 5:
                    this.fi.bufferFinish();
                    break;
                case 6:
                    this.fi.firstQuartile();
                    break;
                case 7:
                    this.fi.midpoint();
                    break;
                case 8:
                    this.fi.thirdQuartile();
                    break;
                case 9:
                    this.fi.complete();
                    break;
                case 10:
                    this.fi.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.fi.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.fi.volumeChange(this.di ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
                    break;
                case 13:
                    this.fi.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.aw.xha
    public void ri(boolean z, float f) {
        if (z) {
            this.ka = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.ka = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        ri(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.aw.xha
    public void ri(float f, boolean z) {
        if (ri()) {
            this.fi.start(f, z ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.aw.xha
    public void ri(boolean z) {
        this.di = z;
        lr(12);
    }
}
