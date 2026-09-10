package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfjs implements zzdan {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcdf zzc;

    public zzfjs(Context context, zzcdf zzcdfVar) {
        this.zzb = context;
        this.zzc = zzcdfVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzo(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final synchronized void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
