package collectively;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements IInterface {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final IBinder f15808dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f15809wireman = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public attabal(IBinder iBinder, String str) {
        this.f15808dern = iBinder;
    }

    public final void apical(int i, Parcel parcel) throws RemoteException {
        try {
            this.f15808dern.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15808dern;
    }

    public final Parcel cutely() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f15809wireman);
        return parcelObtain;
    }
}
