package com.thinkup.core.express.o;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class o {
    private static Map<Character, Character> m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Map<Character, Character> f42386n = null;
    private static final String o = "o";
    private static char[] o0 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
    private static byte[] oo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap map = new HashMap();
        f42386n = map;
        map.put('v', 'A');
        f42386n.put('S', 'B');
        f42386n.put('o', 'C');
        f42386n.put('a', 'D');
        f42386n.put('j', 'E');
        f42386n.put('c', 'F');
        f42386n.put('7', 'G');
        f42386n.put('d', 'H');
        f42386n.put('R', 'I');
        f42386n.put('z', 'J');
        f42386n.put('p', 'K');
        f42386n.put('W', 'L');
        f42386n.put('i', 'M');
        f42386n.put('f', 'N');
        f42386n.put('G', 'O');
        f42386n.put('y', 'P');
        f42386n.put('N', 'Q');
        f42386n.put('x', 'R');
        f42386n.put('Z', 'S');
        f42386n.put('n', 'T');
        f42386n.put('V', 'U');
        f42386n.put('5', 'V');
        f42386n.put('k', 'W');
        f42386n.put('+', 'X');
        f42386n.put('D', 'Y');
        f42386n.put('H', 'Z');
        f42386n.put('L', 'a');
        f42386n.put('Y', 'b');
        f42386n.put('h', 'c');
        f42386n.put('J', 'd');
        f42386n.put('4', 'e');
        f42386n.put('6', 'f');
        f42386n.put('l', 'g');
        f42386n.put('t', 'h');
        f42386n.put('0', 'i');
        f42386n.put('U', 'j');
        f42386n.put('3', 'k');
        f42386n.put('Q', 'l');
        f42386n.put('r', 'm');
        f42386n.put('g', 'n');
        f42386n.put('E', 'o');
        f42386n.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f42386n.put('q', 'q');
        f42386n.put('8', 'r');
        f42386n.put('s', 's');
        f42386n.put('w', 't');
        f42386n.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f42386n.put('X', 'v');
        f42386n.put('M', 'w');
        f42386n.put('e', 'x');
        f42386n.put('B', 'y');
        f42386n.put('A', 'z');
        f42386n.put('T', '0');
        f42386n.put('2', '1');
        f42386n.put('F', '2');
        f42386n.put('b', '3');
        f42386n.put('9', '4');
        f42386n.put('P', '5');
        f42386n.put('1', '6');
        f42386n.put('O', '7');
        f42386n.put('I', '8');
        f42386n.put('K', '9');
        f42386n.put('m', '+');
        f42386n.put('C', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        HashMap map2 = new HashMap();
        m = map2;
        map2.put('A', 'v');
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
    }

    private o() {
    }

    private static byte[] m(String str) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        int i5;
        byte b5;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i6 = 0;
        while (i6 < length) {
            while (true) {
                i2 = i6 + 1;
                b2 = oo[bytes[i6]];
                if (i2 >= length || b2 != -1) {
                    break;
                }
                i6 = i2;
            }
            if (b2 == -1) {
                break;
            }
            while (true) {
                i3 = i2 + 1;
                b3 = oo[bytes[i2]];
                if (i3 >= length || b3 != -1) {
                    break;
                }
                i2 = i3;
            }
            if (b3 == -1) {
                break;
            }
            byteArrayOutputStream.write((b2 << 2) | ((b3 & 48) >>> 4));
            while (true) {
                i4 = i3 + 1;
                byte b6 = bytes[i3];
                if (b6 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b4 = oo[b6];
                if (i4 >= length || b4 != -1) {
                    break;
                }
                i3 = i4;
            }
            if (b4 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b3 & 15) << 4) | ((b4 & 60) >>> 2));
            while (true) {
                i5 = i4 + 1;
                byte b7 = bytes[i4];
                if (b7 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b5 = oo[b7];
                if (i5 >= length || b5 != -1) {
                    break;
                }
                i4 = i5;
            }
            if (b5 == -1) {
                break;
            }
            byteArrayOutputStream.write(b5 | ((b4 & 3) << 6));
            i6 = i5;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static String n(String str) {
        return TextUtils.isEmpty(str) ? "" : m.m(str);
    }

    private static String o(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            int i4 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 == length) {
                stringBuffer.append(o0[i4 >>> 2]);
                stringBuffer.append(o0[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i2 + 2;
            byte b3 = bArr[i3];
            if (i5 == length) {
                stringBuffer.append(o0[i4 >>> 2]);
                stringBuffer.append(o0[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(o0[(b3 & 15) << 2]);
                stringBuffer.append(d9.i.f24747b);
                break;
            }
            i2 += 3;
            byte b4 = bArr[i5];
            stringBuffer.append(o0[i4 >>> 2]);
            stringBuffer.append(o0[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(o0[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(o0[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    public static String o(String str) {
        return m.o(str);
    }
}
