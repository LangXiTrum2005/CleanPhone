package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzafx extends zzafd {
    final /* synthetic */ zzafr zza;
    final /* synthetic */ zzafy zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzafx(zzafy zzafyVar, zzafr zzafrVar, zzafr zzafrVar2) {
        super(zzafrVar);
        this.zza = zzafrVar2;
        Objects.requireNonNull(zzafyVar);
        this.zzb = zzafyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd, com.google.android.gms.internal.ads.zzafr
    public final zzafp zzc(long j) {
        zzafp zzafpVarZzc = this.zza.zzc(j);
        zzafs zzafsVar = zzafpVarZzc.zza;
        long j2 = zzafsVar.zzb;
        zzafy zzafyVar = this.zzb;
        zzafs zzafsVar2 = new zzafs(j2, zzafyVar.zza() + zzafsVar.zzc);
        zzafs zzafsVar3 = zzafpVarZzc.zzb;
        return new zzafp(zzafsVar2, new zzafs(zzafsVar3.zzb, zzafyVar.zza() + zzafsVar3.zzc));
    }
}
