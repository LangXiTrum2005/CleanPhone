package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.inmobi.ads.AdContainer;
import com.inmobi.ads.AdUnit;
import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.NativeRecyclerViewAdapter;
import com.inmobi.ads.NativeVideoView;
import com.inmobi.ads.ViewableAd;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.ads.network.common.model.Ad;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.ContextData;
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bp extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f920 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f923 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f922 = {562507611, -915395194, -1952573310, -1012846282, 1800988401, -285658014, 1522885977, 766100903, 1393412104, 792542038, 1819201026, -211117223, -1660652813, -757948543, -1858581880, -755617891, 831784239, -2002228277};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f921 = 55;

    public bp(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1040(String str) {
        f923 = (f920 + 59) % 128;
        Enum enumM1044 = m1044(str);
        f920 = (f923 + 33) % 128;
        return enumM1044;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Enum m1042(String str) {
        f923 = (f920 + 121) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != -2102692847) {
            if (iHashCode != -1357644918) {
                if (iHashCode == 235669401 && str.equals(m1056(TextUtils.getTrimmedLength("") + 24, true, 132 - TextUtils.lastIndexOf("", '0', 0), "\u0000\t\u0001\u0000�\u0000\u0007\u0011\ufff7\u0002\u000b\u0006\u0011\ufff7\b\ufffb\u0006\ufff3\ufff7\u0004\ufff5\u0011\ufff6\ufff3", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25).intern())) {
                    AdUnit.AdCreativeType adCreativeType = AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
                    int i10 = f923 + 9;
                    f920 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return adCreativeType;
                    }
                    throw null;
                }
            } else if (str.equals(m1056(22 - (Process.myTid() >> 22), false, ((Process.getThreadPriority(0) + 20) >> 6) + 132, "\u0002\ufff4\ufff7\u0012\ufff6\u0005\ufff8\ufff4\u0007￼\t\ufff8\u0012\u0007\f\u0003\ufff8\u0012\t￼\ufff7\ufff8", 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                f923 = (f920 + 85) % 128;
                return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
            }
        } else if (str.equals(m1056(23 - Process.getGidForName(""), false, Color.blue(0) + 132, "\ufff8\ufff4\u0007￼\t\ufff8\u0012\u0007\f\u0003\ufff8\u0012\ufff7￼\u0006\u0003\uffff\ufff4\f\ufff4\ufff7\u0012\ufff6\u0005", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18).intern())) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static Enum m1044(String str) {
        int iHashCode = str.hashCode();
        byte b10 = 0;
        if (iHashCode != 556003820) {
            if (iHashCode != 556062505) {
                if (iHashCode == 1382961856 && str.equals(m1062(new int[]{1951500403, -1165699746, 1145231371, -1075977298, 1014658262, -931103497, 9950061, 603694691, 948739616, -152366165, -191671302, -1048146467}, View.combineMeasuredStates(0, 0) + 22).intern())) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(m1056((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, true, 135 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\t\u0004\u000f\u0000\u0005\ufffb\u0002\ufff1�\u000f\ufff4\ufff1\ufffe\uffff\u0003\ufffa\u000f�\ufffe\ufff9\u000f\ufff5", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13).intern())) {
                f923 = (f920 + 29) % 128;
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(m1062(new int[]{1951500403, -1165699746, 1145231371, -1075977298, 1014658262, -931103497, 1674407392, -1141969328, 2047657469, -577441720, -732839063, -1528047205}, View.resolveSize(0, 0) + 23).intern())) {
            f920 = (f923 + 99) % 128;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b10 == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b10 != 2) {
            return null;
        }
        return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Enum m1045(String str) {
        int i10 = f923 + 59;
        f920 = i10 % 128;
        if (i10 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        byte b10 = -1;
        if (iHashCode != -1097819034) {
            if (iHashCode == 1554700484 && str.equals(m1062(new int[]{-124999537, -1345533637, -1210132634, 1368948542, -2096984458, -41170721, 1674407392, -1141969328, -1675239349, -1346203610, 1940773470, -1826856372}, KeyEvent.getDeadChar(0, 0) + 21).intern())) {
                f920 = (f923 + 79) % 128;
                b10 = 0;
            }
        } else if (str.equals(m1056(25 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), false, 132 - (Process.myTid() >> 22), "\u0012\ufff9\b\uffff\uffff\u0006\ufff6\u0005\ufff8\ufff8\u0001\u0003\uffff\ufff4\ufff6\ufff8\u0000\ufff8\u0001\u0007\u0012\u0007\f\u0003\ufff8", 11 - TextUtils.getOffsetAfter("", 0)).intern())) {
            b10 = 1;
        }
        if (b10 == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b10 != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1047(String str) {
        int i10 = f920 + InterfaceC0435l1.d.b.f29105b;
        f923 = i10 % 128;
        int i11 = i10 % 2;
        Enum enumM1042 = m1042(str);
        if (i11 == 0) {
            int i12 = 62 / 0;
        }
        return enumM1042;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Object m1048(Ad ad2) {
        f923 = (f920 + 13) % 128;
        Object objM1046 = m1046(ad2);
        f920 = (f923 + 33) % 128;
        return objM1046;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m1049(Ad ad2) {
        f923 = (f920 + InterfaceC0435l1.d.b.f29105b) % 128;
        Object objM1041 = m1041(ad2);
        f920 = (f923 + 27) % 128;
        return objM1041;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1052(Ad ad2) {
        int i10 = f923 + 95;
        f920 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1065(ad2);
        }
        m1065(ad2);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1057(AdContainer adContainer) {
        f920 = (f923 + 9) % 128;
        Object objM1064 = m1064(adContainer);
        int i10 = f920 + 75;
        f923 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 99 / 0;
        }
        return objM1064;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1063(String str) {
        f920 = (f923 + 55) % 128;
        Enum enumM1045 = m1045(str);
        int i10 = f923 + 119;
        f920 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 12 / 0;
        }
        return enumM1045;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Object m1041(Ad ad2) {
        f920 = (f923 + 9) % 128;
        Map rewards = ad2.getRewards();
        f923 = (f920 + 93) % 128;
        return rewards;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Object m1051(AdSet adSet) {
        f923 = (f920 + 75) % 128;
        Object objM1060 = m1060(adSet);
        f923 = (f920 + 99) % 128;
        return objM1060;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1053(AdResponse adResponse) {
        int i10 = f923 + 79;
        f920 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1066(adResponse);
        }
        m1066(adResponse);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1058(Ad ad2) {
        f920 = (f923 + 35) % 128;
        Object objM1043 = m1043(ad2);
        f920 = (f923 + 93) % 128;
        return objM1043;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m1067(AdSet adSet) {
        f920 = (f923 + 43) % 128;
        Object objM1054 = m1054(adSet);
        f920 = (f923 + 79) % 128;
        return objM1054;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f920 = (f923 + 95) % 128;
        String version = InMobiSdk.getVersion();
        f923 = (f920 + 11) % 128;
        return version;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Object m1050(AdResponse adResponse) {
        int i10 = f920 + 17;
        f923 = i10 % 128;
        if (i10 % 2 != 0) {
            return adResponse.getAdSets();
        }
        adResponse.getAdSets();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Object m1055(ContextData contextData) {
        f923 = (f920 + 11) % 128;
        Object objM1061 = m1061(contextData);
        f920 = (f923 + 125) % 128;
        return objM1061;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Object m1059(AdResponse adResponse) {
        int i10 = f920 + 25;
        f923 = i10 % 128;
        int i11 = i10 % 2;
        Object objM1050 = m1050(adResponse);
        if (i11 == 0) {
            int i12 = 45 / 0;
        }
        int i13 = f923 + 1;
        f920 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 88 / 0;
        }
        return objM1050;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1064(AdContainer adContainer) {
        int i10 = f923 + 91;
        f920 = i10 % 128;
        if (i10 % 2 == 0) {
            return adContainer.getDataModel();
        }
        adContainer.getDataModel();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1066(AdResponse adResponse) {
        Long lValueOf;
        int i10 = f920 + 75;
        f923 = i10 % 128;
        if (i10 % 2 == 0) {
            lValueOf = Long.valueOf(adResponse.getPlacementId());
            int i11 = 28 / 0;
        } else {
            lValueOf = Long.valueOf(adResponse.getPlacementId());
        }
        int i12 = f923 + InterfaceC0435l1.d.b.f29107d;
        f920 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 88 / 0;
        }
        return lValueOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x03b0 A[RETURN] */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -2044438337:
                if (str.equals(m1056(19 - (ViewConfiguration.getTapTimeout() >> 16), false, (Process.myTid() >> 22) + 160, "\u0000\u0005\ufffe\uffe7\t\u0006\u0007￼\t\u000b\u0000￼\n￩￼\u0005\ufffb￼\t", 12 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    int i10 = f923 + 65;
                    f920 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return AdContainer.RenderingProperties.class;
                    }
                }
                return null;
            case -1769689844:
                if (str.equals(m1062(new int[]{-93291362, -941079515, 407149129, 569421148, 1330601109, -1213092240}, 9 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    f920 = (f923 + 19) % 128;
                    return InMobiSdk.class;
                }
                return null;
            case -1716191362:
                if (str.equals(m1056((ViewConfiguration.getPressedStateDuration() >> 16) + 11, false, 154 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\f\u000b\u0011\ufffe\u0006\u000b\u0002\u000f\uffde\u0001￠", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8).intern())) {
                    return AdContainer.class;
                }
                return null;
            case -1405271692:
                if (str.equals(m1056(25 - (ViewConfiguration.getEdgeSlop() >> 16), true, 205 - AndroidCharacter.getMirror('0'), "\u0003\ufff0\f\uffff\u0006�\u0013�\uffff￬\uffff\u0010\u0003\u000e\ufffb￨\f\uffff\u000e\n\ufffb\ufffeￛ\u0011\uffff", ((Process.getThreadPriority(0) + 20) >> 6) + 16).intern())) {
                    return NativeRecyclerViewAdapter.class;
                }
                return null;
            case -1401317165:
                if (str.equals(m1062(new int[]{-1370930928, 2088339760, 298533799, -759923270, -1629708872, 149640850, 22772082, 1222262142, -1616547760, 1013471466}, 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    return VideoEventListener.class;
                }
                return null;
            case -1304544044:
                if (str.equals(m1062(new int[]{1328267352, 46177580, -945952992, 191840045, 279316397, -710167262, 2000832362, 1408910213, 1975943915, -1561314148, 1031804524, 812295393}, 21 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    return NativeAdEventListener.class;
                }
                return null;
            case -1062227179:
                if (str.equals(m1062(new int[]{1250403774, -39853217, -1091565367, -1815445137, 876969886, 19413883, -1058727564, 1815826296, 882823189, -1801445098, -1413773774, 1154551206, 443035159, -508431736, 643598262, -1040823540, 1685858024, 1346381776, 1650901531, 1836143566}, (ViewConfiguration.getTouchSlop() >> 8) + 37).intern())) {
                    return InMobiAdActivity.class;
                }
                return null;
            case -808014786:
                if (str.equals(m1056(15 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, KeyEvent.keyCodeFromString("") + 153, "\u000f\u0013\u0003\u0011\u0012\uffe7\f￫\r\u0000\u0007\uffdf\u0002\ufff0\u0003", (ViewConfiguration.getEdgeSlop() >> 16) + 5).intern())) {
                    int i11 = f923 + 117;
                    f920 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return InMobiAdRequest.class;
                    }
                    throw null;
                }
                return null;
            case -595852006:
                if (str.equals(m1056(TextUtils.indexOf((CharSequence) "", '0') + 13, true, ((Process.getThreadPriority(0) + 20) >> 6) + 152, "\u0004\r\r\u0000￡\b\u0001\u000e￬\r￨\u0011", TextUtils.indexOf((CharSequence) "", '0', 0) + 12).intern())) {
                    return InMobiBanner.class;
                }
                return null;
            case -560158238:
                if (str.equals(m1062(new int[]{-93291362, -941079515, 494409170, -962489686, 414651752, -1788862176, -1331576690, 709804878, -845716969, -1235689617}, 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    f923 = (f920 + 79) % 128;
                    return com.inmobi.ads.rendering.InMobiAdActivity.class;
                }
                return null;
            case -541364416:
                if (str.equals(m1062(new int[]{-93291362, -941079515, 494409170, -962489686, 414651752, -1788862176, -1331576690, 709804878}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16).intern())) {
                    return InMobiAdActivity.class;
                }
                return null;
            case -520974940:
                if (str.equals(m1062(new int[]{-2052848498, -1933099999, 280484505, -558384027, 722018624, -226317969}, 10 - View.MeasureSpec.getMode(0)).intern())) {
                    return AdResponse.class;
                }
                return null;
            case -235933147:
                if (str.equals(m1062(new int[]{-2040529832, 774540485, 40748087, 1811204560, -1439238648, 370881408}, 12 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return AdUnit.AdMarkupType.class;
                }
                return null;
            case -204096109:
                if (str.equals(m1056(TextUtils.getOffsetBefore("", 0) + 41, true, 152 - View.resolveSizeAndState(0, 0, 0), "\u0013\u0002￠\u0003￠\b\u0001\u000e￬\r￨ￍ\u0006\r\b\u0011\u0004\u0003\r\u0004\u0011ￍ\u0012\u0003\u0000ￍ\b\u0001\u000e\f\r\bￍ\f\u000e\u0002\u0018\u0013\b\u0015\b", ((byte) KeyEvent.getModifierMetaStateMask()) + 37).intern())) {
                    return com.inmobi.ads.rendering.InMobiAdActivity.class;
                }
                return null;
            case -93733047:
                if (str.equals(m1062(new int[]{1328267352, 46177580, 1142142365, 1262657767, 694719912, -641761405, -1388134955, -1016818019}, 15 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    return NativeVideoView.class;
                }
                return null;
            case -32161126:
                if (str.equals(m1062(new int[]{-93291362, -941079515, 1079082547, -1525867609, -1203207442, -869314689, 1988568971, 1399725484, 1230709131, 891234370}, 18 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                    f920 = (f923 + 61) % 128;
                    return InMobiInterstitial.class;
                }
                return null;
            case 2115:
                if (str.equals(m1056(3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), false, 137 - KeyEvent.normalizeMetaState(0), "\u0012\uffef", -((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    return Ad.class;
                }
                return null;
            case 63090975:
                if (str.equals(m1056(View.MeasureSpec.getSize(0) + 5, false, 149 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\b\u0017￤\u0007\ufff6", ExpandableListView.getPackedPositionChild(0L) + 3).intern())) {
                    return AdSet.class;
                }
                return null;
            case 99044255:
                if (str.equals(m1062(new int[]{1279696942, 922556570, -1511460644, -2026342242, 734041242, -375132950, -1866608713, 1179224426}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 13).intern())) {
                    return AdContainer.RenderingProperties.PlacementType.class;
                }
                return null;
            case 515339810:
                if (str.equals(m1056(10 - KeyEvent.keyCodeFromString(""), false, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 152, "\u0015\uffff\u0000\n\u0003\uffdf\u0002\ufff4\u0007\u0003", KeyEvent.keyCodeFromString("") + 7).intern())) {
                    return ViewableAd.class;
                }
                return null;
            case 957243679:
                if (str.equals(m1056(21 - View.combineMeasuredStates(0, 0), true, KeyEvent.normalizeMetaState(0) + 155, "\u0012￡\u0000\uffdd\u000e\u0001\n\n�\uffde\u000e\u0001\n\u0001\u0010\u000f\u0005￨\u0010\n\u0001", (ViewConfiguration.getPressedStateDuration() >> 16) + 10).intern())) {
                    return BannerAdEventListener.class;
                }
                return null;
            case 1228411167:
                if (str.equals(m1062(new int[]{-732903046, -1426733808, 800060415, 1058226699, -252588736, -900936428, -1094692546, 728266428, 1524694268, 1405016437, 1371733236, -987130454, -513542795, 1002066311}, (Process.myTid() >> 22) + 27).intern())) {
                    return InterstitialAdEventListener.class;
                }
                return null;
            case 1564529113:
                if (str.equals(m1062(new int[]{-681617739, -1787485922, -510697614, -1004259105, -336905977, 333080411}, 11 - TextUtils.indexOf("", "")).intern())) {
                    f920 = (f923 + InterfaceC0435l1.d.b.f29114k) % 128;
                    return ContextData.class;
                }
                return null;
            case 1955888231:
                if (str.equals(m1062(new int[]{1020977381, -1968544186, 1404849331, 1648895479}, 6 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    return AdUnit.class;
                }
                return null;
            case 2035398868:
                if (str.equals(m1056(10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, ((byte) KeyEvent.getModifierMetaStateMask()) + 159, "\t\ufffe\uffde\u000f\ufffe\u0007\r￭\u0012", 2 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    return AdContainer.EventType.class;
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
        map.put(m1056(20 - Color.red(0), true, View.combineMeasuredStates(0, 0) + 158, "\u0007\ufffe\u0006\ufffe￼\ufffa\u0005￩\r\ufffe\u0000\u0006\u000e\u0007\uffde\ufffe\t\u0012￭\r", TextUtils.indexOf("", "", 0) + 11).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1063((String) list.get(0));
            }
        });
        map.put(m1062(new int[]{970138680, -2008091511, 349578956, 335032656, 1041954642, -868887232, 2052114233, -1704509948, 48064122, -905601641}, 19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1040((String) list.get(0));
            }
        });
        map.put(m1056((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12, false, KeyEvent.getDeadChar(0, 0) + 154, "\u0002\u0011￡\ufffe\u0011\ufffe￪\f\u0001\u0002\t\u0004", 11 - View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1057((AdContainer) list.get(0));
            }
        });
        map.put(m1056(17 - Color.blue(0), true, 156 - (ViewConfiguration.getTouchSlop() >> 8), "\uffffￜ\u000f\u0000\u0002\u0000\u000b\u0014\uffef\u0000\u0011\u0004\u000f￼\u0000\r\uffde", View.combineMeasuredStates(0, 0) + 5).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1047((String) list.get(0));
            }
        });
        map.put(m1062(new int[]{-927567458, 1501058169, -1888050994, 703981013, 1852768155, -716249168, -1253389799, -1455011673}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1053((AdResponse) list.get(0));
            }
        });
        map.put(m1062(new int[]{970138680, -2008091511, 1883952003, -2110210192, -515331481, -1691358230}, ((Process.getThreadPriority(0) + 20) >> 6) + 9).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1059((AdResponse) list.get(0));
            }
        });
        map.put(m1062(new int[]{991916618, -1169169017, -888966311, 2060120649, 1593797696, -1762186947}, (ViewConfiguration.getTapTimeout() >> 16) + 10).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1067((AdSet) list.get(0));
            }
        });
        map.put(m1062(new int[]{970138680, -2008091511, -398300370, 1347680163}, View.MeasureSpec.makeMeasureSpec(0, 0) + 6).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1051((AdSet) list.get(0));
            }
        });
        map.put(m1062(new int[]{1419834114, -1083736733, -2080496507, 1768678064, -1270700691, -2051588244, 439545563, 174511689}, 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.12
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1052((Ad) list.get(0));
            }
        });
        map.put(m1062(new int[]{-2047958724, 1802777980, -1916031351, 1162252702, -398300370, 1347680163}, 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1049((Ad) list.get(0));
            }
        });
        map.put(m1056((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, false, 157 - TextUtils.indexOf("", ""), "\ufff0\ufffb\r\u000e\u0001\uffff\u000e\ufff1\uffff￼", View.resolveSizeAndState(0, 0, 0) + 4).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1058((Ad) list.get(0));
            }
        });
        map.put(m1062(new int[]{1419834114, -1083736733, 559628199, 562221892, -2134671351, -328540407, -1653694672, 1716761448}, 13 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1048((Ad) list.get(0));
            }
        });
        map.put(m1062(new int[]{970138680, -2008091511, -1133514536, 977919822, 1168316515, 873651306, -1916570316, 435599446, -1140736757, -438061370}, (ViewConfiguration.getLongPressTimeout() >> 16) + 20).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bp.m1055((ContextData) list.get(0));
            }
        });
        f920 = (f923 + 67) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object m1065(Ad ad2) {
        int i10 = f923 + 17;
        f920 = i10 % 128;
        if (i10 % 2 != 0) {
            ad2.getContextData();
            throw null;
        }
        ContextData contextData = ad2.getContextData();
        f920 = (f923 + 23) % 128;
        return contextData;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Object m1046(Ad ad2) {
        int i10 = f923 + InterfaceC0435l1.d.b.f29112i;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        String creativeId = ad2.getCreativeId();
        if (i11 != 0) {
            int i12 = 50 / 0;
        }
        return creativeId;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static Object m1043(Ad ad2) {
        f920 = (f923 + 107) % 128;
        String webVast = ad2.getWebVast();
        f920 = (f923 + 85) % 128;
        return webVast;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m1060(AdSet adSet) {
        int i10 = f923 + 1;
        f920 = i10 % 128;
        int i11 = i10 % 2;
        LinkedList ads = adSet.getAds();
        if (i11 != 0) {
            int i12 = 29 / 0;
        }
        return ads;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m1061(ContextData contextData) {
        f923 = (f920 + 39) % 128;
        String advertisedContent = contextData.getAdvertisedContent();
        int i10 = f923 + 7;
        f920 = i10 % 128;
        if (i10 % 2 == 0) {
            return advertisedContent;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1062(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f922.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m1054(AdSet adSet) {
        f923 = (f920 + 13) % 128;
        Boolean boolValueOf = Boolean.valueOf(adSet.isRewarded());
        int i10 = f923 + 19;
        f920 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
        return boolValueOf;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1056(int i10, boolean z10, int i11, String str, int i12) {
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
                    cArr2[i14] = (char) (cArr2[i14] - f921);
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
}
