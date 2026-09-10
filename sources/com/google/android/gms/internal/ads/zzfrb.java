package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfrb extends zzgsv {
    private final LinkedList zza = new LinkedList();

    @Override // com.google.android.gms.internal.ads.zzgss, java.util.Collection, java.util.Queue
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzfqm zzfqmVar = (zzfqm) obj;
        if (zzfqmVar.zzf() != 3) {
            this.zza.add(zzfqmVar);
            return true;
        }
        LinkedList linkedList = this.zza;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            zzfqm zzfqmVar2 = (zzfqm) listIterator.next();
            if (zzfqmVar2.zzf() == 3) {
                double dZze = zzfqmVar2.zze();
                double dZze2 = zzfqmVar.zze();
                if (dZze < dZze2 || (dZze == dZze2 && zzfqmVar2.zzc() > zzfqmVar.zzc())) {
                    listIterator.set(zzfqmVar);
                    zzfqmVar = zzfqmVar2;
                }
            }
        }
        linkedList.add(zzfqmVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv
    public final Queue zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgss, com.google.android.gms.internal.ads.zzgsu
    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgsv, com.google.android.gms.internal.ads.zzgss
    public final /* synthetic */ Collection zzc() {
        return this.zza;
    }
}
