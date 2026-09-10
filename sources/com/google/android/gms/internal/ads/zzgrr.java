package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrr extends zzgrp implements ListIterator {
    final /* synthetic */ zzgrs zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrr(zzgrs zzgrsVar) {
        super(zzgrsVar);
        Objects.requireNonNull(zzgrsVar);
        this.zzd = zzgrsVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzgrs zzgrsVar = this.zzd;
        boolean zIsEmpty = zzgrsVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzgrt zzgrtVar = zzgrsVar.zzf;
        zzgrtVar.zzq(zzgrtVar.zzp() + 1);
        if (zIsEmpty) {
            zzgrsVar.zzc();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrr(zzgrs zzgrsVar, int i2) {
        super(zzgrsVar, ((List) zzgrsVar.zzb).listIterator(i2));
        Objects.requireNonNull(zzgrsVar);
        this.zzd = zzgrsVar;
    }
}
