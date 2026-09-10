package com.p004ironsource.adqualitysdk.sdk.i;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2640 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2641 = {AbstractJsonLexerKt.COLON, '\\', 'R', 'j', 'j', 'h', 'o', 'q', 'g', 197, 191, 200};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2642 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2643;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject f2644;

    public jd(JSONObject jSONObject) {
        this(jSONObject, UUID.randomUUID().toString());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2550(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f2641, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2551() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(m2550(false, new int[]{0, 8, 0, 5}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000").intern(), this.f2644);
        jSONObject.put(m2550(true, new int[]{8, 4, 89, 1}, "\u0000\u0001\u0001\u0000").intern(), this.f2643);
        f2640 = (f2642 + 105) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2552() {
        int i2 = f2640 + 95;
        f2642 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2643;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m2553() {
        int i2 = (f2642 + 61) % 128;
        f2640 = i2;
        JSONObject jSONObject = this.f2644;
        f2642 = (i2 + 57) % 128;
        return jSONObject;
    }

    public jd(JSONObject jSONObject, String str) {
        this.f2644 = jSONObject;
        this.f2643 = str;
    }
}
