package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import wi.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class XingSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] tableOfContents;
    private final int xingFrameSize;

    private XingSeeker(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public static XingSeeker create(long j10, long j11, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        int i10 = mpegAudioHeader.samplesPerFrame;
        int i11 = mpegAudioHeader.sampleRate;
        int i12 = parsableByteArray.readInt();
        if ((i12 & 1) != 1 || (unsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedIntToInt, ((long) i10) * 1000000, i11);
        if ((i12 & 6) != 6) {
            return new XingSeeker(j11, mpegAudioHeader.frameSize, jScaleLargeTimestamp);
        }
        long unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[100];
        for (int i13 = 0; i13 < 100; i13++) {
            jArr[i13] = parsableByteArray.readUnsignedByte();
        }
        if (j10 != -1) {
            long j12 = j11 + unsignedIntToInt2;
            if (j10 != j12) {
                StringBuilder sbL = d.l(j10, "XING data size mismatch: ", ", ");
                sbL.append(j12);
                Log.w(TAG, sbL.toString());
            }
        }
        return new XingSeeker(j11, mpegAudioHeader.frameSize, jScaleLargeTimestamp, unsignedIntToInt2, jArr);
    }

    private long getTimeUsForTableIndex(int i10) {
        return (this.durationUs * ((long) i10)) / 100;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long jConstrainValue = Util.constrainValue(j10, 0L, this.durationUs);
        double d10 = (jConstrainValue * 100.0d) / this.durationUs;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = this.tableOfContents;
                double d12 = jArr[i10];
                d11 = d12 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d12) * (d10 - ((double) i10)));
            }
        }
        return new SeekMap.SeekPoints(new SeekPoint(jConstrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d11 / 256.0d) * this.dataSize), this.xingFrameSize, this.dataSize - 1)));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j10) {
        long j11 = j10 - this.dataStartPosition;
        if (!isSeekable() || j11 <= this.xingFrameSize) {
            return 0L;
        }
        double d10 = (j11 * 256.0d) / this.dataSize;
        int iBinarySearchFloor = Util.binarySearchFloor(this.tableOfContents, (long) d10, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j12 = this.tableOfContents[iBinarySearchFloor];
        int i10 = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i10);
        long j13 = iBinarySearchFloor == 99 ? 256L : this.tableOfContents[i10];
        return Math.round((j12 == j13 ? 0.0d : (d10 - j12) / (j13 - j12)) * (timeUsForTableIndex2 - timeUsForTableIndex)) + timeUsForTableIndex;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return this.tableOfContents != null;
    }

    private XingSeeker(long j10, int i10, long j11, long j12, long[] jArr) {
        this.dataStartPosition = j10;
        this.xingFrameSize = i10;
        this.durationUs = j11;
        this.dataSize = j12;
        this.tableOfContents = jArr;
    }
}
