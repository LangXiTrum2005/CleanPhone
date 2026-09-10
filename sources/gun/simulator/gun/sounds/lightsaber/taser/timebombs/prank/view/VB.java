package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class VB implements XB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f3863a;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final Bundle areNotificationsEnabled(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            AbstractC2845Vx.H(parcelObtain, bundle, 0);
            this.f3863a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2845Vx.G(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3863a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final void cancelNotification(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            AbstractC2845Vx.H(parcelObtain, bundle, 0);
            this.f3863a.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final Bundle extraCommand(String str, Bundle bundle, IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            parcelObtain.writeString(str);
            AbstractC2845Vx.H(parcelObtain, bundle, 0);
            parcelObtain.writeStrongBinder(iBinder);
            this.f3863a.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2845Vx.G(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final Bundle getActiveNotifications() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            this.f3863a.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2845Vx.G(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final Bundle getSmallIconBitmap() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            this.f3863a.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2845Vx.G(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final int getSmallIconId() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            this.f3863a.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XB
    public final Bundle notifyNotificationWithChannel(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(XB.o1);
            AbstractC2845Vx.H(parcelObtain, bundle, 0);
            this.f3863a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) AbstractC2845Vx.G(parcelObtain2, Bundle.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
