package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f44455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f44456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f44456h = fVar;
        this.f44455g = iBinder;
    }

    @Override // k9.x
    public final boolean a() {
        IBinder iBinder = this.f44455g;
        try {
            c0.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f44456h;
            String strE = fVar.e();
            b bVar = fVar.f44423u;
            if (!strE.equals(interfaceDescriptor)) {
                String strE2 = fVar.e();
                Log.w("GmsClient", d5.u.h(new StringBuilder(strE2.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", strE2, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface iInterfaceA = fVar.a(iBinder);
            if (iInterfaceA == null || !(fVar.h(2, 4, iInterfaceA) || fVar.h(3, 4, iInterfaceA))) {
                return false;
            }
            fVar.A = null;
            Bundle connectionHint = fVar.getConnectionHint();
            if (bVar == null) {
                return true;
            }
            bVar.d(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // k9.x
    public final void b(ConnectionResult connectionResult) {
        f fVar = this.f44456h;
        c cVar = fVar.f44424v;
        if (cVar != null) {
            cVar.r(connectionResult);
        }
        fVar.f44407d = connectionResult.f11641b;
        fVar.f44408e = System.currentTimeMillis();
    }
}
