package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IWorkManagerImplCallback extends IInterface {

    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        public static class Proxy implements IWorkManagerImplCallback {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }
        }

        public static IWorkManagerImplCallback b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.X = iBinder;
            return proxy;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
                parcel.createByteArray();
                onSuccess();
                return true;
            }
            if (i2 != 2) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("androidx.work.multiprocess.IWorkManagerImplCallback");
                return true;
            }
            parcel.enforceInterface("androidx.work.multiprocess.IWorkManagerImplCallback");
            parcel.readString();
            onFailure();
            return true;
        }
    }

    void onFailure();

    void onSuccess();
}
