package com.google.android.exoplayer2;

import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.DefaultAllocator;

/* JADX INFO: loaded from: classes3.dex */
public interface LoadControl {
    boolean a(long j, float f, boolean z2, long j2);

    void b(Renderer[] rendererArr, ExoTrackSelection[] exoTrackSelectionArr);

    DefaultAllocator getAllocator();

    long getBackBufferDurationUs();

    void onPrepared();

    void onReleased();

    void onStopped();

    boolean retainBackBufferFromKeyframe();

    boolean shouldContinueLoading(long j, float f);
}
