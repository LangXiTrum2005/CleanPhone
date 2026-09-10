package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4294pB extends Binder implements InterfaceC4382qB {
    static final int TRANSACTION_extraCommand = 5;
    static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
    static final int TRANSACTION_mayLaunchUrl = 4;
    static final int TRANSACTION_newSession = 3;
    static final int TRANSACTION_newSessionWithExtras = 10;
    static final int TRANSACTION_postMessage = 8;
    static final int TRANSACTION_receiveFile = 12;
    static final int TRANSACTION_requestPostMessageChannel = 7;
    static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
    static final int TRANSACTION_setEngagementSignalsCallback = 14;
    static final int TRANSACTION_updateVisuals = 6;
    static final int TRANSACTION_validateRelationship = 9;
    static final int TRANSACTION_warmup = 2;

    public AbstractBinderC4294pB() {
        attachInterface(this, InterfaceC4382qB.i1);
    }

    public static InterfaceC4382qB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4382qB.i1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC4382qB)) {
            return (InterfaceC4382qB) iInterfaceQueryLocalInterface;
        }
        C4206oB c4206oB = new C4206oB();
        c4206oB.f4783a = iBinder;
        return c4206oB;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = InterfaceC4382qB.i1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                boolean zWarmup = warmup(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(zWarmup ? 1 : 0);
                return true;
            case 3:
                boolean zNewSession = newSession(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSession ? 1 : 0);
                return true;
            case 4:
                InterfaceC4118nB interfaceC4118nBAsInterface = AbstractBinderC4030mB.asInterface(parcel.readStrongBinder());
                Uri uri = (Uri) AbstractC2340Cl.e(parcel, Uri.CREATOR);
                Parcelable.Creator creator = Bundle.CREATOR;
                boolean zMayLaunchUrl = mayLaunchUrl(interfaceC4118nBAsInterface, uri, (Bundle) AbstractC2340Cl.e(parcel, creator), parcel.createTypedArrayList(creator));
                parcel2.writeNoException();
                parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                return true;
            case 5:
                Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC2340Cl.X(parcel2, bundleExtraCommand, 1);
                return true;
            case 6:
                boolean zUpdateVisuals = updateVisuals(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                return true;
            case 7:
                boolean zRequestPostMessageChannel = requestPostMessageChannel(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Uri) AbstractC2340Cl.e(parcel, Uri.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                return true;
            case 8:
                int iPostMessage = postMessage(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iPostMessage);
                return true;
            case 9:
                boolean zValidateRelationship = validateRelationship(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) AbstractC2340Cl.e(parcel, Uri.CREATOR), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zValidateRelationship ? 1 : 0);
                return true;
            case 10:
                boolean zNewSessionWithExtras = newSessionWithExtras(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                return true;
            case 11:
                boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Uri) AbstractC2340Cl.e(parcel, Uri.CREATOR), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                return true;
            case 12:
                boolean zReceiveFile = receiveFile(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Uri) AbstractC2340Cl.e(parcel, Uri.CREATOR), parcel.readInt(), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zReceiveFile ? 1 : 0);
                return true;
            case 13:
                boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                return true;
            case 14:
                boolean engagementSignalsCallback = setEngagementSignalsCallback(AbstractBinderC4030mB.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) AbstractC2340Cl.e(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
