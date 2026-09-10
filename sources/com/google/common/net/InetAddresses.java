package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.inmobi.commons.core.configs.AdConfig;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class InetAddresses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CharMatcher f20039a = CharMatcher.j('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CharMatcher f20040b = CharMatcher.j(AbstractJsonLexerKt.COLON);

    public static final class TeredoInfo {
    }

    static {
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static InetAddress a(String str) {
        String strSubstring;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i3 = 1;
            byte[] bArrC = null;
            if (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '.') {
                    z2 = true;
                } else {
                    if (cCharAt != ':') {
                        if (cCharAt != '%') {
                            if (Character.digit(cCharAt, 16) == -1) {
                            }
                        }
                        if (bArrC == null) {
                            return InetAddress.getByAddress(bArrC);
                        }
                        Locale locale = Locale.ROOT;
                        throw new IllegalArgumentException(android.support.v4.media.a.n("'", str, "' is not an IP string literal."));
                    }
                    if (z2) {
                        if (bArrC == null) {
                            Locale locale2 = Locale.ROOT;
                            throw new IllegalArgumentException(android.support.v4.media.a.n("'", str, "' is not an IP string literal."));
                        }
                        try {
                            return InetAddress.getByAddress(bArrC);
                        } catch (UnknownHostException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                    z3 = true;
                }
                i2++;
            } else {
                i2 = -1;
            }
            if (z3) {
                if (z2) {
                    int iLastIndexOf = str.lastIndexOf(58) + 1;
                    String strSubstring2 = str.substring(0, iLastIndexOf);
                    byte[] bArrC2 = c(str.substring(iLastIndexOf));
                    strSubstring = bArrC2 == null ? null : androidx.media3.extractor.text.ttml.a.n(strSubstring2, Integer.toHexString(((bArrC2[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrC2[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)), ":", Integer.toHexString((bArrC2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrC2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)));
                    if (strSubstring != null) {
                    }
                } else {
                    strSubstring = str;
                }
                if (i2 != -1) {
                    strSubstring = strSubstring.substring(0, i2);
                }
                int iF = f20040b.f(strSubstring);
                if (iF >= 2 && iF <= 8) {
                    int i4 = iF + 1;
                    int i5 = 8 - i4;
                    int i6 = 0;
                    boolean z4 = false;
                    while (true) {
                        if (i6 >= strSubstring.length() - 1) {
                            if ((strSubstring.charAt(0) == ':' && strSubstring.charAt(1) != ':') || ((strSubstring.charAt(strSubstring.length() - 1) == ':' && strSubstring.charAt(strSubstring.length() - 2) != ':') || ((z4 && i5 <= 0) || (!z4 && i4 != 8)))) {
                                break;
                                break;
                                break;
                                break;
                            }
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                            try {
                                if (strSubstring.charAt(0) != ':') {
                                    i3 = 0;
                                }
                                while (i3 < strSubstring.length()) {
                                    int iIndexOf = strSubstring.indexOf(58, i3);
                                    if (iIndexOf == -1) {
                                        iIndexOf = strSubstring.length();
                                    }
                                    if (strSubstring.charAt(i3) == ':') {
                                        for (int i7 = 0; i7 < i5; i7++) {
                                            byteBufferAllocate.putShort((short) 0);
                                        }
                                    } else {
                                        int i8 = iIndexOf - i3;
                                        if (i8 <= 0 || i8 > 4) {
                                            throw new NumberFormatException();
                                        }
                                        int iDigit = 0;
                                        while (i3 < iIndexOf) {
                                            iDigit = (iDigit << 4) | Character.digit(strSubstring.charAt(i3), 16);
                                            i3++;
                                        }
                                        byteBufferAllocate.putShort((short) iDigit);
                                    }
                                    i3 = iIndexOf + 1;
                                }
                                bArrC = byteBufferAllocate.array();
                                break;
                            } catch (NumberFormatException unused) {
                                break;
                            }
                        }
                        if (strSubstring.charAt(i6) == ':' && strSubstring.charAt(i6 + 1) == ':') {
                            if (z4) {
                                break;
                            }
                            int i9 = i5 + 1;
                            if (i6 == 0) {
                                i9 = i5 + 2;
                            }
                            if (i6 == strSubstring.length() - 2) {
                                i9++;
                            }
                            i5 = i9;
                            z4 = true;
                        }
                        i6++;
                    }
                }
            } else if (z2 && i2 == -1) {
                bArrC = c(str);
            }
            if (bArrC == null) {
                return InetAddress.getByAddress(bArrC);
            }
            Locale locale3 = Locale.ROOT;
            throw new IllegalArgumentException(android.support.v4.media.a.n("'", str, "' is not an IP string literal."));
        }
    }

    public static byte b(int i2, int i3, String str) {
        int i4 = i3 - i2;
        if (i4 <= 0 || i4 > 3) {
            throw new NumberFormatException();
        }
        if (i4 > 1 && str.charAt(i2) == '0') {
            throw new NumberFormatException();
        }
        int i5 = 0;
        while (i2 < i3) {
            int i6 = i5 * 10;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i5 = i6 + iDigit;
            i2++;
        }
        if (i5 <= 255) {
            return (byte) i5;
        }
        throw new NumberFormatException();
    }

    public static byte[] c(String str) {
        if (f20039a.f(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int iIndexOf = str.indexOf(46, i2);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i3] = b(i2, iIndexOf, str);
                i2 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }
}
