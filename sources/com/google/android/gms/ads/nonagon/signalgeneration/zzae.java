package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzgyj;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
final class zzae implements zzgyj {
    final /* synthetic */ zzbxn zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzae(zzau zzauVar, zzbxn zzbxnVar, boolean z2) {
        this.zza = zzbxnVar;
        this.zzb = z2;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final void zza(Throwable th) {
        try {
            zzbxn zzbxnVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbxnVar.zzf(sb.toString());
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyj
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zze(arrayList);
            zzau zzauVar = this.zzc;
            if (!zzauVar.zzC() && !this.zzb) {
                return;
            }
            for (Uri uri : arrayList) {
                if (zzauVar.zzc(uri)) {
                    zzauVar.zzB().zzb(zzau.zzZ(uri, zzauVar.zzM(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzip)).booleanValue()) {
                        zzauVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }
}
