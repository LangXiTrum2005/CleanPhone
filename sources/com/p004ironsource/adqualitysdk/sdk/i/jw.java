package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class jw {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2795 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2797 = 6;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2798 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2794 = {'p', 'n', 'v', 'c', 'C', 'o', AbstractJsonLexerKt.UNICODE_ESC, 'l', 'd', '\'', 't', ' ', 'a', 'e', 'r', 's', 'i', 'f', 'j', '.', AbstractJsonLexerKt.COLON, 'm', 'q', 'y', 'k', 'S', 'T', 'b', 'E', 'x', 'w', 'z', AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, '~'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2796 = {'Q', 185, 209, 195, 197, 207, 203, 208, 133, '|', '2', 129, 134, '2', 129, 'x', 128, AbstractJsonLexerKt.BEGIN_OBJ, '2', 'v', AbstractJsonLexerKt.BEGIN_LIST, 'w', '~', 'v', 128, 135, 't', '2', 'v', 'v', 's', '2', 134, '9', 128, 'v', '~', 135, 129, 'U', 128, 129, '7', 'p', '7', 'o', 'm', 'o', 'p', 'k', 'q', 'Q', 'R', 't', 'q', AbstractJsonLexerKt.UNICODE_ESC, 'o', 's', '|', 'y', 't', 'M', 'K', 'm', 'k', 'I', 'S', 'V', 'S', 'r', 'q', 'y', AbstractJsonLexerKt.BEGIN_OBJ, 'b', AbstractJsonLexerKt.COLON, '6', '_', 'y', 'y', AbstractJsonLexerKt.BEGIN_OBJ, 't', 'K', '0', 'W', 'w', 'z', 'w', 'N', 'P', 'z', 'S', 'K', 'r', 'p', 'p', 'P', 'T', 172, '.', 133, 172, 166, 127, 133, 167, 162, 160, 163, 163, 163, 130, '~', 162, 160, 162, 163, 158, 164, 132, 134, 168, 162, 127, 134, 137, 134, 165, 164, 172, 174, 149, 'e', 196, 224, 265, 272, 270, 270, 244, 203, 190, '!', 'Y', 'r', 'p', 'h', 'i', 'J', 'M', 'J', '@', 'b', 'd', 'B', '@', 'h', 'p', 'H', 'G', 'g', 'g', 'i', 'B', 'D', 'k', 'j', 'j', 'G', 'J', 'q', 'G', 'E', 'n', 'q', 'n', 'N', '\'', 'B', 'k', 'r', 'p', 'p', 'V', '-', 159, 315, 307, 304, 310, 278, 274, 307, 302, 303, 304, 308, 306, 299, 291, 297, 315, 307, 304, 294, 262, 277, 304, 308, 306, 299, 307, 276, 270, 272, '0'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2674(Context context, String str) {
        f2795 = (f2798 + 101) % 128;
        if (context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        f2798 = (f2795 + 121) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2675(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2796, i2, cArr, 0, i3);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2677(Context context) {
        int i2 = f2795 + 117;
        f2798 = i2 % 128;
        try {
            String str = (i2 % 2 == 0 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 1) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).versionName;
            f2798 = (f2795 + 27) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException e2) {
            String strIntern = m2675(false, new int[]{0, 8, 97, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m2675(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb.append((String) context);
            sb.append(m2675(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb.append(e2.getLocalizedMessage());
            n.m2826(strIntern, sb.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2673(Context context, JSONObject jSONObject) {
        f2798 = (f2795 + 97) % 128;
        String strIntern = m2675(false, new int[]{0, 8, 97, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m2676((byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 90), "\u0001\u0002", 2 - View.resolveSizeAndState(0, 0, 0)).intern(), packageName);
        } catch (JSONException e2) {
            n.m2832(strIntern, m2675(true, new int[]{8, 34, 18, 32}, null).intern(), e2);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m2675(false, new int[]{42, 2, 12, 0}, "\u0001\u0001").intern(), packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e3) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2675(true, new int[]{44, 52, 9, 30}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000").intern());
            sb.append(e3.getLocalizedMessage());
            n.m2826(strIntern, sb.toString());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(m2676((byte) (Drawable.resolveOpacity(0, 0) + 8), "\u0003\u0004", 1 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), Integer.toString(packageInfo.versionCode));
            jSONObject.put(m2675(true, new int[]{96, 2, 58, 0}, "\u0000\u0000").intern(), packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2675(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb2.append(packageName);
            sb2.append(m2675(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb2.append(e4.getLocalizedMessage());
            n.m2826(strIntern, sb2.toString());
        } catch (JSONException e5) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2676((byte) (51 - TextUtils.lastIndexOf("", '0', 0)), "\u0005\u0000\u0007\b\u0007\u0002\n\u000b\u0006\u0011\u0098\u0098\u0006\u0011¤¤\b\u0005\u000e\u000f\u0010\u0011\u0000\u0002\n\u0011\u0005\r\u000b\u0011\u000b\u0004\u0006\u0017\u0011\u0003\u0007\u0019\u0007\u0011¦¦\u0002\u0011\u0017\b", TextUtils.getTrimmedLength("") + 46).intern());
            sb3.append(e5.getLocalizedMessage());
            n.m2826(strIntern, sb3.toString());
        }
        try {
            jSONObject.put(m2676((byte) (74 - (Process.myTid() >> 22)), "\u0007\u0002", (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            int i2 = f2795 + 57;
            f2798 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 68 / 0;
            }
        } catch (PackageManager.NameNotFoundException e6) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m2675(true, new int[]{98, 33, 60, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000").intern());
            sb4.append(packageName);
            sb4.append(m2675(false, new int[]{131, 10, 158, 9}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000").intern());
            sb4.append(e6.getLocalizedMessage());
            n.m2826(strIntern, sb4.toString());
        } catch (JSONException e7) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m2675(false, new int[]{141, 43, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000").intern());
            sb5.append(e7.getLocalizedMessage());
            n.m2826(strIntern, sb5.toString());
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2676(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f2794;
                char c2 = f2797;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2672() {
        f2798 = (f2795 + 65) % 128;
        try {
            Class.forName(m2675(true, new int[]{184, 30, 197, 9}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001").intern());
            String strIntern = m2676((byte) (37 - Color.red(0)), "\u009a", Color.rgb(0, 0, 0) + 16777217).intern();
            int i2 = f2798 + 77;
            f2795 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return strIntern;
        } catch (ClassNotFoundException unused) {
            try {
                Class.forName(m2676((byte) (94 - ImageFormat.getBitsPerPixel(0)), "\u0004\u0000\u0016\u0014\u0011\u000f\u0000\u0002\u0011\u0003\b\f\u0001\u000f\u0012\r\n\u0014\f\u0012\n\r\u000b\u0016\u000e\t\u0019\u0012\u000e\t\u0019\u0012\r\u0011\r\u0014\u001d\u0001\u0003\u0017\u0006\r \u0014\u000f\u0000\u000f\u0019\u000f\u0000\u0019\u001d\u001c\u000b\u0013\u0007\u0010\u0011\u0000\u0002", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 59).intern());
                return m2675(true, new int[]{Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 1, 0, 1}, "\u0001").intern();
            } catch (ClassNotFoundException unused2) {
                return m2676((byte) (TextUtils.indexOf("", "", 0) + 38), "\u0094", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1).intern();
            }
        }
    }
}
