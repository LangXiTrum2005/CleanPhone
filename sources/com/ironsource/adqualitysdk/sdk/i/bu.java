package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp.maio.sdk.android.AdFullscreenActivity;
import jp.maio.sdk.android.HtmlBasedAdActivity;
import jp.maio.sdk.android.MaioAds;
import jp.maio.sdk.android.MaioAdsInstance;
import jp.maio.sdk.android.MaioAdsListener;
import jp.maio.sdk.android.MaioAdsListenerInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class bu extends be {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1015 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1017;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f1016 = {'M', 6999, 13829, 20941, 27801, 34922, 41783, 44529, 46818, 39834, 64615, 49412, 9682, 3719, 5033, 29810, 22835, 48585, 34444, 60281, 52333, 53552, 13811, 7846, 25423, 17416, 43211, 14853, 8489, 3117, 27552, 22230, 45576, 39236, 33851, 58284, 52973, 10776, 4371, 31878, 23487, 18175, 41527, 35168, 62608, 54215, 16195, 6678, 357, 27789, 19392, 46867, 37445, 63840, 58558, 50165, 12052, 2654, 29067, 23790, 48122, 42807, 33380, 59777, 54472, 12319, 7980, 51312, 54138, 65081, 39414, 42146, 16471, 27407, 30247, 4588, 15519, 55360, 58155, 36563, 43506, 46245, 20580, 31537, 1754, 8589, 'j', 6982, 13890, 20943, 27833, 34919, 41771, 48724, 55747, 62594, 4215, 11132, 18153, 25040, 31888, 39000, 45839, 52991, 59816, 1324, 8304, 15130, 22217, 29110, 36178, 43047, 49935, 57047, 63884, 5471, 12336, 19403, 26275, 33154, 40261, 47124, 54257, 61114, 2685, 'M', 6999, 13829, 20941, 27801, 34922, 41783, 48691, 55774, 62613, 4200, 11059, 18150, 25053, 31889, 36836, 38142, 47532, 56932, 58160, 1987, 11422, 12703, 22128, 31548, 40897, 42142, 51535, 61042, 62255, 'M', 6999, 13829, 20941, 27801, 34922, 41783, 48694, 55769, 62613, 4200, 11063, 18150, 25051, 31878, 39011, 45838, 52962, 59817, 1392, 8286, 15119, 22215, 29119, 's', 6995, 13848, 20975, 27833, 34919, 41771, 48699, 55764, 62613, 4176, 11067, 18171, 25034, 31889, 38980, 45829, 52964};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1014 = 2529035958020938550L;

    public bu(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m1189(MaioAdsListenerInterface maioAdsListenerInterface) {
        f1015 = (f1017 + 53) % 128;
        m1190(maioAdsListenerInterface);
        int i10 = f1015 + 67;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﻐ */
    public final String mo793() {
        f1015 = (f1017 + 17) % 128;
        String sdkVersion = MaioAds.getSdkVersion();
        f1015 = (f1017 + 79) % 128;
        return sdkVersion;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ｋ */
    public final Class mo794(String str) {
        switch (str.hashCode()) {
            case -1799290762:
                if (!str.equals(m1188((char) TextUtils.indexOf("", "", 0), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 7 - TextUtils.getTrimmedLength("")).intern())) {
                    return null;
                }
                f1017 = (f1015 + 75) % 128;
                return MaioAds.class;
            case -1455130644:
                if (!str.equals(m1188((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 14959), 26 - TextUtils.lastIndexOf("", '0'), 39 - ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return null;
                }
                f1015 = (f1017 + 89) % 128;
                return AdFullscreenActivity.class;
            case -1303622385:
                if (!str.equals(m1188((char) (ViewConfiguration.getLongPressTimeout() >> 16), 155 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern())) {
                    return null;
                }
                f1015 = (f1017 + 69) % 128;
                return MaioAdsListenerInterface.class;
            case -1069735125:
                if (str.equals(m1188((char) View.resolveSizeAndState(0, 0, 0), 124 - TextUtils.lastIndexOf("", '0', 0), ((Process.getThreadPriority(0) + 20) >> 6) + 15).intern())) {
                    return MaioAdsInstance.class;
                }
                return null;
            case -278703286:
                if (str.equals(m1188((char) (36777 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 140, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern())) {
                    return MaioAdsListener.class;
                }
                return null;
            case 357386522:
                if (str.equals(m1188((char) (51256 - (ViewConfiguration.getTapTimeout() >> 16)), ExpandableListView.getPackedPositionChild(0L) + 68, (ViewConfiguration.getTouchSlop() >> 8) + 19).intern())) {
                    return HtmlBasedAdActivity.class;
                }
                return null;
            case 1819361677:
                if (str.equals(m1188((char) (44464 - View.MeasureSpec.makeMeasureSpec(0, 0)), 6 - TextUtils.indexOf((CharSequence) "", '0', 0), ExpandableListView.getPackedPositionType(0L) + 20).intern())) {
                    return AdFullscreenActivity.class;
                }
                return null;
            case 1914325723:
                if (!str.equals(m1188((char) TextUtils.indexOf("", ""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 86, 38 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                    return null;
                }
                f1017 = (f1015 + 27) % 128;
                return HtmlBasedAdActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.be
    /* JADX INFO: renamed from: ﾇ */
    public final Map<String, be.c> mo795() {
        HashMap map = new HashMap();
        map.put(m1188((char) (ViewConfiguration.getPressedStateDuration() >> 16), 179 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18).intern(), new be.c() { // from class: com.ironsource.adqualitysdk.sdk.i.bu.2
            @Override // com.ironsource.adqualitysdk.sdk.i.be.c
            /* JADX INFO: renamed from: ﾇ */
            public final Object mo796(List<Object> list, ck ckVar) {
                bu.m1189((MaioAdsListenerInterface) list.get(0));
                return null;
            }
        });
        f1017 = (f1015 + 67) % 128;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1188(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1016[i10 + i12]) ^ (((long) i12) * f1014)) ^ ((long) c4));
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
    private static void m1190(MaioAdsListenerInterface maioAdsListenerInterface) {
        f1017 = (f1015 + 19) % 128;
        MaioAds.setMaioAdsListener(maioAdsListenerInterface);
        int i10 = f1015 + InterfaceC0435l1.d.b.f29109f;
        f1017 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
