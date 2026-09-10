package y9;

import android.os.IBinder;
import android.os.IInterface;
import h9.f;
import k9.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {
    @Override // k9.f
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // k9.f
    public final i9.c[] getApiFeatures() {
        return f.f42267b;
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 261200000;
    }

    @Override // k9.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
