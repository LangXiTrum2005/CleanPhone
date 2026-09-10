package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2844 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2845 = {29, 'V', 'o', 'j', 'e', 'j', 'l', 'T', 29, 'R', 'g', 'b', 'a', 'c', 'd', 'b', 'i', 'c', AbstractJsonLexerKt.BEGIN_OBJ, '7', 'i', 'd', 'B', ' ', '$', 'E', 'b', 129, 281, 304, 302, 302, 263, 265, 302, 300, 300, 258, '7', 'q', 'l', 'f', 'l', 'i', 'j', 'n', 'l', 'n', 'N', '\'', 'D', 5};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static WeakReference<az> f2846;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2847;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2746(String str, String str2, Throwable th, boolean z2, boolean z3) {
        int i2 = f2844 + 87;
        f2847 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m2755(str, str2, th, z2, z3, false);
            } else {
                m2755(str, str2, th, z2, z3, false);
            }
            int i3 = f2847 + 81;
            f2844 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2747(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z2) {
        int i2 = f2847 + 109;
        f2844 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2745(str, str2, str3, th, jSONObject, false, true, z2);
            } else {
                m2745(str, str2, str3, th, jSONObject, true, false, z2);
            }
            int i3 = f2847 + 41;
            f2844 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2748(String str, String str2, String str3, Throwable th) {
        f2847 = (f2844 + 83) % 128;
        try {
            m2754(str, str2, str3, th, false);
            f2847 = (f2844 + 7) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2750(az azVar) {
        f2846 = new WeakReference<>(azVar);
        int i2 = f2844 + 69;
        f2847 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Throwable m2753(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
            f2844 = (f2847 + 1) % 128;
        }
        f2844 = (f2847 + 105) % 128;
        return th;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2745(String str, String str2, String str3, Throwable th, JSONObject jSONObject, boolean z2, boolean z3, boolean z4) {
        String str4;
        int i2 = f2847 + 79;
        f2844 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                throw null;
            }
            if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(m2749(true, new int[]{18, 1, PsExtractor.PRIVATE_STREAM_1, 1}, "\u0001").intern());
                sb.append(str);
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(m2749(false, new int[]{19, 7, 0, 4}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001").intern());
                sb2.append(string);
                sb2.append(m2749(false, new int[]{26, 1, 156, 0}, "\u0001").intern());
                n.m2833(str, sb2.toString(), th, z4);
                str4 = string;
            } else {
                str4 = str3;
            }
            az azVar = f2846.get();
            if (azVar != null) {
                int i3 = f2847 + 69;
                f2844 = i3 % 128;
                if (i3 % 2 != 0) {
                    azVar.m736(str, str2, str4, Log.getStackTraceString(th), jSONObject, z3);
                } else {
                    azVar.m736(str, str2, str4, Log.getStackTraceString(th), jSONObject, z3);
                    throw null;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2752(String str, String str2, Throwable th, boolean z2) {
        f2847 = (f2844 + 111) % 128;
        try {
            m2746(str, str2, th, z2, false);
            int i2 = f2847 + 23;
            f2844 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2751(String str, String str2, String str3, String str4) {
        String string;
        f2847 = (f2844 + 69) % 128;
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(m2749(true, new int[]{18, 1, PsExtractor.PRIVATE_STREAM_1, 1}, "\u0001").intern());
            sb.append(str);
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2749(false, new int[]{27, 11, 190, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000").intern());
            sb2.append(string2);
            sb2.append(m2749(false, new int[]{38, 13, 0, 11}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001").intern());
            n.m2829(str, sb2.toString(), false);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            if (str4 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(m2749(true, new int[]{51, 1, 0, 0}, "\u0000").intern());
                sb4.append(str4);
                string = sb4.toString();
            } else {
                string = "";
            }
            sb3.append(string);
            n.m2829(str, sb3.toString(), false);
            az azVar = f2846.get();
            if (azVar != null) {
                f2847 = (f2844 + 27) % 128;
                azVar.m739(str, str2, string2, str4);
            }
            int i2 = f2844 + 125;
            f2847 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2755(String str, String str2, Throwable th, boolean z2, boolean z3, boolean z4) {
        try {
            if (!z2) {
                n.m2833(str, str2, th, z4);
                f2844 = (f2847 + 43) % 128;
            } else {
                f2844 = (f2847 + 65) % 128;
                n.m2829(str, str2, z4);
                if (th != null) {
                    n.m2833(str, m2749(true, new int[]{0, 8, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern(), th, z4);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m2749(true, new int[]{8, 10, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern());
            sb.append(str);
            m2745(str, str2, sb.toString(), th, null, false, z3, z4);
            f2847 = (f2844 + 109) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2744(String str, String str2, String str3, String str4) {
        int i2 = f2844 + 87;
        f2847 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m2751(str, str2, str3, str4);
            } else {
                m2751(str, str2, str3, str4);
                throw null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2754(String str, String str2, String str3, Throwable th, boolean z2) {
        f2847 = (f2844 + 1) % 128;
        try {
            m2745(str, str2, str3, th, null, false, false, false);
            f2844 = (f2847 + 33) % 128;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2749(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2845, i2, cArr, 0, i3);
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
}
