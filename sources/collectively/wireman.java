package collectively;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman extends attabal implements beachfront {
    public wireman(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // collectively.beachfront
    public final void marial(String str, Bundle bundle, impromptu impromptuVar) throws RemoteException {
        Parcel parcelCutely = cutely();
        parcelCutely.writeString(str);
        int i = dern.f15811attabal;
        parcelCutely.writeInt(1);
        bundle.writeToParcel(parcelCutely, 0);
        parcelCutely.writeStrongBinder(impromptuVar);
        apical(2, parcelCutely);
    }
}
