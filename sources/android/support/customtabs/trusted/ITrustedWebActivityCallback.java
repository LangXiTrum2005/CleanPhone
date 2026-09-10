package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityCallback extends IInterface {
    public static final String H8 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', '.');

    public static class Default implements ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class Proxy implements ITrustedWebActivityCallback {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }
        }

        public static ITrustedWebActivityCallback b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.H8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) {
                return (ITrustedWebActivityCallback) iInterfaceQueryLocalInterface;
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
            String str = ITrustedWebActivityCallback.H8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 2) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            parcel.readString();
            B();
            throw null;
        }
    }

    public static class _Parcel {
    }

    void B();
}
