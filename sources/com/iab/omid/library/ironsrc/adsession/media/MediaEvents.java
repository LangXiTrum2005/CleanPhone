package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.utils.c;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.X3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class MediaEvents {
    private final a adSession;

    private MediaEvents(a aVar) {
        this.adSession = aVar;
    }

    private void confirmValidDuration(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
    }

    private void confirmValidVolume(float f10) {
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
    }

    public static MediaEvents createMediaEvents(AdSession adSession) {
        a aVar = (a) adSession;
        g.a(adSession, "AdSession is null");
        g.f(aVar);
        g.c(aVar);
        g.b(aVar);
        g.h(aVar);
        MediaEvents mediaEvents = new MediaEvents(aVar);
        aVar.getAdSessionStatePublisher().a(mediaEvents);
        return mediaEvents;
    }

    public void adUserInteraction(InteractionType interactionType) {
        g.a(interactionType, "InteractionType is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "interactionType", interactionType);
        this.adSession.getAdSessionStatePublisher().a("adUserInteraction", jSONObject);
    }

    public void bufferFinish() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferFinish");
    }

    public void bufferStart() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("bufferStart");
    }

    public void complete() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);
    }

    public void firstQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("firstQuartile");
    }

    public void midpoint() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT);
    }

    public void pause() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    public void playerStateChange(PlayerState playerState) {
        g.a(playerState, "PlayerState is null");
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "state", playerState);
        this.adSession.getAdSessionStatePublisher().a("playerStateChange", jSONObject);
    }

    public void resume() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a(CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    public void skipped() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("skipped");
    }

    public void start(float f10, float f11) {
        confirmValidDuration(f10);
        confirmValidVolume(f11);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, IronSourceConstants.EVENTS_DURATION, Float.valueOf(f10));
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f11));
        c.a(jSONObject, X3.j.P, Float.valueOf(i.c().b()));
        this.adSession.getAdSessionStatePublisher().a("start", jSONObject);
    }

    public void thirdQuartile() {
        g.a(this.adSession);
        this.adSession.getAdSessionStatePublisher().a("thirdQuartile");
    }

    public void volumeChange(float f10) {
        confirmValidVolume(f10);
        g.a(this.adSession);
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f10));
        c.a(jSONObject, X3.j.P, Float.valueOf(i.c().b()));
        this.adSession.getAdSessionStatePublisher().a("volumeChange", jSONObject);
    }
}
