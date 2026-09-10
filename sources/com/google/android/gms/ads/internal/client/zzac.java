package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ax;
import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.fw;
import com.google.android.gms.internal.ads.gw;
import com.google.android.gms.internal.ads.hw;
import com.google.android.gms.internal.ads.iw;
import com.google.android.gms.internal.ads.kw;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.zw;
import s9.b;
import s9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzac extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f10721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzaw f10722c;

    public zzac(zzaw zzawVar, Activity activity) {
        this.f10721b = activity;
        this.f10722c = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10721b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Activity activity = this.f10721b;
        am.a(activity);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue();
        zzaw zzawVar = this.f10722c;
        if (zBooleanValue) {
            try {
                b bVar = new b(activity);
                iw iwVar = (iw) ((kw) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzab.f10720a));
                Parcel parcelQ = iwVar.q();
                rh.e(parcelQ, bVar);
                Parcel parcelR = iwVar.r(parcelQ, 1);
                IBinder strongBinder = parcelR.readStrongBinder();
                parcelR.recycle();
                return gw.zzI(strongBinder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
                ax axVarC = zw.c(activity.getApplicationContext());
                zzawVar.getClass();
                axVarC.a("ClientApiBroker.createAdOverlay", e10);
                return null;
            }
        }
        ew ewVar = zzawVar.f10772e;
        ewVar.getClass();
        try {
            b bVar2 = new b(activity);
            iw iwVar2 = (iw) ((kw) ewVar.j(activity));
            Parcel parcelQ2 = iwVar2.q();
            rh.e(parcelQ2, bVar2);
            Parcel parcelR2 = iwVar2.r(parcelQ2, 1);
            IBinder strongBinder2 = parcelR2.readStrongBinder();
            parcelR2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof hw ? (hw) iInterfaceQueryLocalInterface : new fw(strongBinder2);
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e11);
            return null;
        } catch (c e12) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e12);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzg(new b(this.f10721b));
    }
}
