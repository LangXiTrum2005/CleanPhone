package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lo extends ph implements mo {
    public lo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final s9.a zzb() {
        return com.applovin.impl.ca.o(r(q(), 1));
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Uri zzc() {
        Parcel parcelR = r(q(), 2);
        Uri uri = (Uri) rh.b(parcelR, Uri.CREATOR);
        parcelR.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final double zzd() {
        Parcel parcelR = r(q(), 3);
        double d10 = parcelR.readDouble();
        parcelR.recycle();
        return d10;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final int zze() {
        Parcel parcelR = r(q(), 4);
        int i10 = parcelR.readInt();
        parcelR.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final int zzf() {
        Parcel parcelR = r(q(), 5);
        int i10 = parcelR.readInt();
        parcelR.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.mo
    public final Map zzg() {
        Parcel parcelR = r(q(), 6);
        HashMap hashMap = parcelR.readHashMap(rh.f19590a);
        parcelR.recycle();
        return hashMap;
    }
}
