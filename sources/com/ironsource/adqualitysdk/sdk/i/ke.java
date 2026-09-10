package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ke {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2970 = {1298932842, -197027055, -154054474, -1722665922, 1691398089, -1697114311, -2119410660, 446218433, 1646534289, -1454972747, 939164875, -358157251, -1949797401, 1228462036, -222053653, -702576149, 1634639611, 313094871};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2971 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2972 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2799(je jeVar) {
        f2971 = (f2972 + InterfaceC0435l1.d.b.f29110g) % 128;
        try {
            Executors.newSingleThreadExecutor().execute(jeVar);
            f2971 = (f2972 + 29) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2798(new int[]{-1741285904, 660927425, -712794376, 1145832806, -1770931323, -175753562, -1959853324, -418441781}, 14 - (Process.myPid() >> 22)).intern(), m2798(new int[]{-542025723, -667686862, -881736036, -2053683438, -711822109, 416775171, 144066113, -436687946, 2145477332, 1972944995, -645666537, 424064798, -322878268, -2001697437}, 26 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static long m2801() {
        int i10 = f2971 + 75;
        f2972 = i10 % 128;
        if (i10 % 2 != 0) {
            return SystemClock.elapsedRealtime();
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static long m2803() {
        f2971 = (f2972 + InterfaceC0435l1.d.b.f29114k) % 128;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        f2971 = (f2972 + 117) % 128;
        return timeInMillis;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static String m2802(String str, String str2, String str3, String str4) {
        long j10;
        StringBuilder sb2 = new StringBuilder();
        try {
            byte[] bArrDecode = Base64.decode(str.getBytes(), 0);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrDecode, 16, bArrDecode.length);
            CipherInputStream cipherInputStream = null;
            try {
                try {
                    byte[] bArrM2800 = m2800(str3);
                    byte[] bArrM2801 = m2800(str4);
                    Cipher cipher = Cipher.getInstance(m2798(new int[]{-1904640887, -705878660, 1710637146, -1851038016, -1744514775, -1511434791, -1574810071, -1742076708, 694747787, 2057375358}, 19 - MotionEvent.axisFromString("")).intern());
                    j10 = 0;
                    try {
                        cipher.init(2, SecretKeyFactory.getInstance(m2798(new int[]{-195066566, -239840403, -813214249, 1638068003, 1185316008, 1607033847, 114492642, -1735155539, -197664743, 2002463640, 1930175855, -2146906819, -1327934211, -864082381, -1244886519, 945454306, -1073934743, 790946583}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 33).intern(), m2798(new int[]{136514483, -1491044487}, Color.rgb(0, 0, 0) + 16777218).intern()).generateSecret(new PBEKeySpec(str2.toCharArray(), bArrM2801, 1, NotificationCompat.FLAG_LOCAL_ONLY)), new IvParameterSpec(bArrM2800, 0, cipher.getBlockSize()));
                        CipherInputStream cipherInputStream2 = new CipherInputStream(new ByteArrayInputStream(bArrCopyOfRange), cipher);
                        try {
                            m2798(new int[]{309446709, -2104063863, 1180120298, -1428751427}, ((byte) KeyEvent.getModifierMetaStateMask()) + 6).intern();
                            byte[] bArr = new byte[Segment.SIZE];
                            f2972 = (f2971 + InterfaceC0435l1.d.b.f29109f) % 128;
                            for (int i10 = cipherInputStream2.read(bArr); i10 >= 0; i10 = cipherInputStream2.read(bArr)) {
                                sb2.append(new String(bArr, 0, i10, m2798(new int[]{309446709, -2104063863, 1180120298, -1428751427}, 5 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()));
                            }
                            cipherInputStream2.close();
                        } catch (Throwable th2) {
                            th = th2;
                            cipherInputStream = cipherInputStream2;
                            try {
                                kl.m2899(m2798(new int[]{-1741285904, 660927425, -712794376, 1145832806, -1770931323, -175753562, -1959853324, -418441781}, TextUtils.getCapsMode("", 0, 0) + 14).intern(), m2798(new int[]{-542025723, -667686862, 515626856, -458820034, -102960410, 2097236593, 1224864703, 2037582614, 1499294343, 1794142653, 252450785, 986846070}, 23 - View.MeasureSpec.getMode(0)).intern(), th, false);
                                if (cipherInputStream != null) {
                                    cipherInputStream.close();
                                }
                                return sb2.toString();
                            } catch (Throwable th3) {
                                if (cipherInputStream != null) {
                                    cipherInputStream.close();
                                    f2972 = (f2971 + 9) % 128;
                                }
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    th = th4;
                                    kl.m2899(m2798(new int[]{-1741285904, 660927425, -712794376, 1145832806, -1770931323, -175753562, -1959853324, -418441781}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 14).intern(), m2798(new int[]{-542025723, -667686862, -1389060666, 1748052398, 847770438, 1408397921, 1648637605, 577938728, -428534360, -956830845, 31772042, 447817512, 878055630, 1978096207}, (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)) + 26).intern(), th, false);
                                    return sb2.toString();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    j10 = 0;
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable th7) {
            th = th7;
            j10 = 0;
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List m2804(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        if (list2 != null) {
            int i10 = f2972 + 1;
            f2971 = i10 % 128;
            if (i10 % 2 != 0) {
                hashSet.addAll(list2);
                throw null;
            }
            hashSet.addAll(list2);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int i11 = f2971 + 57;
        f2972 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2800(String str) {
        int length;
        byte[] bArr;
        int i10;
        int i11 = f2972 + 117;
        f2971 = i11 % 128;
        if (i11 % 2 != 0) {
            length = str.length();
            bArr = new byte[length >> 3];
            i10 = 1;
        } else {
            length = str.length();
            bArr = new byte[length / 2];
            i10 = 0;
        }
        f2971 = (f2972 + 55) % 128;
        while (i10 < length) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
            i10 += 2;
        }
        int i12 = f2972 + 11;
        f2971 = i12 % 128;
        if (i12 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2798(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2970.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
