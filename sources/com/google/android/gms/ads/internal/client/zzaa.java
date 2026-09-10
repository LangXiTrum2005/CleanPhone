package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.iy;
import com.google.android.gms.internal.ads.jq;
import com.google.android.gms.internal.ads.my;
import com.google.android.gms.internal.ads.st;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzaa extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st f10719d;

    public zzaa(zzaw zzawVar, Context context, String str, st stVar) {
        this.f10717b = context;
        this.f10718c = str;
        this.f10719d = stVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10717b, "rewarded");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzb() throws RemoteException {
        String str = this.f10718c;
        st stVar = this.f10719d;
        Context context = this.f10717b;
        try {
            IBinder iBinderZze = ((my) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", jq.f16134d)).zze(new b(context), str, stVar, 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof iy ? (iy) iInterfaceQueryLocalInterface : new gy(iBinderZze);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzl(new b(this.f10717b), this.f10718c, this.f10719d, 261710000);
    }
}
