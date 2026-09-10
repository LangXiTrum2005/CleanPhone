package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class im {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2474 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2475 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, Object> f2476;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2477;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Map<String, Integer> f2478;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Integer> f2479;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2480;

    static {
        m2444();
        f2476 = new HashMap();
        f2479 = new HashMap();
        f2478 = new HashMap();
        int i2 = f2475 + 15;
        f2474 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2442(Context context, String str, JSONObject jSONObject, Object... objArr) {
        ih.m2416(context).m2423(new Intent(str).putExtra(ik.f2428, jSONObject.toString()));
        int i2 = f2474 + 97;
        f2475 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 46 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2443(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2477;
                char c2 = f2480;
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2444() {
        f2480 = (char) 1;
        f2477 = new char[]{AbstractJsonLexerKt.COLON};
    }
}
