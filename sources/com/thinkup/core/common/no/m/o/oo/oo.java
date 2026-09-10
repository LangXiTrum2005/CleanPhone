package com.thinkup.core.common.no.m.o.oo;

import android.support.v4.media.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {
    static final int m = 16384;
    static final byte m0 = 5;
    static final byte mm = 7;
    static final byte mn = 8;
    static final byte mo = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final byte f42062n = 0;
    static final byte n0 = 9;
    static final byte nm = 1;
    static final byte nn = 1;
    static final byte no = 0;
    static final byte o0 = 1;
    static final byte o00 = 4;
    static final byte o0m = 8;
    static final byte o0n = 32;
    static final byte o0o = 4;
    static final byte om = 3;
    static final byte on = 4;
    static final byte oo = 2;
    static final byte oo0 = 32;
    static final com.thinkup.core.common.no.n.om o = com.thinkup.core.common.no.n.om.o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] oon = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final String[] ooo = new String[64];
    static final String[] oom = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = oom;
            if (i3 >= strArr.length) {
                break;
            }
            strArr[i3] = com.thinkup.core.common.no.m.o.n.o("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = ooo;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i4 = 0; i4 <= 0; i4++) {
            int i5 = iArr[i4];
            String[] strArr3 = ooo;
            strArr3[i5 | 8] = a.r(new StringBuilder(), strArr3[i5], "|PADDED");
        }
        String[] strArr4 = ooo;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            for (int i8 = 0; i8 <= 0; i8++) {
                int i9 = iArr[i8];
                String[] strArr5 = ooo;
                int i10 = i9 | i7;
                strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i9]);
                sb.append('|');
                strArr5[i10 | 8] = a.r(sb, strArr5[i7], "|PADDED");
            }
        }
        while (true) {
            String[] strArr6 = ooo;
            if (i2 >= strArr6.length) {
                return;
            }
            if (strArr6[i2] == null) {
                strArr6[i2] = oom[i2];
            }
            i2++;
        }
    }

    private oo() {
    }

    public static IOException m(String str, Object... objArr) throws IOException {
        throw new IOException(com.thinkup.core.common.no.m.o.n.o(str, objArr));
    }

    public static IllegalArgumentException o(String str, Object... objArr) {
        throw new IllegalArgumentException(com.thinkup.core.common.no.m.o.n.o(str, objArr));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static String o(boolean z2, int i2, int i3, byte b2, byte b3) {
        String strReplace;
        String[] strArr = oon;
        String strO = b2 < strArr.length ? strArr[b2] : com.thinkup.core.common.no.m.o.n.o("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            strReplace = "";
        } else if (b2 == 2 || b2 == 3) {
            strReplace = oom[b3];
        } else if (b2 == 4 || b2 == 6) {
            strReplace = b3 == 1 ? "ACK" : oom[b3];
        } else if (b2 == 7 || b2 == 8) {
            strReplace = oom[b3];
        } else {
            String[] strArr2 = ooo;
            String str = b3 < strArr2.length ? strArr2[b3] : oom[b3];
            if (b2 != 5 || (b3 & 4) == 0) {
                strReplace = (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
            } else {
                strReplace = str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return com.thinkup.core.common.no.m.o.n.o("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), strO, strReplace);
    }

    private static String o(byte b2, byte b3) {
        if (b3 == 0) {
            return "";
        }
        if (b2 != 2 && b2 != 3) {
            if (b2 == 4 || b2 == 6) {
                return b3 == 1 ? "ACK" : oom[b3];
            }
            if (b2 != 7 && b2 != 8) {
                String[] strArr = ooo;
                String str = b3 < strArr.length ? strArr[b3] : oom[b3];
                if (b2 != 5 || (b3 & 4) == 0) {
                    return (b2 != 0 || (b3 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return oom[b3];
    }
}
