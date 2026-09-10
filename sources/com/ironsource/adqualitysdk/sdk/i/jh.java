package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jh {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2687 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2688 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2689 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String f2690;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jm f2691;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2692;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jj f2693;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<Runnable> f2694 = new ArrayList();

    static {
        m2614();
        f2690 = m2615("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{42, 70, 155, 37}, false).intern();
        f2689 = (f2688 + 119) % 128;
    }

    public jh(Context context, jj jjVar, String str) {
        this.f2691 = new jm(context, m2615("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 24, 175, 0}, false).intern(), m2615("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{24, 17, 0, 0}, true).intern());
        this.f2693 = jjVar;
        this.f2692 = str;
        ar.m468().mo498(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* JADX INFO: renamed from: ﾇ */
            public final void mo304() {
                ArrayList arrayList;
                synchronized (this) {
                    arrayList = new ArrayList(jh.m2616(jh.this));
                    jh.m2616(jh.this).clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized String m2608() {
        String str;
        int i10 = f2689;
        str = this.f2692;
        f2688 = (i10 + 17) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ jj m2609(jh jhVar) {
        int i10 = f2688 + 5;
        int i11 = i10 % 128;
        f2689 = i11;
        int i12 = i10 % 2;
        jj jjVar = jhVar.f2693;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i11 + 15;
        f2688 = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 57 / 0;
        }
        return jjVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ jm m2611(jh jhVar) {
        int i10 = f2688 + 91;
        f2689 = i10 % 128;
        int i11 = i10 % 2;
        jm jmVar = jhVar.f2691;
        if (i11 == 0) {
            int i12 = 35 / 0;
        }
        return jmVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2614() {
        f2687 = new char[]{145, 290, 280, 273, 275, 274, 272, 273, 278, 251, 251, 287, 257, 248, 274, 247, 255, 282, 280, 285, 288, 283, 275, 274, '1', 'c', 'L', '0', 'P', 'l', 'k', 'j', 'd', 'l', 'P', 'G', 'f', 'l', 'n', 'o', 'q', 'W', 'u', 252, 236, 238, 238, 229, 255, 232, 244, 276, 265, 257, 254, 254, 263, 270, 276, 244, 232, 255, 263, 270, 264, 249, 257, 268, 246, 252, 249, 241, 249, 254, 267, 266, 259, 226, 199, 195, 197, 218, 249, 263, 235, 200, 232, 266, 248, 249, 238, 221, 219, 242, 241, 214, 238, 233, 210, 233, 262, 237, 235, 259, 261, 272, 271, 269, 237, 203, 234, 232};
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m2616(jh jhVar) {
        int i10 = f2689 + 67;
        f2688 = i10 % 128;
        int i11 = i10 % 2;
        List<Runnable> list = jhVar.f2694;
        if (i11 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2610(final jl jlVar, final iz izVar) {
        String strMo2658 = jlVar.mo2658();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2608());
        final String strK = f2.k(m2615("\u0001", new int[]{41, 1, 128, 0}, true), strMo2658, sb2);
        final String strM2659 = jlVar.m2659();
        if (ar.m468().mo504()) {
            f2688 = (f2689 + 63) % 128;
            if (!ar.m468().mo494()) {
                f2688 = (f2689 + 49) % 128;
                if (this.f2691.m2674(strM2659) != null) {
                    return;
                }
            }
            ke.m2799(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char[] f2695 = {'U', 'S', '-', 'A', 'C', 'I', 'R', 'e', 'm', 'o', 't', 'D', 'B', 'c', 'r', 'y', 'p', 'd', ' ', 's', 'i', 'n', 'g', 'f', 'a', 'v', 'l', 'h', '/', 'E', 'V', 'W', 'X', 'Y', 'Z', '['};

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char f2696 = 6;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static int f2697 = 0;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static int f2698 = 1;

                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                private static String m2620(String str) throws JSONException {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(m2622(ImageFormat.getBitsPerPixel(0) + 4, "\t\u0013·", (byte) (View.resolveSize(0, 0) + 84)).intern());
                    if (TextUtils.isEmpty(strOptString)) {
                        int i10 = (f2697 + 19) % 128;
                        f2698 = i10;
                        int i11 = i10 + 93;
                        f2697 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return str;
                        }
                        throw null;
                    }
                    String strM2802 = ke.m2802(strOptString, jh.m2612(), jSONObject.optString(m2622(2 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0013\u001a", (byte) (55 - (Process.myPid() >> 22))).intern()), jSONObject.optString(m2622(AndroidCharacter.getMirror('0') - ',', "\u0012\u0019\u001c\b", (byte) (TextUtils.indexOf("", "") + 48)).intern()));
                    int i12 = f2697 + 119;
                    f2698 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 95 / 0;
                    }
                    return strM2802;
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private void m2623(final jl jlVar2, final iz izVar2) {
                    jh.m2609(jh.this).m2628().m2603(new jb() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.1.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.jb
                        /* JADX INFO: renamed from: ﻐ */
                        public final void mo407() {
                            jh.m2609(jh.this).m2628().m2606(this);
                            jh.m2613(jh.this, jlVar2, izVar2);
                        }
                    });
                    int i10 = f2697 + 65;
                    f2698 = i10 % 128;
                    if (i10 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    int i10 = f2698 + 65;
                    f2697 = i10 % 128;
                    if (i10 % 2 == 0) {
                        m2621(strK, jlVar, strM2659, izVar);
                    } else {
                        m2621(strK, jlVar, strM2659, izVar);
                        throw null;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                
                    if (r1.m2571().m2576() == 200) goto L22;
                 */
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private void m2621(java.lang.String r9, com.ironsource.adqualitysdk.sdk.i.jl r10, java.lang.String r11, com.ironsource.adqualitysdk.sdk.i.iz r12) {
                    /*
                        Method dump skipped, instruction units count: 423
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jh.AnonymousClass1.m2621(java.lang.String, com.ironsource.adqualitysdk.sdk.i.jl, java.lang.String, com.ironsource.adqualitysdk.sdk.i.iz):void");
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2622(int i10, String str, byte b10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (j.f2647) {
                        try {
                            char[] cArr2 = f2695;
                            char c4 = f2696;
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
            });
            f2689 = (f2688 + 15) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2612() {
        int i10 = f2689;
        int i11 = i10 + 41;
        f2688 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = f2690;
        int i12 = i10 + InterfaceC0435l1.d.b.f29105b;
        f2688 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 87 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2615(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2687, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m2617(jl jlVar) {
        int i10 = f2689 + 47;
        f2688 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f2691.m2674(jlVar.m2659());
            throw null;
        }
        if (this.f2691.m2674(jlVar.m2659()) == null) {
            return false;
        }
        int i11 = f2688 + 121;
        f2689 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 67 / 0;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        r3 = (com.ironsource.adqualitysdk.sdk.i.jh.f2688 + 17) % 128;
        com.ironsource.adqualitysdk.sdk.i.jh.f2689 = r3;
        com.ironsource.adqualitysdk.sdk.i.jh.f2688 = (r3 + 123) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r0 = new com.ironsource.adqualitysdk.sdk.i.jl.c(r4, r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L11;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m2619(java.lang.String r4, java.lang.String r5, com.ironsource.adqualitysdk.sdk.i.iz r6) {
        /*
            r3 = this;
            com.ironsource.adqualitysdk.sdk.i.jl$d r0 = new com.ironsource.adqualitysdk.sdk.i.jl$d
            r0.<init>(r4, r5)
            com.ironsource.adqualitysdk.sdk.i.ar r1 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            com.ironsource.adqualitysdk.sdk.i.aq r1 = r1.mo482()
            boolean r1 = r1.m466()
            if (r1 == 0) goto L5e
            int r0 = com.ironsource.adqualitysdk.sdk.i.jh.f2689
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.jh.f2688 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L36
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            com.ironsource.adqualitysdk.sdk.i.aq r0 = r0.mo482()
            java.lang.String r0 = r0.m465(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 72
            int r2 = r2 / 0
            if (r1 == 0) goto L58
            goto L48
        L36:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m468()
            com.ironsource.adqualitysdk.sdk.i.aq r0 = r0.mo482()
            java.lang.String r0 = r0.m465(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L58
        L48:
            int r3 = com.ironsource.adqualitysdk.sdk.i.jh.f2688
            int r3 = r3 + 17
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jh.f2689 = r3
            int r3 = r3 + 123
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.jh.f2688 = r3
            r3 = 0
            return r3
        L58:
            com.ironsource.adqualitysdk.sdk.i.jl$c r1 = new com.ironsource.adqualitysdk.sdk.i.jl$c
            r1.<init>(r4, r5, r0)
            r0 = r1
        L5e:
            java.lang.String r3 = r3.m2618(r0, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jh.m2619(java.lang.String, java.lang.String, com.ironsource.adqualitysdk.sdk.i.iz):java.lang.String");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2613(jh jhVar, jl jlVar, iz izVar) {
        int i10 = f2689 + 117;
        f2688 = i10 % 128;
        int i11 = i10 % 2;
        jhVar.m2610(jlVar, izVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2618(final jl jlVar, final iz izVar) {
        boolean z10;
        if (TextUtils.isEmpty(jlVar.m2663()) || TextUtils.isEmpty(jlVar.m2662())) {
            return null;
        }
        String strM2659 = jlVar.m2659();
        synchronized (this) {
            try {
                if (ar.m468().mo489()) {
                    z10 = true;
                } else {
                    this.f2694.add(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jh.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            jh.m2613(jh.this, jlVar, izVar);
                        }
                    });
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            m2610(jlVar, izVar);
        }
        return this.f2691.m2674(strM2659);
    }
}
