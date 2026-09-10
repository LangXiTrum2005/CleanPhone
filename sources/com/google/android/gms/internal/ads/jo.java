package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdz;
import com.google.android.gms.ads.internal.client.zzea;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jo extends ph implements ko {
    public jo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zze() {
        Parcel parcelR = r(q(), 2);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void zzf(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 3);
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final s9.a zzg() {
        return com.applovin.impl.ca.o(r(q(), 4));
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zzh() {
        Parcel parcelR = r(q(), 5);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zzi() {
        Parcel parcelR = r(q(), 6);
        float f10 = parcelR.readFloat();
        parcelR.recycle();
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final zzea zzj() {
        Parcel parcelR = r(q(), 7);
        zzea zzeaVarZzb = zzdz.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean zzk() {
        Parcel parcelR = r(q(), 8);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean zzl() {
        Parcel parcelR = r(q(), 10);
        ClassLoader classLoader = rh.f19590a;
        boolean z10 = parcelR.readInt() != 0;
        parcelR.recycle();
        return z10;
    }
}
