package f9;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import j9.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f40711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f40712b;

    public c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f40712b = googleSignInAccount;
        this.f40711a = status;
    }

    @Override // j9.o
    public final Status getStatus() {
        return this.f40711a;
    }
}
