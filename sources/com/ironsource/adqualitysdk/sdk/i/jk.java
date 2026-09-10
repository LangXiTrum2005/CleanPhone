package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jk {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2742 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2743 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2744 = 4863;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2745;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2746;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final jm f2747;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final String f2748;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f2749;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f2750;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        /* JADX INFO: renamed from: ﾇ */
        void mo398(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        /* JADX INFO: renamed from: ﾒ */
        void mo401(List<jn> list);
    }

    public jk(String str, String str2, jm jmVar) {
        this(str, str2, jmVar, (byte) 0);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m2639(jk jkVar) {
        f2745 = (f2743 + 31) % 128;
        String strM2636 = jkVar.m2636();
        int i10 = f2743 + 21;
        f2745 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM2636;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ jm m2642(jk jkVar) {
        int i10 = f2745 + 95;
        f2743 = i10 % 128;
        int i11 = i10 % 2;
        jm jmVar = jkVar.f2747;
        if (i11 != 0) {
            return jmVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m2643(jk jkVar) {
        f2745 = (f2743 + 13) % 128;
        return 10000;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m2644(jk jkVar, String str) {
        f2745 = (f2743 + 95) % 128;
        String strM2641 = jkVar.m2641(str);
        f2743 = (f2745 + 121) % 128;
        return strM2641;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2646(final b bVar) {
        jm.m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.2

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2753 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2754 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f2755 = -7209418036763202519L;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2650(String str, int i10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2127) {
                    try {
                        char[] cArrM2229 = g.m2229(f2755, cArr, i10);
                        g.f2129 = 4;
                        while (true) {
                            int i11 = g.f2129;
                            if (i11 < cArrM2229.length) {
                                int i12 = i11 - 4;
                                g.f2128 = i12;
                                cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f2755));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                final int iM2671 = jk.m2642(jk.this).m2671(jk.m2644(jk.this, m2650("긺긐턃Ძ꜡", KeyEvent.getDeadChar(0, 0) + 1).intern()));
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        bVar.mo398(iM2671);
                    }
                });
                f2753 = (f2754 + InterfaceC0435l1.d.b.f29105b) % 128;
            }
        });
        f2743 = (f2745 + 25) % 128;
    }

    private jk(String str, String str2, jm jmVar, byte b10) {
        this.f2749 = str2;
        this.f2750 = 10000;
        this.f2748 = str;
        this.f2747 = jmVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m2636() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2637((char) (28569 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0000\u0000\u0000\u0000", "䪙ᗷ餉졯", "쫄뙗\ue981㴎ﷲ佪貭\u2004\ue76a\uf193疱倀ꃏ᪔", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
        sb2.append(this.f2748);
        String strM = f2.m(sb2, m2637((char) (40853 - (ViewConfiguration.getPressedStateDuration() >> 16)), "\u0000\u0000\u0000\u0000", "劻⟔闘枟", "㔐", (-668478382) - (ViewConfiguration.getTouchSlop() >> 8)));
        int i10 = f2745 + 17;
        f2743 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m2640(jk jkVar, jn jnVar) {
        f2745 = (f2743 + 27) % 128;
        String strM2645 = jkVar.m2645(jnVar);
        int i10 = f2745 + 23;
        f2743 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM2645;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2645(jn jnVar) {
        f2745 = (f2743 + 57) % 128;
        String strM2641 = m2641(jnVar.m2686());
        int i10 = f2745 + 89;
        f2743 = i10 % 128;
        if (i10 % 2 != 0) {
            return strM2641;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2647(final int i10, final c cVar) {
        jm.m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f2766 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2767;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int[] f2768 = {-701378621, 51127220, -1854204131, -457603715, -356722085, -895065645, -1976854722, 2081268625, 1664203258, -945108597, -171207155, -1975572851, -141354845, -890066747, 234644505, -1916329099, 1898763983, 1399092860};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2652(int[] iArr, int i11) {
                String str;
                synchronized (a.f61) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2768.clone();
                        a.f58 = 0;
                        while (true) {
                            int i12 = a.f58;
                            if (i12 < iArr.length) {
                                int i13 = iArr[i12];
                                char c4 = (char) (i13 >> 16);
                                cArr[0] = c4;
                                char c5 = (char) i13;
                                cArr[1] = c5;
                                char c10 = (char) (iArr[i12 + 1] >> 16);
                                cArr[2] = c10;
                                char c11 = (char) iArr[i12 + 1];
                                cArr[3] = c11;
                                a.f59 = (c4 << 16) + c5;
                                a.f60 = (c10 << 16) + c11;
                                a.m199(iArr2);
                                for (int i14 = 0; i14 < 16; i14++) {
                                    int i15 = a.f59 ^ iArr2[i14];
                                    a.f59 = i15;
                                    int iM200 = a.m200(i15) ^ a.f60;
                                    int i16 = a.f59;
                                    a.f59 = iM200;
                                    a.f60 = i16;
                                }
                                int i17 = a.f59;
                                int i18 = a.f60;
                                a.f59 = i18;
                                a.f60 = i17;
                                int i19 = i17 ^ iArr2[16];
                                a.f60 = i19;
                                int i20 = i18 ^ iArr2[17];
                                a.f59 = i20;
                                cArr[0] = (char) (i20 >>> 16);
                                cArr[1] = (char) i20;
                                cArr[2] = (char) (i19 >>> 16);
                                cArr[3] = (char) i19;
                                a.m199(iArr2);
                                int i21 = a.f58;
                                cArr2[i21 << 1] = cArr[0];
                                cArr2[(i21 << 1) + 1] = cArr[1];
                                cArr2[(i21 << 1) + 2] = cArr[2];
                                cArr2[(i21 << 1) + 3] = cArr[3];
                                a.f58 = i21 + 2;
                            } else {
                                str = new String(cArr2, 0, i11);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ﻐ */
            public final void mo654(Throwable th2) {
                super.mo654(th2);
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        cVar.mo401(new ArrayList());
                    }
                });
                f2767 = (f2766 + 1) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                final ArrayList arrayList = new ArrayList();
                for (String str : jk.m2642(jk.this).m2679(jk.m2644(jk.this, m2652(new int[]{-1156032747, 1931588609}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern()), i10).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        arrayList.add(new jn(jSONObject.getJSONObject(m2652(new int[]{-1049145586, 1722662073, -1358650678, -365617964}, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7).intern()), jSONObject.optString(m2652(new int[]{1992483484, -1010810066}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4).intern())));
                        f2767 = (f2766 + 31) % 128;
                    } catch (Exception unused) {
                        m.m2970(jk.m2639(jk.this), m2652(new int[]{969310401, -1198912187, -146951497, -1642809952, 2012184290, 1578198339}, KeyEvent.keyCodeFromString("") + 12).intern(), f2.k(m2652(new int[]{-909729276, 1091674575, 96175690, -1294665438, -1427081089, -524714779, -1339859938, -280476030, 816289866, -1936470675, 877408850, 1586393204, -1962440324, -812414851, 1677493388, 1604959400, -619281872, -1070346633, -544346021, -362669896, 399858423, 271027824}, 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), str, new StringBuilder()), true);
                    }
                }
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        cVar.mo401(arrayList);
                    }
                });
                f2766 = (f2767 + 61) % 128;
            }
        });
        f2745 = (f2743 + 115) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jn m2638(JSONObject jSONObject) {
        jn jnVar = new jn(jSONObject);
        f2743 = (f2745 + InterfaceC0435l1.d.b.f29112i) % 128;
        return jnVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2649(final jn jnVar, final je jeVar) {
        jm.m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.4

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2760 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f2761 = {-1823185543, -1623678825, 1684007440, 1149494897, -1282489423, 1729320521, 1814430256, -96803415, -1042097644, -288940929, -265903868, 1988718659, -1889769846, 1037748668, -477183534, 1851340500, 385447100, -710070860};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2762;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2651(int[] iArr, int i10) {
                String str;
                synchronized (a.f61) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2761.clone();
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

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (jk.m2642(jk.this).m2671(jk.m2644(jk.this, m2651(new int[]{1769530907, 497129777}, 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern())) <= jk.m2643(jk.this)) {
                    f2762 = (f2760 + 33) % 128;
                    String strM2640 = jk.m2640(jk.this, jnVar);
                    if (TextUtils.isEmpty(strM2640)) {
                        f2760 = (f2762 + 85) % 128;
                        m.m2970(jk.m2639(jk.this), m2651(new int[]{-1145353760, 1762719080, -942874224, 2088699126, -1056495397, -304839697}, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11).intern(), m2651(new int[]{-1028681490, 18509972, 1746963123, 1000103387, 477956011, -1848412224, 28616537, -466206935, -598382724, 759697782, 1034178519, 413467555, 462112449, -1649376500, -345531010, -1045335268, 571267922, 53125147, 1343046483, -142776625, -482947433, -295144508, 1559936063, 211315707}, ExpandableListView.getPackedPositionChild(0L) + 46).intern(), true);
                        return;
                    }
                    try {
                        String string = jnVar.m2685().toString();
                        f2762 = (f2760 + 83) % 128;
                        m.m2976(jk.m2639(jk.this), m2651(new int[]{-1145353760, 1762719080, -942874224, 2088699126, -1056495397, -304839697}, 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m2651(new int[]{-1145353760, 1762719080, 1797339374, 196854865, 1692784177, -1534997201, 719889550, -648418792}, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 14).intern(), string, true);
                        jk.m2642(jk.this).m2680(strM2640, string);
                        f2762 = (f2760 + 3) % 128;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                je jeVar2 = jeVar;
                if (jeVar2 != null) {
                    int i10 = f2762 + 67;
                    f2760 = i10 % 128;
                    int i11 = i10 % 2;
                    p.m2998(jeVar2);
                    if (i11 == 0) {
                        throw null;
                    }
                }
                f2762 = (f2760 + 63) % 128;
            }
        });
        f2743 = (f2745 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2641(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2749);
        sb2.append(str);
        String string = sb2.toString();
        f2743 = (f2745 + 91) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2648(final jn jnVar) {
        jm.m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jk.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                jk.m2642(jk.this).m2676(jk.m2640(jk.this, jnVar));
            }
        });
        f2743 = (f2745 + 77) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2637(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2746) ^ ((long) f2742)) ^ ((long) f2744));
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
