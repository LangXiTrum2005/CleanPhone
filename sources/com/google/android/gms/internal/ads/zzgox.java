package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgox implements ServiceConnection {
    final /* synthetic */ zzgpd zza;

    public /* synthetic */ zzgox(zzgpd zzgpdVar, byte[] bArr) {
        Objects.requireNonNull(zzgpdVar);
        this.zza = zzgpdVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzgpd zzgpdVar = this.zza;
        zzgpdVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzgpdVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgow
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgnh zzgnhVarZzb = zzgng.zzb(iBinder);
                zzgox zzgoxVar = this.zza;
                zzgpd zzgpdVar2 = zzgoxVar.zza;
                zzgpdVar2.zzn(zzgnhVarZzb);
                zzgpdVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceZzm = zzgpdVar2.zzm();
                    if (iInterfaceZzm == null) {
                        throw null;
                    }
                    iInterfaceZzm.asBinder().linkToDeath(zzgpdVar2.zzl(), 0);
                    zzgpd zzgpdVar3 = zzgoxVar.zza;
                    zzgpdVar3.zzk(false);
                    synchronized (zzgpdVar3.zzj()) {
                        try {
                            Iterator it = zzgpdVar3.zzj().iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            zzgpdVar3.zzj().clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e2) {
                    zzgoxVar.zza.zzi().zzd(e2, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzgpd zzgpdVar = this.zza;
        zzgpdVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzgpdVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgov
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgpd zzgpdVar2 = this.zza.zza;
                zzgpdVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface iInterfaceZzm = zzgpdVar2.zzm();
                iInterfaceZzm.getClass();
                iInterfaceZzm.asBinder().unlinkToDeath(zzgpdVar2.zzl(), 0);
                zzgpdVar2.zzn(null);
                zzgpdVar2.zzk(false);
            }
        });
    }
}
