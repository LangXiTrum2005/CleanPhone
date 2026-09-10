package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
/* JADX INFO: loaded from: classes.dex */
public interface dern extends IInterface {
    void competently(int i, String[] strArr) throws RemoteException;

    int impromptu(saneness sanenessVar, String str) throws RemoteException;

    void taiyuan(saneness sanenessVar, int i) throws RemoteException;

    /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
    public static abstract class attabal extends Binder implements dern {

        /* JADX INFO: renamed from: androidx.room.dern$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IMultiInstanceInvalidationService.java */
        public static class C0100attabal implements dern {

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public IBinder f13579dern;

            public C0100attabal(IBinder iBinder) {
                this.f13579dern = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f13579dern;
            }

            @Override // androidx.room.dern
            public void competently(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.f13579dern.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.dern
            public int impromptu(saneness sanenessVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(sanenessVar != null ? sanenessVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    this.f13579dern.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.dern
            public void taiyuan(saneness sanenessVar, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    parcelObtain.writeStrongBinder(sanenessVar != null ? sanenessVar.asBinder() : null);
                    parcelObtain.writeInt(i);
                    this.f13579dern.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public attabal() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static dern cutely(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dern)) ? new C0100attabal(iBinder) : (dern) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int iImpromptu = impromptu(saneness.attabal.cutely(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iImpromptu);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                taiyuan(saneness.attabal.cutely(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                competently(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
