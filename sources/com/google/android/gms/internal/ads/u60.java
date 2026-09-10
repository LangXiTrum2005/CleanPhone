package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u60 implements da0, ta0, na0, zza, la0, mc0, fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f20649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ju0 f20652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final du0 f20653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lx0 f20654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ru0 f20655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qf f20656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sm f20657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WeakReference f20658k;
    public final WeakReference l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vu0 f20659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cb0 f20660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n90 f20661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f20662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f20664r = new AtomicBoolean();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f20665s = null;

    public u60(Context context, k00 k00Var, Executor executor, ScheduledExecutorService scheduledExecutorService, ju0 ju0Var, du0 du0Var, lx0 lx0Var, ru0 ru0Var, View view, b30 b30Var, qf qfVar, sm smVar, vu0 vu0Var, cb0 cb0Var, n90 n90Var, Set set) {
        this.f20648a = context;
        this.f20649b = k00Var;
        this.f20650c = executor;
        this.f20651d = scheduledExecutorService;
        this.f20652e = ju0Var;
        this.f20653f = du0Var;
        this.f20654g = lx0Var;
        this.f20655h = ru0Var;
        this.f20656i = qfVar;
        this.f20658k = new WeakReference(view);
        this.l = new WeakReference(b30Var);
        this.f20657j = smVar;
        this.f20659m = vu0Var;
        this.f20660n = cb0Var;
        this.f20661o = n90Var;
        this.f20662p = set;
    }

    public final List a() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.Zc)).booleanValue();
        du0 du0Var = this.f20653f;
        if (zBooleanValue) {
            zzt.zzc();
            Context context = this.f20648a;
            if (zzs.zzE(context)) {
                zzt.zzc();
                Integer numZzu = zzs.zzu(context);
                if (numZzu != null) {
                    int iMin = Math.min(numZzu.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = du0Var.f13681d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return du0Var.f13681d;
    }

    public final void b(int i10, int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f20658k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            v();
        } else {
            this.f20651d.schedule(new s60(this, i10, i11, 0), i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final void e(zze zzeVar) {
        if (((Boolean) zzba.zzc().a(am.f12235l2)).booleanValue()) {
            int i10 = zzeVar.zza;
            ArrayList arrayList = new ArrayList();
            du0 du0Var = this.f20653f;
            for (String str : du0Var.f13701o) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 2);
                sb2.append("2.");
                sb2.append(i10);
                arrayList.add(lx0.c(str, "@gw_mpe@", sb2.toString()));
            }
            this.f20655h.a(this.f20654g.a(this.f20652e, du0Var, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
        ku0 ku0Var;
        du0 du0Var = this.f20653f;
        List list = du0Var.f13688h;
        lx0 lx0Var = this.f20654g;
        lx0Var.getClass();
        ArrayList arrayList = new ArrayList();
        ((p9.b) lx0Var.f17147h).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = sxVar.f20059a;
            String string = Integer.toString(sxVar.f20060b);
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.C4)).booleanValue();
            g81 k81Var = w71.f21439a;
            if (zBooleanValue) {
                mu0 mu0Var = lx0Var.f17146g;
                if (mu0Var != null && (ku0Var = mu0Var.f17548a) != null) {
                    k81Var = new k81(ku0Var);
                }
            } else {
                ku0 ku0Var2 = lx0Var.f17145f;
                if (ku0Var2 != null) {
                    k81Var = new k81(ku0Var2);
                }
            }
            String str4 = (String) k81Var.e(i6.f15618s).d();
            String str5 = (String) k81Var.e(i6.f15617r).d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(rb0.e(lx0.c(lx0.c(lx0.c(lx0.c(lx0.c(lx0.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", lx0Var.f17141b), lx0Var.f17144e, du0Var.W, du0Var.f13716w0));
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Unable to determine award type and amount.", e10);
        }
        this.f20655h.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        if (this.f20664r.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzba.zzc().a(am.K4)).intValue();
            if (iIntValue > 0) {
                b(iIntValue, ((Integer) zzba.zzc().a(am.L4)).intValue());
                return;
            }
            if (!((Boolean) zzba.zzc().a(am.J4)).booleanValue()) {
                v();
            } else {
                this.f20650c.execute(new r60(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12189i1)).booleanValue();
        ju0 ju0Var = this.f20652e;
        if ((zBooleanValue && ((fu0) ju0Var.f16196b.f20920d).f14552h) || !((Boolean) en.f14020d.o()).booleanValue()) {
            du0 du0Var = this.f20653f;
            this.f20655h.b(this.f20654g.a(ju0Var, du0Var, du0Var.f13679c), true == zzt.zzh().i(this.f20648a) ? 2 : 1);
        } else {
            sm smVar = this.f20657j;
            smVar.getClass();
            lc1 lc1VarT = zw1.t(vd1.r((vd1) zw1.v(vd1.r(be1.f12743b), ((Long) en.f14019c.o()).longValue(), TimeUnit.MILLISECONDS, smVar.f19999c)), Throwable.class, i6.f15605e, l00.f16615h);
            lc1VarT.addListener(new zd1(0, lc1VarT, new b21(this, 13)), this.f20649b);
        }
    }

    public final void v() {
        int i10;
        t0 t0Var;
        du0 du0Var = this.f20653f;
        List list = du0Var.f13681d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12412wf)).booleanValue() && this.f20665s == null) {
            h00 h00Var = zzt.zzh().f14131c;
            Set set = this.f20662p;
            String str = ((ou0) this.f20652e.f16195a.f20839b).f18366g;
            g00 g00Var = h00Var.f15015d;
            synchronized (g00Var.f14634g) {
                try {
                    int i11 = g00Var.f14639m;
                    g00Var.f14639m = i11 + 1;
                    if (set.isEmpty()) {
                        t0Var = new t0(i11, -1, -1, false);
                    } else {
                        String strJoin = String.join(",", new TreeSet(set));
                        HashMap map = g00Var.f14640n;
                        Integer num = (Integer) map.get(strJoin);
                        int iIntValue = 0;
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        map.put(strJoin, Integer.valueOf(iIntValue2 + 1));
                        if (str == null) {
                            t0Var = new t0(i11, iIntValue2, -1, false);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(strJoin).length());
                            sb2.append(str);
                            sb2.append("|");
                            sb2.append(strJoin);
                            String string = sb2.toString();
                            HashMap map2 = g00Var.f14641o;
                            Integer num2 = (Integer) map2.get(string);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            map2.put(string, Integer.valueOf(iIntValue + 1));
                            t0Var = new t0(i11, iIntValue2, iIntValue, false);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f20665s = t0Var;
        }
        String strZzj = null;
        if (((Boolean) zzba.zzc().a(am.B4)).booleanValue()) {
            strZzj = this.f20656i.f19044b.zzj(this.f20648a, (View) this.f20658k.get(), null);
        }
        String str2 = strZzj;
        if ((((Boolean) zzba.zzc().a(am.f12189i1)).booleanValue() && ((fu0) this.f20652e.f16196b.f20920d).f14552h) || !((Boolean) en.f14024h.o()).booleanValue()) {
            this.f20655h.a(this.f20654g.b(this.f20652e, du0Var, false, str2, null, a(), this.f20661o, this.f20665s), this.f20660n);
            return;
        }
        if (((Boolean) en.f14023g.o()).booleanValue() && ((i10 = du0Var.f13677b) == 1 || i10 == 2 || i10 == 5)) {
        }
        vd1 vd1Var = (vd1) zw1.v(vd1.r(be1.f12743b), ((Long) zzba.zzc().a(am.M1)).longValue(), TimeUnit.MILLISECONDS, this.f20651d);
        vd1Var.addListener(new zd1(0, vd1Var, new md0((Object) this, false, (Object) str2, 14)), this.f20649b);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
        du0 du0Var = this.f20653f;
        this.f20655h.a(this.f20654g.a(this.f20652e, du0Var, du0Var.f13687g), null);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
        du0 du0Var = this.f20653f;
        this.f20655h.a(this.f20654g.a(this.f20652e, du0Var, du0Var.f13690i), null);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final synchronized void zzg() {
        vu0 vu0Var;
        long j10;
        try {
            if (this.f20663q) {
                ArrayList arrayList = new ArrayList(a());
                du0 du0Var = this.f20653f;
                arrayList.addAll(du0Var.f13685f);
                this.f20655h.a(this.f20654g.b(this.f20652e, du0Var, true, null, null, arrayList, null, null), null);
            } else {
                ru0 ru0Var = this.f20655h;
                lx0 lx0Var = this.f20654g;
                ju0 ju0Var = this.f20652e;
                du0 du0Var2 = this.f20653f;
                ru0Var.a(lx0Var.a(ju0Var, du0Var2, du0Var2.f13697m), null);
                if (((Boolean) zzba.zzc().a(am.G4)).booleanValue() && (vu0Var = this.f20659m) != null) {
                    List list = ((du0) vu0Var.f21275c).f13697m;
                    String strD = ((bo0) vu0Var.f21276d).d();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(lx0.c((String) it.next(), "@gw_adnetstatus@", strD));
                    }
                    bo0 bo0Var = (bo0) vu0Var.f21276d;
                    synchronized (bo0Var) {
                        j10 = bo0Var.f12834h;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(lx0.c((String) it2.next(), "@gw_ttr@", Long.toString(j10, 10)));
                    }
                    ru0Var.a(lx0Var.a((ju0) vu0Var.f21274b, (du0) vu0Var.f21275c, arrayList3), null);
                }
                ru0Var.a(lx0Var.a(ju0Var, du0Var2, du0Var2.f13685f), null);
            }
            this.f20663q = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.mc0
    public final void zzi() {
        du0 du0Var = this.f20653f;
        this.f20655h.a(this.f20654g.a(this.f20652e, du0Var, du0Var.f13712u0), null);
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void zzk() {
        du0 du0Var = this.f20653f;
        if (du0Var.f13683e == 4) {
            this.f20655h.a(this.f20654g.a(this.f20652e, du0Var, du0Var.A0), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
    }
}
