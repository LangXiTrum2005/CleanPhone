package g9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.gms.internal.auth.c implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f41762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, i iVar) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 3);
        this.f41761b = i10;
        this.f41762c = iVar;
    }

    @Override // g9.l
    public void Q(GoogleSignInAccount googleSignInAccount, Status status) {
        switch (this.f41761b) {
            case 0:
                g gVar = (g) this.f41762c;
                if (googleSignInAccount != null) {
                    k kVarJ = k.J(gVar.f41763o);
                    GoogleSignInOptions googleSignInOptions = gVar.f41764p;
                    synchronized (kVarJ) {
                        ((b) kVarJ.f41770b).c(googleSignInAccount, googleSignInOptions);
                        kVarJ.f41771c = googleSignInAccount;
                        kVarJ.f41772d = googleSignInOptions;
                    }
                }
                gVar.J(new f9.c(googleSignInAccount, status));
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // g9.l
    public void U0(Status status) {
        switch (this.f41761b) {
            case 2:
                ((h) this.f41762c).J(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // g9.l
    public void Z0(Status status) {
        switch (this.f41761b) {
            case 1:
                ((h) this.f41762c).J(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.auth.c
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case InterfaceC0435l1.d.b.f29105b /* 101 */:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) w9.b.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) w9.b.a(parcel, Status.CREATOR);
                w9.b.b(parcel);
                Q(googleSignInAccount, status);
                break;
            case InterfaceC0435l1.d.b.f29106c /* 102 */:
                Status status2 = (Status) w9.b.a(parcel, Status.CREATOR);
                w9.b.b(parcel);
                Z0(status2);
                break;
            case InterfaceC0435l1.d.b.f29107d /* 103 */:
                Status status3 = (Status) w9.b.a(parcel, Status.CREATOR);
                w9.b.b(parcel);
                U0(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
