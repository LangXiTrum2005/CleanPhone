package gusty;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
/* JADX INFO: loaded from: classes.dex */
public interface saneness extends IInterface {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f27449saneness = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    void wireman(gusty.attabal attabalVar) throws RemoteException;

    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportService.java */
    public static abstract class attabal extends Binder implements saneness {
        public attabal() {
            attachInterface(this, saneness.f27449saneness);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = saneness.f27449saneness;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            wireman(gusty.attabal.AbstractBinderC0627attabal.cutely(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
