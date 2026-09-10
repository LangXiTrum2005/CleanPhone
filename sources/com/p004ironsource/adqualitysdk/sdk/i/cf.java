package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tv.superawesome.lib.samodelspace.saad.SAAd;
import tv.superawesome.lib.samodelspace.saad.SACreative;
import tv.superawesome.lib.samodelspace.saad.SACreativeFormat;
import tv.superawesome.lib.samodelspace.saad.SADetails;
import tv.superawesome.lib.samodelspace.saad.SAMedia;
import tv.superawesome.lib.samodelspace.saad.SAResponse;
import tv.superawesome.lib.samodelspace.vastad.SAVASTAd;
import tv.superawesome.lib.samodelspace.vastad.SAVASTMedia;
import tv.superawesome.lib.sawebplayer.SAWebPlayer;
import tv.superawesome.lib.sawebplayer.SAWebView;
import tv.superawesome.sdk.publisher.AwesomeAds;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAEvent;
import tv.superawesome.sdk.publisher.SAInterface;
import tv.superawesome.sdk.publisher.SAInterstitialAd;
import tv.superawesome.sdk.publisher.SAVersion;
import tv.superawesome.sdk.publisher.SAVideoActivity;
import tv.superawesome.sdk.publisher.SAVideoAd;
import tv.superawesome.sdk.publisher.SAVideoClick;
import tv.superawesome.sdk.publisher.managed.AdViewJavaScriptBridge;
import tv.superawesome.sdk.publisher.managed.SACustomWebView;
import tv.superawesome.sdk.publisher.managed.SAManagedAdActivity;
import tv.superawesome.sdk.publisher.managed.SAManagedAdView;
import tv.superawesome.sdk.publisher.video.AdVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayer;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerController;
import tv.superawesome.sdk.publisher.videoPlayer.IVideoPlayerControllerView;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerActivity;
import tv.superawesome.sdk.publisher.videoPlayer.VideoPlayerController;

/* JADX INFO: loaded from: classes5.dex */
public final class cf extends bg {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1243 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1244 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1245 = 5209044412513079143L;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1246 = 42212;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1247 = 16085;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1248 = 56041;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1249 = 33343;

    public cf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ SAInterface m1457() {
        f1244 = (f1243 + 35) % 128;
        SAInterface sAInterfaceM1458 = m1458();
        f1243 = (f1244 + 57) % 128;
        return sAInterfaceM1458;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static SAInterface m1458() {
        f1244 = (f1243 + 91) % 128;
        SAInterface listener = SAVideoAd.getListener();
        f1243 = (f1244 + 35) % 128;
        return listener;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1459(SAAd sAAd) {
        f1243 = (f1244 + 1) % 128;
        JSONObject jSONObjectM1462 = m1462(sAAd);
        f1244 = (f1243 + 23) % 128;
        return jSONObjectM1462;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1461(SABannerAd sABannerAd, SAInterface sAInterface) {
        f1243 = (f1244 + 9) % 128;
        m1463(sABannerAd, sAInterface);
        f1243 = (f1244 + 17) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m1462(SAAd sAAd) {
        int i2 = f1244 + 73;
        f1243 = i2 % 128;
        if (i2 % 2 == 0) {
            return sAAd.writeToJson();
        }
        sAAd.writeToJson();
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1460("ꍁ᮫㜖㷻凖ꤢ瘰ᏸ渵沟酗ྸ\uddbe舶", 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cf.m1459((SAAd) list.get(0));
            }
        });
        map.put(m1464("伀풳硱鰢⇊䕶\ue924ໟ銮㘺寁ﾕ꣮͘첬偖\uf412᧔", TextUtils.getCapsMode("", 0, 0) + 39857).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cf.m1457();
            }
        });
        map.put(m1460("䓩䕖\udf12҅\u245a㈾侟狪깣⭇逍鱱湄匭侟狪⌧텫", (ViewConfiguration.getLongPressTimeout() >> 16) + 17).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cf.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cf.m1461((SABannerAd) list.get(0), (SAInterface) list.get(1));
                return null;
            }
        });
        f1243 = (f1244 + 25) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1244 = (f1243 + 115) % 128;
        try {
            String sDKVersionNumber = SAVersion.getSDKVersionNumber();
            f1243 = (f1244 + 23) % 128;
            return sDKVersionNumber;
        } catch (Throwable unused) {
            return hr.m2242().m2245().m2314(SAVersion.class, m1460("ッ螳䧗櫖㚃伣瘣\u1fdc庡ퟧ琨穤", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 12).intern());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1463(SABannerAd sABannerAd, SAInterface sAInterface) {
        int i2 = f1243 + 89;
        f1244 = i2 % 128;
        int i3 = i2 % 2;
        sABannerAd.setListener(sAInterface);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1244 + 1;
        f1243 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:129:0x046a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0119  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2;
        switch (str.hashCode()) {
            case -1959951430:
                if (!str.equals(m1460("钹ṫ\u0892鲢ḯ揹㎂ᛈㅫ횤兠멊ᔲ犭遀厤蘝佇륐\uee90梙毼篕\ufddf쯇⣷ؕꝝ", 26 - TextUtils.lastIndexOf("", '0')).intern())) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case -1855458488:
                if (!str.equals(m1464("伮Ἤ\uef34뽔ྲྀ\udf99꾙翀쿮鸛渠㸪蹸幱⺟ﺠ仅ụ\ued01봬െ\udd74굏綕춺鷅淙㰁谸屚Ɽﲊ䲢Შ", (ViewConfiguration.getTouchSlop() >> 8) + 20509).intern())) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case -1788589794:
                if (!str.equals(m1464("伦㼜꼏ὓ轾羋\uef97忟쿩븑⸂鹑\u0e61ﺝ溥\udec2仕㴚괠ᵎ赬綉", TextUtils.getCapsMode("", 0, 0) + 28703).intern())) {
                    b2 = -1;
                } else {
                    b2 = 21;
                }
                break;
            case -1718372116:
                if (!str.equals(m1464("伴\uee91ౌꨴ짞枚蕙", 41399 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) {
                    b2 = -1;
                } else {
                    f1243 = (f1244 + 65) % 128;
                    b2 = 35;
                }
                break;
            case -1711491530:
                if (!str.equals(m1460("❮䟁헽ᶿ쭬\ue714\udf6f굸", 7 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 31;
                }
                break;
            case -1305374924:
                if (!str.equals(m1460("谱齂襨滚퐟덦鋬㺟䑠\ue0df㯟䝕㘽\ueec6⽗\u2d6b熂썸ഐནဎ◷\uf252霷逍鱱晽쇔బ欅䧋\uf700ꚺ䎎罖警旔줽❮䟁猆熖ꚺ䎎罖警⌊\ue10c⌊\ue10c뀵嵙汍ൕ凖ꤢ쏟뒠", 58 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
                }
                break;
            case -1292741795:
                if (!str.equals(m1464("伴譇쟳ȅ庰髖할ᆤ", 50273 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b2 = -1;
                } else {
                    f1243 = (f1244 + 69) % 128;
                    b2 = 25;
                }
                break;
            case -1246480821:
                if (!str.equals(m1460("\u0892鲢ḯ揹㎂ᛈㅫ횤兠멊ũઞ뀵嵙汍ൕ凖ꤢ쏟뒠", Drawable.resolveOpacity(0, 0) + 19).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case -983382056:
                if (!str.equals(m1460("\u0892鲢ḯ揹㎂ᛈㅫ횤兠멊ᔲ犭遀厤蘝佇륐\uee90梙毼⌧텫", 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    f1243 = (f1244 + 7) % 128;
                    b2 = 15;
                }
                break;
            case -926853969:
                if (!str.equals(m1460("❮䟁딃벹峘䰈遀厤䓩䕖", 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 32;
                }
                break;
            case -877887884:
                if (!str.equals(m1464("伮\ue70aὸ랲\uefeeد빕횖ໞꔍ\udd4c疜균엷簳鑦첥擣鬭㍪殞菂㨣剃誊⋓", View.MeasureSpec.getMode(0) + 43067).intern())) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case -844831949:
                if (!str.equals(m1464("伮\uf85c⇔楄銶\uda29ι䳰\uf46e㷋敀꺺", 46957 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case -499959157:
                if (!str.equals(m1460("❮䟁ᰠ꿖湄匭倬ﳟ\uee3d䅏ༀঅ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10).intern())) {
                    b2 = -1;
                } else {
                    b2 = 33;
                }
                break;
            case -279114759:
                if (!str.equals(m1460("谱齂襨滚퐟덦鋬㺟䑠\ue0df㯟䝕㘽\ueec6⽗\u2d6b熂썸ഐནဎ◷\uf252霷逍鱱晽쇔బ欅祚ꍹḯ揹㎂ᛈㅫ횤兠멊బ欅\u0892鲢ḯ揹㎂ᛈㅫ횤兠멊ũઞ뀵嵙汍ൕ凖ꤢ쏟뒠", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 61).intern())) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case -258874416:
                if (!str.equals(m1464("伴궝詇\ue73f엯⊥Ὢ簻嫛", TextUtils.lastIndexOf("", '0', 0) + 58044).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case 2537233:
                if (!str.equals(m1464("伴臯튴⍘", 52937 - KeyEvent.keyCodeFromString("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 27;
                }
                break;
            case 102107741:
                if (!str.equals(m1460("❮䟁ᰠ꿖湄匭怒黦甩盄甩盄㾺猪钹ṫ", 16 - View.combineMeasuredStates(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1243 + 3;
                    f1244 = i2 % 128;
                    if (i2 % 2 != 0) {
                        b2 = 4;
                    } else {
                        b2 = 3;
                    }
                }
                break;
            case 347965699:
                if (!str.equals(m1460("祔몆ꄒ먩疴\ue1f5冦ꋥ叱郛鋬㺟鱍띷쪫\uf4d5\uef2f榼Ḁ頖鋬㺟欳㧹뽬⥍祻ꄞ鋬㺟", 29 - Process.getGidForName("")).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 511814123:
                if (!str.equals(m1460("❮䟁뛼묰ʼ㰕쯇⣷ؕꝝ", 8 - TextUtils.lastIndexOf("", '0', 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 23;
                }
                break;
            case 562364207:
                if (!str.equals(m1464("伮궬訴\ue8d4앶∙\u0099絀寮뢛锠\uf3aa큸컱⮟ࠠ曅䍥ꀁ麬צּ\ud9f4", 58013 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 119;
                    int i3 = f1243 + 119;
                    f1244 = i3 % 128;
                    if (i3 % 2 != 0) {
                        b2 = 11;
                    }
                }
                break;
            case 690451442:
                if (!str.equals(m1464("伦㕪믣‵ꚦ⬝酛៙鱙ʷ蜮ඇ\uf3f9硛ﺩ挴\ue9b5濬푬嫈\udf34䖟쨭끡㛌뭒↨ꘚⱾ鋰", 31337 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 22;
                }
                break;
            case 816054202:
                if (!str.equals(m1460("❮䟁봕䇙뽬⥍㘽\ueec6뛼묰ʼ㰕쯇⣷ؕꝝ", View.getDefaultSize(0, 0) + 15).intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case 846064660:
                if (!str.equals(m1460("❮䟁ⱬ\uf663斑䠗쑓ꁸ홭\uddfe", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1244 + 55;
                    f1243 = i4 % 128;
                    b2 = i4 % 2 == 0 ? (byte) 30 : (byte) 94;
                }
                break;
            case 912139882:
                if (!str.equals(m1460("❮䟁怶\uecbf댽ﺟ헽ᶿ쭬\ue714\udf6f굸", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1244 + 111;
                    f1243 = i5 % 128;
                    b2 = i5 % 2 == 0 ? (byte) 26 : (byte) 81;
                }
                break;
            case 947295484:
                if (!str.equals(m1460("❮䟁\u0892鲢ḯ揹ꞤY뀵嵙汍ൕ凖ꤢ쏟뒠", ((byte) KeyEvent.getModifierMetaStateMask()) + 16).intern())) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 1067523235:
                if (!str.equals(m1464("伴塑懄ॣዕ㩕쏊\ueb43\uf4bb鰉ꖥ䴻嚐縘ތშ㡾쇴\ue940", (ViewConfiguration.getScrollBarSize() >> 8) + 6007).intern())) {
                    b2 = -1;
                } else {
                    b2 = 18;
                }
                break;
            case 1179812605:
                if (!str.equals(m1460("谱齂襨滚퐟덦鋬㺟䑠\ue0df㯟䝕㘽\ueec6⽗\u2d6b熂썸ഐནဎ◷\uf252霷逍鱱晽쇔బ欅❮䟁ᰠ꿖湄匭怒黦甩盄甩盄㾺猪钹ṫ", 46 - KeyEvent.normalizeMetaState(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 1233891357:
                if (str.equals(m1464("伴㪯ꐶ⾎餦ҫ踥禱\ue359滓", Color.blue(0) + 30089).intern())) {
                    b2 = 28;
                } else {
                    b2 = -1;
                }
                break;
            case 1635726011:
                if (!str.equals(m1464("伴䊍呧昏禯୕ᴊႉ≓㐍잪\ud955", 3499 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1243 + 115;
                    f1244 = i6 % 128;
                    if (i6 % 2 != 0) {
                        b2 = 2;
                    } else {
                        b2 = 3;
                    }
                }
                break;
            case 1852615901:
                if (!str.equals(m1460("❮䟁偶揍죽雂鋬㺟钹ṫ", 10 - KeyEvent.keyCodeFromString("")).intern())) {
                    b2 = -1;
                } else {
                    f1244 = (f1243 + 3) % 128;
                    b2 = 34;
                }
                break;
            case 1864912441:
                if (!str.equals(m1460("❮䟁猆熖ꚺ䎎罖警⌊\ue10c\uf71c㇃쯇⣷ؕꝝ", 15 - Color.blue(0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            case 1888267954:
                if (!str.equals(m1464("伓綜⩓\ud8b3蔦돖恌⻎\udb6e觥뚀挛ᆔ\ude23貴뤊柄ᑞ싦輾밓檃\u171b얠\uf236ꃑ浝ᯝ젥\uf6cdꎠ倢Ắ쬮隸ꙏ哲ť쿽ﱵꤙ垛б㊱", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12940).intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 1968274797:
                if (!str.equals(m1464("伦ཌྷ쾸踃乼\u0edb촬趭䷫\u0c51", 16478 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    f1243 = (f1244 + 57) % 128;
                    b2 = 0;
                }
                break;
            case 1976248583:
                if (!str.equals(m1464("伮肘큜⇸熦䅅鋁\ue294㉎ϯ厘ꍖ\uf4c7쒛ᐪ旴떒蔰훠⚞", 53161 - TextUtils.indexOf("", "", 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case 2044807796:
                if (!str.equals(m1464("伴⼅轢潼쾎꾩࿁\ueffb三⸹蹿溉캱껍\u0eec\ued1e", TextUtils.lastIndexOf("", '0', 0, 0) + 24612).intern())) {
                    b2 = -1;
                } else {
                    b2 = 29;
                }
                break;
            case 2057982119:
                if (!str.equals(m1460("❮䟁뛼묰ͼ\uf4b8ㅫ횤兠멊⌧텫", (KeyEvent.getMaxKeyCode() >> 16) + 11).intern())) {
                    b2 = -1;
                } else {
                    b2 = 24;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return AwesomeAds.class;
            case 1:
                return IVideoPlayer.Listener.class;
            case 2:
                return SAVideoClick.class;
            case 3:
                return SAVideoAd.class;
            case 4:
            case 5:
                return SAInterstitialAd.class;
            case 6:
            case 7:
                return SAVideoActivity.class;
            case 8:
                return IVideoPlayer.class;
            case 9:
                return IVideoPlayerControllerView.class;
            case 10:
                return IVideoPlayerControllerView.Listener.class;
            case 11:
                return IVideoPlayerController.class;
            case 12:
                return IVideoPlayerController.Listener.class;
            case 13:
            case 14:
                return VideoPlayerActivity.class;
            case 15:
                return VideoPlayerController.class;
            case 16:
                return AdVideoPlayerControllerView.class;
            case 17:
                return SAManagedAdView.class;
            case 18:
            case 19:
                return SAManagedAdActivity.class;
            case 20:
                return SACustomWebView.class;
            case 21:
                return AdViewJavaScriptBridge.class;
            case 22:
                return AdViewJavaScriptBridge.Listener.class;
            case 23:
                return SAWebView.class;
            case 24:
                return SAWebPlayer.class;
            case 25:
                return SAVASTAd.class;
            case 26:
                return SAVASTMedia.class;
            case 27:
                return SAAd.class;
            case 28:
                return SACreative.class;
            case 29:
                return SACreativeFormat.class;
            case 30:
                return SADetails.class;
            case 31:
                return SAMedia.class;
            case 32:
                return SAResponse.class;
            case 33:
                return SAInterface.class;
            case 34:
                return SABannerAd.class;
            case 35:
                return SAEvent.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1464(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1245);
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1460(String str, int i2) {
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
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1249)) ^ ((c3 >>> 5) + f1248)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1246) ^ ((c4 + i4) ^ ((c4 << 4) + f1247))));
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
}
