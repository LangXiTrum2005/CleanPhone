package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtk extends zzgsz {
    private final transient zzgtl zza;

    public zzgtk(zzgtl zzgtlVar) {
        this.zza = zzgtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgti(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return new zzgti(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        zzgvs zzgvsVarListIterator = ((zzgtd) this.zza.map.values()).listIterator(0);
        while (zzgvsVarListIterator.hasNext()) {
            i2 = ((zzgsz) zzgvsVarListIterator.next()).zzg(objArr, i2);
        }
        return i2;
    }
}
