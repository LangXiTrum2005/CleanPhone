package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2793b8 extends Rl {
    public final HtmlVideoPlayerRequest a;
    public final short b;

    public C2793b8(HtmlVideoPlayerRequest requestConfig, short s) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.a = requestConfig;
        this.b = s;
    }
}
