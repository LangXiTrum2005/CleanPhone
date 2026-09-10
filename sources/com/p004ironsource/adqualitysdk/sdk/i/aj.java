package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class aj {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f274 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f275;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f276;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f277;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f278 = m397((byte) (28 - View.MeasureSpec.getMode(0)), "\u0001\u0002\u0002\u0003\u0004\u0005KK\u0007\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r\u0089", 34 - Process.getGidForName("")).intern();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f279 = m397((byte) (79 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), "\u0001\u0002\u0002\u0003\u0004\u0005~~\r\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r¼", (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 34).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f280 = m397((byte) (TextUtils.indexOf((CharSequence) "", '0') + 33), "\u0001\u0002\u0002\u0003\u0004\u0005OO\t\b\t\n\u000b\u0006\r\u000e\n\u0007\u0007\u0002\b\f\u0011\t\u0011\u0010\u0007\u0000\f\u0017\n\u0006\u0014\r\u008d", 35 - TextUtils.indexOf("", "")).intern();

    static {
        m398();
        m397((byte) (((Process.getThreadPriority(0) + 20) >> 6) + 112), "\u001b\u0006\u001a\u0007\b\u001b\u000f\u001a\u001d\u0018\u001f !\"\u009c", 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
        f275 = (f274 + 91) % 128;
    }

    public aj() {
        m397((byte) (60 - View.resolveSize(0, 0)), "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u009e", 14 - ImageFormat.getBitsPerPixel(0)).intern();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m397(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f276;
                char c2 = f277;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m398() {
        f277 = (char) 6;
        f276 = new char[]{'h', 't', 'p', 's', AbstractJsonLexerKt.COLON, IOUtils.DIR_SEPARATOR_UNIX, 'i', '-', 'a', 'd', 'q', '.', 'm', 'e', 'o', 'n', AbstractJsonLexerKt.UNICODE_ESC, 'y', '3', 'c', 'r', 'b', 'k', 'v', '1', 'E', 'C', 'w', dc.T, 'O', 'R', '7', 'D', '!', AbstractJsonLexerKt.COMMA, 'j'};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m401() {
        int i2 = f275 + 113;
        f274 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f278;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m403(String str) {
        int i2 = f274 + 89;
        f275 = i2 % 128;
        if (i2 % 2 != 0) {
            m399(this.f279, str);
            throw null;
        }
        String strM399 = m399(this.f279, str);
        f275 = (f274 + 97) % 128;
        return strM399;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m404(String str) {
        int i2 = f274 + 113;
        f275 = i2 % 128;
        if (i2 % 2 != 0) {
            m399(this.f278, str);
            throw null;
        }
        String strM399 = m399(this.f278, str);
        int i3 = f275 + 49;
        f274 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return strM399;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m399(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            f275 = (f274 + 81) % 128;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(m397((byte) (116 - TextUtils.getTrimmedLength("")), "£", -Process.getGidForName("")).intern());
        int i2 = f275;
        if (str2 != null) {
            f274 = (i2 + 105) % 128;
        } else {
            f274 = (i2 + 19) % 128;
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m400() {
        f274 = (f275 + 105) % 128;
        String strIntern = m397((byte) (60 - Gravity.getAbsoluteGravity(0, 0)), "\u0002\u0013\u0007\u0014\u000f\u0013\u0007\u0014\u0017\n\u0017\u0012\u0006\n\u009e", 15 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        int i2 = f275 + 53;
        f274 = i2 % 128;
        if (i2 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m402() {
        int i2 = f275 + 111;
        f274 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f280;
        }
        throw null;
    }
}
