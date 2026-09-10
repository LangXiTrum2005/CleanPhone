package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public final class FlacFrameReader {

    public static final class SampleNumberHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f17533a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[LOOP:0: B:53:0x00b8->B:54:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[RETURN] */
    public static boolean a(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i2, SampleNumberHolder sampleNumberHolder) {
        int iU;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6 = parsableByteArray.f18957b;
        long jV = parsableByteArray.v();
        long j = jV >>> 16;
        if (j == i2) {
            boolean z2 = (j & 1) == 1;
            int i7 = (int) ((jV >> 12) & 15);
            int i8 = (int) ((jV >> 8) & 15);
            int i9 = (int) ((jV >> 4) & 15);
            int i10 = (int) ((jV >> 1) & 7);
            boolean z3 = (jV & 1) == 1;
            if (i9 > 7 ? !(i9 > 10 || flacStreamMetadata.g != 2) : i9 == flacStreamMetadata.g - 1) {
                if ((i10 == 0 || i10 == flacStreamMetadata.f17542i) && !z3) {
                    try {
                        long jA = parsableByteArray.A();
                        if (!z2) {
                            jA *= (long) flacStreamMetadata.f17538b;
                        }
                        sampleNumberHolder.f17533a = jA;
                        int iB = b(i7, parsableByteArray);
                        if (iB != -1 && iB <= flacStreamMetadata.f17538b) {
                            if (i8 == 0) {
                                iU = parsableByteArray.u();
                                int i11 = parsableByteArray.f18957b;
                                bArr = parsableByteArray.f18956a;
                                i3 = i11 - 1;
                                int i12 = Util.f18979a;
                                i4 = 0;
                                for (i5 = i6; i5 < i3; i5++) {
                                    i4 = Util.m[i4 ^ (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                                }
                                if (iU == i4) {
                                    return true;
                                }
                            } else if (i8 > 11) {
                                int i13 = flacStreamMetadata.f17540e;
                                if (i8 == 12) {
                                    if (parsableByteArray.u() * 1000 == i13) {
                                        iU = parsableByteArray.u();
                                        int i14 = parsableByteArray.f18957b;
                                        bArr = parsableByteArray.f18956a;
                                        i3 = i14 - 1;
                                        int i15 = Util.f18979a;
                                        i4 = 0;
                                        while (i5 < i3) {
                                            i4 = Util.m[i4 ^ (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                                        }
                                        if (iU == i4) {
                                            return true;
                                        }
                                    }
                                } else if (i8 <= 14) {
                                    int iZ = parsableByteArray.z();
                                    if (i8 == 14) {
                                        iZ *= 10;
                                    }
                                    if (iZ == i13) {
                                        iU = parsableByteArray.u();
                                        int i16 = parsableByteArray.f18957b;
                                        bArr = parsableByteArray.f18956a;
                                        i3 = i16 - 1;
                                        int i17 = Util.f18979a;
                                        i4 = 0;
                                        while (i5 < i3) {
                                            i4 = Util.m[i4 ^ (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                                        }
                                        if (iU == i4) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (i8 == flacStreamMetadata.f) {
                                iU = parsableByteArray.u();
                                int i18 = parsableByteArray.f18957b;
                                bArr = parsableByteArray.f18956a;
                                i3 = i18 - 1;
                                int i19 = Util.f18979a;
                                i4 = 0;
                                while (i5 < i3) {
                                    i4 = Util.m[i4 ^ (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)];
                                }
                                if (iU == i4) {
                                    return true;
                                }
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static int b(int i2, ParsableByteArray parsableByteArray) {
        switch (i2) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return parsableByteArray.u() + 1;
            case 7:
                return parsableByteArray.z() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }
}
