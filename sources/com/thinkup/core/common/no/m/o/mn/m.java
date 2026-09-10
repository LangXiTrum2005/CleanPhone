package com.thinkup.core.common.no.m.o.mn;

import androidx.datastore.preferences.protobuf.a;
import com.thinkup.core.common.no.n.om;

/* JADX INFO: loaded from: classes6.dex */
public final class m {
    static final int m = 128;
    static final int m0 = 128;
    static final int mm = 0;
    static final int mn = 1;
    static final int mo = 127;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f42018n = 64;
    static final int n0 = 2;
    static final int nm = 9;
    static final int nn = 10;
    static final int no = 8;
    static final String o = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    static final int o0 = 32;
    static final long o00 = 125;
    static final int o0m = 126;
    static final long o0n = 65535;
    static final long o0o = 123;
    static final int om = 15;
    static final int on = 8;
    static final int oo = 16;
    static final int oo0 = 127;
    static final int oom = 1005;
    static final int ooo = 1001;

    private m() {
        throw new AssertionError("No instances.");
    }

    public static void m(int i2) {
        String strO = o(i2);
        if (strO != null) {
            throw new IllegalArgumentException(strO);
        }
    }

    public static void o(com.thinkup.core.common.no.n.n.o oVar, byte[] bArr) {
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = oVar.o0;
            int i3 = oVar.oo;
            int i4 = oVar.om;
            while (i3 < i4) {
                int i5 = i2 % length;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                i3++;
                i2 = i5 + 1;
            }
        } while (oVar.o() != -1);
    }

    public static String o(int i2) {
        if (i2 < 1000 || i2 >= 5000) {
            return "Code must be in range [1000,5000): ".concat(String.valueOf(i2));
        }
        if ((i2 < 1004 || i2 > 1006) && (i2 < 1012 || i2 > 2999)) {
            return null;
        }
        return a.k("Code ", i2, " is reserved and may not be used.");
    }

    private static String o(String str) {
        return om.o(str + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").o0().m();
    }
}
