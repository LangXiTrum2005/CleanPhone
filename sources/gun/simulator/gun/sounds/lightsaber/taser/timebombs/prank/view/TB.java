package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class TB extends Binder implements UB {
    static final int TRANSACTION_onExtraCallback = 2;

    public static UB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(UB.n1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof UB)) {
            return (UB) iInterfaceQueryLocalInterface;
        }
        SB sb = new SB();
        sb.f3706a = iBinder;
        return sb;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = UB.n1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 2) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        onExtraCallback(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
