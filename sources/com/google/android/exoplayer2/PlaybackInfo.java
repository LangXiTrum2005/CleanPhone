package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class PlaybackInfo {
    public static final MediaSource.MediaPeriodId s = new MediaSource.MediaPeriodId(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline f17176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaSource.MediaPeriodId f17177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17178c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17179e;
    public final ExoPlaybackException f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackGroupArray f17180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TrackSelectorResult f17181i;
    public final List j;
    public final MediaSource.MediaPeriodId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17182l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final PlaybackParameters f17183n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f17184p;
    public volatile long q;
    public volatile long r;

    public PlaybackInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, int i2, ExoPlaybackException exoPlaybackException, boolean z2, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list, MediaSource.MediaPeriodId mediaPeriodId2, boolean z3, int i3, PlaybackParameters playbackParameters, long j3, long j4, long j5, boolean z4) {
        this.f17176a = timeline;
        this.f17177b = mediaPeriodId;
        this.f17178c = j;
        this.d = j2;
        this.f17179e = i2;
        this.f = exoPlaybackException;
        this.g = z2;
        this.f17180h = trackGroupArray;
        this.f17181i = trackSelectorResult;
        this.j = list;
        this.k = mediaPeriodId2;
        this.f17182l = z3;
        this.m = i3;
        this.f17183n = playbackParameters;
        this.f17184p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z4;
    }

    public static PlaybackInfo g(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.X;
        MediaSource.MediaPeriodId mediaPeriodId = s;
        return new PlaybackInfo(timeline, mediaPeriodId, -9223372036854775807L, 0L, 1, null, false, TrackGroupArray.e0, trackSelectorResult, ImmutableList.x(), mediaPeriodId, false, 0, PlaybackParameters.e0, 0L, 0L, 0L, false);
    }

    public final PlaybackInfo a(MediaSource.MediaPeriodId mediaPeriodId) {
        return new PlaybackInfo(this.f17176a, this.f17177b, this.f17178c, this.d, this.f17179e, this.f, this.g, this.f17180h, this.f17181i, this.j, mediaPeriodId, this.f17182l, this.m, this.f17183n, this.f17184p, this.q, this.r, this.o);
    }

    public final PlaybackInfo b(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List list) {
        return new PlaybackInfo(this.f17176a, mediaPeriodId, j2, j3, this.f17179e, this.f, this.g, trackGroupArray, trackSelectorResult, list, this.k, this.f17182l, this.m, this.f17183n, this.f17184p, j4, j, this.o);
    }

    public final PlaybackInfo c(int i2, boolean z2) {
        return new PlaybackInfo(this.f17176a, this.f17177b, this.f17178c, this.d, this.f17179e, this.f, this.g, this.f17180h, this.f17181i, this.j, this.k, z2, i2, this.f17183n, this.f17184p, this.q, this.r, this.o);
    }

    public final PlaybackInfo d(ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.f17176a, this.f17177b, this.f17178c, this.d, this.f17179e, exoPlaybackException, this.g, this.f17180h, this.f17181i, this.j, this.k, this.f17182l, this.m, this.f17183n, this.f17184p, this.q, this.r, this.o);
    }

    public final PlaybackInfo e(int i2) {
        return new PlaybackInfo(this.f17176a, this.f17177b, this.f17178c, this.d, i2, this.f, this.g, this.f17180h, this.f17181i, this.j, this.k, this.f17182l, this.m, this.f17183n, this.f17184p, this.q, this.r, this.o);
    }

    public final PlaybackInfo f(Timeline timeline) {
        return new PlaybackInfo(timeline, this.f17177b, this.f17178c, this.d, this.f17179e, this.f, this.g, this.f17180h, this.f17181i, this.j, this.k, this.f17182l, this.m, this.f17183n, this.f17184p, this.q, this.r, this.o);
    }
}
