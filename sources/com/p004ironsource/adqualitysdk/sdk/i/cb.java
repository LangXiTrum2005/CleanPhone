package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ogury.sdk.Ogury;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cb extends bg {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1173 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1174;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1179 = {AbstractJsonLexerKt.COLON, 'n', 'e', 'f', 'V', 'R', 'k', 'n', 'o', 'o', 'n', 'v', 'q', 'l', 'N', 'O', 'q', 'k', 'l', 'j', 'd', 'f', 'I', 'K', 'k', 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'M', ';', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'k', 'r', 's', 'n', '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', 's', 'r', 'k', 'l', 'q', AbstractJsonLexerKt.BEGIN_LIST, '<', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'V', 'f', 'e', 'n', 'n', 'n', 's', 'r', 'k', 'l', 'q', AbstractJsonLexerKt.BEGIN_LIST, 'Y', '_', '0', 'j', 'l', 'k', 'a', 'Z', 'f', ')', '\\', 'f', 'd', 'j', 'l', 'k', 'a', AbstractJsonLexerKt.END_LIST, 'g', '7', 'Y', 'S', 'R', 'T', 'h', 'g', 'j', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', 'b', 'a', 'k', 'l', 'j', 'd', 'f', 'W', AbstractJsonLexerKt.BEGIN_LIST, '5', 'o', 'l', 'l', '^', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'W', 'R', 'f', 'l', 'g', 'a', 'b', '9', 'l', 'l', 'a', '_', 'r', 'n', 'k', 'b', '_', 'f', 'd', 'j', 'Y', 'R', 'f', 'l', 'g', 'a', 'b', 'g', '0'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1175 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1177 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1178 = 97;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1176 = {202, 208, 143, 209, 211, 198, 212, 194, 200, 207, 213, 205, 214, 170, 162, 196, 215, 218, 176, 177, 164, 195, 204, 183, 197, 179, 216, 206, 142, 199, 201, 165, 174};

    public cb(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Presage m1391() {
        int i2 = f1174 + 65;
        f1173 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1392();
        }
        m1392();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Presage m1392() {
        int i2 = f1174 + 51;
        f1173 = i2 % 128;
        if (i2 % 2 == 0) {
            Presage.getInstance();
            throw null;
        }
        Presage presage = Presage.getInstance();
        f1174 = (f1173 + 117) % 128;
        return presage;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1394(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1174 = (f1173 + 95) % 128;
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        f1173 = (f1174 + 61) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1396(PresageInterstitial presageInterstitial, PresageInterstitialCallback presageInterstitialCallback) {
        f1173 = (f1174 + 99) % 128;
        m1394(presageInterstitial, presageInterstitialCallback);
        f1173 = (f1174 + 83) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1398(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i2 = f1173 + 9;
        f1174 = i2 % 128;
        int i3 = i2 % 2;
        m1397(presageOptinVideo, presageOptinVideoCallback);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f1173 + 27;
        f1174 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1393(false, new int[]{111, 18, 0, 6}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cb.m1391();
            }
        });
        map.put(m1393(false, new int[]{129, 23, 0, 1}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cb.m1396((PresageInterstitial) list.get(0), (PresageInterstitialCallback) list.get(1));
                return null;
            }
        });
        map.put(m1393(false, new int[]{152, 21, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cb.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cb.m1398((PresageOptinVideo) list.get(0), (PresageOptinVideoCallback) list.get(1));
                return null;
            }
        });
        int i2 = f1174 + 117;
        f1173 = i2 % 128;
        if (i2 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = f1174 + 105;
        f1173 = i2 % 128;
        if (i2 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        byte b2 = 12;
        switch (str.hashCode()) {
            case -2101347995:
                if (!str.equals(m1393(true, new int[]{103, 8, 0, 4}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                }
                break;
            case -1907784110:
                if (!str.equals(m1395(null, null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0082\u0086\u0099\u0081\u0098\u008a\u0081\u008b\u0084\u0093\u0086\u0089\u0088\u0087\u0086\u0085\u0094").intern())) {
                    b2 = -1;
                } else {
                    f1174 = (f1173 + 33) % 128;
                    b2 = 9;
                }
                break;
            case -1704786309:
                if (!str.equals(m1393(true, new int[]{44, 20, 0, 20}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1173 + 87;
                    f1174 = i3 % 128;
                    b2 = i3 % 2 == 0 ? (byte) 1 : (byte) 0;
                }
                break;
            case -938422005:
                if (!str.equals(m1393(true, new int[]{93, 10, 0, 8}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    f1173 = (f1174 + 83) % 128;
                    b2 = 6;
                }
                break;
            case -610604286:
                b2 = !str.equals(m1395(null, null, (Process.myPid() >> 22) + 127, "\u009c\u0086\u008b\u008e\u0099\u0085\u0088\u009b\u0086\u009a").intern()) ? (byte) -1 : (byte) 11;
                break;
            case -126768170:
                if (!str.equals(m1393(false, new int[]{0, 44, 0, 12}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    f1174 = (f1173 + 95) % 128;
                }
                break;
            case 76142724:
                b2 = !str.equals(m1395(null, null, Drawable.resolveOpacity(0, 0) + 127, "\u0092\u0085\u008d\u0089\u0093").intern()) ? (byte) -1 : (byte) 4;
                break;
            case 698887547:
                b2 = !str.equals(m1395(null, null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u008c\u0088\u0081\u008b\u0081\u008b\u0087\u0085\u0086\u008b\u008a\u008e\u0086\u0089\u0088\u0087\u0086\u0085\u0094").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 1067648736:
                b2 = !str.equals(m1395(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0097\u0090\u0088\u0096\u008c\u008c\u0088\u0095\u008c\u0088\u0081\u008b\u0081\u008b\u0087\u0085\u0086\u008b\u008a\u008e\u0086\u0089\u0088\u0087\u0086\u0085\u0094").intern()) ? (byte) -1 : (byte) 8;
                break;
            case 1346371759:
                b2 = 5;
                if (!str.equals(m1393(true, new int[]{86, 7, 0, 5}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0000").intern())) {
                    b2 = -1;
                }
                break;
            case 1871097647:
                if (!str.equals(m1393(true, new int[]{64, 22, 0, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000").intern())) {
                    b2 = -1;
                } else {
                    int i4 = (f1174 + 77) % 128;
                    f1173 = i4;
                    f1174 = (i4 + 113) % 128;
                }
                break;
            case 2109755994:
                if (!str.equals(m1395(null, null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "\u0092\u008b\u0081\u0091\u0081\u008b\u0090\u008f\u008c\u0088\u0081\u008b\u0081\u008b\u0087\u0085\u0086\u008b\u008a\u008e\u0083\u0081\u008d\u0083\u008c\u0088\u0081\u008b\u0081\u008b\u0087\u0085\u0086\u008b\u008a\u0081\u0083\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1173 + 43;
                    f1174 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 2 : (byte) 3;
                }
                break;
            case 2128976055:
                if (!str.equals(m1395(null, null, 127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0097\u0090\u0088\u0096\u008c\u008c\u0088\u0095\u0082\u0086\u0099\u0081\u0098\u008a\u0081\u008b\u0084\u0093\u0086\u0089\u0088\u0087\u0086\u0085\u0094").intern())) {
                    b2 = -1;
                } else {
                    f1173 = (f1174 + 43) % 128;
                    b2 = 10;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
            case 3:
                return io.presage.interstitial.ui.InterstitialActivity.class;
            case 4:
                return Ogury.class;
            case 5:
                int i6 = f1174 + 49;
                f1173 = i6 % 128;
                if (i6 % 2 != 0) {
                    return Presage.class;
                }
                throw null;
            case 6:
                return PresageSdk.class;
            case 7:
                return PresageInterstitial.class;
            case 8:
                return PresageInterstitialCallback.class;
            case 9:
                return PresageOptinVideo.class;
            case 10:
                return PresageOptinVideoCallback.class;
            case 11:
                return RewardItem.class;
            case 12:
                return AdConfig.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1393(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1179, i2, cArr, 0, i3);
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

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    public final String mo793() {
        f1173 = (f1174 + 7) % 128;
        try {
            try {
                String str = (String) Class.forName(m1395(null, null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, "\u0085\u0093\u0099\u008b\u008a\u0082¡\u0087\u0096\u008d\u0082 \u008b\u008d\u0088\u009f\u008d\u0099\u008a\u0081\u0085\u0086\u009f\u0090\u0088\u0098\u0083\u009e\u0081\u0083\u008a\u0082\u009c\u009c\u0082\u0090\u0083\u0086\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()).getMethod(m1393(false, new int[]{TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 1, 0, 1}, "\u0001").intern(), new Class[0]).invoke(null, new Object[0]);
                f1173 = (f1174 + 51) % 128;
                return str;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            return PresageSdk.getAdsSdkVersion();
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1174 = (f1173 + 77) % 128;
        String strMo793 = mo793();
        if (strMo793 == null) {
            return null;
        }
        int i2 = f1174 + 39;
        f1173 = i2 % 128;
        return i2 % 2 == 0 ? strMo793.split(m1395(null, null, (-16777089) >> Color.rgb(0, 1, 1), "\u009d").intern())[0] : strMo793.split(m1395(null, null, (-16777089) - Color.rgb(0, 0, 0), "\u009d").intern())[0];
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1397(PresageOptinVideo presageOptinVideo, PresageOptinVideoCallback presageOptinVideoCallback) {
        int i2 = f1173 + 99;
        f1174 = i2 % 128;
        int i3 = i2 % 2;
        presageOptinVideo.setOptinVideoCallback(presageOptinVideoCallback);
        if (i3 != 0) {
            throw null;
        }
        f1174 = (f1173 + 61) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1395(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1176;
                int i3 = f1178;
                if (f1177) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1175) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
