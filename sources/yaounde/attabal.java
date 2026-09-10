package yaounde;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import mercenary.dern;
import mercenary.saneness;

/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes2.dex */
public interface attabal extends IInterface {

    /* JADX INFO: renamed from: yaounde.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public static abstract class AbstractBinderC0822attabal extends saneness implements attabal {

        /* JADX INFO: renamed from: yaounde.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public static class C0823attabal extends mercenary.attabal implements attabal {
            public C0823attabal(IBinder iBinder) {
                super(iBinder);
            }

            @Override // yaounde.attabal
            public final Bundle saneness(Bundle bundle) throws RemoteException {
                Parcel parcelCutely = cutely();
                dern.saneness(parcelCutely, bundle);
                Parcel parcelApical = apical(parcelCutely);
                Bundle bundle2 = (Bundle) dern.attabal(parcelApical, Bundle.CREATOR);
                parcelApical.recycle();
                return bundle2;
            }
        }

        public static attabal cutely(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof attabal ? (attabal) iInterfaceQueryLocalInterface : new C0823attabal(iBinder);
        }
    }

    Bundle saneness(Bundle bundle) throws RemoteException;
}
