package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fr extends qh implements hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14516a = 0;

    public fr() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String string = parcel.readString();
            rh.f(parcel);
            zze(string);
        } else {
            if (i10 != 2) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
