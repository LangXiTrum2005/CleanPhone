package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.my.target.ads.BaseInterstitialAd;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.Reward;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.CustomParams;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetVersion;
import com.my.target.common.models.AudioData;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bx extends be {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1081 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1082 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1083 = 6811;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1084 = 13418;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1085 = -3978801456991283804L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1086 = 44509;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1087 = 6486;

    public bx(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1280(Reward reward) {
        int i10 = f1082 + 9;
        f1081 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1278(reward);
        }
        m1278(reward);
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        int i10 = f1082 + 47;
        f1081 = i10 % 128;
        try {
            try {
                return (String) (i10 % 2 != 0 ? MyTargetVersion.class.getDeclaredField(m1279("豰楾谦⩋臆㲟腑腹\udaa9씅⯝", (-1) >>> ExpandableListView.getPackedPositionChild(1L)).intern()) : MyTargetVersion.class.getDeclaredField(m1279("豰楾谦⩋臆㲟腑腹\udaa9씅⯝", (-1) - ExpandableListView.getPackedPositionChild(0L)).intern())).get(null);
            } catch (Exception unused) {
                return id.m2382().m2383().m2493(MyTargetVersion.class, m1281("䞩\ue69eﶾ妡ਘᠼ殶ګ상ꏇ뎡Ὠ", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern());
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -2103294848:
                if (str.equals(m1279("玆珎珇Ⴘ꩝☟뮔\uaad8╹\udfbeᄁﵕ\udec7", View.MeasureSpec.getSize(0)).intern())) {
                    return AudioData.class;
                }
                return null;
            case -1850459313:
                if (!str.equals(m1279("헽짝햯ﭹጫ鰜偆Ꭶ茟斍", ViewConfiguration.getTouchSlop() >> 8).intern())) {
                    return null;
                }
                int i10 = f1081 + 57;
                f1082 = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                return Reward.class;
            case -1766129765:
                if (str.equals(m1279("ま閻〳骠餋쁦ㆼ馆暜㧨鬝츃鴈霚슺㝴㎧첀㐶", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    return MyTargetVersion.class;
                }
                return null;
            case -1282477456:
                if (!str.equals(m1279("띪ꏀ뜧䭸㾗\uf61d\ue064㼚\ue188ྒྷ䫅梟ᨇꅥ\u137e釺뒽\ufaf1\ue5f2", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1).intern())) {
                    return null;
                }
                f1082 = (f1081 + 87) % 128;
                return MyTargetManager.class;
            case -958537051:
                if (str.equals(m1279("崸繖嵮╔ﭿ⮛蹸ﯶே툦⓭걷\uf079", ViewConfiguration.getTapTimeout() >> 16).intern())) {
                    return VideoData.class;
                }
                return null;
            case -609786639:
                if (str.equals(m1279("鴅ཚ鵗ে\udc14媛ꋸ\udc99쯧ꌊࡺ謌つ\u0dfa", Process.myTid() >> 22).intern())) {
                    return RewardedAd.class;
                }
                return null;
            case -498709917:
                if (str.equals(m1279("\ue328ᵍ\ue361\uec2bຄ䢇䜗ญ뗊넊\ued87妑乼ῠ됢ꃤ\ue0d9䑽䊟ੱ뤛닝\ue9c6嗆厝ᭋ", ViewConfiguration.getPressedStateDuration() >> 16).intern())) {
                    return InterstitialAd.InterstitialAdListener.class;
                }
                return null;
            case -393802555:
                if (!str.equals(m1281("쨩탇륈ᨍ鳘扟曃\ufdec郂栌嚫言\uec7c䭅Ῑ⣌跒䭦", ExpandableListView.getPackedPositionChild(0L) + 19).intern())) {
                    return null;
                }
                f1081 = (f1082 + InterfaceC0435l1.d.b.f29107d) % 128;
                return RewardedAd.RewardedAdListener.class;
            case 65555862:
                if (str.equals(m1279("墓쬃壞\udbff珞點烣獓\u0e71材\uda42ⓖ\uf5e5즮菲\udda5孯鈾畴眶ʶ撉\ude12⢀", TextUtils.getCapsMode("", 0, 0)).intern())) {
                    return MyTargetView.MyTargetViewListener.class;
                }
                return null;
            case 320151695:
                if (!str.equals(m1279("啭雞唤꒔\uee30쌔ྨ\ueeb9Ώ㪙ꔸ뤥\uf839鑳ﲝ䁐嚜쿮", TextUtils.getOffsetAfter("", 0)).intern())) {
                    return null;
                }
                f1082 = (f1081 + 23) % 128;
                return InterstitialAd.class;
            case 421929408:
                if (!str.equals(m1281("ᴓፓ濃ස렃\ue4d7셕⹇횂⇽\u0099⭞\u0099⭞㚗ᐥ郂栌", ExpandableListView.getPackedPositionType(0L) + 18).intern())) {
                    return null;
                }
                f1082 = (f1081 + 49) % 128;
                return BaseInterstitialAd.class;
            case 448638071:
                if (str.equals(m1279("㴱꾛㵲䬷®琢\ue00c6毎ς䪿垳遣괾ጲ껑", View.combineMeasuredStates(0, 0)).intern())) {
                    return CustomParams.class;
                }
                return null;
            case 487251537:
                if (str.equals(m1281("\udd97뢠\u0099⭞⺎ꪤഗ祾䦋ㄇ\uf8b6毃匒⬻", (ViewConfiguration.getEdgeSlop() >> 16) + 14).intern())) {
                    return MyTargetActivity.ActivityEngine.class;
                }
                return null;
            case 544598087:
                if (!str.equals(m1281("ᗾ擭찬럇勮\uda43\uf241㶀ￃ腪쵋⼳쯃埃ᗾ擭ৄ⸺诳逻Ⰺ\uf753\u2cf5៛ￃ腪쵋⼳叹砉ກ醂\udca2髸蠀٘霻\u177f", 38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f1081 = (f1082 + 53) % 128;
                return MyTargetActivity.class;
            case 1125320581:
                if (str.equals(m1279("శ봮౿ꋂ\ue488\ue8e7৫\ue403嫃ᅞꍻ뎀ꅷ", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return ImageData.class;
                }
                return null;
            case 1146816194:
                if (str.equals(m1279("鳛磉鲖Ⳳ\ued71ⴔ蟮\uedfc쨹풚ⵏ멹ㆭ穤瓿䌊", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    return MyTargetView.class;
                }
                return null;
            case 1413638316:
                if (str.equals(m1281("\udbb7铁⡛Ծ繦\ua956\ue4c7꽹\udd97뢠\u0099⭞⺎ꪤഗ祾", 16 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return MyTargetActivity.class;
                }
                return null;
            case 1955824356:
                if (str.equals(m1281("郂栌\ue5e4\ud8bb䧞뾆", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6).intern())) {
                    return MyTargetView.AdSize.class;
                }
                return null;
            case 1982630644:
                if (str.equals(m1281("ᴓፓ濃ස郂栌", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern())) {
                    return BaseAd.class;
                }
                return null;
            case 2040577055:
                if (!str.equals(m1279("砳켲硾뚒첸髯ᶎ찵⻑捡뜯鮰핐춙\uee94拒篪阁", 1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return null;
                }
                f1082 = (f1081 + 89) % 128;
                return MyTargetConfig.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1279("ﱭ䵌ﰊ\uf442ꯨᢍ彾ꭖꪘ\ue10f\uf5fbﳦ儩俜걓֔ﾸ", AndroidCharacter.getMirror('0') - '0').intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bx.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return bx.m1280((Reward) list.get(0));
            }
        });
        f1081 = (f1082 + 91) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1281(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f1084)) ^ ((c5 >>> 5) + f1086)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1083) ^ ((c10 + i12) ^ ((c10 << 4) + f1087))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1278(Reward reward) {
        int i10 = f1081 + 69;
        f1082 = i10 % 128;
        int i11 = i10 % 2;
        String str = reward.type;
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1082 + 123;
        f1081 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1279(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1085, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1085));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
