package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ix {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2525 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2526 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2527 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String f2528;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2529;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private je f2530;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private iw f2531;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2532 = new ArrayList();

    static {
        m2480();
        f2528 = m2479(69 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Process.getGidForName("") + 71, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 128, "ￗ\ufff6\u0014\u0013ￛￎ\u001a\u0013\ufff6\u0015￠\ufff2\uffdd ￛ￩\f\uffde\uffde\f\u0019ￚ\u0015\n\u0019 \u0017\u001b\uffd8ￗ\u0015ￔ\ufff7\u0019ￗ\u001d\uffd8\u000b\fￜ%\u001b\u000f\f\t\f\u001a\u001b%ￜ\f\n\u001c\u0019\u0010\ufffb \u0010\ufff5\u001b\uffef\f\ufffe\u0016\u0019\u0013\u000bￒￔￋ", false).intern();
        int i2 = f2526 + 67;
        f2527 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public ix(Context context, iw iwVar, String str) {
        this.f2530 = new je(context, m2479(10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, Color.rgb(0, 0, 0) + 16777353, "ￍ\n\u0002\u0000\u0001\u0004\u0002\u0000\u0011\u0013\u0001\u0003\u0004\u0013\u000e\f\u0004\u0011ￍ\u0001\u0003ￍ\u0015\n", true).intern(), m2479(9 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - ExpandableListView.getPackedPositionGroup(0L), 136 - (KeyEvent.getMaxKeyCode() >> 16), "\u0005\u0003\u0012\u0005\u0014ￍￔ\u0004\u0002\u0013\u000f\u000f\r\f\u0001ￍ\u0013", false).intern());
        this.f2531 = iwVar;
        this.f2529 = str;
        as.m467().mo495(new at() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.at
            /* JADX INFO: renamed from: ﾒ */
            public final void mo319() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(ix.m2484(ix.this));
                    ix.m2484(ix.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ iw m2478(ix ixVar) {
        int i2 = f2527 + 41;
        f2526 = i2 % 128;
        int i3 = i2 % 2;
        iw iwVar = ixVar.f2531;
        if (i3 == 0) {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2480() {
        f2525 = 40;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ je m2481(ix ixVar) {
        int i2 = (f2527 + 5) % 128;
        f2526 = i2;
        je jeVar = ixVar.f2530;
        int i3 = i2 + 65;
        f2527 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m2484(ix ixVar) {
        int i2 = f2526;
        int i3 = i2 + 23;
        f2527 = i3 % 128;
        int i4 = i3 % 2;
        List<Runnable> list = ixVar.f2532;
        if (i4 == 0) {
            int i5 = 63 / 0;
        }
        int i6 = i2 + 95;
        f2527 = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2485(ix ixVar, jb jbVar, ip ipVar) {
        int i2 = f2527 + 113;
        f2526 = i2 % 128;
        int i3 = i2 % 2;
        ixVar.m2486(jbVar, ipVar);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2479(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f2525);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2482() {
        int i2 = (f2527 + 13) % 128;
        f2526 = i2;
        String str = f2528;
        f2527 = (i2 + 81) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized String m2483() {
        String str;
        int i2 = f2527 + 3;
        int i3 = i2 % 128;
        f2526 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        str = this.f2529;
        f2527 = (i3 + 71) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2486(final jb jbVar, final ip ipVar) {
        String strM2532 = jbVar.m2532();
        StringBuilder sb = new StringBuilder();
        sb.append(m2483());
        final String strN = a.n(sb, m2479(1 - (ViewConfiguration.getPressedStateDuration() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 87 - TextUtils.indexOf("", "", 0), "\u0000", true), strM2532);
        final String strM2528 = jbVar.m2528();
        if (!as.m467().mo492()) {
            return;
        }
        if (!as.m467().mo499()) {
            int i2 = f2526 + 81;
            f2527 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2530.m2562(strM2528);
                throw null;
            }
            if (this.f2530.m2562(strM2528) != null) {
                return;
            }
        }
        ju.m2663(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.4

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f2534 = 0;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2535 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char f2536 = 6;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char[] f2537 = {'U', 'S', '-', 'A', 'C', 'I', 'R', 'e', 'm', 'o', 't', 'D', 'B', 'c', 'r', 'y', 'p', 'd', ' ', 's', 'i', 'n', 'g', 'f', 'a', 'v', 'l', 'h', IOUtils.DIR_SEPARATOR_UNIX, 'E', 'V', 'W', 'X', 'Y', 'Z', AbstractJsonLexerKt.BEGIN_LIST};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2490(String str) throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString(m2489((byte) (TextUtils.getTrimmedLength("") + 107), "\t\u0013Î", KeyEvent.keyCodeFromString("") + 3).intern());
                if (!TextUtils.isEmpty(strOptString)) {
                    return ju.m2668(strOptString, ix.m2482(), jSONObject.optString(m2489((byte) (79 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\u0013\u001a", 2 - View.getDefaultSize(0, 0)).intern()), jSONObject.optString(m2489((byte) (30 - View.MeasureSpec.getSize(0)), "\u0012\u0019\u001c\b", Color.green(0) + 4).intern()));
                }
                int i3 = f2534 + 29;
                f2535 = i3 % 128;
                if (i3 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m2491(final jb jbVar2, final ip ipVar2) {
                ix.m2478(ix.this).m2471().m2503(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.4.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo376() {
                        ix.m2478(ix.this).m2471().m2506(this);
                        ix.m2485(ix.this, jbVar2, ipVar2);
                    }
                });
                int i3 = f2534 + 63;
                f2535 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                f2535 = (f2534 + 109) % 128;
                m2492(strN, jbVar, strM2528, ipVar);
                f2534 = (f2535 + 15) % 128;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
            
                if (r2.m2449().m2450() == 200) goto L18;
             */
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void m2492(java.lang.String r7, com.p004ironsource.adqualitysdk.sdk.i.jb r8, java.lang.String r9, com.p004ironsource.adqualitysdk.sdk.i.ip r10) {
                /*
                    Method dump skipped, instruction units count: 431
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ix.AnonymousClass4.m2492(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jb, java.lang.String, com.ironsource.adqualitysdk.sdk.i.ip):void");
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2489(byte b2, String str, int i3) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (i.f2343) {
                    try {
                        char[] cArr2 = f2537;
                        char c2 = f2536;
                        char[] cArr3 = new char[i3];
                        if (i3 % 2 != 0) {
                            i3--;
                            cArr3[i3] = (char) (cArr[i3] - b2);
                        }
                        if (i3 > 1) {
                            i.f2348 = 0;
                            while (true) {
                                int i4 = i.f2348;
                                if (i4 >= i3) {
                                    break;
                                }
                                i.f2347 = cArr[i4];
                                i.f2345 = cArr[i.f2348 + 1];
                                if (i.f2347 == i.f2345) {
                                    cArr3[i.f2348] = (char) (i.f2347 - b2);
                                    cArr3[i.f2348 + 1] = (char) (i.f2345 - b2);
                                } else {
                                    i.f2346 = i.f2347 / c2;
                                    i.f2342 = i.f2347 % c2;
                                    i.f2344 = i.f2345 / c2;
                                    i.f2341 = i.f2345 % c2;
                                    if (i.f2342 == i.f2341) {
                                        i.f2346 = a.b(i.f2346, c2, 1, c2);
                                        i.f2344 = a.b(i.f2344, c2, 1, c2);
                                        int i5 = (i.f2346 * c2) + i.f2342;
                                        int i6 = (i.f2344 * c2) + i.f2341;
                                        int i7 = i.f2348;
                                        cArr3[i7] = cArr2[i5];
                                        cArr3[i7 + 1] = cArr2[i6];
                                    } else if (i.f2346 == i.f2344) {
                                        i.f2342 = a.b(i.f2342, c2, 1, c2);
                                        i.f2341 = a.b(i.f2341, c2, 1, c2);
                                        int i8 = (i.f2346 * c2) + i.f2342;
                                        int i9 = (i.f2344 * c2) + i.f2341;
                                        int i10 = i.f2348;
                                        cArr3[i10] = cArr2[i8];
                                        cArr3[i10 + 1] = cArr2[i9];
                                    } else {
                                        int i11 = (i.f2346 * c2) + i.f2341;
                                        int i12 = (i.f2344 * c2) + i.f2342;
                                        int i13 = i.f2348;
                                        cArr3[i13] = cArr2[i11];
                                        cArr3[i13 + 1] = cArr2[i12];
                                    }
                                }
                                i.f2348 += 2;
                            }
                        }
                        str2 = new String(cArr3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        });
        f2526 = (f2527 + 33) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2488(String str, String str2, ip ipVar) {
        String strM2487 = m2487(new jb.b(str, str2), ipVar);
        int i2 = f2526 + 101;
        f2527 = i2 % 128;
        if (i2 % 2 != 0) {
            return strM2487;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2487(final jb jbVar, final ip ipVar) {
        boolean z2;
        if (TextUtils.isEmpty(jbVar.m2529()) || TextUtils.isEmpty(jbVar.m2531())) {
            return null;
        }
        String strM2528 = jbVar.m2528();
        synchronized (this) {
            try {
                if (as.m467().mo487()) {
                    z2 = true;
                } else {
                    this.f2532.add(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ix.5
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            ix.m2485(ix.this, jbVar, ipVar);
                        }
                    });
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            m2486(jbVar, ipVar);
        }
        return this.f2530.m2562(strM2528);
    }
}
