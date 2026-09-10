package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public final class StandaloneMediaClock implements MediaClock {
    public final SystemClock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f5987Y;
    public long Z;
    public long e0;
    public PlaybackParameters f0 = PlaybackParameters.d;

    public StandaloneMediaClock(SystemClock systemClock) {
        this.X = systemClock;
    }

    public final void a(long j) {
        this.Z = j;
        if (this.f5987Y) {
            this.X.getClass();
            this.e0 = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        if (this.f5987Y) {
            a(getPositionUs());
        }
        this.f0 = playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        return this.f0;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        long j = this.Z;
        if (!this.f5987Y) {
            return j;
        }
        this.X.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.e0;
        PlaybackParameters playbackParameters = this.f0;
        return playbackParameters.f5494a == 1.0f ? Util.I(jElapsedRealtime) + j : (jElapsedRealtime * ((long) playbackParameters.f5496c)) + j;
    }
}
