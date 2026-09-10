package m9;

import android.os.IBinder;
import android.os.IInterface;
import k9.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new b(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 4);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // k9.f
    public final boolean g() {
        return true;
    }

    @Override // k9.f
    public final i9.c[] getApiFeatures() {
        return x9.b.f53676c;
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 253600000;
    }
}
