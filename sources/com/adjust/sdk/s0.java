package com.adjust.sdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f6916a;

    public s0(IBinder iBinder) {
        this.f6916a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6916a;
    }

    public final String q() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f6916a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final Boolean r() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.f6916a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return Boolean.valueOf(!(parcelObtain2.readInt() != 0));
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
