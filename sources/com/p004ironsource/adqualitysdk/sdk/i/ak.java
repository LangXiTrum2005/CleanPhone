package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ak {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f281 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f282;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final ax f286;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f287;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f284 = {2094579259, -1379537717, -2085660492, 869151432, 903032347, 547164408, 1191891304, -87243759, -656985281, 1899473992, 2147099519, 1470694587, -1616454559, 1503493146, -1710259946, 1202049857, -1240026151, 974460477};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f285 = {'C', 25875, 51850, 12401, 38332, 64282, 24799, 50811, 11262, 37222, 63060, 23429, 49453, 9913, 35912, 61889, 22349, 48306, 8809, 34579, 60556, 21043, 47021, 7498, 33497, 59469, 19962, 45862, 6154, 32143, 58154, 18603, 44590, 5063, 31041, 57004, 17448, 43287, 3717, 29741, 55715, 16171, 42202, 2625, 28600, 54631, 14873, 40842, 1289, 27315, 53296, 13791, 39751, 244, 26156, 51984, 12437, 38422, 64419, 24873, 50890, 11329, 'C', 25875, 51850, 12401, 38332, 64282, 24799, 50811, 11262, 37222, 63060, 23429, 49453, 9913, 35912, 61889, 22349, 48306, 8809, 34579, 60556, 21043, 47021, 7498, 33497, 59469, 19962, 45862, 6154, 32143, 58154, 18603, 44590, 5063, 31041, 57004, 17448, 43273, 3737, 29742, 55712, 16173, 42182, 2642, 28669, 54638, 14940, 40847, 1284, 27378, 53296, 13775, 39768, 255, 26239, 52062, 12433, 38416, 64433, 24934, 50897, 11332, 37352, 63339, 23794, 49537, 10000, 36031, 62012, 22483, 48461, 8946, 34876, 60834, 21122, 47119, 7612, 33583, 59603, 19970, 45952, 6496, 32481, 58241, 18697, 44712, 5160, 31195, 57172, 17538, 43618, 4079, 29852, 55823, 16307, 42350, 2721, 28764, 54720, 15158, 41210, 1439, 27419, 53439, 13858, 39846, 337, 26306, 6483, 31783, 54196, 10515, 35994, 57961, 31203, 57168, 13017, 34881, 'a', 25858, 51860, 12346, 38311, 64332, 24773, 50800, AbstractJsonLexerKt.UNICODE_ESC, 25884, 51853, 12322, 38321, 64347, 24776, 50797};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f283 = -7614355510583990926L;

    public ak(ax axVar) {
        this.f286 = axVar;
        ji.m2594().m2597(new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2.5

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f289 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f290 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int[] f291 = {2021090716, -56670383, -916671756, -1963451209, 158197227, -1800375646, 1926547179, -1980354249, -251462498, -1354540345, -1236338105, -1196346869, 1579866417, 2002748715, -945706649, 1979894415, -1984455466, -698115778};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static String m417(int[] iArr, int i2) {
                        String str;
                        synchronized (d.f1586) {
                            try {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f291.clone();
                                d.f1584 = 0;
                                while (true) {
                                    int i3 = d.f1584;
                                    if (i3 < iArr.length) {
                                        int i4 = iArr[i3];
                                        char c2 = (char) (i4 >> 16);
                                        cArr[0] = c2;
                                        char c3 = (char) i4;
                                        cArr[1] = c3;
                                        char c4 = (char) (iArr[i3 + 1] >> 16);
                                        cArr[2] = c4;
                                        char c5 = (char) iArr[i3 + 1];
                                        cArr[3] = c5;
                                        d.f1587 = (c2 << 16) + c3;
                                        d.f1585 = (c4 << 16) + c5;
                                        d.m1788(iArr2);
                                        for (int i5 = 0; i5 < 16; i5++) {
                                            int i6 = d.f1587 ^ iArr2[i5];
                                            d.f1587 = i6;
                                            int iM1787 = d.m1787(i6) ^ d.f1585;
                                            int i7 = d.f1587;
                                            d.f1587 = iM1787;
                                            d.f1585 = i7;
                                        }
                                        int i8 = d.f1587;
                                        int i9 = d.f1585;
                                        d.f1587 = i9;
                                        d.f1585 = i8;
                                        int i10 = i8 ^ iArr2[16];
                                        d.f1585 = i10;
                                        int i11 = i9 ^ iArr2[17];
                                        d.f1587 = i11;
                                        cArr[0] = (char) (i11 >>> 16);
                                        cArr[1] = (char) i11;
                                        cArr[2] = (char) (i10 >>> 16);
                                        cArr[3] = (char) i10;
                                        d.m1788(iArr2);
                                        int i12 = d.f1584;
                                        cArr2[i12 << 1] = cArr[0];
                                        cArr2[(i12 << 1) + 1] = cArr[1];
                                        cArr2[(i12 << 1) + 2] = cArr[2];
                                        cArr2[(i12 << 1) + 3] = cArr[3];
                                        d.f1584 = i12 + 2;
                                    } else {
                                        str = new String(cArr2, 0, i2);
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return str;
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() throws Exception {
                        int i2 = f290 + 103;
                        f289 = i2 % 128;
                        if (i2 % 2 != 0) {
                            ak.m407(ak.this);
                            throw null;
                        }
                        if (ak.m407(ak.this)) {
                            ak.m411(ak.this).m628(m417(new int[]{-638106459, 1934979984, -220688607, 956241831, -1919236838, -1986767602, -1739069842, 22791544, 1676545103, 662583075, 2142220737, -961711105}, (ViewConfiguration.getTapTimeout() >> 16) + 24).intern());
                            ak.m414(ak.this, false);
                            f289 = (f290 + 7) % 128;
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m405(ak akVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f282 = (f281 + 17) % 128;
        JSONObject jSONObjectM410 = m410(iSAdQualityCustomMediationRevenue);
        f281 = (f282 + 57) % 128;
        return jSONObjectM410;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m407(ak akVar) {
        int i2 = (f281 + 43) % 128;
        f282 = i2;
        boolean z2 = akVar.f287;
        int i3 = i2 + 111;
        f281 = i3 % 128;
        if (i3 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m410(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        dk dkVar = new dk();
        dkVar.m1942(true);
        dkVar.m1940(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        dkVar.m1941(m408(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        dkVar.m1938(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM1939 = dkVar.m1939();
        f281 = (f282 + 55) % 128;
        return jSONObjectM1939;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ax m411(ak akVar) {
        int i2 = (f282 + 107) % 128;
        f281 = i2;
        ax axVar = akVar.f286;
        int i3 = i2 + 71;
        f282 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return axVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m415(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
            f281 = (f282 + 55) % 128;
            n.m2828(m409(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, 33 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), m409(new int[]{707595153, -351969792, 674255082, -1186328441, -1908375730, -1822714859, 960298743, -1792339411, -1772820768, -1277632656, -499234418, 1363279653, -1198600496, 891201343, 280849393, 1207193725, 695862594, -337816098, 412596950, -640986931, 1590052673, -2103564681, 1978460924, -1091187760, 132651280, -2014947537, -1270087199, -952193824, -11379966, 827392690, 1575076592, -1107888948, -1101117365, 289872756}, Process.getGidForName("") + 68).intern());
            return false;
        }
        if (m406(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            if (m413(iSAdQualityCustomMediationRevenue.getAdType())) {
                return true;
            }
            n.m2828(m409(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, (Process.myTid() >> 22) + 32).intern(), m412((KeyEvent.getMaxKeyCode() >> 16) + 108, 62 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern());
            return false;
        }
        f281 = (f282 + 15) % 128;
        n.m2828(m409(new int[]{1539288035, -2044068693, 1236177411, 584287002, -1806784742, -576803014, -594459417, 582118488, 605154402, 2130284189, 1653296393, 702607237, -1716675478, 254688898, 1590052673, -2103564681}, 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m412(TextUtils.indexOf("", "", 0) + 62, TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f281 = (f282 + 95) % 128;
        return false;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m406(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == null) {
            return false;
        }
        int i2 = f281 + 39;
        f282 = i2 % 128;
        int i3 = i2 % 2;
        String strM408 = m408(iSAdQualityMediationNetwork);
        if (i3 != 0) {
            TextUtils.isEmpty(strM408);
            throw null;
        }
        if (TextUtils.isEmpty(strM408)) {
            return false;
        }
        f282 = (f281 + 31) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ boolean m414(ak akVar, boolean z2) {
        int i2 = f281;
        f282 = (i2 + 55) % 128;
        akVar.f287 = z2;
        f282 = (i2 + 125) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m416(final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f282 = (f281 + 123) % 128;
        if (m415(iSAdQualityCustomMediationRevenue)) {
            s.m2920(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.5

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f293 = 0;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f294 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static int f295 = 0;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static char f296 = 0;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static long f297 = 6566127689784953448L;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m418(int i2, char c2, String str, String str2, String str3) {
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
                    synchronized (j.f2569) {
                        try {
                            char[] cArr4 = (char[]) cArr3.clone();
                            char[] cArr5 = (char[]) cArr.clone();
                            cArr4[0] = (char) (c2 ^ cArr4[0]);
                            cArr5[2] = (char) (cArr5[2] + ((char) i2));
                            int length = cArr2.length;
                            char[] cArr6 = new char[length];
                            j.f2567 = 0;
                            while (true) {
                                int i3 = j.f2567;
                                if (i3 < length) {
                                    int i4 = (i3 + 2) % 4;
                                    int i5 = (i3 + 3) % 4;
                                    int i6 = cArr4[i3 % 4] * 32718;
                                    char c3 = cArr5[i4];
                                    char c4 = (char) ((i6 + c3) % 65535);
                                    j.f2568 = c4;
                                    cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                                    cArr4[i5] = c4;
                                    int i7 = j.f2567;
                                    cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f297) ^ ((long) f295)) ^ ((long) f296));
                                    j.f2567 = i7 + 1;
                                } else {
                                    str4 = new String(cArr6);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return str4;
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    f293 = (f294 + 73) % 128;
                    ak.m411(ak.this).m630(m418(261718382 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), "滴馁匏҆", "閇\ud9bf귡绠な崲娙莡哢ꨴ蟕쓕㒥줵\ud83e\u2450ꃘ\uf6ef枉풧△", "੨卽鉘嬟").intern(), Collections.singletonList(ak.m405(ak.this, iSAdQualityCustomMediationRevenue)));
                    ak.m414(ak.this, true);
                    int i2 = f294 + 85;
                    f293 = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                }
            }, as.m467().mo486());
        }
        f281 = (f282 + 13) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m408(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            int i2 = f282 + 109;
            f281 = i2 % 128;
            return i2 % 2 == 0 ? m409(new int[]{-1416935936, -1870916322, -1599992611, -178358419}, (ViewConfiguration.getFadingEdgeLength() % 25) + 4).intern() : m409(new int[]{-1416935936, -1870916322, -1599992611, -178358419}, 5 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            return m409(new int[]{-231184948, -2092786356, -983193274, -381664093}, (ViewConfiguration.getLongPressTimeout() >> 16) + 7).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m409(new int[]{-2015239621, -887947085, 549693568, 608918031}, 6 - View.resolveSize(0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return m412(10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), View.getDefaultSize(0, 0) + 170, (char) (6432 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            return m412(Color.red(0) + 8, (ViewConfiguration.getTouchSlop() >> 8) + 180, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            String strIntern = m412(7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 189 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Drawable.resolveOpacity(0, 0)).intern();
            int i3 = f281 + 71;
            f282 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 37 / 0;
            }
            return strIntern;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return m409(new int[]{-486545385, -1531874444, -64195124, -440541167, -824957293, -863121247}, TextUtils.getCapsMode("", 0, 0) + 12).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
            return "";
        }
        int i5 = f282 + 9;
        f281 = i5 % 128;
        return i5 % 2 == 0 ? m409(new int[]{1808733009, -542980471, 1721613191, -12525561}, 5 >>> (ViewConfiguration.getScrollDefaultDelay() >>> 125)).intern() : m409(new int[]{1808733009, -542980471, 1721613191, -12525561}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 5).intern();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m413(ISAdQualityAdType iSAdQualityAdType) {
        if (iSAdQualityAdType == ISAdQualityAdType.INTERSTITIAL) {
            return true;
        }
        f282 = (f281 + 61) % 128;
        if (iSAdQualityAdType == ISAdQualityAdType.VIDEO) {
            return true;
        }
        f282 = (f281 + 27) % 128;
        if (iSAdQualityAdType == ISAdQualityAdType.REWARDED_VIDEO) {
            return true;
        }
        f282 = (f281 + 27) % 128;
        return iSAdQualityAdType == ISAdQualityAdType.REWARDED;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m412(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f285[i3 + i4]) ^ (((long) i4) * f283)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m409(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f284.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
