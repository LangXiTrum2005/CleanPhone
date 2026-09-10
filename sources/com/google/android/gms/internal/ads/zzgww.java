package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
final class zzgww extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgww(int[] iArr, int i2, int i3) {
        this.zza = iArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgwx.zzi(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgww)) {
            return super.equals(obj);
        }
        zzgww zzgwwVar = (zzgww) obj;
        int i2 = this.zzc;
        int i3 = this.zzb;
        int i4 = zzgwwVar.zzc;
        int i5 = zzgwwVar.zzb;
        int i6 = i2 - i3;
        if (i4 - i5 != i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (this.zza[i3 + i7] != zzgwwVar.zza[i5 + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        zzgqa.zzm(i2, i3 - i4, "index");
        return Integer.valueOf(this.zza[i4 + i2]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zza[i2]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.zza;
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.zzb;
        int iZzi = zzgwx.zzi(iArr, iIntValue, i2, this.zzc);
        if (iZzi >= 0) {
            return iZzi - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.zzb;
            int i3 = this.zzc - 1;
            while (i3 >= i2) {
                if (iArr[i3] != iIntValue) {
                    i3--;
                } else if (i3 >= 0) {
                    return i3 - i2;
                }
            }
            i3 = -1;
            if (i3 >= 0) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        Integer num = (Integer) obj;
        zzgqa.zzm(i2, i3 - i4, "index");
        int[] iArr = this.zza;
        int i5 = i4 + i2;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        int i4 = this.zzc;
        int i5 = this.zzb;
        zzgqa.zzo(i2, i3, i4 - i5);
        return i2 == i3 ? Collections.EMPTY_LIST : new zzgww(this.zza, i2 + i5, i5 + i3);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i2 = this.zzc;
        int i3 = this.zzb;
        StringBuilder sb = new StringBuilder((i2 - i3) * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.zza;
        sb.append(iArr[i3]);
        while (true) {
            i3++;
            if (i3 >= i2) {
                sb.append(AbstractJsonLexerKt.END_LIST);
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i3]);
        }
    }
}
