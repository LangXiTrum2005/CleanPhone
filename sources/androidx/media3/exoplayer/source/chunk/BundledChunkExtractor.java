package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public SeekMap X;

    public static final class BindingTrackOutput implements TrackOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TrackOutput f6477a;

        @Override // androidx.media3.extractor.TrackOutput
        public final void a(ParsableByteArray parsableByteArray, int i2, int i3) {
            TrackOutput trackOutput = this.f6477a;
            int i4 = Util.f5683a;
            trackOutput.e(i2, parsableByteArray);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void b(Format format) {
            throw null;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final int d(DataReader dataReader, int i2, boolean z2) {
            TrackOutput trackOutput = this.f6477a;
            int i3 = Util.f5683a;
            return trackOutput.c(dataReader, i2, z2);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
            if (j >= 0) {
                this.f6477a = null;
            }
            TrackOutput trackOutput = this.f6477a;
            int i5 = Util.f5683a;
            trackOutput.f(j, i2, i3, i4, cryptoData);
        }
    }

    public static final class Factory implements ChunkExtractor.Factory {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void e(SeekMap seekMap) {
        this.X = seekMap;
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
