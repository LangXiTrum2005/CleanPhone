package com.google.android.exoplayer2.extractor.wav;

import com.applovin.impl.Z;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* JADX INFO: loaded from: classes3.dex */
final class WavHeaderReader {

    public static final class ChunkHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18125b;

        public ChunkHeader(int i2, long j) {
            this.f18124a = i2;
            this.f18125b = j;
        }

        public static ChunkHeader a(DefaultExtractorInput defaultExtractorInput, ParsableByteArray parsableByteArray) {
            defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 8, false);
            parsableByteArray.F(0);
            return new ChunkHeader(parsableByteArray.g(), parsableByteArray.l());
        }
    }

    public static boolean a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i2 = ChunkHeader.a(defaultExtractorInput, parsableByteArray).f18124a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        defaultExtractorInput.peekFully(parsableByteArray.f18956a, 0, 4, false);
        parsableByteArray.F(0);
        int iG = parsableByteArray.g();
        if (iG == 1463899717) {
            return true;
        }
        Log.c("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static ChunkHeader b(int i2, DefaultExtractorInput defaultExtractorInput, ParsableByteArray parsableByteArray) {
        ChunkHeader chunkHeaderA = ChunkHeader.a(defaultExtractorInput, parsableByteArray);
        while (true) {
            int i3 = chunkHeaderA.f18124a;
            if (i3 == i2) {
                return chunkHeaderA;
            }
            Z.s(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = chunkHeaderA.f18125b + 8;
            if (j > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            defaultExtractorInput.skipFully((int) j);
            chunkHeaderA = ChunkHeader.a(defaultExtractorInput, parsableByteArray);
        }
    }
}
