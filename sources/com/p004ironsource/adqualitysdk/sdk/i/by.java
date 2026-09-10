package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class by extends bg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1109 = 110;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1110 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1111 = -477283186974895620L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1112;

    public by(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1300(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f1955) {
            try {
                char[] cArrM2116 = f.m2116(f1111, cArr, i2);
                f.f1954 = 4;
                while (true) {
                    int i3 = f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1111));
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
    public static /* synthetic */ void m1303(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i2 = f1110 + 67;
        f1112 = i2 % 128;
        int i3 = i2 % 2;
        m1305(oguryRewardedAd, oguryRewardedAdListener);
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1304(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i2 = f1112 + 119;
        f1110 = i2 % 128;
        int i3 = i2 % 2;
        m1301(oguryInterstitialAd, oguryInterstitialAdListener);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﻛ */
    public final Map<String, bg.b> mo707() {
        HashMap map = new HashMap();
        map.put(m1302(11 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 25, ImageFormat.getBitsPerPixel(0) + Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "\ufff9\u0004\uffd9￼￤\u0001\u000b\f�\u0006�\n\u000b�\f￡\u0006\f�\n\u000b\f\u0001\f\u0001", false).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.5
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                by.m1304((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1300("滎醌溽쀕⬚徑⥛ࠗ挟袖\uaa37鞡\ue14a瀵묪⾢륺렌\uf337枀煺\ue055䭀뿦ऌ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1).intern(), new bg.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bg.b
            /* JADX INFO: renamed from: ﾒ */
            public final Object mo710(List<Object> list, ch chVar) {
                by.m1303((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        f1112 = (f1110 + 49) % 128;
        return map;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ﾒ */
    public final String mo709() {
        f1112 = (f1110 + 21) % 128;
        try {
            String sdkVersion = Ogury.getSdkVersion();
            f1112 = (f1110 + 61) % 128;
            return sdkVersion;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1305(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i2 = f1110 + 37;
        f1112 = i2 % 128;
        int i3 = i2 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        if (i3 != 0) {
            int i4 = 46 / 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0152  */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.bg
    /* JADX INFO: renamed from: ｋ */
    public final Class mo708(String str) {
        byte b2 = 2;
        switch (str.hashCode()) {
            case -1704786309:
                if (!str.equals(m1302(5 - (ViewConfiguration.getScrollBarSize() >> 8), 19 - TextUtils.lastIndexOf("", '0'), TextUtils.lastIndexOf("", '0', 0, 0) + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "\b\ufffb\n\u0004\uffdf\u000f\n\uffff\f\uffff\n\ufff9ￗ\u0002\ufff7\uffff\n\uffff\n\t", true).intern())) {
                    b2 = -1;
                } else {
                    f1112 = (f1110 + 41) % 128;
                    b2 = 1;
                }
                break;
            case -734879533:
                if (!str.equals(m1302(11 - TextUtils.indexOf("", "", 0), 11 - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "\uffe7\uffff\r\n\u0011￪�\u000f\ufff9\n￼", false).intern())) {
                    b2 = -1;
                } else {
                    f1110 = (f1112 + 55) % 128;
                    b2 = 7;
                }
                break;
            case 76142724:
                if (!str.equals(m1302((ViewConfiguration.getWindowTouchSlop() >> 8) + 3, 5 - (Process.myPid() >> 22), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "\u000b�￥\u000f\b", true).intern())) {
                    b2 = -1;
                }
                break;
            case 82913255:
                if (!str.equals(m1300("쿤閱쾫쐪公Ԗ衭ఔᥧ\uf2e1\uf090촀䁡琟셊田ᡝ밉襀㴵큈\ue44cㄽ\ue568\ua83dⱮ綠굑怪鑈ꄋ", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern())) {
                    b2 = -1;
                } else {
                    f1110 = (f1112 + 83) % 128;
                    b2 = 4;
                }
                break;
            case 186993737:
                if (!str.equals(m1300("㟰縢㞿⾹븄챂灹\ue79c\uf604ᶉ㧄ї롱龌⸵뱵\ue044垯春\uf44c⡙\u0fed\ude45Ⱅ倮쟫ᙓ", ViewConfiguration.getFadingEdgeLength() >> 16).intern())) {
                    b2 = -1;
                } else {
                    f1112 = (f1110 + 99) % 128;
                    b2 = 6;
                }
                break;
            case 1169123445:
                if (!str.equals(m1302(Color.alpha(0) + 5, MotionEvent.axisFromString("") + 16, Color.green(0) + 210, "\u0000\u0001\u0000\uffdd\u0000￫\u0003\u0011\u000e\u0015￮\u0001\u0013�\u000e", false).intern())) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 1789379091:
                if (!str.equals(m1302(16 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 19, (ViewConfiguration.getEdgeSlop() >> 16) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "\ufffa\u0002\r\u0002\r\f\u000b\ufffe\r\u0007￢\u0012\u000b\u000e\u0000￨�ￚ\u0005", true).intern())) {
                    b2 = -1;
                } else {
                    f1112 = (f1110 + 67) % 128;
                    b2 = 3;
                }
                break;
            case 1866202823:
                if (!str.equals(m1302((ViewConfiguration.getScrollBarSize() >> 8) + 11, TextUtils.lastIndexOf("", '0', 0) + 50, 210 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0004￼\u0007ￜ\ufffe\u000f\u0004\u0011\u0004\u000f\u0014\ufffe\n\b\uffc9\n\u0002\u0010\r\u0014\uffc9￼\uffff\uffc9\u0004\t\u000f\u0000\r\u000e\u000f\u0004\u000f\u0004￼\u0007\uffc9\u0010\u0004\uffc9￤\t\u000f\u0000\r\u000e\u000f\u0004\u000f", false).intern())) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1301(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i2 = f1112 + 53;
        f1110 = i2 % 128;
        int i3 = i2 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1302(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f1109);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
