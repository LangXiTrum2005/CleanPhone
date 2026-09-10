package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityService extends IInterface {
    public static final String I8 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    public static class Default implements ITrustedWebActivityService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class Proxy implements ITrustedWebActivityService {
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
            String str = ITrustedWebActivityService.I8;
            if (i2 >= 1 && i2 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i2 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i2) {
                case 2:
                    Bundle bundleT = t((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundleT.writeToParcel(parcel2, 1);
                    return true;
                case 3:
                    R((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iM = M();
                    parcel2.writeNoException();
                    parcel2.writeInt(iM);
                    return true;
                case 5:
                    Bundle bundleC = C();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundleC.writeToParcel(parcel2, 1);
                    return true;
                case 6:
                    Bundle bundleN = N((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundleN.writeToParcel(parcel2, 1);
                    return true;
                case 7:
                    Bundle bundleP = p();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    bundleP.writeToParcel(parcel2, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i2, parcel, parcel2, i3);
                case 9:
                    parcel.readString();
                    A(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
            }
        }
    }

    public static class _Parcel {
    }

    void A(IBinder iBinder);

    Bundle C();

    int M();

    Bundle N(Bundle bundle);

    void R(Bundle bundle);

    Bundle p();

    Bundle t(Bundle bundle);
}
