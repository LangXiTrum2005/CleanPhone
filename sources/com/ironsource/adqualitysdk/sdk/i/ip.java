package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.unity3d.services.UnityAdsConstants;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ip {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2522 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f2523 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f2524 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f2525 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2526 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2527;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2528;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f2529;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static byte[] f2530;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2531;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2532;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2533;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Cipher f2534;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private SecretKey f2535;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Cipher f2536;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d extends Exception {
        public d(String str) {
            super(str);
        }
    }

    static {
        m2533();
        f2533 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        f2526 = (f2522 + 59) % 128;
    }

    public ip(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m2532((short) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) - 13482430, (-97) - Drawable.resolveOpacity(0, 0), (-2105418398) - View.resolveSize(0, 0), (byte) TextUtils.getCapsMode("", 0, 0)).intern());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb2.toString().toCharArray(), bArr, 1024, NotificationCompat.FLAG_LOCAL_ONLY)).getEncoded();
        } catch (GeneralSecurityException unused) {
            iq.m2538(m2531("辪娓陱簱к\uf6b8起◯覆旡⸾恺\ue28d쟢謦אּ䇔⓾ᠡ洌", 19 - Color.green(0)).intern(), m2531("က鷾©\uffdd⛞偏⣻؆脅좧鐂쾔甆싴赏턿疚㝀퇹癊鐾딒聜獹悃惕挩瓂챱\u0c4f\ue510楎奆뼳挙ﴮ甆싴먝ꝝ⦣笊\uf075뺛\ud995ᯙ\ue6c5峾䞤蝡泞ꐌၑ糙ᬧ姪㔷䜬ⶾჩ", Color.blue(0) + 59).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m2531("ᝇ鷒싮䍨", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4).intern());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                sb3.append(str3);
                for (char c4 : sb3.toString().toCharArray()) {
                    messageDigest.update((byte) c4);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(m2531("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", ((Process.getThreadPriority(0) + 20) >> 6) + 19).intern(), e10);
            }
        }
        this.f2535 = new SecretKeySpec(bArrDigest, m2532((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-13482445) - ExpandableListView.getPackedPositionType(0L), Color.green(0) - 123, (-2105418370) - TextUtils.indexOf("", "", 0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern());
        m2530();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2530() {
        try {
            Cipher cipher = Cipher.getInstance(m2531("起◯ё\udd62㨬劉\uf198혱린뜊稜ꁪ螃ꧯ\ueb7f￥⦣笊頰ꋻ", Color.red(0) + 20).intern());
            this.f2536 = cipher;
            SecretKey secretKey = this.f2535;
            byte[] bArr = f2533;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m2531("起◯ё\udd62㨬劉\uf198혱린뜊稜ꁪ螃ꧯ\ueb7f￥⦣笊頰ꋻ", View.getDefaultSize(0, 0) + 20).intern());
            this.f2534 = cipher2;
            cipher2.init(2, this.f2535, new IvParameterSpec(bArr));
            int i10 = f2526 + 119;
            f2522 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(m2532((short) (Process.myPid() >> 22), TextUtils.indexOf("", "", 0) - 13482437, TextUtils.lastIndexOf("", '0', 0) - 104, (-2105418369) - TextUtils.lastIndexOf("", '0'), (byte) View.resolveSizeAndState(0, 0, 0)).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2533() {
        f2532 = 2105418398;
        f2528 = WebSocketProtocol.PAYLOAD_SHORT;
        f2531 = 13482510;
        f2530 = new byte[]{1, 21, -22, 1, -1, 22, -38, 14, 4, -19, 11, 7, 12, 1, 3, -18, -10, 13, 0, -7, -11, 11, -12, 11, -14, 18, 3, -14, 14, 4, 18, -84, 6, 9, -8, -1, -1, -3, 9, -13, 8, 9, 69, -68, -5, -3, 11, -21, 8, 37, 75, 4, -69, 3, -5, 19, -2, -16, -2, 15, 4, 19, -4, 14, 4, 19, -62, 3, -11, -1, 71, -57, -7, 5, -3, 0, 3, 7, 52, -51, -11, -1, -2, 0, -4, 69, -63, -2, 12, 17, -80, 20, -6, 75, -82, 3, 79, -65, -19, 19, -3, 68, -68, -5, -3, 11, -21, 8, 5, 65, 8, -68, -10, -7, 6, 9, 70, -84, 5, 1, 78, -82, 13, 1, 3, -4, 29, 0, 0, 0, 0, 0};
        f2524 = (char) 52663;
        f2523 = (char) 42307;
        f2525 = (char) 55432;
        f2527 = (char) 2643;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m2535(String str) {
        f2522 = (f2526 + 35) % 128;
        if (TextUtils.isEmpty(str)) {
            int i10 = f2526 + 7;
            f2522 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 50 / 0;
            }
            return str;
        }
        try {
            try {
                Cipher cipher = this.f2536;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2532((short) View.MeasureSpec.getMode(0), (-13482411) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") - 86, (-2105418347) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                sb2.append(str);
                return il.m2521(cipher.doFinal(sb2.toString().getBytes(m2531("힌帆𣏕몈\ude7c靋", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5).intern())));
            } catch (GeneralSecurityException e10) {
                m2530();
                throw new RuntimeException(m2531("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", 19 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), e10);
            }
        } catch (UnsupportedEncodingException e11) {
            m2530();
            throw new RuntimeException(m2531("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", 19 - TextUtils.getTrimmedLength("")).intern(), e11);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2532(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2528;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2530;
                    i14 = bArr != null ? (byte) (bArr[f2532 + i12] + i13) : (short) (f2529[f2532 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2532 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2531);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2530;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2529;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m2534(String str) throws d {
        f2526 = (f2522 + 55) % 128;
        if (TextUtils.isEmpty(str)) {
            int i10 = f2522 + 49;
            f2526 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 87 / 0;
            }
            return null;
        }
        try {
            try {
                try {
                    try {
                        String str2 = new String(this.f2534.doFinal(il.m2519(str)), m2531("힌帆𣏕몈\ude7c靋", 4 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                        if (str2.indexOf(m2532((short) (ViewConfiguration.getWindowTouchSlop() >> 8), (-13482411) - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetBefore("", 0) - 86, (-2105418348) - Drawable.resolveOpacity(0, 0), (byte) (ViewConfiguration.getEdgeSlop() >> 16)).intern()) == 0) {
                            return str2.substring(m2532((short) (ViewConfiguration.getTapTimeout() >> 16), (-13482412) - TextUtils.indexOf((CharSequence) "", '0'), (-86) - Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 2105418348, (byte) Color.red(0)).intern().length(), str2.length());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2532((short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-13482438) - (ViewConfiguration.getTouchSlop() >> 8), (-87) - (ViewConfiguration.getTapTimeout() >> 16), (-2105418309) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
                        sb2.append(str);
                        throw new d(sb2.toString());
                    } catch (UnsupportedEncodingException e10) {
                        throw new RuntimeException(m2531("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", TextUtils.indexOf("", "") + 19).intern(), e10);
                    }
                } catch (in e11) {
                    m2530();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(e11.getMessage());
                    sb3.append(m2531("Ď係", 1 - ExpandableListView.getPackedPositionType(0L)).intern());
                    sb3.append(str);
                    throw new d(sb3.toString());
                }
            } catch (BadPaddingException e12) {
                m2530();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e12.getMessage());
                sb4.append(m2531("Ď係", -TextUtils.lastIndexOf("", '0')).intern());
                sb4.append(str);
                throw new d(sb4.toString());
            }
        } catch (IllegalBlockSizeException e13) {
            m2530();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(e13.getMessage());
            sb5.append(m2531("Ď係", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
            sb5.append(str);
            throw new d(sb5.toString());
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2531(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2524)) ^ ((c5 >>> 5) + f2525)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2523) ^ ((c10 + i12) ^ ((c10 << 4) + f2527))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
