package g9;

import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import k9.c0;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.google.android.gms.internal.auth.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevocationBoundService f41773b;

    public n(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 3);
        this.f41773b = revocationBoundService;
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        String strE;
        RevocationBoundService revocationBoundService = this.f41773b;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            x1();
            k.J(revocationBoundService).K();
            return true;
        }
        x1();
        b bVarA = b.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = bVarA.b();
        GoogleSignInOptions googleSignInOptionsB = GoogleSignInOptions.f11613k;
        if (googleSignInAccountB != null) {
            String strE2 = bVarA.e("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strE2) || (strE = bVarA.e(b.f("googleSignInOptions", strE2))) == null) {
                googleSignInOptionsB = null;
            } else {
                try {
                    googleSignInOptionsB = GoogleSignInOptions.b(strE);
                } catch (JSONException unused) {
                    googleSignInOptionsB = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsB;
        c0.h(googleSignInOptions);
        f9.a aVar = new f9.a(revocationBoundService, null, e9.a.f39182a, googleSignInOptions, new j9.h(new fd.b(8), Looper.getMainLooper()));
        if (googleSignInAccountB != null) {
            aVar.e();
        } else {
            aVar.f();
        }
        return true;
    }

    public final void x1() {
        if (!p9.c.g(this.f41773b, Binder.getCallingUid())) {
            throw new SecurityException(defpackage.e.h(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
