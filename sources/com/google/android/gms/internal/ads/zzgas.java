package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgas implements zzgdz {
    private final zzgaj zza;
    private final zzgap zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzavs zzh;
    private zzgba zzi;

    public /* synthetic */ zzgas(zzgaj zzgajVar, zzgap zzgapVar, byte[] bArr) {
        this.zza = zzgajVar;
        this.zzb = zzgapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final zzgea zza() {
        zzijo.zzc(this.zzc, Context.class);
        zzijo.zzc(this.zzg, Map.class);
        zzijo.zzc(this.zzh, zzavs.class);
        zzijo.zzc(this.zzi, zzgba.class);
        return new zzgat(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* bridge */ /* synthetic */ zzgdz zzb(zzgba zzgbaVar) {
        zzgbaVar.getClass();
        this.zzi = zzgbaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* bridge */ /* synthetic */ zzgdz zzc(zzavs zzavsVar) {
        zzavsVar.getClass();
        this.zzh = zzavsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* bridge */ /* synthetic */ zzgdz zzd(Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* synthetic */ zzgdz zze(String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* synthetic */ zzgdz zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* synthetic */ zzgdz zzg(View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgdz
    public final /* bridge */ /* synthetic */ zzgdz zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
