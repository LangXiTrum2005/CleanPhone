package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f9041b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f9042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u4 f9043b;

        public a(com.applovin.impl.sdk.p pVar, u4 u4Var) {
            this.f9042a = pVar;
            this.f9043b = u4Var;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9042a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f9042a, this.f9043b, iNextInt, new u9(this, 1));
            Parcel parcelObtain = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcelObtain.writeLong(iNextInt);
                    parcelObtain.writeString(com.applovin.impl.sdk.l.p().getPackageName());
                    parcelObtain.writeStrongBinder(bVar);
                    if (!iBinder.transact(1, parcelObtain, null, 1)) {
                        throw new RemoteException("transact() returned false");
                    }
                    parcelObtain.recycle();
                } catch (Exception e10) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f9042a.a("LicenseVerificationManager", "Failed to check license", e10);
                    }
                    a();
                    this.f9043b.a((Object) e10);
                    parcelObtain.recycle();
                }
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.p.a()) {
                this.f9042a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f9043b.a((Object) illegalStateException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.l.p().unbindService(this);
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f9042a.d("LicenseVerificationManager", "Failed to unbind license service", e10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.p f9044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u4 f9045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f9047d;

        public b(com.applovin.impl.sdk.p pVar, u4 u4Var, int i10, Runnable runnable) {
            this.f9044a = pVar;
            this.f9045b = u4Var;
            this.f9046c = i10;
            this.f9047d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.p.a()) {
                    this.f9044a.a("LicenseVerificationManager", "Verified with code " + i12);
                }
                this.f9045b.b(r2.a().b(string).a(string2).b(i12).a(this.f9046c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f9047d.run();
                return true;
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f9044a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th2);
                    }
                    this.f9045b.a((Object) new Exception(th2));
                    return false;
                } finally {
                    this.f9047d.run();
                }
            }
        }
    }

    public q2(com.applovin.impl.sdk.l lVar) {
        this.f9040a = lVar;
        this.f9041b = lVar.Q();
    }

    public u4 a(long j10) {
        u4 u4Var = new u4("verify_license");
        if (j10 > 0) {
            l6.a(j10, u4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f9040a);
        }
        try {
            if (!com.applovin.impl.sdk.l.p().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f9041b, u4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.p.a()) {
                    this.f9041b.k("LicenseVerificationManager", exc.getMessage());
                }
                u4Var.a((Object) exc);
            }
            return u4Var;
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f9041b.a("LicenseVerificationManager", "Failed to verify license", e10);
            }
            u4Var.a((Object) e10);
            return u4Var;
        }
    }
}
