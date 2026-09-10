package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f19222a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture f19224c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f19227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final uo0 f19228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p9.a f19229h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19223b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f19225d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f19226e = new AtomicBoolean(false);

    public qx0(zzj zzjVar, ScheduledExecutorService scheduledExecutorService, uo0 uo0Var, p9.a aVar) {
        this.f19222a = zzjVar;
        this.f19227f = scheduledExecutorService;
        this.f19228g = uo0Var;
        this.f19229h = aVar;
    }

    public static String g(String str, AdFormat adFormat) {
        return str + ":" + adFormat;
    }

    public final void a(ux0 ux0Var) {
        int i10 = 1;
        if (ux0Var.t() <= 0 && !ux0Var.f20933m.get()) {
            i10 = 0;
        }
        c(ux0Var, i10);
    }

    public final void b(ux0 ux0Var, boolean z10) {
        uo0 uo0Var = this.f19228g;
        if (z10) {
            long jLongValue = ((Long) zzba.zzc().a(am.Z)).longValue();
            AdFormat adFormatQ = ux0Var.q();
            String str = ux0Var.l;
            String strR = ux0Var.r();
            lj1 lj1VarA = ((yh0) uo0Var.f20839b).a();
            lj1VarA.l("action", "poact");
            lj1VarA.l("ad_unit_id", strR);
            lj1VarA.l("pid", str);
            lj1VarA.l("poact_ts", Long.toString(jLongValue));
            if (adFormatQ != null) {
                lj1VarA.l("ad_format", adFormatQ.name().toLowerCase(Locale.ENGLISH));
            }
            lj1VarA.m();
        } else {
            ((p9.b) this.f19229h).getClass();
            System.currentTimeMillis();
            AdFormat adFormatQ2 = ux0Var.q();
            String str2 = ux0Var.l;
            String strR2 = ux0Var.r();
            lj1 lj1VarA2 = ((yh0) uo0Var.f20839b).a();
            lj1VarA2.l("action", "poac");
            lj1VarA2.l("ad_unit_id", strR2);
            lj1VarA2.l("pid", str2);
            if (adFormatQ2 != null) {
                lj1VarA2.l("ad_format", adFormatQ2.name().toLowerCase(Locale.ENGLISH));
            }
            lj1VarA2.m();
        }
        this.f19223b.set(false);
        l();
    }

    public final void c(ux0 ux0Var, int i10) {
        if (i(ux0Var)) {
            return;
        }
        if (i10 > 0) {
            this.f19227f.execute(new ox0(this, ux0Var, i10));
        }
        if (this.f19223b.get() || ux0Var.t() != 0 || !ux0Var.u()) {
            k(0L);
            return;
        }
        ux0Var.k();
        k(((Long) zzba.zzc().a(am.f12109d0)).longValue());
    }

    public final void d(ux0 ux0Var) {
        AdFormat adFormatQ = ux0Var.q();
        if (adFormatQ == null) {
            return;
        }
        String strG = g(ux0Var.l, adFormatQ);
        LinkedHashMap linkedHashMap = this.f19225d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(strG)) {
                linkedHashMap.remove(strG);
                int iT = ux0Var.t();
                int i10 = iT - 1;
                if (!ux0Var.f20933m.get()) {
                    iT = i10;
                }
                this.f19227f.execute(new ox0(this, Math.max(iT, 0), ux0Var));
            }
        }
    }

    public final int e() {
        ca1 ca1VarY;
        LinkedHashMap linkedHashMap = this.f19225d;
        synchronized (linkedHashMap) {
            ca1VarY = ca1.y(linkedHashMap.values());
        }
        int size = ca1VarY.size();
        int iMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            ux0 ux0Var = (ux0) ca1VarY.get(i10);
            int iT = ux0Var.t();
            int i11 = iT - 1;
            if (!ux0Var.f20933m.get()) {
                iT = i11;
            }
            iMax += Math.max(iT, 0);
        }
        return iMax;
    }

    public final int f() {
        int iZzR = this.f19222a.zzR();
        if (!((Boolean) zzba.zzc().a(am.S)).booleanValue() && iZzR > 0) {
            return iZzR;
        }
        return ((Integer) zzba.zzc().a(am.f12093c0)).intValue();
    }

    public final void h(ux0 ux0Var) {
        if (ux0Var.t() > 0 || ux0Var.f20933m.get()) {
            this.f19227f.execute(new nx0(this, ux0Var, 0));
        }
        this.f19223b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f19224c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f19224c = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f19226e.set(true);
    }

    public final boolean i(ux0 ux0Var) {
        boolean z10;
        AdFormat adFormatQ = ux0Var.q();
        if (adFormatQ == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f19225d;
        synchronized (linkedHashMap) {
            z10 = !linkedHashMap.containsKey(g(ux0Var.l, adFormatQ));
        }
        return z10;
    }

    public final boolean j() {
        ca1 ca1VarY;
        LinkedHashMap linkedHashMap = this.f19225d;
        synchronized (linkedHashMap) {
            ca1VarY = ca1.y(linkedHashMap.values());
        }
        int size = ca1VarY.size();
        for (int i10 = 0; i10 < size; i10++) {
            ux0 ux0Var = (ux0) ca1VarY.get(i10);
            if (ux0Var.t() == 0 && ux0Var.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j10) {
        if (this.f19226e.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j10 > 0) {
                        this.f19224c = this.f19227f.schedule(new px0(this, 1), j10, TimeUnit.MILLISECONDS);
                    } else {
                        this.f19227f.execute(new px0(this, 0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void l() {
        ux0 ux0Var;
        ca1 ca1VarY;
        if (this.f19223b.get()) {
            return;
        }
        synchronized (this) {
            ux0Var = null;
            this.f19224c = null;
        }
        int iF = f();
        if (e() < iF || j()) {
            LinkedHashMap linkedHashMap = this.f19225d;
            synchronized (linkedHashMap) {
                ca1VarY = ca1.y(linkedHashMap.values());
            }
            int size = ca1VarY.size();
            double d10 = Double.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                ux0 ux0Var2 = (ux0) ca1VarY.get(i10);
                if (ux0Var2.u()) {
                    double dT = ((double) ux0Var2.t()) / ((double) ux0Var2.s());
                    if (dT < d10) {
                        d10 = dT;
                    }
                    if (dT < d10) {
                        ux0Var = ux0Var2;
                    }
                }
            }
            if (ux0Var != null) {
                ux0Var.k();
                if (ux0Var.t() > 0) {
                    uo0 uo0Var = this.f19228g;
                    ((p9.b) this.f19229h).getClass();
                    uo0Var.s("acmpa", System.currentTimeMillis(), ux0Var.l, ux0Var.r(), ux0Var.q(), ux0Var.s(), ux0Var.t(), 0, e(), iF);
                }
            }
            if (e() >= iF) {
                m();
            }
            if (e() < iF || j()) {
                if (j()) {
                    this.f19227f.execute(new px0(this, 2));
                    return;
                }
                synchronized (this) {
                    this.f19224c = this.f19227f.schedule(new px0(this, 3), ((Long) zzba.zzc().a(am.f12126e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m();
        }
        this.f19226e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.f19225d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        uo0 uo0Var = this.f19228g;
        ((p9.b) this.f19229h).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iF = f();
        lj1 lj1VarA = ((yh0) uo0Var.f20839b).a();
        lj1VarA.l("action", "acmlr");
        lj1VarA.l("pat", Long.toString(jCurrentTimeMillis));
        lj1VarA.l("mpl", Integer.toString(iF));
        lj1VarA.l("pas", Integer.toString(size));
        lj1VarA.m();
    }

    public final void n(ux0 ux0Var, int i10) {
        ((p9.b) this.f19229h).getClass();
        this.f19228g.s("acmpr", System.currentTimeMillis(), ux0Var.l, ux0Var.r(), ux0Var.q(), ux0Var.s(), ux0Var.t(), i10, e(), f());
    }
}
