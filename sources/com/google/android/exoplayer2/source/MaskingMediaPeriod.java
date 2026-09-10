package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaSource.MediaPeriodId X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18340Y;
    public final Allocator Z;
    public MediaSource e0;
    public MediaPeriod f0;
    public MediaPeriod.Callback g0;
    public PrepareListener h0;
    public boolean i0;
    public long j0 = -9223372036854775807L;

    public interface PrepareListener {
        void a(MediaSource.MediaPeriodId mediaPeriodId);

        void b(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        this.X = mediaPeriodId;
        this.Z = allocator;
        this.f18340Y = j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public final void a(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.g0;
        int i2 = Util.f18979a;
        callback.a(this);
    }

    public final void b(MediaSource.MediaPeriodId mediaPeriodId) {
        long j = this.j0;
        if (j == -9223372036854775807L) {
            j = this.f18340Y;
        }
        MediaSource mediaSource = this.e0;
        mediaSource.getClass();
        MediaPeriod mediaPeriodU = mediaSource.u(mediaPeriodId, this.Z, j);
        this.f0 = mediaPeriodU;
        if (this.g0 != null) {
            mediaPeriodU.d(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.c(j, seekParameters);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean continueLoading(long j) {
        MediaPeriod mediaPeriod = this.f0;
        return mediaPeriod != null && mediaPeriod.continueLoading(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void d(MediaPeriod.Callback callback, long j) {
        this.g0 = callback;
        MediaPeriod mediaPeriod = this.f0;
        if (mediaPeriod != null) {
            long j2 = this.j0;
            if (j2 == -9223372036854775807L) {
                j2 = this.f18340Y;
            }
            mediaPeriod.d(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        mediaPeriod.discardBuffer(j, z2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.j0;
        if (j3 == -9223372036854775807L || j != this.f18340Y) {
            j2 = j;
        } else {
            this.j0 = -9223372036854775807L;
            j2 = j3;
        }
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.e(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j2);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.g0;
        int i2 = Util.f18979a;
        callback.f(this);
        PrepareListener prepareListener = this.h0;
        if (prepareListener == null) {
            return;
        }
        prepareListener.a(this.X);
        throw null;
    }

    public final void g() {
        if (this.f0 != null) {
            MediaSource mediaSource = this.e0;
            mediaSource.getClass();
            mediaSource.B(this.f0);
        }
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.getTrackGroups();
    }

    public final void h(MediaSource mediaSource) {
        Assertions.d(this.e0 == null);
        this.e0 = mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final boolean isLoading() {
        MediaPeriod mediaPeriod = this.f0;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final void maybeThrowPrepareError() throws IOException {
        try {
            MediaPeriod mediaPeriod = this.f0;
            if (mediaPeriod != null) {
                mediaPeriod.maybeThrowPrepareError();
                return;
            }
            MediaSource mediaSource = this.e0;
            if (mediaSource != null) {
                mediaSource.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e2) {
            PrepareListener prepareListener = this.h0;
            if (prepareListener == null) {
                throw e2;
            }
            if (this.i0) {
                return;
            }
            this.i0 = true;
            prepareListener.b(this.X, e2);
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long readDiscontinuity() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.readDiscontinuity();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        mediaPeriod.reevaluateBuffer(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public final long seekToUs(long j) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f18979a;
        return mediaPeriod.seekToUs(j);
    }
}
