package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class IB implements KB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f3207a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3207a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KB
    public final void cancel(String str, int i, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(KB.k1);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            this.f3207a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KB
    public final void cancelAll(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(KB.k1);
            parcelObtain.writeString(str);
            this.f3207a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KB
    public final void notify(String str, int i, String str2, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(KB.k1);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f3207a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
