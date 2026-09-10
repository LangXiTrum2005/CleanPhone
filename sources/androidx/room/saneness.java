package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface saneness extends IInterface {
    void attabal(String[] strArr) throws RemoteException;

    /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
    public static abstract class attabal extends Binder implements saneness {

        /* JADX INFO: renamed from: androidx.room.saneness$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMultiInstanceInvalidationCallback.java */
        public static class C0103attabal implements saneness {

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public IBinder f13601dern;

            public C0103attabal(IBinder iBinder) {
                this.f13601dern = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13601dern;
            }

            @Override // androidx.room.saneness
            public void attabal(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.f13601dern.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public attabal() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static saneness cutely(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof saneness)) ? new C0103attabal(iBinder) : (saneness) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                attabal(parcel.createStringArray());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
