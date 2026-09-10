package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IEngagementSignalsCallback extends IInterface {
    public static final String F8 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    public static class Default implements IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onSessionEnded(boolean z2, Bundle bundle) {
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void onVerticalScrollEvent(boolean z2, Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        public static class Proxy implements IEngagementSignalsCallback {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void onGreatestScrollPercentageIncreased(int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.F8);
                    parcelObtain.writeInt(i2);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.X.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void onSessionEnded(boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.F8);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.X.transact(4, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void onVerticalScrollEvent(boolean z2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IEngagementSignalsCallback.F8);
                    parcelObtain.writeInt(z2 ? 1 : 0);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.X.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static IEngagementSignalsCallback b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.F8);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) {
                return (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
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
            String str = IEngagementSignalsCallback.F8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i2 == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                return true;
            }
            if (i2 == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                return true;
            }
            if (i2 != 4) {
                return super.onTransact(i2, parcel, parcel2, i3);
            }
            onSessionEnded(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }

    public static class _Parcel {
    }

    void onGreatestScrollPercentageIncreased(int i2, Bundle bundle);

    void onSessionEnded(boolean z2, Bundle bundle);

    void onVerticalScrollEvent(boolean z2, Bundle bundle);
}
