package com.thinkup.core.common.ooo;

/* JADX INFO: loaded from: classes6.dex */
final class oon {
    private static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private oon() {
    }

    private static char[] m(byte[] bArr) {
        return o(bArr, false);
    }

    private static char[] o(byte[] bArr, boolean z2) {
        return o(bArr, z2 ? m : o);
    }

    private static char[] o(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            cArr2[i2] = cArr[(b2 & 240) >>> 4];
            i2 += 2;
            cArr2[i3] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static String o(byte[] bArr) {
        return new String(o(bArr, true));
    }
}
