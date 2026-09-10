package com.p004ironsource.adqualitysdk.sdk.i;

import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class ev extends eo {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1934 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1935 = {337};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1936 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1937 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1938 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1939 = 277;

    public ev(ee eeVar, ee eeVar2, dm dmVar) {
        super(eeVar, eeVar2, dmVar);
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2089() {
        int i2 = f1937 + 21;
        f1934 = i2 % 128;
        return m2112(null, null, i2 % 2 == 0 ? (ExpandableListView.getPackedPositionForChild(1, 1) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 1) == 1L ? 0 : -1)) * 41 : 126 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0081").intern();
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.ek
    /* JADX INFO: renamed from: ﻛ */
    public final boolean mo2099(int i2) {
        int i3 = f1934;
        f1937 = (i3 + 119) % 128;
        if (i2 >= 0) {
            return false;
        }
        f1937 = (i3 + 11) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2112(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1935;
                int i3 = f1939;
                if (f1936) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1938) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
