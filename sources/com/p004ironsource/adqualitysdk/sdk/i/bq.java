package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.ShowOptions;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.common.lifecycle.EventStream;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.abstr.CachedAd;
import com.fyber.fairbid.mediation.abstr.NetworkAdapter;
import com.fyber.fairbid.mediation.adapter.AdapterConfiguration;
import com.fyber.fairbid.mediation.adapter.AdapterPool;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bq extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f933 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f934 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f935 = 7;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f936 = {'M', 'e', 'd', 'i', 'a', 't', 'o', 'n', 'g', 'r', 'A', 's', 'C', 'f', 'P', 'l', 'c', 'm', 'H', 'T', 'y', 'p', 'S', 'h', 'w', 'O', '^', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST, '+', '.', '$', 'I', 'D', 'R', 'k', 'V', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'E', 'L', 'N', 'Q', 'U', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f937 = 8651;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f938 = 8824;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f939 = 65322;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f940 = 21129;

    public bq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static String m1033(ImpressionData impressionData) {
        int i2 = f934 + 3;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            impressionData.getCreativeId();
            throw null;
        }
        String creativeId = impressionData.getCreativeId();
        f933 = (f934 + 61) % 128;
        return creativeId;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m1034(ImpressionData impressionData) {
        int i2 = f933 + 117;
        f934 = i2 % 128;
        if (i2 % 2 != 0) {
            impressionData.getAdvertiserDomain();
            throw null;
        }
        String advertiserDomain = impressionData.getAdvertiserDomain();
        int i3 = f934 + 95;
        f933 = i3 % 128;
        if (i3 % 2 != 0) {
            return advertiserDomain;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static String m1035(ImpressionData impressionData) {
        f933 = (f934 + 125) % 128;
        String campaignId = impressionData.getCampaignId();
        int i2 = f934 + 39;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return campaignId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static String m1036(ImpressionData impressionData) {
        int i2 = f934 + 63;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            impressionData.getRenderingSdkVersion();
            throw null;
        }
        String renderingSdkVersion = impressionData.getRenderingSdkVersion();
        f933 = (f934 + 93) % 128;
        return renderingSdkVersion;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1037(ImpressionData impressionData) {
        int i2 = f933 + 7;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        String renderingSdk = impressionData.getRenderingSdk();
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return renderingSdk;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1038(ImpressionData impressionData) {
        f934 = (f933 + 19) % 128;
        String demandSource = impressionData.getDemandSource();
        f933 = (f934 + 81) % 128;
        return demandSource;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1039(ImpressionData impressionData) {
        f933 = (f934 + 59) % 128;
        String variantId = impressionData.getVariantId();
        int i2 = f934 + 103;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return variantId;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static MediationManager m1042() {
        f933 = (f934 + 31) % 128;
        MediationManager companion = MediationManager.Companion.getInstance();
        int i2 = f934 + 75;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return companion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m1043() {
        int i2 = f934 + 55;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            m1042();
            throw null;
        }
        MediationManager mediationManagerM1042 = m1042();
        int i3 = f934 + 47;
        f933 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return mediationManagerM1042;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m1045(ImpressionData impressionData) {
        f933 = (f934 + 63) % 128;
        String strM1035 = m1035(impressionData);
        int i2 = f933 + 83;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1035;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ String m1047(ImpressionData impressionData) {
        f933 = (f934 + 17) % 128;
        String strM1034 = m1034(impressionData);
        f934 = (f933 + 63) % 128;
        return strM1034;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ double m1049(ImpressionData impressionData) {
        int i2 = f934 + 113;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1041(impressionData);
        }
        m1041(impressionData);
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static PlacementType m1050(ImpressionData impressionData) {
        f934 = (f933 + 71) % 128;
        PlacementType placementType = impressionData.getPlacementType();
        f934 = (f933 + 27) % 128;
        return placementType;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1051(ImpressionData impressionData) {
        f934 = (f933 + 123) % 128;
        PlacementType placementTypeM1050 = m1050(impressionData);
        int i2 = f933 + 7;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return placementTypeM1050;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1056(Placement placement) {
        int i2 = f933 + 103;
        f934 = i2 % 128;
        if (i2 % 2 != 0) {
            m1074(placement);
            throw null;
        }
        Constants.AdType adTypeM1074 = m1074(placement);
        f934 = (f933 + 29) % 128;
        return adTypeM1074;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1064(ImpressionData impressionData) {
        f934 = (f933 + 37) % 128;
        String strM1037 = m1037(impressionData);
        f934 = (f933 + 113) % 128;
        return strM1037;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1068(Constants.AdType adType) {
        f933 = (f934 + 43) % 128;
        PlacementType placementTypeM1062 = m1062(adType);
        int i2 = f933 + 33;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return placementTypeM1062;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m1075(MediationManager mediationManager) {
        int i2 = f934 + 125;
        f933 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler placementsHandlerM1052 = m1052(mediationManager);
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return placementsHandlerM1052;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m1040() {
        int i2 = f934 + 21;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return FairBid.assertStarted();
        }
        int i3 = 99 / 0;
        return FairBid.assertStarted();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static double m1041(ImpressionData impressionData) {
        f933 = (f934 + 101) % 128;
        double netPayout = impressionData.getNetPayout();
        int i2 = f934 + 93;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
        return netPayout;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1044(ImpressionData impressionData) {
        f934 = (f933 + 27) % 128;
        String strM1033 = m1033(impressionData);
        int i2 = f933 + 71;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1033;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1048() {
        f934 = (f933 + 95) % 128;
        boolean zM1040 = m1040();
        f934 = (f933 + 109) % 128;
        return zM1040;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1054(FairBid.AdsConfig adsConfig) {
        int i2 = f933 + 85;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        String strM1070 = m1070(adsConfig);
        if (i3 != 0) {
            int i4 = 19 / 0;
        }
        f933 = (f934 + 97) % 128;
        return strM1070;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1057(FairBid.AdsConfig adsConfig) {
        int i2 = f933 + 113;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1063(adsConfig);
        }
        m1063(adsConfig);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1066(InterstitialListener interstitialListener) {
        int i2 = f933 + 101;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        m1055(interstitialListener);
        if (i3 != 0) {
            throw null;
        }
        f933 = (f934 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1069(String str) {
        f934 = (f933 + 87) % 128;
        Constants.AdType adTypeM1046 = m1046(str);
        f934 = (f933 + 13) % 128;
        return adTypeM1046;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1076(ImpressionData impressionData) {
        int i2 = f933 + 31;
        f934 = i2 % 128;
        if (i2 % 2 != 0) {
            m1036(impressionData);
            throw null;
        }
        String strM1036 = m1036(impressionData);
        f933 = (f934 + 17) % 128;
        return strM1036;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0082  */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Constants.AdType m1046(String str) {
        byte b2 = 0;
        switch (str.hashCode()) {
            case -1372958932:
                if (!str.equals(m1059("\udc59䗭䨊망綮䠳\uf89e\ue956\uf89e\ue956Ꝥ⯆", TextUtils.getTrimmedLength("") + 12).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f934 + 33;
                    f933 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 433141802:
                if (!str.equals(m1059("™爫욇\uf770砲摋羦햆", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6).intern())) {
                    b2 = -1;
                }
                break;
            case 543046670:
                if (!str.equals(m1059("轀툍뙮赾뾕륐햻츬", Color.rgb(0, 0, 0) + 16777224).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 1951953708:
                if (!str.equals(m1059("캎‧\uebc6≣⸶玏", 6 - (Process.myTid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b2 == 1) {
            return Constants.AdType.BANNER;
        }
        if (b2 == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (b2 == 3) {
            return Constants.AdType.REWARDED;
        }
        f933 = (f934 + 109) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static PlacementsHandler m1052(MediationManager mediationManager) {
        int i2 = f934 + 85;
        f933 = i2 % 128;
        int i3 = i2 % 2;
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1058(ImpressionData impressionData) {
        f934 = (f933 + 101) % 128;
        String strM1038 = m1038(impressionData);
        f933 = (f934 + 99) % 128;
        return strM1038;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1071(ImpressionData impressionData) {
        f933 = (f934 + 23) % 128;
        String strM1039 = m1039(impressionData);
        int i2 = f933 + 23;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1039;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        int i2 = f933 + 31;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            byte b2 = 0;
            switch (str.hashCode()) {
                case -2041833493:
                    if (!str.equals(m1053((byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 73), "\t\u0003\u0000\u0019\u0006\u0002\u0007\u0010¸¸µ", 11 - Color.blue(0)).intern())) {
                        b2 = -1;
                    } else {
                        int i3 = f934 + 49;
                        f933 = i3 % 128;
                        b2 = i3 % 2 != 0 ? (byte) 16 : (byte) 67;
                    }
                    break;
                case -1598046662:
                    b2 = !str.equals(m1053((byte) (83 - TextUtils.lastIndexOf("", '0', 0)), "\u0001\u0002\u0003\u0004\u0005\u0006\u0004\u0000\b\r\u0000\r\n\u0006»", 15 - View.MeasureSpec.getSize(0)).intern()) ? (byte) -1 : (byte) 4;
                    break;
                case -1115843213:
                    b2 = !str.equals(m1059("澏羷븵⁷≨즏ᶳ束\ud9b0ꙴ鎂₷從ࡡ", 14 - (ViewConfiguration.getTapTimeout() >> 16)).intern()) ? (byte) -1 : (byte) 9;
                    break;
                case -847426041:
                    if (!str.equals(m1059("\ue776Ȍ橫덷\uea5e\ud995杨⚹\ud9b0ꙴ퇤뷰ﳃ虉왠봀\uf81b鎟\ud9b0ꙴ", Color.blue(0) + 20).intern())) {
                        b2 = -1;
                    } else {
                        int i4 = f934 + 117;
                        f933 = i4 % 128;
                        b2 = i4 % 2 != 0 ? (byte) 17 : (byte) 41;
                    }
                    break;
                case -498060603:
                    if (!str.equals(m1053((byte) (59 - View.getDefaultSize(0, 0)), "\u000f\u0010\u0002\u0012\u0003\u000f\u0000\b¯", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9).intern())) {
                        b2 = -1;
                    } else {
                        int i5 = f933 + 7;
                        f934 = i5 % 128;
                        b2 = i5 % 2 == 0 ? (byte) 6 : (byte) 111;
                    }
                    break;
                case -368841467:
                    b2 = !str.equals(m1053((byte) (ExpandableListView.getPackedPositionGroup(0L) + 46), "\u000b\u0005\u0017\u001e\u0002\u0003\t\u0003", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8).intern()) ? (byte) -1 : (byte) 14;
                    break;
                case -174936018:
                    if (!str.equals(m1059("乼䁳ꏯ蛍뎎닰ⷲ\ue3af", 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        f933 = (f934 + 119) % 128;
                        b2 = 12;
                    }
                    break;
                case 99044255:
                    if (!str.equals(m1053((byte) TextUtils.indexOf("", "", 0), "\u000f\u0010\u0002\u0012\u0003\u000f\u0000\b\f\u001a\u000e\u001be", 13 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        int i6 = f933 + 117;
                        f934 = i6 % 128;
                        b2 = i6 % 2 == 0 ? (byte) 11 : (byte) 58;
                    }
                    break;
                case 438795617:
                    b2 = !str.equals(m1059("邍靽\ueb0cꃝ㹹୨䳂瘤Ꞥ攽寂\udb1e嘲럲", 14 - (Process.myPid() >> 22)).intern()) ? (byte) -1 : (byte) 15;
                    break;
                case 578208537:
                    if (!str.equals(m1059("ꗫ캚Ʝ\ue282\uf8fdє냿뙒", 7 - TextUtils.getOffsetAfter("", 0)).intern())) {
                        b2 = -1;
                    }
                    break;
                case 769047372:
                    if (!str.equals(m1059("ꎘ清\uea5e\ud995㺧찿\uf81b鎟\uf81b鎟䭓㖫", (ViewConfiguration.getScrollBarSize() >> 8) + 12).intern())) {
                        b2 = -1;
                    } else {
                        f934 = (f933 + 11) % 128;
                        b2 = 10;
                    }
                    break;
                case 806552769:
                    b2 = str.equals(m1053((byte) (53 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0017\u0018\u0003\u001b\u001a\u0016\u0006\u0004\u0000\r¨", 10 - ((byte) KeyEvent.getModifierMetaStateMask())).intern()) ? (byte) 13 : (byte) -1;
                    break;
                case 1062384924:
                    b2 = !str.equals(m1053((byte) (Color.red(0) + 107), "\u000f\u0010\u0002\u0012\u0003\u000f\u0000\b\u0004\f\u0019\u000b\t\u0000\u0016\bÝ", 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 5;
                    break;
                case 1212533506:
                    if (!str.equals(m1059("乼䁳ꏯ蛍뎎닰ⷲ\ue3af䁯䋘ി⢆䤐頲嘲럲", MotionEvent.axisFromString("") + 17).intern())) {
                        b2 = -1;
                    } else {
                        f933 = (f934 + 41) % 128;
                        b2 = 8;
                    }
                    break;
                case 1297340448:
                    if (!str.equals(m1059("ꎘ清\uea5e\ud995㺧찿\uf81b鎟\uf81b鎟䭓㖫䁯䋘ി⢆䤐頲嘲럲", 20 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        b2 = -1;
                    } else {
                        int i7 = f934 + 51;
                        f933 = i7 % 128;
                        b2 = i7 % 2 != 0 ? (byte) 7 : (byte) 63;
                    }
                    break;
                case 1775008410:
                    b2 = !str.equals(m1059("迂齈䤐頲睡₈㌵❏矆퉈虢鐿", 10 - ExpandableListView.getPackedPositionChild(0L)).intern()) ? (byte) -1 : (byte) 18;
                    break;
                case 1884304309:
                    b2 = !str.equals(m1053((byte) (7 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "\u0001\u0002\u0003\u0004\u0005\u0006\u0004\u0000\u000e\u0007\u0000\u000b\u0001\u000b\u0002\b", 15 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case 1955869213:
                    b2 = !str.equals(m1059("\ue776Ȍᨾ깼ꭶ\ue93f", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5).intern()) ? (byte) -1 : (byte) 2;
                    break;
                case 1969669106:
                    b2 = 3;
                    if (!str.equals(m1053((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3), "\t\u0003\f\r\u0000\r\n\u0006j", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 8).intern())) {
                        b2 = -1;
                    } else {
                        f934 = (f933 + 119) % 128;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return FairBid.class;
                case 1:
                    return MediationManager.class;
                case 2:
                    return Constants.AdType.class;
                case 3:
                    return FairBid.AdsConfig.class;
                case 4:
                    return MediationConfig.class;
                case 5:
                    return PlacementsHandler.class;
                case 6:
                    return Placement.class;
                case 7:
                    return InterstitialListener.class;
                case 8:
                    return RewardedListener.class;
                case 9:
                    return ImpressionData.class;
                case 10:
                    return Interstitial.class;
                case 11:
                    return PlacementType.class;
                case 12:
                    return Rewarded.class;
                case 13:
                    return ShowOptions.class;
                case 14:
                    return CachedAd.class;
                case 15:
                    return NetworkAdapter.class;
                case 16:
                    return AdapterPool.class;
                case 17:
                    return AdapterConfiguration.class;
                case 18:
                    return EventStream.class;
                default:
                    return null;
            }
        }
        str.hashCode();
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f934 + 93;
        f933 = i2 % 128;
        try {
            try {
                return (String) (i2 % 2 == 0 ? FairBid.class.getDeclaredField(m1059("嚽骺涴븈塎㛧綮䠳₺媯羦햆", (-16777205) >> Color.rgb(0, 1, 1)).intern()) : FairBid.class.getDeclaredField(m1059("嚽骺涴븈塎㛧綮䠳₺媯羦햆", (-16777205) - Color.rgb(0, 0, 0)).intern())).get(null);
            } catch (Exception unused) {
                return hr.m2242().m2245().m2314(FairBid.class, m1053((byte) (KeyEvent.keyCodeFromString("") + 116), "\u001b\u0015\u001e\u0000\u001e\u001f\u0018\"\"\u0016\u001e\u0000\u001e\u001f\u0018\"\"\u0016\u001e\u0000\u001e\u001f\u0098", 23 - View.MeasureSpec.getSize(0)).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1055(InterstitialListener interstitialListener) {
        int i2 = f933 + 99;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = f934 + 109;
        f933 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1061(RewardedListener rewardedListener) {
        int i2 = f933 + 81;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        m1067(rewardedListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f934 + 23;
        f933 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1072(Placement placement) {
        int i2 = f934 + 45;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            m1065(placement);
            throw null;
        }
        String strM1065 = m1065(placement);
        int i3 = f934 + 71;
        f933 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 44 / 0;
        }
        return strM1065;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1053(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f936;
                char c2 = f935;
                char[] cArr3 = new char[i2];
                if (i2 % 2 != 0) {
                    i2--;
                    cArr3[i2] = (char) (cArr[i2] - b2);
                }
                if (i2 > 1) {
                    i.f2348 = 0;
                    while (true) {
                        int i3 = i.f2348;
                        if (i3 >= i2) {
                            break;
                        }
                        i.f2347 = cArr[i3];
                        i.f2345 = cArr[i.f2348 + 1];
                        if (i.f2347 == i.f2345) {
                            cArr3[i.f2348] = (char) (i.f2347 - b2);
                            cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                        } else {
                            i.f2346 = i.f2347 / c2;
                            i.f2342 = i.f2347 % c2;
                            i.f2344 = i.f2345 / c2;
                            i.f2341 = i.f2345 % c2;
                            if (i.f2342 == i.f2341) {
                                i.f2346 = a.b(i.f2346, c2, 1, c2);
                                i.f2344 = a.b(i.f2344, c2, 1, c2);
                                int i4 = (i.f2346 * c2) + i.f2342;
                                int i5 = (i.f2344 * c2) + i.f2341;
                                int i6 = i.f2348;
                                cArr3[i6] = cArr2[i4];
                                cArr3[i6 + 1] = cArr2[i5];
                            } else if (i.f2346 == i.f2344) {
                                i.f2342 = a.b(i.f2342, c2, 1, c2);
                                i.f2341 = a.b(i.f2341, c2, 1, c2);
                                int i7 = (i.f2346 * c2) + i.f2342;
                                int i8 = (i.f2344 * c2) + i.f2341;
                                int i9 = i.f2348;
                                cArr3[i9] = cArr2[i7];
                                cArr3[i9 + 1] = cArr2[i8];
                            } else {
                                int i10 = (i.f2346 * c2) + i.f2341;
                                int i11 = (i.f2344 * c2) + i.f2342;
                                int i12 = i.f2348;
                                cArr3[i12] = cArr2[i10];
                                cArr3[i12 + 1] = cArr2[i11];
                            }
                        }
                        i.f2348 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m1073(MediationConfig mediationConfig) {
        int i2 = f934 + 19;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return m1060(mediationConfig);
        }
        m1060(mediationConfig);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1059("౺⁖\ueb33짧ⷲ\ue3af喣\ue790\uf81b鎟\ud9b0ꙴ졩ꖥ㘄ᵀ౺⁖橇艹꿮獗從ࡡຟ鲋\uef3d꺓", 27 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1043();
            }
        });
        map.put(m1059("౺⁖ꆄ࠘嬸枙齡먞䷫\ue190硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43ᨾ깼ꭶ\ue93f", Color.alpha(0) + 22).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1068((Constants.AdType) list.get(0));
            }
        });
        map.put(m1053((byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 27), "\u000f\b\f(\u000e\u0018\b\u0002\u008e\u008e\u0004\u0000\r\u001c\u0005\u0006\u0000\u0012\u0012\u0001\u000f\u0002\u000f\u0003\f\u0000\u0014\u000e\u0016\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.11
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1051((ImpressionData) list.get(0));
            }
        });
        map.put(m1059("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡壥\u0590䤐頲ཱ喽\ue9e4朁䶼ʕ丏ꀣ䢆\udb67", (ViewConfiguration.getEdgeSlop() >> 16) + 29).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.19
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1064((ImpressionData) list.get(0));
            }
        });
        map.put(m1053((byte) (9 - Color.alpha(0)), "\u000f\b\f(\u000e\u0018\b\u0002||\u0004\u0000\r\u001c\u0005\u0006\u0000'\u0000\b\u0003\u0002\n\u0002\b\t\u0017\u0001%&\u0002\b\n\u0004\u0000\r", 36 - Color.alpha(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.17
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1076((ImpressionData) list.get(0));
            }
        });
        map.put(m1053((byte) (View.resolveSize(0, 0) + 62), "\u000f\b\f(\u000e\u0018\b\u0002±±\u0004\u0000\r\u001c\u0005\u0006\u0006 \u0003\u000f\u0000\u000b\u0001\u0017\u0003)\u0010\u0017£", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.18
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1058((ImpressionData) list.get(0));
            }
        });
        map.put(m1053((byte) (ExpandableListView.getPackedPositionChild(0L) + 36), "\u000f\b\f(\u000e\u0018\b\u0002\u0096\u0096\u0004\u0000\r\u001c\u0005\u0006\u0002'\u0002\u000b\u0004\u0005\f\u0000\u001e\u0005", 26 - KeyEvent.getDeadChar(0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.20
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1071((ImpressionData) list.get(0));
            }
        });
        map.put(m1059("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡\ue5fc㦲ꩬ阃ꤥ泮楀\ue614졭㗾", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.16
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Double.valueOf(bq.m1049((ImpressionData) list.get(0)));
            }
        });
        map.put(m1053((byte) (6 - (ViewConfiguration.getTapTimeout() >> 16)), "\u000f\b\f(\u000e\u0018\b\u0002yy\u0004\u0000\r\u001c\u0005\u0006\u0005\u000b\b\u0002\u0005\u0006\u0004&\u0005\u001dj", 27 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.24
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1044((ImpressionData) list.get(0));
            }
        });
        map.put(m1059("౺⁖弒懠㣼ﴎ㞒惋ゎᵬﬅ薶⌷\udee2잤컡䖦卧蟫\uf7f0嘲럲\uf81b鎟옥喪霑ࠐ懵쩧\ud9c6기㥿侵", Drawable.resolveOpacity(0, 0) + 33).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1047((ImpressionData) list.get(0));
            }
        });
        map.put(m1053((byte) (5 - View.resolveSize(0, 0)), "\u000f\b\f(\u000e\u0018\b\u0002xx\u0004\u0000\r\u001c\u0005\u0006\u0005\u000b\u0003\u0012\u0019\u0000\u0001\n\f\u001ci", ((byte) KeyEvent.getModifierMetaStateMask()) + 28).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1045((ImpressionData) list.get(0));
            }
        });
        map.put(m1059("౺⁖ꆄ࠘ぇ≭ɾ묬", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1057((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1059("౺⁖睡₈컄൚㞒惋", TextUtils.indexOf("", "", 0, 0) + 8).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1054((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1053((byte) ((Process.myPid() >> 22) + 25), "\u000f\b\u0003\f\u0003\u0005\u001a\u0000\u0002\b\r\u0005\b\u0007\u0001\n%\n\u0005\u0006\u0004\u0000\b\f", (ViewConfiguration.getPressedStateDuration() >> 16) + 24).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1073((MediationConfig) list.get(0));
            }
        });
        map.put(m1059("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43\ue776Ȍᨾ깼ꭶ\ue93f", ((byte) KeyEvent.getModifierMetaStateMask()) + 19).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1056((Placement) list.get(0));
            }
        });
        map.put(m1059("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43땙Ⓥ\ue663ꝫ", 15 - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1072((Placement) list.get(0));
            }
        });
        map.put(m1059("౺⁖䇶岐硊᭭ᄣ⬝\ue663ꝫ\uf238\uea43\ueaa7팚⣞銥識\u177d嘲럲", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1075((MediationManager) list.get(0));
            }
        });
        map.put(m1053((byte) (Color.red(0) + 124), "\u000f\b\u0003\f\u0005\u0010\u000e\u001b\u0005$\n#é", 12 - TextUtils.lastIndexOf("", '0', 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bq.m1069((String) list.get(0));
            }
        });
        map.put(m1059("옥喪弒懠\uf238\uea43嘲럲ി⢆䓐⼑喣\ue790訔\uef54퀏ꪰ\uea5e\ud995邅뾠䃲ꦬ", Gravity.getAbsoluteGravity(0, 0) + 23).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bq.m1066((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1053((byte) (64 - (ViewConfiguration.getTapTimeout() >> 16)), "\b\u0004\u0000(\u0003\u0016\u0002\u000b\u0003\u0002\u0006%\u0004\n\u0006\u0002\b\u0000²", (ViewConfiguration.getTouchSlop() >> 8) + 19).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bq.m1061((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1053((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 119), "\u000b\u0012\b\u0004\f\u0002\u001a\u0001\u0002\u000b\u0006\u0002Ú", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 13).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(bq.m1048());
            }
        });
        int i2 = f933 + 79;
        f934 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1070(FairBid.AdsConfig adsConfig) {
        int i2 = f933 + 67;
        f934 = i2 % 128;
        int i3 = i2 % 2;
        String str = adsConfig.store;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Constants.AdType m1074(Placement placement) {
        int i2 = f934 + 91;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            placement.getAdType();
            throw null;
        }
        Constants.AdType adType = placement.getAdType();
        f933 = (f934 + 125) % 128;
        return adType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1060(MediationConfig mediationConfig) {
        int i2 = f934 + 71;
        f933 = i2 % 128;
        if (i2 % 2 != 0) {
            return mediationConfig.getAdapterConfigurations();
        }
        mediationConfig.getAdapterConfigurations();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1059(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f938)) ^ ((c3 >>> 5) + f937)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f939) ^ ((c4 + i4) ^ ((c4 << 4) + f940))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static PlacementType m1062(Constants.AdType adType) {
        int i2 = f934 + 53;
        f933 = i2 % 128;
        int i3 = i2 % 2;
        PlacementType placementType = adType.getPlacementType();
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1063(FairBid.AdsConfig adsConfig) {
        f934 = (f933 + 7) % 128;
        String str = adsConfig.appId;
        f933 = (f934 + 95) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1065(Placement placement) {
        int i2 = f934 + 65;
        f933 = i2 % 128;
        if (i2 % 2 == 0) {
            placement.getName();
            throw null;
        }
        String name = placement.getName();
        f933 = (f934 + 103) % 128;
        return name;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1067(RewardedListener rewardedListener) {
        f934 = (f933 + 5) % 128;
        Rewarded.setRewardedListener(rewardedListener);
        f933 = (f934 + 61) % 128;
    }
}
