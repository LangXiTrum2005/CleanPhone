package saneness;

import ads_mobile_sdk.fl;
import ads_mobile_sdk.x23;
import ads_mobile_sdk.ya0;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ayutthaya extends fl implements canonical {
    public ayutthaya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void cutely(ya0 ya0Var, x23 x23Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        int i = estragon.f37140attabal;
        parcelObtain.writeInt(1);
        ya0Var.writeToParcel(parcelObtain, 0);
        if (x23Var == null) {
            parcelObtain.writeStrongBinder(null);
        } else {
            parcelObtain.writeStrongBinder(x23Var);
        }
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            this.a.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
