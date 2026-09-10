package okhttp3.internal;

import androidx.media3.extractor.text.ttml.a;
import com.p004ironsource.d9;
import com.thinkup.core.common.n.mo;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Intrinsics.h(cCharAt, 31) <= 0 || Intrinsics.h(cCharAt, 127) >= 0 || StringsKt.u(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (Intrinsics.h(cCharAt, 48) < 0 || Intrinsics.h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057 A[LOOP:1: B:28:0x004b->B:31:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x005d A[EDGE_INSN: B:53:0x005d->B:32:0x005d BREAK  A[LOOP:1: B:28:0x004b->B:31:0x0057], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i2, int i3) {
        int i4;
        int i5;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i3) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i2 + 2;
            if (i9 <= i3 && StringsKt.L(str, i2, "::", false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                i4 = 0;
                i2 = i8;
                while (i2 < i3) {
                    hexDigit = Util.parseHexDigit(str.charAt(i2));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + hexDigit;
                    i2++;
                }
                i5 = i2 - i8;
                return i5 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (!StringsKt.L(str, i2, ":", false)) {
                    if (!StringsKt.L(str, i2, mo.ono, false) || !decodeIpv4Suffix(str, i8, i3, bArr, i6 - 2)) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i2++;
            }
            i8 = i2;
            i4 = 0;
            i2 = i8;
            while (i2 < i3) {
                hexDigit = Util.parseHexDigit(str.charAt(i2));
                if (hexDigit != -1) {
                    break;
                }
                i4 = (i4 << 4) + hexDigit;
                i2++;
            }
            i5 = i2 - i8;
            if (i5 == 0 && i5 <= 4) {
                int i10 = i6 + 1;
                bArr[i6] = (byte) ((i4 >>> 8) & 255);
                i6 += 2;
                bArr[i10] = (byte) (i4 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i11 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i11, i11);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        Buffer buffer = new Buffer();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                buffer.T(58);
                i3 += i5;
                if (i3 == 16) {
                    buffer.T(58);
                }
            } else {
                if (i3 > 0) {
                    buffer.T(58);
                }
                buffer.Y((Util.and(bArr[i3], 255) << 8) | Util.and(bArr[i3 + 1], 255));
                i3 += 2;
            }
        }
        return buffer.readUtf8();
    }

    public static final String toCanonicalHost(String str) {
        Intrinsics.f(str, "<this>");
        if (StringsKt.l(str, ":", false)) {
            InetAddress inetAddressDecodeIpv6 = (StringsKt.M(str, d9.i.d, false) && StringsKt.p(str, d9.i.f24752e, false)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
            if (inetAddressDecodeIpv6 == null) {
                return null;
            }
            byte[] address = inetAddressDecodeIpv6.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            if (address.length == 4) {
                return inetAddressDecodeIpv6.getHostAddress();
            }
            throw new AssertionError(a.i('\'', "Invalid IPv6 address: '", str));
        }
        try {
            String ascii = IDN.toASCII(str);
            Intrinsics.e(ascii, "toASCII(host)");
            Locale US = Locale.US;
            Intrinsics.e(US, "US");
            String lowerCase = ascii.toLowerCase(US);
            Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase.length() == 0 || containsInvalidHostnameAsciiCodes(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
