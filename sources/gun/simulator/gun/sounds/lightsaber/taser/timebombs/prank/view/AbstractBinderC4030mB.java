package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC4030mB extends Binder implements InterfaceC4118nB {
    static final int TRANSACTION_extraCallback = 3;
    static final int TRANSACTION_extraCallbackWithResult = 7;
    static final int TRANSACTION_onActivityLayout = 10;
    static final int TRANSACTION_onActivityResized = 8;
    static final int TRANSACTION_onMessageChannelReady = 4;
    static final int TRANSACTION_onMinimized = 11;
    static final int TRANSACTION_onNavigationEvent = 2;
    static final int TRANSACTION_onPostMessage = 5;
    static final int TRANSACTION_onRelationshipValidationResult = 6;
    static final int TRANSACTION_onUnminimized = 12;
    static final int TRANSACTION_onWarmupCompleted = 9;

    public AbstractBinderC4030mB() {
        attachInterface(this, InterfaceC4118nB.h1);
    }

    public static InterfaceC4118nB asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC4118nB.h1);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC4118nB)) {
            return (InterfaceC4118nB) iInterfaceQueryLocalInterface;
        }
        C3942lB c3942lB = new C3942lB();
        c3942lB.f4639a = iBinder;
        return c3942lB;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String str = InterfaceC4118nB.h1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i) {
            case 2:
                onNavigationEvent(parcel.readInt(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 3:
                extraCallback(parcel.readString(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 4:
                onMessageChannelReady((Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                onPostMessage(parcel.readString(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 6:
                onRelationshipValidationResult(parcel.readInt(), (Uri) AbstractC2871Wx.K(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 7:
                Bundle bundleExtraCallbackWithResult = extraCallbackWithResult(parcel.readString(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                AbstractC2871Wx.L(parcel2, bundleExtraCallbackWithResult, 1);
                return true;
            case 8:
                onActivityResized(parcel.readInt(), parcel.readInt(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 9:
                onWarmupCompleted((Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 10:
                onActivityLayout(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 11:
                onMinimized((Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            case 12:
                onUnminimized((Bundle) AbstractC2871Wx.K(parcel, Bundle.CREATOR));
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    public IBinder asBinder() {
        return this;
    }
}
