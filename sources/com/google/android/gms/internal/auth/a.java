package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f22789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22790c;

    public /* synthetic */ a(IBinder iBinder, String str, int i10) {
        this.f22788a = i10;
        this.f22789b = iBinder;
        this.f22790c = str;
    }

    public void A1(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22789b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public void B1(Parcel parcel, int i10) {
        try {
            this.f22789b.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f22788a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f22789b;
    }

    public Parcel m0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22789b.transact(i10, parcel, parcelObtain, 0);
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

    public void q(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f22789b.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel r(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22789b.transact(i10, parcel, parcelObtain, 0);
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

    public Parcel u1() {
        switch (this.f22788a) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f22790c);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f22790c);
                return parcelObtain2;
        }
    }

    public Parcel v1(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22789b.transact(i10, parcel, parcelObtain, 0);
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

    public void w1(Parcel parcel, int i10) {
        switch (this.f22788a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f22789b.transact(i10, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    this.f22789b.transact(i10, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
        }
    }

    public void x1(Parcel parcel) {
        try {
            this.f22789b.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public Parcel y1() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f22790c);
        return parcelObtain;
    }

    public Parcel z1(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f22789b.transact(i10, parcel, parcelObtain, 0);
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
}
