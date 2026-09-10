package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class WavHeader implements SeekMap {
    private final int averageBytesPerSecond;
    private final int bitsPerSample;
    private final int blockAlignment;
    private long dataSize;
    private long dataStartPosition;
    private final int encoding;
    private final int numChannels;
    private final int sampleRateHz;

    public WavHeader(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.numChannels = i10;
        this.sampleRateHz = i11;
        this.averageBytesPerSecond = i12;
        this.blockAlignment = i13;
        this.bitsPerSample = i14;
        this.encoding = i15;
    }

    public int getBitrate() {
        return this.sampleRateHz * this.bitsPerSample * this.numChannels;
    }

    public int getBytesPerFrame() {
        return this.blockAlignment;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return ((this.dataSize / ((long) this.blockAlignment)) * 1000000) / ((long) this.sampleRateHz);
    }

    public int getEncoding() {
        return this.encoding;
    }

    public int getNumChannels() {
        return this.numChannels;
    }

    public int getSampleRateHz() {
        return this.sampleRateHz;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long j11 = (((long) this.averageBytesPerSecond) * j10) / 1000000;
        long j12 = this.blockAlignment;
        long jConstrainValue = Util.constrainValue((j11 / j12) * j12, 0L, this.dataSize - j12);
        long j13 = this.dataStartPosition + jConstrainValue;
        long timeUs = getTimeUs(j13);
        SeekPoint seekPoint = new SeekPoint(timeUs, j13);
        if (timeUs < j10) {
            long j14 = this.dataSize;
            long j15 = this.blockAlignment;
            if (jConstrainValue != j14 - j15) {
                long j16 = j13 + j15;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j16), j16));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    public long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.dataStartPosition) * 1000000) / ((long) this.averageBytesPerSecond);
    }

    public boolean hasDataBounds() {
        return (this.dataStartPosition == 0 || this.dataSize == 0) ? false : true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    public void setDataBounds(long j10, long j11) {
        this.dataStartPosition = j10;
        this.dataSize = j11;
    }
}
