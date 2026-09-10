package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g9.i f11688b;

    public d0(int i10, g9.i iVar) {
        super(i10);
        this.f11688b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void a(Status status) {
        try {
            this.f11688b.N(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f11688b.N(new Status(10, q4.a.j(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void c(n nVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = (Map) nVar.f11737a;
        g9.i iVar = this.f11688b;
        map.put(iVar, boolValueOf);
        iVar.F(new k0(nVar, iVar));
    }

    @Override // com.google.android.gms.common.api.internal.g0
    public final void d(r rVar) throws DeadObjectException {
        try {
            g9.i iVar = this.f11688b;
            j9.c cVar = rVar.f11752b;
            iVar.getClass();
            try {
                iVar.M(cVar);
            } catch (DeadObjectException e10) {
                iVar.N(new Status(8, e10.getLocalizedMessage(), null, null));
                throw e10;
            } catch (RemoteException e11) {
                iVar.N(new Status(8, e11.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }
}
