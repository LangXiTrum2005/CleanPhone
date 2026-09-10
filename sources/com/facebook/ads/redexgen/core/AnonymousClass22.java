package com.facebook.ads.redexgen.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.22, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass22 extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<Bundle> A00(IBinder iBinder) {
        C2K c2kA01 = BP.A01();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i3 = parcelObtain2.readInt();
                        if (i3 == 1) {
                            c2kA01.A04((Bundle) AbstractC10843y.A01(parcelObtain2.readBundle()));
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (RemoteException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return c2kA01.A05();
    }

    static {
        A00 = C5C.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }
}
