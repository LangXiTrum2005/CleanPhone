package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class JB extends Binder implements KB {
    static final int TRANSACTION_cancel = 2;
    static final int TRANSACTION_cancelAll = 3;
    static final int TRANSACTION_notify = 1;

    public static KB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(KB.k1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof KB)) {
            return (KB) iInterfaceQueryLocalInterface;
        }
        IB ib = new IB();
        ib.f3207a = iBinder;
        return ib;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = KB.k1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            notify(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
        } else if (i == 2) {
            cancel(parcel.readString(), parcel.readInt(), parcel.readString());
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            cancelAll(parcel.readString());
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
