package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends ph implements wi {
    public vi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void n0(zzdq zzdqVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzdqVar);
        m0(parcelQ, 7);
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void u0(s9.a aVar, bj bjVar) {
        Parcel parcelQ = q();
        rh.e(parcelQ, aVar);
        rh.e(parcelQ, bjVar);
        m0(parcelQ, 4);
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final zzdx zzg() {
        Parcel parcelR = r(q(), 5);
        zzdx zzdxVarZzb = zzdw.zzb(parcelR.readStrongBinder());
        parcelR.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void zzh(boolean z10) {
        Parcel parcelQ = q();
        ClassLoader classLoader = rh.f19590a;
        parcelQ.writeInt(z10 ? 1 : 0);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final String zzj() {
        Parcel parcelR = r(q(), 8);
        String string = parcelR.readString();
        parcelR.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final long zzk() {
        Parcel parcelR = r(q(), 9);
        long j10 = parcelR.readLong();
        parcelR.recycle();
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void zzl(long j10) {
        Parcel parcelQ = q();
        parcelQ.writeLong(j10);
        m0(parcelQ, 10);
    }
}
