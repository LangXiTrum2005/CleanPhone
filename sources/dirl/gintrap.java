package dirl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gintrap extends kowloon implements rotuma {
    public gintrap() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // dirl.kowloon
    public final boolean cutely(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) arytenoidectomy.attabal(parcel, Bundle.CREATOR);
        arytenoidectomy.saneness(parcel);
        dern(bundle);
        return true;
    }
}
