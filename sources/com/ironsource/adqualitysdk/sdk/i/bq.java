package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
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
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bq extends be {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f939 = -3790025977869497559L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f940 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f941 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f938 = {'A', 55839, 46213, 36658, 27011, 17417, 7812, 63796, 54207, 63431, 11668, 17176, 30866, 40455, 45977, 59649, 3768, 9276, 22938, 32555, 38061, 51752, 61404, 1367, 'P', 55831, 46231, 36626, 27017, 17418, 7815, 63795, 54188, 44576, 34950, 25384, 15786, 6235, 62166, 52560, 42946, 'P', 55831, 46231, 36626, 27017, 17418, 7815, 63795, 54188, 27060, 46059, 56699, 59134, 't', 11753, 30572, 37065, 47690, 51136, 57719, 2773, 21581, 29091, 37036, 19184, 9319, 8177, 63867, 54513, 36467, 27089, 17225, 16095, 6218, 62400, 23926, 34618, 59813, 53812, 13498, 6439, 17315, 42013, 39416, 17313, 11566, 5794, 61490, 56760, 34584, 24706, 'N', 55838, 46210, 36614, 27011, 17429, 7817, 63772, 54204, 44594, 35006, 25405, 15777, 6221, 53760, 2142, 26326, 23872, 48089, 38467, 52433, 11103, 502, 31868, 23273, 45409, 61410, 51723, 8329, 7957, 30085, 20483, 36488, 58638, 18678, 37566, 64544, 51116, 8491, 3207, 22053, 45468, 39694, 59009, 49168, 41850, 30979, 6047, 11309, 51861, 59182, 48518, 23088, 28832, 3358, 11199, 49205, 40634, 47943, 20938, 28237, 1219, 8514, 65519, 37957, 45809, 20335, 23589, 34396, 59584, 54138, 13763, 6229, 17106, 42362, 36841, 62050, 54501, 16228, 25064, 17465, 44697, 37123, 64403, 56891, 129, 27405, 19898, 45104, 39586, 64806, 10148, 2598, 27759, 22239, 47453, 55465, 720, 27724, 22518, 45391, 40153, 50782, 8694, 2917, 30446, 20585, 48104, 58724, 49333, 10773, 5519, 32543, 23206, 33818, 61322, 51507, 13485, 7733, 31157, 41763, 36484, 59604, 'g', 55838, 46210, 36664, 27009, 17431, 7824, 63800, 54187, 44576, 34983, 25382, 15786, 6267, 62171, 52545, 42961, 33384, 23751, 14156, 4588, 60534, 50939, 41322, 31718, 22090, 12314, 'g', 55838, 46210, 36656, 27036, 17431, 7851, 63801, 'g', 55838, 46210, 36642, 27032, 17416, 7824, 63800, 'g', 55838, 46210, 36656, 27016, 17414, 7826, 63785, 54205, 44577, 34957, 25382, 15786, 6233, 62163, 52562, 42949, 33369, 23751, 14165, 4597, 60536, 50940, 41342, 'g', 55838, 46210, 36641, 27008, 17414, 7809, 63800, 54197, 44598, 34976, 25405, 15749, 6235, 62190, 52556, 42944, 33358, 46629, 27740, 704, 14691, 57282, 62020, 43203, 20346, 26103, 6260, 16098, 54655, 35784, 44572, 17557, 31506, 37566, 18631, 9819, 7672, 64345, 55007, 35928, 27617, 16748, 15599, 6777, 61924, 44910, 35502, 24578, 24450, 13581, 4254, 52762, 42378, 1266, 56991, 45059, 35746, 27912, 16529, 6658, 64942, 55101, 43703, 35883, 26500, 14636, 7373, 63055, 51665, 41823, 34511, 22613, 'B', 55866, 46264, 36671, 27049, 17461, 'I', 55861, 46242, 36660, 27070, 17460, 7862, 63764, 54156, 44570, 34959, 25349, 45031, 30091, 6932, 8325, 50699, 60310, 45330, 22188};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f937 = 7454736665033955963L;

    public bq(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static String m1068(ImpressionData impressionData) {
        int i10 = f941 + 71;
        f940 = i10 % 128;
        if (i10 % 2 == 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static String m1069(ImpressionData impressionData) {
        f940 = (f941 + 85) % 128;
        String creativeId = impressionData.getCreativeId();
        int i10 = f940 + 3;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return creativeId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static String m1070(ImpressionData impressionData) {
        f940 = (f941 + InterfaceC0435l1.d.b.f29109f) % 128;
        String campaignId = impressionData.getCampaignId();
        int i10 = f940 + 123;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return campaignId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static double m1071(ImpressionData impressionData) {
        f941 = (f940 + 125) % 128;
        double netPayout = impressionData.getNetPayout();
        f940 = (f941 + 115) % 128;
        return netPayout;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static String m1072(ImpressionData impressionData) {
        f940 = (f941 + 59) % 128;
        String demandSource = impressionData.getDemandSource();
        int i10 = f940 + 55;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return demandSource;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static MediationManager m1073() {
        f940 = (f941 + 75) % 128;
        MediationManager companion = MediationManager.Companion.getInstance();
        int i10 = f941 + 11;
        f940 = i10 % 128;
        if (i10 % 2 == 0) {
            return companion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static String m1075(ImpressionData impressionData) {
        f941 = (f940 + 59) % 128;
        String renderingSdk = impressionData.getRenderingSdk();
        f940 = (f941 + 117) % 128;
        return renderingSdk;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static String m1077(ImpressionData impressionData) {
        int i10 = f940 + 41;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        String variantId = impressionData.getVariantId();
        if (i11 == 0) {
            int i12 = 30 / 0;
        }
        f941 = (f940 + 55) % 128;
        return variantId;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ String m1078(ImpressionData impressionData) {
        f940 = (f941 + 69) % 128;
        String strM1070 = m1070(impressionData);
        int i10 = f941 + 29;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
        return strM1070;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ double m1080(ImpressionData impressionData) {
        f941 = (f940 + InterfaceC0435l1.d.b.f29107d) % 128;
        double dM1071 = m1071(impressionData);
        f940 = (f941 + 107) % 128;
        return dM1071;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static PlacementType m1082(ImpressionData impressionData) {
        int i10 = f940 + 43;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ MediationManager m1083() {
        int i10 = f941 + 27;
        f940 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1073();
        }
        m1073();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ String m1085(ImpressionData impressionData) {
        int i10 = f941 + 9;
        f940 = i10 % 128;
        int i11 = i10 % 2;
        String strM1068 = m1068(impressionData);
        if (i11 != 0) {
            int i12 = 86 / 0;
        }
        f940 = (f941 + 7) % 128;
        return strM1068;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ PlacementsHandler m1087(MediationManager mediationManager) {
        f940 = (f941 + 95) % 128;
        PlacementsHandler placementsHandlerM1106 = m1106(mediationManager);
        int i10 = f940 + 83;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return placementsHandlerM1106;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1093(ImpressionData impressionData) {
        f941 = (f940 + 51) % 128;
        String strM1077 = m1077(impressionData);
        f940 = (f941 + 75) % 128;
        return strM1077;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1098(ImpressionData impressionData) {
        f940 = (f941 + 67) % 128;
        String strM1075 = m1075(impressionData);
        int i10 = f940 + 37;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1075;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1100(ImpressionData impressionData) {
        int i10 = f941 + 31;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            m1082(impressionData);
            throw null;
        }
        PlacementType placementTypeM1082 = m1082(impressionData);
        int i11 = f941 + 27;
        f940 = i11 % 128;
        if (i11 % 2 == 0) {
            return placementTypeM1082;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1104(Placement placement) {
        f941 = (f940 + 45) % 128;
        Constants.AdType adTypeM1086 = m1086(placement);
        f941 = (f940 + 3) % 128;
        return adTypeM1086;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static String m1074(ImpressionData impressionData) {
        int i10 = f940 + 115;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean m1076() {
        boolean zAssertStarted;
        int i10 = f941 + 63;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            zAssertStarted = FairBid.assertStarted();
            int i11 = 63 / 0;
        } else {
            zAssertStarted = FairBid.assertStarted();
        }
        f940 = (f941 + 77) % 128;
        return zAssertStarted;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1079() {
        f940 = (f941 + 57) % 128;
        boolean zM1076 = m1076();
        f941 = (f940 + InterfaceC0435l1.d.b.f29112i) % 128;
        return zM1076;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Constants.AdType m1081(String str) {
        int i10 = f941 + 99;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(m1092((char) (ViewConfiguration.getEdgeSlop() >> 16), 361 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11).intern())) {
                    int i11 = f941 + InterfaceC0435l1.d.b.f29109f;
                    f940 = i11 % 128;
                    b10 = i11 % 2 == 0 ? (byte) 2 : (byte) 5;
                }
                break;
            case 433141802:
                if (str.equals(m1095("\u0b7c퓢둨门畲囧㙹", ((Process.getThreadPriority(0) + 20) >> 6) + 57221).intern())) {
                    b10 = 0;
                }
                break;
            case 543046670:
                if (str.equals(m1092((char) ((Process.myTid() >> 22) + 44981), 373 - Color.red(0), (Process.myTid() >> 22) + 8).intern())) {
                    f941 = (f940 + InterfaceC0435l1.d.b.f29109f) % 128;
                    b10 = 3;
                }
                break;
            case 1951953708:
                if (str.equals(m1092((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 354, Color.rgb(0, 0, 0) + 16777222).intern())) {
                    b10 = 1;
                }
                break;
        }
        if (b10 == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (b10 == 1) {
            return Constants.AdType.BANNER;
        }
        if (b10 == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (b10 != 3) {
            return null;
        }
        return Constants.AdType.REWARDED;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ String m1084(ImpressionData impressionData) {
        int i10 = f941 + 31;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            m1069(impressionData);
            throw null;
        }
        String strM1069 = m1069(impressionData);
        int i11 = f940 + 87;
        f941 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM1069;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1088(FairBid.AdsConfig adsConfig) {
        f940 = (f941 + 47) % 128;
        String strM1107 = m1107(adsConfig);
        int i10 = f941 + 65;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 56 / 0;
        }
        return strM1107;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<AdapterConfiguration> m1096(MediationConfig mediationConfig) {
        int i10 = f940 + InterfaceC0435l1.d.b.f29105b;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return mediationConfig.getAdapterConfigurations();
        }
        mediationConfig.getAdapterConfigurations();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1099(Placement placement) {
        f940 = (f941 + 59) % 128;
        String strM1094 = m1094(placement);
        int i10 = f941 + 61;
        f940 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1094;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ PlacementType m1101(Constants.AdType adType) {
        f940 = (f941 + 27) % 128;
        PlacementType placementTypeM1103 = m1103(adType);
        int i10 = f940 + 41;
        f941 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 86 / 0;
        }
        return placementTypeM1103;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Constants.AdType m1105(String str) {
        f940 = (f941 + 29) % 128;
        Constants.AdType adTypeM1081 = m1081(str);
        f940 = (f941 + InterfaceC0435l1.d.b.f29112i) % 128;
        return adTypeM1081;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1089(ImpressionData impressionData) {
        f940 = (f941 + 67) % 128;
        String strM1072 = m1072(impressionData);
        int i10 = f940 + 49;
        f941 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 92 / 0;
        }
        return strM1072;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1094(Placement placement) {
        int i10 = f940 + 83;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        String name = placement.getName();
        if (i11 == 0) {
            int i12 = 55 / 0;
        }
        int i13 = f941 + 71;
        f940 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 99 / 0;
        }
        return name;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1102(FairBid.AdsConfig adsConfig) {
        int i10 = f941 + 29;
        f940 = i10 % 128;
        int i11 = i10 % 2;
        String strM1097 = m1097(adsConfig);
        if (i11 != 0) {
            int i12 = 61 / 0;
        }
        return strM1097;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1108(ImpressionData impressionData) {
        int i10 = f941 + 21;
        f940 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1074(impressionData);
        }
        m1074(impressionData);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        f940 = (f941 + 121) % 128;
        switch (str.hashCode()) {
            case -2041833493:
                if (str.equals(m1095("୨阘㇢\udca6縉᧥꒥䘪\ue1ee費⸗", View.resolveSize(0, 0) + 40277).intern())) {
                    return AdapterPool.class;
                }
                return null;
            case -1598046662:
                if (str.equals(m1092((char) (63371 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 9 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16).intern())) {
                    return MediationConfig.class;
                }
                return null;
            case -1115843213:
                if (str.equals(m1092((char) (27133 - View.combineMeasuredStates(0, 0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, Color.red(0) + 14).intern())) {
                    return ImpressionData.class;
                }
                return null;
            case -847426041:
                if (str.equals(m1092((char) ((KeyEvent.getMaxKeyCode() >> 16) + 53825), View.MeasureSpec.getMode(0) + 106, 20 - (Process.myPid() >> 22)).intern())) {
                    return AdapterConfiguration.class;
                }
                return null;
            case -498060603:
                if (str.equals(m1092((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 42 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 9 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return Placement.class;
                }
                return null;
            case -368841467:
                if (!str.equals(m1092((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 39355), TextUtils.indexOf("", "", 0, 0) + 84, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8).intern())) {
                    return null;
                }
                int i10 = f940 + 65;
                f941 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return CachedAd.class;
            case -174936018:
                if (str.equals(m1092((char) (23845 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 75 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 8).intern())) {
                    return Rewarded.class;
                }
                return null;
            case 99044255:
                if (str.equals(m1095("\u0b79睴\uf32a翙ﮈ枱\ue26a渐\uead5囄튺嵂\ud900", TextUtils.lastIndexOf("", '0') + 31794).intern())) {
                    return PlacementType.class;
                }
                return null;
            case 438795617:
                if (!str.equals(m1092((char) Color.blue(0), 93 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 14 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return null;
                }
                f941 = (f940 + 81) % 128;
                return NetworkAdapter.class;
            case 578208537:
                if (str.equals(m1095("୯䤻辦찂ʧ䝿藿", 17011 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return FairBid.class;
                }
                return null;
            case 769047372:
                if (str.equals(m1092((char) (37093 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 64 - Color.red(0), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    return Interstitial.class;
                }
                return null;
            case 806552769:
                if (!str.equals(m1095("\u0b7aⶮ䚘羓郚짲\ue2c7ᯉ㰾唠踌", 9967 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f940 = (f941 + 39) % 128;
                return ShowOptions.class;
            case 1062384924:
                if (str.equals(m1092((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 25 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 17 - (Process.myTid() >> 22)).intern())) {
                    return PlacementsHandler.class;
                }
                return null;
            case 1212533506:
                if (!str.equals(m1095("\u0b7b쇹鸴歗\u218fﻄ쭲膾廍⬝\ue048뺚謰䁶Ẫ\uebc0", TextUtils.indexOf("", "", 0, 0) + 51893).intern())) {
                    return null;
                }
                f941 = (f940 + 125) % 128;
                return RewardedListener.class;
            case 1297340448:
                if (str.equals(m1095("ୠ窲\ue8b7库첏㊓ꃣᛳ蓵\u0add磚\ueec2尙숱〼ꘆᐜ騂ࡶ繴", (ViewConfiguration.getTapTimeout() >> 16) + 29173).intern())) {
                    return InterstitialListener.class;
                }
                return null;
            case 1775008410:
                if (str.equals(m1092((char) (18611 - (ViewConfiguration.getPressedStateDuration() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + WebSocketProtocol.PAYLOAD_SHORT, TextUtils.lastIndexOf("", '0', 0, 0) + 12).intern())) {
                    return EventStream.class;
                }
                return null;
            case 1884304309:
                if (str.equals(m1095("\u0b64≝奯灳꼌예ﴦᐱ䏏竽釢주\ue784ẓ㖢沤", 10513 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return MediationManager.class;
                }
                return null;
            case 1955869213:
                if (str.equals(m1095("୨⃮尻覹ꗕ텣", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11170).intern())) {
                    return Constants.AdType.class;
                }
                return null;
            case 1969669106:
                if (!str.equals(m1092((char) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 1, View.resolveSizeAndState(0, 0, 0) + 9).intern())) {
                    return null;
                }
                int i11 = f941 + 65;
                f940 = i11 % 128;
                if (i11 % 2 == 0) {
                    return FairBid.AdsConfig.class;
                }
                return PlacementsHandler.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1090(InterstitialListener interstitialListener) {
        int i10 = f940 + 27;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        m1110(interstitialListener);
        if (i11 == 0) {
            int i12 = 85 / 0;
        }
        int i13 = f940 + 115;
        f941 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1095(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2435) {
            try {
                i.f2436 = i10;
                char[] cArr2 = new char[cArr.length];
                i.f2434 = 0;
                while (true) {
                    int i11 = i.f2434;
                    if (i11 < cArr.length) {
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f939);
                        i.f2434++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m1109(MediationConfig mediationConfig) {
        int i10 = f940 + 53;
        f941 = i10 % 128;
        if (i10 % 2 == 0) {
            m1096(mediationConfig);
            throw null;
        }
        List<AdapterConfiguration> listM1096 = m1096(mediationConfig);
        int i11 = f941 + 23;
        f940 = i11 % 128;
        if (i11 % 2 == 0) {
            return listM1096;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1095("\u0b4eࣥఏƟרᤀẶ\u12d7ᘕ⮱\u2fdc⌄₈ⓝ㡹㶯㇞㕵䪹仫䉳䞇寛彧岟僋呦", Process.getGidForName("") + 938).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1083();
            }
        });
        map.put(m1092((char) (41758 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 137, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1101((Constants.AdType) list.get(0));
            }
        });
        map.put(m1095("\u0b4e\udbc9꩗端䥐ᧀ\ue845룯轲忷\u2e72ﻱ쵻鶬氎㲖̘펬ꈟ犗䄮ᆥ\ue02a낿蜿垠⛿\uf557엕鑝", TextUtils.getCapsMode("", 0, 0) + 53381).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1100((ImpressionData) list.get(0));
            }
        });
        map.put(m1092((char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 23618), 160 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 29).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.20
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1098((ImpressionData) list.get(0));
            }
        });
        map.put(m1095("\u0b4e巡ꘇཧ凰머͕嗷븲ݏ概눩᭛涤똾\u1f7e憘쨆፦斐컉\u177d禅싋⭿綫웨⽲熮\udae6⌊疨\udefa✍覼틠", (ViewConfiguration.getJumpTapTimeout() >> 16) + 22189).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.18
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1108((ImpressionData) list.get(0));
            }
        });
        map.put(m1095("\u0b4eꀁ巇ઇ꙰变\u0895ꑗ儲\u0eef멂圉\u0cdb름啾˞뾘歰&뷳楌ؖ돓梑Ѿ뇙溉ᩕ뜠", (Process.myPid() >> 22) + 43853).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.17
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1089((ImpressionData) list.get(0));
            }
        });
        map.put(m1095("\u0b4e䝭錟\uef03㯀矼쎝ᾫ橒꙳\uf20a中髋훀⊆纲쥘Վ儚괨倫㗽膑\uddaa⡸摴", TextUtils.lastIndexOf("", '0') + 19490).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.16
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1093((ImpressionData) list.get(0));
            }
        });
        map.put(m1095("\u0b4e煯；攉\ue3c8槶힉嶹\uda42䁡츞㓇닣㢪ꚢ⍐ꥸ᜴鴺ᯄ臅ྗ瑒\uf263研\ue636", (-16745949) - Color.rgb(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.19
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Double.valueOf(bq.m1080((ImpressionData) list.get(0)));
            }
        });
        map.put(m1092((char) (TextUtils.indexOf("", "", 0, 0) + 55502), 188 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.21
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1084((ImpressionData) list.get(0));
            }
        });
        map.put(m1095("\u0b4e㗵瘯띋\uf1a0㋄猍뱃ﺒ㿛硺몵ﯫ␈敖꞊\ue0d8℡扏곤\ued38\u2e76梻꧟\uea02⭝喑雮흺ᆱ勦錧\udc67", 16058 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1085((ImpressionData) list.get(0));
            }
        });
        map.put(m1092((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 215, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1078((ImpressionData) list.get(0));
            }
        });
        map.put(m1092((char) (Process.myPid() >> 22), 242 - (ViewConfiguration.getScrollBarSize() >> 8), 8 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1102((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1092((char) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 249, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1088((FairBid.AdsConfig) list.get(0));
            }
        });
        map.put(m1092((char) TextUtils.getTrimmedLength(""), 258 - (KeyEvent.getMaxKeyCode() >> 16), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1109((MediationConfig) list.get(0));
            }
        });
        map.put(m1092((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 283 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1104((Placement) list.get(0));
            }
        });
        map.put(m1092((char) (ImageFormat.getBitsPerPixel(0) + 46659), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 300, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1099((Placement) list.get(0));
            }
        });
        map.put(m1092((char) (37593 - (ViewConfiguration.getPressedStateDuration() >> 16)), 317 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1087((MediationManager) list.get(0));
            }
        });
        map.put(m1095("\u0b4e\uda99ꣷ縗䰙ቔ\ue1ae랊藤欑㤕ཻ\udeb8", TextUtils.indexOf("", "") + 53717).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bq.m1105((String) list.get(0));
            }
        });
        map.put(m1095("\u0b5a꺍䃟﨣鱃㞘\ue9ca茜╒\ud894狊ᐖ칌憅ᯋ봪坐ઋ곏䘟\uf853鎙㗍", 42433 - TextUtils.indexOf("", "", 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.13
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bq.m1090((InterstitialListener) list.get(0));
                return null;
            }
        });
        map.put(m1092((char) (((Process.getThreadPriority(0) + 20) >> 6) + 1153), 336 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getSize(0) + 19).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bq.m1091((RewardedListener) list.get(0));
                return null;
            }
        });
        map.put(m1095("ୈ\uf843\ued68툇윿될맬껲鎀肺疧祟湡", TextUtils.getCapsMode("", 0, 0) + 62233).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bq.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Boolean.valueOf(bq.m1079());
            }
        });
        int i10 = f940 + 17;
        f941 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 46 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1091(RewardedListener rewardedListener) {
        f941 = (f940 + 117) % 128;
        m1111(rewardedListener);
        f941 = (f940 + 33) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementType m1103(Constants.AdType adType) {
        f941 = (f940 + 37) % 128;
        PlacementType placementType = adType.getPlacementType();
        int i10 = f941 + 11;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 27 / 0;
        }
        return placementType;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1107(FairBid.AdsConfig adsConfig) {
        f941 = (f940 + 43) % 128;
        String str = adsConfig.store;
        int i10 = f940 + 13;
        f941 = i10 % 128;
        if (i10 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f941 = (f940 + 31) % 128;
        try {
            try {
                String str = (String) FairBid.class.getDeclaredField(m1095("\u0b7a\uefe2쉼ꛛ饃綧倡㒓⼘ɡ\ue6f1", 58510 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()).get(null);
                f941 = (f940 + 37) % 128;
                return str;
            } catch (Exception unused) {
                return id.m2382().m2383().m2493(FairBid.class, m1095("୷㛇瀟뉒ﶠ㾋祌ꓴ\ue6dc 执궊\uef08⤳咔障퀤ቷ巏鼢\ud950ӛ䚃", 15798 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static PlacementsHandler m1106(MediationManager mediationManager) {
        int i10 = f940 + 125;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        if (i11 == 0) {
            int i12 = 19 / 0;
        }
        return placementsHandler;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1110(InterstitialListener interstitialListener) {
        int i10 = f940 + 57;
        f941 = i10 % 128;
        int i11 = i10 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1111(RewardedListener rewardedListener) {
        f940 = (f941 + 75) % 128;
        Rewarded.setRewardedListener(rewardedListener);
        int i10 = f941 + 123;
        f940 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Constants.AdType m1086(Placement placement) {
        int i10 = f941 + 57;
        f940 = i10 % 128;
        int i11 = i10 % 2;
        Constants.AdType adType = placement.getAdType();
        if (i11 != 0) {
            int i12 = 42 / 0;
        }
        return adType;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1092(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f938[i10 + i12]) ^ (((long) i12) * f937)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1097(FairBid.AdsConfig adsConfig) {
        f941 = (f940 + 69) % 128;
        String str = adsConfig.appId;
        f940 = (f941 + 11) % 128;
        return str;
    }
}
