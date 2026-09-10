package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes.dex */
final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f6460Y;
    public MediaPeriod.Callback Z;

    public static final class TimeOffsetSampleStream implements SampleStream {
        public final SampleStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f6461Y;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.X = sampleStream;
            this.f6461Y = j;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int iE = this.X.e(formatHolder, decoderInputBuffer, i2);
            if (iE == -4) {
                decoderInputBuffer.g0 += this.f6461Y;
            }
            return iE;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return this.X.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            this.X.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            return this.X.skipData(j - this.f6461Y);
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.X = mediaPeriod;
        this.f6460Y = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        LoadingInfo.Builder builder = new LoadingInfo.Builder();
        builder.f5920b = loadingInfo.f5917b;
        builder.f5921c = loadingInfo.f5918c;
        builder.f5919a = loadingInfo.f5916a - this.f6460Y;
        return this.X.a(new LoadingInfo(builder));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void b(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.Z;
        callback.getClass();
        callback.b(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        long j2 = this.f6460Y;
        return this.X.c(j - j2, seekParameters) + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i2 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i2 >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i2];
            if (timeOffsetSampleStream != null) {
                sampleStream = timeOffsetSampleStream.X;
            }
            sampleStreamArr2[i2] = sampleStream;
            i2++;
        }
        long j2 = this.f6460Y;
        long jD = this.X.d(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - j2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            SampleStream sampleStream2 = sampleStreamArr2[i3];
            if (sampleStream2 == null) {
                sampleStreamArr[i3] = null;
            } else {
                SampleStream sampleStream3 = sampleStreamArr[i3];
                if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).X != sampleStream2) {
                    sampleStreamArr[i3] = new TimeOffsetSampleStream(sampleStream2, j2);
                }
            }
        }
        return jD + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        this.X.discardBuffer(j - this.f6460Y, z2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void e(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.Z;
        callback.getClass();
        callback.e(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.Z = callback;
        this.X.f(this, j - this.f6460Y);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.X.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f6460Y;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.X.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f6460Y;
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
        long discontinuity = this.X.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.f6460Y;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.X.reevaluateBuffer(j - this.f6460Y);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        long j2 = this.f6460Y;
        return this.X.seekToUs(j - j2) + j2;
    }
}
