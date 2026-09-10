package com.smartdigimkt.r4;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f38080a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f38081b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f38082c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
    private static char[] d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f38083e = '=';
    private static final byte[] f;
    public static final int g = 256;

    static {
        HashMap map = new HashMap();
        f38080a = map;
        map.put('A', 'v');
        f38080a.put('B', 'S');
        f38080a.put('C', 'o');
        f38080a.put('D', 'a');
        f38080a.put('E', 'j');
        f38080a.put('F', 'c');
        f38080a.put('G', '7');
        f38080a.put('H', 'd');
        f38080a.put('I', 'R');
        f38080a.put('J', 'z');
        f38080a.put('K', 'p');
        f38080a.put('L', 'W');
        f38080a.put('M', 'i');
        f38080a.put('N', 'f');
        f38080a.put('O', 'G');
        f38080a.put('P', 'y');
        f38080a.put('Q', 'N');
        f38080a.put('R', 'x');
        f38080a.put('S', 'Z');
        f38080a.put('T', 'n');
        f38080a.put('U', 'V');
        f38080a.put('V', '5');
        f38080a.put('W', 'k');
        f38080a.put('X', '+');
        f38080a.put('Y', 'D');
        f38080a.put('Z', 'H');
        f38080a.put('a', 'L');
        f38080a.put('b', 'Y');
        f38080a.put('c', 'h');
        f38080a.put('d', 'J');
        f38080a.put('e', '4');
        f38080a.put('f', '6');
        f38080a.put('g', 'l');
        f38080a.put('h', 't');
        f38080a.put('i', '0');
        f38080a.put('j', 'U');
        f38080a.put('k', '3');
        f38080a.put('l', 'Q');
        f38080a.put('m', 'r');
        f38080a.put('n', 'g');
        f38080a.put('o', 'E');
        f38080a.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f38080a.put('q', 'q');
        f38080a.put('r', '8');
        f38080a.put('s', 's');
        f38080a.put('t', 'w');
        f38080a.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        f38080a.put('v', 'X');
        f38080a.put('w', 'M');
        f38080a.put('x', 'e');
        f38080a.put('y', 'B');
        f38080a.put('z', 'A');
        f38080a.put('0', 'T');
        f38080a.put('1', '2');
        f38080a.put('2', 'F');
        f38080a.put('3', 'b');
        f38080a.put('4', '9');
        f38080a.put('5', 'P');
        f38080a.put('6', '1');
        f38080a.put('7', 'O');
        f38080a.put('8', 'I');
        f38080a.put('9', 'K');
        f38080a.put('+', 'm');
        f38080a.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
        d = new char[64];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char[] cArr = f38082c;
            if (i3 >= cArr.length) {
                break;
            }
            d[i3] = f38080a.get(Character.valueOf(cArr[i3])).charValue();
            i3++;
        }
        f = new byte[128];
        int i4 = 0;
        while (true) {
            byte[] bArr = f;
            if (i4 >= bArr.length) {
                break;
            }
            bArr[i4] = AbstractJsonLexerKt.TC_INVALID;
            i4++;
        }
        while (true) {
            char[] cArr2 = d;
            if (i2 >= cArr2.length) {
                return;
            }
            f[cArr2[i2]] = (byte) i2;
            i2++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i2) {
        try {
            char c2 = cArr[3];
            char c3 = c2 == '=' ? (char) 2 : (char) 3;
            char c4 = cArr[2];
            if (c4 == '=') {
                c3 = 1;
            }
            byte[] bArr2 = f;
            byte b2 = bArr2[cArr[0]];
            byte b3 = bArr2[cArr[1]];
            byte b4 = bArr2[c4];
            byte b5 = bArr2[c2];
            if (c3 == 1) {
                bArr[i2] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
                return 1;
            }
            if (c3 == 2) {
                bArr[i2] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[i2 + 1] = (byte) (((b3 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b4 >> 2) & 15));
                return 2;
            }
            if (c3 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i2] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
            bArr[i2 + 1] = (byte) (((b3 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b4 >> 2) & 15));
            bArr[i2 + 2] = (byte) (((b4 << 6) & PsExtractor.AUDIO_STREAM) | (b5 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    public static byte[] a(char[] cArr, int i2, int i3) {
        int i4;
        try {
            char[] cArr2 = new char[4];
            int i5 = ((i3 >> 2) * 3) + 3;
            byte[] bArr = new byte[i5];
            int iA = 0;
            int i6 = 0;
            for (int i7 = i2; i7 < i2 + i3; i7++) {
                char c2 = cArr[i7];
                if (c2 != '=') {
                    byte[] bArr2 = f;
                    if (c2 < bArr2.length && bArr2[c2] != 127) {
                        i4 = i6 + 1;
                        cArr2[i6] = c2;
                        if (i4 == 4) {
                            iA += a(cArr2, bArr, iA);
                            i6 = 0;
                        } else {
                            i6 = i4;
                        }
                    }
                } else {
                    i4 = i6 + 1;
                    cArr2[i6] = c2;
                    if (i4 == 4) {
                        iA += a(cArr2, bArr, iA);
                        i6 = 0;
                    } else {
                        i6 = i4;
                    }
                }
            }
            if (iA == i5) {
                return bArr;
            }
            byte[] bArr3 = new byte[iA];
            System.arraycopy(bArr, 0, bArr3, 0, iA);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    public static byte[] a(String str) {
        int i2;
        int i3;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i4 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            int iA = 0;
            int i6 = 0;
            while (i5 < length) {
                int i7 = i5 + 256;
                if (i7 <= length) {
                    str.getChars(i5, i7, cArr, i6);
                    i2 = i6 + 256;
                } else {
                    str.getChars(i5, length, cArr, i6);
                    i2 = (length - i5) + i6;
                }
                int i8 = i6;
                while (i6 < i2) {
                    char c2 = cArr[i6];
                    if (c2 != '=') {
                        byte[] bArr2 = f;
                        if (c2 < bArr2.length && bArr2[c2] != 127) {
                            i3 = i8 + 1;
                            cArr[i8] = c2;
                            if (i3 == 4) {
                                iA += a(cArr, bArr, iA);
                                i8 = 0;
                            } else {
                                i8 = i3;
                            }
                        }
                    } else {
                        i3 = i8 + 1;
                        cArr[i8] = c2;
                        if (i3 == 4) {
                            iA += a(cArr, bArr, iA);
                            i8 = 0;
                        } else {
                            i8 = i3;
                        }
                    }
                    i6++;
                }
                i5 = i7;
                i6 = i8;
            }
            if (iA == i4) {
                return bArr;
            }
            byte[] bArr3 = new byte[iA];
            System.arraycopy(bArr, 0, bArr3, 0, iA);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i2, int i3) {
        if (i3 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i3 / 3) << 2) + 4];
            int i4 = 0;
            while (i3 >= 3) {
                int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr2 = d;
                cArr[i4] = cArr2[i5 >> 18];
                cArr[i4 + 1] = cArr2[(i5 >> 12) & 63];
                int i6 = i4 + 3;
                cArr[i4 + 2] = cArr2[(i5 >> 6) & 63];
                i4 += 4;
                cArr[i6] = cArr2[i5 & 63];
                i2 += 3;
                i3 -= 3;
            }
            if (i3 == 1) {
                int i7 = bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                char[] cArr3 = d;
                cArr[i4] = cArr3[i7 >> 2];
                cArr[i4 + 1] = cArr3[(i7 << 4) & 63];
                int i8 = i4 + 3;
                cArr[i4 + 2] = '=';
                i4 += 4;
                cArr[i8] = '=';
            } else if (i3 == 2) {
                int i9 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr4 = d;
                cArr[i4] = cArr4[i9 >> 10];
                cArr[i4 + 1] = cArr4[(i9 >> 4) & 63];
                int i10 = i4 + 3;
                cArr[i4 + 2] = cArr4[(i9 << 2) & 63];
                i4 += 4;
                cArr[i10] = '=';
            }
            return new String(cArr, 0, i4);
        } catch (Exception unused) {
            return null;
        }
    }
}
