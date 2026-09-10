package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.jb;
import com.google.android.gms.internal.ads.lb;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzbg implements jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzbi f11077b;

    public zzbg(zzbl zzblVar, String str, zzbi zzbiVar) {
        this.f11076a = str;
        this.f11077b = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.jb
    public final void zza(lb lbVar) {
        String string = lbVar.toString();
        String str = this.f11076a;
        String strH = u.h(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i10 = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(strH);
        this.f11077b.zza(null);
    }
}
