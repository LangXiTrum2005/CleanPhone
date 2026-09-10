package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback extends SequenceableLoader.Callback<MediaPeriod> {
        void b(MediaPeriod mediaPeriod);
    }

    long c(long j, SeekParameters seekParameters);

    long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);

    void discardBuffer(long j, boolean z2);

    void f(Callback callback, long j);

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j);
}
