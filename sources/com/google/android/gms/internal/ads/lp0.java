package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lp0 implements ha0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hp0 f17091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gs f17092b;

    public /* synthetic */ lp0(hp0 hp0Var, gs gsVar) {
        this.f17091a = hp0Var;
        this.f17092b = gsVar;
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(zze zzeVar) {
        this.f17091a.j0(zzeVar);
        gs gsVar = this.f17092b;
        if (gsVar != null) {
            try {
                fs fsVar = (fs) gsVar;
                Parcel parcelQ = fsVar.q();
                rh.c(parcelQ, zzeVar);
                fsVar.m0(parcelQ, 3);
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
        if (gsVar != null) {
            try {
                int i10 = zzeVar.zza;
                fs fsVar2 = (fs) gsVar;
                Parcel parcelQ2 = fsVar2.q();
                parcelQ2.writeInt(i10);
                fsVar2.m0(parcelQ2, 2);
            } catch (RemoteException e11) {
                zzo.zzl("#007 Could not call remote method.", e11);
            }
        }
    }
}
