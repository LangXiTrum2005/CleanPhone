package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zt0 implements OnAdMetadataChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IInterface f22718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qh f22719c;

    public /* synthetic */ zt0(qh qhVar, IInterface iInterface, int i10) {
        this.f22717a = i10;
        this.f22718b = iInterface;
        this.f22719c = qhVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        int i10 = this.f22717a;
        IInterface iInterface = this.f22718b;
        qh qhVar = this.f22719c;
        switch (i10) {
            case 0:
                if (((au0) qhVar).f12519i != null) {
                    try {
                        ((zzdn) iInterface).zze();
                    } catch (RemoteException e10) {
                        int i11 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e10);
                        return;
                    }
                }
                break;
            default:
                if (((bu0) qhVar).f12893d != null) {
                    try {
                        ((zzby) iInterface).zze();
                    } catch (RemoteException e11) {
                        int i12 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e11);
                    }
                }
                break;
        }
    }
}
