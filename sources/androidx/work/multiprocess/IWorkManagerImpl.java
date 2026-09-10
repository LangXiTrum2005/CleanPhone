package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IWorkManagerImpl extends IInterface {

    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        public static class Proxy implements IWorkManagerImpl {
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
            if (i2 == 1598968902) {
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImpl");
                return true;
            }
            switch (i2) {
                case 1:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    D();
                    return true;
                case 2:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    P();
                    return true;
                case 3:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    u();
                    return true;
                case 4:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    d();
                    return true;
                case 5:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    c();
                    return true;
                case 6:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    I();
                    return true;
                case 7:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    k();
                    return true;
                case 8:
                    parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImpl");
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.b0(parcel.readStrongBinder());
                    e();
                    return true;
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
            }
        }
    }

    void D();

    void I();

    void P();

    void c();

    void d();

    void e();

    void k();

    void u();
}
