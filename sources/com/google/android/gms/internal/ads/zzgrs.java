package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgrs extends zzgrq implements List {
    final /* synthetic */ zzgrt zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrs(zzgrt zzgrtVar, Object obj, List list, zzgrq zzgrqVar) {
        super(zzgrtVar, obj, list, zzgrqVar);
        Objects.requireNonNull(zzgrtVar);
        this.zzf = zzgrtVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        zzgrt zzgrtVar = this.zzf;
        zzgrtVar.zzq(zzgrtVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i2, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgrt zzgrtVar = this.zzf;
        zzgrtVar.zzq(zzgrtVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zza();
        return ((List) this.zzb).get(i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgrr(this);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i2);
        zzgrt zzgrtVar = this.zzf;
        zzgrtVar.zzq(zzgrtVar.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zza();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zza();
        List listSubList = ((List) this.zzb).subList(i2, i3);
        zzgrq zzgrqVar = this.zzc;
        if (zzgrqVar == null) {
            zzgrqVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgrqVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        zza();
        return new zzgrr(this, i2);
    }
}
