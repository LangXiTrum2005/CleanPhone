package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jg extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2671 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2672;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2673;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String f2674;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Context f2677;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2676 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<jb> f2675 = new HashSet();

    static {
        m2592();
        f2674 = m2595("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", new int[]{97, 20, 83, 0}, false).intern();
        f2672 = (f2671 + InterfaceC0435l1.d.b.f29107d) % 128;
    }

    public jg(Context context) {
        this.f2677 = context.getApplicationContext();
        m.m2964(f2674, m2595("\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{0, 30, 0, 0}, true).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m2595("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{30, 36, 26, 21}, false).intern());
        this.f2677.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m2592() {
        f2673 = new char[]{23, 'P', 'k', 'm', 'o', 'g', 'd', 'd', 'k', 'I', 'J', 's', 'j', 'b', 'c', 'b', 'h', 'p', 'j', 'A', 'H', 'r', 'J', 'C', 'j', 'k', 'n', 't', 'l', '\\', 'D', 'h', 'R', 'c', 'h', 'h', 'c', '^', 'e', 'h', 'i', 'i', 'h', 'p', 'v', 'k', '_', '^', 'a', 'd', '`', 'm', 129, 131, 133, 138, 134, 128, 'c', 'h', 131, 134, 'k', 'b', 131, 136, 16, 'E', 'n', 'p', 's', 'u', 'l', 'Y', '`', 219, 246, 254, 253, 246, 251, 256, 256, 251, 211, 284, 297, 284, 295, 278, 280, 289, 289, 290, 278, 300, 295, 'P', 172, 191, 200, 198, 195, 193, 178, 182, 189, 189, 191, 174, 174, 183, 183, 186, 194, 192, 190};
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private synchronized Set<jb> m2593() {
        HashSet hashSet;
        hashSet = new HashSet(this.f2675);
        f2672 = (f2671 + 83) % 128;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2594(jg jgVar, Context context) {
        boolean zM2597;
        int i10 = f2672 + 75;
        f2671 = i10 % 128;
        if (i10 % 2 == 0) {
            zM2597 = m2597(context);
            int i11 = 44 / 0;
        } else {
            zM2597 = m2597(context);
        }
        f2672 = (f2671 + 33) % 128;
        return zM2597;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2596(jg jgVar, boolean z10) {
        f2672 = (f2671 + 33) % 128;
        jgVar.m2600(z10);
        f2672 = (f2671 + 1) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ String m2599() {
        int i10 = f2671 + 89;
        f2672 = i10 % 128;
        if (i10 % 2 == 0) {
            return f2674;
        }
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2678 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int[] f2679 = {-724448563, -1475186955, 31537282, 3459283, 1118099667, 852283824, -48238268, 1840246745, -332629161, 1959590767, 2095354698, 2126307486, -1065884882, -1820001009, 229492181, 280709835, -1966532148, 1866106005};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f2680;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2607(int[] iArr, int i10) {
                String str;
                synchronized (a.f61) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2679.clone();
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
                try {
                    if (intent.getAction().equals(m2607(new int[]{1086570614, 826116098, 630830742, -1383210156, -18653300, -1974716750, 1637701841, 2047482792, -824448926, -2029624617, -427925512, 546763259, -1574460611, -1186552479, -556224923, 1112916038, 164477431, -1098971976}, 36 - (KeyEvent.getMaxKeyCode() >> 16)).intern())) {
                        f2680 = (f2678 + 51) % 128;
                        m.m2963(jg.m2599(), m2607(new int[]{917777694, -2106723031, 1561118943, 1311133310, 1637701841, 2047482792, 962303443, -766756031, -354594841, 1905593164, -1779309747, -418660520, -655990947, -1152423563}, 27 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
                        if (!intent.getBooleanExtra(m2607(new int[]{-1125935968, 1249862447, 242017098, -1692036439, 860524693, 445399521, -1558087794, 1268275275}, TextUtils.lastIndexOf("", '0', 0) + 15).intern(), false)) {
                            if (jg.m2594(jg.this, context)) {
                                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.4
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        jg.m2596(jg.this, true);
                                        jg.this.m2602();
                                    }
                                });
                                return;
                            } else {
                                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.2
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        jg.m2596(jg.this, false);
                                        jg.this.m2601();
                                    }
                                });
                                return;
                            }
                        }
                        m.m2963(jg.m2599(), m2607(new int[]{-442266565, -1477468127, 866867573, -363565666, -1754417672, 1723507767, 1653395651, 1721308045, -5945990, -1198019750, 376329044, -963897387, 155833122, -565028287, -875440264, -2016478856}, KeyEvent.normalizeMetaState(0) + 31).intern());
                        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jg.2.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                jg.this.m2601();
                                jg.m2596(jg.this, false);
                            }
                        });
                        int i10 = f2680 + InterfaceC0435l1.d.b.f29105b;
                        f2678 = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                    }
                } catch (Exception e10) {
                    kl.m2899(jg.m2599(), m2607(new int[]{-782577399, -660557632, 1590338146, -116338688, 535110339, -282130563, 587278631, 616150339, -2128297870, -717448626}, 'B' - AndroidCharacter.getMirror('0')).intern(), e10, false);
                }
            }
        });
        f2672 = (f2671 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2603(jb jbVar) {
        int i10 = f2671 + 87;
        f2672 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f2675.add(jbVar);
            throw null;
        }
        this.f2675.add(jbVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2605() {
        f2672 = (f2671 + 35) % 128;
        this.f2677.unregisterReceiver(this);
        f2672 = (f2671 + 91) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2600(boolean z10) {
        int i10 = f2671;
        this.f2676 = z10;
        f2672 = (i10 + 37) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2601() {
        int i10 = f2671 + 45;
        f2672 = i10 % 128;
        if (i10 % 2 != 0) {
            m2593().iterator();
            throw null;
        }
        Iterator<jb> it = m2593().iterator();
        f2671 = (f2672 + InterfaceC0435l1.d.b.f29112i) % 128;
        while (it.hasNext()) {
            f2671 = (f2672 + 73) % 128;
            it.next();
        }
        f2672 = (f2671 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2602() {
        f2671 = (f2672 + 93) % 128;
        Iterator<jb> it = m2593().iterator();
        while (it.hasNext()) {
            it.next().mo407();
            f2672 = (f2671 + InterfaceC0435l1.d.b.f29114k) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2604() {
        boolean z10;
        int i10 = f2672 + 17;
        int i11 = i10 % 128;
        f2671 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        z10 = this.f2676;
        f2672 = (i11 + 97) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2606(jb jbVar) {
        f2672 = (f2671 + 57) % 128;
        this.f2675.remove(jbVar);
        f2672 = (f2671 + 5) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2597(Context context) {
        f2672 = (f2671 + 85) % 128;
        NetworkInfo networkInfoM2598 = m2598(context);
        if (networkInfoM2598 == null || !networkInfoM2598.isConnected()) {
            return false;
        }
        String str = f2674;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2595("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", new int[]{66, 8, 0, 8}, true).intern());
        sb2.append(networkInfoM2598.getTypeName());
        sb2.append(m2595("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{74, 11, 146, 0}, true).intern());
        m.m2963(str, sb2.toString());
        f2672 = (f2671 + 15) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static NetworkInfo m2598(Context context) {
        int i10 = f2671;
        int i11 = i10 + 107;
        f2672 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (context != null) {
            return ((ConnectivityManager) context.getSystemService(m2595(null, new int[]{85, 12, 179, 10}, true).intern())).getActiveNetworkInfo();
        }
        int i12 = i10 + 25;
        f2672 = i12 % 128;
        if (i12 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2595(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2673, i10, cArr, 0, i11);
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
}
