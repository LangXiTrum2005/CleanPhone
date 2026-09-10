package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.wi;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface zzch extends IInterface {
    void zze(List list, zzcb zzcbVar) throws RemoteException;

    boolean zzf(String str) throws RemoteException;

    @Nullable
    iy zzg(String str) throws RemoteException;

    boolean zzh(String str) throws RemoteException;

    @Nullable
    wi zzi(String str) throws RemoteException;

    boolean zzj(String str) throws RemoteException;

    @Nullable
    zzbu zzk(String str) throws RemoteException;

    void zzl(st stVar) throws RemoteException;

    boolean zzm(String str, zzfp zzfpVar, @Nullable zzce zzceVar) throws RemoteException;

    boolean zzn(int i10, String str) throws RemoteException;

    @Nullable
    zzbu zzo(String str) throws RemoteException;

    @Nullable
    wi zzp(String str) throws RemoteException;

    @Nullable
    iy zzq(String str) throws RemoteException;

    @Nullable
    zzfp zzr(int i10, String str) throws RemoteException;

    Bundle zzs(int i10) throws RemoteException;

    int zzt(int i10, String str) throws RemoteException;

    boolean zzu(int i10, String str) throws RemoteException;

    void zzv(int i10) throws RemoteException;
}
