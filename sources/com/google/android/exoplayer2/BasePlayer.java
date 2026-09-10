package com.google.android.exoplayer2;

import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePlayer implements Player {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline.Window f16995a = new Timeline.Window();

    @Override // com.google.android.exoplayer2.Player
    public final void g(MediaItem mediaItem) {
        i(ImmutableList.z(mediaItem));
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && getPlayWhenReady() && e() == 0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void play() {
        setPlayWhenReady(true);
    }
}
