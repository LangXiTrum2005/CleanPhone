package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class MediaExtractorCompat {

    public final class ExtractorOutputImpl implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public final void e(SeekMap seekMap) {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final void endTracks() {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final TrackOutput track(int i2, int i3) {
            throw null;
        }
    }

    public final class MediaExtractorSampleQueue extends SampleQueue {
        @Override // androidx.media3.exoplayer.source.SampleQueue, androidx.media3.extractor.TrackOutput
        public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleQueue
        public final Format j(Format format) {
            l().getClass();
            return format;
        }

        public final String toString() {
            return "trackId: 0, mainTrackIndex: 0, compatibilityTrackIndex: 0";
        }
    }

    public static final class MediaExtractorTrack {
        public final String toString() {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }
}
