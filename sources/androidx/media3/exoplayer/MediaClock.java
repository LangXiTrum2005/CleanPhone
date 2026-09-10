package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;

/* JADX INFO: loaded from: classes.dex */
public interface MediaClock {
    void c(PlaybackParameters playbackParameters);

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    default boolean j() {
        return false;
    }
}
