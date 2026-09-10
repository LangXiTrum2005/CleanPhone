package w9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.consent_sdk.x;
import ea.f2;
import k9.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public final e9.b G;

    public c(Context context, Looper looper, x xVar, e9.b bVar, r rVar, r rVar2) {
        super(context, looper, 68, xVar, rVar, rVar2, 0);
        bVar = bVar == null ? e9.b.f39183c : bVar;
        f2 f2Var = new f2(10, false);
        f2Var.f39409b = Boolean.FALSE;
        e9.b bVar2 = e9.b.f39183c;
        bVar.getClass();
        f2Var.f39409b = Boolean.valueOf(bVar.f39184a);
        f2Var.f39410c = bVar.f39185b;
        byte[] bArr = new byte[16];
        a.f53000a.nextBytes(bArr);
        f2Var.f39410c = Base64.encodeToString(bArr, 11);
        this.G = new e9.b(f2Var);
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 3);
    }

    @Override // k9.f
    public final Bundle c() {
        e9.b bVar = this.G;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f39184a);
        bundle.putString("log_session_id", bVar.f39185b);
        return bundle;
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 12800000;
    }
}
