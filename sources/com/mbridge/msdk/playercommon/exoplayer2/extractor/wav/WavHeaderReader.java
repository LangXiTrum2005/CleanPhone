package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import android.util.Log;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final int TYPE_FLOAT = 3;
    private static final int TYPE_PCM = 1;
    private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final int f35133id;
        public final long size;

        private ChunkHeader(int i10, long j10) {
            this.f35133id = i10;
            this.size = j10;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws InterruptedException, IOException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static WavHeader peek(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i10;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f35133id != Util.getIntegerCodeForString("RIFF")) {
            return null;
        }
        int pcmEncoding = 0;
        extractorInput.peekFully(parsableByteArray.data, 0, 4);
        parsableByteArray.setPosition(0);
        int i11 = parsableByteArray.readInt();
        if (i11 != Util.getIntegerCodeForString("WAVE")) {
            f2.o(i11, "Unsupported RIFF format: ", TAG);
            return null;
        }
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f35133id != Util.getIntegerCodeForString("fmt ")) {
            extractorInput.advancePeekPosition((int) chunkHeaderPeek.size);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        Assertions.checkState(chunkHeaderPeek.size >= 16);
        extractorInput.peekFully(parsableByteArray.data, 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i12 = (littleEndianUnsignedShort2 * littleEndianUnsignedShort4) / 8;
        if (littleEndianUnsignedShort3 != i12) {
            throw new ParserException(e.g(i12, littleEndianUnsignedShort3, "Expected block alignment: ", "; got: "));
        }
        if (littleEndianUnsignedShort == 1) {
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else if (littleEndianUnsignedShort != 3) {
            if (littleEndianUnsignedShort != TYPE_WAVE_FORMAT_EXTENSIBLE) {
                f2.o(littleEndianUnsignedShort, "Unsupported WAV format type: ", TAG);
                return null;
            }
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else {
            i10 = littleEndianUnsignedShort4 == 32 ? 4 : pcmEncoding;
        }
        if (i10 != 0) {
            extractorInput.advancePeekPosition(((int) chunkHeaderPeek.size) - 16);
            return new WavHeader(littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, i10);
        }
        Log.e(TAG, "Unsupported WAV bit depth " + littleEndianUnsignedShort4 + " for type " + littleEndianUnsignedShort);
        return null;
    }

    public static void skipToData(ExtractorInput extractorInput, WavHeader wavHeader) throws InterruptedException, IOException {
        Assertions.checkNotNull(extractorInput);
        Assertions.checkNotNull(wavHeader);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f35133id != Util.getIntegerCodeForString("data")) {
            Log.w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.f35133id);
            long j10 = chunkHeaderPeek.size + 8;
            if (chunkHeaderPeek.f35133id == Util.getIntegerCodeForString("RIFF")) {
                j10 = 12;
            }
            if (j10 > 2147483647L) {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.f35133id);
            }
            extractorInput.skipFully((int) j10);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        extractorInput.skipFully(8);
        wavHeader.setDataBounds(extractorInput.getPosition(), chunkHeaderPeek.size);
    }
}
