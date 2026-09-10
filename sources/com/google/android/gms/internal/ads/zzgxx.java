package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgxx extends zzgxo {
    private List zza;

    public zzgxx(zzgsz zzgszVar, boolean z2) {
        super(zzgszVar, z2, true);
        List listZzb = zzgszVar.isEmpty() ? Collections.EMPTY_LIST : zzgud.zzb(zzgszVar.size());
        for (int i2 = 0; i2 < zzgszVar.size(); i2++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzA(int i2) {
        super.zzA(i2);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzw(int i2, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i2, new zzgxw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
