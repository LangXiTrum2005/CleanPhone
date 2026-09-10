package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.st;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzam extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f10742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st f10744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f10745f;

    public zzam(zzaw zzawVar, Context context, zzr zzrVar, String str, st stVar) {
        this.f10741b = context;
        this.f10742c = zzrVar;
        this.f10743d = str;
        this.f10744e = stVar;
        this.f10745f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10741b, "app_open");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zzb() throws RemoteException {
        return this.f10745f.f10768a.zza(this.f10741b, this.f10742c, this.f10743d, this.f10744e, 4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzm(new b(this.f10741b), this.f10742c, this.f10743d, this.f10744e, 261710000);
    }
}
