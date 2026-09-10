package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ph implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f18650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18651b;

    public ph(IBinder iBinder, String str) {
        this.f18650a = iBinder;
        this.f18651b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18650a;
    }

    public final void m0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f18650a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final Parcel q() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f18651b);
        return parcelObtain;
    }

    public final Parcel r(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f18650a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }

    public final void u1(Parcel parcel, int i10) {
        try {
            this.f18650a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
