package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdat extends zzdgi implements zzdao {
    public zzdat(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzc(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdas
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                ((zzdba) obj).zzj(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zzd(final zzdlg zzdlgVar) {
        zzs(new zzdgh() { // from class: com.google.android.gms.internal.ads.zzdaq
            @Override // com.google.android.gms.internal.ads.zzdgh
            public final /* synthetic */ void zza(Object obj) {
                zzdba zzdbaVar = (zzdba) obj;
                String message = zzdlgVar.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdbaVar.zzj(zzfjm.zzd(12, message, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdao
    public final void zze() {
        zzs(zzdar.zza);
    }
}
