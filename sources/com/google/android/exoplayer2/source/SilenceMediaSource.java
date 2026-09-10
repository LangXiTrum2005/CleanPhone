package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class SilenceMediaSource extends BaseMediaSource {
    public static final Format i0;
    public static final byte[] j0;

    public static final class Factory {
    }

    public static final class SilenceMediaPeriod implements MediaPeriod {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final TrackGroupArray f18410Y = new TrackGroupArray(new TrackGroup("", SilenceMediaSource.i0));
        public final ArrayList X = new ArrayList();

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            return Util.k(j, 0L, 0L);
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean continueLoading(long j) {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void d(MediaPeriod.Callback callback, long j) {
            callback.f(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void discardBuffer(long j, boolean z2) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long e(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
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

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getBufferedPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final long getNextLoadPositionUs() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final TrackGroupArray getTrackGroups() {
            return f18410Y;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final boolean isLoading() {
            return false;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final void maybeThrowPrepareError() {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public final long readDiscontinuity() {
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader
        public final void reevaluateBuffer(long j) {
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
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
        public boolean f18411Y;
        public long Z;

        public SilenceSampleStream() {
            Format format = SilenceMediaSource.i0;
            int i2 = Util.f18979a;
            this.X = 0L;
            a(0L);
        }

        public final void a(long j) {
            Format format = SilenceMediaSource.i0;
            int i2 = Util.f18979a;
            this.Z = Util.k(((long) 4) * ((j * 44100) / 1000000), 0L, this.X);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int g(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            if (!this.f18411Y || (i2 & 2) != 0) {
                formatHolder.f17094b = SilenceMediaSource.i0;
                this.f18411Y = true;
                return -5;
            }
            long j = this.Z;
            long j2 = this.X - j;
            if (j2 == 0) {
                decoderInputBuffer.a(4);
                return -4;
            }
            Format format = SilenceMediaSource.i0;
            int i3 = Util.f18979a;
            decoderInputBuffer.f0 = ((j / ((long) 4)) * 1000000) / 44100;
            decoderInputBuffer.a(1);
            byte[] bArr = SilenceMediaSource.j0;
            int iMin = (int) Math.min(bArr.length, j2);
            if ((4 & i2) == 0) {
                decoderInputBuffer.g(iMin);
                decoderInputBuffer.Z.put(bArr, 0, iMin);
            }
            if ((i2 & 1) == 0) {
                this.Z += (long) iMin;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean isReady() {
            return true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void maybeThrowError() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int skipData(long j) {
            long j2 = this.Z;
            a(j);
            return (int) ((this.Z - j2) / ((long) SilenceMediaSource.j0.length));
        }
    }

    static {
        Format.Builder builder = new Format.Builder();
        builder.k = "audio/raw";
        builder.x = 2;
        builder.y = 44100;
        builder.f17092z = 2;
        Format format = new Format(builder);
        i0 = format;
        MediaItem.Builder builder2 = new MediaItem.Builder();
        builder2.f17096a = "SilenceMediaSource";
        builder2.f17097b = Uri.EMPTY;
        builder2.f17098c = format.m0;
        builder2.a();
        j0 = new byte[4096];
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void B(MediaPeriod mediaPeriod) {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void T(TransferListener transferListener) {
        U(new SinglePeriodTimeline(0L, true, false, null));
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public final void V() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaItem m() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final MediaPeriod u(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SilenceMediaPeriod();
    }
}
