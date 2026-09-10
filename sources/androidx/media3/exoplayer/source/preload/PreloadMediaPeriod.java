package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes.dex */
final class PreloadMediaPeriod implements MediaPeriod {
    public final MediaPeriod X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f6494Y;
    public boolean Z;
    public MediaPeriod.Callback e0;
    public PreloadTrackSelectionHolder f0;

    public static class PreloadTrackSelectionHolder {
    }

    public PreloadMediaPeriod(MediaPeriod mediaPeriod) {
        this.X = mediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        return this.X.a(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return this.X.c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        if (this.f0 == null) {
            return this.X.d(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }
        int length = sampleStreamArr.length;
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        this.X.discardBuffer(j, z2);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.e0 = callback;
        if (this.Z) {
            callback.b(this);
        } else {
            if (this.f6494Y) {
                return;
            }
            this.f6494Y = true;
            this.X.f(new MediaPeriod.Callback() { // from class: androidx.media3.exoplayer.source.preload.PreloadMediaPeriod.1
                @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
                public final void b(MediaPeriod mediaPeriod) {
                    PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                    preloadMediaPeriod.Z = true;
                    MediaPeriod.Callback callback2 = preloadMediaPeriod.e0;
                    callback2.getClass();
                    callback2.b(preloadMediaPeriod);
                }

                @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
                public final void e(SequenceableLoader sequenceableLoader) {
                    PreloadMediaPeriod preloadMediaPeriod = PreloadMediaPeriod.this;
                    MediaPeriod.Callback callback2 = preloadMediaPeriod.e0;
                    callback2.getClass();
                    callback2.e(preloadMediaPeriod);
                }
            }, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.X.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.X.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.X.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.X.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        this.X.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        return this.X.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.X.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        return this.X.seekToUs(j);
    }
}
