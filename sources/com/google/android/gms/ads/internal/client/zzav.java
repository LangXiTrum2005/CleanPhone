package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.ax;
import com.google.android.gms.internal.ads.oo;
import com.google.android.gms.internal.ads.po;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.rh;
import com.google.android.gms.internal.ads.ro;
import com.google.android.gms.internal.ads.to;
import com.google.android.gms.internal.ads.yp;
import com.google.android.gms.internal.ads.zw;
import s9.b;
import s9.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzav extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f10764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f10765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f10766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzaw f10767e;

    public zzav(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f10764b = frameLayout;
        this.f10765c = frameLayout2;
        this.f10766d = context;
        this.f10767e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10766d, "native_ad_view_delegate");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10766d;
        am.a(context);
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.f12288oc)).booleanValue();
        zzaw zzawVar = this.f10767e;
        FrameLayout frameLayout = this.f10765c;
        FrameLayout frameLayout2 = this.f10764b;
        if (zBooleanValue) {
            try {
                b bVar = new b(context);
                b bVar2 = new b(frameLayout2);
                b bVar3 = new b(frameLayout);
                ro roVar = (ro) ((to) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzau.f10763a));
                Parcel parcelQ = roVar.q();
                rh.e(parcelQ, bVar);
                rh.e(parcelQ, bVar2);
                rh.e(parcelQ, bVar3);
                parcelQ.writeInt(261710000);
                Parcel parcelR = roVar.r(parcelQ, 1);
                IBinder strongBinder = parcelR.readStrongBinder();
                parcelR.recycle();
                return po.zzdG(strongBinder);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
                ax axVarC = zw.c(context);
                zzawVar.getClass();
                axVarC.a("ClientApiBroker.createNativeAdViewDelegate", e10);
                return null;
            }
        }
        yp ypVar = zzawVar.f10771d;
        ypVar.getClass();
        try {
            b bVar4 = new b(context);
            b bVar5 = new b(frameLayout2);
            b bVar6 = new b(frameLayout);
            ro roVar2 = (ro) ((to) ypVar.j(context));
            Parcel parcelQ2 = roVar2.q();
            rh.e(parcelQ2, bVar4);
            rh.e(parcelQ2, bVar5);
            rh.e(parcelQ2, bVar6);
            parcelQ2.writeInt(261710000);
            Parcel parcelR2 = roVar2.r(parcelQ2, 1);
            IBinder strongBinder2 = parcelR2.readStrongBinder();
            parcelR2.recycle();
            if (strongBinder2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof qo ? (qo) iInterfaceQueryLocalInterface : new oo(strongBinder2);
        } catch (RemoteException | c e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zze(new b(this.f10764b), new b(this.f10765c));
    }
}
