package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ax;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.zw;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzar extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st f10758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzaw f10759d;

    public zzar(zzaw zzawVar, Context context, st stVar) {
        this.f10757b = context;
        this.f10758c = stVar;
        this.f10759d = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10757b, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb() {
        zzch zzcfVar;
        Context context = this.f10757b;
        b bVar = new b(context);
        am.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue();
        zzaw zzawVar = this.f10759d;
        st stVar = this.f10758c;
        if (!zBooleanValue) {
            return zzawVar.f10773f.zza(context, stVar);
        }
        try {
            IBinder iBinderZze = ((zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.f10756a)).zze(bVar, stVar, 261710000);
            if (iBinderZze == null) {
                zzcfVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(iBinderZze);
            }
            zzcfVar.zzl(stVar);
            return zzcfVar;
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            ax axVarC = zw.c(context);
            zzawVar.getClass();
            axVarC.a("ClientApiBroker.getAdPreloader", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzh(new b(this.f10757b), this.f10758c, 261710000);
    }
}
