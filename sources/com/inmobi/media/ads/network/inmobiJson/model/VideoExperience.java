package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/inmobi/media/ads/network/inmobiJson/model/VideoExperience;", "", "<init>", "()V", "loopVideoOnComplete", "", "getLoopVideoOnComplete", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", NotificationCompat.CATEGORY_PROGRESS, "Lcom/inmobi/media/ads/network/inmobiJson/model/VideoProgressConfig;", "getProgress", "()Lcom/inmobi/media/ads/network/inmobiJson/model/VideoProgressConfig;", "audio", "Lcom/inmobi/media/ads/network/inmobiJson/model/VideoAudioExperience;", "getAudio", "()Lcom/inmobi/media/ads/network/inmobiJson/model/VideoAudioExperience;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoExperience {
    private final Boolean loopVideoOnComplete;
    private final VideoProgressConfig progress = new VideoProgressConfig();
    private final VideoAudioExperience audio = new VideoAudioExperience();

    public final VideoAudioExperience getAudio() {
        return this.audio;
    }

    public final Boolean getLoopVideoOnComplete() {
        return this.loopVideoOnComplete;
    }

    public final VideoProgressConfig getProgress() {
        return this.progress;
    }
}
