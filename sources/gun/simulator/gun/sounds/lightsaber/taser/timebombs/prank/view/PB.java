package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class PB implements QB {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f3542a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3542a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QB
    public final void b(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(QB.m1);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f3542a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
