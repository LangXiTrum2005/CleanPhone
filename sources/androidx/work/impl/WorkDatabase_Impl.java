package androidx.work.impl;

import android.content.Context;
import bc.s;
import com.google.android.gms.internal.ads.mk0;
import com.google.android.gms.internal.consent_sdk.d;
import ea.f2;
import g4.c;
import java.util.HashMap;
import k4.a;
import k4.b;
import m0.s1;
import m5.k;
import s4.i;
import zc.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f5022s = 0;
    public volatile d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile s1 f5023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile k f5024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile g9.k f5025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile s1 f5026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile u f5027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile f2 f5028r;

    @Override // g4.f
    public final c d() {
        return new c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // g4.f
    public final b e(mk0 mk0Var) {
        f2 f2Var = new f2(mk0Var, false, new i(this), 15);
        Context context = (Context) mk0Var.f17462d;
        String str = (String) mk0Var.f17463e;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        return ((a) mk0Var.f17461c).n(new s(context, str, f2Var, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s1 i() {
        s1 s1Var;
        if (this.f5023m != null) {
            return this.f5023m;
        }
        synchronized (this) {
            try {
                if (this.f5023m == null) {
                    this.f5023m = new s1(this, 2);
                }
                s1Var = this.f5023m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final f2 j() {
        f2 f2Var;
        if (this.f5028r != null) {
            return this.f5028r;
        }
        synchronized (this) {
            try {
                if (this.f5028r == null) {
                    this.f5028r = new f2(this);
                }
                f2Var = this.f5028r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g9.k k() {
        g9.k kVar;
        if (this.f5025o != null) {
            return this.f5025o;
        }
        synchronized (this) {
            try {
                if (this.f5025o == null) {
                    this.f5025o = new g9.k(this);
                }
                kVar = this.f5025o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s1 l() {
        s1 s1Var;
        if (this.f5026p != null) {
            return this.f5026p;
        }
        synchronized (this) {
            try {
                if (this.f5026p == null) {
                    this.f5026p = new s1(this, 3);
                }
                s1Var = this.f5026p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final u m() {
        u uVar;
        if (this.f5027q != null) {
            return this.f5027q;
        }
        synchronized (this) {
            try {
                if (this.f5027q == null) {
                    this.f5027q = new u(this);
                }
                uVar = this.f5027q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d n() {
        d dVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new d(this);
                }
                dVar = this.l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k o() {
        k kVar;
        if (this.f5024n != null) {
            return this.f5024n;
        }
        synchronized (this) {
            try {
                if (this.f5024n == null) {
                    this.f5024n = new k(this);
                }
                kVar = this.f5024n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }
}
