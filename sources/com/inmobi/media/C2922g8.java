package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2922g8 extends Rl {
    public final HtmlVideoPlaybackState a;
    public final int b;

    public C2922g8(HtmlVideoPlaybackState videoReadyEvent, int i) {
        Intrinsics.checkNotNullParameter(videoReadyEvent, "videoReadyEvent");
        this.a = videoReadyEvent;
        this.b = i;
    }
}
