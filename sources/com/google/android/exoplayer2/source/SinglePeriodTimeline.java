package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes3.dex */
public final class SinglePeriodTimeline extends Timeline {
    public static final Object h0 = new Object();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18412Y;
    public final long Z;
    public final boolean e0;
    public final MediaItem f0;
    public final MediaItem.LiveConfiguration g0;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f17096a = "SinglePeriodTimeline";
        builder.f17097b = Uri.EMPTY;
        builder.a();
    }

    public SinglePeriodTimeline(long j, boolean z2, boolean z3, MediaItem mediaItem) {
        MediaItem.LiveConfiguration liveConfiguration = z3 ? mediaItem.Z : null;
        this.f18412Y = j;
        this.Z = j;
        this.e0 = z2;
        mediaItem.getClass();
        this.f0 = mediaItem;
        this.g0 = liveConfiguration;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int b(Object obj) {
        return h0.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        Assertions.c(i2, 1);
        Object obj = z2 ? h0 : null;
        period.getClass();
        period.g(null, obj, 0, this.f18412Y, 0L, AdPlaybackState.g0, false);
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object l(int i2) {
        Assertions.c(i2, 1);
        return h0;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window m(int i2, Timeline.Window window, long j) {
        Assertions.c(i2, 1);
        window.b(Timeline.Window.r0, this.f0, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.e0, false, this.g0, 0L, this.Z, 0, 0, 0L);
        return window;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int o() {
        return 1;
    }
}
