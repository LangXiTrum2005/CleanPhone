package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2968 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f2969;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2970;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2971;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Handler f2972;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Handler f2973;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2974;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2975;

    static {
        m2919();
        f2973 = new Handler(Looper.getMainLooper());
        f2972 = m2923();
        int i2 = f2968 + 43;
        f2970 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2918(it itVar, long j) {
        int i2 = f2968 + 119;
        f2970 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2921().postDelayed(itVar, j);
            } else {
                m2921().postDelayed(itVar, j);
                int i3 = 6 / 0;
            }
        } catch (Error unused) {
            n.m2829(m2925(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, 127 - (ViewConfiguration.getTouchSlop() >> 8), null, "\u0082\u0085\u008e\u0096\u0095\u0088\u008f\u0093\u0087\u0085\u0094\u008f\u0093\u0090\u008f\u0082\u008e\u0089\u0085\u0086\u008e\u0082\u008f\u0088\u0092\u0090\u0091\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2919() {
        f2971 = true;
        f2969 = true;
        f2975 = 299;
        f2974 = new char[]{364, 399, 380, 416, 396, 407, 404, 415, 420, 382, 367, 374, 369, 400, 331, 410, 411, 414, 409, 408, 403, 413, 402, 397, 398, 406, 383, 365, 370, 343, 345};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Handler m2921() {
        Handler handler;
        int i2 = f2968;
        int i3 = i2 + 61;
        f2970 = i3 % 128;
        if (i3 % 2 != 0) {
            handler = f2973;
            int i4 = 71 / 0;
        } else {
            handler = f2973;
        }
        f2970 = (i2 + 35) % 128;
        return handler;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2924(it itVar) {
        f2970 = (f2968 + 99) % 128;
        try {
            m2921().post(itVar);
            int i2 = f2970 + 17;
            f2968 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 56 / 0;
            }
        } catch (Error unused) {
            n.m2829(m2925(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0082\u0085\u008e\u0096\u0095\u0088\u008f\u0093\u0087\u0085\u0094\u008f\u0093\u0090\u008f\u0088\u0092\u0090\u0091\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2926(it itVar) {
        int i2 = f2970 + 77;
        f2968 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m2916().post(itVar);
            } else {
                m2916().post(itVar);
                int i3 = 93 / 0;
            }
        } catch (Error unused) {
            n.m2829(m2925(null, ExpandableListView.getPackedPositionGroup(0L) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, 126 - TextUtils.lastIndexOf("", '0', 0), null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u0097\u0093\u0087\u0088\u0088\u008e\u0097\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2920(it itVar, long j) {
        int i2 = f2970 + 9;
        f2968 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2916().postDelayed(itVar, j);
                throw null;
            }
            m2916().postDelayed(itVar, j);
            f2968 = (f2970 + 1) % 128;
        } catch (Error unused) {
            n.m2829(m2925(null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u0097\u0093\u0087\u0088\u0088\u008e\u0097\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2922(it itVar) {
        int i2 = f2968 + 19;
        f2970 = i2 % 128;
        if (i2 % 2 != 0) {
            m2927();
            throw null;
        }
        if (m2927()) {
            itVar.run();
            return;
        }
        m2924(itVar);
        int i3 = f2970 + 45;
        f2968 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Handler m2923() {
        try {
            HandlerThread handlerThread = new HandlerThread(m2925(null, 127 - ExpandableListView.getPackedPositionGroup(0L), null, "\u0082\u0085\u008e\u0096\u0095\u009b\u009d\u009c\u009c\u009b").intern());
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    int i3 = f2968 + 11;
                    f2970 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 2 / 0;
                    }
                    return handler;
                } catch (Error unused) {
                    n.m2829(m2925(null, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, "\u009f\u009f\u009f\u0097\u0093\u0087\u0089\u0096\u0088\u008e\u0096\u008f\u009e\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u008e\u0088\u0085\u008e\u0096\u0099\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), true);
                }
            }
            f2968 = (f2970 + 49) % 128;
        } catch (Error unused2) {
            n.m2829(m2925(null, AndroidCharacter.getMirror('0') + 'O', null, "\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2925(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0096\u008e\u0086\u0082\u0093\u0085\u0095\u008f\u0082\u0093\u0084\u0090\u0096\u0097\u009a\u0099\u0085\u0098\u008f\u008e\u0088\u0085\u008e\u0096\u0099\u008f\u0090\u0088\u008f\u0082\u008e\u0086\u0087\u0085\u008d").intern(), true);
        }
        int i5 = f2968 + 53;
        f2970 = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2917(it itVar) {
        f2970 = (f2968 + 107) % 128;
        if (!m2927()) {
            itVar.run();
            return;
        }
        f2970 = (f2968 + 53) % 128;
        m2926(itVar);
        f2970 = (f2968 + 15) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2927() {
        f2970 = (f2968 + 49) % 128;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        f2968 = (f2970 + 47) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2925(int[] iArr, int i2, String str, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2974;
                int i3 = f2975;
                if (f2969) {
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
                if (f2971) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Handler m2916() {
        int i2 = f2970 + 31;
        f2968 = i2 % 128;
        if (i2 % 2 != 0) {
            return f2972;
        }
        int i3 = 70 / 0;
        return f2972;
    }
}
