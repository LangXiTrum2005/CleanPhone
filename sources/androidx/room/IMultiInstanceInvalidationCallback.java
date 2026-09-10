package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String N8 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public final void f(String[] strArr) {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        public static class Proxy implements IMultiInstanceInvalidationCallback {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public final void f(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.N8);
                    parcelObtain.writeStringArray(strArr);
                    this.X.transact(1, parcelObtain, null, 1);
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
            String str = IMultiInstanceInvalidationCallback.N8;
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
            ((MultiInstanceInvalidationClient$invalidationCallback$1) this).f(parcel.createStringArray());
            return true;
        }
    }

    void f(String[] strArr);
}
