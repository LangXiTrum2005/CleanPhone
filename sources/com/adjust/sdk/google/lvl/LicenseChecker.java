package com.adjust.sdk.google.lvl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.adjust.sdk.ILogger;
import la.j;
import v5.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class LicenseChecker {
    private static final int ERROR_BINDER_DIED = -6;
    private static final int ERROR_BIND_FAILED = -5;
    private static final int ERROR_GENERIC = -1;
    private static final int ERROR_NO_BINDER = -3;
    private static final int ERROR_REMOTE_EXCEPTION = -4;
    private static final int ERROR_TRANSACT_FAILED = -2;
    private static final String GOOGLE_PLAY_PACKAGE = "com.android.vending";
    private static final String LICENSING_SERVICE_DESCRIPTOR = "com.android.vending.licensing.ILicensingService";
    private static final int MAX_RETRIES = 3;
    private static final String RESULT_LISTENER_DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
    private static final int TRANSACTION_CHECK_LICENSE = 1;
    private final ILogger logger;
    private boolean mBound;
    private final LicenseRawCallback mCallback;
    private final Context mContext;
    private IBinder mServiceBinder;
    private final long timestamp;
    private int retryCount = 0;
    private final ServiceConnection mServiceConnection = new j(this, 1);
    private final b resultListenerBinder = new b(this);

    public LicenseChecker(Context context, LicenseRawCallback licenseRawCallback, ILogger iLogger, long j10) {
        this.mContext = context;
        this.mCallback = licenseRawCallback;
        this.logger = iLogger;
        this.timestamp = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeLicenseCheck() {
        try {
            if (this.mServiceBinder == null) {
                this.logger.error("LVL binder unavailable for license check", new Object[0]);
                this.mCallback.onError(-3);
                return;
            }
            String packageName = this.mContext.getPackageName();
            long jGenerateNonce = generateNonce(this.timestamp);
            this.logger.debug("LVL generated nonce: " + jGenerateNonce, new Object[0]);
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(LICENSING_SERVICE_DESCRIPTOR);
                parcelObtain.writeLong(jGenerateNonce);
                parcelObtain.writeString(packageName);
                parcelObtain.writeStrongBinder(this.resultListenerBinder);
                boolean zTransact = this.mServiceBinder.transact(1, parcelObtain, null, 1);
                this.logger.debug("LVL binder transact sent (code 1): " + zTransact, new Object[0]);
                if (!zTransact) {
                    this.logger.error("LVL binder transact failed to enqueue", new Object[0]);
                    this.mCallback.onError(-2);
                }
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e10) {
            this.logger.error("LVL remote exception during license check: ", e10);
            this.mCallback.onError(-4);
        } catch (Exception e11) {
            this.logger.error("LVL license check failed: ", e11);
            this.mCallback.onError(-1);
        }
    }

    public static long generateNonce(long j10) {
        return ((j10 & 72057594037927935L) << 8) | 1;
    }

    public synchronized void checkAccess() {
        if (this.mBound) {
            return;
        }
        this.logger.debug("LVL License check starts", new Object[0]);
        Intent intent = new Intent(LICENSING_SERVICE_DESCRIPTOR);
        intent.setPackage(GOOGLE_PLAY_PACKAGE);
        boolean zBindService = this.mContext.bindService(intent, this.mServiceConnection, 1);
        this.logger.debug("LVL bindService result: " + zBindService, new Object[0]);
        if (!zBindService) {
            this.logger.error("LVL failed to bind licensing service", new Object[0]);
            this.mCallback.onError(-5);
        }
    }

    public void onDestroy() {
        this.logger.debug("LVL license checker destroyed", new Object[0]);
        if (this.mBound) {
            this.mContext.unbindService(this.mServiceConnection);
            this.mBound = false;
        }
        this.mServiceBinder = null;
    }
}
