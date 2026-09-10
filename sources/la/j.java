package la;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.adjust.sdk.google.lvl.LicenseChecker;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45258b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f45257a = i10;
        this.f45258b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f45257a) {
            case 0:
                k kVar = (k) this.f45258b;
                kVar.f45261b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                kVar.a().post(new ka.d(this, iBinder));
                break;
            default:
                LicenseChecker licenseChecker = (LicenseChecker) this.f45258b;
                licenseChecker.logger.debug("LVL service connected", new Object[0]);
                licenseChecker.mServiceBinder = iBinder;
                licenseChecker.mBound = true;
                licenseChecker.retryCount = 0;
                try {
                    licenseChecker.mServiceBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: v5.a
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            LicenseChecker licenseChecker2 = (LicenseChecker) this.f52480a.f45258b;
                            licenseChecker2.logger.error("LVL binder died unexpectedly", new Object[0]);
                            licenseChecker2.mCallback.onError(-6);
                            licenseChecker2.onDestroy();
                        }
                    }, 0);
                } catch (RemoteException e10) {
                    licenseChecker.logger.error("LVL failed to link binder death recipient", e10);
                }
                licenseChecker.executeLicenseCheck();
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f45257a) {
            case 0:
                k kVar = (k) this.f45258b;
                kVar.f45261b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                kVar.a().post(new i(this, 1));
                break;
            default:
                LicenseChecker licenseChecker = (LicenseChecker) this.f45258b;
                licenseChecker.logger.debug("LVL service disconnected", new Object[0]);
                licenseChecker.mServiceBinder = null;
                licenseChecker.mBound = false;
                break;
        }
    }
}
