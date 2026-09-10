package com.bytedance.sdk.openadsdk.core.sLN;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends ebl {

    @NonNull
    private final MediaEvents JXs;
    private boolean lc;

    public QAg(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.JXs = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.ebl
    public void LD(int i) {
        if (Lxb()) {
            switch (i) {
                case 0:
                    this.JXs.pause();
                    break;
                case 1:
                    this.JXs.resume();
                    break;
                case 2:
                case 14:
                    this.JXs.skipped();
                    break;
                case 4:
                    this.JXs.bufferStart();
                    break;
                case 5:
                    this.JXs.bufferFinish();
                    break;
                case 6:
                    this.JXs.firstQuartile();
                    break;
                case 7:
                    this.JXs.midpoint();
                    break;
                case 8:
                    this.JXs.thirdQuartile();
                    break;
                case 9:
                    this.JXs.complete();
                    break;
                case 10:
                    this.JXs.playerStateChange(PlayerState.FULLSCREEN);
                    break;
                case 11:
                    this.JXs.playerStateChange(PlayerState.NORMAL);
                    break;
                case 12:
                    this.JXs.volumeChange(this.lc ? 0.0f : 1.0f);
                    break;
                case 13:
                    this.JXs.adUserInteraction(InteractionType.CLICK);
                    break;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.ebl
    public void Lxb(boolean z, float f) {
        if (z) {
            this.ZU = VastProperties.createVastPropertiesForSkippableMedia(f, true, Position.STANDALONE);
        } else {
            this.ZU = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        Lxb(2);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.ebl
    public void Lxb(float f, boolean z) {
        if (Lxb()) {
            this.JXs.start(f, z ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sLN.ebl
    public void Lxb(boolean z) {
        this.lc = z;
        LD(12);
    }
}
