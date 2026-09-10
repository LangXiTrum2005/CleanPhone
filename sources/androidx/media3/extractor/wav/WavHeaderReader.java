package androidx.media3.extractor.wav;

import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
final class WavHeaderReader {

    public static final class ChunkHeader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7678b;

        public ChunkHeader(int i2, long j) {
            this.f7677a = i2;
            this.f7678b = j;
        }

        public static ChunkHeader a(DefaultExtractorInput defaultExtractorInput, ParsableByteArray parsableByteArray) {
            defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 8, false);
            parsableByteArray.G(0);
            return new ChunkHeader(parsableByteArray.g(), parsableByteArray.l());
        }
    }

    public static boolean a(DefaultExtractorInput defaultExtractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i2 = ChunkHeader.a(defaultExtractorInput, parsableByteArray).f7677a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        defaultExtractorInput.peekFully(parsableByteArray.f5667a, 0, 4, false);
        parsableByteArray.G(0);
        int iG = parsableByteArray.g();
        if (iG == 1463899717) {
            return true;
        }
        Log.c("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static ChunkHeader b(int i2, DefaultExtractorInput defaultExtractorInput, ParsableByteArray parsableByteArray) throws ParserException, EOFException, InterruptedIOException {
        ChunkHeader chunkHeaderA = ChunkHeader.a(defaultExtractorInput, parsableByteArray);
        while (true) {
            int i3 = chunkHeaderA.f7677a;
            if (i3 == i2) {
                return chunkHeaderA;
            }
            a.C(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = chunkHeaderA.f7678b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            defaultExtractorInput.skipFully((int) j2);
            chunkHeaderA = ChunkHeader.a(defaultExtractorInput, parsableByteArray);
        }
    }
}
