package com.google.zxing.qrcode.encoder;

import android.support.v4.media.a;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Encoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21413a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: com.google.zxing.qrcode.encoder.Encoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21414a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21414a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21414a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21414a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21414a[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:344:0x0618  */
    /* JADX WARN: Code duplicated, block: B:346:0x061f  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:374:0x0690  */
    /* JADX WARN: Code duplicated, block: B:375:0x0693  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:419:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e A[EDGE_INSN: B:42:0x007e->B:45:0x0085 BREAK  A[LOOP:0: B:27:0x005c->B:39:0x0077]] */
    /* JADX WARN: Code duplicated, block: B:43:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[EDGE_INSN: B:44:0x0083->B:45:0x0085 BREAK  A[LOOP:0: B:27:0x005c->B:39:0x0077]] */
    /* JADX WARN: Multi-variable type inference failed */
    public static QRCode a(String str, ErrorCorrectionLevel errorCorrectionLevel, EnumMap enumMap) throws WriterException {
        int i2;
        Mode mode;
        int i3;
        Version versionA;
        int i4;
        int i5;
        byte[][] bArr;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        char c2;
        CharacterSetECI characterSetECI;
        int i10;
        int i11;
        int i12;
        char cCharAt;
        int i13;
        EncodeHintType encodeHintType = EncodeHintType.f21332Y;
        boolean zContainsKey = enumMap.containsKey(encodeHintType);
        String string = zContainsKey ? enumMap.get(encodeHintType).toString() : CharEncoding.ISO_8859_1;
        boolean zEquals = "Shift_JIS".equals(string);
        Mode mode2 = Mode.BYTE;
        int[] iArr = f21413a;
        if (!zEquals) {
            i2 = 0;
            i10 = i2;
            i11 = i10;
            i12 = i11;
            while (true) {
                if (i10 < str.length()) {
                    cCharAt = str.charAt(i10);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i13 = iArr[cCharAt];
                        } else {
                            i13 = -1;
                        }
                        if (i13 != -1) {
                            i11 = 1;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i13 = iArr[cCharAt];
                        } else {
                            i13 = -1;
                        }
                        if (i13 != -1) {
                            i11 = 1;
                        }
                    }
                    i10++;
                } else {
                    if (i11 != 0) {
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    if (i12 != 0) {
                        mode = Mode.NUMERIC;
                        break;
                    }
                }
                mode = mode2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i2 = 0;
            } else {
                int i14 = 0;
                while (true) {
                    if (i14 < length) {
                        i2 = 0;
                        int i15 = bytes[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if ((i15 >= 129 && i15 <= 159) || (i15 >= 224 && i15 <= 235)) {
                            i14 += 2;
                        }
                    } else {
                        i2 = 0;
                        mode = Mode.KANJI;
                    }
                }
            }
            while (true) {
                if (i10 < str.length()) {
                    cCharAt = str.charAt(i10);
                    if (cCharAt >= '0' || cCharAt > '9') {
                        if (cCharAt < '`') {
                            i13 = iArr[cCharAt];
                        } else {
                            i13 = -1;
                        }
                        if (i13 != -1) {
                            i11 = 1;
                        }
                    } else {
                        i12 = 1;
                    }
                    i10++;
                } else {
                    if (i11 != 0) {
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    if (i12 != 0) {
                        mode = Mode.NUMERIC;
                        break;
                    }
                }
                mode = mode2;
                break;
            }
        } catch (UnsupportedEncodingException unused) {
        }
        i10 = i2;
        i11 = i10;
        i12 = i11;
        BitArray bitArray = new BitArray();
        int i16 = 8;
        if (mode == mode2 && zContainsKey && (characterSetECI = (CharacterSetECI) CharacterSetECI.e0.get(string)) != null) {
            bitArray.c(7, 4);
            bitArray.c(characterSetECI.X[i2], 8);
        }
        EncodeHintType encodeHintType2 = EncodeHintType.g0;
        if (enumMap.containsKey(encodeHintType2) && Boolean.valueOf(enumMap.get(encodeHintType2).toString()).booleanValue()) {
            bitArray.c(5, 4);
        }
        bitArray.c(mode.f21400Y, 4);
        BitArray bitArray2 = new BitArray();
        int iOrdinal = mode.ordinal();
        int i17 = 10;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i18 = i2;
                while (i18 < length2) {
                    char cCharAt2 = str.charAt(i18);
                    int i19 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i19 == -1) {
                        throw new WriterException();
                    }
                    int i20 = i16;
                    int i21 = i18 + 1;
                    if (i21 < length2) {
                        char cCharAt3 = str.charAt(i21);
                        int i22 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i22 == -1) {
                            throw new WriterException();
                        }
                        bitArray2.c((i19 * 45) + i22, 11);
                        i18 += 2;
                    } else {
                        bitArray2.c(i19, 6);
                        i18 = i21;
                    }
                    i16 = i20;
                }
            } else if (iOrdinal == 4) {
                try {
                    byte[] bytes2 = str.getBytes(string);
                    int length3 = bytes2.length;
                    for (int i23 = i2; i23 < length3; i23++) {
                        bitArray2.c(bytes2[i23], 8);
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new WriterException(e2);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
                }
                try {
                    byte[] bytes3 = str.getBytes("Shift_JIS");
                    int length4 = bytes3.length;
                    for (int i24 = i2; i24 < length4; i24 += 2) {
                        int i25 = ((bytes3[i24] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bytes3[i24 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        int i26 = (i25 < 33088 || i25 > 40956) ? (i25 < 57408 || i25 > 60351) ? -1 : i25 - 49472 : i25 - 33088;
                        if (i26 == -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        bitArray2.c(((i26 >> 8) * PsExtractor.AUDIO_STREAM) + (i26 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new WriterException(e3);
                }
            }
            i3 = i16;
        } else {
            i3 = 8;
            int length5 = str.length();
            int i27 = i2;
            while (i27 < length5) {
                int iCharAt = str.charAt(i27) - '0';
                int i28 = i27 + 2;
                if (i28 < length5) {
                    bitArray2.c(((str.charAt(i27 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i28) - '0'), i17);
                    i27 += 3;
                } else {
                    i27++;
                    if (i27 < length5) {
                        bitArray2.c((iCharAt * 10) + (str.charAt(i27) - '0'), 7);
                        i27 = i28;
                    } else {
                        bitArray2.c(iCharAt, 4);
                    }
                }
                i17 = 10;
            }
        }
        EncodeHintType encodeHintType3 = EncodeHintType.f0;
        boolean zContainsKey2 = enumMap.containsKey(encodeHintType3);
        int[] iArr2 = mode.X;
        if (zContainsKey2) {
            versionA = Version.a(Integer.parseInt(enumMap.get(encodeHintType3).toString()));
            int i29 = bitArray.f21345Y;
            int i30 = versionA.f21401a;
            int i31 = iArr2[i30 <= 9 ? i2 : i30 <= 26 ? 1 : 2] + i29 + bitArray2.f21345Y;
            Version.ECBlocks eCBlocks = versionA.f21402b[errorCorrectionLevel.ordinal()];
            Version.ECB[] ecbArr = eCBlocks.f21407b;
            int length6 = ecbArr.length;
            int i32 = i2;
            int i33 = i32;
            while (i32 < length6) {
                i33 += ecbArr[i32].f21404a;
                i32++;
            }
            if ((versionA.f21403c - (i33 * eCBlocks.f21406a) >= (i31 + 7) / 8 ? 1 : i2) == 0) {
                throw new WriterException("Data too big for requested version");
            }
        } else {
            Version versionA2 = Version.a(1);
            int i34 = bitArray.f21345Y;
            int i35 = versionA2.f21401a;
            int i36 = iArr2[i35 <= 9 ? i2 : i35 <= 26 ? 1 : 2] + i34 + bitArray2.f21345Y;
            int i37 = 1;
            while (true) {
                if (i37 > 40) {
                    throw new WriterException("Data too big");
                }
                Version versionA3 = Version.a(i37);
                int i38 = versionA3.f21403c;
                Version.ECBlocks eCBlocks2 = versionA3.f21402b[errorCorrectionLevel.ordinal()];
                Version.ECB[] ecbArr2 = eCBlocks2.f21407b;
                int length7 = ecbArr2.length;
                int i39 = i2;
                int i40 = i39;
                while (i39 < length7) {
                    i40 += ecbArr2[i39].f21404a;
                    i39++;
                }
                if (i38 - (i40 * eCBlocks2.f21406a) >= (i36 + 7) / 8) {
                    int i41 = bitArray.f21345Y;
                    int i42 = versionA3.f21401a;
                    int i43 = iArr2[i42 <= 9 ? i2 : i42 <= 26 ? 1 : 2] + i41 + bitArray2.f21345Y;
                    int i44 = 1;
                    while (true) {
                        if (i44 > 40) {
                            throw new WriterException("Data too big");
                        }
                        Version versionA4 = Version.a(i44);
                        int i45 = versionA4.f21403c;
                        Version.ECBlocks eCBlocks3 = versionA4.f21402b[errorCorrectionLevel.ordinal()];
                        Version.ECB[] ecbArr3 = eCBlocks3.f21407b;
                        int length8 = ecbArr3.length;
                        int i46 = i2;
                        int i47 = i46;
                        while (i46 < length8) {
                            i47 += ecbArr3[i46].f21404a;
                            i46++;
                        }
                        if (i45 - (i47 * eCBlocks3.f21406a) >= (i43 + 7) / 8) {
                            versionA = versionA4;
                            break;
                        }
                        i44++;
                        i2 = 0;
                        i3 = 8;
                    }
                } else {
                    i37++;
                    i2 = 0;
                    i3 = 8;
                }
            }
        }
        BitArray bitArray3 = new BitArray();
        int i48 = bitArray.f21345Y;
        bitArray3.d(i48);
        for (int i49 = i2; i49 < i48; i49++) {
            bitArray3.b(bitArray.e(i49));
        }
        int iF = mode == mode2 ? bitArray2.f() : str.length();
        int i50 = versionA.f21401a;
        int i51 = iArr2[i50 <= 9 ? i2 : i50 <= 26 ? 1 : 2];
        int i52 = 1 << i51;
        if (iF >= i52) {
            StringBuilder sb = new StringBuilder();
            sb.append(iF);
            sb.append(" is bigger than ");
            sb.append(i52 - 1);
            throw new WriterException(sb.toString());
        }
        bitArray3.c(iF, i51);
        int i53 = bitArray2.f21345Y;
        bitArray3.d(bitArray3.f21345Y + i53);
        for (int i54 = i2; i54 < i53; i54++) {
            bitArray3.b(bitArray2.e(i54));
        }
        Version.ECBlocks eCBlocks4 = versionA.f21402b[errorCorrectionLevel.ordinal()];
        Version.ECB[] ecbArr4 = eCBlocks4.f21407b;
        int length9 = ecbArr4.length;
        int i55 = i2;
        int i56 = i55;
        while (i55 < length9) {
            i56 += ecbArr4[i55].f21404a;
            i55++;
        }
        int i57 = i56 * eCBlocks4.f21406a;
        int i58 = versionA.f21403c;
        int i59 = i58 - i57;
        int i60 = i59 << 3;
        if (bitArray3.f21345Y > i60) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray3.f21345Y + " > " + i60);
        }
        int i61 = i2;
        while (i61 < 4 && bitArray3.f21345Y < i60) {
            bitArray3.b(i2);
            i61++;
            i2 = 0;
        }
        int i62 = bitArray3.f21345Y & 7;
        if (i62 > 0) {
            for (int i63 = i3; i62 < i63; i63 = 8) {
                bitArray3.b(false);
                i62++;
            }
        }
        int iF2 = i59 - bitArray3.f();
        for (int i64 = 0; i64 < iF2; i64++) {
            bitArray3.c((i64 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray3.f21345Y != i60) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i65 = 0;
        for (Version.ECB ecb : eCBlocks4.f21407b) {
            i65 += ecb.f21404a;
        }
        if (bitArray3.f() != i59) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i65);
        int i66 = 0;
        int i67 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i66 < i65) {
            int[] iArr3 = new int[1];
            int[] iArr4 = new int[1];
            if (i66 >= i65) {
                throw new WriterException("Block ID too large");
            }
            int i68 = i58 % i65;
            int i69 = i50;
            int i70 = i65 - i68;
            int i71 = i58 / i65;
            int i72 = i59 / i65;
            int i73 = i72 + 1;
            int i74 = i71 - i72;
            int i75 = (i71 + 1) - i73;
            if (i74 != i75) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i65 != i70 + i68) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i58 != ((i73 + i75) * i68) + ((i72 + i74) * i70)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i66 < i70) {
                c2 = 0;
                iArr3[0] = i72;
                iArr4[0] = i74;
            } else {
                c2 = 0;
                iArr3[0] = i73;
                iArr4[0] = i75;
            }
            int i76 = iArr3[c2];
            byte[] bArr2 = new byte[i76];
            int i77 = i67 << 3;
            int i78 = i66;
            int i79 = 0;
            while (i79 < i76) {
                int i80 = i79;
                int i81 = i65;
                int[] iArr5 = iArr3;
                int i82 = 0;
                for (int i83 = 0; i83 < 8; i83++) {
                    if (bitArray3.e(i77)) {
                        i82 |= 1 << (7 - i83);
                    }
                    i77++;
                }
                bArr2[i80] = (byte) i82;
                i79 = i80 + 1;
                i65 = i81;
                iArr3 = iArr5;
            }
            int i84 = i65;
            int[] iArr6 = iArr3;
            int i85 = iArr4[0];
            int[] iArr7 = new int[i76 + i85];
            for (int i86 = 0; i86 < i76; i86++) {
                iArr7[i86] = bArr2[i86] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
            new ReedSolomonEncoder(GenericGF.g).a(i85, iArr7);
            byte[] bArr3 = new byte[i85];
            int i87 = 0;
            while (i87 < i85) {
                int[] iArr8 = iArr7;
                bArr3[i87] = (byte) iArr8[i76 + i87];
                i87++;
                iArr7 = iArr8;
            }
            arrayList.add(new BlockPair(bArr2, bArr3));
            iMax = Math.max(iMax, i76);
            iMax2 = Math.max(iMax2, i85);
            i67 += iArr6[0];
            i66 = i78 + 1;
            i50 = i69;
            i65 = i84;
        }
        int i88 = i50;
        if (i59 != i67) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray4 = new BitArray();
        for (int i89 = 0; i89 < iMax; i89++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = ((BlockPair) it.next()).f21408a;
                if (i89 < bArr4.length) {
                    bitArray4.c(bArr4[i89], 8);
                }
            }
        }
        for (int i90 = 0; i90 < iMax2; i90++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr5 = ((BlockPair) it2.next()).f21409b;
                if (i90 < bArr5.length) {
                    bitArray4.c(bArr5[i90], 8);
                }
            }
        }
        if (i58 != bitArray4.f()) {
            StringBuilder sbU = a.u(i58, "Interleaving error: ", " and ");
            sbU.append(bitArray4.f());
            sbU.append(" differ.");
            throw new WriterException(sbU.toString());
        }
        QRCode qRCode = new QRCode();
        int i91 = -1;
        qRCode.d = -1;
        qRCode.f21419b = errorCorrectionLevel;
        qRCode.f21418a = mode;
        qRCode.f21420c = versionA;
        int i92 = (i88 * 4) + 17;
        ByteMatrix byteMatrix = new ByteMatrix(i92, i92);
        int i93 = Integer.MAX_VALUE;
        int i94 = 0;
        while (i94 < 8) {
            MatrixUtil.a(bitArray4, errorCorrectionLevel, versionA, i94, byteMatrix);
            int iA = MaskUtil.a(byteMatrix, true) + MaskUtil.a(byteMatrix, false);
            int i95 = 0;
            int i96 = 0;
            while (true) {
                i4 = byteMatrix.f21412c;
                int i97 = i4 - 1;
                i5 = byteMatrix.f21411b;
                bArr = byteMatrix.f21410a;
                if (i95 >= i97) {
                    break;
                }
                byte[] bArr6 = bArr[i95];
                int i98 = 0;
                while (i98 < i5 - 1) {
                    byte b2 = bArr6[i98];
                    int i99 = i98 + 1;
                    int i100 = iA;
                    if (b2 == bArr6[i99]) {
                        byte[] bArr7 = bArr[i95 + 1];
                        if (b2 == bArr7[i98] && b2 == bArr7[i99]) {
                            i96++;
                        }
                    }
                    iA = i100;
                    i98 = i99;
                }
                i95++;
            }
            int i101 = (i96 * 3) + iA;
            int i102 = 0;
            int i103 = 0;
            while (i102 < i4) {
                int i104 = 0;
                while (i104 < i5) {
                    byte[] bArr8 = bArr[i102];
                    int i105 = i103;
                    int i106 = i104 + 6;
                    if (i106 < i5) {
                        i6 = i101;
                        if (bArr8[i104] == 1 && bArr8[i104 + 1] == 0 && bArr8[i104 + 2] == 1 && bArr8[i104 + 3] == 1 && bArr8[i104 + 4] == 1 && bArr8[i104 + 5] == 0 && bArr8[i106] == 1) {
                            int iMax3 = Math.max(i104 - 4, 0);
                            int iMin = Math.min(i104, bArr8.length);
                            while (true) {
                                if (iMax3 >= iMin) {
                                    z4 = true;
                                    break;
                                }
                                int i107 = iMax3;
                                int i108 = iMin;
                                if (bArr8[i107] == 1) {
                                    z4 = false;
                                    break;
                                }
                                iMax3 = i107 + 1;
                                iMin = i108;
                            }
                            if (z4) {
                                i7 = i94;
                            } else {
                                i7 = i94;
                                int iMax4 = Math.max(i104 + 7, 0);
                                int iMin2 = Math.min(i104 + 11, bArr8.length);
                                while (true) {
                                    if (iMax4 >= iMin2) {
                                        z5 = true;
                                        break;
                                    }
                                    int i109 = iMax4;
                                    if (bArr8[iMax4] == 1) {
                                        z5 = false;
                                        break;
                                    }
                                    iMax4 = i109 + 1;
                                }
                                if (z5) {
                                }
                                i8 = i102 + 6;
                                if (i8 < i4) {
                                    byte b3 = 1;
                                    if (bArr[i102][i104] != 1 && bArr[i102 + 1][i104] == 0 && bArr[i102 + 2][i104] == 1 && bArr[i102 + 3][i104] == 1 && bArr[i102 + 4][i104] == 1 && bArr[i102 + 5][i104] == 0 && bArr[i8][i104] == 1) {
                                        int iMax5 = Math.max(i102 - 4, 0);
                                        int iMin3 = Math.min(i102, bArr.length);
                                        while (true) {
                                            if (iMax5 >= iMin3) {
                                                i9 = i102;
                                                z2 = true;
                                                break;
                                            }
                                            i9 = i102;
                                            if (bArr[iMax5][i104] == b3) {
                                                z2 = false;
                                                break;
                                            }
                                            iMax5++;
                                            i102 = i9;
                                            b3 = 1;
                                        }
                                        if (z2) {
                                            i103++;
                                        } else {
                                            int iMax6 = Math.max(i9 + 7, 0);
                                            int iMin4 = Math.min(i9 + 11, bArr.length);
                                            while (true) {
                                                if (iMax6 >= iMin4) {
                                                    z3 = true;
                                                    break;
                                                }
                                                if (bArr[iMax6][i104] == 1) {
                                                    z3 = false;
                                                    break;
                                                }
                                                iMax6++;
                                            }
                                            if (z3) {
                                                i103++;
                                            }
                                        }
                                    } else {
                                        i9 = i102;
                                    }
                                } else {
                                    i9 = i102;
                                }
                                i104++;
                                i101 = i6;
                                i94 = i7;
                                i102 = i9;
                            }
                            i103 = i105 + 1;
                            i8 = i102 + 6;
                            if (i8 < i4) {
                                byte b4 = 1;
                                if (bArr[i102][i104] != 1) {
                                    i9 = i102;
                                } else {
                                    i9 = i102;
                                }
                            } else {
                                i9 = i102;
                            }
                            i104++;
                            i101 = i6;
                            i94 = i7;
                            i102 = i9;
                        }
                        i103 = i105;
                        i8 = i102 + 6;
                        if (i8 < i4) {
                            byte b5 = 1;
                            if (bArr[i102][i104] != 1) {
                                i9 = i102;
                            } else {
                                i9 = i102;
                            }
                        } else {
                            i9 = i102;
                        }
                        i104++;
                        i101 = i6;
                        i94 = i7;
                        i102 = i9;
                    } else {
                        i6 = i101;
                    }
                    i7 = i94;
                    i103 = i105;
                    i8 = i102 + 6;
                    if (i8 < i4) {
                        byte b6 = 1;
                        if (bArr[i102][i104] != 1) {
                            i9 = i102;
                        } else {
                            i9 = i102;
                        }
                    } else {
                        i9 = i102;
                    }
                    i104++;
                    i101 = i6;
                    i94 = i7;
                    i102 = i9;
                }
                i102++;
            }
            int i110 = i94;
            int i111 = (i103 * 40) + i101;
            int i112 = 0;
            for (int i113 = 0; i113 < i4; i113++) {
                byte[] bArr9 = bArr[i113];
                for (int i114 = 0; i114 < i5; i114++) {
                    int i115 = i112;
                    i112 = bArr9[i114] == 1 ? i115 + 1 : i115;
                }
            }
            int i116 = i4 * i5;
            int iAbs = (((Math.abs((i112 << 1) - i116) * 10) / i116) * 10) + i111;
            if (iAbs < i93) {
                i93 = iAbs;
                i91 = i110;
            }
            i94 = i110 + 1;
        }
        qRCode.d = i91;
        MatrixUtil.a(bitArray4, errorCorrectionLevel, versionA, i91, byteMatrix);
        qRCode.f21421e = byteMatrix;
        return qRCode;
    }
}
