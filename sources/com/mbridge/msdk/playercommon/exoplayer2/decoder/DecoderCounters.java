package com.mbridge.msdk.playercommon.exoplayer2.decoder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class DecoderCounters {
    public int decoderInitCount;
    public int decoderReleaseCount;
    public int droppedBufferCount;
    public int droppedToKeyframeCount;
    public int inputBufferCount;
    public int maxConsecutiveDroppedBufferCount;
    public int renderedOutputBufferCount;
    public int skippedInputBufferCount;
    public int skippedOutputBufferCount;

    public synchronized void ensureUpdated() {
    }

    public void merge(DecoderCounters decoderCounters) {
        this.decoderInitCount += decoderCounters.decoderInitCount;
        this.decoderReleaseCount += decoderCounters.decoderReleaseCount;
        this.inputBufferCount += decoderCounters.inputBufferCount;
        this.skippedInputBufferCount += decoderCounters.skippedInputBufferCount;
        this.renderedOutputBufferCount += decoderCounters.renderedOutputBufferCount;
        this.skippedOutputBufferCount += decoderCounters.skippedOutputBufferCount;
        this.droppedBufferCount += decoderCounters.droppedBufferCount;
        this.maxConsecutiveDroppedBufferCount = Math.max(this.maxConsecutiveDroppedBufferCount, decoderCounters.maxConsecutiveDroppedBufferCount);
        this.droppedToKeyframeCount += decoderCounters.droppedToKeyframeCount;
    }
}
