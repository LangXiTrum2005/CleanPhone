package dirl;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements IInterface {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final IBinder f25247dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f25248wireman;

    public attabal(IBinder iBinder, String str) {
        this.f25247dern = iBinder;
        this.f25248wireman = str;
    }

    public final void apical(int i, Parcel parcel) throws RemoteException {
        try {
            this.f25247dern.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25247dern;
    }

    public final Parcel cutely() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25248wireman);
        return parcelObtain;
    }
}
