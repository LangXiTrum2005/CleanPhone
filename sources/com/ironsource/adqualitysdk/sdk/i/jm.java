package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class jm {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2790 = 44956;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2791 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2792 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler f2793 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2794 = 33407;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2795 = 28054;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2796 = 49980;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private io f2797;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        void mo2681();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        void mo2682(String str);
    }

    public jm(Context context, String str, String str2) {
        this.f2797 = new io(context, str, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2666(jm jmVar, d dVar) {
        int i10 = f2791 + 27;
        f2792 = i10 % 128;
        int i11 = i10 % 2;
        jmVar.m2668(dVar);
        if (i11 == 0) {
            int i12 = 50 / 0;
        }
        f2792 = (f2791 + 81) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2667(String str) {
        String strM = f2.m(d5.u.i(str), m2670("᷾ổ籭褜⯇컌\ue3dd⽹\uebdf佁ꁟ俽", 11 - (ViewConfiguration.getTapTimeout() >> 16)));
        f2792 = (f2791 + InterfaceC0435l1.d.b.f29112i) % 128;
        return strM;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Handler m2669() {
        Handler handler;
        synchronized (jm.class) {
            try {
                if (f2793 == null) {
                    HandlerThread handlerThread = new HandlerThread(m2670("ց렞\udb73㞻虥≅ﶺ\ue6da鶏鏉䎢᠓⧭\u2e60ꁟ俽", TextUtils.indexOf("", "", 0, 0) + 15).intern());
                    handlerThread.start();
                    f2793 = new Handler(handlerThread.getLooper());
                }
                handler = f2793;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2676(String str) {
        f2792 = (f2791 + 23) % 128;
        this.f2797.m2526(str);
        f2792 = (f2791 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final HashMap<String, String> m2679(String str, int i10) {
        int i11 = f2792 + 73;
        f2791 = i11 % 128;
        int i12 = i11 % 2;
        io ioVar = this.f2797;
        if (i12 == 0) {
            return ioVar.m2525(str, i10);
        }
        ioVar.m2525(str, i10);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m2671(String str) {
        f2792 = (f2791 + 13) % 128;
        int iM2528 = this.f2797.m2528(str);
        f2792 = (f2791 + 65) % 128;
        return iM2528;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2677(String str, String str2) {
        int i10 = f2791 + 1;
        f2792 = i10 % 128;
        if (i10 % 2 == 0) {
            m2680(str, str2);
            m2680(m2667(str), Long.toString(ke.m2803()));
            int i11 = 8 / 0;
        } else {
            m2680(str, str2);
            m2680(m2667(str), Long.toString(ke.m2803()));
        }
        int i12 = f2792 + 99;
        f2791 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2680(String str, String str2) {
        f2792 = (f2791 + 41) % 128;
        this.f2797.m2529(str, str2);
        int i10 = f2792 + 83;
        f2791 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 92 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2678(final String str, final String str2, final d dVar) {
        m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                jm.this.m2677(str, str2);
                jm.m2666(jm.this, dVar);
            }
        });
        f2792 = (f2791 + InterfaceC0435l1.d.b.f29109f) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2670(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2795)) ^ ((c5 >>> 5) + f2790)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2794) ^ ((c10 + i12) ^ ((c10 << 4) + f2796))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2674(String str) {
        f2791 = (f2792 + 45) % 128;
        String strM2527 = this.f2797.m2527(str);
        f2791 = (f2792 + InterfaceC0435l1.d.b.f29107d) % 128;
        return strM2527;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2675(final String str, final e eVar) {
        m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                final String strM2674 = jm.this.m2674(str);
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.1.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        eVar.mo2682(strM2674);
                    }
                });
            }
        });
        int i10 = f2791 + 67;
        f2792 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2672(String str, String str2) {
        f2792 = (f2791 + 17) % 128;
        m2673(str, str2, null);
        f2791 = (f2792 + 97) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2673(final String str, final String str2, final d dVar) {
        m2669().post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jm.5
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                jm.this.m2680(str, str2);
                jm.m2666(jm.this, dVar);
            }
        });
        int i10 = f2791 + InterfaceC0435l1.d.b.f29105b;
        f2792 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2668(d dVar) {
        int i10 = f2792 + 125;
        f2791 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (dVar != null) {
            p.m2998(new je(dVar) { // from class: com.ironsource.adqualitysdk.sdk.i.jm.2
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                }
            });
            f2791 = (f2792 + 83) % 128;
        }
    }
}
