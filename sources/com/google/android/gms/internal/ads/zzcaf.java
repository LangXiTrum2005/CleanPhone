package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzcaf extends IInterface {
    void zzb(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException;

    void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzcam zzcamVar) throws RemoteException;

    void zze(zzcai zzcaiVar) throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    Bundle zzg() throws RemoteException;

    void zzh(zzcat zzcatVar) throws RemoteException;

    boolean zzi() throws RemoteException;

    String zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, boolean z2) throws RemoteException;

    zzcac zzl() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzm() throws RemoteException;

    String zzn() throws RemoteException;

    void zzo(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException;

    void zzp(boolean z2) throws RemoteException;

    long zzq() throws RemoteException;

    void zzr(long j) throws RemoteException;

    void zzs(zzcan zzcanVar) throws RemoteException;
}
