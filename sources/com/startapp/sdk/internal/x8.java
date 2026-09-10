package com.startapp.sdk.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes6.dex */
public final class x8 implements z8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f41668a;

    public x8(IBinder iBinder) {
        this.f41668a = iBinder;
    }

    public final Bundle a(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f41668a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41668a;
    }
}
