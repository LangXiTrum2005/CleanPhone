package f5;

import am.e;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.j60;
import com.ironsource.X3;
import d5.o;
import e5.c;
import e5.l;
import g9.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m5.i;
import n5.h;
import ta.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c, i5.b, e5.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f40659i = o.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f40661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i5.c f40662c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f40664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f40665f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f40667h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f40663d = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f40666g = new Object();

    public b(Context context, j60 j60Var, k kVar, l lVar) {
        this.f40660a = context;
        this.f40661b = lVar;
        this.f40662c = new i5.c(context, kVar, this);
        this.f40664e = new a(this, (e) j60Var.f16000h);
    }

    @Override // e5.c
    public final void a(i... iVarArr) {
        if (this.f40667h == null) {
            j60 j60Var = this.f40661b.f39110b;
            Context context = this.f40660a;
            int i10 = h.f46525a;
            String processName = Application.getProcessName();
            j60Var.getClass();
            this.f40667h = Boolean.valueOf(!TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, context.getApplicationInfo().processName));
        }
        boolean z10 = false;
        if (!this.f40667h.booleanValue()) {
            o.g().h(f40659i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f40665f) {
            this.f40661b.f39114f.a(this);
            this.f40665f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f45883b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f40664e;
                    if (aVar != null) {
                        e eVar = aVar.f40657b;
                        HashMap map = aVar.f40658c;
                        Runnable runnable = (Runnable) map.remove(iVar.f45882a);
                        if (runnable != null) {
                            ((Handler) eVar.f3698b).removeCallbacks(runnable);
                        }
                        i0 i0Var = new i0(aVar, z10, iVar, 20);
                        map.put(iVar.f45882a, i0Var);
                        ((Handler) eVar.f3698b).postDelayed(i0Var, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    d5.b bVar = iVar.f45891j;
                    if (bVar.f38678c) {
                        o.g().e(f40659i, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (bVar.f38683h.f38686a.size() > 0) {
                        o.g().e(f40659i, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f45882a);
                    }
                } else {
                    o.g().e(f40659i, defpackage.e.n("Starting work for ", iVar.f45882a), new Throwable[0]);
                    this.f40661b.f(iVar.f45882a, null);
                }
            }
        }
        synchronized (this.f40666g) {
            try {
                if (!hashSet.isEmpty()) {
                    o.g().e(f40659i, "Starting tracking for [" + TextUtils.join(",", hashSet2) + X3.j.f27836e, new Throwable[0]);
                    this.f40663d.addAll(hashSet);
                    this.f40662c.b(this.f40663d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e5.c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f40667h;
        l lVar = this.f40661b;
        if (bool == null) {
            j60 j60Var = lVar.f39110b;
            int i10 = h.f46525a;
            String processName = Application.getProcessName();
            j60Var.getClass();
            this.f40667h = Boolean.valueOf(!TextUtils.isEmpty(null) ? TextUtils.equals(processName, null) : TextUtils.equals(processName, this.f40660a.getApplicationInfo().processName));
        }
        boolean zBooleanValue = this.f40667h.booleanValue();
        String str2 = f40659i;
        if (!zBooleanValue) {
            o.g().h(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f40665f) {
            lVar.f39114f.a(this);
            this.f40665f = true;
        }
        o.g().e(str2, defpackage.e.n("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f40664e;
        if (aVar != null && (runnable = (Runnable) aVar.f40658c.remove(str)) != null) {
            ((Handler) aVar.f40657b.f3698b).removeCallbacks(runnable);
        }
        lVar.g(str);
    }

    @Override // i5.b
    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.g().e(f40659i, defpackage.e.n("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f40661b.g(str);
        }
    }

    @Override // e5.c
    public final boolean d() {
        return false;
    }

    @Override // e5.a
    public final void e(String str, boolean z10) {
        synchronized (this.f40666g) {
            try {
                for (i iVar : this.f40663d) {
                    if (iVar.f45882a.equals(str)) {
                        o.g().e(f40659i, "Stopping tracking for " + str, new Throwable[0]);
                        this.f40663d.remove(iVar);
                        this.f40662c.b(this.f40663d);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i5.b
    public final void f(List list) {
        for (String str : (ArrayList) list) {
            o.g().e(f40659i, defpackage.e.n("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f40661b.f(str, null);
        }
    }
}
