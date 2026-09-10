package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.InterfaceC0435l1;
import com.qq.e.ads.ADActivity;
import com.qq.e.ads.DialogActivity;
import com.qq.e.ads.LandscapeADActivity;
import com.qq.e.ads.LiteAbstractAD;
import com.qq.e.ads.PortraitADActivity;
import com.qq.e.ads.RewardvideoLandscapeADActivity;
import com.qq.e.ads.RewardvideoPortraitADActivity;
import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.ads.banner2.UnifiedBannerView;
import com.qq.e.ads.interstitial2.UnifiedInterstitialAD;
import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.ads.rewardvideo.RewardVideoAD;
import com.qq.e.ads.rewardvideo.RewardVideoADListener;
import com.qq.e.comm.adevent.ADEvent;
import com.qq.e.comm.adevent.ADListener;
import com.qq.e.comm.constants.LoadAdParams;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.IGDTAdManager;
import com.qq.e.comm.managers.status.APPStatus;
import com.qq.e.comm.managers.status.SDKStatus;
import com.qq.e.comm.pi.ACTD;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf extends be {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1244 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1245 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f1246 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1251 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1253 = 20;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f1254 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1252 = {'[', 'X', 'h', 'U', 'x', 'g', 127, 'w', 131, 129, 'B', 133, 'y', 'u', 135, '}', 128, '{', 136, 138, 141, 'd', 134, 'i', 130, 'z', ']', 'f', 139, 'j', '`', 'V', 'Y', 132, 'W', 'v', 'a', 140};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1250 = -1598564796;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1248 = WebSocketProtocol.PAYLOAD_SHORT;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1249 = 508274539;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f1247 = {-116, 65, 71, 47, 73, 49, 77, 94, 57, Utf8.REPLACEMENT_BYTE, -103, -114, -108, 124, -106, 126, -102, -85, -122, -116, -100, 68, -104, -116, -68, 82, -64, 70, -119, -52, 74, -121, -107, -112, -82, -76, -100, -74, -98, -70, -53, -125, -95, -84, -76, -95, -50, -107, -124, -118, 114, -116, 116, -112, -95, 124, -126, 91, 116, -114, 125, 111, -114, 117, -116, -108, -94, 59, 65, 41, 67, 43, 71, 88, 51, 57, 18, 43, 69, 52, 38, 69, 44, 67, 75, 84, -15, 69, 57, 105, -1, 109, -13, 54, 121, -9, 52, 66, -96, 14, 20, -4, 22, -2, 26, 43, 6, 12, -27, -2, 24, 7, -7, 24, -1, 22, 30, -26, 19, 10, 4, -4, 27, -5, 26, -13, 27, 28, -83, -116, -110, 122, -108, 124, -104, -87, -124, -118, 99, 124, -106, -123, 119, -106, 125, -108, -100, 100, -111, -120, -126, 122, -103, 121, -104, 113, -103, -102, -85, 66, -106, -118, -70, 80, -66, 68, -121, -54, 72, -123, -109, -97, 110, 116, 92, 118, 94, 122, -117, 102, 108, 54, 116, 113, 88, 103, 107, 108, -120, 74, 115, 106, 100, 92, 123, 91, 122, 83, 123, 124, -84, 110, 116, 92, 118, 94, 122, -117, 102, 108, 54, 116, 113, 88, 103, 107, 108, -120, 74, 115, 106, 100, 92, 123, 91, 122, 83, 123, 124, -115, 36, 120, 108, -100, 50, -96, 38, 105, -84, 42, 103, 117, -97, 36, 14, 32, 8, 24, 33, 52, 31, 26, -20, 34, 15, 12, 34, 12, 24, 24, 36, 8, 29, 60, -4, 22, 19, 26, 20, 18, 48, -113, 71, 22, 78, 69, Utf8.REPLACEMENT_BYTE, 87, 54, 54, 85, 46, 86, 87, -114, 51, 57, 28, 62, 62, 25, 80, 10, 48, 31, 80, -109, -42, -64, -41, -88, -47, -69, -60, -47, -29, -94, -61, -64, -57, -63, -65, -35, -117, -77, -74, -56, -94, -42, -72, -75, -60};

    public cf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static IGDTAdManager m1493() {
        int i10 = f1245 + InterfaceC0435l1.d.b.f29114k;
        f1244 = i10 % 128;
        if (i10 % 2 == 0) {
            GDTAdSdk.getGDTAdManger();
            throw null;
        }
        IGDTAdManager gDTAdManger = GDTAdSdk.getGDTAdManger();
        f1245 = (f1244 + 63) % 128;
        return gDTAdManger;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ IGDTAdManager m1494() {
        f1244 = (f1245 + 69) % 128;
        IGDTAdManager iGDTAdManagerM1493 = m1493();
        int i10 = f1244 + InterfaceC0435l1.d.b.f29105b;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return iGDTAdManagerM1493;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1495(APPStatus aPPStatus) {
        f1244 = (f1245 + 73) % 128;
        String strM1500 = m1500(aPPStatus);
        f1245 = (f1244 + 63) % 128;
        return strM1500;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int m1498(RewardVideoAD rewardVideoAD) {
        int i10 = f1244 + InterfaceC0435l1.d.b.f29109f;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return rewardVideoAD.getRewardAdType();
        }
        rewardVideoAD.getRewardAdType();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m1501(RewardVideoAD rewardVideoAD) {
        int i10 = f1244 + 39;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1506(rewardVideoAD);
        }
        m1506(rewardVideoAD);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m1502(RewardVideoAD rewardVideoAD) {
        int i10 = f1244 + 21;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1498(rewardVideoAD);
        }
        m1498(rewardVideoAD);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m1505(LiteAbstractAD liteAbstractAD) {
        f1244 = (f1245 + 19) % 128;
        Map<String, Object> mapM1496 = m1496(liteAbstractAD);
        f1244 = (f1245 + 117) % 128;
        return mapM1496;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1499(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1252;
                int i11 = f1253;
                if (f1254) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1251) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Map m1503(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i10 = f1244 + 37;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1497(unifiedInterstitialAD);
        }
        m1497(unifiedInterstitialAD);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, String> m1506(RewardVideoAD rewardVideoAD) {
        int i10 = f1245 + 95;
        f1244 = i10 % 128;
        if (i10 % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1244 = (f1245 + 49) % 128;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        f1244 = (f1245 + 99) % 128;
        return integrationSDKVersion;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10;
        int i10 = f1244 + 17;
        f1245 = i10 % 128;
        if (i10 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -1950656211:
                if (!str.equals(m1504((short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 127), (-508274463) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-126) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1598564843 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) Color.red(0)).intern())) {
                    b10 = -1;
                } else {
                    f1245 = (f1244 + 63) % 128;
                    b10 = 5;
                }
                break;
            case -1537668511:
                b10 = !str.equals(m1499(null, Color.red(0) + 127, null, "\u0082\u0084\u0091\u008e\u0090\u0093\u0090\u0093\u008f\u0097\u008d\u0093\u0099\u009b\u0085\u008d\u0090\u009a\u0090\u0099\u0098").intern()) ? (byte) -1 : (byte) 13;
                break;
            case -1192770783:
                if (!str.equals(m1504((short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 9), (-508274457) - KeyEvent.keyCodeFromString(""), (-128) - ImageFormat.getBitsPerPixel(0), 1581787678 - Color.rgb(0, 0, 0), (byte) View.getDefaultSize(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1245 + 125;
                    f1244 = i11 % 128;
                    b10 = i11 % 2 != 0 ? (byte) 9 : (byte) 23;
                }
                break;
            case -1125491209:
                if (!str.equals(m1499(null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, "\u0097\u008d\u0099\u008d\u0093\u008f\u0090\u009f\u0082\u0084").intern())) {
                    b10 = -1;
                } else {
                    f1245 = (f1244 + 57) % 128;
                    b10 = 25;
                }
                break;
            case -1040623465:
                if (!str.equals(m1504((short) ((ViewConfiguration.getEdgeSlop() >> 16) + 87), (-508274472) - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) - 127, 1598564829 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    f1245 = (f1244 + 59) % 128;
                    b10 = 3;
                }
                break;
            case -839956733:
                b10 = !str.equals(m1504((short) (Gravity.getAbsoluteGravity(0, 0) + 60), View.combineMeasuredStates(0, 0) - 508274454, ExpandableListView.getPackedPositionGroup(0L) - 127, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1598565091, (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern()) ? (byte) -1 : (byte) 18;
                break;
            case -570955421:
                b10 = !str.equals(m1499(null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, "\u0097\u008d\u0099\u008d\u0093\u008f\u0090\u009f\u0082\u0084\u0089\u008d\u0085\u0090\u009e\u0085\u0097\u008e\u009d\u008d\u009c").intern()) ? (byte) -1 : (byte) 16;
                break;
            case -427681737:
                b10 = !str.equals(m1499(null, 127 - Color.red(0), null, "\u0093\u0099\u008d\u0094¡\u0082\u0084").intern()) ? (byte) -1 : (byte) 20;
                break;
            case -358530385:
                if (!str.equals(m1504((short) ((ViewConfiguration.getEdgeSlop() >> 16) - 45), (ViewConfiguration.getScrollBarSize() >> 8) - 508274463, (-128) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1598565080 - ExpandableListView.getPackedPositionType(0L), (byte) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1245 + 99;
                    f1244 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 17 : (byte) 116;
                }
                break;
            case -311779863:
                if (!str.equals(m1504((short) ((KeyEvent.getMaxKeyCode() >> 16) + 121), (ViewConfiguration.getEdgeSlop() >> 16) - 508274440, (-127) - KeyEvent.keyCodeFromString(""), 1598564925 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                    b10 = -1;
                } else {
                    f1244 = (f1245 + 87) % 128;
                }
                break;
            case -301299368:
                b10 = !str.equals(m1499(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0097\u008d\u0093¢\u008e\u0085\u0084\u0097\u008d\u0099\u008d\u0093\u008f\u0090\u009f\u0082\u0084").intern()) ? (byte) -1 : (byte) 22;
                break;
            case -287046183:
                if (!str.equals(m1504((short) (Color.rgb(0, 0, 0) + 16777111), (-508274456) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-127) - Color.argb(0, 0, 0, 0), 1598564967 - ExpandableListView.getPackedPositionGroup(0L), (byte) (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1245 + 39;
                    f1244 = i13 % 128;
                    b10 = i13 % 2 != 0 ? (byte) 11 : (byte) 10;
                }
                break;
            case -207731435:
                b10 = !str.equals(m1499(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0095\u0093\u0090\u0094\u0090\u0093\u0088\u0084\u0082\u0084\u0093\u0090\u008e\u0097\u0093\u0097\u0089\u0096\u008b\u008f\u0085\u008e\u008b\u008d\u008b\u008c\u008c\u008b\u008a\u0089\u0088").intern()) ? (byte) -1 : (byte) 8;
                break;
            case 2003474:
                if (!str.equals(m1499(null, 127 - Color.alpha(0), null, "\u0082\u0083£\u0084").intern())) {
                    b10 = -1;
                } else {
                    f1244 = (f1245 + 91) % 128;
                }
                break;
            case 167349330:
                b10 = !str.equals(m1504((short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 60), View.resolveSizeAndState(0, 0, 0) - 508274474, (-127) - View.resolveSizeAndState(0, 0, 0), Color.green(0) + 1598564796, (byte) Color.green(0)).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 555831221:
                b10 = !str.equals(m1499(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u0097\u008d\u0099\u008d\u0093\u008f\u0090\u009f\u0082\u0084\u0097\u008d\u0099\u0099\u008e \u0085\u008d\u0090\u009a\u0090\u0099\u0098").intern()) ? (byte) -1 : (byte) 19;
                break;
            case 796884557:
                b10 = !str.equals(m1499(null, 126 - MotionEvent.axisFromString(""), null, "\u0095\u0093\u0090\u0094\u0090\u0093\u0088\u0084\u0082\u0084\u0093\u0090\u008e\u0097\u0093\u0097\u0089\u0096").intern()) ? (byte) -1 : (byte) 7;
                break;
            case 814717722:
                b10 = !str.equals(m1504((short) (ExpandableListView.getPackedPositionType(0L) + 119), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 508274441, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 127, 1598564806 - TextUtils.indexOf("", "", 0), (byte) View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 937653587:
                b10 = !str.equals(m1504((short) (Color.rgb(0, 0, 0) + 16777291), (-508274474) - (Process.myTid() >> 22), (-127) - (ViewConfiguration.getTouchSlop() >> 8), 1598565110 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 21;
                break;
            case 1265986405:
                b10 = !str.equals(m1504((short) (View.resolveSize(0, 0) - 54), (-508274440) - View.getDefaultSize(0, 0), (-126) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 1598564862, (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1305853839:
                b10 = !str.equals(m1504((short) (View.MeasureSpec.makeMeasureSpec(0, 0) - 68), (-508274456) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) - 127, 1598565067 - Color.argb(0, 0, 0, 0), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 1336889139:
                b10 = !str.equals(m1499(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0082\u0084\u0093\u0088\u008e\u0097\u0093\u008f¤\u0084\u008d\u0093\u0090\u009f").intern()) ? (byte) -1 : (byte) 24;
                break;
            case 1773421109:
                b10 = !str.equals(m1504((short) ((KeyEvent.getMaxKeyCode() >> 16) - 23), (-508274454) - Color.alpha(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 128, 1598565038 - View.resolveSize(0, 0), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1874129984:
                b10 = !str.equals(m1499(null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, null, "\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern()) ? (byte) -1 : (byte) 0;
                break;
            case 1958130193:
                b10 = !str.equals(m1504((short) ((-105) - TextUtils.indexOf("", "", 0)), Color.rgb(0, 0, 0) - 491497224, TextUtils.indexOf((CharSequence) "", '0') - 126, (ViewConfiguration.getTouchSlop() >> 8) + 1598564996, (byte) ExpandableListView.getPackedPositionType(0L)).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 2111488863:
                if (!str.equals(m1499(null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0095\u0093\u0090\u0094\u0090\u0093\u0088\u0084\u0092\u0089\u0091\u008e\u0090\u0082\u008b\u008f\u0085\u008e\u008b\u008d\u008b\u008c\u008c\u008b\u008a\u0089\u0088").intern())) {
                    b10 = -1;
                } else {
                    f1245 = (f1244 + 13) % 128;
                    b10 = 4;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return GDTAdSdk.class;
            case 1:
            case 2:
                return ADActivity.class;
            case 3:
            case 4:
                return DialogActivity.class;
            case 5:
            case 6:
                return LandscapeADActivity.class;
            case 7:
            case 8:
                return PortraitADActivity.class;
            case 9:
            case 10:
                return RewardvideoLandscapeADActivity.class;
            case 11:
            case 12:
                return RewardvideoPortraitADActivity.class;
            case 13:
                return UnifiedInterstitialAD.class;
            case 14:
                return UnifiedInterstitialADListener.class;
            case 15:
                return RewardVideoAD.class;
            case 16:
                return RewardVideoADListener.class;
            case 17:
                return LoadAdParams.class;
            case 18:
                return UnifiedBannerView.class;
            case 19:
                return UnifiedBannerADListener.class;
            case 20:
                return ADEvent.class;
            case 21:
                return APPStatus.class;
            case 22:
                return RewardVideoAD.ADListenerAdapter.class;
            case 23:
                return ACTD.class;
            case 24:
                return LiteAbstractAD.class;
            case 25:
                return ADListener.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map<String, Object> m1496(LiteAbstractAD liteAbstractAD) {
        int i10 = f1244 + 63;
        f1245 = i10 % 128;
        if (i10 % 2 != 0) {
            liteAbstractAD.getExtraInfo();
            throw null;
        }
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        int i11 = f1244 + 95;
        f1245 = i11 % 128;
        if (i11 % 2 == 0) {
            return extraInfo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1504(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1248;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1247;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1250 + i12] + i13);
                    } else {
                        i14 = (short) (f1246[f1250 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1250 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1249);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1247;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1246;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1499(null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0097\u008d\u0092\u0099\u008e¥\u0085\u0084\u0083\u0082\u0081\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cf.m1494();
            }
        });
        map.put(m1499(null, View.combineMeasuredStates(0, 0) + 127, null, "\u0085\u009b¢¢\u0084\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cf.m1495((APPStatus) list.get(0));
            }
        });
        map.put(m1499(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0089\u009a\u0099\u009b\u008e\u0097\u0093¦¡\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cf.m1505((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m1499(null, TextUtils.indexOf((CharSequence) "", '0') + 128, null, "\u008d¢\u0095\u0083\u0085\u0084\u0085\u0097\u008e\u009d\u008d\u009c\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Integer.valueOf(cf.m1502((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m1499(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u008f\u0093¦¡\u0085\u008d\u0085\u0097\u008e\u009d\u008d\u009c\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cf.m1501((RewardVideoAD) list.get(0));
            }
        });
        map.put(m1499(null, (Process.myPid() >> 22) + 127, null, "\u0093¦¡\u0091\u008e\u0090\u0093\u0090\u0093\u008f\u0097\u008d\u0093\u0099\u009b\u0093\u008d\u0092").intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return cf.m1503((UnifiedInterstitialAD) list.get(0));
            }
        });
        f1245 = (f1244 + 29) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Map m1497(UnifiedInterstitialAD unifiedInterstitialAD) {
        int i10 = f1244 + 93;
        f1245 = i10 % 128;
        if (i10 % 2 == 0) {
            return unifiedInterstitialAD.getExt();
        }
        unifiedInterstitialAD.getExt();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1500(APPStatus aPPStatus) {
        int i10 = f1245 + 91;
        f1244 = i10 % 128;
        if (i10 % 2 != 0) {
            return aPPStatus.getAPPID();
        }
        aPPStatus.getAPPID();
        throw null;
    }
}
