package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.vf;
import com.google.android.gms.internal.ads.xr;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzet extends xr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzeu f10845a;

    public /* synthetic */ zzet(zzeu zzeuVar) {
        this.f10845a = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        zzeu zzeuVar = this.f10845a;
        synchronized (zzeuVar.f10850d) {
            zzeuVar.f10853g = false;
            zzeuVar.f10854h = true;
            arrayList = new ArrayList(zzeuVar.f10852f);
            zzeuVar.f10852f.clear();
        }
        vf vfVarA = zzeu.a(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(vfVarA);
        }
    }
}
