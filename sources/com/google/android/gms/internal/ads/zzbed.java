package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbed extends IInterface {
    com.google.android.gms.ads.internal.client.zzbx zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbek zzbekVar) throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException;

    void zzh(boolean z2) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j) throws RemoteException;
}
