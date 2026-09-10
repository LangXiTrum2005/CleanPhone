package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: loaded from: classes.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MediaPeriod.Callback f6343Y;
    public ClippingSampleStream[] Z = new ClippingSampleStream[0];
    public long e0;
    public long f0;
    public long g0;
    public ClippingMediaSource.IllegalClippingException h0;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f6344Y;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.X = sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
            if (clippingMediaPeriod.g()) {
                return -3;
            }
            if (this.f6344Y) {
                decoderInputBuffer.X = 4;
                return -4;
            }
            long bufferedPositionUs = clippingMediaPeriod.getBufferedPositionUs();
            int iE = this.X.e(formatHolder, decoderInputBuffer, i2);
            if (iE != -5) {
                long j = clippingMediaPeriod.g0;
                if (j == Long.MIN_VALUE || ((iE != -4 || decoderInputBuffer.g0 < j) && !(iE == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f0))) {
                    return iE;
                }
                decoderInputBuffer.d();
                decoderInputBuffer.X = 4;
                this.f6344Y = true;
                return -4;
            }
            Format format = formatHolder.f5911b;
            format.getClass();
            int i3 = format.f5402E;
            int i4 = format.D;
            if (i4 == 0 && i3 == 0) {
                return -5;
            }
            if (clippingMediaPeriod.f0 != 0) {
                i4 = 0;
            }
            if (clippingMediaPeriod.g0 != Long.MIN_VALUE) {
                i3 = 0;
            }
            Format.Builder builderA = format.a();
            builderA.C = i4;
            builderA.D = i3;
            formatHolder.f5911b = new Format(builderA);
            return -5;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return !ClippingMediaPeriod.this.g() && this.X.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            this.X.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            if (ClippingMediaPeriod.this.g()) {
                return -3;
            }
            return this.X.skipData(j);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z2, long j, long j2) {
        this.X = mediaPeriod;
        this.e0 = z2 ? j : -9223372036854775807L;
        this.f0 = j;
        this.g0 = j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        return this.X.a(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void b(MediaPeriod mediaPeriod) {
        if (this.h0 != null) {
            return;
        }
        MediaPeriod.Callback callback = this.f6343Y;
        callback.getClass();
        callback.b(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        long j2 = this.f0;
        if (j == j2) {
            return j2;
        }
        long jK = Util.k(seekParameters.f5985a, 0L, j - j2);
        long j3 = this.g0;
        long jK2 = Util.k(seekParameters.f5986b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != seekParameters.f5985a || jK2 != seekParameters.f5986b) {
            seekParameters = new SeekParameters(jK, jK2);
        }
        return this.X.c(j, seekParameters);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b A[EDGE_INSN: B:23:0x005b->B:24:0x0060 BREAK  A[LOOP:1: B:16:0x0042->B:22:0x0058]] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        boolean z2;
        this.Z = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i2 = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i2 >= sampleStreamArr.length) {
                break;
            }
            ClippingSampleStream[] clippingSampleStreamArr = this.Z;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i2];
            clippingSampleStreamArr[i2] = clippingSampleStream;
            if (clippingSampleStream != null) {
                sampleStream = clippingSampleStream.X;
            }
            sampleStreamArr2[i2] = sampleStream;
            i2++;
        }
        long jD = this.X.d(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j);
        if (!g()) {
            j2 = -9223372036854775807L;
            break;
        }
        long j3 = this.f0;
        if (j != j3 || j3 == 0) {
            j2 = -9223372036854775807L;
            break;
        }
        int length = exoTrackSelectionArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                j2 = -9223372036854775807L;
                break;
            }
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i3];
            if (exoTrackSelection != null) {
                Format selectedFormat = exoTrackSelection.getSelectedFormat();
                if (!MimeTypes.a(selectedFormat.m, selectedFormat.j)) {
                    j2 = jD;
                    break;
                }
            }
            i3++;
        }
        this.e0 = j2;
        if (jD != j) {
            if (jD >= this.f0) {
                long j4 = this.g0;
                z2 = j4 == Long.MIN_VALUE || jD <= j4;
            }
        }
        Assertions.e(z2);
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            SampleStream sampleStream2 = sampleStreamArr2[i4];
            if (sampleStream2 == null) {
                this.Z[i4] = null;
            } else {
                ClippingSampleStream[] clippingSampleStreamArr2 = this.Z;
                ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i4];
                if (clippingSampleStream2 == null || clippingSampleStream2.X != sampleStream2) {
                    clippingSampleStreamArr2[i4] = new ClippingSampleStream(sampleStream2);
                }
            }
            sampleStreamArr[i4] = this.Z[i4];
        }
        return jD;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        this.X.discardBuffer(j, z2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void e(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.f6343Y;
        callback.getClass();
        callback.e(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.f6343Y = callback;
        this.X.f(this, j);
    }

    public final boolean g() {
        return this.e0 != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.X.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.X.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.g0;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
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
    public final void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.h0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.X.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        if (g()) {
            long j = this.e0;
            this.e0 = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.X.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        Assertions.e(discontinuity2 >= this.f0);
        long j2 = this.g0;
        Assertions.e(j2 == Long.MIN_VALUE || discontinuity2 <= j2);
        return discontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.X.reevaluateBuffer(j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        this.e0 = -9223372036854775807L;
        boolean z2 = false;
        for (ClippingSampleStream clippingSampleStream : this.Z) {
            if (clippingSampleStream != null) {
                clippingSampleStream.f6344Y = false;
            }
        }
        long jSeekToUs = this.X.seekToUs(j);
        if (jSeekToUs == j) {
            z2 = true;
        } else if (jSeekToUs >= this.f0) {
            long j2 = this.g0;
            if (j2 == Long.MIN_VALUE || jSeekToUs <= j2) {
                z2 = true;
            }
        }
        Assertions.e(z2);
        return jSeekToUs;
    }
}
