package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final MediaSource.MediaPeriodId X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f6374Y;
    public final Allocator Z;
    public MediaSource e0;
    public MediaPeriod f0;
    public MediaPeriod.Callback g0;
    public PrepareListener h0;
    public boolean i0;
    public long j0 = -9223372036854775807L;

    public interface PrepareListener {
        void a(MediaSource.MediaPeriodId mediaPeriodId, IOException iOException);

        void b(MediaSource.MediaPeriodId mediaPeriodId);
    }

    public MaskingMediaPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        this.X = mediaPeriodId;
        this.Z = allocator;
        this.f6374Y = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        MediaPeriod mediaPeriod = this.f0;
        return mediaPeriod != null && mediaPeriod.a(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void b(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.g0;
        int i2 = Util.f5683a;
        callback.b(this);
        PrepareListener prepareListener = this.h0;
        if (prepareListener == null) {
            return;
        }
        prepareListener.b(this.X);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.c(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2 = this.j0;
        long j3 = (j2 == -9223372036854775807L || j != this.f6374Y) ? j : j2;
        this.j0 = -9223372036854775807L;
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.d(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        mediaPeriod.discardBuffer(j, z2);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void e(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.g0;
        int i2 = Util.f5683a;
        callback.e(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        this.g0 = callback;
        MediaPeriod mediaPeriod = this.f0;
        if (mediaPeriod != null) {
            long j2 = this.j0;
            if (j2 == -9223372036854775807L) {
                j2 = this.f6374Y;
            }
            mediaPeriod.f(this, j2);
        }
    }

    public final void g(MediaSource.MediaPeriodId mediaPeriodId) {
        long j = this.j0;
        if (j == -9223372036854775807L) {
            j = this.f6374Y;
        }
        MediaSource mediaSource = this.e0;
        mediaSource.getClass();
        MediaPeriod mediaPeriodA = mediaSource.A(mediaPeriodId, this.Z, j);
        this.f0 = mediaPeriodA;
        if (this.g0 != null) {
            mediaPeriodA.f(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.getTrackGroups();
    }

    public final void h() {
        if (this.f0 != null) {
            MediaSource mediaSource = this.e0;
            mediaSource.getClass();
            mediaSource.G(this.f0);
        }
    }

    public final void i(MediaSource mediaSource) {
        Assertions.e(this.e0 == null);
        this.e0 = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        MediaPeriod mediaPeriod = this.f0;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
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
            prepareListener.a(this.X, e2);
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        mediaPeriod.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        MediaPeriod mediaPeriod = this.f0;
        int i2 = Util.f5683a;
        return mediaPeriod.seekToUs(j);
    }
}
