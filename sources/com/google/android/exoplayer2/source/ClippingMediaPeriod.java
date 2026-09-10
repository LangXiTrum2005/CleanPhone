package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaPeriod X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MediaPeriod.Callback f18319Y;
    public ClippingSampleStream[] Z = new ClippingSampleStream[0];
    public long e0;
    public long f0;
    public long g0;
    public ClippingMediaSource.IllegalClippingException h0;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f18320Y;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.X = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
            if (clippingMediaPeriod.b()) {
                return -3;
            }
            if (this.f18320Y) {
                decoderInputBuffer.X = 4;
                return -4;
            }
            int iG = this.X.g(formatHolder, decoderInputBuffer, i2);
            if (iG != -5) {
                long j = clippingMediaPeriod.g0;
                if (j == Long.MIN_VALUE || ((iG != -4 || decoderInputBuffer.f0 < j) && !(iG == -3 && clippingMediaPeriod.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.e0))) {
                    return iG;
                }
                decoderInputBuffer.d();
                decoderInputBuffer.X = 4;
                this.f18320Y = true;
                return -4;
            }
            Format format = formatHolder.f17094b;
            format.getClass();
            int i3 = format.D0;
            int i4 = format.C0;
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
            builderA.f17077A = i4;
            builderA.f17078B = i3;
            formatHolder.f17094b = new Format(builderA);
            return -5;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return !ClippingMediaPeriod.this.b() && this.X.isReady();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() {
            this.X.maybeThrowError();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            if (ClippingMediaPeriod.this.b()) {
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

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public final void a(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.f18319Y;
        callback.getClass();
        callback.a(this);
    }

    public final boolean b() {
        return this.e0 != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        long j2 = this.f0;
        if (j == j2) {
            return j2;
        }
        long jK = Util.k(seekParameters.f17199a, 0L, j - j2);
        long j3 = this.g0;
        long jK2 = Util.k(seekParameters.f17200b, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != seekParameters.f17199a || jK2 != seekParameters.f17200b) {
            seekParameters = new SeekParameters(jK, jK2);
        }
        return this.X.c(j, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        return this.X.continueLoading(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void d(MediaPeriod.Callback callback, long j) {
        this.f18319Y = callback;
        this.X.d(this, j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        this.X.discardBuffer(j, z2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b A[EDGE_INSN: B:23:0x005b->B:24:0x0060 BREAK  A[LOOP:1: B:16:0x0042->B:22:0x0058]] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
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
        long jE = this.X.e(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j);
        if (!b()) {
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
                if (!MimeTypes.a(selectedFormat.m0, selectedFormat.j0)) {
                    j2 = jE;
                    break;
                }
            }
            i3++;
        }
        this.e0 = j2;
        if (jE != j) {
            if (jE >= this.f0) {
                long j4 = this.g0;
                z2 = j4 == Long.MIN_VALUE || jE <= j4;
            }
        }
        Assertions.d(z2);
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
        return jE;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        if (this.h0 != null) {
            return;
        }
        MediaPeriod.Callback callback = this.f18319Y;
        callback.getClass();
        callback.f(this);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
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

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
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

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.X.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        return this.X.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.h0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.X.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        if (b()) {
            long j = this.e0;
            this.e0 = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j;
        }
        long discontinuity2 = this.X.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        Assertions.d(discontinuity2 >= this.f0);
        long j2 = this.g0;
        Assertions.d(j2 == Long.MIN_VALUE || discontinuity2 <= j2);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.X.reevaluateBuffer(j);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j) {
        this.e0 = -9223372036854775807L;
        boolean z2 = false;
        for (ClippingSampleStream clippingSampleStream : this.Z) {
            if (clippingSampleStream != null) {
                clippingSampleStream.f18320Y = false;
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
        Assertions.d(z2);
        return jSeekToUs;
    }
}
