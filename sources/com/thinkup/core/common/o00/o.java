package com.thinkup.core.common.o00;

import android.text.TextUtils;
import android.util.Base64;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.common.ooo.mm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static Map<Character, Character> m = null;
    private static String m0 = null;
    private static final String o = "UTF-8";
    private static String om;
    private static String on;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char[] f42136n = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', IOUtils.DIR_SEPARATOR_UNIX};
    private static char[] o0 = {'5', 'P', 'V', AbstractJsonLexerKt.UNICODE_ESC, '3', 'J', 'j', 'l', 'e', 'Q', 'b', 'H', '9', 'A', 'v', 'h', 't', 's', 'g', 'W', 'I', 'C', 'U', 'i', 'F', '2', 'a', 'd', 'M', '8', 'D', 'y', 'Z', 'O', 'N', 'k', IOUtils.DIR_SEPARATOR_UNIX, '4', 'R', '7', '0', 'f', 'n', '+', 'z', 'G', 'Y', 'L', 'X', 'p', 'm', '1', 'E', 'K', 'S', 'T', 'o', 'x', '6', 'q', 'w', 'r', 'c', 'B'};
    private static byte[] oo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

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

    private static m n(String str, String str2) {
        m mVar = new m();
        try {
            if (TextUtils.isEmpty(on)) {
                on = mm.m("UlNB");
            }
            KeyFactory keyFactory = KeyFactory.getInstance(on);
            str.getBytes();
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
            int iBitLength = publicKeyGeneratePublic instanceof RSAPublicKey ? ((RSAPublicKey) publicKeyGeneratePublic).getModulus().bitLength() : 0;
            if (TextUtils.isEmpty(m0)) {
                m0 = mm.m("UlNBL0VDQi9QS0NTMVBhZGRpbmc=");
            }
            Cipher cipher = Cipher.getInstance(m0);
            cipher.init(1, publicKeyGeneratePublic);
            int i2 = (iBitLength / 8) - 11;
            mVar.o(new String(Base64.encode(i2 > 0 ? o(cipher, str2.getBytes(), i2) : cipher.doFinal(str2.getBytes()), 2)));
            return mVar;
        } catch (Throwable th) {
            mVar.m(th.getMessage());
            return mVar;
        }
    }

    public static m o(String str, String str2) {
        return n(str, str2);
    }

    private static byte[] o(Cipher cipher, byte[] bArr, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = length - i3;
            if (i5 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byte[] bArrDoFinal = i5 > i2 ? cipher.doFinal(bArr, i3, i2) : cipher.doFinal(bArr, i3, i5);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i4++;
            i3 = i4 * i2;
        }
    }

    public static String o(String str) {
        Character chValueOf;
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            char[] charArray = str.toCharArray();
            if (charArray != null && charArray.length > 0) {
                char[] cArr = new char[charArray.length];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    char c2 = charArray[i2];
                    if (m == null) {
                        m = new HashMap();
                        for (int i3 = 0; i3 < f42136n.length; i3++) {
                            m.put(Character.valueOf(o0[i3]), Character.valueOf(f42136n[i3]));
                        }
                    }
                    if (m.containsKey(Character.valueOf(c2))) {
                        chValueOf = m.get(Character.valueOf(c2));
                    } else {
                        chValueOf = Character.valueOf(c2);
                    }
                    cArr[i2] = chValueOf.charValue();
                }
                str2 = new String(cArr);
            }
            return new String(m(str2));
        } catch (Exception e2) {
            e2.printStackTrace();
            return str2;
        }
    }

    public static m m(String str, String str2) {
        return o(str, str2, true);
    }

    private static Character o(char c2) {
        if (m == null) {
            m = new HashMap();
            for (int i2 = 0; i2 < f42136n.length; i2++) {
                m.put(Character.valueOf(o0[i2]), Character.valueOf(f42136n[i2]));
            }
        }
        if (m.containsKey(Character.valueOf(c2))) {
            return m.get(Character.valueOf(c2));
        }
        return Character.valueOf(c2);
    }

    public static m o(String str, String str2, boolean z2) {
        if (z2) {
            if (TextUtils.isEmpty(om)) {
                om = mm.m("czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==");
            }
            str = mm.o(str, om);
        }
        return n(str.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\\s", ""), str2);
    }
}
