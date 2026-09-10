package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class PlaybackInfo {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final MediaSource.MediaPeriodId f5961u = new MediaSource.MediaPeriodId(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline f5962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5964c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5965e;
    public final ExoPlaybackException f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f5966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TrackSelectorResult f5967i;
    public final List j;
    public final MediaSource.MediaPeriodId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5968l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5969n;
    public final PlaybackParameters o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5970p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public PlaybackInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, int i2, ExoPlaybackException exoPlaybackException, boolean z2, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list, MediaSource.MediaPeriodId mediaPeriodId2, boolean z3, int i3, int i4, PlaybackParameters playbackParameters, long j3, long j4, long j5, long j6, boolean z4) {
        this.f5962a = timeline;
        this.f5963b = mediaPeriodId;
        this.f5964c = j;
        this.d = j2;
        this.f5965e = i2;
        this.f = exoPlaybackException;
        this.g = z2;
        this.f5966h = trackGroupArray;
        this.f5967i = trackSelectorResult;
        this.j = list;
        this.k = mediaPeriodId2;
        this.f5968l = z3;
        this.m = i3;
        this.f5969n = i4;
        this.o = playbackParameters;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.f5970p = z4;
    }

    public static PlaybackInfo i(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.f5507a;
        MediaSource.MediaPeriodId mediaPeriodId = f5961u;
        return new PlaybackInfo(timeline, mediaPeriodId, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.d, trackSelectorResult, ImmutableList.x(), mediaPeriodId, false, 1, 0, PlaybackParameters.d, 0L, 0L, 0L, 0L, false);
    }

    public final PlaybackInfo a() {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, this.f5965e, this.f, this.g, this.f5966h, this.f5967i, this.j, this.k, this.f5968l, this.m, this.f5969n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.f5970p);
    }

    public final PlaybackInfo b(MediaSource.MediaPeriodId mediaPeriodId) {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, this.f5965e, this.f, this.g, this.f5966h, this.f5967i, this.j, mediaPeriodId, this.f5968l, this.m, this.f5969n, this.o, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final PlaybackInfo c(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list) {
        return new PlaybackInfo(this.f5962a, mediaPeriodId, j2, j3, this.f5965e, this.f, this.g, trackGroupArray, trackSelectorResult, list, this.k, this.f5968l, this.m, this.f5969n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.f5970p);
    }

    public final PlaybackInfo d(int i2, int i3, boolean z2) {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, this.f5965e, this.f, this.g, this.f5966h, this.f5967i, this.j, this.k, z2, i2, i3, this.o, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final PlaybackInfo e(ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, this.f5965e, exoPlaybackException, this.g, this.f5966h, this.f5967i, this.j, this.k, this.f5968l, this.m, this.f5969n, this.o, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final PlaybackInfo f(PlaybackParameters playbackParameters) {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, this.f5965e, this.f, this.g, this.f5966h, this.f5967i, this.j, this.k, this.f5968l, this.m, this.f5969n, playbackParameters, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final PlaybackInfo g(int i2) {
        return new PlaybackInfo(this.f5962a, this.f5963b, this.f5964c, this.d, i2, this.f, this.g, this.f5966h, this.f5967i, this.j, this.k, this.f5968l, this.m, this.f5969n, this.o, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final PlaybackInfo h(Timeline timeline) {
        return new PlaybackInfo(timeline, this.f5963b, this.f5964c, this.d, this.f5965e, this.f, this.g, this.f5966h, this.f5967i, this.j, this.k, this.f5968l, this.m, this.f5969n, this.o, this.q, this.r, this.s, this.t, this.f5970p);
    }

    public final long j() {
        long j;
        long j2;
        if (!k()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return Util.I(Util.T(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.f5494a)));
    }

    public final boolean k() {
        return this.f5965e == 3 && this.f5968l && this.f5969n == 0;
    }
}
