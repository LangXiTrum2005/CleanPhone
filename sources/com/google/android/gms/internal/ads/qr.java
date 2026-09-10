package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qr extends qh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m00 f19170a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(rr rrVar, m00 m00Var) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f19170a = m00Var;
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) rh.b(parcel, ParcelFileDescriptor.CREATOR);
        rh.f(parcel);
        this.f19170a.zzc(parcelFileDescriptor);
        return true;
    }
}
