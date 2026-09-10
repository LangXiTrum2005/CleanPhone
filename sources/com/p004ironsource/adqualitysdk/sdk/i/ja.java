package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ja {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2570 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2571 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2572 = 113;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f2573;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2574;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final int f2575;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final je f2576;

    public interface d {
        /* JADX INFO: renamed from: ﻐ */
        void mo380(List<jd> list);
    }

    public interface e {
        /* JADX INFO: renamed from: ﾇ */
        void mo377(int i2);
    }

    public ja(String str, String str2, je jeVar) {
        this(str, str2, jeVar, (byte) 0);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m2509(ja jaVar) {
        f2571 = (f2570 + 3) % 128;
        String strM2517 = jaVar.m2517();
        f2571 = (f2570 + 69) % 128;
        return strM2517;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ je m2511(ja jaVar) {
        int i2 = f2571;
        f2570 = (i2 + 117) % 128;
        je jeVar = jaVar.f2576;
        f2570 = (i2 + 73) % 128;
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m2512(ja jaVar) {
        f2571 = (f2570 + 105) % 128;
        return 10000;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static jd m2516(JSONObject jSONObject) {
        jd jdVar = new jd(jSONObject);
        f2571 = (f2570 + 55) % 128;
        return jdVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2521(final jd jdVar, final it itVar) {
        je.m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.3

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2590 = 1;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2591;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char[] f2592 = {'*', 63028, 33228, 6560, 37265, 10618, 41318, 14623, 45294, 18645, 49340, 22676, 53324, 'T', 30642, 61405, 26621, 57160, 22315, 53103, 18134, 48818, 14027, 44768, 9855, 40472, 5713, 36237, 1448, 32135, 62734, 28020, 58697, 23917, 54422, 19612, 50405, 15364, 46117, 11350, 41887, 7103, 37847, 2988, 33549, 64293, 29539, 60116, 25256, 56007, 21232, 51836, 16985, 47730, 12672, 43425, 8701, 39180, 1516, 29204, 60024, 25161, 55982, 21123, 51924, 17273, 47888, 13159, 43841, 9108, 39924, 5065, 34937};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f2593 = 6598787220456372186L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2524(int i2, int i3, char c2) {
                String str;
                synchronized (a.f68) {
                    try {
                        char[] cArr = new char[i2];
                        a.f69 = 0;
                        while (true) {
                            int i4 = a.f69;
                            if (i4 < i2) {
                                cArr[i4] = (char) ((((long) f2592[i3 + i4]) ^ (((long) i4) * f2593)) ^ ((long) c2));
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

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (ja.m2511(ja.this).m2559(ja.m2514(ja.this, m2524(-TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1)).intern())) <= ja.m2512(ja.this)) {
                    int i2 = f2591 + 115;
                    f2590 = i2 % 128;
                    if (i2 % 2 == 0) {
                        TextUtils.isEmpty(ja.m2510(ja.this, jdVar));
                        throw null;
                    }
                    String strM2510 = ja.m2510(ja.this, jdVar);
                    if (TextUtils.isEmpty(strM2510)) {
                        f2590 = (f2591 + 77) % 128;
                        n.m2838(ja.m2509(ja.this), m2524(11 - Process.getGidForName(""), 1 - View.combineMeasuredStates(0, 0), (char) (63095 - Gravity.getAbsoluteGravity(0, 0))).intern(), m2524(45 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 13, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), true);
                        int i3 = f2590 + 31;
                        f2591 = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 83 / 0;
                            return;
                        }
                        return;
                    }
                    try {
                        String string = jdVar.m2551().toString();
                        f2591 = (f2590 + 13) % 128;
                        n.m2831(ja.m2509(ja.this), m2524(12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 1, (char) (ExpandableListView.getPackedPositionGroup(0L) + 63095)).intern(), m2524((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 58, (char) (1455 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), string, true);
                        ja.m2511(ja.this).m2568(strM2510, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                it itVar2 = itVar;
                if (itVar2 != null) {
                    f2590 = (f2591 + 67) % 128;
                    s.m2922(itVar2);
                }
            }
        });
        int i2 = f2570 + 123;
        f2571 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private ja(String str, String str2, je jeVar, byte b2) {
        this.f2574 = str2;
        this.f2575 = 10000;
        this.f2573 = str;
        this.f2576 = jeVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m2510(ja jaVar, jd jdVar) {
        f2570 = (f2571 + 27) % 128;
        String strM2515 = jaVar.m2515(jdVar);
        f2571 = (f2570 + 59) % 128;
        return strM2515;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2514(ja jaVar, String str) {
        f2571 = (f2570 + 89) % 128;
        String strM2518 = jaVar.m2518(str);
        int i2 = f2571 + 67;
        f2570 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return strM2518;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2518(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2574);
        sb.append(str);
        String string = sb.toString();
        f2571 = (f2570 + 51) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2522(final jd jdVar) {
        je.m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ja.m2511(ja.this).m2567(ja.m2510(ja.this, jdVar));
            }
        });
        int i2 = f2570 + 23;
        f2571 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2515(jd jdVar) {
        int i2 = f2570 + 17;
        f2571 = i2 % 128;
        int i3 = i2 % 2;
        String strM2552 = jdVar.m2552();
        if (i3 != 0) {
            m2518(strM2552);
            throw null;
        }
        String strM2518 = m2518(strM2552);
        f2570 = (f2571 + 123) % 128;
        return strM2518;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2517() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2513(5 - TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, 203 - TextUtils.indexOf("", ""), "\u0007\r\u000bￆￎ￩\u0007\t\u000e\u000b\ufff9\u001a\u0015\u0018", false).intern());
        sb.append(this.f2573);
        String strC = a.C(sb, m2513((ViewConfiguration.getFadingEdgeLength() >> 16) + 1, 1 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 153, "\u0000", true));
        int i2 = f2570 + 109;
        f2571 = i2 % 128;
        if (i2 % 2 == 0) {
            return strC;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2519(final int i2, final d dVar) {
        je.m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2597 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int[] f2598 = {2114469033, -701801935, 1139412422, 1117300153, -1083517301, 546845775, 2121995300, -1722557606, -1026288556, 655273921, -1152333528, -249166585, 1027513480, 118010114, -185438119, 955159485, -892202635, 4139106};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2599;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﻐ */
            public final void mo642(Throwable th) {
                super.mo642(th);
                s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        dVar.mo380(new ArrayList());
                    }
                });
                int i3 = f2599 + 41;
                f2597 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final ArrayList arrayList = new ArrayList();
                for (String str : ja.m2511(ja.this).m2566(ja.m2514(ja.this, m2525(new int[]{1151739420, 1201243436}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern()), i2).values()) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        arrayList.add(new jd(jSONObject.getJSONObject(m2525(new int[]{-2039094168, 713968856, -293446750, 243139766}, TextUtils.indexOf((CharSequence) "", '0') + 9).intern()), jSONObject.optString(m2525(new int[]{942557588, -911721130}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3).intern())));
                    } catch (Exception unused) {
                        n.m2838(ja.m2509(ja.this), m2525(new int[]{321531419, -953259377, -28936939, 768449305, 824790181, -530358991}, 12 - TextUtils.indexOf("", "", 0)).intern(), a.n(new StringBuilder(), m2525(new int[]{-177340433, 1389150828, 1787241840, -1690170208, 436999526, -261860651, -997025699, -1343535973, -845402261, 951623830, -1697902839, 555541639, -1444894826, -1528441724, 1440912641, 672812732, -1039438322, 2136976290, -815342212, 847001957, -1228559492, 1227931435}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44), str), true);
                    }
                }
                s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4.1
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        dVar.mo380(arrayList);
                    }
                });
                int i3 = f2597 + 77;
                f2599 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 94 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2525(int[] iArr, int i3) {
                String str;
                synchronized (com.p004ironsource.adqualitysdk.sdk.i.d.f1586) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2598.clone();
                        com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = 0;
                        while (true) {
                            int i4 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
                            if (i4 < iArr.length) {
                                int i5 = iArr[i4];
                                char c2 = (char) (i5 >> 16);
                                cArr[0] = c2;
                                char c3 = (char) i5;
                                cArr[1] = c3;
                                char c4 = (char) (iArr[i4 + 1] >> 16);
                                cArr[2] = c4;
                                char c5 = (char) iArr[i4 + 1];
                                cArr[3] = c5;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = (c2 << 16) + c3;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = (c4 << 16) + c5;
                                com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                                for (int i6 = 0; i6 < 16; i6++) {
                                    int i7 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587 ^ iArr2[i6];
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i7;
                                    int iM1787 = com.p004ironsource.adqualitysdk.sdk.i.d.m1787(i7) ^ com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                                    int i8 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = iM1787;
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i8;
                                }
                                int i9 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                                int i10 = com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i10;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i9;
                                int i11 = i9 ^ iArr2[16];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i11;
                                int i12 = i10 ^ iArr2[17];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i12;
                                cArr[0] = (char) (i12 >>> 16);
                                cArr[1] = (char) i12;
                                cArr[2] = (char) (i11 >>> 16);
                                cArr[3] = (char) i11;
                                com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                                int i13 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
                                cArr2[i13 << 1] = cArr[0];
                                cArr2[(i13 << 1) + 1] = cArr[1];
                                cArr2[(i13 << 1) + 2] = cArr[2];
                                cArr2[(i13 << 1) + 3] = cArr[3];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = i13 + 2;
                            } else {
                                str = new String(cArr2, 0, i3);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            }
        });
        f2570 = (f2571 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2513(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f2572);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2520(final e eVar) {
        je.m2554().post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static short[] f2577 = null;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f2578 = {0};

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2579 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2580 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2581 = 38;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2582 = -1441564111;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2583 = -2012364511;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final int iM2559 = ja.m2511(ja.this).m2559(ja.m2514(ja.this, m2523((byte) ((-65) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) KeyEvent.normalizeMetaState(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 38, 2012364511 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1441564153 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()));
                s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.1
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        eVar.mo377(iM2559);
                    }
                });
                f2580 = (f2579 + 119) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2523(byte b2, short s, int i2, int i3, int i4) {
                String string;
                synchronized (k.f2833) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = f2581;
                        int i6 = i2 + i5;
                        int i7 = i6 == -1 ? 1 : 0;
                        if (i7 != 0) {
                            byte[] bArr = f2578;
                            if (bArr != null) {
                                i6 = (byte) (bArr[f2583 + i3] + i5);
                            } else {
                                i6 = (short) (f2577[f2583 + i3] + i5);
                            }
                        }
                        if (i6 > 0) {
                            k.f2836 = ((i3 + i6) - 2) + f2583 + i7;
                            k.f2834 = b2;
                            char c2 = (char) (i4 + f2582);
                            k.f2837 = c2;
                            sb.append(c2);
                            k.f2835 = k.f2837;
                            k.f2838 = 1;
                            while (k.f2838 < i6) {
                                byte[] bArr2 = f2578;
                                if (bArr2 != null) {
                                    int i8 = k.f2836;
                                    k.f2836 = i8 - 1;
                                    k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                                } else {
                                    short[] sArr = f2577;
                                    int i9 = k.f2836;
                                    k.f2836 = i9 - 1;
                                    k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                                }
                                sb.append(k.f2837);
                                k.f2835 = k.f2837;
                                k.f2838++;
                            }
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            }
        });
        f2571 = (f2570 + 19) % 128;
    }
}
