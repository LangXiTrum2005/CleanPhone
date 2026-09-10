package com.smartdigimkt.n8;

import android.text.TextUtils;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37140a = "b";
    private static final String d = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37143e = "czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==";
    public static final String j = "+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f37141b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f37142c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};
    private static String f = "";
    static HashMap<String, HashMap<Character, Character>> g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Map<Character, Character> f37144h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f37145i = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private b() {
    }

    public static String a(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(c(str));
    }

    public static String b(String str) {
        return TextUtils.isEmpty(str) ? "" : a(str.getBytes());
    }

    private static byte[] c(String str) {
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
                b2 = f37142c[bytes[i6]];
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
                b3 = f37142c[bytes[i2]];
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
                b4 = f37142c[b6];
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
                b5 = f37142c[b7];
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

    public static String d(String str) {
        return a(str, (String) null);
    }

    public static String e(String str) {
        char[] charArray;
        try {
            if (TextUtils.isEmpty(str) || (charArray = a(str.getBytes()).toCharArray()) == null || charArray.length <= 0) {
                return "";
            }
            char[] cArr = new char[charArray.length];
            for (int i2 = 0; i2 < charArray.length; i2++) {
                cArr[i2] = a(charArray[i2]).charValue();
            }
            return new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strA = a(str.getBytes());
        if (TextUtils.isEmpty(f)) {
            f = a(d);
        }
        StringBuilder sb = new StringBuilder();
        for (char cCharAt : strA.toCharArray()) {
            int i2 = 0;
            while (true) {
                char[] cArr = f37141b;
                if (i2 >= cArr.length) {
                    break;
                }
                if (cArr[i2] == cCharAt && i2 < f.length()) {
                    cCharAt = f.charAt(i2);
                    break;
                }
                i2++;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
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
                char[] cArr = f37141b;
                stringBuffer.append(cArr[i4 >>> 2]);
                stringBuffer.append(cArr[(b2 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i5 = i2 + 2;
            byte b3 = bArr[i3];
            if (i5 == length) {
                char[] cArr2 = f37141b;
                stringBuffer.append(cArr2[i4 >>> 2]);
                stringBuffer.append(cArr2[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b3 & 15) << 2]);
                stringBuffer.append(d9.i.f24747b);
                break;
            }
            i2 += 3;
            byte b4 = bArr[i5];
            char[] cArr3 = f37141b;
            stringBuffer.append(cArr3[i4 >>> 2]);
            stringBuffer.append(cArr3[((b2 & 3) << 4) | ((b3 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b3 & 15) << 2) | ((b4 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b4 & 63]);
        }
        return stringBuffer.toString();
    }

    private static synchronized Character a(char c2, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(f)) {
                    f = a(d);
                }
                str = f;
            }
            HashMap<Character, Character> map = g.get(str);
            if (map == null) {
                map = new HashMap<>();
                if (str.length() >= f37141b.length) {
                    int i2 = 0;
                    while (true) {
                        char[] cArr = f37141b;
                        if (i2 >= cArr.length) {
                            break;
                        }
                        map.put(Character.valueOf(str.charAt(i2)), Character.valueOf(cArr[i2]));
                        i2++;
                    }
                    g.put(str, map);
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

    public static String a(String str, String str2) {
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = str.toCharArray();
                if (charArray != null && charArray.length > 0) {
                    char[] cArr = new char[charArray.length];
                    for (int i2 = 0; i2 < charArray.length; i2++) {
                        cArr[i2] = a(charArray[i2], str2).charValue();
                    }
                    str3 = new String(cArr);
                }
                return new String(c(str3));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    private static Character a(char c2) {
        if (f37144h == null) {
            f37144h = new HashMap();
            for (int i2 = 0; i2 < f37145i.length(); i2++) {
                f37144h.put(Character.valueOf(f37145i.charAt(i2)), Character.valueOf("+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA".charAt(i2)));
            }
        }
        if (f37144h.containsKey(Character.valueOf(c2))) {
            return f37144h.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }
}
