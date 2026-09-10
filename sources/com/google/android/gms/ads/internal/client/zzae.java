package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.am;
import com.google.android.gms.internal.ads.st;
import com.google.android.gms.internal.ads.zw;
import s9.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzae extends zzax {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ st f10725c;

    public zzae(zzaw zzawVar, Context context, st stVar) {
        this.f10724b = context;
        this.f10725c = stVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.f10724b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.f10724b;
        b bVar = new b(context);
        am.a(context);
        if (((Boolean) zzba.zzc().a(am.Ua)).booleanValue()) {
            try {
                return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.f10723a)).zze(bVar, this.f10725c, 261710000);
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
                zw.c(context).a("ClientApiBroker.getOutOfContextTester", e10);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        Context context = this.f10724b;
        b bVar = new b(context);
        am.a(context);
        if (((Boolean) zzba.zzc().a(am.Ua)).booleanValue()) {
            return zzcoVar.zzq(bVar, this.f10725c, 261710000);
        }
        return null;
    }
}
