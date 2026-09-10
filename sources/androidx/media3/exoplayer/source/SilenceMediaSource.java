package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    public static final Format j0;
    public static final byte[] k0;
    public MediaItem i0;

    public static final class Factory {
    }

    public static final class SilenceMediaPeriod implements MediaPeriod {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final TrackGroupArray f6446Y = new TrackGroupArray(new TrackGroup("", SilenceMediaSource.j0));
        public final ArrayList X = new ArrayList();

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean a(LoadingInfo loadingInfo) {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            return Util.k(j, 0L, 0L);
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            long jK = Util.k(j, 0L, 0L);
            for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                SampleStream sampleStream = sampleStreamArr[i2];
                ArrayList arrayList = this.X;
                if (sampleStream != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                    arrayList.remove(sampleStream);
                    sampleStreamArr[i2] = null;
                }
                if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                    SilenceSampleStream silenceSampleStream = new SilenceSampleStream();
                    silenceSampleStream.a(jK);
                    arrayList.add(silenceSampleStream);
                    sampleStreamArr[i2] = silenceSampleStream;
                    zArr2[i2] = true;
                }
            }
            return jK;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void f(MediaPeriod.Callback callback, long j) {
            callback.b(this);
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final TrackGroupArray getTrackGroups() {
            return f6446Y;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean isLoading() {
            return false;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void maybeThrowPrepareError() {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long seekToUs(long j) {
            long jK = Util.k(j, 0L, 0L);
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.X;
                if (i2 >= arrayList.size()) {
                    return jK;
                }
                ((SilenceSampleStream) arrayList.get(i2)).a(jK);
                i2++;
            }
        }
    }

    public static final class SilenceSampleStream implements SampleStream {
        public final long X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f6447Y;
        public long Z;

        public SilenceSampleStream() {
            Format format = SilenceMediaSource.j0;
            int i2 = Util.f5683a;
            this.X = 0L;
            a(0L);
        }

        public final void a(long j) {
            Format format = SilenceMediaSource.j0;
            int i2 = Util.f5683a;
            this.Z = Util.k(((long) 4) * ((j * 44100) / 1000000), 0L, this.X);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (!this.f6447Y || (i2 & 2) != 0) {
                formatHolder.f5911b = SilenceMediaSource.j0;
                this.f6447Y = true;
                return -5;
            }
            long j = this.Z;
            long j2 = this.X - j;
            if (j2 == 0) {
                decoderInputBuffer.a(4);
                return -4;
            }
            Format format = SilenceMediaSource.j0;
            int i3 = Util.f5683a;
            decoderInputBuffer.g0 = ((j / ((long) 4)) * 1000000) / 44100;
            decoderInputBuffer.a(1);
            byte[] bArr = SilenceMediaSource.k0;
            int iMin = (int) Math.min(bArr.length, j2);
            if ((4 & i2) == 0) {
                decoderInputBuffer.g(iMin);
                decoderInputBuffer.e0.put(bArr, 0, iMin);
            }
            if ((i2 & 1) == 0) {
                this.Z += (long) iMin;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return true;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            long j2 = this.Z;
            a(j);
            return (int) ((this.Z - j2) / ((long) SilenceMediaSource.k0.length));
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l("audio/raw");
        builder.f5434z = 2;
        builder.f5418A = 44100;
        builder.f5419B = 2;
        Format format = new Format(builder);
        j0 = format;
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.f5441a = "SilenceMediaSource";
        builder2.f5442b = Uri.EMPTY;
        builder2.f5443c = format.m;
        builder2.a();
        k0 = new byte[4096];
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod A(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SilenceMediaPeriod();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void G(MediaPeriod mediaPeriod) {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void M(MediaItem mediaItem) {
        this.i0 = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X(TransferListener transferListener) {
        Y(new SinglePeriodTimeline(0L, true, false, m()));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void Z() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem m() {
        return this.i0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }
}
