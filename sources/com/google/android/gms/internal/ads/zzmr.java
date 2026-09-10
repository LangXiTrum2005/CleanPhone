package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzmr {
    private final zzjc zza;

    @Deprecated
    public zzmr(Context context, zzmn zzmnVar) {
        this.zza = new zzjc(context, zzmnVar);
    }

    @Deprecated
    public final zzmr zza(final zzaad zzaadVar) {
        zzjc zzjcVar = this.zza;
        zzgqa.zzi(!zzjcVar.zzw);
        zzaadVar.getClass();
        zzjcVar.zze = new zzgqs() { // from class: com.google.android.gms.internal.ads.zziz
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return zzaadVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzmr zzb(final zzlg zzlgVar) {
        zzjc zzjcVar = this.zza;
        zzgqa.zzi(!zzjcVar.zzw);
        zzlgVar.getClass();
        zzjcVar.zzf = new zzgqs() { // from class: com.google.android.gms.internal.ads.zzja
            @Override // com.google.android.gms.internal.ads.zzgqs
            public final /* synthetic */ Object zza() {
                return zzlgVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zzms zzc() {
        zzjc zzjcVar = this.zza;
        zzgqa.zzi(!zzjcVar.zzw);
        zzjcVar.zzw = true;
        return new zzms(zzjcVar);
    }
}
