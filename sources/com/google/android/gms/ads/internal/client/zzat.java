package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ax;
import com.google.android.gms.internal.ads.zw;
import java.util.Objects;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzat extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaw f10762c;

    public zzat(zzaw zzawVar, Context context) {
        this.f10761b = context;
        Objects.requireNonNull(zzawVar);
        this.f10762c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10761b, "mobile_ads_settings");
        return new zzfj();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10761b;
        am.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue();
        zzaw zzawVar = this.f10762c;
        if (!zBooleanValue) {
            return zzawVar.f10770c.zza(context);
        }
        try {
            IBinder iBinderZze = ((zzcz) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzas.f10760a)).zze(new b(context), 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(iBinderZze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            ax axVarC = zw.c(context);
            zzawVar.getClass();
            axVarC.a("ClientApiBroker.getMobileAdsSettingsManager", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzi(new b(this.f10761b), 261710000);
    }
}
