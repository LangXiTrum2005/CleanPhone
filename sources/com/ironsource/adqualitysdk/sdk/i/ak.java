package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f279 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f281;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f283;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final av f284;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int[] f282 = {-476758169, -1693109424, 528455195, 599217691, -1775891542, 341386915, -150819157, -473117234, -2070869909, -135602810, 611117096, 1623706857, -322491909, 74854571, -1965878988, 1744346535, -1959626240, 821498109};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f280 = 149;

    public ak(av avVar) {
        this.f284 = avVar;
        jt.m2734().m2736(new js() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.2.5

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f292 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f293 = 0;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f294 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static long f295 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static char f296 = 50077;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m425(char c4, String str, String str2, String str3, int i10) {
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
                                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f295) ^ ((long) f293)) ^ ((long) f296));
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() throws Exception {
                        f294 = (f292 + 39) % 128;
                        if (ak.m412(ak.this)) {
                            ak.m413(ak.this).m649(m425((char) ((-1) - Process.getGidForName("")), "\u0000\u0000\u0000\u0000", "ᥬ봂鯤ᾇ", "황䁍␅状闇\uec88㢯蒪泇퍷迫弽♌\ue2a6甽硞ᢱ\uda5bನ늑⛧ᦇ揢墲", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1).intern());
                            ak.m416(ak.this, false);
                            f294 = (f292 + 55) % 128;
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m412(ak akVar) {
        int i10 = f279 + 55;
        int i11 = i10 % 128;
        f281 = i11;
        int i12 = i10 % 2;
        boolean z10 = akVar.f283;
        if (i12 != 0) {
            int i13 = 84 / 0;
        }
        f279 = (i11 + 39) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ av m413(ak akVar) {
        int i10 = (f279 + 37) % 128;
        f281 = i10;
        av avVar = akVar.f284;
        f279 = (i10 + 115) % 128;
        return avVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m419(ak akVar, ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f279 = (f281 + 17) % 128;
        JSONObject jSONObjectM414 = m414(iSAdQualityCustomMediationRevenue);
        f281 = (f279 + 115) % 128;
        return jSONObjectM414;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m423(@NonNull final ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        f279 = (f281 + 71) % 128;
        if (m420(iSAdQualityCustomMediationRevenue)) {
            p.m2997(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ak.1

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static int f285 = 1;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static int f286 = 0;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static char[] f287 = {'m', 'e', 'd', 'i', 'a', 't', 'o', 'n', '.', 'C', 'u', 's', 'R', 'v', 'p', 'q'};

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static char f288 = 4;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m424(int i10, String str, byte b10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (j.f2647) {
                        try {
                            char[] cArr2 = f287;
                            char c4 = f288;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    f286 = (f285 + 35) % 128;
                    ak.m413(ak.this).m645(m424(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0001\u0002\u0003\u0000\u0005\u0006\u0002\u0007\u0004\u000b\u0007\u0004\n\u000b\t\u0007\u0004\u0002\r\u0000\u009d", (byte) (View.resolveSize(0, 0) + 39)).intern(), Collections.singletonList(ak.m419(ak.this, iSAdQualityCustomMediationRevenue)));
                    ak.m416(ak.this, true);
                    int i10 = f286 + 57;
                    f285 = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                }
            }, ar.m468().mo487());
        }
        f279 = (f281 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m416(ak akVar, boolean z10) {
        int i10 = f281 + 11;
        f279 = i10 % 128;
        int i11 = i10 % 2;
        akVar.f283 = z10;
        if (i11 == 0) {
            int i12 = 6 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m420(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        if (iSAdQualityCustomMediationRevenue == null) {
            return false;
        }
        if (iSAdQualityCustomMediationRevenue.getRevenue() < 0.0d) {
            f279 = (f281 + 73) % 128;
            m.m2968(m418(new int[]{1788383084, -931093295, 1541417082, 2062785918, -314058023, -346349285, -1986398874, -779169271, -1406982655, 1122947913, -762711127, -529955309, -1001101103, 360084730, 504696535, -1757921023}, 31 - MotionEvent.axisFromString("")).intern(), m418(new int[]{1090998332, 699617043, 1998681545, -2068010171, -1570222137, 1780980446, -462486214, 1458987995, 1865828922, -1615689878, -464375646, -1975180005, -1551141537, 100314440, 74237786, 1364326000, -639211024, 301531772, -357739285, -1089303622, 504696535, -1757921023, 902307978, -1097140342, 2061624545, 675707757, -1163898598, -1968207893, -1434758147, 1104522200, -1586692974, 1423655957, 1094564467, -2106103011}, 66 - TextUtils.lastIndexOf("", '0', 0)).intern());
            return false;
        }
        if (!m422(iSAdQualityCustomMediationRevenue.getMediationNetwork())) {
            f279 = (f281 + 27) % 128;
            m.m2968(m418(new int[]{1788383084, -931093295, 1541417082, 2062785918, -314058023, -346349285, -1986398874, -779169271, -1406982655, 1122947913, -762711127, -529955309, -1001101103, 360084730, 504696535, -1757921023}, 32 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m421(View.MeasureSpec.getMode(0) + 62, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 246, "\u0004\uffd9\uffbf\f\b\u0012\u0012\b\r\u0006\uffbf\f\u0004\u0003\b\u0000\u0013\b\u000e\r\uffbf\r\u0004\u0013\u0016\u000e\u0011\n￢\u0000\rￆ\u0013\uffbf\u0012\u0004\r\u0003\uffbf\u0002\u0014\u0012\u0013\u000e\f\uffbf\f\u0004\u0003\b\u0000\u0013\b\u000e\r\uffbf\u0011\u0004\u0015\u0004\r\u0014", 28 - TextUtils.getCapsMode("", 0, 0)).intern());
            return false;
        }
        if (m415(iSAdQualityCustomMediationRevenue.getAdType())) {
            return true;
        }
        m.m2968(m418(new int[]{1788383084, -931093295, 1541417082, 2062785918, -314058023, -346349285, -1986398874, -779169271, -1406982655, 1122947913, -762711127, -529955309, -1001101103, 360084730, 504696535, -1757921023}, ((byte) KeyEvent.getModifierMetaStateMask()) + 33).intern(), m418(new int[]{1090998332, 699617043, 1998681545, -2068010171, -1570222137, 1780980446, -462486214, 1458987995, 1865828922, -1615689878, -464375646, -1975180005, -1551141537, 100314440, 74237786, 1364326000, -639211024, 301531772, -25086132, 1144649897, -1202541427, -1196105894, 1207074964, 1343966017, -1520524559, -1395953170, 1570028686, 19653916, 531811482, -397904476, 2104951422, -1228325346, 101523916, 676147954, 1388781207, 533612672, -373026958, 606471424, -222623641, 1158908709, 191187046, 406258723, 2064127639, -1428538579, -1974290015, -1861469734, -1738091331, 1855113289, 417810697, 903983136, 1866392768, -1836299059, -330574132, 1725051076}, 108 - View.resolveSize(0, 0)).intern());
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m415(ISAdQualityAdType iSAdQualityAdType) {
        int i10 = f281 + InterfaceC0435l1.d.b.f29109f;
        f279 = i10 % 128;
        if (i10 % 2 == 0) {
            ISAdQualityAdType iSAdQualityAdType2 = ISAdQualityAdType.UNKNOWN;
            throw null;
        }
        if (iSAdQualityAdType == ISAdQualityAdType.INTERSTITIAL || iSAdQualityAdType == ISAdQualityAdType.VIDEO) {
            return true;
        }
        f281 = (f279 + 17) % 128;
        return iSAdQualityAdType == ISAdQualityAdType.REWARDED_VIDEO || iSAdQualityAdType == ISAdQualityAdType.REWARDED;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m414(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        dk dkVar = new dk();
        dkVar.m2013(true);
        dkVar.m2011(Double.valueOf(iSAdQualityCustomMediationRevenue.getRevenue()));
        dkVar.m2010(m417(iSAdQualityCustomMediationRevenue.getMediationNetwork()));
        dkVar.m2012(iSAdQualityCustomMediationRevenue.getPlacement());
        JSONObject jSONObjectM2009 = dkVar.m2009();
        int i10 = f281 + 13;
        f279 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 39 / 0;
        }
        return jSONObjectM2009;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m422(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        int i10 = (f279 + 123) % 128;
        f281 = i10;
        if (iSAdQualityMediationNetwork == null) {
            return false;
        }
        f279 = (i10 + 17) % 128;
        if (TextUtils.isEmpty(m417(iSAdQualityMediationNetwork))) {
            return false;
        }
        f279 = (f281 + 11) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m421(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                d.f1622 = 0;
                while (true) {
                    int i13 = d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    d.f1624 = cArr[i13];
                    cArr2[d.f1622] = (char) (d.f1624 + i11);
                    int i14 = d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f280);
                    d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    d.f1622 = 0;
                    while (true) {
                        int i17 = d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m417(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.ADMOB) {
            return m418(new int[]{-960684408, -386532194, 602403550, 1340359428}, 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.DT_FAIR_BID) {
            f281 = (f279 + 125) % 128;
            return m418(new int[]{-741903794, 1571967932, 1341513580, -18738732}, 7 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.HELIUM) {
            return m421((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6, true, 256 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0002\n\ufffe\u0001\ufffa�", 6 - Color.argb(0, 0, 0, 0)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.LEVEL_PLAY) {
            return m421(11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), false, TextUtils.indexOf((CharSequence) "", '0') + 259, "\b\u0003\ufff8\u0005\u0006\u0002\u0001￼\ufff6\u0006", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.MAX) {
            String strIntern = m421((ViewConfiguration.getPressedStateDuration() >> 16) + 8, true, (Process.myPid() >> 22) + 258, "￼\t\u0002\uffff\u0003\u0003\ufff4\u0001", 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
            f279 = (f281 + 91) % 128;
            return strIntern;
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.UNITY) {
            int i10 = f279 + 121;
            f281 = i10 % 128;
            return i10 % 2 != 0 ? m421(48 >> (ViewConfiguration.getMaximumFlingVelocity() >>> 29), true, ViewConfiguration.getMaximumDrawingCacheSize() + 5929, "\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007", 93 - (ViewConfiguration.getKeyRepeatTimeout() >>> 72)).intern() : m421(8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), false, 259 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0000\ufffb\u0006\u000b\ufff3\ufff6\u0005\u0007", 7 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
        }
        if (iSAdQualityMediationNetwork == ISAdQualityMediationNetwork.SELF_MEDIATED) {
            return m421(12 - (ViewConfiguration.getJumpTapTimeout() >> 16), true, Color.argb(0, 0, 0, 0) + 253, "�\f\ufff9\u0001￼�\u0005\ufffe\u0004�\u000b￼", 11 - ((Process.getThreadPriority(0) + 20) >> 6)).intern();
        }
        if (iSAdQualityMediationNetwork != ISAdQualityMediationNetwork.OTHER) {
            return "";
        }
        String strIntern2 = m418(new int[]{-1515472970, -1806589893, -962241985, -1827851283}, 5 - Color.argb(0, 0, 0, 0)).intern();
        f279 = (f281 + 5) % 128;
        return strIntern2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m418(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f282.clone();
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
}
