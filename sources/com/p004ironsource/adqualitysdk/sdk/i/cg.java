package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class cg extends bg {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1253 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1254 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f1255 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f1257 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1259 = 108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1258 = {179, 176, 192, 173, 208, 191, 215, 207, 219, 217, 154, 221, 209, 205, 223, 224, 213, 226, 229, 184, 218, 220, 190, 227, 222, 188, 193, 210, 181, 216, 194, 174, 225, 211, 185, 177, 228};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f1256 = -1208578363341381770L;

    public cg(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static IGDTAdManager m1465() {
        int i2 = f1254 + 69;
        f1253 = i2 % 128;
        if (i2 % 2 != 0) {
            return GDTAdSdk.getGDTAdManger();
        }
        GDTAdSdk.getGDTAdManger();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ IGDTAdManager m1466() {
        int i2 = f1254 + 107;
        f1253 = i2 % 128;
        if (i2 % 2 == 0) {
            m1465();
            throw null;
        }
        IGDTAdManager iGDTAdManagerM1465 = m1465();
        int i3 = f1254 + 73;
        f1253 = i3 % 128;
        if (i3 % 2 != 0) {
            return iGDTAdManagerM1465;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m1467(LiteAbstractAD liteAbstractAD) {
        f1254 = (f1253 + 73) % 128;
        Map<String, Object> mapM1476 = m1476(liteAbstractAD);
        int i2 = f1253 + 45;
        f1254 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapM1476;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ int m1469(RewardVideoAD rewardVideoAD) {
        f1253 = (f1254 + 23) % 128;
        int iM1472 = m1472(rewardVideoAD);
        int i2 = f1253 + 95;
        f1254 = i2 % 128;
        if (i2 % 2 == 0) {
            return iM1472;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1475(APPStatus aPPStatus) {
        f1253 = (f1254 + 91) % 128;
        String strM1473 = m1473(aPPStatus);
        f1253 = (f1254 + 35) % 128;
        return strM1473;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m1477(UnifiedInterstitialAD unifiedInterstitialAD) {
        f1253 = (f1254 + 11) % 128;
        Map mapM1471 = m1471(unifiedInterstitialAD);
        int i2 = f1253 + 87;
        f1254 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapM1471;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:86:0x030a  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 22;
        switch (str.hashCode()) {
            case -1950656211:
                if (!str.equals(m1474(null, null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u008d\u0096\u008e\u0088\u008f\u0085\u0095\u008e\u0094").intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -1537668511:
                if (!str.equals(m1470("弣㜵轅林ﾫ埲⸜蘄Ṱ\uf697仑⛫봙ᕋ\ued69䖡\uddcf뗪ర\ue460粶", 26668 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -1192770783:
                if (!str.equals(m1474(null, null, (KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u008d\u0096\u008e\u0088\u008f\u0085\u0095\u008e\u0094\u0089\u008d\u0085\u0091\u0092\u0085\u0099\u008e\u0098\u008d\u0097").intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -1125491209:
                if (!str.equals(m1474(null, null, 127 - Color.alpha(0), "\u0099\u008d\u0095\u008d\u0090\u008f\u0091\u0094\u0082\u0084").intern())) {
                    b2 = -1;
                } else {
                    b2 = 25;
                }
                break;
            case -1040623465:
                if (!str.equals(m1470("弲럾軕\ue5b9ﲝ퍴⩱Ĳ᠊烶䟊庴떎豢", (ViewConfiguration.getTouchSlop() >> 8) + 59617).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -839956733:
                if (!str.equals(m1470("弣齵\udfc5ṗ庫鴲\udd9c᷏屿鳍\udb5aᮼ娘骩\udae9ᥰ姑", 49261 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case -570955421:
                if (!str.equals(m1470("弤\ue0ce₻悀ꁰ\ue043\u200e怔ꇺ\ue1d6↻慈ꅮ\ue103℉拶ꋒ\ue2be⊒扴ꉀ", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 49117).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -427681737:
                if (!str.equals(m1470("強ꍽꞭ꯭긯늓뛘", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 64591).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case -358530385:
                if (!str.equals(m1470("强쩒疁\ue0f3ਛ땥⃤䨚\uf55c悴诵㔼", 38218 - ImageFormat.getBitsPerPixel(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case -311779863:
                if (!str.equals(m1474(null, null, ExpandableListView.getPackedPositionType(0L) + 127, "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u008d\u0096\u008e\u0088\u008f\u0085\u0095\u008e\u0094\u0089\u008d\u0085\u0091\u0092\u0085\u0099\u008e\u0098\u008d\u0097\u008b\u008f\u0085\u008e\u008b\u008d\u008b\u008c\u008c\u008b\u008a\u0089\u0088").intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -301299368:
                if (!str.equals(m1470("強གྷ\uffd8까ề촷붵氏\udc9b賽筝⯉驛䪻㤬\ue98c堔", (ViewConfiguration.getTapTimeout() >> 16) + 20593).intern())) {
                    b2 = -1;
                } else {
                    f1254 = (f1253 + 93) % 128;
                }
                break;
            case -287046183:
                if (!str.equals(m1474(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u0090\u0091\u008e\u0099\u0090\u0099\u0089\u009a\u0089\u008d\u0085\u0091\u0092\u0085\u0099\u008e\u0098\u008d\u0097").intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case -207731435:
                if (!str.equals(m1470("引덄螡驏\uee73싖핶⦘㶰ၒ撰磺䬄徟눏虷髒\ued29솝헸⡆㲖\u10cc捬瞭䨗幭닏蔳馋\uede9", Color.rgb(0, 0, 0) + 16837725).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 2003474:
                if (!str.equals(m1470("強蔊\ueb5c톏", 55871 - (Process.myPid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case 167349330:
                if (!str.equals(m1470("強棻ゥ\uf84e耦䧲ᆶ\ud960\ue14aꤞ", 14281 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    f1254 = (f1253 + 57) % 128;
                    b2 = 1;
                }
                break;
            case 555831221:
                if (!str.equals(m1474(null, null, Color.red(0) + 127, "\u0099\u008d\u0095\u008d\u0090\u008f\u0091\u0094\u0082\u0084\u0099\u008d\u0095\u0095\u008e \u0085\u008d\u0091\u009c\u0091\u0095\u009b").intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case 796884557:
                if (!str.equals(m1470("弦뾌鸮ﺽ\udd50㷾ᱡ笑実먏髥沈\ud9fe㢎ᜦ瞤噒뛪", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 57493).intern())) {
                    b2 = -1;
                } else {
                    f1253 = (f1254 + 121) % 128;
                    b2 = 7;
                }
                break;
            case 814717722:
                if (!str.equals(m1474(null, null, View.MeasureSpec.getMode(0) + 127, "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u008b\u008f\u0085\u008e\u008b\u008d\u008b\u008c\u008c\u008b\u008a\u0089\u0088").intern())) {
                    b2 = -1;
                } else {
                    f1254 = (f1253 + 49) % 128;
                }
                break;
            case 937653587:
                if (!str.equals(m1474(null, null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u008f¡\u0090\u008e\u0090\u0086\u009a\u009a\u0084").intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case 1265986405:
                if (!str.equals(m1474(null, null, MotionEvent.axisFromString("") + 128, "\u0093\u0090\u0091\u0092\u0091\u0090\u0088\u0084\u0082\u0084\u008d\u0096\u008e\u0088\u008f\u0085\u0095\u008e\u0094\u008b\u008f\u0085\u008e\u008b\u008d\u008b\u008c\u008c\u008b\u008a\u0089\u0088").intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 1305853839:
                if (!str.equals(m1474(null, null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u0082\u0084\u0089\u008d\u0085\u0091\u009f\u0085\u0099\u008e\u0098\u008d\u0097").intern())) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 1336889139:
                if (!str.equals(m1470("强ᰘ\ud90c阆匫့촯訳䜼Ш셓빏筣㡩", 17159 - Drawable.resolveOpacity(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            case 1773421109:
                if (!str.equals(m1474(null, null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0099\u008d\u0095\u008d\u0090\u008f\u0091\u0094\u0082\u0084\u009e\u008e\u0091\u0090\u0091\u0090\u008f\u0099\u008d\u0090\u0095\u009d\u0085\u008d\u0091\u009c\u0091\u0095\u009b").intern())) {
                    b2 = -1;
                } else {
                    f1254 = (f1253 + 101) % 128;
                    b2 = 14;
                }
                break;
            case 1874129984:
                if (!str.equals(m1474(null, null, ExpandableListView.getPackedPositionType(0L) + 127, "\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case 1958130193:
                if (!str.equals(m1470("引阤쵡ӯ篳넶\ue836\udfb8ᚰ䰲荰漢ㆄ朽幅閒쳇ȉ祘낇\ue7db\udd13ᐭ䭢芞溺⼶晭嶨链쨹š碗꿯\ue52d\udc42᎖䫎耎\uf754⺊旊", 51517 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 2111488863:
                if (!str.equals(m1470("引ﱐᦉ뚃툣潪賮⧬䔐\ue286㿈嬦\uf834ᖇ닡칐殊裀\u2433䅜麡㯿坙\uf48fᇇ괣쩥", 41802 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1254 + 7;
                    f1253 = i2 % 128;
                    b2 = i2 % 2 != 0 ? (byte) 4 : (byte) 2;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
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
                int i3 = f1254 + 103;
                f1253 = i3 % 128;
                if (i3 % 2 != 0) {
                    return UnifiedBannerView.class;
                }
                throw null;
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
    public static /* synthetic */ Map m1468(RewardVideoAD rewardVideoAD) {
        f1254 = (f1253 + 65) % 128;
        Map<String, String> mapM1478 = m1478(rewardVideoAD);
        int i2 = f1253 + 11;
        f1254 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return mapM1478;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1474(null, null, TextUtils.getCapsMode("", 0, 0) + 127, "\u0099\u008d¢\u0095\u008e£\u0085\u0084\u0083\u0082\u0081\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cg.m1466();
            }
        });
        map.put(m1470("弑䜦潨ឨ㿒☏츁\uf661", TextUtils.lastIndexOf("", '0') + 6198).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cg.m1475((APPStatus) list.get(0));
            }
        });
        map.put(m1474(null, null, 127 - Color.blue(0), "\u0089\u009c\u0095\u009d\u008e\u0099\u0090¥¤\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cg.m1467((LiteAbstractAD) list.get(0));
            }
        });
        map.put(m1470("弑潪㿰칏黷굜緁ో\udcda\ueb76뮨䨑᪣⤣轢", 12409 - KeyEvent.normalizeMetaState(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Integer.valueOf(cg.m1469((RewardVideoAD) list.get(0)));
            }
        });
        map.put(m1474(null, null, View.MeasureSpec.getMode(0) + 127, "\u008f\u0090¥¤\u0085\u008d\u0085\u0099\u008e\u0098\u008d\u0097\u0090\u008d¢").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cg.m1468((RewardVideoAD) list.get(0));
            }
        });
        map.put(m1470("弑䋦擨۠⣌쫋\uecad躷낭功璍ᚅ㡣\uda66ﱼ鹨聞ꉇ", 7669 - View.resolveSizeAndState(0, 0, 0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cg.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cg.m1477((UnifiedInterstitialAD) list.get(0));
            }
        });
        f1254 = (f1253 + 119) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1254 = (f1253 + 113) % 128;
        String integrationSDKVersion = SDKStatus.getIntegrationSDKVersion();
        int i2 = f1253 + 23;
        f1254 = i2 % 128;
        if (i2 % 2 == 0) {
            return integrationSDKVersion;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> m1476(LiteAbstractAD liteAbstractAD) {
        int i2 = f1253 + 123;
        f1254 = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> extraInfo = liteAbstractAD.getExtraInfo();
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        f1254 = (f1253 + 23) % 128;
        return extraInfo;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, String> m1478(RewardVideoAD rewardVideoAD) {
        int i2 = f1254 + 39;
        f1253 = i2 % 128;
        if (i2 % 2 != 0) {
            return rewardVideoAD.getExts();
        }
        rewardVideoAD.getExts();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map m1471(UnifiedInterstitialAD unifiedInterstitialAD) {
        f1254 = (f1253 + 13) % 128;
        Map ext = unifiedInterstitialAD.getExt();
        f1254 = (f1253 + 17) % 128;
        return ext;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1470(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1256);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1473(APPStatus aPPStatus) {
        f1254 = (f1253 + 1) % 128;
        String appid = aPPStatus.getAPPID();
        int i2 = f1253 + 93;
        f1254 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return appid;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int m1472(RewardVideoAD rewardVideoAD) {
        f1254 = (f1253 + 45) % 128;
        int rewardAdType = rewardVideoAD.getRewardAdType();
        f1253 = (f1254 + 35) % 128;
        return rewardAdType;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1474(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f2877) {
            try {
                char[] cArr2 = f1258;
                int i3 = f1259;
                if (f1257) {
                    int length = bArr.length;
                    o.f2878 = length;
                    char[] cArr3 = new char[length];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i4 = o.f2879;
                        int i5 = o.f2878 - 1;
                        int i6 = o.f2879;
                        cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                        o.f2879 = i6 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1255) {
                    int length2 = cArr.length;
                    o.f2878 = length2;
                    char[] cArr4 = new char[length2];
                    o.f2879 = 0;
                    while (o.f2879 < o.f2878) {
                        int i7 = o.f2879;
                        int i8 = o.f2878 - 1;
                        int i9 = o.f2879;
                        cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                        o.f2879 = i9 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                o.f2878 = length3;
                char[] cArr5 = new char[length3];
                o.f2879 = 0;
                while (o.f2879 < o.f2878) {
                    int i10 = o.f2879;
                    int i11 = o.f2878 - 1;
                    int i12 = o.f2879;
                    cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                    o.f2879 = i12 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
