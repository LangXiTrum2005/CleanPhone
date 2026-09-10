package ea;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends k9.f {
    @Override // k9.f
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof g0 ? (g0) iInterfaceQueryLocalInterface : new e0(iBinder);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 12451000;
    }
}
