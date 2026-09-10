package com.smartdigimkt.r4;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f38076a = "a";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f38077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f38078c;
    private static char[] d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static byte[] f38079e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        HashMap map = new HashMap();
        f38078c = map;
        map.put('v', 'A');
        f38078c.put('S', 'B');
        f38078c.put('o', 'C');
        f38078c.put('a', 'D');
        f38078c.put('j', 'E');
        f38078c.put('c', 'F');
        f38078c.put('7', 'G');
        f38078c.put('d', 'H');
        f38078c.put('R', 'I');
        f38078c.put('z', 'J');
        f38078c.put('p', 'K');
        f38078c.put('W', 'L');
        f38078c.put('i', 'M');
        f38078c.put('f', 'N');
        f38078c.put('G', 'O');
        f38078c.put('y', 'P');
        f38078c.put('N', 'Q');
        f38078c.put('x', 'R');
        f38078c.put('Z', 'S');
        f38078c.put('n', 'T');
        f38078c.put('V', 'U');
        f38078c.put('5', 'V');
        f38078c.put('k', 'W');
        f38078c.put('+', 'X');
        f38078c.put('D', 'Y');
        f38078c.put('H', 'Z');
        f38078c.put('L', 'a');
        f38078c.put('Y', 'b');
        f38078c.put('h', 'c');
        f38078c.put('J', 'd');
        f38078c.put('4', 'e');
        f38078c.put('6', 'f');
        f38078c.put('l', 'g');
        f38078c.put('t', 'h');
        f38078c.put('0', 'i');
        f38078c.put('U', 'j');
        f38078c.put('3', 'k');
        f38078c.put('Q', 'l');
        f38078c.put('r', 'm');
        f38078c.put('g', 'n');
        f38078c.put('E', 'o');
        f38078c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), 'p');
        f38078c.put('q', 'q');
        f38078c.put('8', 'r');
        f38078c.put('s', 's');
        f38078c.put('w', 't');
        f38078c.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f38078c.put('X', 'v');
        f38078c.put('M', 'w');
        f38078c.put('e', 'x');
        f38078c.put('B', 'y');
        f38078c.put('A', 'z');
        f38078c.put('T', '0');
        f38078c.put('2', '1');
        f38078c.put('F', '2');
        f38078c.put('b', '3');
        f38078c.put('9', '4');
        f38078c.put('P', '5');
        f38078c.put('1', '6');
        f38078c.put('O', '7');
        f38078c.put('I', '8');
        f38078c.put('K', '9');
        f38078c.put('m', '+');
        f38078c.put('C', Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        HashMap map2 = new HashMap();
        f38077b = map2;
        map2.put('A', 'v');
        f38077b.put('B', 'S');
        f38077b.put('C', 'o');
        f38077b.put('D', 'a');
        f38077b.put('E', 'j');
        f38077b.put('F', 'c');
        f38077b.put('G', '7');
        f38077b.put('H', 'd');
        f38077b.put('I', 'R');
        f38077b.put('J', 'z');
        f38077b.put('K', 'p');
        f38077b.put('L', 'W');
        f38077b.put('M', 'i');
        f38077b.put('N', 'f');
        f38077b.put('O', 'G');
        f38077b.put('P', 'y');
        f38077b.put('Q', 'N');
        f38077b.put('R', 'x');
        f38077b.put('S', 'Z');
        f38077b.put('T', 'n');
        f38077b.put('U', 'V');
        f38077b.put('V', '5');
        f38077b.put('W', 'k');
        f38077b.put('X', '+');
        f38077b.put('Y', 'D');
        f38077b.put('Z', 'H');
        f38077b.put('a', 'L');
        f38077b.put('b', 'Y');
        f38077b.put('c', 'h');
        f38077b.put('d', 'J');
        f38077b.put('e', '4');
        f38077b.put('f', '6');
        f38077b.put('g', 'l');
        f38077b.put('h', 't');
        f38077b.put('i', '0');
        f38077b.put('j', 'U');
        f38077b.put('k', '3');
        f38077b.put('l', 'Q');
        f38077b.put('m', 'r');
        f38077b.put('n', 'g');
        f38077b.put('o', 'E');
        f38077b.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f38077b.put('q', 'q');
        f38077b.put('r', '8');
        f38077b.put('s', 's');
        f38077b.put('t', 'w');
        f38077b.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        f38077b.put('v', 'X');
        f38077b.put('w', 'M');
        f38077b.put('x', 'e');
        f38077b.put('y', 'B');
        f38077b.put('z', 'A');
        f38077b.put('0', 'T');
        f38077b.put('1', '2');
        f38077b.put('2', 'F');
        f38077b.put('3', 'b');
        f38077b.put('4', '9');
        f38077b.put('5', 'P');
        f38077b.put('6', '1');
        f38077b.put('7', 'O');
        f38077b.put('8', 'I');
        f38077b.put('9', 'K');
        f38077b.put('+', 'm');
        f38077b.put(Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX), 'C');
    }

    private a() {
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            int i4 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 == length) {
                stringBuffer.append(d[i4 >>> 2]);
                stringBuffer.append(d[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i2 + 2;
            byte b3 = bArr[i3];
            if (i5 == length) {
                stringBuffer.append(d[i4 >>> 2]);
                stringBuffer.append(d[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(d[(b3 & 15) << 2]);
                stringBuffer.append(d9.i.f24747b);
                break;
            }
            i2 += 3;
            byte b4 = bArr[i5];
            stringBuffer.append(d[i4 >>> 2]);
            stringBuffer.append(d[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(d[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(d[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        return b.b(str);
    }

    public static String c(String str) {
        return TextUtils.isEmpty(str) ? "" : b.c(str);
    }

    public static byte[] a(String str) {
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
                b2 = f38079e[bytes[i6]];
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
                b3 = f38079e[bytes[i2]];
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
                b4 = f38079e[b6];
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
                b5 = f38079e[b7];
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
}
