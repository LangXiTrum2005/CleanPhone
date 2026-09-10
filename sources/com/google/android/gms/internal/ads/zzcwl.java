package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwl extends zzdbj {
    private boolean zzb;

    public zzcwl(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcwk
            @Override // com.google.android.gms.internal.ads.zzdbi
            public final void zza(Object obj) {
                ((zzcwn) obj).zzr();
            }
        });
        this.zzb = true;
    }
}
