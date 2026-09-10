package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class zzdoi implements zzbjl {
    final /* synthetic */ zzdpj zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdoi(zzdpj zzdpjVar, ViewGroup viewGroup) {
        this.zza = zzdpjVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zza() {
        zzgtd zzgtdVar = zzdoh.zza;
        zzdpj zzdpjVar = this.zza;
        Map mapZzk = zzdpjVar.zzk();
        if (mapZzk == null) {
            return;
        }
        int size = zzgtdVar.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = mapZzk.get((String) zzgtdVar.get(i2));
            i2++;
            if (obj != null) {
                zzdpjVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
