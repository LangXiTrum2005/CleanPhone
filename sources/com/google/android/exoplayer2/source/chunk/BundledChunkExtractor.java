package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public SeekMap X;

    public static final class BindingTrackOutput implements TrackOutput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TrackOutput f18437a;

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final int a(DataReader dataReader, int i2, boolean z2) {
            TrackOutput trackOutput = this.f18437a;
            int i3 = Util.f18979a;
            return trackOutput.d(dataReader, i2, z2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void b(int i2, ParsableByteArray parsableByteArray) {
            TrackOutput trackOutput = this.f18437a;
            int i3 = Util.f18979a;
            trackOutput.e(i2, parsableByteArray);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void c(Format format) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public final void f(long j, int i2, int i3, int i4, TrackOutput.CryptoData cryptoData) {
            if (j >= 0) {
                this.f18437a = null;
            }
            TrackOutput trackOutput = this.f18437a;
            int i5 = Util.f18979a;
            trackOutput.f(j, i2, i3, i4, cryptoData);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void g(SeekMap seekMap) {
        this.X = seekMap;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i2, int i3) {
        throw null;
    }
}
