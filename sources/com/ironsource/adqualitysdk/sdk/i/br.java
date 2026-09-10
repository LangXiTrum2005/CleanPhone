package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
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
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class br extends be {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f963 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f964 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f968 = 6;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f965 = {'F', 'i', 'v', 'e', 'A', 'd', 'C', 'u', 's', 't', 'o', 'm', 'L', 'a', 'y', 'I', 'n', 'r', 'l', 'V', 'w', 'E', 'c', '.', 'f', '_', 'p', 'R', 'g', 'T', 'P', 'S', 'N', 'G', 'H', 'J'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f969 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f967 = 376399573;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f966 = 0;

    public br(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAdListener m1113(FiveAdInterface fiveAdInterface) {
        int i10 = f964 + 49;
        f963 = i10 % 128;
        if (i10 % 2 != 0) {
            fiveAdInterface.getListener();
            throw null;
        }
        FiveAdListener listener = fiveAdInterface.getListener();
        int i11 = f963 + InterfaceC0435l1.d.b.f29110g;
        f964 = i11 % 128;
        if (i11 % 2 != 0) {
            return listener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static String m1114(FiveAdInterface fiveAdInterface) {
        int i10 = f964 + 39;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdInterface.getSlotId();
        }
        fiveAdInterface.getSlotId();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static String m1115(FiveAdInterface fiveAdInterface) {
        int i10 = f964 + InterfaceC0435l1.d.b.f29112i;
        f963 = i10 % 128;
        int i11 = i10 % 2;
        String adParameter = fiveAdInterface.getAdParameter();
        if (i11 != 0) {
            int i12 = 17 / 0;
        }
        return adParameter;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ FiveAd m1116() {
        f963 = (f964 + 65) % 128;
        FiveAd fiveAdM1112 = m1112();
        f963 = (f964 + 61) % 128;
        return fiveAdM1112;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static CreativeType m1118(FiveAdInterface fiveAdInterface) {
        f963 = (f964 + 49) % 128;
        CreativeType creativeType = fiveAdInterface.getCreativeType();
        int i10 = f964 + 5;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return creativeType;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1119(FiveAdConfig fiveAdConfig) {
        f964 = (f963 + 3) % 128;
        String strM1122 = m1122(fiveAdConfig);
        int i10 = f964 + 117;
        f963 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 52 / 0;
        }
        return strM1122;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m1123(FiveAdInterface fiveAdInterface) {
        f964 = (f963 + InterfaceC0435l1.d.b.f29110g) % 128;
        String strM1115 = m1115(fiveAdInterface);
        int i10 = f963 + 55;
        f964 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM1115;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ CreativeType m1124(FiveAdInterface fiveAdInterface) {
        int i10 = f964 + 59;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1118(fiveAdInterface);
        }
        m1118(fiveAdInterface);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m1129(FiveAdInterface fiveAdInterface) {
        f964 = (f963 + 61) % 128;
        String strM1114 = m1114(fiveAdInterface);
        int i10 = f964 + 65;
        f963 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 58 / 0;
        }
        return strM1114;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ FiveAdListener m1131(FiveAdInterface fiveAdInterface) {
        f963 = (f964 + 53) % 128;
        FiveAdListener fiveAdListenerM1113 = m1113(fiveAdInterface);
        int i10 = f964 + 77;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdListenerM1113;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static FiveAd m1112() {
        f963 = (f964 + InterfaceC0435l1.d.b.f29105b) % 128;
        FiveAd singleton = FiveAd.getSingleton();
        f963 = (f964 + 91) % 128;
        return singleton;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static String m1117(FiveAdInterface fiveAdInterface) {
        int i10 = f964 + InterfaceC0435l1.d.b.f29109f;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return fiveAdInterface.getFiveAdTag();
        }
        fiveAdInterface.getFiveAdTag();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m1120(FiveAdInterface fiveAdInterface) {
        int i10 = f963 + 19;
        f964 = i10 % 128;
        if (i10 % 2 != 0) {
            return m1117(fiveAdInterface);
        }
        m1117(fiveAdInterface);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1122(FiveAdConfig fiveAdConfig) {
        int i10 = f964 + 5;
        f963 = i10 % 128;
        int i11 = i10 % 2;
        String str = fiveAdConfig.appId;
        if (i11 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m1126(FiveAdCustomLayout fiveAdCustomLayout) {
        int i10 = f964 + 61;
        f963 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1133(fiveAdCustomLayout);
        }
        m1133(fiveAdCustomLayout);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1135(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        f964 = (f963 + 1) % 128;
        m1130(fiveAdInterface, fiveAdViewEventListener);
        int i10 = f963 + 1;
        f964 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1132((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "颶䈩艹\ue7c8", "ḃ不\uf71fⰣ蘪歍䝹㩁ችө棍ቷ䪪裫籡ᾈ䔀㧽愀쉴", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.4
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1119((FiveAdConfig) list.get(0));
            }
        });
        map.put(m1132((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "튐铏ၽ\udbb0", "⹍䄺\ude51쩽ָ݆씦偯軋\ue952槷㭆⮲\u187c綠䔅䇆⫮븒직⬯呉廖走", View.resolveSizeAndState(0, 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1129((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1125(View.MeasureSpec.getSize(0) + 21, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u0019\u0011\u008a", (byte) (35 - Color.blue(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.3
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1120((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1125(30 - View.MeasureSpec.getMode(0), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u000b\f\u0001\u000f\u0007\u0003\u0003\u0004\u001a\u0011\u001b\u0002", (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 76)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.7
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1124((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1125((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 28, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\u0005\u0000\u001f\f\f\u000e\t\u0005\u000f\t\u0099", (byte) (39 - TextUtils.indexOf("", "", 0, 0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.8
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1123((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1125('J' - AndroidCharacter.getMirror('0'), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0003\u0011\u000f\n\u0005\u000f\u0019\f\u0015\u0004\r\u0000\t\n\u0004\u000f\u0005\u000f", (byte) (99 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.6
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1131((FiveAdInterface) list.get(0));
            }
        });
        map.put(m1132((char) (TextUtils.indexOf((CharSequence) "", '0') + 41631), "\u0000\u0000\u0000\u0000", "䖼苺鸙暢", "⡦를ߑ憦湭㚵\uec49骭\ue1f9쎹葿空榕\u0cdf墧攸ẩ怕\ue30dɔ幺š\ue6d1⊠䐜꼯", TextUtils.getCapsMode("", 0, 0)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.9
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                br.m1127((FiveAdInterface) list.get(0), (FiveAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1125((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17, "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0001#\u0004\r\u0018\u0016\t\u000f\u0010\u0016", (byte) (69 - Color.green(0))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.10
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1116();
            }
        });
        map.put(m1125(35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u001b\u0004\u0006\u0003\u0002\u0003\u0004\u0005\u0000\u000b\b\t\n\u000b\u0006\u0011\u000e\u000f\u000b\b\n\u0003\u0000\u0003\u0005\u000f\u0007\u0003\t\u0002\u000e#\u0011\u0007¼", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 88)).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.11
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                return br.m1126((FiveAdCustomLayout) list.get(0));
            }
        });
        map.put(m1132((char) (49250 - TextUtils.indexOf("", "", 0, 0)), "\u0000\u0000\u0000\u0000", "螫ꢔ扽닀", "喺ꛏ︶ᒬọ纀걵\ue78d\uec4d憱瀿愶߆荻\ue9b8", TextUtils.lastIndexOf("", '0', 0) + 2108200072).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.5
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                br.m1128((FiveAdInterface) list.get(0), (FiveAdLoadListener) list.get(1));
                return null;
            }
        });
        map.put(m1125((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19, "\t\u0002\u0007\u0015\u0002\u0004\u0015\u0016\u0003\u0004\u000f\n\r\u0000\t\n\u0004\u000f\u0005\u000f", (byte) (45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.br.1
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                br.m1135((FiveAdInterface) list.get(0), (FiveAdViewEventListener) list.get(1));
                return null;
            }
        });
        f963 = (f964 + 69) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1127(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f964 + 79;
        f963 = i10 % 128;
        int i11 = i10 % 2;
        m1121(fiveAdInterface, fiveAdListener);
        if (i11 != 0) {
            int i12 = 59 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1133(FiveAdCustomLayout fiveAdCustomLayout) {
        f964 = (f963 + 23) % 128;
        String advertiserName = fiveAdCustomLayout.getAdvertiserName();
        int i10 = f964 + 27;
        f963 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 1 / 0;
        }
        return advertiserName;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f963 = (f964 + InterfaceC0435l1.d.b.f29109f) % 128;
        String sdkSemanticVersion = FiveAd.getSdkSemanticVersion();
        f964 = (f963 + 29) % 128;
        return sdkSemanticVersion;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1121(FiveAdInterface fiveAdInterface, FiveAdListener fiveAdListener) {
        int i10 = f964 + 25;
        f963 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setListener(fiveAdListener);
        if (i11 != 0) {
            throw null;
        }
        f963 = (f964 + 37) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1128(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        int i10 = f963 + 15;
        f964 = i10 % 128;
        int i11 = i10 % 2;
        m1134(fiveAdInterface, fiveAdLoadListener);
        if (i11 == 0) {
            int i12 = 13 / 0;
        }
        f963 = (f964 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m1134(FiveAdInterface fiveAdInterface, FiveAdLoadListener fiveAdLoadListener) {
        f964 = (f963 + 33) % 128;
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        f963 = (f964 + 17) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1132(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f969) ^ ((long) f967)) ^ ((long) f966));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -1836618638:
                if (!str.equals(m1132((char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0000\u0000\u0000\u0000", "馽콫丠䄅", "ꍂ\ue3ad圕䀰ཛྷ㛵ꤠ粋殯\uf241", View.MeasureSpec.getMode(0)).intern())) {
                    return null;
                }
                f964 = (f963 + 63) % 128;
                return AdActivity.class;
            case -1782131271:
                if (str.equals(m1125(30 - (ViewConfiguration.getTouchSlop() >> 8), "\u0001\u0002\u0003\u0004\u0005\u0000\u0019\u0007\u0000\u0004\t\u001c\u0002\u0015\u000e\f\u0003\u0017\u0003\u0004\u000f\n\r\u0000\t\n\u0004\u000f\u0005\u000f", (byte) (Process.getGidForName("") + 127)).intern())) {
                    return FiveAdVideoRewardEventListener.class;
                }
                return null;
            case -962125644:
                if (str.equals(m1125(23 - (Process.myPid() >> 22), "\u0001\u0002\u0003\u0004\u0005\u0000\u0019\u0007\u0002\u0015\u0014\u0003\u0004\u000f\u0006\u000f\u0002\u0007\u000f\t\u000f\u0004£", (byte) (TextUtils.lastIndexOf("", '0') + 50)).intern())) {
                    return FiveAdViewEventListener.class;
                }
                return null;
            case -939888073:
                if (!str.equals(m1132((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "陵㮏\uf0b9\ue0e1", "໐ય妊ሃ瓹ᬢ䏗構ᒅ㎩ꓨ鴷", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern())) {
                    return null;
                }
                f964 = (f963 + 107) % 128;
                return FiveAdConfig.class;
            case -853874964:
                if (!str.equals(m1132((char) Color.argb(0, 0, 0, 0), "\u0000\u0000\u0000\u0000", "⨆⤰뼓岞", "륝凑쐊ꢿ䅒ᵞꔎ웞隷ꙡ峞郀", View.combineMeasuredStates(0, 0)).intern())) {
                    return null;
                }
                f963 = (f964 + 119) % 128;
                return FiveAdFormat.class;
            case -735613671:
                if (str.equals(m1125(27 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u001c\u0010\u0011\u001d\u0019\u0000\u0003\u0004\u001c\u0013\u000b\u0010\u001d\u0014\u0011\u0001\u0016\u0005\u0000\u0005\u0015\n\u0002\u0003\u0003\u0007ê", (byte) (KeyEvent.keyCodeFromString("") + InterfaceC0435l1.d.b.f29114k)).intern())) {
                    return AdActivity.class;
                }
                return null;
            case -624329424:
                if (str.equals(m1125((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\t\n\u000b\u0006\r\u000e\u0010\b\b\n", (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 70)).intern())) {
                    return FiveAdCustomLayout.class;
                }
                return null;
            case -295916403:
                if (str.equals(m1132((char) (54884 - MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "똞᳓旒濖", "쵈䎸ᥟ㗚氜\uf0c8韷倬\uf783끒婅\u0efe\ue8c5\ue40a墎\uf34f譸Ꙋꐸ䕈ᴊ떭製ሆ➸䁫㨬舝張\uddaf㴘", ((Process.getThreadPriority(0) + 20) >> 6) - 769862730).intern())) {
                    return FiveAdInterstitialEventListener.class;
                }
                return null;
            case -189625759:
                if (str.equals(m1125(18 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0000\u0010\u0011\u000f\t\u000e\u000b\u0007\u0003\u0007\u0003\f\u0013", (byte) (93 - KeyEvent.normalizeMetaState(0))).intern())) {
                    return FiveAdInterstitial.class;
                }
                return null;
            case -6611420:
                if (str.equals(m1132((char) (3363 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), "\u0000\u0000\u0000\u0000", "䂞钏⍄䔍", "憵踉㎁軿\uf4fa\uebdc渦벥\ufdeaﾒ缃ᮏ똇㻺珱", TextUtils.indexOf((CharSequence) "", '0') + 1150586689).intern())) {
                    return FiveAdInterface.class;
                }
                return null;
            case 636996201:
                if (!str.equals(m1132((char) (44648 - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", "检픴椃\ue5ae", "炿幏\uf3a6䙛ퟱ\udccd塮ᮇ柷쵠삩㣾\uee22Е", ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    return null;
                }
                f963 = (f964 + 39) % 128;
                return FiveAdListener.class;
            case 890103511:
                if (!str.equals(m1132((char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", "㿻㡎⿽ᷯ", "জ䵨㻄ﮜ\uf862緈䃴逓餫φ뮺䏶뭀ꔏ᷇惒䠶楠쌒홖\u0b00梌㛅箏\uf811컣而鹫掷刀퇜鹮똢\ued67昮", (-46641600) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    return null;
                }
                f964 = (f963 + 55) % 128;
                return FiveAdCustomLayout.class;
            case 1252059573:
                if (!str.equals(m1132((char) (KeyEvent.getDeadChar(0, 0) + 32290), "\u0000\u0000\u0000\u0000", "⽛\ued2b≾\ua97e", "貪鸣ᯪ쪄ᣝ\udd88䥳㗪쓿鲪⛽팽ꯒע㿶\u0fdb佷", 2129472303 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    return null;
                }
                f963 = (f964 + 95) % 128;
                return FiveAdVideoReward.class;
            case 1508614908:
                if (str.equals(m1132((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0000\u0000\u0000\u0000", "靅䡬쑶儉", "쨱䄹⠭ꐃ孂䌝譾哫统綜㿅", 1967680663 - Color.rgb(0, 0, 0)).intern())) {
                    return FiveAdState.class;
                }
                return null;
            case 1835584239:
                if (str.equals(m1125(((byte) KeyEvent.getModifierMetaStateMask()) + 19, "\u0001\u0002\u0003\u0004\u0005\u0000\u0010\u0006\u0011\u0001\r\u0000\t\n\u0004\u000f\u0005\u000f", (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21)).intern())) {
                    return FiveAdLoadListener.class;
                }
                return null;
            case 1942443945:
                if (str.equals(m1132((char) (ViewConfiguration.getLongPressTimeout() >> 16), "\u0000\u0000\u0000\u0000", "枣逶睑躈", "፱ȼ쟌鴉ℤ柿扝髨\ud9b8䨻叉\uee63", ViewConfiguration.getScrollBarSize() >> 8).intern())) {
                    return CreativeType.class;
                }
                return null;
            case 2104624789:
                if (str.equals(m1125(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, "\u0001\u0002\u0003\u0004\u0005\u0000", (byte) (ImageFormat.getBitsPerPixel(0) + 38)).intern())) {
                    return FiveAd.class;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m1130(FiveAdInterface fiveAdInterface, FiveAdViewEventListener fiveAdViewEventListener) {
        int i10 = f963 + 5;
        f964 = i10 % 128;
        int i11 = i10 % 2;
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        if (i11 == 0) {
            int i12 = 16 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1125(int i10, String str, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (j.f2647) {
            try {
                char[] cArr2 = f965;
                char c4 = f968;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    j.f2654 = 0;
                    while (true) {
                        int i11 = j.f2654;
                        if (i11 >= i10) {
                            break;
                        }
                        j.f2653 = cArr[i11];
                        j.f2650 = cArr[j.f2654 + 1];
                        if (j.f2653 == j.f2650) {
                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                        } else {
                            j.f2652 = j.f2653 / c4;
                            j.f2649 = j.f2653 % c4;
                            j.f2651 = j.f2650 / c4;
                            j.f2648 = j.f2650 % c4;
                            if (j.f2649 == j.f2648) {
                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                int i12 = (j.f2652 * c4) + j.f2649;
                                int i13 = (j.f2651 * c4) + j.f2648;
                                int i14 = j.f2654;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (j.f2652 == j.f2651) {
                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                int i15 = (j.f2652 * c4) + j.f2649;
                                int i16 = (j.f2651 * c4) + j.f2648;
                                int i17 = j.f2654;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (j.f2652 * c4) + j.f2648;
                                int i19 = (j.f2651 * c4) + j.f2649;
                                int i20 = j.f2654;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        j.f2654 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
