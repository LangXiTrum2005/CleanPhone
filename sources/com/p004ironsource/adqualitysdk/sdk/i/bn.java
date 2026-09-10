package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class bn extends bg {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f883 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f884 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f885 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f886 = 376809258;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f888 = -326310726;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f889 = 50;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f887 = {-7, 24, -28, 17, 26, -24, 54, -56, 54, 83, -67, 82, -77, 98, 82, -6, 78, 66, 114, -126, -67, 65, 76, -68, 67, 67, -70, 121, -128, -65, 77, -59, -57, 21, -48, 54, 57, -56, 56, 50, 50, -59, 44, -36, 19, -15, 11, -11, 13, -3, -10, -31, 20, -33, 46, -10, -3, 7, -17, 14, 3, -3, 14, -19, 22, -18, -17, -108, 101, -67, -74, 76, -92, 69, 72, -74, 69, -90, 93, -91, -92, -56, -58, 62, -64, 56, -36, -17, 27, 52, -50, 53, -50, -62, -38, 36, -49, 56, -60, 49, -56, 34, -7, -34, 118, -62, -50, -2, 14, 49, -51, -64, 48, -49, -49, 54, -11, 12, 51, -63, 114, -98, 92, -90, 81, 92, 78, -116, -66, 92, -92, 66, 66, 66, -72, 70, -66, 78, 69, 82, -89, 108, -109, -96, 66, -70, 92, 92, 73, -89, 72, -72, 91, 85, -88, 80, -93, -90, 121, -123, 74, -82, -84, 73, -86, 82, 125, 71, 92, -83, -67, 90, 81, -107, 66, -76, 70, -69, 107, -108, -89, 69, -67, 91, 91, 68, -90, -87, 71, -88, 73, -104, 111, 69, 70, -105, 89, -96, 110, -67, -78, 67, -77, -71, -71, 78, -89, 103, -76, 69, -35, 42, 0, 3, -46, 28, -27, 43, -8, -9, 6, -10, -4, -4, 11, -30, 34, -15, 0, -69, 65, -65, 71, -73, -68, -85, 94, -107, 99, -67, 91, -67, 67, -73, -73, -69, 71, -80, -109, 99, -71, 68, 110, 98, 96, -111, 64, -118, -103, -97, 111, -112, -106, 86, -77, 108, -99, 21, 23, -59, 61, -14, 28, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int[] f882 = {-430698963, -2003236910, -2029704512, 1951320306, -1215273134, 196410576, 649184828, -1146103415, 1169575746, -1044387006, -1033512969, 439963913, 1979789364, 1515421723, -1870450121, 1762292628, -1169026890, 1037321564};

    public bn(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ DynamicLoader m967() {
        int i2 = f883 + 115;
        f884 = i2 % 128;
        if (i2 % 2 != 0) {
            return m970();
        }
        m970();
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m968() {
        f883 = (f884 + 43) % 128;
        String strIntern = m975((byte) ((-32) - View.MeasureSpec.getMode(0)), (short) View.resolveSizeAndState(0, 0, 0), (-42) - ((Process.getThreadPriority(0) + 20) >> 6), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 376808991, 326310844 - View.combineMeasuredStates(0, 0)).intern();
        f883 = (f884 + 17) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m969() {
        f883 = (f884 + 117) % 128;
        String strIntern = m977(new int[]{1207198177, 625223037, -552261088, 1662369656, 468022935, -2056893454, -1948063090, -1876406516, -1333808309, 969285805, -1368876728, -628603570, -18120543, 158410549, -802175160, 400720799, 1263160242, 1604999795}, 34 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern();
        f884 = (f883 + 111) % 128;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static DynamicLoader m970() {
        int i2 = f883 + 31;
        f884 = i2 % 128;
        if (i2 % 2 != 0) {
            return DynamicLoaderFactory.getDynamicLoader();
        }
        int i3 = 99 / 0;
        return DynamicLoaderFactory.getDynamicLoader();
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m971() {
        int i2 = f884 + 99;
        f883 = i2 % 128;
        if (i2 % 2 == 0) {
            return m968();
        }
        m968();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m972() {
        f884 = (f883 + 125) % 128;
        String strM969 = m969();
        int i2 = f883 + 81;
        f884 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM969;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ WeakHashMap m973(bn bnVar, WeakHashMap weakHashMap, ch chVar) {
        f883 = (f884 + 99) % 128;
        WeakHashMap<View, WeakReference<Object>> weakHashMapM981 = bnVar.m981(weakHashMap, chVar);
        f883 = (f884 + 41) % 128;
        return weakHashMapM981;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m978(AdView adView, AdListener adListener) {
        f883 = (f884 + 99) % 128;
        m974(adView, adListener);
        f883 = (f884 + 31) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdPlacementType m979(AdAdapter adAdapter) {
        int i2 = f883 + 99;
        f884 = i2 % 128;
        if (i2 % 2 != 0) {
            return m984(adAdapter);
        }
        m984(adAdapter);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m983(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i2 = f883 + 13;
        f884 = i2 % 128;
        int i3 = i2 % 2;
        m986(interstitialAd, interstitialAdListener);
        if (i3 == 0) {
            throw null;
        }
        f883 = (f884 + 21) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m985(Ad ad) {
        f883 = (f884 + 107) % 128;
        String strM982 = m982(ad);
        int i2 = f884 + 73;
        f883 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM982;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m974(AdView adView, AdListener adListener) {
        int i2 = f883 + 123;
        f884 = i2 % 128;
        int i3 = i2 % 2;
        adView.setAdListener(adListener);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m980(AdView adView) {
        int i2 = f884 + 87;
        f883 = i2 % 128;
        int i3 = i2 % 2;
        String strM976 = m976(adView);
        if (i3 != 0) {
            int i4 = 31 / 0;
        }
        int i5 = f883 + 117;
        f884 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return strM976;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m982(Ad ad) {
        f883 = (f884 + 77) % 128;
        String placementId = ad.getPlacementId();
        f883 = (f884 + 45) % 128;
        return placementId;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m975((byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 69), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 27, Color.argb(0, 0, 0, 0) - 376809071, Color.rgb(0, 0, 0) + 343088045).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m980((AdView) list.get(0));
            }
        });
        map.put(m975((byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 2), (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 30, Color.red(0) - 376809048, (Process.myPid() >> 22) + 326310829).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m985((Ad) list.get(0));
            }
        });
        map.put(m977(new int[]{-1861075117, 351407506, -1495300914, -1361763390, -2005380754, 131337817, -458278376, -1074906245}, (ViewConfiguration.getPressedStateDuration() >> 16) + 13).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bn.m978((AdView) list.get(0), (AdListener) list.get(1));
                return null;
            }
        });
        map.put(m977(new int[]{-318815349, 1452408044, 916972031, 95267109, -1099077259, -233885232, 1610148717, 265292137, -271549054, -641244792, -1206054019, -1028182396, -630354702, 1158313358, -74295664, -1416545899, 515022916, -24728399, 556655568, 1109276888}, (-16777179) - Color.rgb(0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m971();
            }
        });
        map.put(m977(new int[]{-318815349, 1452408044, 916972031, 95267109, -1099077259, -233885232, 1610148717, 265292137, -271549054, -641244792, -1206054019, -1028182396, -1619139838, -1370766182, -1533346972, -1936936767, -467045401, -160544948, 1814198522, -784110289, -227085412, 991057580}, Color.red(0) + 42).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m972();
            }
        });
        map.put(m975((byte) (ExpandableListView.getPackedPositionGroup(0L) - 74), (short) Color.green(0), TextUtils.lastIndexOf("", '0', 0) - 25, View.MeasureSpec.getSize(0) - 376809029, 326310840 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bn.m983((InterstitialAd) list.get(0), (InterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m975((byte) (99 - View.resolveSizeAndState(0, 0, 0)), (short) ((-1) - ImageFormat.getBitsPerPixel(0)), (-34) - ((Process.getThreadPriority(0) + 20) >> 6), (-376809006) - TextUtils.getCapsMode("", 0, 0), 326310828 - Process.getGidForName("")).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m967();
            }
        });
        map.put(m977(new int[]{1599751928, 1498067375, 898044856, -2021296126, -551133019, 1705189397, -145177279, -552826620}, AndroidCharacter.getMirror('0') - ' ').intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m979((AdAdapter) list.get(0));
            }
        });
        map.put(m977(new int[]{1436340282, 1208694166, 1629176647, 850675859, -535135762, -1208643697, 302138615, 1270218642, -594155615, -1430388808, -1392522205, -1719649913, 91392489, -852233752}, ((byte) KeyEvent.getModifierMetaStateMask()) + 28).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bn.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bn.m973(bn.this, (WeakHashMap) list.get(0), chVar);
            }
        });
        f883 = (f884 + 87) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f884 + 75;
        f883 = i2 % 128;
        try {
            try {
                try {
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    String str = (String) hr.m2242().m2244().m2215(AdSdkVersion.class, String.class).get(null);
                    f884 = (f883 + 79) % 128;
                    return str;
                } catch (Throwable unused) {
                    return null;
                }
            } catch (Throwable unused2) {
                return hr.m2242().m2245().m2314(BuildConfig.class, m977(new int[]{-111118604, 1523175981, 1399725015, 857004947, -1801980406, 1287523742}, (ViewConfiguration.getEdgeSlop() >> 16) + 11).intern());
            }
        } catch (Throwable unused3) {
            return (String) hr.m2242().m2244().m2215(AdSdkVersion.class, String.class).get(null);
        }
    }

    public class b extends WeakHashMap<View, WeakReference<Object>> implements hg<WeakHashMap<View, WeakReference<Object>>> {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f899 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int[] f900 = {-385886798, 745331598, 1831195489, 2045223183, -960637106, 295959003, -1232580144, -1952370024, 537905372, 127981140, 117572922, -1317577429, -1123801853, -1836623907, -1860457439, 872741355, -2144286434, 232608061};

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f901 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private ch f903;

        public b(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
            super(weakHashMap);
            this.f903 = chVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m987(int[] iArr, int i2) {
            String str;
            synchronized (d.f1586) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f900.clone();
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakReference<Object> m988(View view, WeakReference<Object> weakReference) {
            f899 = (f901 + 17) % 128;
            bn.this.m790(this, this.f903, m987(new int[]{879552831, 1518624264, -1886429358, -2104164823, 1673675908, -946979709, 84609426, -1772777691, -1823747821, -1098701446, 1269215863, 1813292483}, 23 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), view, weakReference);
            WeakReference<Object> weakReference2 = (WeakReference) super.put(view, weakReference);
            int i2 = f901 + 85;
            f899 = i2 % 128;
            if (i2 % 2 == 0) {
                return weakReference2;
            }
            throw null;
        }

        @Override // java.util.WeakHashMap, java.util.AbstractMap, java.util.Map
        public /* synthetic */ Object put(Object obj, Object obj2) {
            f899 = (f901 + 103) % 128;
            WeakReference<Object> weakReferenceM988 = m988((View) obj, (WeakReference) obj2);
            int i2 = f899 + 7;
            f901 = i2 % 128;
            if (i2 % 2 != 0) {
                return weakReferenceM988;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.hg
        /* JADX INFO: renamed from: ﻛ */
        public final /* synthetic */ WeakHashMap<View, WeakReference<Object>> mo713() {
            int i2 = f899 + 71;
            f901 = i2 % 128;
            if (i2 % 2 == 0) {
                m989();
                throw null;
            }
            WeakHashMap<View, WeakReference<Object>> weakHashMapM989 = m989();
            int i3 = f899 + 39;
            f901 = i3 % 128;
            if (i3 % 2 != 0) {
                return weakHashMapM989;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private WeakHashMap<View, WeakReference<Object>> m989() {
            int i2 = f899 + 121;
            f901 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 54 / 0;
            }
            return this;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 1;
        switch (str.hashCode()) {
            case -2107186802:
                b2 = !str.equals(m975((byte) (78 - MotionEvent.axisFromString("")), (short) (ViewConfiguration.getTouchSlop() >> 8), (-33) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-376809126) - TextUtils.indexOf((CharSequence) "", '0', 0), TextUtils.lastIndexOf("", '0', 0) + 326310805).intern()) ? (byte) -1 : (byte) 19;
                break;
            case -1585374524:
                b2 = !str.equals(m975((byte) (TextUtils.getOffsetBefore("", 0) - 4), (short) View.MeasureSpec.getMode(0), (-26) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-393586429) - Color.rgb(0, 0, 0), 326310808 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -1513928064:
                if (!str.equals(m975((byte) (Color.blue(0) - 51), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), View.getDefaultSize(0, 0) - 10, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 376809177, View.MeasureSpec.getMode(0) + 326310825).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f884 + 105;
                    f883 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 13 : (byte) 26;
                }
                break;
            case -1256969519:
                if (!str.equals(m975((byte) (91 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (short) Color.green(0), (-30) - Color.red(0), KeyEvent.getDeadChar(0, 0) - 376809110, 326310793 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f883 + 101;
                    f884 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 20 : (byte) 29;
                }
                break;
            case -501313640:
                b2 = !str.equals(m977(new int[]{-1957626383, -895646532, -778658919, -735910158, -413366198, -1624509487, -1958040223, -511464692, 529982994, -1886488535}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 20).intern()) ? (byte) -1 : (byte) 14;
                break;
            case -498709917:
                b2 = !str.equals(m977(new int[]{1794266056, -253162248, -1031426254, -1293251220, 755505342, 687853224, 34439735, 468154247, -207536341, 722315390, -1641493971, 172443992}, Color.blue(0) + 22).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -105717264:
                b2 = !str.equals(m975((byte) ((-73) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (short) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 35, (ViewConfiguration.getScrollBarSize() >> 8) - 376809191, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 326310808).intern()) ? (byte) -1 : (byte) 11;
                break;
            case 2115:
                if (!str.equals(m975((byte) (MotionEvent.axisFromString("") - 37), (short) (ViewConfiguration.getPressedStateDuration() >> 16), (-48) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-376809258) - View.MeasureSpec.getSize(0), 326310791 - View.MeasureSpec.getMode(0)).intern())) {
                    b2 = -1;
                } else {
                    f884 = (f883 + 97) % 128;
                    b2 = 0;
                }
                break;
            case 289409084:
                b2 = !str.equals(m975((byte) (48 - View.MeasureSpec.getMode(0)), (short) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 35, (-376809227) - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 326310792).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 320151695:
                if (!str.equals(m977(new int[]{1794266056, -253162248, -1031426254, -1293251220, 755505342, 687853224, -294916232, 2076336191}, View.resolveSizeAndState(0, 0, 0) + 14).intern())) {
                    b2 = -1;
                } else {
                    f883 = (f884 + 121) % 128;
                    b2 = 9;
                }
                break;
            case 435867927:
                b2 = !str.equals(m977(new int[]{1070273962, -1333744998, 734126091, 282529534, -1152172107, 903254042, 895788152, 1355495445, -698375942, -827259574, -458278376, -1074906245}, TextUtils.getTrimmedLength("") + 21).intern()) ? (byte) -1 : (byte) 22;
                break;
            case 488344453:
                b2 = !str.equals(m977(new int[]{-673173576, -252525684, 1138582503, 1795117259}, 7 - TextUtils.indexOf("", "", 0, 0)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 535330969:
                b2 = !str.equals(m977(new int[]{-1219586438, 556542129, -1014026188, -1643447991, 856117304, 1767053082, 1028656299, 256782432, 319271679, -1090116620, -1173820443, -2026519044}, 'G' - AndroidCharacter.getMirror('0')).intern()) ? (byte) -1 : (byte) 12;
                break;
            case 553704929:
                if (!str.equals(m977(new int[]{-266120197, 238602772, 518374967, 1292534138, 260731796, 907676804, 1316327792, 2094294667, 825317801, -230368705}, 18 - Process.getGidForName("")).intern())) {
                    b2 = -1;
                } else {
                    f884 = (f883 + 41) % 128;
                    b2 = 7;
                }
                break;
            case 1165508119:
                if (!str.equals(m977(new int[]{34439735, 468154247, -207536341, 722315390, -1641493971, 172443992}, 10 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b2 = -1;
                } else {
                    f884 = (f883 + 103) % 128;
                }
                break;
            case 1237162638:
                if (!str.equals(m975((byte) (72 - View.resolveSize(0, 0)), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (-29) - ExpandableListView.getPackedPositionType(0L), (-376809092) - ImageFormat.getBitsPerPixel(0), 309533594 - Color.rgb(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f883 + 3;
                    f884 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 21 : (byte) 34;
                }
                break;
            case 1476063628:
                if (!str.equals(m975((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21), (short) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) - 41, (-376809257) - TextUtils.indexOf("", ""), 326310792 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                }
                break;
            case 1838933446:
                b2 = !str.equals(m975((byte) (81 - (Process.myTid() >> 22)), (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-35) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-376809138) - TextUtils.getTrimmedLength(""), Process.getGidForName("") + 326310805).intern()) ? (byte) -1 : (byte) 16;
                break;
            case 1908493505:
                if (!str.equals(m975((byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65), (short) KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", "", 0, 0) - 27, (-376809249) - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 326310825).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f884 + 119;
                    f883 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 5 : (byte) 3;
                }
                break;
            case 1955913096:
                b2 = !str.equals(m977(new int[]{-1252682658, -983719445, -634723484, -1471692406}, (-16777210) - Color.rgb(0, 0, 0)).intern()) ? (byte) -1 : (byte) 4;
                break;
            case 2035065003:
                b2 = !str.equals(m977(new int[]{-535135762, -1208643697, 302138615, 1270218642, 874044089, 478363808}, (ViewConfiguration.getScrollBarSize() >> 8) + 12).intern()) ? (byte) -1 : (byte) 15;
                break;
            case 2035668095:
                if (!str.equals(m977(new int[]{-535135762, -1208643697, 302138615, 1270218642, -1503733976, 156565274}, Color.alpha(0) + 12).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f884 + 1;
                    f883 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 18 : (byte) 105;
                }
                break;
            case 2110329530:
                b2 = !str.equals(m977(new int[]{-535135762, -1208643697, 302138615, 1270218642}, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern()) ? (byte) -1 : (byte) 17;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return Ad.class;
            case 1:
                return AdAdapter.class;
            case 2:
                return AdError.class;
            case 3:
                return AdListener.class;
            case 4:
            case 5:
                return AdView.class;
            case 6:
                return AdPlacementType.class;
            case 7:
                return DisplayAdController.class;
            case 8:
                return InterstitialAdListener.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return RewardedVideoAdListener.class;
            case 11:
                return RewardedVideoAd.class;
            case 12:
            case 13:
                return AudienceNetworkActivity.class;
            case 14:
                return DynamicLoaderFactory.class;
            case 15:
                return NativeAdBase.class;
            case 16:
                return NativeBannerAd.class;
            case 17:
                return NativeAd.class;
            case 18:
                return NativeAdView.class;
            case 19:
                return NativeAdListener.class;
            case 20:
                int i7 = f883 + 111;
                f884 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 27 / 0;
                }
                return CircularProgressView.class;
            case 21:
                return b.class;
            case 22:
                return am.m422();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m986(InterstitialAd interstitialAd, InterstitialAdListener interstitialAdListener) {
        int i2 = f884 + 121;
        f883 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdListener(interstitialAdListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdPlacementType m984(AdAdapter adAdapter) {
        f884 = (f883 + 99) % 128;
        AdPlacementType placementType = adAdapter.getPlacementType();
        f883 = (f884 + 21) % 128;
        return placementType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m976(AdView adView) {
        f884 = (f883 + 5) % 128;
        String placementId = adView.getPlacementId();
        f884 = (f883 + 51) % 128;
        return placementId;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m975(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f889;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f887;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f886 + i3] + i5);
                    } else {
                        i6 = (short) (f885[f886 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f886 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f888);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f887;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f885;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m977(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f882.clone();
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
    private WeakHashMap<View, WeakReference<Object>> m981(WeakHashMap<View, WeakReference<Object>> weakHashMap, ch chVar) {
        b bVar = new b(weakHashMap, chVar);
        f883 = (f884 + 47) % 128;
        return bVar;
    }
}
