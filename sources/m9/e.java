package m9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.consent_sdk.x;
import k9.i;
import k9.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public final q G;

    public e(Context context, Looper looper, x xVar, q qVar, r rVar, r rVar2) {
        super(context, looper, 270, xVar, rVar, rVar2, 0);
        this.G = qVar;
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 4);
    }

    @Override // k9.f
    public final Bundle c() {
        q qVar = this.G;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.f44503a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.common.telemetry.service.START";
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
        return 203400000;
    }
}
