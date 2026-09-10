package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhya extends AbstractMap implements Serializable {
    private static final Comparator zze = new zzhxt();
    zzhxz zza;
    int zzb;
    int zzc;
    final zzhxz zzd;
    private final Comparator zzf;
    private final boolean zzg;
    private zzhxv zzh;
    private zzhxx zzi;

    public zzhya() {
        this(zze, true);
    }

    private final void zzf(zzhxz zzhxzVar, zzhxz zzhxzVar2) {
        zzhxz zzhxzVar3 = zzhxzVar.zza;
        zzhxzVar.zza = null;
        if (zzhxzVar2 != null) {
            zzhxzVar2.zza = zzhxzVar3;
        }
        if (zzhxzVar3 == null) {
            this.zza = zzhxzVar2;
        } else if (zzhxzVar3.zzb == zzhxzVar) {
            zzhxzVar3.zzb = zzhxzVar2;
        } else {
            zzhxzVar3.zzc = zzhxzVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0080 A[SYNTHETIC] */
    private final void zzg(zzhxz zzhxzVar, boolean z2) {
        while (zzhxzVar != null) {
            zzhxz zzhxzVar2 = zzhxzVar.zzb;
            zzhxz zzhxzVar3 = zzhxzVar.zzc;
            boolean z3 = false;
            int i2 = zzhxzVar2 != null ? zzhxzVar2.zzi : 0;
            int i3 = zzhxzVar3 != null ? zzhxzVar3.zzi : 0;
            int i4 = i2 - i3;
            boolean z4 = true;
            if (i4 == -2) {
                zzhxz zzhxzVar4 = zzhxzVar3.zzb;
                zzhxz zzhxzVar5 = zzhxzVar3.zzc;
                int i5 = (zzhxzVar4 != null ? zzhxzVar4.zzi : 0) - (zzhxzVar5 != null ? zzhxzVar5.zzi : 0);
                if (i5 != -1) {
                    if (i5 == 0) {
                        if (!z2) {
                        }
                        if (z4) {
                            return;
                        }
                    } else {
                        z4 = z2;
                    }
                    zzi(zzhxzVar3);
                    zzh(zzhxzVar);
                    if (z4) {
                        return;
                    }
                } else {
                    z3 = z2;
                }
                zzh(zzhxzVar);
                z4 = z3;
                if (z4) {
                    return;
                }
            } else if (i4 == 2) {
                zzhxz zzhxzVar6 = zzhxzVar2.zzb;
                zzhxz zzhxzVar7 = zzhxzVar2.zzc;
                int i6 = (zzhxzVar6 != null ? zzhxzVar6.zzi : 0) - (zzhxzVar7 != null ? zzhxzVar7.zzi : 0);
                if (i6 != 1) {
                    if (i6 == 0) {
                        if (!z2) {
                        }
                        if (z4) {
                            return;
                        }
                    } else {
                        z4 = z2;
                    }
                    zzh(zzhxzVar2);
                    zzi(zzhxzVar);
                    if (z4) {
                        return;
                    }
                } else {
                    z3 = z2;
                }
                zzi(zzhxzVar);
                z4 = z3;
                if (z4) {
                    return;
                }
            } else if (i4 == 0) {
                zzhxzVar.zzi = i2 + 1;
                if (z2) {
                    return;
                }
            } else {
                zzhxzVar.zzi = Math.max(i2, i3) + 1;
                if (!z2) {
                    return;
                }
            }
            zzhxzVar = zzhxzVar.zza;
        }
    }

    private final void zzh(zzhxz zzhxzVar) {
        zzhxz zzhxzVar2 = zzhxzVar.zzb;
        zzhxz zzhxzVar3 = zzhxzVar.zzc;
        zzhxz zzhxzVar4 = zzhxzVar3.zzb;
        zzhxz zzhxzVar5 = zzhxzVar3.zzc;
        zzhxzVar.zzc = zzhxzVar4;
        if (zzhxzVar4 != null) {
            zzhxzVar4.zza = zzhxzVar;
        }
        zzf(zzhxzVar, zzhxzVar3);
        zzhxzVar3.zzb = zzhxzVar;
        zzhxzVar.zza = zzhxzVar3;
        int iMax = Math.max(zzhxzVar2 != null ? zzhxzVar2.zzi : 0, zzhxzVar4 != null ? zzhxzVar4.zzi : 0) + 1;
        zzhxzVar.zzi = iMax;
        zzhxzVar3.zzi = Math.max(iMax, zzhxzVar5 != null ? zzhxzVar5.zzi : 0) + 1;
    }

    private final void zzi(zzhxz zzhxzVar) {
        zzhxz zzhxzVar2 = zzhxzVar.zzb;
        zzhxz zzhxzVar3 = zzhxzVar.zzc;
        zzhxz zzhxzVar4 = zzhxzVar2.zzb;
        zzhxz zzhxzVar5 = zzhxzVar2.zzc;
        zzhxzVar.zzb = zzhxzVar5;
        if (zzhxzVar5 != null) {
            zzhxzVar5.zza = zzhxzVar;
        }
        zzf(zzhxzVar, zzhxzVar2);
        zzhxzVar2.zzc = zzhxzVar;
        zzhxzVar.zza = zzhxzVar2;
        int iMax = Math.max(zzhxzVar3 != null ? zzhxzVar3.zzi : 0, zzhxzVar5 != null ? zzhxzVar5.zzi : 0) + 1;
        zzhxzVar.zzi = iMax;
        zzhxzVar2.zzi = Math.max(iMax, zzhxzVar4 != null ? zzhxzVar4.zzi : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.zza = null;
        this.zzb = 0;
        this.zzc++;
        zzhxz zzhxzVar = this.zzd;
        zzhxzVar.zze = zzhxzVar;
        zzhxzVar.zzd = zzhxzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzb(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        zzhxv zzhxvVar = this.zzh;
        if (zzhxvVar != null) {
            return zzhxvVar;
        }
        zzhxv zzhxvVar2 = new zzhxv(this);
        this.zzh = zzhxvVar2;
        return zzhxvVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzhxz zzhxzVarZzb = zzb(obj);
        if (zzhxzVarZzb != null) {
            return zzhxzVarZzb.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        zzhxx zzhxxVar = this.zzi;
        if (zzhxxVar != null) {
            return zzhxxVar;
        }
        zzhxx zzhxxVar2 = new zzhxx(this);
        this.zzi = zzhxxVar2;
        return zzhxxVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        zzhxz zzhxzVarZza = zza(obj, true);
        Object obj3 = zzhxzVarZza.zzh;
        zzhxzVarZza.zzh = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzhxz zzhxzVarZze = zze(obj);
        if (zzhxzVarZze != null) {
            return zzhxzVarZze.zzh;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb;
    }

    public final zzhxz zza(Object obj, boolean z2) {
        int iCompareTo;
        zzhxz zzhxzVar;
        Comparator comparator = this.zzf;
        zzhxz zzhxzVar2 = this.zza;
        if (zzhxzVar2 != null) {
            Comparable comparable = comparator == zze ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(zzhxzVar2.zzf) : comparator.compare(obj, zzhxzVar2.zzf);
                if (iCompareTo == 0) {
                    return zzhxzVar2;
                }
                zzhxz zzhxzVar3 = iCompareTo < 0 ? zzhxzVar2.zzb : zzhxzVar2.zzc;
                if (zzhxzVar3 == null) {
                    break;
                }
                zzhxzVar2 = zzhxzVar3;
            }
        } else {
            iCompareTo = 0;
        }
        int i2 = iCompareTo;
        if (!z2) {
            return null;
        }
        zzhxz zzhxzVar4 = this.zzd;
        if (zzhxzVar2 != null) {
            zzhxz zzhxzVar5 = zzhxzVar2;
            zzhxzVar = new zzhxz(this.zzg, zzhxzVar5, obj, zzhxzVar4, zzhxzVar4.zze);
            if (i2 < 0) {
                zzhxzVar5.zzb = zzhxzVar;
            } else {
                zzhxzVar5.zzc = zzhxzVar;
            }
            zzg(zzhxzVar5, true);
        } else {
            if (comparator == zze && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            zzhxzVar = new zzhxz(this.zzg, null, obj, zzhxzVar4, zzhxzVar4.zze);
            this.zza = zzhxzVar;
        }
        this.zzb++;
        this.zzc++;
        return zzhxzVar;
    }

    public final zzhxz zzb(Object obj) {
        if (obj != null) {
            try {
                return zza(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final zzhxz zzc(Map.Entry entry) {
        zzhxz zzhxzVarZzb = zzb(entry.getKey());
        if (zzhxzVarZzb == null || !Objects.equals(zzhxzVarZzb.zzh, entry.getValue())) {
            return null;
        }
        return zzhxzVarZzb;
    }

    public final void zzd(zzhxz zzhxzVar, boolean z2) {
        zzhxz zzhxzVar2;
        zzhxz zzhxzVar3;
        int i2;
        if (z2) {
            zzhxz zzhxzVar4 = zzhxzVar.zze;
            zzhxzVar4.zzd = zzhxzVar.zzd;
            zzhxzVar.zzd.zze = zzhxzVar4;
        }
        zzhxz zzhxzVar5 = zzhxzVar.zzb;
        zzhxz zzhxzVar6 = zzhxzVar.zzc;
        zzhxz zzhxzVar7 = zzhxzVar.zza;
        int i3 = 0;
        if (zzhxzVar5 == null || zzhxzVar6 == null) {
            if (zzhxzVar5 != null) {
                zzf(zzhxzVar, zzhxzVar5);
                zzhxzVar.zzb = null;
            } else if (zzhxzVar6 != null) {
                zzf(zzhxzVar, zzhxzVar6);
                zzhxzVar.zzc = null;
            } else {
                zzf(zzhxzVar, null);
            }
            zzg(zzhxzVar7, false);
            this.zzb--;
            this.zzc++;
            return;
        }
        if (zzhxzVar5.zzi > zzhxzVar6.zzi) {
            do {
                zzhxzVar3 = zzhxzVar5;
                zzhxzVar5 = zzhxzVar5.zzc;
            } while (zzhxzVar5 != null);
        } else {
            do {
                zzhxzVar2 = zzhxzVar6;
                zzhxzVar6 = zzhxzVar6.zzb;
            } while (zzhxzVar6 != null);
            zzhxzVar3 = zzhxzVar2;
        }
        zzd(zzhxzVar3, false);
        zzhxz zzhxzVar8 = zzhxzVar.zzb;
        if (zzhxzVar8 != null) {
            i2 = zzhxzVar8.zzi;
            zzhxzVar3.zzb = zzhxzVar8;
            zzhxzVar8.zza = zzhxzVar3;
            zzhxzVar.zzb = null;
        } else {
            i2 = 0;
        }
        zzhxz zzhxzVar9 = zzhxzVar.zzc;
        if (zzhxzVar9 != null) {
            i3 = zzhxzVar9.zzi;
            zzhxzVar3.zzc = zzhxzVar9;
            zzhxzVar9.zza = zzhxzVar3;
            zzhxzVar.zzc = null;
        }
        zzhxzVar3.zzi = Math.max(i2, i3) + 1;
        zzf(zzhxzVar, zzhxzVar3);
    }

    public final zzhxz zze(Object obj) {
        zzhxz zzhxzVarZzb = zzb(obj);
        if (zzhxzVarZzb != null) {
            zzd(zzhxzVarZzb, true);
        }
        return zzhxzVarZzb;
    }

    public zzhya(Comparator comparator, boolean z2) {
        this.zzb = 0;
        this.zzc = 0;
        this.zzf = comparator;
        this.zzg = z2;
        this.zzd = new zzhxz(z2);
    }

    public zzhya(boolean z2) {
        this(zze, false);
    }
}
