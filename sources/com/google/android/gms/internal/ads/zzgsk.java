package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzgsk extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzgsk() {
        zza(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final int[] zzl() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzB, reason: merged with bridge method [inline-methods] */
    public final Object[] zzm() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzC, reason: merged with bridge method [inline-methods] */
    public final Object[] zzn() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private final void zzv(int i2) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i2)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] */
    public final int zzh() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i2, int i3, int i4, int i5) {
        int i6 = i3 - 1;
        Object objZza = zzgsl.zza(i3);
        if (i5 != 0) {
            zzgsl.zzc(objZza, i4 & i6, i5 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        for (int i7 = 0; i7 <= i2; i7++) {
            int iZzb = zzgsl.zzb(obj, i7);
            while (iZzb != 0) {
                int i8 = iZzb - 1;
                int i9 = iArrZzl[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int iZzb2 = zzgsl.zzb(objZza, i11);
                zzgsl.zzc(objZza, i11, iZzb);
                iArrZzl[i8] = ((~i6) & i10) | (iZzb2 & i6);
                iZzb = i9 & i2;
            }
        }
        this.zze = objZza;
        zzv(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public final int zzi(Object obj) {
        if (zzb()) {
            return -1;
        }
        int iZzb = zzgsw.zzb(obj);
        int iZzh = zzh();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int iZzb2 = zzgsl.zzb(obj2, iZzb & iZzh);
        if (iZzb2 != 0) {
            int i2 = ~iZzh;
            int i3 = iZzb & i2;
            do {
                int i4 = iZzb2 - 1;
                int i5 = zzl()[i4];
                if ((i5 & i2) == i3 && Objects.equals(obj, zzm()[i4])) {
                    return i4;
                }
                iZzb2 = i5 & iZzh;
            } while (iZzb2 != 0);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final Object zzj(Object obj) {
        if (!zzb()) {
            int iZzh = zzh();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int iZze = zzgsl.zze(obj, null, iZzh, obj2, zzl(), zzm(), null);
            if (iZze != -1) {
                Object obj3 = zzn()[iZze];
                zze(iZze, iZzh);
                this.zzg--;
                zzd();
                return obj3;
            }
        }
        return zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzb()) {
            return;
        }
        zzd();
        Map mapZzc = zzc();
        if (mapZzc != null) {
            this.zzf = zzgwx.zzc(size(), 3, 1073741823);
            mapZzc.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzm(), 0, this.zzg, (Object) null);
        Arrays.fill(zzn(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzl(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsKey(obj);
        }
        return zzi(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.zzg; i2++) {
            if (Objects.equals(obj, zzn()[i2])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzgsf zzgsfVar = new zzgsf(this, null);
        this.zzi = zzgsfVar;
        return zzgsfVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.get(obj);
        }
        int iZzi = zzi(obj);
        if (iZzi == -1) {
            return null;
        }
        return zzn()[iZzi];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzgsh zzgshVar = new zzgsh(this, null);
        this.zzh = zzgshVar;
        return zzgshVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i2;
        if (zzb()) {
            zzgqa.zzj(zzb(), "Arrays already allocated");
            int i3 = this.zzf;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.zze = zzgsl.zza(iMax2);
            zzv(iMax2 - 1);
            this.zza = new int[i3];
            this.zzb = new Object[i3];
            this.zzc = new Object[i3];
        }
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.put(obj, obj2);
        }
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int i4 = this.zzg;
        int i5 = i4 + 1;
        int iZzb = zzgsw.zzb(obj);
        int iZzh = zzh();
        int i6 = iZzb & iZzh;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int iZzb2 = zzgsl.zzb(obj3, i6);
        if (iZzb2 == 0) {
            if (i5 > iZzh) {
                iZzh = zzx(iZzh, zzgsl.zzd(iZzh), iZzb, i4);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzgsl.zzc(obj4, i6, i5);
            }
            i2 = 1;
        } else {
            int i7 = ~iZzh;
            int i8 = iZzb & i7;
            int i9 = 0;
            while (true) {
                int i10 = iZzb2 - 1;
                int i11 = iArrZzl[i10];
                i2 = 1;
                int i12 = i11 & i7;
                if (i12 == i8 && Objects.equals(obj, objArrZzm[i10])) {
                    Object obj5 = objArrZzn[i10];
                    objArrZzn[i10] = obj2;
                    return obj5;
                }
                int i13 = i11 & iZzh;
                i9++;
                if (i13 == 0) {
                    if (i9 < 9) {
                        if (i5 <= iZzh) {
                            iArrZzl[i10] = (i5 & iZzh) | i12;
                            break;
                        }
                        iZzh = zzx(iZzh, zzgsl.zzd(iZzh), iZzb, i4);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzh() + 1, 1.0f);
                    int iZzf = zzf();
                    while (iZzf >= 0) {
                        linkedHashMap.put(zzm()[iZzf], zzn()[iZzf]);
                        iZzf = zzg(iZzf);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzd();
                    return linkedHashMap.put(obj, obj2);
                }
                iZzb2 = i13;
            }
        }
        int length = zzl().length;
        if (i5 > length) {
            int i14 = i2;
            int iMin = Math.min(1073741823, (Math.max(i14, length >>> 1) + length) | i14);
            if (iMin != length) {
                this.zza = Arrays.copyOf(zzl(), iMin);
                this.zzb = Arrays.copyOf(zzm(), iMin);
                this.zzc = Arrays.copyOf(zzn(), iMin);
            }
        }
        zzl()[i4] = (~iZzh) & iZzb;
        zzm()[i4] = obj;
        zzn()[i4] = obj2;
        this.zzg = i5;
        zzd();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapZzc = zzc();
        if (mapZzc != null) {
            return mapZzc.remove(obj);
        }
        Object objZzj = zzj(obj);
        if (objZzj == zzd) {
            return null;
        }
        return objZzj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapZzc = zzc();
        return mapZzc != null ? mapZzc.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzgsj zzgsjVar = new zzgsj(this, null);
        this.zzj = zzgsjVar;
        return zzgsjVar;
    }

    public final void zza(int i2) {
        this.zzf = zzgwx.zzc(i2, 1, 1073741823);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    public final Map zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i2, int i3) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] iArrZzl = zzl();
        Object[] objArrZzm = zzm();
        Object[] objArrZzn = zzn();
        int size = size();
        int i4 = size - 1;
        if (i2 >= i4) {
            objArrZzm[i2] = null;
            objArrZzn[i2] = null;
            iArrZzl[i2] = 0;
            return;
        }
        int i5 = i2 + 1;
        Object obj2 = objArrZzm[i4];
        objArrZzm[i2] = obj2;
        objArrZzn[i2] = objArrZzn[i4];
        objArrZzm[i4] = null;
        objArrZzn[i4] = null;
        iArrZzl[i2] = iArrZzl[i4];
        iArrZzl[i4] = 0;
        int iZzb = zzgsw.zzb(obj2) & i3;
        int iZzb2 = zzgsl.zzb(obj, iZzb);
        if (iZzb2 == size) {
            zzgsl.zzc(obj, iZzb, i5);
            return;
        }
        while (true) {
            int i6 = iZzb2 - 1;
            int i7 = iArrZzl[i6];
            int i8 = i7 & i3;
            if (i8 == size) {
                iArrZzl[i6] = (i7 & (~i3)) | (i3 & i5);
                return;
            }
            iZzb2 = i8;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }

    public final /* synthetic */ Object zzk() {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final /* synthetic */ Object zzo(int i2) {
        return zzm()[i2];
    }

    public final /* synthetic */ Object zzp(int i2) {
        return zzn()[i2];
    }

    public final /* synthetic */ void zzq(int i2, Object obj) {
        zzn()[i2] = obj;
    }

    public final /* synthetic */ int zzs() {
        return this.zzf;
    }

    public final /* synthetic */ int zzt() {
        return this.zzg;
    }

    public final /* synthetic */ void zzu(int i2) {
        this.zzg = i2;
    }

    public zzgsk(int i2) {
        zza(8);
    }
}
