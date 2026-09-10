package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;
import com.google.android.exoplayer2.util.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultMediaClock implements MediaClock {
    public final StandaloneMediaClock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PlaybackParametersListener f17019Y;
    public Renderer Z;
    public MediaClock e0;
    public boolean f0 = true;
    public boolean g0;

    public interface PlaybackParametersListener {
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, SystemClock systemClock) {
        this.f17019Y = playbackParametersListener;
        this.X = new StandaloneMediaClock(systemClock);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final void f(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.e0;
        if (mediaClock != null) {
            mediaClock.f(playbackParameters);
            playbackParameters = this.e0.getPlaybackParameters();
        }
        this.X.f(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.e0;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.X.f0;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public final long getPositionUs() {
        if (this.f0) {
            return this.X.getPositionUs();
        }
        MediaClock mediaClock = this.e0;
        mediaClock.getClass();
        return mediaClock.getPositionUs();
    }
}
