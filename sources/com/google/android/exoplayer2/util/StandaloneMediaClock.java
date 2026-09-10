package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

/* JADX INFO: loaded from: classes3.dex */
public final class StandaloneMediaClock implements MediaClock {
    public final SystemClock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f18969Y;
    public long Z;
    public long e0;
    public PlaybackParameters f0 = PlaybackParameters.e0;

    public StandaloneMediaClock(SystemClock systemClock) {
        this.X = systemClock;
    }

    public final void a(long j) {
        this.Z = j;
        if (this.f18969Y) {
            this.X.getClass();
            this.e0 = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final void f(PlaybackParameters playbackParameters) {
        if (this.f18969Y) {
            a(getPositionUs());
        }
        this.f0 = playbackParameters;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.f0;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        long j = this.Z;
        if (!this.f18969Y) {
            return j;
        }
        this.X.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.e0;
        PlaybackParameters playbackParameters = this.f0;
        return playbackParameters.X == 1.0f ? Util.B(jElapsedRealtime) + j : (jElapsedRealtime * ((long) playbackParameters.Z)) + j;
    }
}
