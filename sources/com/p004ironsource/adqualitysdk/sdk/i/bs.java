package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class bs extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f973 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f975 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f977 = 53;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f978 = 22445185;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f979 = 1237376607;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static short[] f980;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f976 = {-42, 6, 13, -40, 57, -44, 18, 11, 1, 18, 8, -37, 12, 18, -11, 23, 23, -30, 17, 1, 43, -32, 18, -6, 9, 3, 40, -47, 1, -23, -8, -14, 23, -45, 46, -35, 23, -1, 14, 8, 45, -41, -28, -26, 20, -49, 2, -29, -22, -14, 24, -47, 18, -39, 80, 58, 76, 52, 68, 77, 96, 24, 75, 74, 88, 50, 102, -22, -58, -80, -71, -58, -40, -51, 117, -58, -74, -82, -61, -74, -61, -90, -66, -5, 124, -64, -86, -2, 120, -59, -83, -68, -74, -69, -8, 122, -73, -59, -33, -58, -80, -62, -86, -70, -61, -42, -114, -63, -64, -50, -88, -36, -120, -58, -80, -71, -58, -40, -40, -30, -47, -2, -76, -40, -33, -50, -20, -47, -34, -40, -15, -31, -91, 87, -115, 122, 119, -115, 119, -125, -125, -113, 115, -120, -89, 103, -127, -125, 116, -109, 108, -108, -107, 26, -48, -42, -66, -40, -64, -36, -19, -88, -58, -45, -70, -16, -22, -107, -58, -45, -70, -48, 10, -115, -42, -66, -57, -40, -68, -47, -48, 6, -121, -40, -66, -40, -52, -63, -44, -66, -39, -50, -2, -107, -58, -59, -56, -39, -63, -40, -2, -123, -42, -55, -64, -36, -52, -60, -46, -68, 16, -122, -53, -49, -52, -44, -72, 21, -114, -46, -68, 16, -118, -41, -65, -50, -56, -51, 10, -116, -55, -41, -37, -1, 5, -19, 7, -17, 11, 28, -41, 29, -40, -12, -17, 13, -25, 27, 38, 41, 47, 23, 49, 25, 53, 70, 1, 71, 2, 30, 25, 55, 17, 69, 73, -32, 49, 23, 49, 37, 26, 45, 23, 51, 30, 25, 55, 17, 37, 105, -26, 47, 23, 32, 49, 21, 42, 41, 95, -32, 49, 23, 49, 37, 26, 45, 23, 50, 39, 87, -18, 31, 30, 33, 50, 26, 49, 87, -34, 47, 34, 25, 53, 37, 29, 43, 21, 105, -33, 36, 40, 37, 45, 17, 110, -25, 43, 21, 105, -29, 48, 24, 39, 33, 38, 99, -27, 34, 48, 24, -9, -3, -27, -1, -25, 3, 20, -65, -13, 4, -3, 26, -84, -13, 4, -35, 58, -76, -3, -27, -18, -1, -29, -8, -9, 45, -82, -1, -27, -1, -13, -24, -5, -27, 0, -11, 37, -68, -19, -20, -17, 0, -24, -1, 37, -84, -3, -16, -25, 3, -13, -21, -7, -29, 55, -83, -14, -10, -13, -5, -33, 60, -75, -7, -29, 55, -79, -2, -26, -11, -17, -12, 49, -77, -16, -2, -30, 36, 14, 32, 8, 24, 33, 52, -20, 31, 30, 44, 6, 58, -26, 36, 14, 23, 36, 54, -27, 38, 21, -30, -59, -81, -63, -87, -71, -62, -43, -115, -64, -65, -51, -89, -37, -121, -59, -81, -72, -59, -41, -122, -57, -86};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f974 = -4336831210449940258L;

    public bs(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1087() {
        int i2 = f975 + 73;
        f973 = i2 % 128;
        if (i2 % 2 == 0) {
            return Moloco.INSTANCE;
        }
        int i3 = 14 / 0;
        return Moloco.INSTANCE;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Object m1088() {
        f973 = (f975 + 21) % 128;
        Object objM1087 = m1087();
        f975 = (f973 + 15) % 128;
        return objM1087;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1090(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i2 = f973 + 109;
        f975 = i2 % 128;
        int i3 = i2 % 2;
        banner.setAdShowListener(bannerAdShowListener);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        f973 = (f975 + 109) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1092(Banner banner, BannerAdShowListener bannerAdShowListener) {
        int i2 = f973 + 19;
        f975 = i2 % 128;
        int i3 = i2 % 2;
        m1090(banner, bannerAdShowListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ BannerAdShowListener m1093(Banner banner) {
        int i2 = f973 + 27;
        f975 = i2 % 128;
        if (i2 % 2 == 0) {
            m1094(banner);
            throw null;
        }
        BannerAdShowListener bannerAdShowListenerM1094 = m1094(banner);
        int i3 = f973 + 71;
        f975 = i3 % 128;
        if (i3 % 2 != 0) {
            return bannerAdShowListenerM1094;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static BannerAdShowListener m1094(Banner banner) {
        f975 = (f973 + 63) % 128;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        int i2 = f973 + 35;
        f975 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return adShowListener;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f975 = (f973 + 47) % 128;
        try {
            String strM2314 = hr.m2242().m2245().m2314(BuildConfig.class, m1091((byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 10), (-54) - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) - 22445185, Gravity.getAbsoluteGravity(0, 0) - 1237376513).intern());
            int i2 = f975 + 123;
            f973 = i2 % 128;
            if (i2 % 2 == 0) {
                return strM2314;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1089(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f974);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1089("킹졆\ue150驤덅걃䕟繖\u1759と⥘쉪וֹ鑩赻ꙹ彯硽ᅷ\u0a7c", Process.getGidForName("") + 6398).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bs.m1088();
            }
        });
        map.put(m1091((byte) (ViewConfiguration.getPressedStateDuration() >> 16), (short) ((-23) - View.getDefaultSize(0, 0)), (-53) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-22444769) - (ViewConfiguration.getTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) - 1237376504).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bs.m1093((Banner) list.get(0));
            }
        });
        map.put(m1091((byte) (ImageFormat.getBitsPerPixel(0) + 1), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 72), Color.green(0) - 54, TextUtils.getCapsMode("", 0, 0) - 22444746, (-1237376492) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bs.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bs.m1092((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f973 = (f975 + 103) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        f975 = (f973 + 109) % 128;
        byte b2 = 13;
        switch (str.hashCode()) {
            case -1984684559:
                if (!str.equals(m1091((byte) (Process.myTid() >> 22), (short) (';' - AndroidCharacter.getMirror('0')), (-53) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-22445159) - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1237376530).intern())) {
                    b2 = -1;
                } else {
                    f973 = (f975 + 49) % 128;
                    b2 = 1;
                }
                break;
            case -1940439161:
                b2 = !str.equals(m1091((byte) (ViewConfiguration.getScrollBarSize() >> 8), (short) ((-16777222) - Color.rgb(0, 0, 0)), (-55) - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 22445174, (-1237376531) - TextUtils.lastIndexOf("", '0', 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -1921270373:
                if (!str.equals(m1089("킈刬햋圓\udad3屢\udfd8䊲쐰䞜줔䳶", 33426 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                    b2 = -1;
                } else {
                    f975 = (f973 + 53) % 128;
                    b2 = 18;
                }
                break;
            case -1483746188:
                b2 = !str.equals(m1091((byte) Drawable.resolveOpacity(0, 0), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 16), TextUtils.getOffsetAfter("", 0) - 54, 33752 - AndroidCharacter.getMirror('0'), (-1237376543) - Process.getGidForName("")).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1473265726:
                if (!str.equals(m1091((byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (71 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getTapTimeout() >> 16) - 54, (-22445119) - TextUtils.lastIndexOf("", '0'), (-1237376508) - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f973 + 23;
                    f975 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 20 : (byte) 6;
                }
                break;
            case -1435839138:
                b2 = !str.equals(m1089("킘暢베\uf2a9ࢉ庐钚⪄想뛡쳅˙", 46601 - TextUtils.getCapsMode("", 0, 0)).intern()) ? (byte) -1 : (byte) 8;
                break;
            case -1413560652:
                b2 = !str.equals(m1091((byte) View.MeasureSpec.getSize(0), (short) ((-67) - KeyEvent.keyCodeFromString("")), (-54) - TextUtils.getTrimmedLength(""), (-22445132) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1237376543).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -1323289850:
                b2 = !str.equals(m1091((byte) ((-1) - ImageFormat.getBitsPerPixel(0)), (short) ((-36) - (KeyEvent.getMaxKeyCode() >> 16)), (-54) - Color.blue(0), TextUtils.indexOf("", "") - 22444937, ExpandableListView.getPackedPositionGroup(0L) - 1237376508).intern()) ? (byte) -1 : (byte) 17;
                break;
            case -789262976:
                b2 = !str.equals(m1091((byte) ('0' - AndroidCharacter.getMirror('0')), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5), (-54) - TextUtils.indexOf("", ""), (-22444953) - Color.red(0), Color.rgb(0, 0, 0) - 1220599308).intern()) ? (byte) -1 : (byte) 16;
                break;
            case -671875674:
                b2 = !str.equals(m1091((byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39), (-16777270) - Color.rgb(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) - 22445067, TextUtils.getOffsetAfter("", 0) - 1237376530).intern()) ? (byte) -1 : (byte) 11;
                break;
            case -556413696:
                b2 = !str.equals(m1089("킗흣\udf0c쟂쿠\uf7b2﹘\ue672\uee32雜麁蚣赻딍봇ꗫ궁喪屄䐞䳑瓥粙捅歳ጷ", 2004 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -543102915:
                b2 = !str.equals(m1091((byte) Drawable.resolveOpacity(0, 0), (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 126), (-54) - TextUtils.getOffsetAfter("", 0), (-22445055) - MotionEvent.axisFromString(""), TextUtils.lastIndexOf("", '0', 0) - 1237376524).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -517600968:
                if (!str.equals(m1091((byte) KeyEvent.keyCodeFromString(""), (short) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53), (-54) - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 22445032, (-1237376508) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    f975 = (f973 + 33) % 128;
                    b2 = 15;
                }
                break;
            case -316379660:
                if (!str.equals(m1091((byte) (ViewConfiguration.getScrollBarSize() >> 8), (short) ((-11) - Color.blue(0)), (-54) - (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) - 22445152, (-1237376530) - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f975 = (f973 + 101) % 128;
                    b2 = 2;
                }
                break;
            case 320151695:
                b2 = !str.equals(m1089("킗ֽ窰꾜蒘溺⻤Ϭ磂귂舽\uf73dⰃē", 54541 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 664452134:
                b2 = !str.equals(m1091((byte) ((-1) - TextUtils.lastIndexOf("", '0')), (short) (13 - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 54, (-22444846) - KeyEvent.getDeadChar(0, 0), (-1237376508) - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 19;
                break;
            case 704479150:
                if (!str.equals(m1089("킌⭈❏⍦㽠㬅㜉㌟༏\u0b3bߔϊῈ\u1bfa០ᎊ澚殔枩掻繣穕癯牣乹䨒䘼䈖帹娭囁勝껛\uaaff", Color.argb(0, 0, 0, 0) + 64499).intern())) {
                    b2 = -1;
                }
                break;
            case 1395486086:
                b2 = !str.equals(m1089("킓ᬟ䟙뎮ﹶ⫠ᚏ䅏贯泥⑉ရ峃", (ViewConfiguration.getJumpTapTimeout() >> 16) + 52147).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 1928690944:
                b2 = str.equals(m1091((byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), (short) (70 - TextUtils.lastIndexOf("", '0', 0, 0)), (-54) - (ViewConfiguration.getLongPressTimeout() >> 16), (-22445088) - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1237376541).intern()) ? (byte) 7 : (byte) -1;
                break;
            case 1982491468:
                b2 = !str.equals(m1089("킜\uec18ꧾ故∧\uffef", TextUtils.getOffsetBefore("", 0) + 15527).intern()) ? (byte) -1 : (byte) 5;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return MolocoInitParams.class;
            case 1:
                return Moloco.class;
            case 2:
                return MolocoAd.class;
            case 3:
                return AdFormatType.class;
            case 4:
                return AdShowListener.class;
            case 5:
            case 6:
                return Banner.class;
            case 7:
                return BannerAdShowListener.class;
            case 8:
                return FullscreenAd.class;
            case 9:
                return InterstitialAd.class;
            case 10:
                return InterstitialAdShowListener.class;
            case 11:
                return MediationInfo.class;
            case 12:
                return RewardedInterstitialAd.class;
            case 13:
                return RewardedInterstitialAdShowListener.class;
            case 14:
            case 15:
                return MraidActivity.class;
            case 16:
            case 17:
                return StaticAdActivity.class;
            case 18:
            case 19:
                return VastActivity.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1091(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f977;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f976;
                    if (bArr != null) {
                        i6 = (byte) (bArr[f978 + i3] + i5);
                    } else {
                        i6 = (short) (f980[f978 + i3] + i5);
                    }
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f978 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f979);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f976;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f980;
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
