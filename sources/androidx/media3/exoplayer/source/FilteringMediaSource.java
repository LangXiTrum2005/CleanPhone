package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
public class FilteringMediaSource extends WrappingMediaSource {

    public static final class FilteringMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
        public final MediaPeriod X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public MediaPeriod.Callback f6365Y;
        public TrackGroupArray Z;

        public FilteringMediaPeriod(MediaPeriod mediaPeriod) {
            this.X = mediaPeriod;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean a(LoadingInfo loadingInfo) {
            return this.X.a(loadingInfo);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void b(MediaPeriod mediaPeriod) {
            TrackGroupArray trackGroups = mediaPeriod.getTrackGroups();
            ImmutableList.Builder builderS = ImmutableList.s();
            if (trackGroups.f6463a > 0) {
                int i2 = trackGroups.a(0).f5523c;
                throw null;
            }
            this.Z = new TrackGroupArray((TrackGroup[]) builderS.j().toArray(new TrackGroup[0]));
            MediaPeriod.Callback callback = this.f6365Y;
            callback.getClass();
            callback.b(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            return this.X.c(j, seekParameters);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            return this.X.d(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
            this.X.discardBuffer(j, z2);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void e(SequenceableLoader sequenceableLoader) {
            MediaPeriod.Callback callback = this.f6365Y;
            callback.getClass();
            callback.e(this);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void f(MediaPeriod.Callback callback, long j) {
            this.f6365Y = callback;
            this.X.f(this, j);
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
            TrackGroupArray trackGroupArray = this.Z;
            trackGroupArray.getClass();
            return trackGroupArray;
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

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new FilteringMediaPeriod(this.l0.A(mediaPeriodId, allocator, j));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
        super.G(((FilteringMediaPeriod) mediaPeriod).X);
    }
}
