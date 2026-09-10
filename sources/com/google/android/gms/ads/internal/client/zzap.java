package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ax;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.zw;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzap extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st f10754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f10755e;

    public zzap(zzaw zzawVar, Context context, String str, st stVar) {
        this.f10752b = context;
        this.f10753c = str;
        this.f10754d = stVar;
        this.f10755e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10752b, "native_ad");
        return new zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10752b;
        am.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue();
        zzaw zzawVar = this.f10755e;
        st stVar = this.f10754d;
        String str = this.f10753c;
        if (!zBooleanValue) {
            return zzawVar.f10769b.zza(context, str, stVar);
        }
        try {
            IBinder iBinderZze = ((zzbr) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzao.f10751a)).zze(new b(context), str, stVar, 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(iBinderZze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            ax axVarC = zw.c(context);
            zzawVar.getClass();
            axVarC.a("ClientApiBroker.createAdLoaderBuilder", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzd(new b(this.f10752b), this.f10753c, this.f10754d, 261710000);
    }
}
