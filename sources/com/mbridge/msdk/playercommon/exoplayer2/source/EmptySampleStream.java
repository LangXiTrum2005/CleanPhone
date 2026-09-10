package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z10) {
        decoderInputBuffer.setFlags(4);
        return -4;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public int skipData(long j10) {
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.source.SampleStream
    public void maybeThrowError() throws IOException {
    }
}
