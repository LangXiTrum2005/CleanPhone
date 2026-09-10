package q7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f48657a;

    public a(IBinder iBinder) {
        this.f48657a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48657a;
    }

    public final String q() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.n.e(parcelObtain, "obtain()");
        Parcel parcelObtain2 = Parcel.obtain();
        kotlin.jvm.internal.n.e(parcelObtain2, "obtain()");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f48657a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public final boolean r() {
        Parcel parcelObtain = Parcel.obtain();
        kotlin.jvm.internal.n.e(parcelObtain, "obtain()");
        Parcel parcelObtain2 = Parcel.obtain();
        kotlin.jvm.internal.n.e(parcelObtain2, "obtain()");
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.f48657a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
