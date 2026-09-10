package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f34069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f34070b;

        public b(String str, boolean z10) {
            this.f34069a = str;
            this.f34070b = z10;
        }

        public String a() {
            return this.f34069a;
        }

        public boolean b() {
            return this.f34070b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f34075a;

        public d(IBinder iBinder) {
            this.f34075a = iBinder;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f34075a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z11 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z11;
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f34075a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f34075a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0132c serviceConnectionC0132c = new ServiceConnectionC0132c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC0132c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC0132c.a());
                b bVar = new b(dVar.getId(), dVar.a(true));
                context.unbindService(serviceConnectionC0132c);
                return bVar;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            context.unbindService(serviceConnectionC0132c);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public final class ServiceConnectionC0132c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f34072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f34073b;

        private ServiceConnectionC0132c() {
            this.f34072a = new LinkedBlockingQueue<>(1);
            this.f34073b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.f34073b) {
                throw new IllegalStateException();
            }
            this.f34073b = true;
            return this.f34072a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f34072a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
