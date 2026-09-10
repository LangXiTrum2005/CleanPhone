package com.thinkup.core.express.o;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    private static Map<Character, Character> m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Map<Character, Character> f42384n = null;
    public static final int o = 256;
    private static final char[] o0;
    private static final char om = '=';
    private static final byte[] on;
    private static char[] oo;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
        o0 = cArr;
        HashMap map = new HashMap();
        m = map;
        map.put('A', 'v');
        m.put('B', 'S');
        m.put('C', 'o');
        m.put('D', 'a');
        m.put('E', 'j');
        m.put('F', 'c');
        m.put('G', '7');
        m.put('H', 'd');
        m.put('I', 'R');
        m.put('J', 'z');
        m.put('K', 'p');
        m.put('L', 'W');
        m.put('M', 'i');
        m.put('N', 'f');
        m.put('O', 'G');
        m.put('P', 'y');
        m.put('Q', 'N');
        m.put('R', 'x');
        m.put('S', 'Z');
        m.put('T', 'n');
        m.put('U', 'V');
        m.put('V', '5');
        m.put('W', 'k');
        m.put('X', '+');
        m.put('Y', 'D');
        m.put('Z', 'H');
        m.put('a', 'L');
        m.put('b', 'Y');
        m.put('c', 'h');
        m.put('d', 'J');
        m.put('e', '4');
        m.put('f', '6');
        m.put('g', 'l');
        m.put('h', 't');
        m.put('i', '0');
        m.put('j', 'U');
        m.put('k', '3');
        m.put('l', 'Q');
        m.put('m', 'r');
        m.put('n', 'g');
        m.put('o', 'E');
        m.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        m.put('q', 'q');
        m.put('r', '8');
        m.put('s', 's');
        m.put('t', 'w');
        m.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        m.put('v', 'X');
        m.put('w', 'M');
        m.put('x', 'e');
        m.put('y', 'B');
        m.put('z', 'A');
        m.put('0', 'T');
        m.put('1', '2');
        m.put('2', 'F');
        m.put('3', 'b');
        m.put('4', '9');
        m.put('5', 'P');
        m.put('6', '1');
        m.put('7', 'O');
        m.put('8', 'I');
        m.put('9', 'K');
        m.put('+', 'm');
        m.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
        oo = new char[cArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char[] cArr2 = o0;
            if (i3 >= cArr2.length) {
                break;
            }
            oo[i3] = m.get(Character.valueOf(cArr2[i3])).charValue();
            i3++;
        }
        on = new byte[128];
        int i4 = 0;
        while (true) {
            byte[] bArr = on;
            if (i4 >= bArr.length) {
                break;
            }
            bArr[i4] = AbstractJsonLexerKt.TC_INVALID;
            i4++;
        }
        while (true) {
            char[] cArr3 = oo;
            if (i2 >= cArr3.length) {
                return;
            }
            on[cArr3[i2]] = (byte) i2;
            i2++;
        }
    }

    public static String m(String str) {
        byte[] bytes = str.getBytes();
        return o(bytes, bytes.length);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    private static byte[] n(String str) {
        int i2;
        int i3;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i4 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            int iO = 0;
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
                        byte[] bArr2 = on;
                        if (c2 < bArr2.length && bArr2[c2] != 127) {
                            i3 = i8 + 1;
                            cArr[i8] = c2;
                            if (i3 == 4) {
                                iO += o(cArr, bArr, iO);
                                i8 = 0;
                            } else {
                                i8 = i3;
                            }
                        }
                    } else {
                        i3 = i8 + 1;
                        cArr[i8] = c2;
                        if (i3 == 4) {
                            iO += o(cArr, bArr, iO);
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
            if (iO == i4) {
                return bArr;
            }
            byte[] bArr3 = new byte[iO];
            System.arraycopy(bArr, 0, bArr3, 0, iO);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static int o(char[] cArr, byte[] bArr, int i2) {
        try {
            char c2 = cArr[3];
            char c3 = c2 == '=' ? (char) 2 : (char) 3;
            char c4 = cArr[2];
            if (c4 == '=') {
                c3 = 1;
            }
            byte[] bArr2 = on;
            byte b2 = bArr2[cArr[0]];
            byte b3 = bArr2[cArr[1]];
            byte b4 = bArr2[c4];
            byte b5 = bArr2[c2];
            if (c3 == 2) {
                bArr[i2] = (byte) ((3 & (b3 >> 4)) | ((b2 << 2) & 252));
                bArr[i2 + 1] = (byte) (((b3 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b4 >> 2) & 15));
                return 2;
            }
            if (c3 != 3) {
                bArr[i2] = (byte) (((b3 >> 4) & 3) | ((b2 << 2) & 252));
                return 1;
            }
            bArr[i2] = (byte) (((b2 << 2) & 252) | ((b3 >> 4) & 3));
            bArr[i2 + 1] = (byte) (((b3 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b4 >> 2) & 15));
            bArr[i2 + 2] = (byte) (((b4 << 6) & PsExtractor.AUDIO_STREAM) | (b5 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0024 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x001e, B:16:0x0032, B:12:0x0024, B:14:0x002a, B:19:0x0038), top: B:23:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    private static byte[] o(char[] cArr, int i2, int i3) {
        int i4;
        try {
            char[] cArr2 = new char[4];
            int i5 = ((i3 >> 2) * 3) + 3;
            byte[] bArr = new byte[i5];
            int iO = 0;
            int i6 = 0;
            for (int i7 = i2; i7 < i2 + i3; i7++) {
                char c2 = cArr[i7];
                if (c2 != '=') {
                    byte[] bArr2 = on;
                    if (c2 < bArr2.length && bArr2[c2] != 127) {
                        i4 = i6 + 1;
                        cArr2[i6] = c2;
                        if (i4 == 4) {
                            iO += o(cArr2, bArr, iO);
                            i6 = 0;
                        } else {
                            i6 = i4;
                        }
                    }
                } else {
                    i4 = i6 + 1;
                    cArr2[i6] = c2;
                    if (i4 == 4) {
                        iO += o(cArr2, bArr, iO);
                        i6 = 0;
                    } else {
                        i6 = i4;
                    }
                }
            }
            if (iO == i5) {
                return bArr;
            }
            byte[] bArr3 = new byte[iO];
            System.arraycopy(bArr, 0, bArr3, 0, iO);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String o(String str) {
        byte[] bArrN = n(str);
        if (bArrN == null || bArrN.length <= 0) {
            return null;
        }
        return new String(bArrN);
    }

    private static String o(byte[] bArr) {
        return o(bArr, bArr.length);
    }

    private static String o(byte[] bArr, int i2) {
        if (i2 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i2 / 3) << 2) + 4];
            int i3 = 0;
            int i4 = 0;
            while (i2 >= 3) {
                int i5 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i3 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr2 = oo;
                cArr[i4] = cArr2[i5 >> 18];
                cArr[i4 + 1] = cArr2[(i5 >> 12) & 63];
                int i6 = i4 + 3;
                cArr[i4 + 2] = cArr2[(i5 >> 6) & 63];
                i4 += 4;
                cArr[i6] = cArr2[i5 & 63];
                i3 += 3;
                i2 -= 3;
            }
            if (i2 == 1) {
                int i7 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                char[] cArr3 = oo;
                cArr[i4] = cArr3[i7 >> 2];
                cArr[i4 + 1] = cArr3[(i7 << 4) & 63];
                int i8 = i4 + 3;
                cArr[i4 + 2] = '=';
                i4 += 4;
                cArr[i8] = '=';
            } else if (i2 == 2) {
                int i9 = ((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                char[] cArr4 = oo;
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
