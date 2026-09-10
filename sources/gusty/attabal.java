package gusty;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
/* JADX INFO: loaded from: classes.dex */
public interface attabal extends IInterface {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final String f27447attabal = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: renamed from: gusty.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
    public static abstract class AbstractBinderC0627attabal extends Binder implements attabal {

        /* JADX INFO: renamed from: gusty.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IUnusedAppRestrictionsBackportCallback.java */
        public static class C0628attabal implements attabal {

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public IBinder f27448dern;

            public C0628attabal(IBinder iBinder) {
                this.f27448dern = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f27448dern;
            }
        }

        public static attabal cutely(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(attabal.f27447attabal);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof attabal)) ? new C0628attabal(iBinder) : (attabal) iInterfaceQueryLocalInterface;
        }
    }
}
