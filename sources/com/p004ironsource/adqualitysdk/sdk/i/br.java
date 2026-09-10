package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.inmobi.rendering.InMobiAdActivity;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class br extends bg {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f962 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f963 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f964 = 61984;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f965 = 46699;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f966 = 31030;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f967 = 31721;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f968 = {-879577190, -882164830, 1604227397, 995209873, 1725259638, -1017652698, 600555090, -1030020438, 1506254083, 1783816694, 1151367658, -1942719544, -748128709, 1519642252, 1312400548, 1938529242, 153260111, -1988002435};

    public br(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static Enum m1077(String str) {
        byte b2;
        int iHashCode = str.hashCode();
        if (iHashCode != -2102692847) {
            if (iHashCode != -1357644918) {
                if (iHashCode == 235669401 && str.equals(m1082("빈뾜㹝\uecdb\uf764\ua7e5맳幐陼뎞ｃଥਉꆮ\ue784\ue2df韃\ue275ˬ䡀ꇍ月颦蜆", 24 - View.MeasureSpec.getSize(0)).intern())) {
                    f963 = (f962 + 53) % 128;
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m1082("빈뾜㹝\uecdb\uf764\ua7e5맳幐陼뎞ｃଥਉꆮ\ue784\ue2df빎\ue8df崚봐뤦곯", 22 - View.getDefaultSize(0, 0)).intern())) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m1084(new int[]{1797433126, -1114109642, 523570435, 1915880606, 711027446, 1162499658, 403964555, 392865803, -2040021889, 1733547599, 1519158691, -1900472330}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25).intern())) {
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_UNSUPPORTED_OR_UNKNOWN;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                return null;
            }
            return AdUnit.AdCreativeType.AD_CREATIVE_TYPE_DISPLAY;
        }
        AdUnit.AdCreativeType adCreativeType = AdUnit.AdCreativeType.AD_CREATIVE_TYPE_VIDEO;
        int i2 = f963 + 13;
        f962 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return adCreativeType;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1078(String str) {
        f963 = (f962 + 25) % 128;
        Enum enumM1077 = m1077(str);
        f963 = (f962 + 49) % 128;
        return enumM1077;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1079(String str) {
        int i2 = f962 + 23;
        f963 = i2 % 128;
        if (i2 % 2 == 0) {
            m1081(str);
            throw null;
        }
        Enum enumM1081 = m1081(str);
        int i3 = f963 + 13;
        f962 = i3 % 128;
        if (i3 % 2 == 0) {
            return enumM1081;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static Enum m1080(String str) {
        int i2 = f963 + 3;
        f962 = i2 % 128;
        if (i2 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        int iHashCode = str.hashCode();
        byte b2 = -1;
        if (iHashCode != -1097819034) {
            if (iHashCode == 1554700484 && str.equals(m1082("㗑ᨢ㥦\ue28a㻧幃\ue293᠙⥒嚔ਉꆮ\ue784\ue2df鎦뽃뉗盨북მ䴒횱", 21 - KeyEvent.normalizeMetaState(0)).intern())) {
                int i3 = f962;
                int i4 = i3 + 61;
                f963 = i4 % 128;
                b2 = i4 % 2 == 0 ? (byte) 1 : (byte) 0;
                f963 = (i3 + 125) % 128;
            }
        } else if (!(!str.equals(m1082("㗑ᨢ㥦\ue28a㻧幃\ue293᠙⥒嚔ਉꆮ\ue784\ue2df癕㻦\ue9a8焖斟顧\uf834ﲒ豚ቫ\u20fcᓇ", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25).intern()))) {
            b2 = 1;
        }
        if (b2 == 0) {
            return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_INLINE;
        }
        if (b2 != 1) {
            return null;
        }
        return AdContainer.RenderingProperties.PlacementType.PLACEMENT_TYPE_FULLSCREEN;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Enum m1081(String str) {
        int iHashCode = str.hashCode();
        byte b2 = 0;
        if (iHashCode != 556003820) {
            if (iHashCode != 556062505) {
                if (iHashCode == 1382961856 && str.equals(m1084(new int[]{1577608695, -1835496182, -1137200615, -1133653985, 986085315, -1438685041, 1839803936, 894700136, -1949102803, 1265404475, 960598883, -914825055}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22).intern())) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m1084(new int[]{1577608695, -1835496182, -1137200615, -1133653985, 986085315, -1438685041, -1706879443, 944468558, -2130451404, -1001732823, -138042545, -14831812}, 22 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                int i2 = f963 + 37;
                f962 = i2 % 128;
                if (i2 % 2 == 0) {
                    b2 = 1;
                }
            } else {
                b2 = -1;
            }
        } else if (!str.equals(m1084(new int[]{1577608695, -1835496182, -1137200615, -1133653985, 986085315, -1438685041, -1706879443, 944468558, -1667072425, -731932801, 1821196440, -1932097693}, 23 - View.MeasureSpec.getMode(0)).intern())) {
            b2 = -1;
        }
        if (b2 == 0) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_HTML;
        }
        if (b2 == 1) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_INM_JSON;
        }
        if (b2 == 2) {
            return AdUnit.AdMarkupType.AD_MARKUP_TYPE_UNKNOWN;
        }
        int i3 = f962 + 81;
        f963 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1082(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f965)) ^ ((c3 >>> 5) + f966)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f964) ^ ((c4 + i4) ^ ((c4 << 4) + f967))));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Enum m1085(String str) {
        f962 = (f963 + 119) % 128;
        Enum enumM1080 = m1080(str);
        int i2 = f963 + 43;
        f962 = i2 % 128;
        if (i2 % 2 == 0) {
            return enumM1080;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Object m1086(AdContainer adContainer) {
        int i2 = f963 + 69;
        f962 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1083(adContainer);
        }
        m1083(adContainer);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1082("㟒Yᣆ䔍\uef43\u1976쇚⺌럃汗ɿ諒攂沅\ue4fd\ua4cc\uaaf9ྵ効㐞", 20 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return br.m1085((String) list.get(0));
            }
        });
        map.put(m1084(new int[]{-1325583658, -356988830, 456162400, 409521407, -1318122063, -185687930, -526888383, 567067927, -537793297, 882054680}, TextUtils.lastIndexOf("", '0', 0, 0) + 20).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return br.m1079((String) list.get(0));
            }
        });
        map.put(m1082("㟒Yᖓ\udf8f\uf7d2睴ﺥ⚕㳒精鎓엙", (ViewConfiguration.getJumpTapTimeout() >> 16) + 12).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return br.m1086((AdContainer) list.get(0));
            }
        });
        map.put(m1084(new int[]{-1325583658, -356988830, 26855587, 1481536955, -737267053, 2134533507, -1585324329, -1952181786, 349060477, -1020702958}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return br.m1078((String) list.get(0));
            }
        });
        int i2 = f963 + 73;
        f962 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01a8  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 8;
        int i2 = f962 + 25;
        f963 = i2 % 128;
        if (i2 % 2 == 0) {
            str.hashCode();
            throw null;
        }
        switch (str.hashCode()) {
            case -2044438337:
                b2 = !str.equals(m1082("\ue2f7訨윴䇩ᳶᫎ∽\udab0\ue30e㘓뒠ﮨ\ue4fd\ua4cc꿓註\ue727䣀癸䨩", 19 - ExpandableListView.getPackedPositionGroup(0L)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case -1769689844:
                b2 = !str.equals(m1084(new int[]{2124112703, 1179214698, -1852376542, 1778487121, -1832946988, 1260471895}, 9 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 12;
                break;
            case -1716191362:
                b2 = !str.equals(m1084(new int[]{-2136139609, -1373521654, 1033830119, -486120907, -198826673, -1345232758}, TextUtils.getOffsetBefore("", 0) + 11).intern()) ? (byte) -1 : (byte) 6;
                break;
            case -1405271692:
                if (!str.equals(m1084(new int[]{-378588462, -1360349884, -1354357686, -2066276990, -1487222396, 833703350, -1062392303, 36453993, -509287195, -1927575254, -138218153, -671225248, -483875375, -1842205950}, 25 - Color.green(0)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f962 + 103;
                    f963 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 16 : (byte) 103;
                }
                break;
            case -1401317165:
                b2 = !str.equals(m1082("멂ᄋ\ua7e1\ue4ba깊駞㓭\ue962ɿ諒宲逢떁ㄘ٩∉ᳶᫎ", 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 20;
                break;
            case -1304544044:
                if (!str.equals(m1084(new int[]{-378588462, -1360349884, -1985638432, -1643839544, 1171244331, -1280013788, -2139587480, -2031791793, -416741179, -1884826754, -483875375, -1842205950}, (-16777195) - Color.rgb(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f962 + 43;
                    f963 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 19 : (byte) 72;
                }
                break;
            case -1062227179:
                if (!str.equals(m1084(new int[]{-391925456, 673701452, 689481872, 1708802250, 1241670671, 70507637, 639298609, 2113889968, -1923115505, 1496610552, -505993376, 921485426, -962558371, 1456575494, 687134739, -1968224970, 1334210492, -420955023, -326964265, 401511982}, 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f962 + 103;
                    f963 = i5 % 128;
                    if (i5 % 2 != 0) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                }
                break;
            case -808014786:
                b2 = !str.equals(m1082("濚䥭\ue4e2猧䙼袠夓閴\ue2f7訨䍷덊씎ᆨ锖\uf518", 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 13;
                break;
            case -595852006:
                b2 = !str.equals(m1084(new int[]{2124112703, 1179214698, -488533191, 1799397526, 181899115, -1041419219}, 12 - View.resolveSize(0, 0)).intern()) ? (byte) -1 : (byte) 10;
                break;
            case -560158238:
                b2 = !str.equals(m1082("濚䥭\ue4e2猧䙼袠夓閴㍆㎩\udadc곹\uebbc\ueb3b腖ꈤ昊꾬", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 17).intern()) ? (byte) -1 : (byte) 2;
                break;
            case -541364416:
                if (!str.equals(m1082("濚䥭\ue4e2猧䙼袠夓閴㍆㎩\udadc곹\uebbc\ueb3b腖ꈤ", 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -235933147:
                b2 = !str.equals(m1084(new int[]{-398937052, -1623649208, -1990307001, -112687820, -98826422, -24827573}, TextUtils.getOffsetAfter("", 0) + 12).intern()) ? (byte) -1 : (byte) 5;
                break;
            case -204096109:
                b2 = !str.equals(m1084(new int[]{-391925456, 673701452, 689481872, 1708802250, 1222083231, -1948843300, 987164652, 2081438622, 639298609, 2113889968, -1923115505, 1496610552, -505993376, 921485426, -962558371, 1456575494, 687134739, -1968224970, 1334210492, -420955023, -326964265, 401511982}, 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -93733047:
                b2 = !str.equals(m1082("䒈쉭\udadc곹㓭\ue962멂ᄋ\ua7e1\ue4ba㛏ﲷ\ue727䣀듟ঞ", View.resolveSize(0, 0) + 15).intern()) ? (byte) -1 : (byte) 4;
                break;
            case -32161126:
                if (!str.equals(m1082("濚䥭\ue4e2猧䙼袠濚䥭䂬ꂁ♭鷮\udadc곹\udadc곹藆ၑ", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f963 + 15;
                    f962 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 11 : (byte) 26;
                }
                break;
            case 99044255:
                if (!str.equals(m1084(new int[]{31414016, -1334975134, -740468090, 478851676, -905807584, -995308993, 349060477, -1020702958}, 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f963 = (f962 + 7) % 128;
                }
                break;
            case 515339810:
                b2 = !str.equals(m1082("멂ᄋකṇ狘쭲咬⒃夓閴", (ViewConfiguration.getFadingEdgeLength() >> 16) + 10).intern()) ? (byte) -1 : (byte) 14;
                break;
            case 957243679:
                b2 = !str.equals(m1082("\uf114匘弰頷ᳶᫎ夓閴\u20ce遟٩∉쐹ප躀妽䂬ꂁ臎ҝ禍鮝", 22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern()) ? (byte) -1 : (byte) 18;
                break;
            case 1228411167:
                b2 = !str.equals(m1082("濚䥭䂬ꂁ♭鷮\udadc곹\udadc곹藆ၑ夓閴\u20ce遟٩∉쐹ප躀妽䂬ꂁ臎ҝ禍鮝", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 26).intern()) ? (byte) -1 : (byte) 17;
                break;
            case 1955888231:
                if (!str.equals(m1084(new int[]{285880089, -1070842873, -1588675934, -1160200107}, 6 - Color.alpha(0)).intern())) {
                    b2 = -1;
                } else {
                    int i7 = f962 + 59;
                    f963 = i7 % 128;
                    b2 = i7 % 2 != 0 ? (byte) 15 : (byte) 68;
                }
                break;
            case 2035398868:
                if (!str.equals(m1084(new int[]{1171244331, -1280013788, -905807584, -995308993, 349060477, -1020702958}, Color.green(0) + 9).intern())) {
                    b2 = -1;
                } else {
                    f963 = (f962 + 105) % 128;
                    b2 = 9;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return InMobiAdActivity.class;
            case 2:
            case 3:
                return com.inmobi.ads.rendering.InMobiAdActivity.class;
            case 4:
                return NativeVideoView.class;
            case 5:
                return AdUnit.AdMarkupType.class;
            case 6:
                return AdContainer.class;
            case 7:
                return AdContainer.RenderingProperties.class;
            case 8:
                return AdContainer.RenderingProperties.PlacementType.class;
            case 9:
                return AdContainer.EventType.class;
            case 10:
                return InMobiBanner.class;
            case 11:
                return InMobiInterstitial.class;
            case 12:
                return InMobiSdk.class;
            case 13:
                return InMobiAdRequest.class;
            case 14:
                return ViewableAd.class;
            case 15:
                return AdUnit.class;
            case 16:
                return NativeRecyclerViewAdapter.class;
            case 17:
                return InterstitialAdEventListener.class;
            case 18:
                return BannerAdEventListener.class;
            case 19:
                return NativeAdEventListener.class;
            case 20:
                return VideoEventListener.class;
            default:
                return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f962 + 83;
        f963 = i2 % 128;
        if (i2 % 2 != 0) {
            return InMobiSdk.getVersion();
        }
        InMobiSdk.getVersion();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Object m1083(AdContainer adContainer) {
        int i2 = f962 + 45;
        f963 = i2 % 128;
        int i3 = i2 % 2;
        Object dataModel = adContainer.getDataModel();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        int i5 = f963 + 93;
        f962 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return dataModel;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1084(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f968.clone();
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
}
