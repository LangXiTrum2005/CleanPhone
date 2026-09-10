package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h20 extends e20 implements ox1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicInteger f15067o = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j10 f15069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.c f15071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q2 f15072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f15073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f15075k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15076m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15077n;

    public h20(b30 b30Var, j10 j10Var) {
        super(b30Var);
        this.f15069e = j10Var;
        this.f15071g = new androidx.recyclerview.widget.c(4);
        this.f15072h = new q2();
        this.f15075k = new Object();
        String strZzn = b30Var.zzn();
        this.l = (String) (strZzn == null ? w71.f21439a : new k81(strZzn)).d();
        this.f15076m = b30Var.zzp();
        f15067o.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void g() {
        f15067o.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final boolean h(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        this.f15068d = str;
        String str6 = "error";
        String strConcat = "cache:".concat(String.valueOf(zzf.zzg(str)));
        try {
            iw0 iw0Var = new iw0(10);
            String str7 = this.f13807b;
            j10 j10Var = this.f15069e;
            jr1 jr1Var = new jr1(str7, j10Var.f15899d, j10Var.f15900e, true, iw0Var);
            jr1Var.n(this);
            boolean z10 = j10Var.f15904i;
            wk1 r10Var = jr1Var;
            if (z10) {
                r10Var = new r10(this.f13806a, jr1Var, this.l, this.f15076m);
            }
            r10Var.l(new po1(Uri.parse(str), 0L, -1L));
            b30 b30Var = (b30) this.f13808c.get();
            if (b30Var != null) {
                b30Var.e0(strConcat, this);
            }
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) zzba.zzc().a(am.r0)).longValue();
            String str8 = strConcat;
            try {
                long jLongValue2 = ((Long) zzba.zzc().a(am.f12309q0)).longValue();
                this.f15073i = ByteBuffer.allocate(j10Var.f15898c);
                byte[] bArr = new byte[Segment.SIZE];
                long j11 = jCurrentTimeMillis;
                wk1 wk1Var = r10Var;
                while (true) {
                    str3 = str6;
                    try {
                        int iT = wk1Var.t(bArr, 0, Math.min(this.f15073i.remaining(), Segment.SIZE));
                        if (iT == -1) {
                            try {
                                this.f15077n = true;
                                strConcat = str8;
                                try {
                                    str2 = str;
                                    try {
                                        zzf.zza.post(new com.adjust.sdk.i0(this, str, strConcat, (int) this.f15072h.b(this.f15073i), 3));
                                        return true;
                                    } catch (Exception e10) {
                                        e = e10;
                                        str4 = strConcat;
                                        str5 = str3;
                                        String canonicalName = e.getClass().getCanonicalName();
                                        String message = e.getMessage();
                                        String strJ = q4.a.j(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                                        String strH = d5.u.h(new StringBuilder(strJ.length() + String.valueOf(str2).length() + 34), "Failed to preload url ", str2, " Exception: ", strJ);
                                        int i10 = zze.zza;
                                        zzo.zzi(strH);
                                        q(str2, str4, str5, strJ);
                                        return false;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = str;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                strConcat = str8;
                                str2 = str;
                            }
                        } else {
                            wk1 wk1Var2 = wk1Var;
                            str4 = str8;
                            str2 = str;
                            try {
                                synchronized (this.f15075k) {
                                    j10 = jCurrentTimeMillis;
                                    try {
                                        if (!this.f15070f) {
                                            this.f15073i.put(bArr, 0, iT);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (this.f15073i.remaining() <= 0) {
                                    s();
                                    return true;
                                }
                                if (this.f15070f) {
                                    str5 = "externalAbort";
                                    try {
                                        int iLimit = this.f15073i.limit();
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iLimit).length() + 24);
                                        sb2.append("Precache abort at ");
                                        sb2.append(iLimit);
                                        sb2.append(" bytes");
                                        throw new IOException(sb2.toString());
                                    } catch (Exception e13) {
                                        e = e13;
                                    }
                                } else {
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    if (jCurrentTimeMillis2 - j11 >= jLongValue) {
                                        s();
                                        j11 = jCurrentTimeMillis2;
                                    }
                                    if (jCurrentTimeMillis2 - j10 <= 1000 * jLongValue2) {
                                        str8 = str4;
                                        str6 = str3;
                                        wk1Var = wk1Var2;
                                        jCurrentTimeMillis = j10;
                                    } else {
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                                            sb3.append("Timeout exceeded. Limit: ");
                                            sb3.append(jLongValue2);
                                            sb3.append(" sec");
                                            throw new IOException(sb3.toString());
                                        } catch (Exception e14) {
                                            e = e14;
                                            str5 = "downloadTimeout";
                                        }
                                    }
                                }
                                String canonicalName2 = e.getClass().getCanonicalName();
                                String message2 = e.getMessage();
                                String strJ2 = q4.a.j(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, ":", message2);
                                String strH2 = d5.u.h(new StringBuilder(strJ2.length() + String.valueOf(str2).length() + 34), "Failed to preload url ", str2, " Exception: ", strJ2);
                                int i11 = zze.zza;
                                zzo.zzi(strH2);
                                q(str2, str4, str5, strJ2);
                                return false;
                            } catch (Exception e15) {
                                e = e15;
                                str5 = str3;
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        str4 = str8;
                        str2 = str;
                        str5 = str3;
                        String canonicalName3 = e.getClass().getCanonicalName();
                        String message3 = e.getMessage();
                        String strJ3 = q4.a.j(new StringBuilder(String.valueOf(canonicalName3).length() + 1 + String.valueOf(message3).length()), canonicalName3, ":", message3);
                        String strH3 = d5.u.h(new StringBuilder(strJ3.length() + String.valueOf(str2).length() + 34), "Failed to preload url ", str2, " Exception: ", strJ3);
                        int i12 = zze.zza;
                        zzo.zzi(strH3);
                        q(str2, str4, str5, strJ3);
                        return false;
                    }
                }
            } catch (Exception e17) {
                e = e17;
                str3 = str6;
            }
        } catch (Exception e18) {
            e = e18;
            str2 = str;
            str3 = "error";
        }
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final void i(yg1 yg1Var, po1 po1Var, boolean z10) {
        if (yg1Var instanceof jr1) {
            ((ArrayList) this.f15071g.f4729c).add((jr1) yg1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void p() {
        this.f15070f = true;
    }

    public final void s() {
        androidx.recyclerview.widget.c cVar = this.f15071g;
        Iterator it = ((ArrayList) cVar.f4729c).iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((jr1) it.next()).zzj().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        cVar.f4728b = Math.max(cVar.f4728b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i10 = (int) cVar.f4728b;
        int iB = (int) this.f15072h.b(this.f15073i);
        int iPosition = this.f15073i.position();
        int iRound = Math.round((iPosition / i10) * iB);
        int i11 = r20.f19281u.get();
        int i12 = r20.f19282v.get();
        String str = this.f15068d;
        zzf.zza.post(new b20(this, str, "cache:".concat(String.valueOf(zzf.zzg(str))), iPosition, i10, iRound, iB, iRound > 0, i11, i12));
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final void f(po1 po1Var, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.ox1
    public final void d(po1 po1Var, boolean z10, int i10) {
    }
}
