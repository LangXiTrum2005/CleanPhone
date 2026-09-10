package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes3.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void f(MediaPeriod mediaPeriod);
    }

    long c(long j, SeekParameters seekParameters);

    void d(Callback callback, long j);

    void discardBuffer(long j, boolean z2);

    long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j);
}
