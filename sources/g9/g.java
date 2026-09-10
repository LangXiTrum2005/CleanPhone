package g9;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.v;
import com.ironsource.InterfaceC0435l1;
import j9.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f41763o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ GoogleSignInOptions f41764p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v vVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(vVar);
        this.f41763o = context;
        this.f41764p = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ o G(Status status) {
        return new f9.c(null, status);
    }

    @Override // g9.i
    public final void M(j9.c cVar) {
        m mVar = (m) ((e) cVar).getService();
        f fVar = new f(0, this);
        mVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(mVar.f22790c);
        int i10 = w9.b.f53001a;
        parcelObtain.writeStrongBinder(fVar);
        GoogleSignInOptions googleSignInOptions = this.f41764p;
        if (googleSignInOptions == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            googleSignInOptions.writeToParcel(parcelObtain, 0);
        }
        mVar.q(parcelObtain, InterfaceC0435l1.d.b.f29105b);
    }
}
