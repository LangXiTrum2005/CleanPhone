package c9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f5960a;

    public a(IBinder iBinder) {
        this.f5960a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5960a;
    }

    public final Bundle q(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i10 = n8.a.f46625a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            try {
                this.f5960a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                parcelObtain.recycle();
                Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
                parcelObtain2.recycle();
                return bundle2;
            } catch (RuntimeException e10) {
                parcelObtain2.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
