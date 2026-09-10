package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.zw;
import s9.b;
import s9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzk extends q00 {
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final /* synthetic */ Object i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
    }

    @Nullable
    public final zzbu zza(Context context, zzr zzrVar, String str, st stVar, int i10) {
        am.a(context);
        if (((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.f10883a)).zze(new b(context), zzrVar, str, stVar, 261710000, i10);
                if (iBinderZze != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
                }
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
                zw.c(context).a("AdManagerCreator.newAdManagerByDynamiteLoader", e10);
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                return null;
            }
        } else {
            try {
                IBinder iBinderZze2 = ((zzbv) j(context)).zze(new b(context), zzrVar, str, stVar, 261710000, i10);
                if (iBinderZze2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface2 instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface2 : new zzbs(iBinderZze2);
                }
            } catch (RemoteException | c e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e11);
                return null;
            }
        }
        return null;
    }
}
