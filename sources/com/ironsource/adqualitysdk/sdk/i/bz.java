package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bz extends be {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1144 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1145 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1146 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1147 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1148 = -8721103573037478756L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1149 = {36147, 64371, 25024, 60970, 21652, 56586, 19300, 45506, 15926, 42124, 11549, 39803, 495, 36386, 62636, 32026, 60284, 20932, 56880, 17574, 'O', 30208, 60603, 25415, 55781, 20554, 50692, 15525, 45917, 10733, 41077, 5657, 36029, 847, 31179, 61544, 26140, 56470, 21338, 'O', 30208, 60603, 25415, 55781, 20554, 50692, 15525, 45917, 10733, 41077, 5657, 36029, 847, 31179, 61544, 26140, 56470, 21338, 51689, 16485, 46592, 11438, 41764, 6598, 36970, 1540, 6858, 27781, 63038, 31170, 50016, 19156, 56458, 9763, 43484, 13160, 47847, 3213, 38453, 6655, 25411, 30705, 446, 39685, 5369, 44635, 10223, 45489, 19224, 50407, 24147, 55260, 58009, 38120, 3664, 33174, 15128, 45725, 9445, 56905, 20897, 51969, 17029, 62707, 28247, 57776, 39716, 4770, 34046, 15985, 45501, 11068, 41618, 21756, 52830, 16846, 64304, 56476, 43757, 12373, 49032, 1302, 35995, 6884, 57420, 28595, 62741, 31885, 51907, 20575, 57240, 42276, 11413, 47851, ']', 36799, 5423, 40081};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f1150 = 8238053436795745895L;

    public bz(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1363(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1144 + 25;
        f1145 = i10 % 128;
        int i11 = i10 % 2;
        m1367(oguryRewardedAd, oguryRewardedAdListener);
        if (i11 != 0) {
            throw null;
        }
        f1144 = (f1145 + 1) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1364(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1145 + 69;
        f1144 = i10 % 128;
        int i11 = i10 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i11 == 0) {
            int i12 = 19 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1366(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        f1145 = (f1144 + 27) % 128;
        m1364(oguryInterstitialAd, oguryInterstitialAdListener);
        int i10 = f1144 + InterfaceC0435l1.d.b.f29105b;
        f1145 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1367(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        f1144 = (f1145 + 61) % 128;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        int i10 = f1145 + 49;
        f1144 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x015a  */
    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        byte b10 = 2;
        switch (str.hashCode()) {
            case -1704786309:
                if (!str.equals(m1362((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36217), ViewConfiguration.getKeyRepeatTimeout() >> 16, ExpandableListView.getPackedPositionType(0L) + 20).intern())) {
                    b10 = -1;
                } else {
                    f1145 = (f1144 + 75) % 128;
                    b10 = 1;
                }
                break;
            case -734879533:
                if (!str.equals(m1362((char) (View.combineMeasuredStates(0, 0) + 30654), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 81, 11 - (Process.myPid() >> 22)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case 76142724:
                if (!str.equals(m1365((char) (TextUtils.indexOf("", "", 0, 0) + 35043), "ಜ랶檁蛸", "대ㇺ\ue300\uf188", "尗쉏㗓瘓疻", ExpandableListView.getPackedPositionGroup(0L) + 3275443).intern())) {
                    b10 = -1;
                }
                break;
            case 82913255:
                if (!str.equals(m1362((char) View.MeasureSpec.getMode(0), 39 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getTrimmedLength("") + 27).intern())) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 186993737:
                if (!str.equals(m1365((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), "ಜ랶檁蛸", "ﯫԌ\udb81䯪", "䶈⃨胁펱欄\u0a04栎ꌉᎉ⋨\u0df6ᆊ絥힣\ue9cf葄酞檆࠴礹屮動抄", TextUtils.getOffsetAfter("", 0) - 2130375429).intern())) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case 1169123445:
                if (!str.equals(m1362((char) ((-16770427) - Color.rgb(0, 0, 0)), Color.blue(0) + 66, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14).intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1145 + 85;
                    f1144 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (byte) 5 : (byte) 3;
                }
                break;
            case 1789379091:
                if (!str.equals(m1362((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, 19 - KeyEvent.keyCodeFromString("")).intern())) {
                    b10 = -1;
                } else {
                    f1144 = (f1145 + 63) % 128;
                }
                break;
            case 1866202823:
                if (!str.equals(m1365((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), "ಜ랶檁蛸", "✆⳥\uf47f剘", "켈\uf638䁌뺲睬߇Ỻ눗․㎵钬\ued53ꏂ\u2e64\uf048匩䵣疀Ʊ숰렄蟸ㅆ蔒轡\ue09eᕵ⋟隞䋕萲㇁ഄ흓\udf98洱\u2da7醺໙\uf4cc즯꧂\udc1f寸ʿ\uf3fa瀳ꠝ핈", 2116871463 - Color.rgb(0, 0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                return OguryInterstitialAd.class;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1144 = (f1145 + 97) % 128;
        try {
            String sdkVersion = Ogury.getSdkVersion();
            int i10 = f1144 + 5;
            f1145 = i10 % 128;
            if (i10 % 2 == 0) {
                return sdkVersion;
            }
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1362((char) (58090 - (ViewConfiguration.getPressedStateDuration() >> 16)), 92 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getTapTimeout() >> 16) + 25).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bz.m1366((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1362((char) (56558 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarSize() >> 8) + 117, 21 - (ViewConfiguration.getTapTimeout() >> 16)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bz.m1363((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        f1145 = (f1144 + 115) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1362(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1149[i10 + i12]) ^ (((long) i12) * f1150)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1365(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1148) ^ ((long) f1146)) ^ ((long) f1147));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }
}
