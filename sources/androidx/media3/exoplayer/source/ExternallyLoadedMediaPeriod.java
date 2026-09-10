package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.FutureCallback;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class ExternallyLoadedMediaPeriod implements MediaPeriod {
    public final TrackGroupArray X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final byte[] f6363Y;
    public final AtomicBoolean Z;
    public final AtomicReference e0;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.ExternallyLoadedMediaPeriod$1, reason: invalid class name */
    class AnonymousClass1 implements FutureCallback<Object> {
        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th) {
            throw null;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(Object obj) {
            throw null;
        }
    }

    public final class SampleStreamImpl implements SampleStream {
        public int X = 0;

        public SampleStreamImpl() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int e(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i2) {
            int i3 = this.X;
            if (i3 == 2) {
                decoderInputBuffer.a(4);
                return -4;
            }
            int i4 = i2 & 2;
            ExternallyLoadedMediaPeriod externallyLoadedMediaPeriod = ExternallyLoadedMediaPeriod.this;
            if (i4 != 0 || i3 == 0) {
                formatHolder.f5911b = externallyLoadedMediaPeriod.X.a(0).d[0];
                this.X = 1;
                return -5;
            }
            if (!externallyLoadedMediaPeriod.Z.get()) {
                return -3;
            }
            byte[] bArr = externallyLoadedMediaPeriod.f6363Y;
            int length = bArr.length;
            decoderInputBuffer.a(1);
            decoderInputBuffer.g0 = 0L;
            if ((i2 & 4) == 0) {
                decoderInputBuffer.g(length);
                decoderInputBuffer.e0.put(bArr, 0, length);
            }
            if ((i2 & 1) == 0) {
                this.X = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return ExternallyLoadedMediaPeriod.this.Z.get();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() throws IOException {
            Throwable th = (Throwable) ExternallyLoadedMediaPeriod.this.e0.get();
            if (th != null) {
                throw new IOException(th);
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            return 0;
        }
    }

    public ExternallyLoadedMediaPeriod(Uri uri, String str) {
        Format.Builder builder = new Format.Builder();
        builder.f5429l = MimeTypes.l(str);
        this.X = new TrackGroupArray(new TrackGroup("", new Format(builder)));
        this.f6363Y = uri.toString().getBytes(Charsets.f19705c);
        this.Z = new AtomicBoolean();
        this.e0 = new AtomicReference();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean a(LoadingInfo loadingInfo) {
        return !this.Z.get();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long c(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long d(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
            if (sampleStreamArr[i2] != null && (exoTrackSelectionArr[i2] == null || !zArr[i2])) {
                sampleStreamArr[i2] = null;
            }
            if (sampleStreamArr[i2] == null && exoTrackSelectionArr[i2] != null) {
                sampleStreamArr[i2] = new SampleStreamImpl();
                zArr2[i2] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j, boolean z2) {
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void f(MediaPeriod.Callback callback, long j) {
        callback.b(this);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.Z.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.Z.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.X;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return !this.Z.get();
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
        return j;
    }
}
