package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class iz extends BroadcastReceiver {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2551 = 1;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2552;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int[] f2553;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String f2554;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Context f2556;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2557 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<ir> f2555 = new HashSet();

    static {
        m2494();
        f2554 = m2497(new int[]{1629707547, 657328492, 1858167539, -1219310141, -1651965719, 1346697530, -1156818960, -1995905252, -1348457785, 1815394219}, 20 - (Process.myPid() >> 22)).intern();
        int i2 = f2552 + 67;
        f2551 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public iz(Context context) {
        this.f2556 = context.getApplicationContext();
        n.m2826(f2554, m2497(new int[]{1895305721, 1332865827, -1545500110, 243575598, -1149866182, -1645084613, 2145995328, -1912767410, -44128612, -1034827097, -1985035452, -1897914413, 1968464475, -1872792716, 1595739492, 1366971894}, (Process.myTid() >> 22) + 30).intern());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(m2497(new int[]{-1072575139, -379969675, 1534352560, -567546495, -8009819, -1266244966, 702640470, -1164157678, -164169340, 1142584323, -1029995911, 2130581777, 2059563727, 183758623, 637897614, -1002058098, 180745230, 920622199}, 36 - (Process.myTid() >> 22)).intern());
        this.f2556.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Set<ir> m2493() {
        HashSet hashSet = new HashSet(this.f2555);
        int i2 = f2552 + 89;
        f2551 = i2 % 128;
        if (i2 % 2 != 0) {
            return hashSet;
        }
        int i3 = 68 / 0;
        return hashSet;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m2494() {
        f2553 = new int[]{2122278966, -1028962310, -1551100526, 1750173566, -367908708, 1556435544, -1104251555, 1576056311, -877537701, 831993725, 889648699, 1487514202, -1075654584, -264053196, -1240711573, -1145202918, 145654545, -1923854875};
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m2496() {
        int i2 = f2552 + 59;
        f2551 = i2 % 128;
        if (i2 % 2 != 0) {
            return f2554;
        }
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f2558 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int[] f2559 = {2005493371, -841400590, 148556833, -27146506, -979854212, -204338742, -634901745, -435974402, -1622115050, 1237570580, 1516339807, 1823527510, -623880020, 292068933, -1174726423, -1703220422, -24503458, -804044852};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2560;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2508(int[] iArr, int i2) {
                String str;
                synchronized (d.f1586) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f2559.clone();
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
            public final void mo276() {
                int i2 = f2560 + 63;
                f2558 = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        if (!intent.getAction().equals(m2508(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, 74 / (ViewConfiguration.getPressedStateDuration() >> 107)).intern())) {
                            return;
                        }
                    } else if (!intent.getAction().equals(m2508(new int[]{-99749323, 1845556534, 1803633288, 1179482042, -1184329417, -567585717, -133392581, 103764985, -2133062953, -1239390194, -2034173888, 1398933603, -33327527, 955762279, -1190007795, -752253118, -133220279, 1932281308}, (ViewConfiguration.getPressedStateDuration() >> 16) + 36).intern())) {
                        return;
                    }
                    n.m2844(iz.m2496(), m2508(new int[]{-525164393, 744399271, 261125374, -2132164689, -133392581, 103764985, -945656816, -1195558763, 957672357, -354227765, -1152515314, -1011681112, 1755163892, -1620884688}, Color.green(0) + 27).intern());
                    if (!intent.getBooleanExtra(m2508(new int[]{-2016248418, -731969610, 1737838229, -700703233, -161254375, -556305078, -2135494626, -1708897537}, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), false)) {
                        if (iz.m2499(iz.this, context)) {
                            s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.4
                                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    iz.m2498(iz.this, true);
                                    iz.this.m2505();
                                }
                            });
                            return;
                        } else {
                            s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.1
                                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    iz.m2498(iz.this, false);
                                    iz.this.m2502();
                                }
                            });
                            return;
                        }
                    }
                    n.m2844(iz.m2496(), m2508(new int[]{1299578726, -1743615335, 1864001520, -1117432411, 959356649, -144690878, 191461418, -661585442, 1132738218, 1886173234, 1952749992, 1394423201, -1818828902, -844891427, 2045928282, 315570959}, ImageFormat.getBitsPerPixel(0) + 32).intern());
                    s.m2922(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.iz.2.5
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            iz.this.m2502();
                            iz.m2498(iz.this, false);
                        }
                    });
                    int i3 = f2558 + 85;
                    f2560 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 52 / 0;
                    }
                } catch (Exception e2) {
                    kb.m2752(iz.m2496(), m2508(new int[]{-972276052, 1405703199, -1817963556, 341685493, 716079971, 617782936, 382410257, 1806188021, 1407827197, -843576403}, 18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), (Throwable) e2, false);
                }
            }
        });
        f2551 = (f2552 + 75) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2503(ir irVar) {
        int i2 = f2552 + 123;
        f2551 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f2555.add(irVar);
            throw null;
        }
        this.f2555.add(irVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2504() {
        f2552 = (f2551 + 89) % 128;
        this.f2556.unregisterReceiver(this);
        f2551 = (f2552 + 81) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2505() {
        Iterator<ir> it = m2493().iterator();
        while (it.hasNext()) {
            it.next().mo376();
            f2551 = (f2552 + 57) % 128;
        }
        f2552 = (f2551 + 61) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2506(ir irVar) {
        f2551 = (f2552 + 103) % 128;
        this.f2555.remove(irVar);
        f2551 = (f2552 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2495(Context context) {
        f2551 = (f2552 + 97) % 128;
        NetworkInfo networkInfoM2501 = m2501(context);
        if (networkInfoM2501 != null) {
            int i2 = f2552 + 73;
            f2551 = i2 % 128;
            if (i2 % 2 == 0) {
                networkInfoM2501.isConnected();
                throw null;
            }
            if (networkInfoM2501.isConnected()) {
                String str = f2554;
                StringBuilder sb = new StringBuilder();
                sb.append(m2497(new int[]{1629707547, 657328492, 1474289885, 1342520013}, TextUtils.indexOf((CharSequence) "", '0', 0) + 9).intern());
                sb.append(networkInfoM2501.getTypeName());
                sb.append(m2497(new int[]{2124198339, 179647037, 1262350957, -1871878628, 686545111, -1211493575}, (ViewConfiguration.getScrollBarSize() >> 8) + 11).intern());
                n.m2844(str, sb.toString());
                return true;
            }
        }
        int i3 = f2551 + 13;
        f2552 = i3 % 128;
        if (i3 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2498(iz izVar, boolean z2) {
        f2551 = (f2552 + 41) % 128;
        izVar.m2500(z2);
        f2551 = (f2552 + 79) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m2502() {
        f2552 = (f2551 + 111) % 128;
        Iterator<ir> it = m2493().iterator();
        f2551 = (f2552 + 87) % 128;
        while (it.hasNext()) {
            f2551 = (f2552 + 5) % 128;
            it.next();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized boolean m2507() {
        boolean z2;
        int i2 = f2551;
        int i3 = i2 + 19;
        f2552 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        z2 = this.f2557;
        f2552 = (i2 + 13) % 128;
        return z2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2499(iz izVar, Context context) {
        int i2 = f2552 + 81;
        f2551 = i2 % 128;
        if (i2 % 2 != 0) {
            return m2495(context);
        }
        m2495(context);
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static NetworkInfo m2501(Context context) {
        f2551 = (f2552 + 53) % 128;
        if (context == null) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(m2497(new int[]{702640470, -1164157678, -1392051323, -1684407193, -376239105, -269561256}, Drawable.resolveOpacity(0, 0) + 12).intern())).getActiveNetworkInfo();
        f2551 = (f2552 + 23) % 128;
        return activeNetworkInfo;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2497(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2553.clone();
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2500(boolean z2) {
        int i2 = f2552;
        this.f2557 = z2;
        f2551 = (i2 + 59) % 128;
    }
}
