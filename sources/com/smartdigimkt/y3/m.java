package com.smartdigimkt.y3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f40133a = 2147385345;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f40134b = 536864768;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f40135c = -25230976;
    private static final int d = -14745368;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f40136e = 127;
    private static final byte f = 31;
    private static final byte g = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f40137h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f40138i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] j = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] k = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, 256, 384, com.smartdigimkt.v0.p.e.f39014a, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, com.p004ironsource.mediationsdk.metadata.a.f25965n, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private m() {
    }

    public static boolean a(int i2) {
        return i2 == f40133a || i2 == f40135c || i2 == f40134b || i2 == d;
    }

    private static com.smartdigimkt.p4.r b(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.smartdigimkt.p4.r(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (c(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
            }
        }
        com.smartdigimkt.p4.r rVar = new com.smartdigimkt.p4.r(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.smartdigimkt.p4.r rVar2 = new com.smartdigimkt.p4.r(bArrCopyOf);
            while (rVar2.b() >= 16) {
                rVar2.c(2);
                rVar.a(rVar2.a(14), 14);
            }
        }
        rVar.a(bArrCopyOf);
        return rVar;
    }

    private static boolean c(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }

    public static int d(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static com.smartdigimkt.w3.m a(byte[] bArr, String str, String str2, com.smartdigimkt.a4.e eVar) {
        com.smartdigimkt.p4.r rVarB = b(bArr);
        rVarB.c(60);
        int i2 = f40138i[rVarB.a(6)];
        int i3 = j[rVarB.a(4)];
        int iA = rVarB.a(5);
        int[] iArr = k;
        int i4 = iA >= iArr.length ? -1 : (iArr[iA] * 1000) / 2;
        rVarB.c(10);
        return com.smartdigimkt.w3.m.a(str, "audio/vnd.dts", null, i4, -1, i2 + (rVarB.a(2) > 0 ? 1 : 0), i3, null, eVar, 0, str2);
    }

    public static int a(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int iPosition = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 6);
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int a(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z2 = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z2 = true;
            if (z2) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z2) {
            return (i3 * 16) / 14;
        }
        return i3;
    }
}
