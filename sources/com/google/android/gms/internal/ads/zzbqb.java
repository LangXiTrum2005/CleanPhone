package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public interface zzbqb extends IInterface {
    com.google.android.gms.ads.internal.client.zzed zzb() throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper, zzbqe zzbqeVar) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzbjv zzf() throws RemoteException;
}
