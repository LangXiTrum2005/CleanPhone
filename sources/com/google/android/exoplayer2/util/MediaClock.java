package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.PlaybackParameters;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaClock {
    void f(PlaybackParameters playbackParameters);

    PlaybackParameters getPlaybackParameters();

    long getPositionUs();
}
