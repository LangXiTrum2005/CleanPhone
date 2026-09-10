package k9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f44532a;

    public y(IBinder iBinder) {
        this.f44532a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f44532a;
    }

    public final void q(g0 g0Var, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(g0Var);
            parcelObtain.writeInt(1);
            f9.d.a(hVar, parcelObtain, 0);
            this.f44532a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
