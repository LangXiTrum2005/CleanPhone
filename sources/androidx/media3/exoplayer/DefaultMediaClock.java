package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class DefaultMediaClock implements MediaClock {
    public final StandaloneMediaClock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PlaybackParametersListener f5850Y;
    public Renderer Z;
    public MediaClock e0;
    public boolean f0 = true;
    public boolean g0;

    public interface PlaybackParametersListener {
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, SystemClock systemClock) {
        this.f5850Y = playbackParametersListener;
        this.X = new StandaloneMediaClock(systemClock);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.e0;
        if (mediaClock != null) {
            mediaClock.c(playbackParameters);
            playbackParameters = this.e0.getPlaybackParameters();
        }
        this.X.c(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.e0;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.X.f0;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long getPositionUs() {
        if (this.f0) {
            return this.X.getPositionUs();
        }
        MediaClock mediaClock = this.e0;
        mediaClock.getClass();
        return mediaClock.getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean j() {
        if (this.f0) {
            this.X.getClass();
            return false;
        }
        MediaClock mediaClock = this.e0;
        mediaClock.getClass();
        return mediaClock.j();
    }
}
