package hereditist;

import com.ironsource.X3;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"", "marial", "(Ljava/lang/String;)Ljava/lang/String;", "", "attabal", "(Ljava/lang/String;)Z", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "dern", "(Ljava/lang/String;II)Ljava/net/InetAddress;", "", AgentOptions.ADDRESS, "addressOffset", "saneness", "(Ljava/lang/String;II[BI)Z", "wireman", "([B)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class attabal {
    public static final boolean attabal(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (Intrinsics.taiyuan(cCharAt, 31) <= 0 || Intrinsics.taiyuan(cCharAt, 127) >= 0 || StringsKt.nosophobia(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
            i = i2;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[LOOP:1: B:30:0x0064->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0077 A[EDGE_INSN: B:55:0x0077->B:35:0x0077 BREAK  A[LOOP:1: B:30:0x0064->B:34:0x0071], SYNTHETIC] */
    public static final InetAddress dern(String str, int i, int i2) {
        int i3;
        int i4;
        int iRestrictive;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i5 < i2) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && dovishness.creditor(str, "::", i5, false, 4, null)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                if (i9 == i2) {
                    i7 = i6;
                    break;
                }
                i7 = i6;
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iRestrictive = wireman.restrictive(str.charAt(i5));
                    if (iRestrictive == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iRestrictive;
                    i5++;
                }
                i4 = i5 - i8;
                if (i4 != 0) {
                }
                return null;
            }
            if (i6 != 0) {
                if (!dovishness.creditor(str, ":", i5, false, 4, null)) {
                    if (!dovishness.creditor(str, ".", i5, false, 4, null) || !saneness(str, i8, i2, bArr, i6 - 2)) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i5++;
            }
            i8 = i5;
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iRestrictive = wireman.restrictive(str.charAt(i5));
                if (iRestrictive == -1) {
                    break;
                }
                i3 = (i3 << 4) + iRestrictive;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 != 0 || i4 > 4) {
                return null;
            }
            int i10 = i6 + 1;
            bArr[i6] = (byte) ((i3 >>> 8) & 255);
            i6 += 2;
            bArr[i10] = (byte) (i3 & 255);
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

    public static final String marial(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.overspeculate(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0 || attabal(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDern = (dovishness.starveling(str, X3.j.d, false, 2, null) && dovishness.cuirassed(str, X3.j.e, false, 2, null)) ? dern(str, 1, str.length() - 1) : dern(str, 0, str.length());
        if (inetAddressDern == null) {
            return null;
        }
        byte[] address = inetAddressDern.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return wireman(address);
        }
        if (address.length == 4) {
            return inetAddressDern.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }

    public static final boolean saneness(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (Intrinsics.taiyuan(cCharAt, 48) < 0 || Intrinsics.taiyuan(cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    public static final String wireman(byte[] bArr) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        duvetyn.wireman wiremanVar = new duvetyn.wireman();
        while (i2 < bArr.length) {
            if (i2 == i) {
                wiremanVar.writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    wiremanVar.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    wiremanVar.writeByte(58);
                }
                wiremanVar.writeHexadecimalUnsignedLong((wireman.wireman(bArr[i2], 255) << 8) | wireman.wireman(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return wiremanVar.readUtf8();
    }
}
