package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ogury.sdk.Ogury;
import io.presage.Presage;
import io.presage.common.AdConfig;
import io.presage.common.PresageSdk;
import io.presage.common.network.models.RewardItem;
import io.presage.interstitial.InterstitialActivity;
import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import io.presage.interstitial.optinvideo.PresageOptinVideo;
import io.presage.interstitial.optinvideo.PresageOptinVideoCallback;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ca extends be {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1156 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1157 = 6;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1158 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1159 = {'i', 'o', '.', 'p', 'r', 'e', 's', 'a', 'g', 'n', 't', 'l', 'I', 'A', 'c', 'v', 'y', 'u', 'U', 'P', 'R', 'w', 'd', 'm', 'C', 'f', 'b', 'k', 'O', 'V', '-', 'j', 'q', 'x', 'z', '{'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1155 = {'\'', '[', 'n', 's', 'u', 'k', 210, 198, 199, 209, 207, 213, 215, 214, 204, 'V', 166, 165, 174, 174, 174, 179, 178, 171, 172, 177, 155, 151, 166, 164, 170, 172, 171, 161, 'd', 180, 175, 195, 201, 196, 190, 191, 196, 186, 190, 200, 201, 199, 193, 195, 180, 184, 206, 201, 200, 207, 208, 203, 203, 203, 194, '2', 'Z', '_', 'r', 'n', 'k', 'b', '_', 'f', 'd', 'j', '_', 'a', 'k', 'l', 'j', 'd', ';', 136, 146, 147, 145, 139, 141, 129, 134, 153, 149, 146, 137, 134, 141, 139, 145, 128, 'y', 141, 147, 142, 136, 137, 142, '2', 'l', 'b', 'a', 'k', 'l', 'j', 'd', 'f', 'W', '[', 'p', 's', 'j', 'g', 'h', 'd', 'f', 277, 298, 314, 308, 309, 275, 313, 296, 315, 309, 266, 314, 315, 295, 302, 315, 298, 308, 303, 312, 299, 302, 297, 295, 284, 244, 300, 303, 244, 308, 309, 307, 307, 309, 297, 244, 299, 301, 295, 313, 299, 312, 310, 244, 309, 303, 312};

    public ca(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Presage m1368() {
        int i10 = f1156 + 1;
        f1158 = i10 % 128;
        if (i10 % 2 != 0) {
            return Presage.getInstance();
        }
        int i11 = 4 / 0;
        return Presage.getInstance();
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Presage m1369() {
        Presage presageM1368;
        int i10 = f1156 + 119;
        f1158 = i10 % 128;
        if (i10 % 2 == 0) {
            presageM1368 = m1368();
            int i11 = 29 / 0;
        } else {
            presageM1368 = m1368();
        }
        int i12 = f1156 + 41;
        f1158 = i12 % 128;
        if (i12 % 2 != 0) {
            return presageM1368;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1371(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1158 = (f1156 + 95) % 128;
        m1374(presageInterstitial, presageInterstitialCallback);
        int i10 = f1158 + 13;
        f1156 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1375(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1156 + 47;
        f1158 = i10 % 128;
        int i11 = i10 % 2;
        m1372(presageOptinVideo, presageOptinVideoCallback);
        if (i11 == 0) {
            int i12 = 86 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -2101347995:
                if (str.equals(m1370(8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0010\u0013\u0019\u0000\u0007\u001b\u0002\u0006", (byte) (KeyEvent.getDeadChar(0, 0) + 119)).intern())) {
                    return AdConfig.class;
                }
                return null;
            case -1907784110:
                if (str.equals(m1373("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{61, 17, 0, 11}, false).intern())) {
                    return PresageOptinVideo.class;
                }
                return null;
            case -1704786309:
                if (str.equals(m1370(19 - ImageFormat.getBitsPerPixel(0), "\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\b\u0006\u000e\u000f\u0006\u0004\f\u0003\u0010\u0016", (byte) (38 - Gravity.getAbsoluteGravity(0, 0))).intern())) {
                    return InterstitialActivity.class;
                }
                return null;
            case -938422005:
                if (!str.equals(m1373("\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{5, 10, 107, 0}, true).intern())) {
                    return null;
                }
                int i10 = f1158 + 67;
                f1156 = i10 % 128;
                if (i10 % 2 != 0) {
                    return null;
                }
                return PresageSdk.class;
            case -610604286:
                if (!str.equals(m1370(10 - Gravity.getAbsoluteGravity(0, 0), "\u0017\u0002\u0013\t\n\u001c\u0010\u0006\u000b\u001d", (byte) (52 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                    return null;
                }
                int i11 = f1158 + 47;
                f1156 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                return RewardItem.class;
            case -126768170:
                if (str.equals(m1370((ViewConfiguration.getLongPressTimeout() >> 16) + 44, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u000b\u0002\u0003\u0001\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\b\u0005\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\b\u0006\u000e\u000f\u0006\u0004\f\u0003\u0010\u0016", (byte) (TextUtils.getCapsMode("", 0, 0) + 18)).intern())) {
                    return InterstitialActivity.class;
                }
                return null;
            case 76142724:
                if (str.equals(m1373("\u0001\u0000\u0000\u0001\u0001", new int[]{0, 5, 0, 0}, false).intern())) {
                    return Ogury.class;
                }
                return null;
            case 698887547:
                if (str.equals(m1373("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", new int[]{15, 19, 64, 0}, true).intern())) {
                    return PresageInterstitial.class;
                }
                return null;
            case 1067648736:
                if (str.equals(m1373("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000", new int[]{34, 27, 93, 9}, false).intern())) {
                    return PresageInterstitialCallback.class;
                }
                return null;
            case 1346371759:
                if (str.equals(m1370(7 - TextUtils.getOffsetAfter("", 0), "\u0016\u0001\u0000\u000b\b\tw", (byte) (18 - ExpandableListView.getPackedPositionType(0L))).intern())) {
                    return Presage.class;
                }
                return null;
            case 1871097647:
                if (!str.equals(m1370(22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0018\u0006\u000f\u0006\u000b\u0004\u0000\n\u0006\u0004\u0006\u0004\b\u0006\u000e\u000f\u0006\u0004\f\u0003\u0010\u0016", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + InterfaceC0435l1.d.b.f29109f)).intern())) {
                    return null;
                }
                f1158 = (f1156 + 97) % 128;
                break;
                break;
            case 2109755994:
                if (!str.equals(m1370(47 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u000b\u0002\u0003\u0001\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\b\u0005\f\u0005\u0000\u000e\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0007\u0011\u0010\b\u0003\f\u0004\u0006Ö", (byte) (View.combineMeasuredStates(0, 0) + 93)).intern())) {
                    return null;
                }
                break;
            case 2128976055:
                if (str.equals(m1373("\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{78, 25, 39, 0}, false).intern())) {
                    return PresageOptinVideoCallback.class;
                }
                return null;
            default:
                return null;
        }
        f1158 = (f1156 + 117) % 128;
        return io.presage.interstitial.ui.InterstitialActivity.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1373("\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{InterfaceC0435l1.d.b.f29107d, 18, 0, 17}, false).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ca.m1369();
            }
        });
        map.put(m1370(24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u000b\u0000\u0006\u0010\n\u000b\u0000\u0005\u0007\u000b\u0004\u0006\u0001\u0006\u0006\u001d\b\u0006\b\u001d\b\r}", (byte) (17 - Process.getGidForName(""))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ca.m1371((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m1370(20 - ExpandableListView.getPackedPositionChild(0L), "\u000b\u0000\u0010\"\u0004\t\u0003\u0006\u0018\u0005\u0017\u0004\u0000\u0019\b\u0006\b\u001d\b\rn", (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 3)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ca.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ca.m1375((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        f1158 = (f1156 + 5) % 128;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1158 = (f1156 + 35) % 128;
        String strMo818 = mo818();
        if (strMo818 == null) {
            return null;
        }
        int i10 = f1158 + 33;
        f1156 = i10 % 128;
        return i10 % 2 != 0 ? strMo818.split(m1370((SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), RequestConfiguration.MAX_AD_CONTENT_RATING_T, (byte) (View.MeasureSpec.getMode(1) + 117)).intern())[1] : strMo818.split(m1370((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), RequestConfiguration.MAX_AD_CONTENT_RATING_T, (byte) (View.MeasureSpec.getMode(0) + 39)).intern())[0];
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻛ */
    public final String mo818() {
        f1158 = (f1156 + 99) % 128;
        try {
            try {
                String str = (String) Class.forName(m1373(null, new int[]{121, 47, 198, 46}, true).intern()).getMethod(m1370(-((byte) KeyEvent.getModifierMetaStateMask()), "v", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 22)).intern(), null).invoke(null, null);
                int i10 = f1158 + 27;
                f1156 = i10 % 128;
                if (i10 % 2 == 0) {
                    return str;
                }
                throw null;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1372(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i10 = f1156 + 45;
        f1158 = i10 % 128;
        int i11 = i10 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1374(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1158 = (f1156 + InterfaceC0435l1.d.b.f29110g) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        int i10 = f1156 + 45;
        f1158 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1370(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f1159;
                char c4 = f1157;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1373(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1155, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
