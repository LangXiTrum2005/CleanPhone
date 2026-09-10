package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Qm {
    public final boolean a;
    public final boolean b;
    public final Fg c;
    public final O1 d;
    public final In e;

    public Qm(boolean z, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(nativeConfig, "nativeConfig");
        this.a = z;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.c = new Fg(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new In(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
