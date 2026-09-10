package com.mbridge.msdk.playercommon.exoplayer2.util;

import androidx.core.app.NotificationCompat;
import d5.u;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    private static final int H264_NAL_UNIT_TYPE_SEI = 6;
    private static final int H264_NAL_UNIT_TYPE_SPS = 7;
    private static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i10, int i11, boolean z10) {
            this.picParameterSetId = i10;
            this.seqParameterSetId = i11;
            this.bottomFieldPicOrderInFramePresentFlag = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class SpsData {
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthAspectRatio;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i10, int i11, int i12, float f10, boolean z10, boolean z11, int i13, int i14, int i15, boolean z12) {
            this.seqParameterSetId = i10;
            this.width = i11;
            this.height = i12;
            this.pixelWidthAspectRatio = f10;
            this.separateColorPlaneFlag = z10;
            this.frameMbsOnlyFlag = z11;
            this.frameNumLength = i13;
            this.picOrderCountType = i14;
            this.picOrderCntLsbLength = i15;
            this.deltaPicOrderAlwaysZeroFlag = z12;
        }
    }

    private NalUnitUtil() {
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0094, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int findNalUnit(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = r2
            goto L9
        L8:
            r3 = r1
        L9:
            com.mbridge.msdk.playercommon.exoplayer2.util.Assertions.checkState(r3)
            if (r0 != 0) goto L10
            goto Lba
        L10:
            r3 = 2
            if (r11 == 0) goto L41
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1d
            clearPrefixFlags(r11)
            int r9 = r9 + (-3)
            return r9
        L1d:
            if (r0 <= r2) goto L2c
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2c
            r4 = r8[r9]
            if (r4 != r2) goto L2c
            clearPrefixFlags(r11)
            int r9 = r9 - r3
            return r9
        L2c:
            if (r0 <= r3) goto L41
            boolean r4 = r11[r3]
            if (r4 == 0) goto L41
            r4 = r8[r9]
            if (r4 != 0) goto L41
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L41
            clearPrefixFlags(r11)
            int r9 = r9 - r2
            return r9
        L41:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L44:
            if (r9 >= r4) goto L66
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4d
            goto L63
        L4d:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L61
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L61
            if (r5 != r2) goto L61
            if (r11 == 0) goto L60
            clearPrefixFlags(r11)
        L60:
            return r6
        L61:
            int r9 = r9 + (-2)
        L63:
            int r9 = r9 + 3
            goto L44
        L66:
            if (r11 == 0) goto Lba
            if (r0 <= r3) goto L7b
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
            goto L94
        L7b:
            if (r0 != r3) goto L8c
            boolean r9 = r11[r3]
            if (r9 == 0) goto L96
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
            goto L94
        L8c:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L96
            r9 = r8[r4]
            if (r9 != r2) goto L96
        L94:
            r9 = r2
            goto L97
        L96:
            r9 = r1
        L97:
            r11[r1] = r9
            if (r0 <= r2) goto La6
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto Lb0
            r9 = r8[r4]
            if (r9 != 0) goto Lb0
            goto Lae
        La6:
            boolean r9 = r11[r3]
            if (r9 == 0) goto Lb0
            r9 = r8[r4]
            if (r9 != 0) goto Lb0
        Lae:
            r9 = r2
            goto Lb1
        Lb0:
            r9 = r1
        Lb1:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lb8
            r1 = r2
        Lb8:
            r11[r3] = r1
        Lba:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil.findNalUnit(byte[], int, int, boolean[]):int");
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean isNalUnitSei(String str, byte b10) {
        return ("video/avc".equals(str) && (b10 & 31) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        parsableNalUnitBitArray.skipBits(8);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:70:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x0151  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00fb, please report this as an issue */
    public static SpsData parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        int unsignedExpGolombCodedInt;
        boolean z10;
        int unsignedExpGolombCodedInt2;
        boolean z11;
        boolean bit;
        int i12;
        int iB;
        int iB2;
        float f10;
        int i13;
        int i14;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i10, i11);
        parsableNalUnitBitArray.skipBits(8);
        int bits = parsableNalUnitBitArray.readBits(8);
        parsableNalUnitBitArray.skipBits(16);
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            boolean bit2 = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i15 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                int i16 = 0;
                while (i16 < i15) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i16 < 6 ? 16 : 64);
                    }
                    i16++;
                }
            }
            z10 = bit2;
        } else {
            unsignedExpGolombCodedInt = 1;
            z10 = false;
        }
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt5 != 0) {
            if (unsignedExpGolombCodedInt5 == 1) {
                boolean bit3 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                long unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                z10 = z10;
                for (int i17 = 0; i17 < unsignedExpGolombCodedInt6; i17++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z11 = bit3;
                unsignedExpGolombCodedInt2 = 0;
            } else {
                unsignedExpGolombCodedInt2 = 0;
            }
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
            bit = parsableNalUnitBitArray.readBit();
            i12 = 2 - (bit ? 1 : 0);
            int i18 = unsignedExpGolombCodedInt8 * i12;
            if (!bit) {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            iB = unsignedExpGolombCodedInt7 * 16;
            iB2 = i18 * 16;
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (unsignedExpGolombCodedInt == 0) {
                    i14 = 1;
                } else {
                    if (unsignedExpGolombCodedInt == 3) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    i12 *= unsignedExpGolombCodedInt != 1 ? 1 : 2;
                    i14 = i13;
                }
                iB = d.b(unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10, i14, iB);
                iB2 = d.b(unsignedExpGolombCodedInt11, unsignedExpGolombCodedInt12, i12, iB2);
            }
            int i19 = iB;
            int i20 = iB2;
            if (parsableNalUnitBitArray.readBit() || !parsableNalUnitBitArray.readBit()) {
                f10 = 1.0f;
            } else {
                int bits2 = parsableNalUnitBitArray.readBits(8);
                if (bits2 == 255) {
                    int bits3 = parsableNalUnitBitArray.readBits(16);
                    int bits4 = parsableNalUnitBitArray.readBits(16);
                    if (bits3 == 0 || bits4 == 0) {
                        f10 = 1.0f;
                    } else {
                        f10 = bits3 / bits4;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits2 < fArr.length) {
                        f10 = fArr[bits2];
                    } else {
                        u.o(bits2, "Unexpected aspect_ratio_idc value: ", TAG);
                        f10 = 1.0f;
                    }
                }
            }
            return new SpsData(unsignedExpGolombCodedInt3, i19, i20, f10, z10, bit, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z11);
        }
        unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        z11 = false;
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        bit = parsableNalUnitBitArray.readBit();
        i12 = 2 - (bit ? 1 : 0);
        int i110 = unsignedExpGolombCodedInt14 * i12;
        if (!bit) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        iB = unsignedExpGolombCodedInt13 * 16;
        iB2 = i110 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt17 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt18 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i14 = 1;
            } else {
                if (unsignedExpGolombCodedInt == 3) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                i12 *= unsignedExpGolombCodedInt != 1 ? 1 : 2;
                i14 = i13;
            }
            iB = d.b(unsignedExpGolombCodedInt15, unsignedExpGolombCodedInt16, i14, iB);
            iB2 = d.b(unsignedExpGolombCodedInt17, unsignedExpGolombCodedInt18, i12, iB2);
        }
        int i111 = iB;
        int i21 = iB2;
        if (parsableNalUnitBitArray.readBit()) {
            f10 = 1.0f;
        } else {
            f10 = 1.0f;
        }
        return new SpsData(unsignedExpGolombCodedInt3, i111, i21, f10, z10, bit, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt2, z11);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i10) {
        int signedExpGolombCodedInt = 8;
        int i11 = 8;
        for (int i12 = 0; i12 < i10; i12++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i11) + NotificationCompat.FLAG_LOCAL_ONLY) % NotificationCompat.FLAG_LOCAL_ONLY;
            }
            if (signedExpGolombCodedInt != 0) {
                i11 = signedExpGolombCodedInt;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i12 = 0;
            while (iFindNextUnescapeIndex < i10) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i10);
                    if (iFindNextUnescapeIndex < i10) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i12) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i12] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i12++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = scratchEscapePositions[i15] - i13;
                System.arraycopy(bArr, i13, bArr, i14, i16);
                int i17 = i14 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i14 = i17 + 2;
                bArr[i18] = 0;
                i13 += i16 + 3;
            }
            System.arraycopy(bArr, i13, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
