package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class SB implements UB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f3706a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3706a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UB
    public final void onExtraCallback(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(UB.n1);
            parcelObtain.writeString(str);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f3706a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
