package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.bw;
import com.google.android.gms.internal.ads.dw;
import com.google.android.gms.internal.ads.st;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzai extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st f10731c;

    public zzai(zzaw zzawVar, Context context, st stVar) {
        this.f10730b = context;
        this.f10731c = stVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10730b;
        b bVar = new b(context);
        try {
            return ((bw) ((dw) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzah.f10729a))).v1(bVar, this.f10731c);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzo(new b(this.f10730b), this.f10731c, 261710000);
    }
}
