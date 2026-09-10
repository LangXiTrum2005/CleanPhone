package dirl;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside extends attabal implements dovishness {
    public graveside(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dirl.dovishness
    public final void beachfront(Bundle bundle, rotuma rotumaVar) throws RemoteException {
        Parcel parcelCutely = cutely();
        arytenoidectomy.dern(parcelCutely, bundle);
        parcelCutely.writeStrongBinder(rotumaVar);
        apical(2, parcelCutely);
    }
}
