package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class un0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le1 f20829c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public co0 f20832f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bo0 f20836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public du0 f20837k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20827a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f20828b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20830d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f20831e = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20833g = Integer.MAX_VALUE;
    public boolean l = false;

    public un0(ju0 ju0Var, bo0 bo0Var, le1 le1Var) {
        this.f20835i = ((fu0) ju0Var.f16196b.f20920d).f14561r;
        this.f20836j = bo0Var;
        this.f20829c = le1Var;
        this.f20834h = fo0.a(ju0Var);
        List list = (List) ju0Var.f16196b.f20919c;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f20827a.put((du0) list.get(i10), Integer.valueOf(i10));
        }
        this.f20828b.addAll(list);
    }

    public final synchronized du0 a() {
        try {
            if (d()) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f20828b;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    du0 du0Var = (du0) arrayList.get(i10);
                    String str = du0Var.t0;
                    HashSet hashSet = this.f20831e;
                    if (!hashSet.contains(str)) {
                        if (du0Var.f13714v0) {
                            this.l = true;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashSet.add(str);
                        }
                        this.f20830d.add(du0Var);
                        return (du0) arrayList.remove(i10);
                    }
                    i10++;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(co0 co0Var, du0 du0Var) {
        boolean z10;
        z10 = false;
        this.l = false;
        this.f20830d.remove(du0Var);
        synchronized (this) {
        }
        if (this.f20829c.isDone()) {
            co0Var.zzm();
            return;
        }
        Integer num = (Integer) this.f20827a.get(du0Var);
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        if (iIntValue > this.f20833g) {
            this.f20836j.c(du0Var);
            return;
        }
        if (this.f20832f != null) {
            this.f20836j.c(this.f20837k);
        }
        this.f20833g = iIntValue;
        this.f20832f = co0Var;
        this.f20837k = du0Var;
        synchronized (this) {
            try {
                if (e(true) || f()) {
                    z10 = true;
                }
                if (z10) {
                    return;
                }
                g();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void c(du0 du0Var) {
        boolean z10;
        z10 = false;
        this.l = false;
        this.f20830d.remove(du0Var);
        this.f20831e.remove(du0Var.t0);
        synchronized (this) {
        }
        if (!this.f20829c.isDone()) {
            synchronized (this) {
                try {
                    if (e(true) || f()) {
                        z10 = true;
                    }
                    if (!z10) {
                        g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final synchronized boolean d() {
        if (this.l) {
            return false;
        }
        ArrayList arrayList = this.f20828b;
        if (!arrayList.isEmpty() && ((du0) arrayList.get(0)).f13714v0 && !this.f20830d.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (!this.f20829c.isDone()) {
                ArrayList arrayList2 = this.f20830d;
                if (arrayList2.size() < this.f20835i && e(false)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized boolean e(boolean z10) {
        try {
            for (du0 du0Var : this.f20828b) {
                Integer num = (Integer) this.f20827a.get(du0Var);
                int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
                if (z10 || !this.f20831e.contains(du0Var.t0)) {
                    int i10 = this.f20833g;
                    if (iIntValue < i10) {
                        return true;
                    }
                    if (iIntValue > i10) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean f() {
        try {
            Iterator it = this.f20830d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f20827a.get((du0) it.next());
                if ((num != null ? num.intValue() : Integer.MAX_VALUE) < this.f20833g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        bo0 bo0Var = this.f20836j;
        du0 du0Var = this.f20837k;
        synchronized (bo0Var) {
            try {
                ((p9.b) bo0Var.f12827a).getClass();
                bo0Var.f12834h = SystemClock.elapsedRealtime() - bo0Var.f12835i;
                if (du0Var != null) {
                    bo0Var.f12832f.a(du0Var);
                }
                bo0Var.f12833g = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        co0 co0Var = this.f20832f;
        if (co0Var != null) {
            this.f20829c.c(co0Var);
        } else {
            this.f20829c.d(new eo0(3, this.f20834h));
        }
    }
}
