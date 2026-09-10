package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.st;
import java.util.Objects;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzal extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzr f10737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st f10739e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzaw f10740f;

    public zzal(zzaw zzawVar, Context context, zzr zzrVar, String str, st stVar) {
        this.f10736b = context;
        this.f10737c = zzrVar;
        this.f10738d = str;
        this.f10739e = stVar;
        Objects.requireNonNull(zzawVar);
        this.f10740f = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10736b, "banner");
        return new zzfh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* synthetic */ Object zzb() throws RemoteException {
        return this.f10740f.f10768a.zza(this.f10736b, this.f10737c, this.f10738d, this.f10739e, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzb(new b(this.f10736b), this.f10737c, this.f10738d, this.f10739e, 261710000);
    }
}
