package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class DummyTrackOutput implements TrackOutput {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public int sampleData(ExtractorInput extractorInput, int i10, boolean z10) throws InterruptedException, IOException {
        int iSkip = extractorInput.skip(i10);
        if (iSkip != -1) {
            return iSkip;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
    public void sampleMetadata(long j10, int i10, int i11, int i12, TrackOutput.CryptoData cryptoData) {
    }
}
