package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
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
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bv extends be {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1019 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1021 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f1023 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1024 = 1374052995;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1026 = 97;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1027 = 576455473;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f1025 = {-86, 35, -74, -15, -46, -19, -81, -72, 42, -81, 33, -91, -104, -32, -111, -25, -78, -89, -80, -127, -33, 103, -48, 110, -79, -83, -104, -18, -100, -12, -92, -101, -120, -48, -99, -98, -112, -10, -62, -66, 37, 111, 24, 37, 23, 12, -76, 37, 117, 109, 34, 117, 34, -123, 29, -38, 91, 31, 105, -35, -73, 36, 108, 27, 117, 26, 55, 89, 118, 36, -83, -8, -54, 32, -81, -86, 32, -86, 22, 22, 34, -90, 29, -6, -71, 39, 97, 43, 99, 51, 44, 55, 127, 42, 49, Utf8.REPLACEMENT_BYTE, 73, 21, 127, 45, 90, 95, 45, 95, 51, 51, 39, 99, 48, 15, -84, 5, 52, -31, 87, 59, 2, 49, 15, 52, 1, 59, 20, -81, 4, 2, -6, -4, -12, 24, 41, -52, 42, -51, -15, -12, 26, -36, 40, -77, 0, -107, -3, -99, 1, 5, -27, -84, 3, -15, -90, -2, -106, -1, -115, -32, -87, -5, -116, -74, -120, -110, -124, -116, 124, -121, 120, -80, -123, -126, 112, -86, 94, -54, -120, -110, 125, -120, 122, -53, -118, -101};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f1022 = 6;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f1020 = {'M', 'o', 'l', 'c', 'I', 'n', 'i', 't', 'P', 'a', 'r', 'm', 's', 'A', 'd', 'F', 'T', 'y', 'p', 'e', 'B', 'S', 'h', 'w', 'L', 'u', 'R', 'v', '.', 'k', 'x', 'V', 'N', 'O', 'Q', 'U'};

    public bv(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1191() {
        int i10 = f1019 + 19;
        f1021 = i10 % 128;
        if (i10 % 2 != 0) {
            Moloco moloco = Moloco.INSTANCE;
            throw null;
        }
        Moloco moloco2 = Moloco.INSTANCE;
        f1019 = (f1021 + 45) % 128;
        return moloco2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Object m1192() {
        int i10 = f1021 + 35;
        f1019 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1191();
        }
        int i11 = 63 / 0;
        return m1191();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ BannerAdShowListener m1193(Banner banner) {
        f1019 = (f1021 + 35) % 128;
        BannerAdShowListener bannerAdShowListenerM1196 = m1196(banner);
        int i10 = f1019 + 75;
        f1021 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 48 / 0;
        }
        return bannerAdShowListenerM1196;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1198(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1021 = (f1019 + 39) % 128;
        m1194(banner, bannerAdShowListener);
        int i10 = f1019 + 83;
        f1021 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1021 = (f1019 + 45) % 128;
        try {
            String strM2493 = id.m2382().m2383().m2493(BuildConfig.class, m1195((short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19), Color.rgb(0, 0, 0) - 559678163, (-98) - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1374052995, (byte) (View.resolveSizeAndState(0, 0, 0) - 54)).intern());
            int i10 = f1021 + 47;
            f1019 = i10 % 128;
            if (i10 % 2 != 0) {
                return strM2493;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x035d  */
    /* JADX WARN: Code duplicated, block: B:75:0x03a1  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10 = 11;
        switch (str.hashCode()) {
            case -1984684559:
                if (!str.equals(m1195((short) (67 - (ViewConfiguration.getTouchSlop() >> 8)), (-576455395) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (-98) - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.lastIndexOf("", '0', 0) - 1374052983, (byte) ((-41) - ExpandableListView.getPackedPositionGroup(0L))).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1019 + 43;
                    f1021 = i10 % 128;
                    if (i10 % 2 == 0) {
                        b10 = 1;
                    } else {
                        b10 = 0;
                    }
                }
                break;
            case -1940439161:
                if (!str.equals(m1197(16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0001\u0002\u0003\u0002\u0004\u0002\u0005\u0000\u0007\b\t\n\u000b\n\u0006\u0011", (byte) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 4)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1921270373:
                if (!str.equals(m1197(11 - TextUtils.indexOf((CharSequence) "", '0'), "!\u0007\r\u0006\u000f\u0001\b\u0007\u0018\t\u000b\r", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 21)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case -1483746188:
                if (!str.equals(m1197(ExpandableListView.getPackedPositionType(0L) + 12, "\u000e\u000f\r\u0003\u000b\u0006\n\b\u0011\f\u0013\u0014", (byte) (34 - TextUtils.getOffsetBefore("", 0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1473265726:
                if (!str.equals(m1195((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 55), (-576455373) - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.getOffsetAfter("", 0) - 98, (-1374052956) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 81)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -1435839138:
                if (!str.equals(m1197(12 - Drawable.resolveOpacity(0, 0), "\r\u001bÍÍ\u000f\u0000\u0007\u0016\u0017\u0001\u000e\u000f", (byte) (96 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())) {
                    b10 = -1;
                } else {
                    int i11 = (f1019 + InterfaceC0435l1.d.b.f29109f) % 128;
                    f1021 = i11;
                    f1019 = (i11 + InterfaceC0435l1.d.b.f29110g) % 128;
                    b10 = 8;
                }
                break;
            case -1413560652:
                if (!str.equals(m1195((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) - 70), Color.rgb(0, 0, 0) - 559678192, (-98) - Color.argb(0, 0, 0, 0), (-1374052970) - Color.blue(0), (byte) (95 - Drawable.resolveOpacity(0, 0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1323289850:
                if (!str.equals(m1197(91 - TextUtils.getOffsetBefore("", 0), "\u0004\u0002\n\u001d\u0007\u0005\u0003\u0002\u0004\u0002\u0018\u0010\u0011\u001a\u0018\"\u0017\u0001\u0000\r\u0010\u0018\r\u000f\u001a\u0011\u0015\u0019\u0018\u000b\n\u0019\u000b\u0003\u0010\b\u0000\u0007\u0010\u001a\b\u000f\u0007\u0016\u0002\u0011\u0016\u0007\u0016\u0007\u0018\n\u0001\u000b\u0016\u0007\u0003\u000b\u0004\u001a\r\u0006\n\b\t\u0000\u0007\u0016\u0002\u0011\u0016\u0007\u0016\u0007\u001b\u0016\b\n\b\u0007\u0001\u000f\u000f\u000e\u0001\t\t\u0018\u0007\bâ", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 106)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case -789262976:
                if (!str.equals(m1195((short) (5 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 576455390, TextUtils.getOffsetAfter("", 0) - 98, TextUtils.indexOf((CharSequence) "", '0') - 1374052871, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 16;
                }
                break;
            case -671875674:
                if (!str.equals(m1195((short) (100 - Color.green(0)), TextUtils.lastIndexOf("", '0') - 576455395, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 98, (-1374052885) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (96 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern())) {
                    b10 = -1;
                }
                break;
            case -556413696:
                if (!str.equals(m1195((short) (Color.blue(0) - 70), TextUtils.getOffsetBefore("", 0) - 576455400, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 99, (-1374052911) - Gravity.getAbsoluteGravity(0, 0), (byte) (TextUtils.getOffsetAfter("", 0) - 20)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -543102915:
                if (!str.equals(m1197(21 - ExpandableListView.getPackedPositionChild(0L), "\u0019\u0014\u0015\u000b\b\u0010\u0014\r\u0005\u0000\r\u0019\u0006\u0010\b\u0007\b\u0007\b\u0003\u000e\u000f", (byte) (Drawable.resolveOpacity(0, 0) + 94)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 12;
                }
                break;
            case -517600968:
                if (!str.equals(m1197(79 - TextUtils.getTrimmedLength(""), "\u0004\u0002\n\u001d\u0007\u0005\u0003\u0002\u0004\u0002\u0018\u0010\u0011\u001a\u0018\"\u0017\u0001\u0000\r\u0010\u0018\r\u000f\u001a\u0011\u0015\u0019\u0018\u000b\n\u0019\u000b\u0003\u0010\b\u0000\u0007\u0010\u001a\b\u000f\u0007\u0016\u0002\u0011\u0016\u0007\u0016\u0007\u0018\n\u0001\u000b\u0016\u0007\u0003\u000b\u0004\u001a\u0006\u000b\n\u0007\u0010\u001a\u0004\u0006\n\u0007\u000f\u000e\u0001\t\t\u0018\u0007\b\u007f", (byte) ((-16777210) - Color.rgb(0, 0, 0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -316379660:
                if (!str.equals(m1195((short) (95 - TextUtils.lastIndexOf("", '0', 0)), (-576455396) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 97, (-1374052977) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (51 - View.MeasureSpec.getSize(0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 320151695:
                if (!str.equals(m1195((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 102), (-576455401) - TextUtils.lastIndexOf("", '0', 0), (-98) - (ViewConfiguration.getLongPressTimeout() >> 16), Color.rgb(0, 0, 0) - 1357275709, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) - 78)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1021 + 81;
                    f1019 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 111 : (byte) 9;
                }
                break;
            case 664452134:
                if (!str.equals(m1197(77 - View.resolveSize(0, 0), "\u0004\u0002\n\u001d\u0007\u0005\u0003\u0002\u0004\u0002\u0018\u0010\u0011\u001a\u0018\"\u0017\u0001\u0000\r\u0010\u0018\r\u000f\u001a\u0011\u0015\u0019\u0018\u000b\n\u0019\u000b\u0003\u0010\b\u0000\u0007\u0010\u001a\b\u000f\u0007\u0016\u0002\u0011\u0016\u0007\u0016\u0007\u0018\n\u0001\u000b\u0016\u0007\u0003\u000b\u0004\u001a!\u000f\r\u0006\u0019\"\u0006\u000f\r\u0013\u0001\t\t\u0018\u0007\b¿", (byte) (KeyEvent.getDeadChar(0, 0) + 70)).intern())) {
                    b10 = -1;
                } else {
                    int i13 = f1021 + 67;
                    f1019 = i13 % 128;
                    b10 = i13 % 2 != 0 ? (byte) 19 : (byte) 120;
                }
                break;
            case 704479150:
                if (!str.equals(m1197(34 - Color.blue(0), "\u0019\u0014\u0015\u000b\b\u0010\u0014\r\u0005\u0000\r\u0019\u0006\u0010\b\u0007\b\u0007\b\u0003\u000e\u000f\u0016\u0017\u0005\u0013\u001e\f\r\u0006\u0017\u0001\u0016\u0007", (byte) (83 - TextUtils.lastIndexOf("", '0', 0))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 1395486086:
                if (!str.equals(m1197(13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0004\u0006\n\u0007\u000f\u000e\u0001\t\t\u0018\u0007\bÏ", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 86)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 14;
                }
                break;
            case 1928690944:
                if (!str.equals(m1197(Drawable.resolveOpacity(0, 0) + 20, "\u0015\bss\u0016\u0007\u000e\u000f\u0016\u0017\u0005\u0013\u001e\f\r\u0006\u0017\u0001\u0016\u0007", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 1982491468:
                if (!str.equals(m1197(TextUtils.indexOf("", "") + 6, "\u0015\b³³\u0016\u0007", (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 69)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1195((short) (ImageFormat.getBitsPerPixel(0) - 70), (-576455371) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) - 98, (-1374052856) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (((Process.getThreadPriority(0) + 20) >> 6) - 69)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bv.m1192();
            }
        });
        map.put(m1195((short) ((-12) - View.MeasureSpec.getSize(0)), (-576455370) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-98) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-1374052836) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (113 - TextUtils.indexOf("", ""))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bv.m1193((Banner) list.get(0));
            }
        });
        map.put(m1197(22 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\r\u0012\b\u0013\u000b\u0003\u0001\u0017\u0007\u0010\u000f\u0014\u0013\u0004\u0012\u001d\f\u0012\r\u0019\u0001\u0017á", (byte) (111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bv.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bv.m1198((Banner) list.get(0), (BannerAdShowListener) list.get(1));
                return null;
            }
        });
        f1019 = (f1021 + 5) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1194(Banner banner, BannerAdShowListener bannerAdShowListener) {
        f1019 = (f1021 + 67) % 128;
        banner.setAdShowListener(bannerAdShowListener);
        int i10 = f1019 + 71;
        f1021 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static BannerAdShowListener m1196(Banner banner) {
        f1021 = (f1019 + 93) % 128;
        BannerAdShowListener adShowListener = banner.getAdShowListener();
        f1021 = (f1019 + 15) % 128;
        return adShowListener;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1197(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f1020;
                char c4 = f1022;
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1195(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1026;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1025;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1024 + i12] + i13);
                    } else {
                        i14 = (short) (f1023[f1024 + i12] + i13);
                    }
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1024 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1027);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1025;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1023;
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
}
