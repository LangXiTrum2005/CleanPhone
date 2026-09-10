package g9;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.ironsource.InterfaceC0435l1;
import j9.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f41765o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j9.l lVar, int i10) {
        super(lVar);
        this.f41765o = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ o G(Status status) {
        int i10 = this.f41765o;
        return status;
    }

    @Override // g9.i
    public final void M(j9.c cVar) {
        switch (this.f41765o) {
            case 0:
                e eVar = (e) cVar;
                m mVar = (m) eVar.getService();
                f fVar = new f(1, this);
                GoogleSignInOptions googleSignInOptions = eVar.G;
                mVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(mVar.f22790c);
                int i10 = w9.b.f53001a;
                parcelObtain.writeStrongBinder(fVar);
                if (googleSignInOptions == null) {
                    parcelObtain.writeInt(0);
                } else {
                    parcelObtain.writeInt(1);
                    googleSignInOptions.writeToParcel(parcelObtain, 0);
                }
                mVar.q(parcelObtain, InterfaceC0435l1.d.b.f29106c);
                break;
            default:
                e eVar2 = (e) cVar;
                m mVar2 = (m) eVar2.getService();
                f fVar2 = new f(2, this);
                GoogleSignInOptions googleSignInOptions2 = eVar2.G;
                mVar2.getClass();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(mVar2.f22790c);
                int i11 = w9.b.f53001a;
                parcelObtain2.writeStrongBinder(fVar2);
                if (googleSignInOptions2 == null) {
                    parcelObtain2.writeInt(0);
                } else {
                    parcelObtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(parcelObtain2, 0);
                }
                mVar2.q(parcelObtain2, InterfaceC0435l1.d.b.f29107d);
                break;
        }
    }
}
