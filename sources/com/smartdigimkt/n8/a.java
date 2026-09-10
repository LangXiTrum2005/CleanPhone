package com.smartdigimkt.n8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f37132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f37133b;

        public b(String str, boolean z2) {
            this.f37132a = str;
            this.f37133b = z2;
        }

        public String a() {
            return this.f37132a;
        }

        public boolean b() {
            return this.f37133b;
        }
    }

    public final class c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f37135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f37136b;

        private c() {
            this.f37135a = false;
            this.f37136b = new LinkedBlockingQueue<>(1);
        }

        public IBinder a() throws InterruptedException {
            if (this.f37135a) {
                throw new IllegalStateException();
            }
            this.f37135a = true;
            return this.f37136b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f37136b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        c cVar = new c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0 || !context.bindService(intent, cVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            d dVar = new d(cVar.a());
            b bVar = new b(dVar.a(), dVar.a(true));
            try {
                context.unbindService(cVar);
            } catch (Throwable unused) {
            }
            return bVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    context.unbindService(cVar);
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    public final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f37138a;

        public d(IBinder iBinder) {
            this.f37138a = iBinder;
        }

        public String a() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f37138a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f37138a;
        }

        public boolean a(boolean z2) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z2 ? 1 : 0);
                this.f37138a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }
}
