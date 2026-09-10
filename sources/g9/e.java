package g9;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.consent_sdk.x;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends k9.i {
    public final GoogleSignInOptions G;

    public e(Context context, Looper looper, x xVar, GoogleSignInOptions googleSignInOptions, r rVar, r rVar2) {
        super(context, looper, 91, xVar, rVar, rVar2, 0);
        Set<Scope> set = (Set) xVar.f23261b;
        f9.b bVar = googleSignInOptions != null ? new f9.b(googleSignInOptions) : new f9.b();
        byte[] bArr = new byte[16];
        w9.a.f53000a.nextBytes(bArr);
        bVar.f40710i = Base64.encodeToString(bArr, 11);
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f40702a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.G = bVar.a();
    }

    @Override // k9.f
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof m ? (m) iInterfaceQueryLocalInterface : new m(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 3);
    }

    @Override // k9.f
    public final String e() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // k9.f
    public final String f() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // k9.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // k9.f
    public final Intent getSignInIntent() {
        return j.a(getContext(), this.G);
    }

    @Override // k9.f
    public final boolean providesSignIn() {
        return true;
    }
}
