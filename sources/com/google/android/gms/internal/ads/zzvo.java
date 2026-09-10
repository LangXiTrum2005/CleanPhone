package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzvo extends zzvf {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzhz zzc;

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzM() {
        for (zzvn zzvnVar : this.zza.values()) {
            zzvnVar.zza.zzq(zzvnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public void zza(zzhz zzhzVar) {
        this.zzc = zzhzVar;
        this.zzb = zzfj.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzc() {
        for (zzvn zzvnVar : this.zza.values()) {
            zzvnVar.zza.zzr(zzvnVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public void zzd() {
        HashMap map = this.zza;
        for (zzvn zzvnVar : map.values()) {
            zzwi zzwiVar = zzvnVar.zza;
            zzwiVar.zzs(zzvnVar.zzb);
            zzvm zzvmVar = zzvnVar.zzc;
            zzwiVar.zzm(zzvmVar);
            zzwiVar.zzo(zzvmVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzvn) it.next()).zza.zzt();
        }
    }

    public abstract void zzu(Object obj, zzwi zzwiVar, zzbf zzbfVar);

    public final void zzv(final Object obj, zzwi zzwiVar) {
        HashMap map = this.zza;
        zzgqa.zza(!map.containsKey(obj));
        zzwh zzwhVar = new zzwh() { // from class: com.google.android.gms.internal.ads.zzvl
            @Override // com.google.android.gms.internal.ads.zzwh
            public final /* synthetic */ void zza(zzwi zzwiVar2, zzbf zzbfVar) {
                this.zza.zzu(obj, zzwiVar2, zzbfVar);
            }
        };
        zzvm zzvmVar = new zzvm(this, obj);
        map.put(obj, new zzvn(zzwiVar, zzwhVar, zzvmVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzwiVar.zzl(handler, zzvmVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzwiVar.zzn(handler2, zzvmVar);
        zzwiVar.zzp(zzwhVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzwiVar.zzr(zzwhVar);
    }

    public int zzw(Object obj, int i2) {
        return 0;
    }

    public zzwg zzx(Object obj, zzwg zzwgVar) {
        throw null;
    }

    public long zzy(Object obj, long j, zzwg zzwgVar) {
        return j;
    }
}
