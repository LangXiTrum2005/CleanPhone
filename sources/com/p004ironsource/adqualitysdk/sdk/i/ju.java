package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public class ju {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2784 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2785 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2786 = -1197894392;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2787 = 38;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2788 = -1116802513;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2789 = {-21, -17, 25, -13, 48, -23, -25, 17, -25, 0, -56, 1, -49, 84, -66, 65, -8, 17, 89, 89, -86, -66, -19, 21, 85, -87, 89, 83, -66, 82, 65, -65, -23, 2, -81, 81, -84, -127, 35, -33, -33, -38, -39, -53, -63, 56, -54, 34, 33, -5, 54, -37, 37, -50, 6, -44, -34, 5, -4, -7, -11, 9, -3, -34, 22, -3, 3, -22, 38, -14, -8, 17, -9, -5, -16, -3, -1, 18, 10, -15, -16, 13, 11, -7, 8, -9, 14, -18, -1, 14, 33, -44, 56, 45, 32, -17, 19, -31, -24, 23, 69, -81, -17, 19, -29, 18, -31, 17, 25, -24, 23, 82, -72, 21, -21, 22, 59, 110, -99, 109, 39, -54, 98, -111, 97, 105, -104, 103, 34, -33, -97, 99, -109, 117, -102, -107, 105, 37, -56, 101, -101, 102, 75, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f2790;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2663(it itVar) {
        int i2 = f2785 + 77;
        f2784 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Executors.newSingleThreadExecutor().execute(itVar);
                throw null;
            }
            Executors.newSingleThreadExecutor().execute(itVar);
            f2784 = (f2785 + 59) % 128;
        } catch (Throwable th) {
            kb.m2752(m2667((byte) (Color.alpha(0) - 20), (short) Color.red(0), TextUtils.indexOf((CharSequence) "", '0', 0) - 23, TextUtils.indexOf((CharSequence) "", '0', 0) + 1197894393, 1116802578 - View.MeasureSpec.getSize(0)).intern(), m2667((byte) ((-85) - ImageFormat.getBitsPerPixel(0)), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), (-13) - TextUtils.lastIndexOf("", '0', 0, 0), 1197894405 - TextUtils.getCapsMode("", 0, 0), 1116802581 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), th, false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m2665() {
        f2784 = (f2785 + 93) % 128;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f2784 = (f2785 + 95) % 128;
        return jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static long m2666() {
        f2784 = (f2785 + 59) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f2785 = (f2784 + 111) % 128;
        return timeInMillis;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m2669(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            f2785 = (f2784 + 77) % 128;
            hashSet.addAll(list2);
            f2785 = (f2784 + 35) % 128;
        }
        return new ArrayList(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01da A[Catch: all -> 0x025b, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x025b, blocks: (B:19:0x015c, B:35:0x01da), top: B:65:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x026a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x026b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.io.InputStream, javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2668(String str, String str2, String str3, String str4) throws Throwable {
        int i2;
        int i3;
        Throwable th;
        String string;
        int i4;
        ?? cipherInputStream;
        StringBuilder sb = new StringBuilder();
        long j = 0;
        try {
            try {
                byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
                try {
                    byte[] bArrM2664 = m2664(str3);
                    byte[] bArrM2665 = m2664(str4);
                    i2 = 1116802582;
                    try {
                        i3 = 1116802578;
                        try {
                            th = null;
                            try {
                                Cipher cipher = Cipher.getInstance(m2667((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 38), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") - 18, TextUtils.lastIndexOf("", '0') + 1197894431, Color.rgb(0, 0, 0) + 1133579794).intern());
                                j = 0;
                                try {
                                    cipher.init(2, SecretKeyFactory.getInstance(m2667((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 4), (short) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0') - 3, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1197894450, 1116802593 - Color.green(0)).intern(), m2667((byte) (32 - View.MeasureSpec.getSize(0)), (short) TextUtils.indexOf("", ""), (-36) - (ViewConfiguration.getTouchSlop() >> 8), 1197894481 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1116802578).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), bArrM2665, 1, 256)), new IvParameterSpec(bArrM2664, 0, cipher.getBlockSize()));
                                    cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArrCopyOfRange), cipher);
                                    try {
                                        m2667((byte) ((-16777249) - Color.rgb(0, 0, 0)), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (-33) - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.rgb(0, 0, 0) + 1214671699, (KeyEvent.getMaxKeyCode() >> 16) + 1116802598).intern();
                                        byte[] bArr = new byte[Segment.SIZE];
                                        for (int i5 = cipherInputStream.read(bArr); i5 >= 0; i5 = cipherInputStream.read(bArr)) {
                                            sb.append(new String(bArr, 0, i5, m2667((byte) ((-33) - TextUtils.getTrimmedLength("")), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 32, TextUtils.lastIndexOf("", '0') + 1197894484, 1116802597 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()));
                                        }
                                        cipherInputStream.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            kb.m2752(m2667((byte) ((-21) - ExpandableListView.getPackedPositionChild(j)), (short) View.getDefaultSize(0, 0), (-23) - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1197894393, 1116802579 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern(), m2667((byte) (22 - Drawable.resolveOpacity(0, 0)), (short) KeyEvent.getDeadChar(0, 0), View.getDefaultSize(0, 0) - 15, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1197894487, TextUtils.getTrimmedLength("") + i2).intern(), th, false);
                                            if (cipherInputStream != 0) {
                                                cipherInputStream.close();
                                                f2785 = (f2784 + 109) % 128;
                                            }
                                            string = sb.toString();
                                            i4 = f2785 + 115;
                                            f2784 = i4 % 128;
                                            if (i4 % 2 != 0) {
                                                return string;
                                            }
                                            throw th;
                                        } catch (Throwable th3) {
                                            if (cipherInputStream != 0) {
                                                try {
                                                    cipherInputStream.close();
                                                } catch (Throwable unused) {
                                                }
                                            }
                                            try {
                                                throw th3;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                kb.m2752(m2667((byte) (ImageFormat.getBitsPerPixel(0) - 19), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 24, 1197894392 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + i3).intern(), m2667((byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 102), (short) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), (-11) - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1197894510, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + i2).intern(), th, false);
                                                string = sb.toString();
                                                i4 = f2785 + 115;
                                                f2784 = i4 % 128;
                                                if (i4 % 2 != 0) {
                                                    return string;
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    cipherInputStream = th;
                                    kb.m2752(m2667((byte) ((-21) - ExpandableListView.getPackedPositionChild(j)), (short) View.getDefaultSize(0, 0), (-23) - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1197894393, 1116802579 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern(), m2667((byte) (22 - Drawable.resolveOpacity(0, 0)), (short) KeyEvent.getDeadChar(0, 0), View.getDefaultSize(0, 0) - 15, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1197894487, TextUtils.getTrimmedLength("") + i2).intern(), th, false);
                                    if (cipherInputStream != 0) {
                                        cipherInputStream.close();
                                        f2785 = (f2784 + 109) % 128;
                                    }
                                    string = sb.toString();
                                    i4 = f2785 + 115;
                                    f2784 = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        return string;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j = 0;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            j = 0;
                            th = null;
                            cipherInputStream = th;
                            kb.m2752(m2667((byte) ((-21) - ExpandableListView.getPackedPositionChild(j)), (short) View.getDefaultSize(0, 0), (-23) - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1197894393, 1116802579 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern(), m2667((byte) (22 - Drawable.resolveOpacity(0, 0)), (short) KeyEvent.getDeadChar(0, 0), View.getDefaultSize(0, 0) - 15, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1197894487, TextUtils.getTrimmedLength("") + i2).intern(), th, false);
                            if (cipherInputStream != 0) {
                                cipherInputStream.close();
                                f2785 = (f2784 + 109) % 128;
                            }
                            string = sb.toString();
                            i4 = f2785 + 115;
                            f2784 = i4 % 128;
                            if (i4 % 2 != 0) {
                                return string;
                            }
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        i3 = 1116802578;
                        th = null;
                        cipherInputStream = th;
                        kb.m2752(m2667((byte) ((-21) - ExpandableListView.getPackedPositionChild(j)), (short) View.getDefaultSize(0, 0), (-23) - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1197894393, 1116802579 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern(), m2667((byte) (22 - Drawable.resolveOpacity(0, 0)), (short) KeyEvent.getDeadChar(0, 0), View.getDefaultSize(0, 0) - 15, (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1197894487, TextUtils.getTrimmedLength("") + i2).intern(), th, false);
                        if (cipherInputStream != 0) {
                            cipherInputStream.close();
                            f2785 = (f2784 + 109) % 128;
                        }
                        string = sb.toString();
                        i4 = f2785 + 115;
                        f2784 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return string;
                        }
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i2 = 1116802582;
                }
            } catch (Throwable th10) {
                th = th10;
                j = 0;
                i2 = 1116802582;
                i3 = 1116802578;
                th = null;
            }
        } catch (Throwable unused2) {
        }
        string = sb.toString();
        i4 = f2785 + 115;
        f2784 = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2664(String str) {
        f2784 = (f2785 + 67) % 128;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i2 = 0;
        while (i2 < length) {
            f2784 = (f2785 + 77) % 128;
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
            i2 += 2;
            f2784 = (f2785 + 15) % 128;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2667(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2787;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2789;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f2786 + i3] + i5);
                    } else {
                        i6 = (short) (f2790[f2786 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2786 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2788);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2789;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2790;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }
}
