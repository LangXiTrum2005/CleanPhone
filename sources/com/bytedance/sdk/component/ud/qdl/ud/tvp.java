package com.bytedance.sdk.component.ud.qdl.ud;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.p004ironsource.d9;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class tvp {
    public static final Charset qdl = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:31:0x004f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059 A[LOOP:1: B:30:0x004d->B:33:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x005f A[EDGE_INSN: B:58:0x005f->B:34:0x005f BREAK  A[LOOP:1: B:30:0x004d->B:33:0x0059], SYNTHETIC] */
    private static InetAddress lnr(String str, int i2, int i3) {
        int i4;
        int i5;
        int iQdl;
        byte[] bArr = new byte[16];
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i2 < i3) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i2 + 2;
            if (i9 <= i3 && str.regionMatches(i2, "::", 0, 2)) {
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
                    iQdl = qdl(str.charAt(i2));
                    if (iQdl != -1) {
                        break;
                        break;
                    }
                    i4 = (i4 << 4) + iQdl;
                    i2++;
                }
                i5 = i2 - i8;
                if (i5 != 0) {
                }
                return null;
            }
            if (i6 != 0) {
                if (!str.regionMatches(i2, ":", 0, 1)) {
                    if (!str.regionMatches(i2, com.thinkup.core.common.n.mo.ono, 0, 1) || !qdl(str, i8, i3, bArr, i6 - 2)) {
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
                iQdl = qdl(str.charAt(i2));
                if (iQdl != -1) {
                    break;
                }
                i4 = (i4 << 4) + iQdl;
                i2++;
            }
            i5 = i2 - i8;
            if (i5 != 0 || i5 > 4) {
                return null;
            }
            int i10 = i6 + 1;
            bArr[i6] = (byte) ((i4 >>> 8) & 255);
            i6 += 2;
            bArr[i10] = (byte) (i4 & 255);
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i11 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i11, i11);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int qdl(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return c2 - '7';
    }

    public static int ud(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char cCharAt = str.charAt(i4);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static void qdl(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static boolean ud(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int qdl(String str, int i2, int i3) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int qdl(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int qdl(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static String qdl(String str) {
        InetAddress inetAddressLnr;
        if (str.contains(":")) {
            if (str.startsWith(d9.i.d) && str.endsWith(d9.i.f24752e)) {
                inetAddressLnr = lnr(str, 1, str.length() - 1);
            } else {
                inetAddressLnr = lnr(str, 0, str.length());
            }
            if (inetAddressLnr == null) {
                return null;
            }
            byte[] address = inetAddressLnr.getAddress();
            if (address.length == 16) {
                return qdl(address);
            }
            throw new AssertionError(a.n("Invalid IPv6 address: '", str, "'"));
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || ud(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static boolean qdl(String str, int i2, int i3, byte[] bArr, int i4) {
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
                if (cCharAt < '0' || cCharAt > '9') {
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

    private static String qdl(byte[] bArr) {
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
        qdl qdlVar = new qdl();
        while (i3 < bArr.length) {
            if (i3 == i2) {
                qdlVar.ud(58);
                i3 += i5;
                if (i3 == 16) {
                    qdlVar.ud(58);
                }
            } else {
                if (i3 > 0) {
                    qdlVar.ud(58);
                }
                qdlVar.ud(((bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                i3 += 2;
            }
        }
        return qdlVar.lnr();
    }

    public static boolean qdl(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }
}
