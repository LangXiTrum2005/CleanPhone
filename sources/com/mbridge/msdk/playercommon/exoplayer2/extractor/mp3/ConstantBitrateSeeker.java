package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class ConstantBitrateSeeker implements Mp3Extractor.Seeker {
    private static final int BITS_PER_BYTE = 8;
    private final int bitrate;
    private final long dataSize;
    private final long durationUs;
    private final long firstFramePosition;
    private final int frameSize;

    public ConstantBitrateSeeker(long j10, long j11, MpegAudioHeader mpegAudioHeader) {
        this.firstFramePosition = j11;
        this.frameSize = mpegAudioHeader.frameSize;
        this.bitrate = mpegAudioHeader.bitrate;
        if (j10 == -1) {
            this.dataSize = -1L;
            this.durationUs = C.TIME_UNSET;
        } else {
            this.dataSize = j10 - j11;
            this.durationUs = getTimeUs(j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        long j11 = this.dataSize;
        if (j11 == -1) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstFramePosition));
        }
        long j12 = (((long) this.bitrate) * j10) / 8000000;
        long j13 = this.frameSize;
        long jConstrainValue = Util.constrainValue((j12 / j13) * j13, 0L, j11 - j13);
        long j14 = this.firstFramePosition + jConstrainValue;
        long timeUs = getTimeUs(j14);
        SeekPoint seekPoint = new SeekPoint(timeUs, j14);
        if (timeUs < j10) {
            long j15 = this.dataSize;
            long j16 = this.frameSize;
            if (jConstrainValue != j15 - j16) {
                long j17 = j14 + j16;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(getTimeUs(j17), j17));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j10) {
        return (Math.max(0L, j10 - this.firstFramePosition) * 8000000) / ((long) this.bitrate);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.dataSize != -1;
    }
}
