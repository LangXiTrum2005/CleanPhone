package com.thinkup.core.common.n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class oo {

    public final class n implements IInterface {
        private IBinder m;

        public n(IBinder iBinder) {
            this.m = iBinder;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.m;
        }

        public final boolean m() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.m.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final String o() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.m.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    public final class o {
        private final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f41930n;

        public o(String str, boolean z2) {
            this.m = str;
            this.f41930n = z2;
        }

        private boolean m() {
            return this.f41930n;
        }

        public final String o() {
            return this.m;
        }
    }

    public final o o(Context context) throws IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        m mVar = new m(this, (byte) 0);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0 || !context.bindService(intent, mVar, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            n nVar = new n(mVar.o());
            o oVar = new o(nVar.o(), nVar.m());
            try {
                context.unbindService(mVar);
            } catch (Throwable unused) {
            }
            return oVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    context.unbindService(mVar);
                } catch (Throwable unused2) {
                }
                throw th2;
            }
        }
    }

    public final class m implements ServiceConnection {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f41929n;
        boolean o;

        private m() {
            this.o = false;
            this.f41929n = new LinkedBlockingQueue<>(1);
        }

        public final IBinder o() {
            if (this.o) {
                throw new IllegalStateException();
            }
            this.o = true;
            return this.f41929n.take();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f41929n.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ m(oo ooVar, byte b2) {
            this();
        }
    }
}
