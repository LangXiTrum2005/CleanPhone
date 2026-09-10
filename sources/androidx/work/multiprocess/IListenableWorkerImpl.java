package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IListenableWorkerImpl extends IInterface {

    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        public static class Proxy implements IListenableWorkerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                n();
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.work.multiprocess.IListenableWorkerImpl");
                return true;
            }
            parcel.enforceInterface("androidx.work.multiprocess.IListenableWorkerImpl");
            parcel.createByteArray();
            IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
            z();
            return true;
        }
    }

    void n();

    void z();
}
