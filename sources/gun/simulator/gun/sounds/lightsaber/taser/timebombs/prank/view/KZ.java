package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class KZ extends Binder implements QB {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f3318a;

    public KZ(ResultReceiver resultReceiver) {
        this.f3318a = resultReceiver;
        attachInterface(this, QB.m1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QB
    public final void b(int i, Bundle bundle) {
        ResultReceiver resultReceiver = this.f3318a;
        Handler handler = resultReceiver.b;
        if (handler != null) {
            handler.post(new LZ(resultReceiver, i, bundle));
        } else {
            resultReceiver.b(i, bundle);
        }
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = QB.m1;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        b(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
