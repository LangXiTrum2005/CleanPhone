package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jt {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2780 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2781 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2782 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2783 = {'f', 's', 'a', AbstractJsonLexerKt.UNICODE_ESC, 't', 'i', 'd', 'p', 'A', 'Q', 'l', 'y', 'S', 'D', 'K', 'E', 'v', 'e', 'n', 'G', 'r', 'o', ' ', 'g', IOUtils.DIR_SEPARATOR_UNIX, 'm', 'j', 'h', 'k', 'q', 'w', 'x', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m2662(String str, ax axVar, boolean z2, ao aoVar) {
        JSONObject jSONObject = new JSONObject();
        if (!(!z2)) {
            try {
                jSONObject.put(m2661((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 116), "\u0001\u0002", ImageFormat.getBitsPerPixel(0) + 3).intern(), true);
                f2780 = (f2781 + 105) % 128;
            } catch (JSONException e2) {
                n.m2832(m2661((byte) (72 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "\t\u0007\u000f\t\u0004\b\u0000\u0005\u0006\u0011\u000e\u000f\u0010\u0011\f\u0017\u0001\u0016\f\u0017\u000e\u0017\u0003\u0005\u0016\u0015", 26 - TextUtils.indexOf("", "")).intern(), m2661((byte) ((Process.myTid() >> 22) + 118), "\u000e\u0015\u0015\u0016\u0015\u0017\u0000\b\u000b\u0000\u0013\u0012\u0012\u0004\u0002\u0017\u0002\u0005\u0017\u0004\u0013\u0000\u0005\u0003ââ\u001c\u0006\u0003\u0002\n\u001c\u0001\t\b\u0000\u0005\u0010\u001c\n\u0001\u001d\u0010\u0017\u0003\u0016\u0014\u001c\u0003\u0013ä", (KeyEvent.getMaxKeyCode() >> 16) + 51).intern(), e2);
            }
        }
        if (aoVar.m435()) {
            int i2 = f2781 + 35;
            f2780 = i2 % 128;
            if (i2 % 2 == 0) {
                jSONObject.put(m2661((byte) (66 >> Process.getGidForName("")), "\u0003\u0004\u0005\u0000 ", 5 - TextUtils.getOffsetBefore("", 1)).intern(), false);
            } else {
                jSONObject.put(m2661((byte) (59 - Process.getGidForName("")), "\u0003\u0004\u0005\u0000 ", 5 - TextUtils.getOffsetBefore("", 0)).intern(), true);
            }
        }
        jSONObject.put(m2661((byte) (Drawable.resolveOpacity(0, 0) + 94), "\t\u0001\u0000\u000b", TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern(), str);
        kc.m2759(jSONObject, axVar.m634());
        kc.m2759(jSONObject, axVar.m631());
        f2780 = (f2781 + 71) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2661(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2783;
                char c2 = f2782;
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
}
