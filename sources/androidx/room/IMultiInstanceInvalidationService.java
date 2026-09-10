package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String O8 = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static class Default implements IMultiInstanceInvalidationService {
        @Override // androidx.room.IMultiInstanceInvalidationService
        public final int E(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            return 0;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void Z(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void y(int i2, String[] strArr) {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        public static final /* synthetic */ int X = 0;

        public static class Proxy implements IMultiInstanceInvalidationService {
            public IBinder X;

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final int E(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.O8);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeString(str);
                    this.X.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final void Z(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.O8);
                    parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
                    parcelObtain.writeInt(i2);
                    this.X.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final void y(int i2, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.O8);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeStringArray(strArr);
                    this.X.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            String str = IMultiInstanceInvalidationService.O8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback = null;
            IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback2 = null;
            if (i2 == 1) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.N8);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                        IMultiInstanceInvalidationCallback.Stub.Proxy proxy = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                        proxy.X = strongBinder;
                        iMultiInstanceInvalidationCallback = proxy;
                    } else {
                        iMultiInstanceInvalidationCallback = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
                    }
                }
                int iE = ((MultiInstanceInvalidationService$binder$1) this).E(iMultiInstanceInvalidationCallback, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iE);
                return true;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                ((MultiInstanceInvalidationService$binder$1) this).y(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.N8);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                    IMultiInstanceInvalidationCallback.Stub.Proxy proxy2 = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                    proxy2.X = strongBinder2;
                    iMultiInstanceInvalidationCallback2 = proxy2;
                } else {
                    iMultiInstanceInvalidationCallback2 = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
                }
            }
            ((MultiInstanceInvalidationService$binder$1) this).Z(iMultiInstanceInvalidationCallback2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
    }

    int E(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str);

    void Z(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2);

    void y(int i2, String[] strArr);
}
