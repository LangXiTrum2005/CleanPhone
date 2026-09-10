package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Fg {
    public final boolean a;
    public final boolean b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final long f;

    public Fg(VideoExperience videoExperience, boolean z, AdConfig.VideoPlayerProgressConfig progressConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = !(loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : z);
        int[] color = videoExperience.getProgress().getColor();
        this.c = color == null ? CollectionsKt.deadwork(progressConfig.getForegroundColor()) : color;
        this.d = CollectionsKt.deadwork(progressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f = progressConfig.getProgressPolling();
    }
}
