package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.st;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzan extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f10747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st f10749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f10750f;

    public zzan(zzaw zzawVar, Context context, zzr zzrVar, String str, st stVar) {
        this.f10746b = context;
        this.f10747c = zzrVar;
        this.f10748d = str;
        this.f10749e = stVar;
        this.f10750f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10746b, "interstitial");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zzb() throws RemoteException {
        return this.f10750f.f10768a.zza(this.f10746b, this.f10747c, this.f10748d, this.f10749e, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzc(new b(this.f10746b), this.f10747c, this.f10748d, this.f10749e, 261710000);
    }
}
