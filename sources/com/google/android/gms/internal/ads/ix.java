package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix extends qh implements jx {
    public ix() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rh.b(parcel, ParcelFileDescriptor.CREATOR);
            rh.f(parcel);
            f1(parcelFileDescriptor);
        } else if (i10 == 2) {
            zzba zzbaVar = (zzba) rh.b(parcel, zzba.CREATOR);
            rh.f(parcel);
            G0(zzbaVar);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) rh.b(parcel, ParcelFileDescriptor.CREATOR);
            mx mxVar = (mx) rh.b(parcel, mx.CREATOR);
            rh.f(parcel);
            q0(parcelFileDescriptor2, mxVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
