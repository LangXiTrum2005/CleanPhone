package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.vungle.ads.BannerAd;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.BannerView;
import com.vungle.ads.BaseAd;
import com.vungle.ads.BaseAdListener;
import com.vungle.ads.BaseFullscreenAd;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.FullscreenAd;
import com.vungle.ads.FullscreenAdListener;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.RewardedAdListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.ui.VungleActivity;
import com.vungle.ads.internal.ui.VungleWebClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ci extends bg {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1266 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1267 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1268 = 6;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1269 = {'A', 'd', 's', 'e', 't', 'P', 'a', 'y', 'l', 'o', 'p', 'N', 'B', 'n', 'r', 'L', 'i', 'c', 'm', '.', 'v', AbstractJsonLexerKt.UNICODE_ESC, 'g', 'V', 'w', 'C', 'h', 'b', 'R', 'F', 'I', 'U', 'T', 'S', 'D', 'E'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1270 = -8851093706496144865L;

    public ci(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1480(AdPayload.AdUnit adUnit) {
        f1267 = (f1266 + 11) % 128;
        String strM1486 = m1486(adUnit);
        int i2 = f1266 + 13;
        f1267 = i2 % 128;
        if (i2 % 2 == 0) {
            return strM1486;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.TemplateSettings m1482(AdPayload.AdUnit adUnit) {
        f1266 = (f1267 + 73) % 128;
        AdPayload.TemplateSettings templateSettingsM1489 = m1489(adUnit);
        f1267 = (f1266 + 61) % 128;
        return templateSettingsM1489;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1491(AdPayload.CacheableReplacement cacheableReplacement) {
        int i2 = f1266 + 51;
        f1267 = i2 % 128;
        int i3 = i2 % 2;
        String strM1487 = m1487(cacheableReplacement);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        f1267 = (f1266 + 15) % 128;
        return strM1487;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdPayload.AdUnit m1494(AdPayload adPayload) {
        int i2 = f1266 + 119;
        f1267 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1485(adPayload);
        }
        m1485(adPayload);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:37:0x0182  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        switch (str.hashCode()) {
            case -1836618638:
                if (!str.equals(m1484("西\uf1f0ѳ께褾ﮋဌ냦ꅷ쌂㢿\ue868\ud9f3ꪞ", TextUtils.getOffsetBefore("", 0) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1791176561:
                if (!str.equals(m1484("멹솦ㅊ佸먻쯘┚克鉠\uf34fන\u09c5", 1 - View.combineMeasuredStates(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1266 + 61;
                    f1267 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 6 : (byte) 75;
                }
                break;
            case -1560947009:
                if (!str.equals(m1490((byte) (TextUtils.indexOf("", "", 0) + 37), "\u000f\u000b\u0013\u0014\u0015\u0016\u0010\u0013\t\u0002\u0012\u0007\u0002\u0003\u0012\r\u0007\f\u000f\u0001\u0011\u0014\u000f\u0004\u009c", 25 - TextUtils.getOffsetBefore("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1267 + 25;
                    f1266 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 10 : (byte) 47;
                }
                break;
            case -1494265129:
                if (!str.equals(m1484("㩒墩ᣒ\ue992㨱務ಁ\uf7e1ቘ橇␆꼬櫆ϛ緊蚦䍂\udb49镎縪鯌\uf4d2꺙⦭\uf050豃옔ŵ죏ꗇῚ\uf881⅃組㜗퀿秗ᔗ䂯诛噧⺤頡损껳", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            case -1435839138:
                if (!str.equals(m1484("㨜ꂰ띣⏍㩚\uaadaꌱ㷼ሓ鉈讫敱檁\ufbc9툔䳼", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case -1179107681:
                if (!str.equals(m1484("\uea41榈⺼ꬭ\uea17揢㫬딗쉑孶ቇ\ued90뫊", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 25;
                }
                break;
            case -609786639:
                if (!str.equals(m1490((byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 88), "\u001b\u0004\u001e\f\r\u0002\u0004\u0002\u0001\u0002", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11).intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case -498709917:
                if (!str.equals(m1484("䬩ߋ趢飕䭠ය駨蛭挧㔣녬\ude65ᮥ岵\ue8f5\uf7ec㈜萼\\\u0f6d\ueaaaꮰ㯩壶脠팲", 1 - (Process.myPid() >> 22)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case -498060603:
                if (!str.equals(m1490((byte) (69 - ExpandableListView.getPackedPositionChild(0L)), "\u0002\u000b\u000b\f\u0000\u0015\u0001\u000fº", 9 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case -486531311:
                if (!str.equals(m1484("\ue700\uf7f9䦗丩\ue74dﶴ巨倽켸씲畟\u0895랋겋ⳏ℈鸑琘", View.MeasureSpec.getMode(0) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case -393802555:
                if (!str.equals(m1490((byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61), "\u001b\u0004\u001e\f\r\u0002\u0004\u0002\u0001\u0002\u0010\u0011\u0003\u0005\u0001\u000f\u0002\u000f", View.MeasureSpec.getMode(0) + 18).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1267 + 31;
                    f1266 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 104 : (byte) 22;
                }
                break;
            case -43797322:
                if (!str.equals(m1490((byte) (111 - Color.green(0)), "\u0018\u0007\u000e\u001d\u0000\t\u001a\t\u0004\u001b\u0004\t\t\u0007\u000f\u0005\u0015\u0000\u0010\u0001", 20 - ExpandableListView.getPackedPositionType(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 307971376:
                if (!str.equals(m1484("\uf1f7찏ꍒﻟ\uf1b5왱뜂\ue0ec\ud9eeﻦ龩롢ꅜ靱옞釯", (ViewConfiguration.getTapTimeout() >> 16) + 1).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 320151695:
                if (!str.equals(m1490((byte) (33 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u001f\f\u0005\u0004\u0014\b\n\u0016\n\u0016\u0007\t\u0001\u0002", KeyEvent.getDeadChar(0, 0) + 14).intern())) {
                    b2 = -1;
                } else {
                    f1266 = (f1267 + 55) % 128;
                    b2 = 17;
                }
                break;
            case 324239304:
                if (!str.equals(m1490((byte) (TextUtils.lastIndexOf("", '0') + 98), "\u0012\f\u0003\u0004\u0001\u0002\u0010\u0011\u0003\u0005\u0001\u000f\u0002\u000f", 14 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 389759008:
                if (!str.equals(m1484("ꬌ쨗䴠桴ꭍ쁬套癇茄\uf8e9燨⻃ﮕ酬", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 484680813:
                if (!str.equals(m1490((byte) (32 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), "\u0001\u0002\u0001\u0003\u0003\u0004\u0094", 7 - Color.green(0)).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1266 + 59;
                    f1267 = i5 % 128;
                    if (i5 % 2 == 0) {
                        b2 = 2;
                    } else {
                        b2 = 5;
                    }
                }
                break;
            case 870529955:
                if (!str.equals(m1490((byte) (94 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0004\u0006\u000b\u0006\u0007\u0003Ã", (ViewConfiguration.getWindowTouchSlop() >> 8) + 7).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 961844241:
                if (!str.equals(m1484("筎辅녆쁊笌藻ꔖ\ude79南뵬趪蛺⯓퓥", 1 - KeyEvent.keyCodeFromString("")).intern())) {
                    b2 = -1;
                } else {
                    f1267 = (f1266 + 43) % 128;
                    b2 = 9;
                }
                break;
            case 989853769:
                if (!str.equals(m1484("䚭䞉\uea96뱗䛎䷹ﻅꈤ溧畧홂\ufae9ᘹ\u1cfb辎퍣㾽쑩朊⯯\ue733\uebf2峝籨貯鍣㑐咰됰뫧\ued9e굓嶭手앗藢Ԥ\u0a00닡\ude1e⪈", -Process.getGidForName("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 1205766784:
                if (!str.equals(m1490((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 14), "\u0012\u0016\u0010\u0013\t\u0002\u0005\f\n\u0016\u0016\u000e\u0001\n", 14 - View.combineMeasuredStates(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case 1208038126:
                if (!str.equals(m1484("璌蜺愔헶瓚赐畄쯌岜뗄巹鍊␖\udc6eю뫊ඝӇ\uecd2", -MotionEvent.axisFromString("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 27;
                }
                break;
            case 1442693170:
                if (!str.equals(m1490((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47), "\u001b\u0017\u009b\u009b\u0005\u000e\u000f\u0002\u0001\u000f\u0001\u0002\u0010\u0011\u0003\u0005\u0001\u000f\u0002\u000f", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 1505622627:
                if (!str.equals(m1490((byte) (96 - TextUtils.getCapsMode("", 0, 0)), "\u0012\fÎÎ\u0002\u000f\u0001\u0002\u0010\u0011\u0003\u0005\u0001\u000f\u0002\u000f", ExpandableListView.getPackedPositionChild(0L) + 17).intern())) {
                    b2 = -1;
                } else {
                    f1266 = (f1267 + 25) % 128;
                    b2 = 7;
                }
                break;
            case 1839869899:
                if (!str.equals(m1490((byte) (121 - KeyEvent.normalizeMetaState(0)), "\u0001\u0002\u0000\u000b\b\t\n\u0007Ý", 9 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f1267 = (f1266 + 73) % 128;
                    b2 = 4;
                }
                break;
            case 1853648591:
                if (!str.equals(m1484("㞇ꙁ㡏籫㟅갿Ⰲ打᾽钯ҙ㫞朌ﴵ崋\u135b亖▼떼\uebde", 1 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 1930966324:
                if (!str.equals(m1484("\u0605槿鱋ퟝٓ掕蠛짧⸕嬁ꂰ酴嚔㊫螺룡缔\uea02ᆍ", 1 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 26;
                }
                break;
            case 1982630644:
                if (!str.equals(m1490((byte) (11 - (ViewConfiguration.getTapTimeout() >> 16)), "\u0012\f\u0003\u0004\u0001\u0002", Gravity.getAbsoluteGravity(0, 0) + 6).intern())) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return AdActivity.class;
            case 2:
                return AdAsset.class;
            case 3:
                return AdInternal.class;
            case 4:
                return AdPayload.class;
            case 5:
                return AppNode.class;
            case 6:
                return BannerAd.class;
            case 7:
                return BannerAdListener.class;
            case 8:
                return BannerAdSize.class;
            case 9:
            case 10:
                return BannerView.class;
            case 11:
                return BaseAd.class;
            case 12:
                return BaseAdListener.class;
            case 13:
                return BaseFullscreenAd.class;
            case 14:
                return AdPayload.CacheableReplacement.class;
            case 15:
                return FullscreenAd.class;
            case 16:
                return FullscreenAdListener.class;
            case 17:
                return InterstitialAd.class;
            case 18:
                return InterstitialAdListener.class;
            case 19:
                return MRAIDPresenter.class;
            case 20:
                return Placement.class;
            case 21:
                return RewardedAd.class;
            case 22:
                f1267 = (f1266 + 65) % 128;
                return RewardedAdListener.class;
            case 23:
            case 24:
                return VungleActivity.class;
            case 25:
                return VungleAds.class;
            case 26:
                return VungleApiClient.class;
            case 27:
                return VungleWebClient.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1481(Placement placement) {
        f1267 = (f1266 + 41) % 128;
        String strM1488 = m1488(placement);
        f1266 = (f1267 + 35) % 128;
        return strM1488;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1483(AppNode appNode) {
        f1267 = (f1266 + 73) % 128;
        String strM1492 = m1492(appNode);
        f1267 = (f1266 + 41) % 128;
        return strM1492;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1493(Placement placement) {
        int i2 = f1266 + 73;
        f1267 = i2 % 128;
        if (i2 % 2 == 0) {
            return m1495(placement);
        }
        m1495(placement);
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        int i2 = f1266 + 115;
        f1267 = i2 % 128;
        try {
            return i2 % 2 != 0 ? mo793().split(m1484("쇓馿乕壪쇾", (ViewConfiguration.getWindowTouchSlop() / 71) + 1).intern())[1] : mo793().split(m1484("쇓馿乕壪쇾", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())[0];
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1490((byte) (120 - TextUtils.indexOf("", "", 0)), "\u0015\u0004\u0005\u0001\u0007\u0001\u000e\u0011ì", (KeyEvent.getMaxKeyCode() >> 16) + 9).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1494((AdPayload) list.get(0));
            }
        });
        map.put(m1484("\ue4cfኮ첈烹\ue4a8ᣔ\ud8c2滥쳃⁅\uf07b㙄", 1 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1483((AppNode) list.get(0));
            }
        });
        map.put(m1490((byte) (MotionEvent.axisFromString("") + 67), "\u0015\u0004\u0001\u001c\u000b\f\u001b\u0002\t\u0018\t\u0002\u001b\u0004\u000b\t\u000b\f\u0000\u0015\u0001\u000f\u0001\"\u0014\u000e", TextUtils.getTrimmedLength("") + 26).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1491((AdPayload.CacheableReplacement) list.get(0));
            }
        });
        map.put(m1484("⢃呆郙쏾⣤帼蒓\udde0\u009e暰갓蕆砒༶\uf581", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1480((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1490((byte) (44 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0015\u0004\u0005\u0000\t\u0007\u000f\u0005\u0015\u0000\u0010\u0001\u001f\u0000", TextUtils.getOffsetAfter("", 0) + 14).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1481((Placement) list.get(0));
            }
        });
        map.put(m1490((byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 119), "\u0015\u0004\u0002\"\u0000\u0015\u000b\t\n\u0000\t\u0003\u0004\u0005\n\u0016\u0010\u0013ê", 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return ci.m1482((AdPayload.AdUnit) list.get(0));
            }
        });
        map.put(m1490((byte) (112 - (ViewConfiguration.getScrollBarSize() >> 8)), "\u000e\u0004\u001b\u0004\u001e\f\r\u0002\u0004\u0002\u0016\u0011\u0002\u0004ß", (ViewConfiguration.getWindowTouchSlop() >> 8) + 15).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Boolean.valueOf(ci.m1493((Placement) list.get(0)));
            }
        });
        int i2 = f1266 + 121;
        f1267 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾇ */
    public final String mo793() {
        f1266 = (f1267 + 31) % 128;
        try {
            String strM2314 = hr.m2242().m2245().m2314(BuildConfig.class, m1484("塊䎥鈒誔堔䧦虈钒灪煚꺆찐࢙ᣮ\uf740\ue5ef℔쀒", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
            f1267 = (f1266 + 43) % 128;
            return strM2314;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1492(AppNode appNode) {
        int i2 = f1266 + 81;
        f1267 = i2 % 128;
        int i3 = i2 % 2;
        String appId = appNode.getAppId();
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return appId;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static AdPayload.TemplateSettings m1489(AdPayload.AdUnit adUnit) {
        int i2 = f1266 + 53;
        f1267 = i2 % 128;
        if (i2 % 2 == 0) {
            return adUnit.getTemplateSettings();
        }
        adUnit.getTemplateSettings();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1495(Placement placement) {
        int i2 = f1266 + 1;
        f1267 = i2 % 128;
        if (i2 % 2 != 0) {
            placement.isRewardedVideo();
            throw null;
        }
        boolean zIsRewardedVideo = placement.isRewardedVideo();
        int i3 = f1266 + 103;
        f1267 = i3 % 128;
        if (i3 % 2 == 0) {
            return zIsRewardedVideo;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1490(byte b2, String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (i.f2343) {
            try {
                char[] cArr2 = f1269;
                char c2 = f1268;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1484(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1270, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1270));
                        f.f1954 = i3 + 1;
                    } else {
                        str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdPayload.AdUnit m1485(AdPayload adPayload) {
        f1266 = (f1267 + 7) % 128;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        f1267 = (f1266 + 93) % 128;
        return adUnit;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1487(AdPayload.CacheableReplacement cacheableReplacement) {
        int i2 = f1267 + 51;
        f1266 = i2 % 128;
        int i3 = i2 % 2;
        String url = cacheableReplacement.getUrl();
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return url;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1486(AdPayload.AdUnit adUnit) {
        int i2 = f1267 + 109;
        f1266 = i2 % 128;
        if (i2 % 2 == 0) {
            adUnit.getCampaign();
            throw null;
        }
        String campaign = adUnit.getCampaign();
        int i3 = f1266 + 121;
        f1267 = i3 % 128;
        if (i3 % 2 == 0) {
            return campaign;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1488(Placement placement) {
        f1266 = (f1267 + 11) % 128;
        String referenceId = placement.getReferenceId();
        int i2 = f1267 + 119;
        f1266 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 80 / 0;
        }
        return referenceId;
    }
}
