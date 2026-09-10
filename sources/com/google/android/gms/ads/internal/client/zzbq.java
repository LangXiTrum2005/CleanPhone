package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
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
import com.google.android.gms.internal.ads.rp;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbh zzbhVar) throws RemoteException;

    void zzg(dp dpVar) throws RemoteException;

    void zzh(fp fpVar) throws RemoteException;

    void zzi(String str, lp lpVar, @Nullable ip ipVar) throws RemoteException;

    void zzj(eo eoVar) throws RemoteException;

    void zzk(op opVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(rp rpVar) throws RemoteException;

    void zzn(bs bsVar) throws RemoteException;

    void zzo(gs gsVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}
