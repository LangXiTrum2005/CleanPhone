package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface zzbyu extends IInterface {
    IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbyy zzbyyVar, zzbyr zzbyrVar) throws RemoteException;

    void zzg(zzbuc zzbucVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException;

    void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException;

    void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException;
}
