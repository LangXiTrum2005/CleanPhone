package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class gy extends ph implements iy {
    public gy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzb(s9.a aVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzc(zzm zzmVar, py pyVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        rh.e(parcelQ, pyVar);
        m0(parcelQ, 1);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzd(zzm zzmVar, py pyVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, zzmVar);
        rh.e(parcelQ, pyVar);
        m0(parcelQ, 14);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zze(ly lyVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, lyVar);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzf(zzdn zzdnVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdnVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final Bundle zzg() {
        Parcel parcelR = r(q(), 9);
        Bundle bundle = (Bundle) rh.b(parcelR, Bundle.CREATOR);
        parcelR.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzh(vy vyVar) {
        Parcel parcelQ = q();
        rh.c(parcelQ, vyVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final fy zzl() {
        fy eyVar;
        Parcel parcelR = r(q(), 11);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            eyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            eyVar = iInterfaceQueryLocalInterface instanceof fy ? (fy) iInterfaceQueryLocalInterface : new ey(strongBinder);
        }
        parcelR.recycle();
        return eyVar;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final zzdx zzm() {
        Parcel parcelR = r(q(), 12);
        zzdx zzdxVarZzb = zzdw.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final String zzn() {
        Parcel parcelR = r(q(), 16);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzo(zzdq zzdqVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdqVar);
        m0(parcelQ, 13);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzp(boolean z10) {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 15);
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final long zzq() {
        Parcel parcelR = r(q(), 17);
        long j10 = parcelR.readLong();
        parcelR.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.iy
    public final void zzr(long j10) {
        Parcel parcelQ = q();
        parcelQ.writeLong(j10);
        m0(parcelQ, 18);
    }
}
