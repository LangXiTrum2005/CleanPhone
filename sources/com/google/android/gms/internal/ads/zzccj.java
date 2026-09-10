package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface zzccj extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, zzccn zzccnVar, zzccg zzccgVar) throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException;

    void zzh(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException;

    void zzi(zzbxq zzbxqVar) throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException;

    void zzl(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException;

    IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException;
}
