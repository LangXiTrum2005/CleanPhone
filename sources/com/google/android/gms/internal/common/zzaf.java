package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
final class zzaf extends zzah {
    private final transient zzah zza;

    public zzaf(zzah zzahVar) {
        this.zza = zzahVar;
    }

    private final int zzs(int i2) {
        return (this.zza.size() - 1) - i2;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzah zzahVar = this.zza;
        zzr.zzb(i2, zzahVar.size(), "index");
        return zzahVar.get(zzs(i2));
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzs(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzs(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final zzah zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzah subList(int i2, int i3) {
        zzah zzahVar = this.zza;
        zzr.zzd(i2, i3, zzahVar.size());
        return zzahVar.subList(zzahVar.size() - i3, zzahVar.size() - i2).zzh();
    }
}
