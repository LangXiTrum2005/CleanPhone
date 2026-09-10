package com.facebook.ppml.receiver;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public interface IReceiverService extends IInterface {

    public static class Default implements IReceiverService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // com.facebook.ppml.receiver.IReceiverService
        public final int b(Bundle bundle) {
            return 0;
        }
    }

    public static abstract class Stub extends Binder implements IReceiverService {
        public static final /* synthetic */ int X = 0;

        public static class Proxy implements IReceiverService {
            public IBinder X;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.X;
            }

            @Override // com.facebook.ppml.receiver.IReceiverService
            public final int b(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    if (!this.X.transact(1, parcelObtain, parcelObtain2, 0)) {
                        int i2 = Stub.X;
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static IReceiverService b0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IReceiverService)) {
                return (IReceiverService) iInterfaceQueryLocalInterface;
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
            if (i2 != 1) {
                if (i2 != 1598968902) {
                    return super.onTransact(i2, parcel, parcel2, i3);
                }
                parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                return true;
            }
            parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
            int iB = b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeInt(iB);
            return true;
        }
    }

    int b(Bundle bundle);
}
