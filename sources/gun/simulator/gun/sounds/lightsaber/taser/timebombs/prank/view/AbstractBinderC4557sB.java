package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4557sB extends Binder implements InterfaceC4645tB {
    static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
    static final int TRANSACTION_onSessionEnded = 4;
    static final int TRANSACTION_onVerticalScrollEvent = 2;

    public AbstractBinderC4557sB() {
        attachInterface(this, InterfaceC4645tB.j1);
    }

    public static InterfaceC4645tB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4645tB.j1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC4645tB)) {
            return (InterfaceC4645tB) iInterfaceQueryLocalInterface;
        }
        C4469rB c4469rB = new C4469rB();
        c4469rB.f4921a = iBinder;
        return c4469rB;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = InterfaceC4645tB.j1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 2) {
            onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        } else if (i == 3) {
            onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        } else {
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onSessionEnded(parcel.readInt() != 0, (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        }
        return true;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
