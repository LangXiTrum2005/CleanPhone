package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ju0 f16364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f16366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f16371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f16372i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f16373j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f16374k;

    public k80(ju0 ju0Var, du0 du0Var, pa0 pa0Var, sa0 sa0Var, ts0 ts0Var, aa0 aa0Var, nb0 nb0Var, ua0 ua0Var, lc0 lc0Var, n90 n90Var, ji0 ji0Var) {
        this.f16364a = ju0Var;
        this.f16365b = du0Var;
        this.f16366c = pa0Var;
        this.f16367d = sa0Var;
        this.f16368e = ts0Var;
        this.f16369f = aa0Var;
        this.f16370g = nb0Var;
        this.f16371h = ua0Var;
        this.f16372i = lc0Var;
        this.f16373j = n90Var;
        this.f16374k = ji0Var;
    }

    public void a(du0 du0Var) {
        ListenableFuture listenableFutureL;
        synchronized (this) {
            Iterator it = du0Var.f13675a.iterator();
            while (it.hasNext()) {
                nm0 nm0VarA = ((o80) this.f16369f).a(du0Var.f13677b, (String) it.next());
                if (nm0VarA != null && nm0VarA.b(this.f16364a, du0Var)) {
                    listenableFutureL = zw1.v(nm0VarA.a(this.f16364a, du0Var), du0Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.f16368e);
                    if (((Boolean) zzba.zzc().a(am.f12331ra)).booleanValue()) {
                        fw0 fw0VarF = fw0.f((Context) this.f16365b, 12);
                        fw0VarF.zzi(du0Var.E);
                        fw0VarF.zza();
                        ps1.a0(listenableFutureL, (jw0) this.f16366c, fw0VarF, false);
                    }
                }
            }
            listenableFutureL = zw1.l(new ck0(3));
        }
        ((bo0) this.f16370g).b(this.f16364a, du0Var, listenableFutureL, (lx0) this.f16371h);
        listenableFutureL.addListener(new zd1(0, listenableFutureL, new lj1(25, this, du0Var)), (Executor) this.f16367d);
    }

    public k80(Context context, jw0 jw0Var, k00 k00Var, ScheduledExecutorService scheduledExecutorService, o80 o80Var, bo0 bo0Var, lx0 lx0Var) {
        this.f16372i = new le1();
        this.f16373j = new AtomicBoolean();
        this.f16365b = context;
        this.f16366c = jw0Var;
        this.f16367d = k00Var;
        this.f16368e = scheduledExecutorService;
        this.f16369f = o80Var;
        this.f16370g = bo0Var;
        this.f16371h = lx0Var;
    }
}
