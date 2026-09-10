package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Cif {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2367 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2368 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2369 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2370;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2371;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Cipher f2372;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private SecretKey f2373;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Cipher f2374;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if$c */
    public class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    static {
        m2406();
        f2371 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i2 = f2368 + 111;
        f2369 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public Cif(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m2404(new int[]{1280114910, 1420891292, -1865340549, 502981028, -1252897821, -1563289652, -1538229356, -2018333098, -6739012, 207910317, -955188114, -1785488789, 1684180172, -520588770, -792884385, 365993992}, 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            ij.m2435(m2404(new int[]{-797859919, 29006907, -364579138, -599361732, -767105784, 962955254, 1878500287, 324931926, -1807945289, -1529637017}, Color.red(0) + 19).intern(), m2404(new int[]{-1158636369, -682445850, -1986295584, -651027725, -124578501, -1963469623, 414187190, -1644409252, 929283396, 742870093, -1709360850, 2061825394, -1482378200, -108856390, -1852403290, 2091529383, 1509637337, -1427421085, -1467314460, -65279691, 1824829871, 1079424286, -865738892, -1352773047, 432177559, -845127875, 1814619009, 702209289, 1288234021, -1424151640}, 59 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m2404(new int[]{-93192216, 220965352}, (Process.myPid() >> 22) + 3).intern());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                sb2.append(str3);
                for (char c2 : sb2.toString().toCharArray()) {
                    messageDigest.update((byte) c2);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(m2404(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 18 - MotionEvent.axisFromString("")).intern(), e2);
            }
        }
        this.f2373 = new SecretKeySpec(bArrDigest, m2405(View.resolveSizeAndState(0, 0, 0) + 2, 3 - TextUtils.getCapsMode("", 0, 0), 239 - TextUtils.getTrimmedLength(""), "�\u000b\ufff9", false).intern());
        m2407();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2404(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2370.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2405(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f2367);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2406() {
        f2370 = new int[]{-1896214613, 2127242605, -1536685129, -1657588159, -976414816, 1732588032, 161688155, -1403771074, -354302858, -217287067, -1657287664, -1068741588, 2096767000, -258481901, 867071361, 2066291674, 7280096, 1165247082};
        f2367 = 167;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2407() {
        try {
            Cipher cipher = Cipher.getInstance(m2405((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (KeyEvent.getMaxKeyCode() >> 16) + 20, TextUtils.indexOf((CharSequence) "", '0') + 246, "\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b\u0016\u0016\u0013", true).intern());
            this.f2374 = cipher;
            SecretKey secretKey = this.f2373;
            byte[] bArr = f2371;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m2405(((Process.getThreadPriority(0) + 20) >> 6) + 14, 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 245, "\u0002\uffe7\u0005\ufff5�\u0002￡\ufff5\ufff4\ufff5￡\u0005\ufff7\ufff3\u0019 \u001b\u0016\u0016\u0013", true).intern());
            this.f2372 = cipher2;
            cipher2.init(2, this.f2373, new IvParameterSpec(bArr));
            int i2 = f2369 + 15;
            f2368 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException(m2405(TextUtils.indexOf((CharSequence) "", '0', 0) + 19, 21 - (ViewConfiguration.getScrollBarSize() >> 8), 263 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0001\f\t\u0004\uffc0\u0005\u000e\u0016\t\u0012\u000f\u000e\r\u0005\u000e\u0014\uffc0ￒ￩\u000e\u0016", false).intern(), e2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized String m2408(String str) {
        int i2 = f2369 + 53;
        f2368 = i2 % 128;
        if (i2 % 2 != 0) {
            TextUtils.isEmpty(str);
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            int i3 = f2368 + 15;
            f2369 = i3 % 128;
            if (i3 % 2 != 0) {
                return str;
            }
            throw null;
        }
        try {
            try {
                Cipher cipher = this.f2374;
                StringBuilder sb = new StringBuilder();
                sb.append(m2404(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, Color.red(0) + 40).intern());
                sb.append(str);
                String strM2397 = ic.m2397(cipher.doFinal(sb.toString().getBytes(m2404(new int[]{905371306, -2106664431, 388150726, 1685793678}, Color.alpha(0) + 5).intern())));
                int i4 = f2369 + 85;
                f2368 = i4 % 128;
                if (i4 % 2 == 0) {
                    return strM2397;
                }
                throw null;
            } catch (UnsupportedEncodingException e2) {
                m2407();
                throw new RuntimeException(m2404(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 20 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), e2);
            }
        } catch (GeneralSecurityException e3) {
            m2407();
            throw new RuntimeException(m2404(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, 19 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), e3);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m2409(String str) throws c {
        f2369 = (f2368 + 71) % 128;
        if (TextUtils.isEmpty(str)) {
            f2369 = (f2368 + 19) % 128;
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f2372.doFinal(ic.m2391(str)), m2404(new int[]{905371306, -2106664431, 388150726, 1685793678}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5).intern());
                    if (str2.indexOf(m2404(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, 40 - KeyEvent.normalizeMetaState(0)).intern()) == 0) {
                        String strSubstring = str2.substring(m2404(new int[]{2043117472, 641829778, 1990519235, 684905461, 1388929520, 1753104975, 490006985, 1687842971, 2063337078, -877454261, 1613003732, -293300188, -602252618, -1656518620, 1631285525, 1667316604, -1089604707, -1486799041, 1363312622, 1630588962}, 40 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern().length(), str2.length());
                        f2368 = (f2369 + 63) % 128;
                        return strSubstring;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2404(new int[]{-842891615, 1282063807, -588598648, 61924727, -163463065, 878720347, -1129801317, 1149510841, -821243647, -1077460302, -725633011, 217000206, -1602328741, 1399756679, 81061204, 867510742, 953822853, 1329108673, 1153541259, 1732155424}, 38 - TextUtils.lastIndexOf("", '0', 0)).intern());
                    sb.append(str);
                    throw new c(sb.toString());
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(m2404(new int[]{-702031709, -1014692929, 175812535, -2117623434, 1368231396, 650266192, -1695395992, -1593879238, 1261838370, 910808940}, View.getDefaultSize(0, 0) + 19).intern(), e2);
                } catch (BadPaddingException e3) {
                    m2407();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e3.getMessage());
                    sb2.append(m2405((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, TextUtils.getCapsMode("", 0, 0) + 1, 226 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u0000", false).intern());
                    sb2.append(str);
                    throw new c(sb2.toString());
                }
            } catch (ie e4) {
                m2407();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e4.getMessage());
                sb3.append(m2405(Color.argb(0, 0, 0, 0) + 1, TextUtils.indexOf("", "", 0, 0) + 1, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "\u0000", false).intern());
                sb3.append(str);
                throw new c(sb3.toString());
            }
        } catch (IllegalBlockSizeException e5) {
            m2407();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(e5.getMessage());
            sb4.append(m2405(1 - View.MeasureSpec.getMode(0), -ImageFormat.getBitsPerPixel(0), 226 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0000", false).intern());
            sb4.append(str);
            throw new c(sb4.toString());
        }
    }
}
