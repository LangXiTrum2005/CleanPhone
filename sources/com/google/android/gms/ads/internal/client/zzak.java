package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.br;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.mr;
import com.google.android.gms.internal.ads.st;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzak extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st f10734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ OnH5AdsEventListener f10735d;

    public zzak(zzaw zzawVar, Context context, st stVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.f10733b = context;
        this.f10734c = stVar;
        this.f10735d = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zza() {
        return new mr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10733b;
        b bVar = new b(context);
        try {
            return ((ir) ((kr) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaj.f10732a))).v1(bVar, this.f10734c, new br(this.f10735d));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzp(new b(this.f10733b), this.f10734c, 261710000, new br(this.f10735d));
    }
}
