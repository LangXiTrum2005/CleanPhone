package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class mm {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42329n = "+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA";
    public static final String o = "czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==";
    private static final String o0 = "mm";
    private static final String on = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";
    private static final char[] oo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
    private static final byte[] om = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static String m0 = "";
    static HashMap<String, HashMap<Character, Character>> m = new HashMap<>();
    private static Map<Character, Character> mo = null;
    private static String mm = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private mm() {
    }

    public static String m(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(oo(str));
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strO = o(str.getBytes());
        if (TextUtils.isEmpty(m0)) {
            m0 = m(on);
        }
        StringBuilder sb = new StringBuilder();
        for (char cCharAt : strO.toCharArray()) {
            int i2 = 0;
            while (true) {
                char[] cArr = oo;
                if (i2 >= cArr.length) {
                    break;
                }
                if (cArr[i2] == cCharAt && i2 < m0.length()) {
                    cCharAt = m0.charAt(i2);
                    break;
                }
                i2++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String o(String str) {
        return TextUtils.isEmpty(str) ? "" : o(str.getBytes());
    }

    public static String o0(String str) {
        char[] charArray;
        try {
            if (TextUtils.isEmpty(str) || (charArray = o(str.getBytes()).toCharArray()) == null || charArray.length <= 0) {
                return "";
            }
            char[] cArr = new char[charArray.length];
            for (int i2 = 0; i2 < charArray.length; i2++) {
                char c2 = charArray[i2];
                if (mo == null) {
                    mo = new HashMap();
                    for (int i3 = 0; i3 < mm.length(); i3++) {
                        mo.put(Character.valueOf(mm.charAt(i3)), Character.valueOf("+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA".charAt(i3)));
                    }
                }
                cArr[i2] = (mo.containsKey(Character.valueOf(c2)) ? mo.get(Character.valueOf(c2)) : Character.valueOf(c2)).charValue();
            }
            return new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static String om(String str) {
        return o(str, (String) null);
    }

    private static byte[] oo(String str) {
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
                b2 = om[bytes[i6]];
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
                b3 = om[bytes[i2]];
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
                b4 = om[b6];
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
                b5 = om[b7];
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

    public static String o(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            byte b2 = bArr[i2];
            int i4 = b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i3 == length) {
                char[] cArr = oo;
                stringBuffer.append(cArr[i4 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i2 + 2;
            byte b3 = bArr[i3];
            if (i5 == length) {
                char[] cArr2 = oo;
                stringBuffer.append(cArr2[i4 >>> 2]);
                stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b3 & 15) << 2]);
                stringBuffer.append(d9.i.f24747b);
                break;
            }
            i2 += 3;
            byte b4 = bArr[i5];
            char[] cArr3 = oo;
            stringBuffer.append(cArr3[i4 >>> 2]);
            stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static synchronized Character o(char c2, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(m0)) {
                    m0 = m(on);
                }
                str = m0;
            }
            HashMap<Character, Character> map = m.get(str);
            if (map == null) {
                map = new HashMap<>();
                if (str.length() >= oo.length) {
                    int i2 = 0;
                    while (true) {
                        char[] cArr = oo;
                        if (i2 >= cArr.length) {
                            break;
                        }
                        map.put(Character.valueOf(str.charAt(i2)), Character.valueOf(cArr[i2]));
                        i2++;
                    }
                    m.put(str, map);
                }
            }
            if (map.containsKey(Character.valueOf(c2))) {
                return map.get(Character.valueOf(c2));
            }
            return Character.valueOf(c2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String o(String str, String str2) {
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = str.toCharArray();
                if (charArray != null && charArray.length > 0) {
                    char[] cArr = new char[charArray.length];
                    for (int i2 = 0; i2 < charArray.length; i2++) {
                        cArr[i2] = o(charArray[i2], str2).charValue();
                    }
                    str3 = new String(cArr);
                }
                return new String(oo(str3));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    private static Character o(char c2) {
        if (mo == null) {
            mo = new HashMap();
            for (int i2 = 0; i2 < mm.length(); i2++) {
                mo.put(Character.valueOf(mm.charAt(i2)), Character.valueOf("+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA".charAt(i2)));
            }
        }
        if (mo.containsKey(Character.valueOf(c2))) {
            return mo.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }
}
