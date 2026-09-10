package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.monetization.ads.base.model.reward.RewardData;
import com.unity3d.services.UnityAdsConstants;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ci extends be {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1297 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1298 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1299 = {866230629, -1108042986, 1383250739, 555169352, -429843980, -461066906, -321509670, -1358576725, -521508064, -12538048, 632330766, -732928010, -39831879, -494371002, -1479766174, 2003506080, 1466793282, -104413323};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1300 = 1379406682144961612L;

    public ci(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ int m1548(Reward reward) {
        int i10 = f1298 + 75;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        int iM1566 = m1566(reward);
        if (i11 != 0) {
            int i12 = 69 / 0;
        }
        int i13 = f1298 + 49;
        f1297 = i13 % 128;
        if (i13 % 2 == 0) {
            return iM1566;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1553(ImpressionData impressionData) {
        f1297 = (f1298 + 83) % 128;
        String strM1561 = m1561(impressionData);
        f1297 = (f1298 + 61) % 128;
        return strM1561;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1558(InterstitialAd interstitialAd) {
        f1297 = (f1298 + 55) % 128;
        AdInfo adInfoM1567 = m1567(interstitialAd);
        f1297 = (f1298 + 99) % 128;
        return adInfoM1567;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1569(VideoAd videoAd) {
        int i10 = f1298 + InterfaceC0435l1.d.b.f29109f;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            m1575(videoAd);
            throw null;
        }
        String strM1575 = m1575(videoAd);
        f1298 = (f1297 + 13) % 128;
        return strM1575;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m1573(AdInfo adInfo) {
        f1298 = (f1297 + 107) % 128;
        String strM1560 = m1560(adInfo);
        int i10 = f1298 + 17;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1560;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ AdInfo m1549(RewardedAd rewardedAd) {
        int i10 = f1298 + 37;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            m1572(rewardedAd);
            throw null;
        }
        AdInfo adInfoM1572 = m1572(rewardedAd);
        int i11 = f1298 + 99;
        f1297 = i11 % 128;
        if (i11 % 2 == 0) {
            return adInfoM1572;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1554(Reward reward) {
        int i10 = f1298 + 19;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        String strM1574 = m1574(reward);
        if (i11 != 0) {
            int i12 = 90 / 0;
        }
        return strM1574;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ MediaFile m1559(VideoAd videoAd) {
        f1298 = (f1297 + 107) % 128;
        MediaFile mediaFileM1552 = m1552(videoAd);
        int i10 = f1298 + 63;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 7 / 0;
        }
        return mediaFileM1552;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1570(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        f1297 = (f1298 + InterfaceC0435l1.d.b.f29109f) % 128;
        m1565(interstitialAd, interstitialAdEventListener);
        f1297 = (f1298 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1574(Reward reward) {
        f1298 = (f1297 + 7) % 128;
        String type = reward.getType();
        int i10 = f1297 + 51;
        f1298 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 5 / 0;
        }
        return type;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1551(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        f1297 = (f1298 + 33) % 128;
        m1571(rewardedAd, rewardedAdEventListener);
        int i10 = f1298 + 73;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1557(VideoController videoController, VideoEventListener videoEventListener) {
        int i10 = f1298 + 77;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        m1564(videoController, videoEventListener);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1297 + 93;
        f1298 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1562(MediaFile mediaFile) {
        f1298 = (f1297 + 117) % 128;
        String strM1568 = m1568(mediaFile);
        int i10 = f1298 + 25;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM1568;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static AdInfo m1572(RewardedAd rewardedAd) {
        f1297 = (f1298 + 49) % 128;
        AdInfo info = rewardedAd.getInfo();
        int i10 = f1298 + 13;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return info;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1550(new int[]{266109525, -1815399805, -1515101001, -880122083, 216296973, -1891400394}, 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1573((AdInfo) list.get(0));
            }
        });
        map.put(m1555("\uf42bﰎ\ue476\uec6b풱\udcf8쓢촼딀뵲", TextUtils.getOffsetBefore("", 0) + 2087).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1553((ImpressionData) list.get(0));
            }
        });
        map.put(m1550(new int[]{306558999, 1698031303, 293133844, 1142584674, -1902836356, 787881048, 1423309588, -495795799, 586860845, 1278612339, 1205908307, 45710277}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ci.m1557((VideoController) list.get(0), (VideoEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1550(new int[]{-1297542773, 88807194, 880913417, -474985245, 965750390, 446345591, -704066054, -1494894380, 223762354, -806038953}, 20 - TextUtils.getCapsMode("", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1558((InterstitialAd) list.get(0));
            }
        });
        map.put(m1550(new int[]{1671402473, 116697856, 2102484818, 1368567723, 1859865004, 1363902280, 642920802, 819977482}, Color.green(0) + 15).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return Integer.valueOf(ci.m1548((Reward) list.get(0)));
            }
        });
        map.put(m1550(new int[]{1671402473, 116697856, 2102484818, 1368567723, -1372038530, -1354226142, -34192188, 2134330211}, 13 - KeyEvent.normalizeMetaState(0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1554((Reward) list.get(0));
            }
        });
        map.put(m1550(new int[]{1671402473, 116697856, 2102484818, 1368567723, 1666748735, 1991161453, -1731930521, -918989238, -80219148, 539275868}, (Process.myPid() >> 22) + 17).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.14
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1549((RewardedAd) list.get(0));
            }
        });
        map.put(m1555("\uf43f爆\uf866暓\uec95櫐턷彷앐䎎짾〈븜⑪ꊨ⣨雒ᴧ魎Ř输\uf5e3簣福恁\ueea9", KeyEvent.getDeadChar(0, 0) + 34351).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.15
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ci.m1551((RewardedAd) list.get(0), (RewardedAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1555("\uf43f痶\uf786熘\uf35e絣３礧難擯\ue693悭\ue251汾\uee12栜\ue9d8毆햔垤텎即\udd2a弬\ud8d7嫿쒏䚧쁍䉽", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33247).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ci.m1570((InterstitialAd) list.get(0), (InterstitialAdEventListener) list.get(1));
                return null;
            }
        });
        map.put(m1555("\uf42bꪶ䤆\uefdc蹕ⴳ쎟扴òꞲ䘖\ue4fc魭㨭\ud892", 24223 - Drawable.resolveOpacity(0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1562((MediaFile) list.get(0));
            }
        });
        map.put(m1555("\uf42b冾뼖ӟ批쿛ᖣ猂\ud8b5♧菧\ue954㜼鲎\ufa6f䟓굕ଧ傷", 42439 - AndroidCharacter.getMirror('0')).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1559((VideoAd) list.get(0));
            }
        });
        map.put(m1550(new int[]{1427128958, -314899657, 293133844, 1142584674, 721144925, -1720000360, 1791935829, 335799672}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 14).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return ci.m1569((VideoAd) list.get(0));
            }
        });
        map.put(m1555("\uf43fﰖ\ue446\uecb3퓑\udd19았춐뗆븺Ꙟ꺼雎鼚蝐辉矰砊恑梕僅変䅃䦗", ExpandableListView.getPackedPositionGroup(0L) + 2111).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.ci.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                ci.m1563((BannerAdView) list.get(0), (BannerAdEventListener) list.get(1));
                return null;
            }
        });
        int i10 = f1298 + 99;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static MediaFile m1552(VideoAd videoAd) {
        int i10 = f1297 + 73;
        f1298 = i10 % 128;
        int i11 = i10 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        if (i11 == 0) {
            int i12 = 97 / 0;
        }
        int i13 = f1298 + 75;
        f1297 = i13 % 128;
        if (i13 % 2 == 0) {
            return mediaFile;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1563(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        f1298 = (f1297 + 47) % 128;
        m1556(bannerAdView, bannerAdEventListener);
        int i10 = f1297 + 7;
        f1298 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 63 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1575(VideoAd videoAd) {
        int i10 = f1297 + 125;
        f1298 = i10 % 128;
        int i11 = i10 % 2;
        String info = videoAd.getInfo();
        if (i11 == 0) {
            int i12 = 50 / 0;
        }
        return info;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        int i10 = f1298 + 123;
        f1297 = i10 % 128;
        if (i10 % 2 != 0) {
            MobileAds.getLibraryVersion();
            throw null;
        }
        String libraryVersion = MobileAds.getLibraryVersion();
        f1298 = (f1297 + InterfaceC0435l1.d.b.f29109f) % 128;
        return libraryVersion;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1550(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1299.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1556(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        f1297 = (f1298 + 27) % 128;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        f1298 = (f1297 + 121) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x006d  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c9  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10 = 20;
        switch (str.hashCode()) {
            case -1850459313:
                if (!str.equals(m1550(new int[]{-1977206103, -1881175633, -263369313, -101616520}, 6 - (Process.myPid() >> 22)).intern())) {
                    b10 = -1;
                } else {
                    f1297 = (f1298 + InterfaceC0435l1.d.b.f29107d) % 128;
                    b10 = 14;
                }
                break;
            case -1836618638:
                if (!str.equals(m1555("\uf40d쫿覣䢪ཤ츖贰䏄ʀ솺", (KeyEvent.getMaxKeyCode() >> 16) + 16087).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1666698098:
                if (!str.equals(m1550(new int[]{-1894991664, -1516040168, 1749120071, -113484866, 1388292225, 71277030}, ImageFormat.getBitsPerPixel(0) + 10).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -1401317165:
                if (!str.equals(m1550(new int[]{-1041647679, -433690549, 1347471574, -1758277500, -102832269, 106288397, -601668136, -669339399, -1548347319, -721907593}, 18 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    f1297 = (f1298 + 41) % 128;
                    b10 = 10;
                }
                break;
            case -1338246468:
                if (!str.equals(m1555("\uf42f꿒䏃\ue7b1鯱㾘펄瞿⮡콍挈ݺ뭯弓\uf30b霿䬹\uef63苟⛋\udaeb级ኘ뚊檺ຫꉓ䙕慨鹃㈓혍訂⸸숼旾\u19cc뷏凣\uf59eꦓ", Drawable.resolveOpacity(0, 0) + 23537).intern())) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1139615429:
                if (!str.equals(m1550(new int[]{1048096099, 1637248815, -1188769431, -1814859319, -1765907811, -45626214, 650678464, -766944061, 1078063068, -1085269051, 407453692, -206672325, -331373411, -1395468694, -1052821563, 395360374, 81725077, 1261478374, -2106752292, 1634841305}, 39 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    f1297 = (f1298 + 33) % 128;
                    b10 = 1;
                }
                break;
            case -1115843213:
                if (!str.equals(m1555("\uf405鍘㫎쉕槍\uf162飩\u206a쿫坣ﺲ蘞ⶔ딈", TextUtils.indexOf("", "", 0) + 26489).intern())) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -650052115:
                if (!str.equals(m1550(new int[]{-1041647679, -433690549, -1147480257, -823778823, -18637144, 1621808886, -191730978, -1017538781, -512587460, 418352426, 1020365836, -2074335443}, 24 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case -610771047:
                if (!str.equals(m1555("\uf41e\uf4d2\uf5cd\uf6dc\uf7d2\uf0cf\uf1ea\uf2f0\uf3e0ﳾ", 251 - TextUtils.getOffsetAfter("", 0)).intern())) {
                    b10 = -1;
                }
                break;
            case -609786639:
                if (!str.equals(m1550(new int[]{-1977206103, -1881175633, -1989459573, -1286868790, -1927813045, 1755371553}, 10 - (Process.myPid() >> 22)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 15;
                }
                break;
            case -572702516:
                if (!str.equals(m1550(new int[]{206944840, -1994924452, 2067329400, -1713487390, -297745464, 1488581456}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 8).intern())) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -564429827:
                if (!str.equals(m1555("\uf41e儀빩᭖悚췥⫟瀷\udd45㩙螓\uecf9䧅霷ﰆ奧ꚵΆ棚똢\u1316硴언", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42281).intern())) {
                    b10 = -1;
                } else {
                    f1298 = (f1297 + 11) % 128;
                    b10 = 16;
                }
                break;
            case -150968480:
                if (!str.equals(m1555("\uf401쫾覆䢠ཱ츹贯䏁ʑ", TextUtils.getCapsMode("", 0, 0) + 16087).intern())) {
                    b10 = -1;
                } else {
                    b10 = 18;
                }
                break;
            case 308060116:
                if (!str.equals(m1555("\uf40e辦̴蚃ᨅ鶉ᅏ铥⡂ꏆ❇뫂", (ViewConfiguration.getPressedStateDuration() >> 16) + 31627).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 320151695:
                if (!str.equals(m1555("\uf405ퟁ돾龀箲䝐⍪༐\ueb20뛞鋳绡媩⚯", MotionEvent.axisFromString("") + 9188).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1298 + 117;
                    f1297 = i10 % 128;
                    b10 = i10 % 2 == 0 ? (byte) 12 : (byte) 27;
                }
                break;
            case 871099991:
                if (!str.equals(m1550(new int[]{-1041647679, -433690549, 1204386870, -2145530372, 1731118203, 677089, -466359073, -1995097737}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15).intern())) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case 957243679:
                if (!str.equals(m1550(new int[]{-129330998, -978014023, 1477729579, -1224684500, -1902836356, 787881048, 1423309588, -495795799, 586860845, 1278612339, 1205908307, 45710277}, 21 - KeyEvent.getDeadChar(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case 1228411167:
                if (!str.equals(m1550(new int[]{-219616388, 17464015, 965750390, 446345591, -704066054, -1494894380, -1940625110, -844534820, -588725961, -771542278, -512587460, 418352426, 1020365836, -2074335443}, Color.alpha(0) + 27).intern())) {
                    b10 = -1;
                } else {
                    b10 = 13;
                }
                break;
            case 1955530641:
                if (!str.equals(m1550(new int[]{721144925, -1720000360, 1791935829, 335799672}, (ViewConfiguration.getTouchSlop() >> 8) + 6).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1297 + 55;
                    f1298 = i11 % 128;
                    if (i11 % 2 != 0) {
                        b10 = 2;
                    } else {
                        b10 = 4;
                    }
                }
                break;
            case 1955869213:
                if (!str.equals(m1555("\uf40d䘅遂\ue2b2㲈軈", 45613 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 2117435870:
                if (!str.equals(m1555("\uf41aᆠ㼢䒦户辔锶", (KeyEvent.getMaxKeyCode() >> 16) + 58757).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1298 + 25;
                    f1297 = i12 % 128;
                    b10 = i12 % 2 != 0 ? (byte) 51 : (byte) 19;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1555(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1300);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static AdInfo m1567(InterstitialAd interstitialAd) {
        f1297 = (f1298 + 19) % 128;
        AdInfo info = interstitialAd.getInfo();
        f1297 = (f1298 + 107) % 128;
        return info;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m1566(Reward reward) {
        f1298 = (f1297 + 71) % 128;
        int amount = reward.getAmount();
        f1298 = (f1297 + 15) % 128;
        return amount;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1571(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i10 = f1298 + 25;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1297 + 59;
        f1298 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 53 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1568(MediaFile mediaFile) {
        int i10 = f1297 + 29;
        f1298 = i10 % 128;
        if (i10 % 2 != 0) {
            return mediaFile.getUrl();
        }
        mediaFile.getUrl();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1560(AdInfo adInfo) {
        int i10 = f1297 + InterfaceC0435l1.d.b.f29114k;
        f1298 = i10 % 128;
        int i11 = i10 % 2;
        String adUnitId = adInfo.getAdUnitId();
        if (i11 == 0) {
            int i12 = 90 / 0;
        }
        int i13 = f1297 + 35;
        f1298 = i13 % 128;
        if (i13 % 2 != 0) {
            return adUnitId;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1561(ImpressionData impressionData) {
        int i10 = f1298 + 51;
        f1297 = i10 % 128;
        if (i10 % 2 == 0) {
            return impressionData.getRawData();
        }
        impressionData.getRawData();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1564(VideoController videoController, VideoEventListener videoEventListener) {
        f1297 = (f1298 + 49) % 128;
        videoController.setVideoEventListener(videoEventListener);
        int i10 = f1297 + 91;
        f1298 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m1565(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i10 = f1298 + 77;
        f1297 = i10 % 128;
        int i11 = i10 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i11 != 0) {
            int i12 = 24 / 0;
        }
    }
}
