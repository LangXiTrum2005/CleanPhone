package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public abstract class WB extends Binder implements XB {
    static final int TRANSACTION_areNotificationsEnabled = 6;
    static final int TRANSACTION_cancelNotification = 3;
    static final int TRANSACTION_extraCommand = 9;
    static final int TRANSACTION_getActiveNotifications = 5;
    static final int TRANSACTION_getSmallIconBitmap = 7;
    static final int TRANSACTION_getSmallIconId = 4;
    static final int TRANSACTION_notifyNotificationWithChannel = 2;

    public static XB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(XB.o1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof XB)) {
            return (XB) iInterfaceQueryLocalInterface;
        }
        VB vb = new VB();
        vb.f3863a = iBinder;
        return vb;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = XB.o1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                Bundle bundleNotifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) AbstractC2845Vx.G(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC2845Vx.H(parcel2, bundleNotifyNotificationWithChannel, 1);
                return true;
            case 3:
                cancelNotification((Bundle) AbstractC2845Vx.G(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                int smallIconId = getSmallIconId();
                parcel2.writeNoException();
                parcel2.writeInt(smallIconId);
                return true;
            case 5:
                Bundle activeNotifications = getActiveNotifications();
                parcel2.writeNoException();
                AbstractC2845Vx.H(parcel2, activeNotifications, 1);
                return true;
            case 6:
                Bundle bundleAreNotificationsEnabled = areNotificationsEnabled((Bundle) AbstractC2845Vx.G(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC2845Vx.H(parcel2, bundleAreNotificationsEnabled, 1);
                return true;
            case 7:
                Bundle smallIconBitmap = getSmallIconBitmap();
                parcel2.writeNoException();
                AbstractC2845Vx.H(parcel2, smallIconBitmap, 1);
                return true;
            case 8:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 9:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) AbstractC2845Vx.G(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                parcel2.writeNoException();
                AbstractC2845Vx.H(parcel2, bundleExtraCommand, 1);
                return true;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
