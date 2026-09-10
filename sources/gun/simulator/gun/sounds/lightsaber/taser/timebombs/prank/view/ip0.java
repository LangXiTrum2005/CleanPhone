package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ip0 implements pp0, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f4522a;

    public ip0(IBinder iBinder) {
        this.f4522a = iBinder;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pp0
    public final void a(String str, Bundle bundle, com.google.android.play.core.review.c cVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i = hp0.f4474a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(cVar);
        try {
            this.f4522a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4522a;
    }
}
