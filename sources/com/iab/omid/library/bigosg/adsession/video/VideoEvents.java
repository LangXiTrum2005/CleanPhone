package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoEvents {
    private final MediaEvents mediaEvents;

    private VideoEvents(MediaEvents mediaEvents) {
        this.mediaEvents = mediaEvents;
    }

    public static VideoEvents createVideoEvents(AdSession adSession) {
        try {
            return new VideoEvents(MediaEvents.createMediaEvents(adSession));
        } catch (IllegalStateException e2) {
            if ("Cannot create MediaEvents for JavaScript AdSession".equalsIgnoreCase(e2.getMessage())) {
                throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
            }
            if ("MediaEvents already exists for AdSession".equalsIgnoreCase(e2.getMessage())) {
                throw new IllegalStateException("VideoEvents already exists for AdSession");
            }
            throw e2;
        }
    }

    public final void adUserInteraction(InteractionType interactionType) {
        e.a(interactionType, "InteractionType is null");
        this.mediaEvents.adUserInteraction(com.iab.omid.library.bigosg.adsession.media.InteractionType.valueOf(interactionType.toString().toUpperCase()));
    }

    public final void bufferFinish() {
        this.mediaEvents.bufferFinish();
    }

    public final void bufferStart() {
        this.mediaEvents.bufferStart();
    }

    public final void complete() {
        this.mediaEvents.complete();
    }

    public final void firstQuartile() {
        this.mediaEvents.firstQuartile();
    }

    public final void loaded(VastProperties vastProperties) {
        e.a(vastProperties, "VastProperties is null");
        this.mediaEvents.loaded(vastProperties.a());
    }

    public final void midpoint() {
        this.mediaEvents.midpoint();
    }

    public final void pause() {
        this.mediaEvents.pause();
    }

    public final void playerStateChange(PlayerState playerState) {
        e.a(playerState, "PlayerState is null");
        this.mediaEvents.playerStateChange(com.iab.omid.library.bigosg.adsession.media.PlayerState.valueOf(playerState.toString().toUpperCase()));
    }

    public final void resume() {
        this.mediaEvents.resume();
    }

    public final void skipped() {
        this.mediaEvents.skipped();
    }

    public final void start(float f, float f2) {
        this.mediaEvents.start(f, f2);
    }

    public final void thirdQuartile() {
        this.mediaEvents.thirdQuartile();
    }

    public final void volumeChange(float f) {
        this.mediaEvents.volumeChange(f);
    }
}
