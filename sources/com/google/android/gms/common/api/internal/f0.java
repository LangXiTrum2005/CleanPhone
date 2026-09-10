package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f11711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f11712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fd.b f11713d;

    public f0(int i10, m mVar, TaskCompletionSource taskCompletionSource, fd.b bVar) {
        super(i10);
        this.f11712c = taskCompletionSource;
        this.f11711b = mVar;
        this.f11713d = bVar;
        if (i10 == 2 && mVar.f11730b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(Status status) {
        this.f11713d.getClass();
        this.f11712c.trySetException(k9.c0.m(status));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void b(Exception exc) {
        this.f11712c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void c(n nVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = (Map) nVar.f11738b;
        TaskCompletionSource taskCompletionSource = this.f11712c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new n(nVar, taskCompletionSource));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void d(r rVar) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.f11712c;
        try {
            m mVar = this.f11711b;
            ((k) ((m) mVar.f11732d).f11732d).accept(rVar.f11752b, taskCompletionSource);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(g0.e(e11));
        } catch (RuntimeException e12) {
            taskCompletionSource.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final i9.c[] f(r rVar) {
        return (i9.c[]) this.f11711b.f11729a;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final boolean g(r rVar) {
        return this.f11711b.f11730b;
    }

    @Override // com.google.android.gms.common.api.internal.y
    public final int h(r rVar) {
        return this.f11711b.f11731c;
    }
}
