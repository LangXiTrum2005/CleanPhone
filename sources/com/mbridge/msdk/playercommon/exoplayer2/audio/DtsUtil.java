package com.mbridge.msdk.playercommon.exoplayer2.audio;

import androidx.core.app.NotificationCompat;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class DtsUtil {
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_LE = -2;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, InterfaceC0435l1.d.b.f29113j, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, a.f29616n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private DtsUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & FIRST_BYTE_14B_LE) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & FIRST_BYTE_14B_LE) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & FIRST_BYTE_14B_LE) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & FIRST_BYTE_14B_LE) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    private static ParsableBitArray getNormalizedFrameHeader(byte[] bArr) {
        if (bArr[0] == 127) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b10;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1;
    }

    public static boolean isSyncWord(int i10) {
        return i10 == SYNC_VALUE_BE || i10 == SYNC_VALUE_LE || i10 == SYNC_VALUE_14B_BE || i10 == SYNC_VALUE_14B_LE;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    public static Format parseDtsFormat(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        ParsableBitArray normalizedFrameHeader = getNormalizedFrameHeader(bArr);
        normalizedFrameHeader.skipBits(60);
        int i10 = CHANNELS_BY_AMODE[normalizedFrameHeader.readBits(6)];
        int i11 = SAMPLE_RATE_BY_SFREQ[normalizedFrameHeader.readBits(4)];
        int bits = normalizedFrameHeader.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        int i12 = bits >= iArr.length ? -1 : (iArr[bits] * 1000) / 2;
        normalizedFrameHeader.skipBits(10);
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_DTS, null, i12, -1, i10 + (normalizedFrameHeader.readBits(2) > 0 ? 1 : 0), i11, null, drmInitData, 0, str2);
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }
}
