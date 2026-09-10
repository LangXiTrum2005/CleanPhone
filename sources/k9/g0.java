package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f44436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44437c;

    public g0(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 5);
        this.f44436b = fVar;
        this.f44437c = i10;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean v1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) z9.g.a(parcel, Bundle.CREATOR);
            z9.g.c(parcel);
            c0.i(this.f44436b, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar = this.f44436b;
            int i12 = this.f44437c;
            fVar.getClass();
            i0 i0Var = new i0(fVar, i11, strongBinder, bundle);
            f0 f0Var = fVar.l;
            f0Var.sendMessage(f0Var.obtainMessage(1, i12, -1, i0Var));
            this.f44436b = null;
        } else if (i10 == 2) {
            parcel.readInt();
            z9.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) z9.g.a(parcel, k0.CREATOR);
            z9.g.c(parcel);
            f fVar2 = this.f44436b;
            c0.i(fVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            c0.h(k0Var);
            fVar2.C = k0Var;
            if (fVar2.usesClientTelemetry()) {
                g gVar = k0Var.f44470d;
                m mVarB = m.b();
                n nVar = gVar == null ? null : gVar.f44430a;
                synchronized (mVarB) {
                    try {
                        if (nVar == null) {
                            nVar = m.f44476c;
                        } else {
                            n nVar2 = (n) mVarB.f44477a;
                            if (nVar2 == null || nVar2.f44485a < nVar.f44485a) {
                            }
                        }
                        mVarB.f44477a = nVar;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Bundle bundle2 = k0Var.f44467a;
            c0.i(this.f44436b, "onPostInitComplete can be called only once per call to getRemoteService");
            f fVar3 = this.f44436b;
            int i14 = this.f44437c;
            fVar3.getClass();
            i0 i0Var2 = new i0(fVar3, i13, strongBinder2, bundle2);
            f0 f0Var2 = fVar3.l;
            f0Var2.sendMessage(f0Var2.obtainMessage(1, i14, -1, i0Var2));
            this.f44436b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
