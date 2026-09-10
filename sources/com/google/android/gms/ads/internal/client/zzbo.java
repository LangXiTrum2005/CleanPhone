package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.bs;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.eo;
import com.google.android.gms.internal.ads.fp;
import com.google.android.gms.internal.ads.gs;
import com.google.android.gms.internal.ads.ip;
import com.google.android.gms.internal.ads.lp;
import com.google.android.gms.internal.ads.op;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.rp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends ph implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() throws RemoteException {
        zzbn zzblVar;
        Parcel parcelR = r(q(), 1);
        IBinder strongBinder = parcelR.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelR.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(zzbh zzbhVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, zzbhVar);
        m0(parcelQ, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(dp dpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(fp fpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, lp lpVar, ip ipVar) throws RemoteException {
        Parcel parcelQ = q();
        parcelQ.writeString(str);
        rh.e(parcelQ, lpVar);
        rh.e(parcelQ, ipVar);
        m0(parcelQ, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(eo eoVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, eoVar);
        m0(parcelQ, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(op opVar, zzr zzrVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, opVar);
        rh.c(parcelQ, zzrVar);
        m0(parcelQ, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(rp rpVar) throws RemoteException {
        Parcel parcelQ = q();
        rh.e(parcelQ, rpVar);
        m0(parcelQ, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(bs bsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(gs gsVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelQ = q();
        rh.c(parcelQ, adManagerAdViewOptions);
        m0(parcelQ, 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcp zzcpVar) throws RemoteException {
        throw null;
    }
}
