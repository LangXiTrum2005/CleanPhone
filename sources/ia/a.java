package ia;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.consent_sdk.x;
import j9.j;
import j9.k;
import k9.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements j9.c {
    public final boolean G;
    public final x H;
    public final Bundle I;
    public final Integer J;

    public a(Context context, Looper looper, x xVar, Bundle bundle, j jVar, k kVar) {
        super(context, looper, 44, xVar, jVar, kVar, 0);
        this.G = true;
        this.H = xVar;
        this.I = bundle;
        this.J = (Integer) xVar.f23265f;
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 4);
    }

    @Override // k9.f
    public final Bundle c() {
        x xVar = this.H;
        boolean zEquals = getContext().getPackageName().equals((String) xVar.f23262c);
        Bundle bundle = this.I;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) xVar.f23262c);
        }
        return bundle;
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // k9.f, j9.c
    public final boolean requiresSignIn() {
        return this.G;
    }
}
