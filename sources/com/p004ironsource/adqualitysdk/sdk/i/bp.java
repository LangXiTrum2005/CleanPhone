package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
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
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.FiveAd;
import com.five_corp.ad.FiveAdConfig;
import com.five_corp.ad.FiveAdCustomLayout;
import com.five_corp.ad.FiveAdFormat;
import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdInterstitial;
import com.five_corp.ad.FiveAdInterstitialEventListener;
import com.five_corp.ad.FiveAdListener;
import com.five_corp.ad.FiveAdLoadListener;
import com.five_corp.ad.FiveAdState;
import com.five_corp.ad.FiveAdVideoReward;
import com.five_corp.ad.FiveAdVideoRewardEventListener;
import com.five_corp.ad.FiveAdViewEventListener;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class bp extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f918 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f921 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f920 = {30819, 7287, 45093, 21745, 59528, 36198, 21653, 12447, 40133, 30726, 50254, 41368, 3522, 59694, 30042, 53948, 48872, 6714, 3565, 27098, 50581, 8465, 40196, 63680, 21658, 45174, 11273, 35838, 59311, 17269, 48954, 7007, 30421, 53919, 19984, 43555, 449, 32153, 55671, 13592, 37112, 3200, 26739, 50238, 8196, 40920, 64407, 22381, 45829, 11986, 35457, 58976, 16940, 'F', 25682, 51200, 11476, 37037, 62787, 22827, 48627, 8620, 34422, 59964, 20207, 45733, 5788, 31583, 'F', 25682, 51200, 11476, 37037, 62787, 22827, 48627, 8620, 34422, 59964, 20218, 45744, 5782, 31566, 57116, 17361, 42887, 50937, 41709, 3775, 60011, 22034, 13308, 40849, 31563, 59156, 16600, 11412, 34904, 29726, 53298, 36786, 60326, 18420, 41760, 8025, 31415, 54976, 12800, 44616, 2434, 26069, 49455, 15701, 39292, 62639, 20723, 52256, 28381, 2761, 42651, 16975, 65078, 39896, 14250, 54130, 20258, 59644, 33968, 'F', 25682, 51200, 11476, 37037, 62787, 22830, 48626, 8633, 34423, 59906, 20192, 45751, 5771, 31583, 57115, 17365, 42905, 9114, 18308, 60396, 3849, 45891, 54933, 31439, 40495, 631, 42417, 39045, 64700, 20704, 46098, 2174, 28085, 49609, 9499, 47484, 7811, 29379, 54790, 10855, 36473, 58267, 18424, 56124, 16239, 38061, 59620, 33498, 59107, 19135, 44618, 4664, 30700, 56250, 16225, 41729, 1255, 26781, 52288, 12316, 37936, 63969, 23977, 49518, 9523, 36568, 62126, 22084, 47627, 8155, 33689, 59203, 19227, 44823, 4349, 29881, 55415, 'g', 25694, 51202, 11511, 36997, 62801, 22791, 48604, 8636, 34394, 59936, 20221, 45729, 5773, 31580, 57108, 17363, 42894, 3175, 28677, 54476, 14518, 40288, 300, 26085, 51622, 11658, 37468, 62982, 'g', 25694, 51202, 11511, 36997, 62801, 22791, 48604, 8636, 34394, 59936, 20221, 45729, 5773, 31580, 57108, 17363, 42894, 3178, 28680, 54511, 14499, 40311, 291, 26093, 51633, 58720, 33101, 11537, 51684, 30102, 4162, 48148, 22735, 50351, 25417, 3891, 44014, 22450, 62366, 40527, 14855, 42688, 17053, 59769, 38171, 12796, 56752, 30820, 58416, 33022, 11426, 54865, 45672, 7732, 64193, 18099, 9063, 36657, 27626, 63370, 20598, 15377, 39121, 25749, 49317, 44393, 2359, 38377, 29107, 37657, 63284, 23400, 49047, 1001, 26156, 51820, 11963, 45787, 5386, 31056, 56710, 8640, 34288, 59426, 37800, 63365, 23513, 48956, 862, 26265, 51918, 11779, 45685, 5549, 31227, 56614, 8531, 34125, 59538, 19674, 53262, 13406, 40856, 58312};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f919 = 8902081363505538107L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f917 = {'s', 229, 225, 222, 223, 205, 206, 230, 228, 202, 201, 202, 132, 282, 306, 304, 278, 277, 278, 287, 311, 310, 308, 305, 287, 281, 304, 311, 309, 311, '2', 'm', 'o', 'W', AbstractJsonLexerKt.END_LIST, 'j', 'g', 'o', 'p', 'Z', 'U', 'R', 'd', 218, 242, 240, 214, 213, 224, 226, 234, 241, 225, 224, 240, 236, 244, 227, 221, 241, 246, 239, 236, 236, 238, '8', 'q', 'p', 'i', 'a', 'b', 'm', 'o', 'g', 'J', 'M', 'n', 'i', 'n', 'v', 'n', 'o', 'o', 'n', 'k', 'R', 'R', 'R', '7', 'I', 'b', 'G', '#', 'W', 'o', 'm', 'S', 'R', 'V', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'k', 'r', 's', 'n', 'n', 'n', 'e', 'f', 'X', AbstractJsonLexerKt.END_LIST, 'm', 'i', 'q', '`', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'w', 238, 233, 213, 219, 236, 228, 232, 216, 207, 230, 228, 231, 233, 214, 219, 229, 223, 225, 218, 216, 205, 206, 232, 234, 210, 215, 230, 228, 228, 131, 274, 288, 292, 273, 265, 280, 281, 287, 272, 266, 290, 288, 262, 261, 265, 270, 292, 287, 286, 287, 278, 277, 279, '2', 'V', AbstractJsonLexerKt.BEGIN_LIST, 'q', 'l', 'k', 'l', 'c', 'b', 'd', '\\', 'Z', 'd', 'g', 'f', 'l', AbstractJsonLexerKt.END_LIST, 'W', 'o', 'm', 'S', 'e', 220, 244, 242, 216, 215, 216, 225, 249, 248, 246, 243, 225, 219, 242, 249, 247, 249, 223, 215, 242, 242, 240, 248, 243, 243, 241, 240, 229, 220, 236, 238, 235, 235, 241};

    public bp(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ FiveAd m1010() {
        int i2 = f921 + 105;
        f918 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1012();
        }
        int i3 = 50 / 0;
        return m1012();
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1011(FiveAdInterface fiveAdInterface) {
        int i2 = f918 + 85;
        f921 = i2 % 128;
        int i3 = i2 % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        if (i3 == 0) {
            int i4 = 22 / 0;
        }
        return adParameter;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1013(FiveAdInterface fiveAdInterface) {
        f918 = (f921 + 7) % 128;
        String fiveAdTag = fiveAdInterface.getFiveAdTag();
        int i2 = f918 + 27;
        f921 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return fiveAdTag;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static FiveAdListener m1014(FiveAdInterface fiveAdInterface) {
        f921 = (f918 + 57) % 128;
        FiveAdListener listener = fiveAdInterface.getListener();
        f918 = (f921 + 93) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static String m1015(FiveAdInterface fiveAdInterface) {
        int i2 = f918 + 61;
        f921 = i2 % 128;
        int i3 = i2 % 2;
        String slotId = fiveAdInterface.getSlotId();
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return slotId;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ FiveAdListener m1016(FiveAdInterface fiveAdInterface) {
        int i2 = f921 + 49;
        f918 = i2 % 128;
        int i3 = i2 % 2;
        FiveAdListener fiveAdListenerM1014 = m1014(fiveAdInterface);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        int i5 = f921 + 9;
        f918 = i5 % 128;
        if (i5 % 2 == 0) {
            return fiveAdListenerM1014;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1018(FiveAdInterface fiveAdInterface) {
        int i2 = f921 + 39;
        f918 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1013(fiveAdInterface);
        }
        m1013(fiveAdInterface);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1020(FiveAdConfig fiveAdConfig) {
        int i2 = f921 + 37;
        f918 = i2 % 128;
        int i3 = i2 % 2;
        String strM1025 = m1025(fiveAdConfig);
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        int i5 = f921 + 99;
        f918 = i5 % 128;
        if (i5 % 2 == 0) {
            return strM1025;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ CreativeType m1024(FiveAdInterface fiveAdInterface) {
        f918 = (f921 + 121) % 128;
        CreativeType creativeTypeM1009 = m1009(fiveAdInterface);
        f918 = (f921 + 61) % 128;
        return creativeTypeM1009;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1028(FiveAdCustomLayout fiveAdCustomLayout) {
        int i2 = f921 + 71;
        f918 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1021(fiveAdCustomLayout);
        }
        m1021(fiveAdCustomLayout);
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static CreativeType m1009(FiveAdInterface fiveAdInterface) {
        f921 = (f918 + 99) % 128;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i2 = f921 + 45;
        f918 = i2 % 128;
        if (i2 % 2 == 0) {
            return creativeType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static FiveAd m1012() {
        int i2 = f921 + 65;
        f918 = i2 % 128;
        if (i2 % 2 != 0) {
            FiveAd.getSingleton();
            throw null;
        }
        FiveAd singleton = FiveAd.getSingleton();
        f921 = (f918 + 125) % 128;
        return singleton;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1017(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f918 = (f921 + 85) % 128;
        m1031(fiveAdInterface, fiveAdLoadListener);
        f921 = (f918 + 89) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1022(FiveAdInterface fiveAdInterface) {
        f921 = (f918 + 53) % 128;
        String strM1015 = m1015(fiveAdInterface);
        int i2 = f921 + 77;
        f918 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return strM1015;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1027(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i2 = f921 + 83;
        f918 = i2 % 128;
        int i3 = i2 % 2;
        m1032(fiveAdInterface, fiveAdViewEventListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f918 + 73;
        f921 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1029(FiveAdInterface fiveAdInterface) {
        f918 = (f921 + 73) % 128;
        String strM1011 = m1011(fiveAdInterface);
        f921 = (f918 + 1) % 128;
        return strM1011;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1019(20 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 156, (char) (39138 - KeyEvent.normalizeMetaState(0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1020((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1023(false, new int[]{153, 24, 179, 6}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1022((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1023(false, new int[]{177, 21, 0, 13}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1018((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1019(30 - ((Process.getThreadPriority(0) + 20) >> 6), 176 - (KeyEvent.getMaxKeyCode() >> 16), (char) (33469 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1024((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1019(29 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.indexOf("", "") + 206, (char) TextUtils.indexOf("", "", 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1029((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1019(27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 235, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1016((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1019(26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 261 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (58642 - MotionEvent.axisFromString(""))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bp.m1030((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1019(17 - TextUtils.indexOf((CharSequence) "", '0'), 287 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 54838)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1010();
            }
        });
        map.put(m1023(false, new int[]{198, 35, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 32}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.12
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return bp.m1028((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1019(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.normalizeMetaState(0) + 305, (char) (37738 - Drawable.resolveOpacity(0, 0))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bp.m1017((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1019(21 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, (char) (TextUtils.indexOf("", "", 0) + 37851)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.bp.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                bp.m1027((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        f918 = (f921 + 125) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1025(FiveAdConfig fiveAdConfig) {
        f918 = (f921 + 125) % 128;
        String str = fiveAdConfig.appId;
        f918 = (f921 + 7) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1030(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f921 = (f918 + 59) % 128;
        m1026(fiveAdInterface, fiveAdListener);
        f918 = (f921 + 55) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0060  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        int i2 = f918 + 99;
        f921 = i2 % 128;
        if (i2 % 2 != 0) {
            switch (str.hashCode()) {
                case -1836618638:
                    b2 = str.equals(m1019(10 - (ViewConfiguration.getEdgeSlop() >> 16), 146 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 9179)).intern()) ? (byte) 13 : (byte) -1;
                    break;
                case -1782131271:
                    b2 = !str.equals(m1023(true, new int[]{123, 30, 123, 26}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001").intern()) ? (byte) -1 : (byte) 16;
                    break;
                case -962125644:
                    b2 = !str.equals(m1023(false, new int[]{42, 23, 131, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern()) ? (byte) -1 : (byte) 12;
                    break;
                case -939888073:
                    b2 = !str.equals(m1023(false, new int[]{0, 12, 119, 5}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern()) ? (byte) -1 : (byte) 2;
                    break;
                case -853874964:
                    if (!str.equals(m1023(true, new int[]{30, 12, 0, 4}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001").intern())) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case -735613671:
                    b2 = !str.equals(m1023(true, new int[]{65, 27, 0, 13}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001").intern()) ? (byte) -1 : (byte) 14;
                    break;
                case -624329424:
                    if (!str.equals(m1023(false, new int[]{12, 18, 195, 18}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001").intern())) {
                        b2 = -1;
                    } else {
                        int i3 = f918 + 49;
                        f921 = i3 % 128;
                        if (i3 % 2 != 0) {
                            b2 = 3;
                        } else {
                            b2 = 5;
                        }
                    }
                    break;
                case -295916403:
                    b2 = !str.equals(m1023(false, new int[]{92, 31, 0, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern()) ? (byte) -1 : (byte) 15;
                    break;
                case -189625759:
                    b2 = !str.equals(m1019(18 - View.MeasureSpec.getMode(0), 't' - AndroidCharacter.getMirror('0'), (char) Color.red(0)).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case -6611420:
                    b2 = !str.equals(m1019(15 - Color.green(0), 53 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Color.blue(0)).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case 636996201:
                    b2 = !str.equals(m1019(14 - (ViewConfiguration.getScrollBarSize() >> 8), 86 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (50879 - TextUtils.indexOf("", "", 0, 0))).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case 890103511:
                    b2 = !str.equals(m1019((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34, KeyEvent.getDeadChar(0, 0) + 18, (char) (Color.argb(0, 0, 0, 0) + 3470)).intern()) ? (byte) -1 : (byte) 4;
                    break;
                case 1252059573:
                    if (!str.equals(m1019(17 - Color.green(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 100, (char) (36852 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern())) {
                        b2 = -1;
                    } else {
                        int i4 = f921 + 5;
                        f918 = i4 % 128;
                        b2 = i4 % 2 != 0 ? (byte) 89 : (byte) 9;
                    }
                    break;
                case 1508614908:
                    b2 = !str.equals(m1019(ExpandableListView.getPackedPositionGroup(0L) + 11, (ViewConfiguration.getFadingEdgeLength() >> 16) + 117, (char) (Gravity.getAbsoluteGravity(0, 0) + 28315)).intern()) ? (byte) -1 : (byte) 10;
                    break;
                case 1835584239:
                    b2 = !str.equals(m1019(17 - TextUtils.lastIndexOf("", '0', 0, 0), 127 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 11;
                    break;
                case 1942443945:
                    if (!str.equals(m1019(View.MeasureSpec.getSize(0) + 12, 6 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 21718)).intern())) {
                        b2 = -1;
                    } else {
                        int i5 = f918 + 119;
                        f921 = i5 % 128;
                        if (i5 % 2 != 0) {
                            b2 = 1;
                        } else {
                            b2 = 0;
                        }
                    }
                    break;
                case 2104624789:
                    if (!str.equals(m1019(7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), ViewConfiguration.getLongPressTimeout() >> 16, (char) (30758 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return FiveAd.class;
                case 1:
                    return CreativeType.class;
                case 2:
                    return FiveAdConfig.class;
                case 3:
                case 4:
                    return FiveAdCustomLayout.class;
                case 5:
                    f918 = (f921 + 119) % 128;
                    return FiveAdFormat.class;
                case 6:
                    return FiveAdInterface.class;
                case 7:
                    return FiveAdInterstitial.class;
                case 8:
                    return FiveAdListener.class;
                case 9:
                    return FiveAdVideoReward.class;
                case 10:
                    return FiveAdState.class;
                case 11:
                    return FiveAdLoadListener.class;
                case 12:
                    return FiveAdViewEventListener.class;
                case 13:
                case 14:
                    return AdActivity.class;
                case 15:
                    return FiveAdInterstitialEventListener.class;
                case 16:
                    return FiveAdVideoRewardEventListener.class;
                default:
                    return null;
            }
        }
        str.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1026(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        f918 = (f921 + 77) % 128;
        fiveAdInterface.setListener(fiveAdListener);
        int i2 = f918 + 1;
        f921 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        String sdkSemanticVersion;
        int i2 = f918 + 73;
        f921 = i2 % 128;
        if (i2 % 2 == 0) {
            sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
            int i3 = 5 / 0;
        } else {
            sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        }
        f921 = (f918 + 119) % 128;
        return sdkSemanticVersion;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1032(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i2 = f921 + 47;
        f918 = i2 % 128;
        int i3 = i2 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        f921 = (f918 + 117) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1031(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f918 = (f921 + 41) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f921 = (f918 + 55) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1021(FiveAdCustomLayout fiveAdCustomLayout) {
        f921 = (f918 + 91) % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        f921 = (f918 + 125) % 128;
        return advertiserName;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1019(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f920[i3 + i4]) ^ (((long) i4) * f919)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1023(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f917, i2, cArr, 0, i3);
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
}
