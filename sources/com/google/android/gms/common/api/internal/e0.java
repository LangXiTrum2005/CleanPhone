package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.bb;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f11707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11709d;

    public e0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f11707b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(Status status) {
        this.f11707b.trySetException(new j9.e(status));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void b(Exception exc) {
        this.f11707b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final /* bridge */ /* synthetic */ void c(n nVar, boolean z10) {
        int i10 = this.f11708c;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void d(r rVar) throws DeadObjectException {
        try {
            k(rVar);
        } catch (DeadObjectException e10) {
            a(g0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(g0.e(e11));
        } catch (RuntimeException e12) {
            this.f11707b.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final i9.c[] f(r rVar) {
        switch (this.f11708c) {
            case 0:
                return (i9.c[]) ((a0) this.f11709d).f11671a.f5582c;
            default:
                a0 a0Var = (a0) rVar.f11756f.get((i) this.f11709d);
                if (a0Var == null) {
                    return null;
                }
                return (i9.c[]) a0Var.f11671a.f5582c;
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final boolean g(r rVar) {
        switch (this.f11708c) {
            case 0:
                return ((a0) this.f11709d).f11671a.f5580a;
            default:
                a0 a0Var = (a0) rVar.f11756f.get((i) this.f11709d);
                return a0Var != null && a0Var.f11671a.f5580a;
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final int h(r rVar) {
        switch (this.f11708c) {
            case 0:
                return 0;
            default:
                return ((a0) rVar.f11756f.get((i) this.f11709d)) != null ? 0 : -1;
        }
    }

    public final void k(r rVar) {
        switch (this.f11708c) {
            case 0:
                a0 a0Var = (a0) this.f11709d;
                bc.s sVar = a0Var.f11671a;
                ((v9.e) ((bo.e) sVar.f5583d).f5777b).accept(rVar.f11752b, this.f11707b);
                i iVar = (i) ((i9.i) sVar.f5581b).f42937a;
                if (iVar != null) {
                    rVar.f11756f.put(iVar, a0Var);
                }
                break;
            default:
                a0 a0Var2 = (a0) rVar.f11756f.remove((i) this.f11709d);
                if (a0Var2 == null) {
                    this.f11707b.trySetResult(Boolean.FALSE);
                } else {
                    j9.c cVar = rVar.f11752b;
                    ((f1) ((bo.e) a0Var2.f11672b.f46523b).f5778c).getClass();
                    int i10 = bb.l;
                    ((i9.i) a0Var2.f11671a.f5581b).f42937a = null;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(i iVar, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.f11708c = 1;
        this.f11709d = iVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(a0 a0Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.f11708c = 0;
        this.f11709d = a0Var;
    }

    private final /* bridge */ /* synthetic */ void i(n nVar, boolean z10) {
    }

    private final /* bridge */ /* synthetic */ void j(n nVar, boolean z10) {
    }
}
