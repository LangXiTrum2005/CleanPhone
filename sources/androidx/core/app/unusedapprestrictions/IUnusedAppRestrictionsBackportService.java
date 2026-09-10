package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static final String K8 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public final void F(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        public static class Proxy implements IUnusedAppRestrictionsBackportService {
            public IBinder X;

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public final void F(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnusedAppRestrictionsBackportService.K8);
                    parcelObtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.X.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }
        }

        public static IUnusedAppRestrictionsBackportService b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.K8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) {
                return (IUnusedAppRestrictionsBackportService) iInterfaceQueryLocalInterface;
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
            IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback;
            String str = IUnusedAppRestrictionsBackportService.K8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 != 1) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                iUnusedAppRestrictionsBackportCallback = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.J8);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) {
                    IUnusedAppRestrictionsBackportCallback.Stub.Proxy proxy = new IUnusedAppRestrictionsBackportCallback.Stub.Proxy();
                    proxy.X = strongBinder;
                    iUnusedAppRestrictionsBackportCallback = proxy;
                } else {
                    iUnusedAppRestrictionsBackportCallback = (IUnusedAppRestrictionsBackportCallback) iInterfaceQueryLocalInterface;
                }
            }
            F(iUnusedAppRestrictionsBackportCallback);
            return true;
        }
    }

    void F(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);
}
