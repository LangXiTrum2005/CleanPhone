package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IPostMessageService extends IInterface {
    public static final String G8 = "android$support$customtabs$IPostMessageService".replace('$', '.');

    public static class Default implements IPostMessageService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IPostMessageService
        public final void j(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            throw null;
        }
    }

    public static abstract class Stub extends Binder implements IPostMessageService {

        public static class Proxy implements IPostMessageService {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.customtabs.IPostMessageService
            public final void j(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                throw null;
            }
        }

        public static IPostMessageService b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.G8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IPostMessageService)) {
                return (IPostMessageService) iInterfaceQueryLocalInterface;
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
            String str = IPostMessageService.G8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 2) {
                j(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            }
            if (i2 != 3) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            K(ICustomTabsCallback.Stub.b0(parcel.readStrongBinder()), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class _Parcel {
    }

    void K(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    void j(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);
}
