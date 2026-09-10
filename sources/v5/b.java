package v5;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.adjust.sdk.google.lvl.LicenseChecker;
import com.adjust.sdk.google.lvl.LicenseResponseHandler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Binder implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LicenseChecker f52481a;

    public b(LicenseChecker licenseChecker) {
        this.f52481a = licenseChecker;
        attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        LicenseChecker licenseChecker = this.f52481a;
        if (i10 == 1598968902) {
            if (parcel2 != null) {
                parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
            }
            return true;
        }
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        try {
            parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            licenseChecker.logger.debug("LVL received license response: " + i12, new Object[0]);
            if (!new LicenseResponseHandler(licenseChecker.mCallback, licenseChecker.logger, 3).handleResponse(i12, string, string2, licenseChecker.retryCount)) {
                licenseChecker.onDestroy();
                return true;
            }
            licenseChecker.retryCount++;
            licenseChecker.logger.debug("LVL retrying license check... Attempt: " + licenseChecker.retryCount, new Object[0]);
            licenseChecker.executeLicenseCheck();
            return true;
        } catch (Exception e10) {
            licenseChecker.logger.error("LVL failed to process license response: ", e10);
            licenseChecker.mCallback.onError(-1);
            licenseChecker.onDestroy();
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
