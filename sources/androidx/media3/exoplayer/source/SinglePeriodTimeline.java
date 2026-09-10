package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;

/* JADX INFO: loaded from: classes.dex */
public final class SinglePeriodTimeline extends Timeline {
    public static final Object g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6449c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MediaItem f6450e;
    public final MediaItem.LiveConfiguration f;

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f5441a = "SinglePeriodTimeline";
        builder.f5442b = Uri.EMPTY;
        builder.a();
    }

    public SinglePeriodTimeline(long j, boolean z2, boolean z3, MediaItem mediaItem) {
        MediaItem.LiveConfiguration liveConfiguration = z3 ? mediaItem.f5439c : null;
        this.f6448b = j;
        this.f6449c = j;
        this.d = z2;
        mediaItem.getClass();
        this.f6450e = mediaItem;
        this.f = liveConfiguration;
    }

    @Override // androidx.media3.common.Timeline
    public final int b(Object obj) {
        return g.equals(obj) ? 0 : -1;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Period f(int i2, Timeline.Period period, boolean z2) {
        Assertions.c(i2, 1);
        Object obj = z2 ? g : null;
        period.getClass();
        period.h(null, obj, 0, this.f6448b, 0L, AdPlaybackState.f5367c, false);
        return period;
    }

    @Override // androidx.media3.common.Timeline
    public final int h() {
        return 1;
    }

    @Override // androidx.media3.common.Timeline
    public final Object l(int i2) {
        Assertions.c(i2, 1);
        return g;
    }

    @Override // androidx.media3.common.Timeline
    public final Timeline.Window m(int i2, Timeline.Window window, long j) {
        Assertions.c(i2, 1);
        window.b(Timeline.Window.f5512p, this.f6450e, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.d, false, this.f, 0L, this.f6449c, 0, 0, 0L);
        return window;
    }

    @Override // androidx.media3.common.Timeline
    public final int o() {
        return 1;
    }
}
