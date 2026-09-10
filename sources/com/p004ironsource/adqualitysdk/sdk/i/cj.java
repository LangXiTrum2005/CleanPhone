package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.monetization.ads.base.model.reward.RewardData;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdActivity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdType;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class cj extends bg {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1280 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1281 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f1279 = {'4', 'o', 'o', 'n', 'k', 'R', 'R', 'R', AbstractJsonLexerKt.END_LIST, 'v', 168, 175, 172, 165, 178, 144, 182, 167, 132, '!', 'Q', 'g', 'n', 'i', 'k', 'Y', 'R', AbstractJsonLexerKt.END_LIST, '_', 'g', 'n', '2', 'k', 'd', '_', 'f', 'd', 'j', 'Y', 'Y', 'n', 'q', 's', 'p', 'm', 'l', 145, 281, 277, 285, 268, 262, 282, 287, 280, 277, 277, 279, 272, 267, 274, 272, 278, 262, 'o', 203, 197, 217, 222, 215, 212, 212, 214, 205, 198, 217, 215, 212, 214, 207, 207, 189, 189, 191, 200, 216, 212, 'm', 227, 234, 232, 238, 220, 214, 222, 226, 234, 241, 241, 229, 230, 235, 223, 222, 242, 247, 240, 237, 237, 239, '2', 'k', 'i', 'l', 'n', AbstractJsonLexerKt.BEGIN_LIST, 'Y', 'j', 'j', 'R', 'x', 225, 236, 251, 232, 242, 251, 245, 243, 249, AbstractJsonLexerKt.COLON, 'l', 'i', 'i', 'k', 'r', 'l', 'l', 'c', AbstractJsonLexerKt.BEGIN_LIST, 'n', 'l', 'i', 'k', 'd', 'd', 'R', 'R', 'T', AbstractJsonLexerKt.END_LIST, 'm', 'i', 'q', '`', 'Z', 'n', '4', 'e', 'S', 'W', 'j', 'h', AbstractJsonLexerKt.END_LIST, 'c', 'o', 'i', 'f', 'l', '`', 'Y', 'd', 184, 169, 171, 179, 170, 178, 141, 168, 133, 179, 169, 168, 173, 154};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1278 = 3618221875976612993L;

    public cj(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1497(RewardedAd rewardedAd) {
        f1280 = (f1281 + 49) % 128;
        AdInfo adInfoM1507 = m1507(rewardedAd);
        int i2 = f1281 + 19;
        f1280 = i2 % 128;
        if (i2 % 2 == 0) {
            return adInfoM1507;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1501(ImpressionData impressionData) {
        f1280 = (f1281 + 105) % 128;
        String strM1521 = m1521(impressionData);
        int i2 = f1280 + 77;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return strM1521;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1508(AdInfo adInfo) {
        f1281 = (f1280 + 81) % 128;
        String strM1520 = m1520(adInfo);
        int i2 = f1280 + 43;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
        return strM1520;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m1514(Reward reward) {
        int i2 = f1280 + 15;
        f1281 = i2 % 128;
        int i3 = i2 % 2;
        int iM1496 = m1496(reward);
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = f1280 + 123;
        f1281 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return iM1496;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1518(InterstitialAd interstitialAd) {
        f1281 = (f1280 + 33) % 128;
        AdInfo adInfoM1500 = m1500(interstitialAd);
        int i2 = f1280 + 41;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
        return adInfoM1500;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ MediaFile m1498(VideoAd videoAd) {
        int i2 = f1280 + 119;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            m1519(videoAd);
            throw null;
        }
        MediaFile mediaFileM1519 = m1519(videoAd);
        int i3 = f1280 + 1;
        f1281 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return mediaFileM1519;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1505(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i2 = f1280 + 73;
        f1281 = i2 % 128;
        int i3 = i2 % 2;
        m1522(bannerAdView, bannerAdEventListener);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1509(Reward reward) {
        f1281 = (f1280 + 33) % 128;
        String strM1502 = m1502(reward);
        f1281 = (f1280 + 49) % 128;
        return strM1502;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1515(VideoAd videoAd) {
        f1281 = (f1280 + 95) % 128;
        String strM1511 = m1511(videoAd);
        int i2 = f1280 + 111;
        f1281 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM1511;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1523(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        f1280 = (f1281 + 13) % 128;
        m1513(interstitialAd, interstitialAdEventListener);
        f1281 = (f1280 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1499(MediaFile mediaFile) {
        f1280 = (f1281 + 47) % 128;
        String strM1510 = m1510(mediaFile);
        f1281 = (f1280 + 9) % 128;
        return strM1510;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1512(VideoController videoController, VideoEventListener videoEventListener) {
        f1281 = (f1280 + 67) % 128;
        m1516(videoController, videoEventListener);
        int i2 = f1281 + 69;
        f1280 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1517(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f1281 = (f1280 + 15) % 128;
        m1506(rewardedAd, rewardedAdEventListener);
        f1281 = (f1280 + 45) % 128;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1503("⳦峗첓籙\uec29ᰫ距㶍국\udd03䴛", 28723 - Color.alpha(0)).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.4
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1508((AdInfo) list.get(0));
            }
        });
        map.put(m1504(true, new int[]{120, 10, 143, 8}, "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.7
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1501((ImpressionData) list.get(0));
            }
        });
        map.put(m1503("Ⳳ꿿⫃ꖆ₄ꍢ㹆륓㐜뜄㏪軆\u09b1蒒ޒ艧ᵅ頯ᬉ韥ዯ", AndroidCharacter.getMirror('0') + 33515).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.8
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cj.m1512((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1503("⳦䤇\ue733ᵡ뭣톝侧\ue5d1ϫ렉혫䰩\uea51o뺊풠狸\ue8fcԑꌷ", TextUtils.indexOf("", "", 0, 0) + 26083).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.6
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1518((InterstitialAd) list.get(0));
            }
        });
        map.put(m1503("⳦䥩\ue7efᱴ뫐휷䶮\uea28\u008d봵\udb6e燡\uee68ӆꅃ", (ViewConfiguration.getLongPressTimeout() >> 16) + 25997).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.10
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return Integer.valueOf(cj.m1514((Reward) list.get(0)));
            }
        });
        map.put(m1503("⳦ꃃ㒻袦ᱸ逵搊梨䷝솊啾⥜봰", 35879 - KeyEvent.keyCodeFromString("")).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.9
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1509((Reward) list.get(0));
            }
        });
        map.put(m1503("⳦ᶛ下뢮\ue918\udb8dК皊ꜝ醓숓ವ紑꾻頝쪖㬞", TextUtils.indexOf("", "", 0, 0) + 12671).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.14
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1497((RewardedAd) list.get(0));
            }
        });
        map.put(m1504(false, new int[]{130, 26, 0, 5}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.15
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cj.m1517((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1503("Ⳳ\uf7d5骗뵛䀫欀࿂튤\uf57a題ꌂ䟮檤ඝ큃ײַ鿵ꊅ䖅桇㌻ퟰ\ufafb鶏ꁪ䬼渞㋄햸\uf87e", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56113).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.13
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cj.m1523((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1504(false, new int[]{156, 15, 0, 9}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001").intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1499((MediaFile) list.get(0));
            }
        });
        map.put(m1503("⳦㍁Ꮏ爸剼닜鄺\uf16d퇨〨Ⴞ烳坙랉韦\uf66c횸㔘ᕾ", Color.argb(0, 0, 0, 0) + 8101).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.2
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1498((VideoAd) list.get(0));
            }
        });
        map.put(m1504(true, new int[]{171, 14, 68, 3}, null).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                return cj.m1515((VideoAd) list.get(0));
            }
        });
        map.put(m1503("Ⳳٝ禇골蘄沈ⲹ߫礻걁蟟路ⱛށ竱갢蝝瑱ⷰݎ窐귂蜂𤋮", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10937).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cj.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                cj.m1505((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i2 = f1281 + 19;
        f1280 = i2 % 128;
        if (i2 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        String libraryVersion;
        int i2 = f1281 + 11;
        f1280 = i2 % 128;
        if (i2 % 2 != 0) {
            libraryVersion = MobileAds.getLibraryVersion();
            int i3 = 97 / 0;
        } else {
            libraryVersion = MobileAds.getLibraryVersion();
        }
        f1281 = (f1280 + 119) % 128;
        return libraryVersion;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int m1496(Reward reward) {
        int i2 = f1280 + 63;
        f1281 = i2 % 128;
        int i3 = i2 % 2;
        int amount = reward.getAmount();
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return amount;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1516(VideoController videoController, VideoEventListener videoEventListener) {
        f1281 = (f1280 + 51) % 128;
        videoController.setVideoEventListener(videoEventListener);
        f1280 = (f1281 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1520(AdInfo adInfo) {
        f1280 = (f1281 + 67) % 128;
        String adUnitId = adInfo.getAdUnitId();
        int i2 = f1280 + 121;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 86 / 0;
        }
        return adUnitId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x016c  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c0  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 9;
        switch (str.hashCode()) {
            case -1850459313:
                if (!str.equals(m1503("ⳓ䖁︼\u10cf襧∜", ExpandableListView.getPackedPositionChild(0L) + 26982).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1280 + 55;
                    f1281 = i2 % 128;
                    b2 = i2 % 2 == 0 ? (byte) 51 : (byte) 14;
                }
                break;
            case -1836618638:
                if (!str.equals(m1504(true, new int[]{0, 10, 0, 8}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1666698098:
                if (!str.equals(m1504(true, new int[]{10, 9, 67, 6}, null).intern())) {
                    b2 = -1;
                } else {
                    f1280 = (f1281 + 39) % 128;
                    b2 = 6;
                }
                break;
            case -1401317165:
                if (!str.equals(m1504(false, new int[]{46, 18, 172, 12}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000").intern())) {
                    b2 = -1;
                } else {
                    int i3 = f1280 + 85;
                    f1281 = i3 % 128;
                    b2 = i3 % 2 != 0 ? (byte) 10 : (byte) 121;
                }
                break;
            case -1338246468:
                if (!str.equals(m1503("Ⳣ㾭੪ᕦ懴䲯彽ꨰ뛼膢\uec31－쯊횄⅂ఀᣔ毜癖䄜귎룐謡韥\ue2a7쵤\ud82aⓢ㟻ɔ洺秲䒏均ꈕ軩馉\ue478\uf71a쏑⺎", TextUtils.indexOf((CharSequence) "", '0', 0) + 4932).intern())) {
                    b2 = -1;
                } else {
                    int i4 = f1280 + 29;
                    f1281 = i4 % 128;
                    b2 = i4 % 2 != 0 ? (byte) 8 : (byte) 31;
                }
                break;
            case -1139615429:
                if (!str.equals(m1503("Ⳣˣ烶Ꚉ铌쪡㢡溾岌늌\ue02d홣Ѳ穊ꡞ鸮찴≲ည䘒뗶\uebbe\ud9fc࿅緔厩膼\uf7b0◃᮹䥣뽓\ued42썘ㅒ朰唼謔烙", 11789 - Color.argb(0, 0, 0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1115843213:
                if (!str.equals(m1503("Ⳉ髥䃣\u0ee8\uf4c0ꋟ棄훗鲦䪾ゟﺃ꒙ን", 46602 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i5 = f1280 + 13;
                    f1281 = i5 % 128;
                    if (i5 % 2 != 0) {
                        b2 = 5;
                    } else {
                        b2 = 3;
                    }
                }
                break;
            case -650052115:
                if (!str.equals(m1504(false, new int[]{87, 23, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    int i6 = f1281 + 107;
                    f1280 = i6 % 128;
                    b2 = i6 % 2 == 0 ? (byte) 17 : (byte) 55;
                }
                break;
            case -610771047:
                if (!str.equals(m1504(true, new int[]{110, 10, 0, 6}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    b2 = 20;
                }
                break;
            case -609786639:
                if (!str.equals(m1503("ⳓ\u0a7f懀弱뚟\uede2쭆⋘᠘瞖", 9883 - View.resolveSize(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case -572702516:
                if (!str.equals(m1503("Ⳁ䋌\uf081暟鑔ਹ렒\u2fed嶽", 28200 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -564429827:
                if (!str.equals(m1504(false, new int[]{64, 23, 107, 9}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001").intern())) {
                    b2 = -1;
                } else {
                    f1280 = (f1281 + 31) % 128;
                    b2 = 16;
                }
                break;
            case -150968480:
                if (!str.equals(m1503("Ⳍ⤿❓㵹㮌ㆀ࿊Аȼ", 1499 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b2 = -1;
                } else {
                    f1281 = (f1280 + 87) % 128;
                    b2 = 18;
                }
                break;
            case 308060116:
                if (!str.equals(m1504(false, new int[]{19, 12, 0, 0}, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000").intern())) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 320151695:
                if (!str.equals(m1503("Ⳉ辜樓욽ꄿ᷍\uf847响㝭鏣亞⤜薤怲", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41842).intern())) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 871099991:
                if (!str.equals(m1504(false, new int[]{31, 15, 0, 2}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000").intern())) {
                    b2 = -1;
                }
                break;
            case 957243679:
                if (!str.equals(m1503("ⳃ牅醥㜀噰\uf5caᬞ멦\ud9ec缺麖㷸䍉\ue2acǮꝙ욥搑譵⫛䠗", 24229 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    b2 = -1;
                } else {
                    f1281 = (f1280 + 79) % 128;
                    b2 = 11;
                }
                break;
            case 1228411167:
                if (!str.equals(m1503("Ⳉ䱲\uedcfള꺇쿣潛袣⠝䥭\ueac2\u0a52ꮜ쬜摒藄┴䚂\ue7ffݪꂬ쀓憋苿≗䎱\ue301", ((Process.getThreadPriority(0) + 20) >> 6) + 24733).intern())) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 1955530641:
                if (!str.equals(m1503("Ⳁᾢ䩆딺\ue1fbⲍ", 13127 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
                    b2 = -1;
                } else {
                    int i7 = f1280 + 21;
                    f1281 = i7 % 128;
                    if (i7 % 2 != 0) {
                        b2 = 2;
                    } else {
                        b2 = 4;
                    }
                }
                break;
            case 1955869213:
                if (!str.equals(m1503("Ⳁ\uf15a鞫뗅娍硟", Process.getGidForName("") + 56768).intern())) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case 2117435870:
                if (!str.equals(m1503("ⳗ秃蚳퍥硂蔗폧", 21803 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern())) {
                    b2 = -1;
                } else {
                    b2 = 19;
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
                return AdInfo.class;
            case 3:
                return AdRequest.class;
            case 4:
                return AdType.class;
            case 5:
                return ImpressionData.class;
            case 6:
                return MobileAds.class;
            case 7:
            case 8:
                return BannerAdView.class;
            case 9:
                return VideoController.class;
            case 10:
                return VideoEventListener.class;
            case 11:
                return BannerAdEventListener.class;
            case 12:
                return InterstitialAd.class;
            case 13:
                return InterstitialAdEventListener.class;
            case 14:
                return Reward.class;
            case 15:
                return RewardedAd.class;
            case 16:
                return RewardedAdEventListener.class;
            case 17:
                return VideoAdPlaybackListener.class;
            case 18:
                return MediaFile.class;
            case 19:
                return VideoAd.class;
            case 20:
                return RewardData.class;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1521(ImpressionData impressionData) {
        int i2 = f1280 + 59;
        f1281 = i2 % 128;
        int i3 = i2 % 2;
        String rawData = impressionData.getRawData();
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return rawData;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static MediaFile m1519(VideoAd videoAd) {
        int i2 = f1280 + 87;
        f1281 = i2 % 128;
        if (i2 % 2 != 0) {
            return videoAd.getMediaFile();
        }
        videoAd.getMediaFile();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1522(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        int i2 = f1281 + 9;
        f1280 = i2 % 128;
        int i3 = i2 % 2;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static AdInfo m1500(InterstitialAd interstitialAd) {
        f1280 = (f1281 + 115) % 128;
        AdInfo info = interstitialAd.getInfo();
        int i2 = f1280 + 75;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
        return info;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1502(Reward reward) {
        int i2 = f1280 + 67;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            reward.getType();
            throw null;
        }
        String type = reward.getType();
        f1280 = (f1281 + 65) % 128;
        return type;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1506(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f1280 = (f1281 + 35) % 128;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        f1281 = (f1280 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1504(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f1279, i2, cArr, 0, i3);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static AdInfo m1507(RewardedAd rewardedAd) {
        f1281 = (f1280 + 15) % 128;
        AdInfo info = rewardedAd.getInfo();
        f1281 = (f1280 + 3) % 128;
        return info;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1513(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i2 = f1281 + 99;
        f1280 = i2 % 128;
        int i3 = i2 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i3 != 0) {
            throw null;
        }
        int i4 = f1281 + 111;
        f1280 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1510(MediaFile mediaFile) {
        int i2 = f1280 + 19;
        f1281 = i2 % 128;
        if (i2 % 2 == 0) {
            mediaFile.getUrl();
            throw null;
        }
        String url = mediaFile.getUrl();
        f1281 = (f1280 + 23) % 128;
        return url;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1511(VideoAd videoAd) {
        f1280 = (f1281 + 67) % 128;
        String info = videoAd.getInfo();
        int i2 = f1281 + 111;
        f1280 = i2 % 128;
        if (i2 % 2 == 0) {
            return info;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1503(String str, int i2) {
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
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f1278);
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
}
