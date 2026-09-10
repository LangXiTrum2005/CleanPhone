package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ge extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2075 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2076 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2077 = 77;

    public static class a extends ge {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2078 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char[] f2079 = {193, 205, 203, 140, 192, 215, 210, 195, 194, 191, 204, 209, 201, 206, 178, 159, 177};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static boolean f2080 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2081 = 94;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f2082 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2083;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2151(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f2079;
                    int i3 = f2081;
                    if (f2080) {
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
                    if (f2082) {
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

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            f2083 = (f2078 + 87) % 128;
            String strIntern = m2151(null, null, 126 - MotionEvent.axisFromString(""), "\u008d\u0089\u0091\u0089\u0090\u008f\u008f\u0084\u008d\u0089\u008c\u0089\u008a\u008b\u0088\u008e\u0082\u0084\u008d\u0089\u008c\u0084\u0088\u0081\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            f2078 = (f2083 + 65) % 128;
            return strIntern;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = f2078 + 125;
            f2083 = i2 % 128;
            if (i2 % 2 == 0) {
                return TTAdSdk.class;
            }
            throw null;
        }
    }

    public static class c extends ge {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static long f2084 = 4192567426532481436L;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2085 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2086 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2152(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f1955) {
                try {
                    char[] cArrM2116 = f.m2116(f2084, cArr, i2);
                    f.f1954 = 4;
                    while (true) {
                        int i3 = f.f1954;
                        if (i3 < cArrM2116.length) {
                            int i4 = i3 - 4;
                            f.f1953 = i4;
                            cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2084));
                            f.f1954 = i3 + 1;
                        } else {
                            str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ﻐ */
        public final String mo2138() {
            int i2 = f2085 + 81;
            f2086 = i2 % 128;
            return m2152("ᔄ죜ᕧ儯픊\ue65f䷉脳猖좩羃绨\ud980껁\ue629퐞☱О肤䶉貯ﮮ⫈⬭ᕑ兾핖肩珗좄翬纓\ud875글\ue67e퐃⛭֮肎䷩賚ﬀ⬶⭊ᔷ兄햬", i2 % 2 == 0 ? (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)) * (-1) : (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern();
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
        /* JADX INFO: renamed from: ｋ */
        public final Class mo2140() {
            int i2 = (f2086 + 61) % 128;
            f2085 = i2;
            f2086 = (i2 + 97) % 128;
            return PAGSdk.class;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2150(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2077);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2076 + 103;
        f2075 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m2150(34 << KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)) + 28, 23794 << (ViewConfiguration.getMinimumFlingVelocity() * 11), "\f�￼\ufff9\u0006\ufffb�\ufffa\u0011", true) : m2150(7 - KeyEvent.keyCodeFromString(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10, 181 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\f�￼\ufff9\u0006\ufffb�\ufffa\u0011", false)).intern();
        int i3 = f2076 + 67;
        f2075 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bm bmVar = new bm(mo2139());
        int i2 = f2076 + 103;
        f2075 = i2 % 128;
        if (i2 % 2 != 0) {
            return bmVar;
        }
        throw null;
    }
}
