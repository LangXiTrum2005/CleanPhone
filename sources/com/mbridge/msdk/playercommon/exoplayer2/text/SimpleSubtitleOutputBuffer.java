package com.mbridge.msdk.playercommon.exoplayer2.text;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class SimpleSubtitleOutputBuffer extends SubtitleOutputBuffer {
    private final SimpleSubtitleDecoder owner;

    public SimpleSubtitleOutputBuffer(SimpleSubtitleDecoder simpleSubtitleDecoder) {
        this.owner = simpleSubtitleDecoder;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleOutputBuffer, com.mbridge.msdk.playercommon.exoplayer2.decoder.OutputBuffer
    public final void release() {
        this.owner.releaseOutputBuffer((SubtitleOutputBuffer) this);
    }
}
