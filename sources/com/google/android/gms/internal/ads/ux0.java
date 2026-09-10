package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientApi f20922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vu0 f20925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f20926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qx0 f20927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f20928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzcb f20929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzce f20930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Queue f20931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vx0 f20932k;
    public final String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f20933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f20934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sv0 f20935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f20936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public uo0 f20937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p9.a f20938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final by0 f20939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f20940t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ux0(ClientApi clientApi, Context context, int i10, vu0 vu0Var, zzfp zzfpVar, zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, sv0 sv0Var, vx0 vx0Var, p9.a aVar, int i11) {
        this("none", clientApi, context, i10, vu0Var, zzfpVar, scheduledExecutorService, sv0Var, vx0Var, aVar, (qx0) null);
        this.f20940t = i11;
        this.f20929h = zzcbVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public final void a(final int i10) {
        int size;
        qx0 qx0Var;
        boolean z10 = true;
        int size2 = 0;
        k9.c0.b(i10 > 0);
        zzfp zzfpVar = (zzfp) this.f20926e.getAndUpdate(new UnaryOperator() { // from class: com.google.android.gms.internal.ads.fy0
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((zzfp) obj).zza(i10);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i11 = zzfpVar.zzd;
        Queue queue = this.f20931j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() <= i10) {
                    z10 = false;
                } else if (((Boolean) zzba.zzc().a(am.B)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    while (size2 < i10) {
                        cy0 cy0Var = (cy0) queue.poll();
                        if (cy0Var != null) {
                            arrayList.add(cy0Var);
                        }
                        size2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    size2 = arrayList.size();
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && size > size2 && (qx0Var = this.f20927f) != null) {
            int i12 = size - size2;
            if (size2 == 0) {
                i12--;
            }
            qx0Var.c(this, i12);
        }
        uo0 uo0Var = this.f20937q;
        if (uo0Var == null || adFormat == null) {
            return;
        }
        ((p9.b) this.f20938r).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = ((zzfp) this.f20926e.get()).zza;
        lj1 lj1VarA = ((yh0) uo0Var.f20839b).a();
        lj1VarA.l("action", "cache_resize");
        lj1VarA.l("cs_ts", Long.toString(jCurrentTimeMillis));
        lj1VarA.l("orig_ma", Integer.toString(i11));
        lj1VarA.l("max_ads", Integer.toString(i10));
        lj1VarA.l("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        lj1VarA.l("ad_unit_id", str);
        lj1VarA.l("pid", null);
        lj1VarA.l("pv", "1");
        lj1VarA.m();
    }

    public final void b(zzm zzmVar) {
        if (((Boolean) zzba.zzc().a(am.G)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.l);
        }
    }

    public final void c(zze zzeVar) {
        if (this.f20936p.get()) {
            zzs.zza.post(new gm0(this, zzeVar));
        }
        this.f20933m.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.f20926e;
        int i11 = ((zzfp) atomicReference.get()).zzb;
        String str = ((zzfp) atomicReference.get()).zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(i11).length() + 26 + 61);
        sb2.append("Preloading ");
        sb2.append(i11);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(string);
        this.f20928g.set(false);
        qx0 qx0Var = this.f20927f;
        if (qx0Var != null) {
            qx0Var.a(this);
        }
        String str2 = ((zzfp) atomicReference.get()).zza;
        AdFormat adFormatQ = q();
        uo0 uo0Var = this.f20937q;
        ((p9.b) this.f20938r).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iS = s();
        int iT = t();
        String strG = g();
        lj1 lj1VarA = ((yh0) uo0Var.f20839b).a();
        lj1VarA.l("action", "pftla");
        lj1VarA.l("pftlat_ts", Long.toString(jCurrentTimeMillis));
        lj1VarA.l("pftlaec", Integer.toString(zzeVar.zza));
        lj1VarA.l("ad_format", adFormatQ == null ? "unknown" : adFormatQ.name().toLowerCase(Locale.ENGLISH));
        lj1VarA.l("max_ads", Integer.toString(iS));
        lj1VarA.l("cache_size", Integer.toString(iT));
        lj1VarA.l("ad_unit_id", str2);
        lj1VarA.l("pid", this.l);
        lj1VarA.l("pv", strG);
        lj1VarA.m();
    }

    public final void d(boolean z10) {
        vx0 vx0Var = this.f20932k;
        qx0 qx0Var = this.f20927f;
        if (qx0Var != null) {
            if (z10) {
                vx0Var.c();
            }
            qx0Var.a(this);
        } else {
            if (vx0Var.d()) {
                return;
            }
            if (z10) {
                vx0Var.c();
            }
            this.f20934n.schedule(new dy0(this), vx0Var.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z10;
        int i10;
        int i11;
        Queue queue = this.f20931j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z10 = false;
                i10 = 0;
                while (true) {
                    boolean z11 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    cy0 cy0Var = (cy0) it.next();
                    long j10 = cy0Var.f13306b;
                    long j11 = cy0Var.f13308d;
                    ((p9.b) cy0Var.f13307c).getClass();
                    if (System.currentTimeMillis() < j10 + j11) {
                        z11 = false;
                    }
                    if (z11) {
                        it.remove();
                        i10++;
                    }
                }
                if (i10 > 0 && queue.isEmpty()) {
                    z10 = true;
                }
                i11 = (i10 <= 0 || !queue.isEmpty()) ? i10 : i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        qx0 qx0Var = this.f20927f;
        if (qx0Var != null && i10 > 0) {
            qx0Var.c(this, i11);
        }
        if (z10) {
            f();
        }
    }

    public final void f() {
        if (this.f20936p.get()) {
            zzs.zza.post(new dy0(this, 1));
        }
        this.f20934n.execute(new dy0(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.l) ? "2" : "1";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    public final tc1 h(Context context) {
        ux0 ux0Var;
        switch (this.f20940t) {
            case 0:
                st stVar = (st) ((AtomicReference) this.f20925d.f21276d).get();
                if (stVar == null) {
                    return zw1.l(new rx0());
                }
                s9.b bVar = new s9.b(context);
                zzr zzrVarZzd = zzr.zzd();
                AtomicReference atomicReference = this.f20926e;
                xs0 xs0Var = (xs0) this.f20922a.zzm(bVar, zzrVarZzd, ((zzfp) atomicReference.get()).zza, stVar, this.f20924c);
                if (xs0Var == null) {
                    return zw1.l(new rx0());
                }
                le1 le1Var = new le1();
                try {
                    b(((zzfp) atomicReference.get()).zzc);
                    qx0 qx0Var = this.f20927f;
                    if (qx0Var != null) {
                        if (((Boolean) zzba.zzc().a(am.Y)).booleanValue()) {
                            xs0Var.f21995f.f20486h.set(new wx0(qx0Var, this.f20934n, ((Long) zzba.zzc().a(am.f12076b0)).longValue(), this));
                        }
                    }
                    zzfp zzfpVar = (zzfp) atomicReference.get();
                    iw0 iw0Var = new iw0(this, false, le1Var, 1);
                    String str = zzfpVar.zza;
                    tx0 tx0Var = new tx0();
                    tx0Var.f20519a = iw0Var;
                    tx0Var.f20520b = str;
                    xs0Var.zzJ(tx0Var);
                    xs0Var.zze(((zzfp) atomicReference.get()).zzc);
                    return le1Var;
                } catch (RemoteException e10) {
                    zzo.zzj("Failed to load app open ad.", e10);
                    return zw1.l(new rx0());
                }
            case 1:
                st stVar2 = (st) ((AtomicReference) this.f20925d.f21276d).get();
                if (stVar2 == null) {
                    return zw1.l(new rx0());
                }
                s9.b bVar2 = new s9.b(context);
                zzr zzrVar = new zzr();
                AtomicReference atomicReference2 = this.f20926e;
                kp0 kp0Var = (kp0) this.f20922a.zzc(bVar2, zzrVar, ((zzfp) atomicReference2.get()).zza, stVar2, this.f20924c);
                if (kp0Var == null) {
                    return zw1.l(new rx0());
                }
                le1 le1Var2 = new le1();
                try {
                    b(((zzfp) atomicReference2.get()).zzc);
                    qx0 qx0Var2 = this.f20927f;
                    if (qx0Var2 != null) {
                        if (((Boolean) zzba.zzc().a(am.Y)).booleanValue()) {
                            kp0Var.f16494f.f15350i.set(new wx0(qx0Var2, this.f20934n, ((Long) zzba.zzc().a(am.Z)).longValue(), this));
                        }
                    }
                    zzm zzmVar = ((zzfp) atomicReference2.get()).zzc;
                    iw0 iw0Var2 = new iw0(this, false, le1Var2, 1);
                    String str2 = ((zzfp) atomicReference2.get()).zza;
                    xx0 xx0Var = new xx0();
                    xx0Var.f22019a = kp0Var;
                    xx0Var.f22020b = iw0Var2;
                    xx0Var.f22021c = str2;
                    kp0Var.zzQ(zzmVar, xx0Var);
                    return le1Var2;
                } catch (RemoteException e11) {
                    zzo.zzj("Failed to load interstitial ad.", e11);
                    return zw1.l(new rx0());
                }
            default:
                st stVar3 = (st) ((AtomicReference) this.f20925d.f21276d).get();
                if (stVar3 == null) {
                    return zw1.l(new rx0());
                }
                s9.b bVar3 = new s9.b(context);
                AtomicReference atomicReference3 = this.f20926e;
                au0 au0Var = (au0) this.f20922a.zzl(bVar3, ((zzfp) atomicReference3.get()).zza, stVar3, this.f20924c);
                if (au0Var == null) {
                    return zw1.l(new rx0());
                }
                le1 le1Var3 = new le1();
                try {
                    b(((zzfp) atomicReference3.get()).zzc);
                    qx0 qx0Var3 = this.f20927f;
                    if (qx0Var3 != null) {
                        if (((Boolean) zzba.zzc().a(am.Y)).booleanValue()) {
                            ux0Var = this;
                            au0Var.f12512b.f20899i.set(new wx0(qx0Var3, this.f20934n, ((Long) zzba.zzc().a(am.f12059a0)).longValue(), this));
                        } else {
                            ux0Var = this;
                        }
                    } else {
                        ux0Var = this;
                    }
                    zzm zzmVar2 = ((zzfp) atomicReference3.get()).zzc;
                    iw0 iw0Var3 = new iw0(ux0Var, false, le1Var3, 1);
                    String str3 = ((zzfp) atomicReference3.get()).zza;
                    iy0 iy0Var = new iy0();
                    iy0Var.f15870a = au0Var;
                    iy0Var.f15871b = iw0Var3;
                    iy0Var.f15872c = str3;
                    au0Var.zzc(zzmVar2, iy0Var);
                    return le1Var3;
                } catch (RemoteException unused) {
                    zzo.zzi("Failed to load rewarded ad.");
                    return zw1.l(new rx0());
                }
        }
    }

    public final long i() {
        switch (this.f20940t) {
            case 0:
                return ((Long) zzba.zzc().a(am.X)).longValue();
            case 1:
                return ((Long) zzba.zzc().a(am.V)).longValue();
            default:
                return ((Long) zzba.zzc().a(am.W)).longValue();
        }
    }

    public final /* bridge */ zzdx j(Object obj) {
        switch (this.f20940t) {
            case 0:
                try {
                    return ((wi) obj).zzg();
                } catch (RemoteException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zze("Failed to get response info for the app open ad.", e10);
                    return null;
                }
            case 1:
                try {
                    return ((zzbu) obj).zzt();
                } catch (RemoteException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zze("Failed to get response info for  the interstitial ad.", e11);
                    return null;
                }
            default:
                try {
                    return ((iy) obj).zzm();
                } catch (RemoteException e12) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zze("Failed to get response info for the rewarded ad.", e12);
                    return null;
                }
        }
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.f20933m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f20928g.get() || t() >= ((zzfp) this.f20926e.get()).zzd) {
                atomicBoolean.set(false);
            } else {
                this.f20934n.submit(new dy0(this, 5));
            }
        }
    }

    public final boolean l() {
        boolean zIsEmpty;
        if (((Boolean) zzba.zzc().a(am.O)).booleanValue()) {
            this.f20932k.a();
        }
        if (((Boolean) zzba.zzc().a(am.H)).booleanValue() && this.f20927f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.f20931j;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    public final Object m() {
        final cy0 cy0Var;
        final boolean z10;
        final cy0 cy0Var2;
        Queue queue = this.f20931j;
        final int iT = t();
        synchronized (queue) {
            try {
                cy0Var = (cy0) queue.poll();
                boolean z11 = false;
                if (cy0Var != null && queue.isEmpty()) {
                    z11 = true;
                }
                z10 = z11;
                cy0Var2 = (cy0Var == null || queue.isEmpty()) ? null : (cy0) queue.peek();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ((p9.b) this.f20938r).getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int iS = s();
        final int iT2 = t();
        this.f20934n.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.ey0
            @Override // java.lang.Runnable
            public final void run() {
                ux0 ux0Var = this.f14103a;
                int i10 = iT;
                cy0 cy0Var3 = cy0Var;
                cy0 cy0Var4 = cy0Var2;
                long j10 = jCurrentTimeMillis;
                int i11 = iS;
                int i12 = iT2;
                boolean z12 = z10;
                if (((Boolean) zzba.zzc().a(am.Q)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(am.P)).booleanValue() || i10 == 1) {
                        ux0Var.f20932k.a();
                    }
                }
                if (cy0Var3 != null && cy0Var4 != null) {
                    AdFormat adFormat = AdFormat.getAdFormat(((zzfp) ux0Var.f20926e.get()).zzb);
                    zzdx zzdxVarJ = ux0Var.j(cy0Var3.f13305a);
                    String str = !(zzdxVarJ instanceof aa0) ? null : ((aa0) zzdxVarJ).f11957d;
                    if (adFormat != null && str != null && cy0Var4.f13306b < cy0Var3.f13306b) {
                        ux0Var.f20937q.r("poll_ad", "psvroc_ts", j10, i11, i12, str, ux0Var.f20939s, ux0Var.g());
                    }
                }
                qx0 qx0Var = ux0Var.f20927f;
                if (qx0Var == null) {
                    long jI = ux0Var.i();
                    if (jI < 0) {
                        jI = ((Long) zzba.zzc().a(am.U)).longValue();
                    }
                    if (jI > 0) {
                        ux0Var.f20934n.schedule(new dy0(ux0Var), jI, TimeUnit.MILLISECONDS);
                    } else {
                        ux0Var.v();
                    }
                } else if (!qx0Var.i(ux0Var)) {
                    if (((Boolean) zzba.zzc().a(am.Y)).booleanValue()) {
                        qx0Var.h(ux0Var);
                    } else {
                        long jI2 = ux0Var.i();
                        if (jI2 < 0) {
                            jI2 = ((Long) zzba.zzc().a(am.U)).longValue();
                        }
                        if (jI2 > 0) {
                            qx0Var.h(ux0Var);
                            synchronized (qx0Var) {
                                qx0Var.f19224c = qx0Var.f19227f.schedule(new px0(qx0Var, 4), jI2, TimeUnit.MILLISECONDS);
                            }
                        } else {
                            qx0Var.a(ux0Var);
                        }
                    }
                }
                if (z12) {
                    ux0Var.f();
                }
            }
        });
        if (cy0Var == null) {
            return null;
        }
        return cy0Var.f13305a;
    }

    public final void n() {
        this.f20928g.set(true);
        this.f20936p.set(true);
        qx0 qx0Var = this.f20927f;
        if (qx0Var != null) {
            qx0Var.c(this, 0);
        } else {
            this.f20934n.submit(new dy0(this));
        }
    }

    public final String o() {
        cy0 cy0Var;
        Queue queue = this.f20931j;
        synchronized (queue) {
            cy0Var = (cy0) queue.peek();
        }
        Object obj = cy0Var == null ? null : cy0Var.f13305a;
        zzdx zzdxVarJ = obj == null ? null : j(obj);
        if (zzdxVarJ instanceof aa0) {
            return ((aa0) zzdxVarJ).f11957d;
        }
        return null;
    }

    public final void p(int i10) {
        k9.c0.b(i10 >= 5);
        vx0 vx0Var = this.f20932k;
        synchronized (vx0Var) {
            k9.c0.b(i10 > 0);
            vx0Var.f21309d = i10;
        }
    }

    public final AdFormat q() {
        return AdFormat.getAdFormat(((zzfp) this.f20926e.get()).zzb);
    }

    public final String r() {
        return ((zzfp) this.f20926e.get()).zza;
    }

    public final int s() {
        return ((zzfp) this.f20926e.get()).zzd;
    }

    public final int t() {
        int size;
        Queue queue = this.f20931j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long jCurrentTimeMillis;
        long j10;
        if (!this.f20928g.get() || this.f20933m.get() || t() >= s()) {
            return false;
        }
        vx0 vx0Var = this.f20932k;
        synchronized (vx0Var) {
            ((p9.b) vx0Var.f21311f).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            j10 = vx0Var.f21310e;
        }
        return jCurrentTimeMillis >= j10 && !vx0Var.d();
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.f20933m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.f20928g.get() || t() >= ((zzfp) this.f20926e.get()).zzd) {
                atomicBoolean.set(false);
            } else {
                w();
            }
        }
    }

    public final void w() {
        tc1 tc1VarH;
        Activity activityD = zzt.zzg().d();
        if (activityD == null) {
            String strValueOf = String.valueOf(((zzfp) this.f20926e.get()).zza);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            tc1VarH = h(this.f20923b);
        } else {
            tc1VarH = h(activityD);
        }
        tc1VarH.addListener(new zd1(0, tc1VarH, new x11(this, 27)), this.f20934n);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ux0(String str, ClientApi clientApi, Context context, int i10, vu0 vu0Var, zzfp zzfpVar, zzce zzceVar, ScheduledExecutorService scheduledExecutorService, sv0 sv0Var, vx0 vx0Var, p9.a aVar, qx0 qx0Var, int i11) {
        this(str, clientApi, context, i10, vu0Var, zzfpVar, scheduledExecutorService, sv0Var, vx0Var, aVar, qx0Var);
        this.f20940t = i11;
        this.f20930i = zzceVar;
    }

    public ux0(String str, ClientApi clientApi, Context context, int i10, vu0 vu0Var, zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, sv0 sv0Var, vx0 vx0Var, p9.a aVar, qx0 qx0Var) {
        Queue priorityQueue;
        this.l = str;
        this.f20922a = clientApi;
        this.f20923b = context;
        this.f20924c = i10;
        this.f20925d = vu0Var;
        AtomicReference atomicReference = new AtomicReference(zzfpVar);
        this.f20926e = atomicReference;
        int iMax = Math.max(1, zzfpVar.zzd);
        if (((Boolean) zzba.zzc().a(am.g0)).booleanValue()) {
            priorityQueue = new hy0();
        } else {
            priorityQueue = new PriorityQueue(iMax, b.f12569o);
        }
        this.f20931j = priorityQueue;
        this.f20928g = new AtomicBoolean(true);
        this.f20933m = new AtomicBoolean(false);
        this.f20934n = scheduledExecutorService;
        this.f20935o = sv0Var;
        this.f20932k = vx0Var;
        this.f20936p = new AtomicBoolean(true);
        this.f20938r = aVar;
        ay0 ay0Var = new ay0(zzfpVar.zza, AdFormat.getAdFormat(((zzfp) atomicReference.get()).zzb));
        ay0Var.f12538c = str;
        this.f20939s = new by0(ay0Var);
        this.f20927f = qx0Var;
    }
}
