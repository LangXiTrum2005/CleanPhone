package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdSdkVersion;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bn extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f884 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f885 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f888 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f889 = 1487592247;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f890 = 94;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f892 = -1933573865;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f891 = {49, -77, -31, -78, -45, -94, 15, -23, 14, -17, 30, 14, -90, -6, -2, 46, -66, -23, -3, -8, -24, -1, -1, -26, 37, -68, -21, -7, Utf8.REPLACEMENT_BYTE, 19, 58, 15, 15, 16, 56, 17, 94, -15, 93, 2, 50, 7, 14, 15, 68, 87, -65, -111, -41, 100, 113, -41, 113, -35, -35, -39, 109, -30, -63, 26, 100, 22, 94, 14, 23, 10, 117, 48, Utf8.REPLACEMENT_BYTE, 23, 14, 104, 0, 95, 108, 14, 95, -2, 119, -1, 0, -93, -95, -7, -101, -13, -105, -56, -44, -17, -87, -18, -87, -99, -107, -1, -88, -13, -97, -22, -93, -3, -78, -103, 49, -99, -87, -71, -23, -22, -90, -101, -21, -88, -88, -15, -82, -25, -20, -102, 67, Utf8.REPLACEMENT_BYTE, 71, 49, 64, 39, 118, 61, 65, Utf8.REPLACEMENT_BYTE, 80, 31, 89, 72, 78, 62, 79, 85, 21, 37, -59, -62, 1, -42, -1, 18, -80, 40, -58, -58, 126, -110, 84, -86, 95, 84, 66, -124, -78, 84, -84, 78, 78, 73, -25, 74, -23, 58, 7, -10, 88, -16, 74, 74, 84, 78, 88, 80, 96, 89, 100, 55, -126, 35, 54, 84, 76, 114, 114, -124, 121, 106, 90, 127, 118, 50, -121, 81, -125, 96, -80, 49, 100, -126, 90, -128, -128, -127, 99, -7, -29, -8, -39, 40, -69, -27, -30, 51, -23, 0, -70, 13, 14, -33, 15, 9, 9, -38, 3, -61, 20, -27, -45, 9, -49, 7, -41, -50, -29, -16, -75, 19, -47, 6, 122, 116, -75, -107, -124, -105, 127, 122, -89, -100, 127, 112, -79, -104, 103, -62, -117, -123, -99, -125, -101, 127, 108, -72, -105, -115, -106, -115, -127, 121, -89, -116, -101, -121, -110, -117, -95, 90, -61, -127, -112, 30, 32, 110, 43, -111, -126, 19, -125, -115, -115, 30, 119, 55, -120, 25, -55, -80, -33, -49, -74, -69, -9, -50, -40, -54, -43, -91, -8, -23, -57, -49, -75, -75, -56, -22, -23, -45, -75, -40, -43, -55, -118, -65, 124, -37, 120, -74, -67, -109, -74, -116, -33, -35, 15, 7, 56, -26, -39, 45, 30, 43, 3, 8, 59, 38, 3, 18, 81, 42, -5, 74, 30, 19, 45, 5, 38, 49, 19, 38, 3, 62, 6, 5, 57, 48, 20, 31, 47, 22, 22, 45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f887 = {'A', 60869, 56067, 51335, 46821, 42069, 37298, 32514, 28026, 60128, 1892, 12710, 8752, 23639, 20203, 31509, 25846, 35186, 49081, 44093, 53824, 49382, 62740, 7102, 2522, 15980, 'A', 60869, 56082, 51343, 46821, 42054, 37283, 32522, 28013, 23239, 18494, 13759, 9205, 4445, 65195, 21762, 47236, 36477, 40397, 58301, 61725, 50425, 10821, 14391, 3979, 7520, 24780, 30342, 17410, 43977, 47437, 36648, 37518, 57468, 63446, 50618, 11020, 26347, 35709, 48524, 44603, 53327, 49912, 63258, 6586, 3047, 15481, 11927, 21303, 17754, 30677, 38931, 'A', 60884, 56102, 51338, 46817, 42059, 37285, 32514, 27974, 23244, 18494, 13724, 9187, 4447, 65189, 60462, 55923, 51141, 46395, 41605, 37117, 32321, 27567, 42104, 18934, 32512, 27836, 4804, 'v', 13745, 56117, 'C', 60872, 56112, 51328, 46833, 42057, 37287, 32533, 27992, 23259, 18469, 13708, 9214, 4424, 65213, 60444, 55878, 51160, 46391, 41604, 26630, 34180, 45931, 41160, 56994, 52269, 63998, 5954, 1315, 12935, 8291, 24000, 19381, 30995, 38601, 33860, 45620, 44954, 56703, 51932, 63660, 'g', 60868, 56118, 51379, 46824, 42052, 37285, 32514, 28005, 23244, 18468, 13727, 9157, 4425, 65160, 60445, 55935, 51164, 46355, 41623, 'g', 60868, 56118, 51362, 46833, 42049, 37295, 32514, 28006, 23242, 18479, 13733, 9193, 4441, 65209, 60416, 55906, 51162, 46355, 41616, 37088, 32348, 27552, 22814, 18284, 13504, 8716, 3986, 65017, 60234, 55434, 50694, 46160, 41380, 36649, 32102, 27357, 12095, 49800, 62586, 59366, 39334, 35613, 48879, 20569, 16951, 30097, 26479, 6867, 3233, 15885, 53699, 49991, 62736, 59540, 39533, 36299, 49085, 20759, 17663, 30281, 'g', 60868, 56118, 51367, 46845, 42059, 37287, 32522, 28001, 23242, 18438, 13700, 9197, 4425, 65195, 60445};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f886 = -5398969115034260063L;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e extends WeakHashMap<View, WeakReference<Object>> implements hj<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f902 = 1;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f903 = 186;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f904;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private ck f905;

        public e(WeakHashMap<View, WeakReference<Object>> weakHashMap, ck ckVar) {
            super(weakHashMap);
            this.f905 = ckVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m1018() {
            int i10 = f902 + 57;
            int i11 = i10 % 128;
            f904 = i11;
            if (i10 % 2 != 0) {
                throw null;
            }
            int i12 = i11 + 95;
            f902 = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m1019(int i10, boolean z10, int i11, String str, int i12) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (d.f1625) {
                try {
                    char[] cArr2 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i13 = d.f1622;
                        if (i13 >= i10) {
                            break;
                        }
                        d.f1624 = cArr[i13];
                        cArr2[d.f1622] = (char) (d.f1624 + i11);
                        int i14 = d.f1622;
                        cArr2[i14] = (char) (cArr2[i14] - f903);
                        d.f1622 = i14 + 1;
                    }
                    if (i12 > 0) {
                        d.f1623 = i12;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = d.f1623;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = d.f1623;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z10) {
                        char[] cArr4 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i17 = d.f1622;
                            if (i17 >= i10) {
                                break;
                            }
                            cArr4[i17] = cArr2[(i10 - i17) - 1];
                            d.f1622 = i17 + 1;
                        }
                        cArr2 = cArr4;
                    }
                    str2 = new String(cArr2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Object> m1020(View view, WeakReference<Object> weakReference) {
            f904 = (f902 + 17) % 128;
            bn.this.m823(this, this.f905, m1019((ViewConfiguration.getLongPressTimeout() >> 16) + 23, false, ExpandableListView.getPackedPositionType(0L) + 283, "\u0013￭\u0000\u0013\b\u0015\u0004￠\u0003\ufff6\u0004\u0000\n\uffe7\u0000\u0012\u0007￬\u0000\u000fￍ\u000f\u0014", (Process.myTid() >> 22) + 1).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            f904 = (f902 + 89) % 128;
            return weakReference2;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            int i10 = f904 + 71;
            f902 = i10 % 128;
            int i11 = i10 % 2;
            WeakReference<Object> weakReferenceM1020 = m1020((View) obj, (WeakReference) obj2);
            if (i11 == 0) {
                int i12 = 44 / 0;
            }
            return weakReferenceM1020;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.hj
        /* JADX INFO: renamed from: ﾒ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo800() {
            f902 = (f904 + InterfaceC0435l1.d.b.f29110g) % 128;
            WeakHashMap<View, WeakReference<Object>> weakHashMapM1018 = m1018();
            int i10 = f902 + InterfaceC0435l1.d.b.f29112i;
            f904 = i10 % 128;
            if (i10 % 2 == 0) {
                return weakHashMapM1018;
            }
            throw null;
        }
    }

    public bn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ DynamicLoader m998() {
        f884 = (f885 + 45) % 128;
        DynamicLoader dynamicLoaderM999 = m999();
        f885 = (f884 + 91) % 128;
        return dynamicLoaderM999;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static DynamicLoader m999() {
        int i10 = f885 + 23;
        f884 = i10 % 128;
        if (i10 % 2 != 0) {
            return DynamicLoaderFactory.getDynamicLoader();
        }
        DynamicLoaderFactory.getDynamicLoader();
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1000() {
        f885 = (f884 + 29) % 128;
        String strIntern = m1007((short) (View.combineMeasuredStates(0, 0) - 8), (-1487592129) - Color.alpha(0), (-87) - ((byte) KeyEvent.getModifierMetaStateMask()), 1933574201 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 33)).intern();
        int i10 = f885 + InterfaceC0435l1.d.b.f29107d;
        f884 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1001() {
        f885 = (f884 + 123) % 128;
        String strIntern = m1007((short) (93 - View.resolveSize(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 1487592145, TextUtils.getOffsetAfter("", 0) - 60, 1933574207 - ImageFormat.getBitsPerPixel(0), (byte) (View.MeasureSpec.getSize(0) + InterfaceC0435l1.d.b.f29114k)).intern();
        int i10 = f885 + 5;
        f884 = i10 % 128;
        if (i10 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1002() {
        int i10 = f885 + 55;
        f884 = i10 % 128;
        if (i10 % 2 == 0) {
            m1000();
            throw null;
        }
        String strM1000 = m1000();
        f884 = (f885 + 43) % 128;
        return strM1000;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1003() {
        int i10 = f884 + 25;
        f885 = i10 % 128;
        if (i10 % 2 != 0) {
            m1001();
            throw null;
        }
        String strM1001 = m1001();
        int i11 = f885 + 17;
        f884 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1001;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1006(AdView adView) {
        f885 = (f884 + 19) % 128;
        String strM1004 = m1004(adView);
        f884 = (f885 + 69) % 128;
        return strM1004;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ WeakHashMap m1012(bn bnVar, WeakHashMap weakHashMap, ck ckVar) {
        f885 = (f884 + 119) % 128;
        WeakHashMap<View, WeakReference<Object>> weakHashMapM1008 = bnVar.m1008((WeakHashMap<View, WeakReference<Object>>) weakHashMap, ckVar);
        f885 = (f884 + 117) % 128;
        return weakHashMapM1008;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ AdPlacementType m1015(AdAdapter adAdapter) {
        int i10 = f884 + 31;
        f885 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1005(adAdapter);
        }
        m1005(adAdapter);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f884 = (f885 + 85) % 128;
        try {
            try {
                try {
                    String str = (String) id.m2382().m2384().m2312(AdSdkVersion.class, String.class).get(null);
                    int i10 = f885 + 17;
                    f884 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return str;
                    }
                    throw null;
                } catch (Throwable unused) {
                    return (String) id.m2382().m2384().m2312(AdSdkVersion.class, String.class).get(null);
                }
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return id.m2382().m2383().m2493(BuildConfig.class, m1007((short) (91 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (-1487592153) - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 83, 1933574191 - Gravity.getAbsoluteGravity(0, 0), (byte) (24 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern());
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1009(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i10 = f884 + 45;
        f885 = i10 % 128;
        int i11 = i10 % 2;
        m1014(interstitialAd, interstitialAdListener);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1013(AdView adView, AdListener adListener) {
        f884 = (f885 + 67) % 128;
        m1017(adView, adListener);
        int i10 = f885 + 83;
        f884 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1016(Ad ad2) {
        int i10 = f884 + InterfaceC0435l1.d.b.f29109f;
        f885 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1011(ad2);
        }
        m1011(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdPlacementType m1005(AdAdapter adAdapter) {
        int i10 = f885 + 81;
        f884 = i10 % 128;
        if (i10 % 2 == 0) {
            adAdapter.getPlacementType();
            throw null;
        }
        AdPlacementType placementType = adAdapter.getPlacementType();
        f885 = (f884 + InterfaceC0435l1.d.b.f29112i) % 128;
        return placementType;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -2107186802:
                if (str.equals(m1007((short) ((Process.myTid() >> 22) - 83), (-1487592169) - KeyEvent.keyCodeFromString(""), (-77) - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1933574039 - View.resolveSizeAndState(0, 0, 0), (byte) (ExpandableListView.getPackedPositionType(0L) + 12)).intern())) {
                    return NativeAdListener.class;
                }
                return null;
            case -1585374524:
                if (str.equals(m1007((short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 67), (-1487592165) - TextUtils.getOffsetBefore("", 0), (-70) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1933573924 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (80 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                    return RewardedVideoAdListener.class;
                }
                return null;
            case -1513928064:
                if (!str.equals(m1007((short) ((-74) - KeyEvent.getDeadChar(0, 0)), (-1487592149) - Process.getGidForName(""), TextUtils.getOffsetAfter("", 0) - 54, Color.argb(0, 0, 0, 0) + 1933573946, (byte) (92 - KeyEvent.keyCodeFromString(""))).intern())) {
                    return null;
                }
                int i10 = f884 + 95;
                f885 = i10 % 128;
                if (i10 % 2 != 0) {
                    return InterstitialAdListener.class;
                }
                return AudienceNetworkActivity.class;
            case -1256969519:
                if (!str.equals(m1010((char) Color.red(0), ExpandableListView.getPackedPositionType(0L) + InterfaceC0435l1.d.b.f29110g, (-16777196) - Color.rgb(0, 0, 0)).intern())) {
                    return null;
                }
                int i11 = f885 + 7;
                f884 = i11 % 128;
                if (i11 % 2 != 0) {
                    return CircularProgressView.class;
                }
                throw null;
            case -501313640:
                if (!str.equals(m1007((short) (TextUtils.lastIndexOf("", '0', 0, 0) - 70), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1487592179, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 74, ExpandableListView.getPackedPositionGroup(0L) + 1933573985, (byte) ((-5) - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern())) {
                    return null;
                }
                int i12 = f884 + 57;
                f885 = i12 % 128;
                if (i12 % 2 != 0) {
                    return null;
                }
                return DynamicLoaderFactory.class;
            case -498709917:
                if (!str.equals(m1010((char) (Color.blue(0) + 21835), (Process.myTid() >> 22) + 41, 22 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return null;
                }
                f884 = (f885 + 27) % 128;
                return InterstitialAdListener.class;
            case -105717264:
                if (!str.equals(m1010((char) (TextUtils.getOffsetBefore("", 0) + 26297), KeyEvent.getDeadChar(0, 0) + 63, 15 - View.getDefaultSize(0, 0)).intern())) {
                    return null;
                }
                int i13 = f884 + 33;
                f885 = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                return RewardedVideoAd.class;
            case 2115:
                if (!str.equals(m1007((short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 120), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1487592183, TextUtils.indexOf("", "", 0) - 92, 1933573865 - TextUtils.getTrimmedLength(""), (byte) ((-118) - TextUtils.indexOf("", ""))).intern())) {
                    return null;
                }
                f885 = (f884 + 29) % 128;
                return Ad.class;
            case 289409084:
                if (str.equals(m1010((char) ('0' - AndroidCharacter.getMirror('0')), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0) + 16).intern())) {
                    return AdPlacementType.class;
                }
                return null;
            case 320151695:
                if (str.equals(m1007((short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 37), (ViewConfiguration.getTouchSlop() >> 8) - 1487592174, Color.red(0) - 80, 1933573910 - TextUtils.lastIndexOf("", '0', 0), (byte) ((-72) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern())) {
                    return InterstitialAd.class;
                }
                return null;
            case 435867927:
                if (str.equals(m1010((char) (TextUtils.getOffsetBefore("", 0) + 26698), 130 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 21 - KeyEvent.keyCodeFromString("")).intern())) {
                    return an.m443();
                }
                return null;
            case 488344453:
                if (str.equals(m1010((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60065), 9 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTapTimeout() >> 16) + 7).intern())) {
                    return AdError.class;
                }
                return null;
            case 535330969:
                if (str.equals(m1010((char) View.MeasureSpec.makeMeasureSpec(0, 0), 78 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.red(0) + 23).intern())) {
                    return AudienceNetworkActivity.class;
                }
                return null;
            case 553704929:
                if (!str.equals(m1007((short) (TextUtils.indexOf("", "", 0, 0) + 90), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1487592179, (-75) - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1933573893, (byte) (TextUtils.indexOf((CharSequence) "", '0') - 107)).intern())) {
                    return null;
                }
                int i14 = f884 + 45;
                f885 = i14 % 128;
                if (i14 % 2 != 0) {
                    return null;
                }
                return DisplayAdController.class;
            case 1165508119:
                if (str.equals(m1010((char) (25783 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), 10 - Color.alpha(0)).intern())) {
                    return AdListener.class;
                }
                return null;
            case 1237162638:
                if (str.equals(m1007((short) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 114), Color.rgb(0, 0, 0) - 1470814947, KeyEvent.keyCodeFromString("") - 73, 1933574054 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (TextUtils.indexOf("", "") + 28)).intern())) {
                    return e.class;
                }
                return null;
            case 1476063628:
                if (str.equals(m1010((char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getOffsetAfter("", 0), 9 - Color.argb(0, 0, 0, 0)).intern())) {
                    return AdAdapter.class;
                }
                return null;
            case 1838933446:
                if (!str.equals(m1007((short) (127 - (Process.myPid() >> 22)), (-1487592168) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-80) - (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myTid() >> 22) + 1933574015, (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 34)).intern())) {
                    return null;
                }
                f884 = (f885 + 89) % 128;
                return NativeBannerAd.class;
            case 1908493505:
                if (str.equals(m1007((short) ((-116) - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf((CharSequence) "", '0', 0) - 1487592147, (-71) - TextUtils.indexOf("", "", 0, 0), 1933573871 - Color.alpha(0), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 119)).intern())) {
                    return AdView.class;
                }
                return null;
            case 1955913096:
                if (str.equals(m1007((short) (46 - TextUtils.getOffsetAfter("", 0)), ExpandableListView.getPackedPositionChild(0L) - 1487592181, (-89) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1933573865 - TextUtils.indexOf((CharSequence) "", '0'), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 14)).intern())) {
                    return AdView.class;
                }
                return null;
            case 2035065003:
                if (str.equals(m1007((short) ((-106) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1487592169, (-82) - (ViewConfiguration.getTouchSlop() >> 8), 1933574004 - ExpandableListView.getPackedPositionGroup(0L), (byte) (Drawable.resolveOpacity(0, 0) + 72)).intern())) {
                    return NativeAdBase.class;
                }
                return null;
            case 2035668095:
                if (str.equals(m1007((short) (95 - View.getDefaultSize(0, 0)), (-1487592169) - TextUtils.getOffsetBefore("", 0), (-82) - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 1933574028, (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 70)).intern())) {
                    return NativeAdView.class;
                }
                return null;
            case 2110329530:
                if (str.equals(m1010((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42037), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + InterfaceC0435l1.d.b.f29105b, 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    return NativeAd.class;
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1007((short) ((-117) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-1487592144) - Color.argb(0, 0, 0, 0), (-70) - TextUtils.indexOf("", "", 0, 0), 1933574074 - View.MeasureSpec.getMode(0), (byte) (MotionEvent.axisFromString("") - 110)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1006((AdView) list.get(0));
            }
        });
        map.put(m1010((char) (ViewConfiguration.getTapTimeout() >> 16), 151 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.alpha(0) + 20).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1016((Ad) list.get(0));
            }
        });
        map.put(m1007((short) ((-109) - ExpandableListView.getPackedPositionType(0L)), (-1487592131) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-81) - (ViewConfiguration.getEdgeSlop() >> 16), 1933574097 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (106 - TextUtils.lastIndexOf("", '0', 0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bn.m1013((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m1010((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 170 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0') + 38).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1002();
            }
        });
        map.put(m1007((short) ((ViewConfiguration.getTapTimeout() >> 16) - 16), (ViewConfiguration.getScrollBarSize() >> 8) - 1487592144, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 53, 1933574108 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (126 - (Process.myPid() >> 22))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1003();
            }
        });
        map.put(m1010((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12108), 208 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 24).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bn.m1009((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1010((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 230 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m998();
            }
        });
        map.put(m1007((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 83), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1487592144, ((byte) KeyEvent.getModifierMetaStateMask()) - 77, 1933574149 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 58)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1015((AdAdapter) list.get(0));
            }
        });
        map.put(m1007((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 80), (-1487592149) - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSizeAndState(0, 0, 0) - 67, 1933574165 - Color.green(0), (byte) (118 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bn.m1012(bn.this, (WeakHashMap) list.get(0), ckVar);
            }
        });
        f884 = (f885 + 61) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private WeakHashMap<View, WeakReference<Object>> m1008(WeakHashMap<View, WeakReference<Object>> weakHashMap, ck ckVar) {
        e eVar = new e(weakHashMap, ckVar);
        int i10 = f884 + InterfaceC0435l1.d.b.f29105b;
        f885 = i10 % 128;
        if (i10 % 2 == 0) {
            return eVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1007(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f890;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f891;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f892 + i12] + i13);
                    } else {
                        i14 = (short) (f888[f892 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f892 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f889);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f891;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f888;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1004(AdView adView) {
        int i10 = f884 + 11;
        f885 = i10 % 128;
        int i11 = i10 % 2;
        String placementId = adView.getPlacementId();
        if (i11 != 0) {
            int i12 = 20 / 0;
        }
        f885 = (f884 + 75) % 128;
        return placementId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1017(AdView adView, AdListener adListener) {
        int i10 = f885 + 79;
        f884 = i10 % 128;
        int i11 = i10 % 2;
        adView.setAdListener(adListener);
        if (i11 == 0) {
            int i12 = 78 / 0;
        }
        f884 = (f885 + InterfaceC0435l1.d.b.f29105b) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1011(Ad ad2) {
        f884 = (f885 + 13) % 128;
        String placementId = ad2.getPlacementId();
        f885 = (f884 + 61) % 128;
        return placementId;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1014(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        f885 = (f884 + 49) % 128;
        interstitialAd.setAdListener(interstitialAdListener);
        int i10 = f885 + 67;
        f884 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1010(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f887[i10 + i12]) ^ (((long) i12) * f886)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
