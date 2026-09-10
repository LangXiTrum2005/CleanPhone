package mercenary;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: BaseProxy.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal implements IInterface {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final IBinder f33309dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f33310wireman = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public attabal(IBinder iBinder) {
        this.f33309dern = iBinder;
    }

    public final Parcel apical(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f33309dern.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33309dern;
    }

    public final Parcel cutely() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f33310wireman);
        return parcelObtain;
    }
}
