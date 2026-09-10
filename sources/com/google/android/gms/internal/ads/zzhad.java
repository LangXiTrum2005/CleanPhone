package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhad {
    private final List zza = new ArrayList();
    private final zzhip zzb = zzhip.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzhab) it.next()).zzd(false);
        }
    }

    public final zzhad zza(zzhab zzhabVar) {
        if (zzhabVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzhabVar.zzc()) {
            zzc();
        }
        zzhabVar.zzi(this);
        this.zza.add(zzhabVar);
        return this;
    }

    public final zzhai zzb() throws GeneralSecurityException {
        int i2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzhab> list = this.zza;
        ArrayList arrayList = new ArrayList(list.size());
        int i3 = 0;
        while (i3 < list.size() - 1) {
            int i4 = i3 + 1;
            if (((zzhab) list.get(i3)).zzg() == zzhac.zza && ((zzhab) list.get(i4)).zzg() != zzhac.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzhab zzhabVar : list) {
            zzhabVar.zze();
            if (zzhabVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i5 = 3;
            if (zzhabVar.zzg() == zzhac.zza) {
                int i6 = 0;
                while (true) {
                    if (i6 != 0 && !hashSet.contains(Integer.valueOf(i6))) {
                        break;
                    }
                    int i7 = zzhkl.zza;
                    i6 = 0;
                    while (i6 == 0) {
                        byte[] bArrZza = zzhkc.zza(4);
                        i6 = (bArrZza[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrZza[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArrZza[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrZza[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                    }
                }
                i2 = i6;
            } else {
                zzhabVar.zzg();
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (hashSet.contains(numValueOf)) {
                int i8 = i2;
                throw new GeneralSecurityException(Z.n(new StringBuilder(String.valueOf(i8).length() + 31), "Id ", i8, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgzx zzgzxVarZzc = zzhiv.zza().zzc(zzhabVar.zzf(), true != zzhabVar.zzf().zza() ? null : numValueOf);
            zzgzz zzgzzVarZze = zzhabVar.zze();
            zzgzz zzgzzVar = zzgzz.zza;
            if (!zzgzzVar.equals(zzgzzVarZze)) {
                if (zzgzz.zzb.equals(zzgzzVarZze)) {
                    i5 = 4;
                } else {
                    if (!zzgzz.zzc.equals(zzgzzVarZze)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i5 = 5;
                }
            }
            zzhag zzhagVar = new zzhag(zzgzxVarZzc, i5, i2, zzhabVar.zzc(), false, zzhag.zza, null);
            if (zzhabVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzhabVar.zze() != zzgzzVar) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzhagVar);
        }
        if (num != null) {
            return zzhai.zzh(new zzhai(arrayList, this.zzb, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }
}
