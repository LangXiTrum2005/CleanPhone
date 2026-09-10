package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhai implements zzhih {
    private final List zza;
    private final zzhip zzb;

    @Nullable
    private final zzhai zzc;

    private zzhai(List list, zzhip zzhipVar, zzhai zzhaiVar) {
        this.zza = list;
        this.zzb = zzhipVar;
        this.zzc = zzhaiVar;
    }

    public static final zzhai zza(zzhpj zzhpjVar) throws GeneralSecurityException {
        if (zzhpjVar == null || zzhpjVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzhai(zzi(zzhpjVar), zzhip.zza);
    }

    public static final zzhai zzf(zzhan zzhanVar) throws GeneralSecurityException {
        zzhad zzhadVar = new zzhad();
        zzhab zzhabVar = new zzhab(zzhanVar, null);
        zzhabVar.zzb();
        zzhabVar.zza();
        zzhadVar.zza(zzhabVar);
        return zzhadVar.zzb();
    }

    public static /* synthetic */ zzhai zzh(final zzhai zzhaiVar) {
        final zzhip zzhipVar = zzhaiVar.zzb;
        if (zzhipVar.zza()) {
            return zzhaiVar;
        }
        zzhae zzhaeVar = new zzhae() { // from class: com.google.android.gms.internal.ads.zzhah
            @Override // com.google.android.gms.internal.ads.zzhae
            public final /* synthetic */ void zza(zzhag zzhagVar) {
                zzhiz.zza().zzb().zza(this.zza, zzhipVar, "keyset_handle", "get_key");
            }
        };
        List<zzhag> list = zzhaiVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzhag zzhagVar : list) {
            arrayList.add(new zzhag(zzhagVar.zzf(), zzhagVar.zzj(), zzhagVar.zzg(), zzhagVar.zzh(), zzhagVar.zzi(), zzhaeVar, null));
        }
        return new zzhai(arrayList, zzhipVar, zzhaiVar);
    }

    private static List zzi(zzhpj zzhpjVar) throws GeneralSecurityException {
        zzgzx zzhimVar;
        boolean z2;
        ArrayList arrayList = new ArrayList(zzhpjVar.zzc());
        for (zzhpi zzhpiVar : zzhpjVar.zzb()) {
            int iZzc = zzhpiVar.zzc();
            try {
                zzhjz zzhjzVarZzk = zzk(zzhpiVar);
                zzhje zzhjeVarZza = zzhje.zza();
                zzhar zzharVarZza = zzhar.zza();
                zzhimVar = !zzhjeVarZza.zzf(zzhjzVarZzk) ? new zzhim(zzhjzVarZzk, zzharVarZza) : zzhjeVarZza.zzg(zzhjzVarZzk, zzharVarZza);
                z2 = false;
            } catch (GeneralSecurityException e2) {
                if (zzhgz.zza.zza()) {
                    throw e2;
                }
                zzhimVar = new zzhim(zzk(zzhpiVar), zzhar.zza());
                z2 = true;
            }
            if (zzhgz.zza.zza() && !zzl(zzhpiVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z3 = true;
            int iZzk = zzhpiVar.zzk();
            if (iZzc != zzhpjVar.zza()) {
                z3 = false;
            }
            arrayList.add(new zzhag(zzhimVar, iZzk, iZzc, z3, z2, zzhag.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzhai zzj() {
        zzhai zzhaiVar = this.zzc;
        return zzhaiVar == null ? this : zzhaiVar;
    }

    private static zzhjz zzk(zzhpi zzhpiVar) throws GeneralSecurityException {
        return zzhjz.zza(zzhpiVar.zzb().zza(), zzhpiVar.zzb().zzb(), zzhpiVar.zzb().zzc(), zzhpiVar.zzd(), zzhpiVar.zzd() == zzhpw.RAW ? null : Integer.valueOf(zzhpiVar.zzc()));
    }

    private static boolean zzl(int i2) {
        int i3 = i2 - 2;
        return i3 == 1 || i3 == 2 || i3 == 3;
    }

    public final String toString() {
        zzhpj zzhpjVarZzb = zzb();
        int i2 = zzhau.zza;
        zzhpk zzhpkVarZza = zzhpn.zza();
        zzhpkVarZza.zza(zzhpjVarZzb.zza());
        for (zzhpi zzhpiVar : zzhpjVarZzb.zzb()) {
            zzhpl zzhplVarZza = zzhpm.zza();
            zzhplVarZza.zza(zzhpiVar.zzb().zza());
            zzhplVarZza.zzd(zzhpiVar.zzk());
            zzhplVarZza.zzc(zzhpiVar.zzd());
            zzhplVarZza.zzb(zzhpiVar.zzc());
            zzhpkVarZza.zzb((zzhpm) zzhplVarZza.zzbu());
        }
        return ((zzhpn) zzhpkVarZza.zzbu()).toString();
    }

    public final zzhpj zzb() {
        try {
            zzhpg zzhpgVarZzh = zzhpj.zzh();
            for (zzhag zzhagVar : this.zza) {
                zzgzx zzgzxVarZza = zzhagVar.zza();
                int iZzj = zzhagVar.zzj();
                int iZzc = zzhagVar.zzc();
                zzhjz zzhjzVar = (zzhjz) zzhje.zza().zzh(zzgzxVarZza, zzhjz.class, zzhar.zza());
                Integer numZzb = zzgzxVarZza.zzb();
                if (numZzb != null && numZzb.intValue() != iZzc) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                zzhph zzhphVarZze = zzhpi.zze();
                zzhoy zzhoyVarZzd = zzhpa.zzd();
                zzhoyVarZzd.zza(zzhjzVar.zzg());
                zzhoyVarZzd.zzb(zzhjzVar.zzb());
                zzhoyVarZzd.zzc(zzhjzVar.zzc());
                zzhphVarZze.zzb(zzhoyVarZzd);
                zzhphVarZze.zze(iZzj);
                zzhphVarZze.zzc(iZzc);
                zzhphVarZze.zzd(zzhjzVar.zzd());
                zzhpgVarZzh.zzb((zzhpi) zzhphVarZze.zzbu());
                if (zzhagVar.zzd()) {
                    zzhpgVarZzh.zza(zzhagVar.zzc());
                }
            }
            return (zzhpj) zzhpgVarZzh.zzbu();
        } catch (GeneralSecurityException e2) {
            throw new zzhkk(e2);
        }
    }

    public final zzhag zzc() {
        for (zzhag zzhagVar : this.zza) {
            if (zzhagVar != null && zzhagVar.zzd()) {
                if (zzhagVar.zzb() == zzgzz.zza) {
                    return zzhagVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    public final int zzd() {
        return this.zza.size();
    }

    public final zzhag zze(int i2) {
        if (i2 < 0 || i2 >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 34 + String.valueOf(iZzd).length()), i2, "Invalid index ", iZzd, " for keyset of size "));
        }
        List list = this.zza;
        zzhag zzhagVar = (zzhag) list.get(i2);
        if (!zzl(zzhagVar.zzj())) {
            throw new IllegalStateException(Z.n(new StringBuilder(String.valueOf(i2).length() + 42), "Keyset-Entry at position ", i2, " has wrong status"));
        }
        if (zzhagVar.zzi()) {
            throw new IllegalStateException(Z.n(new StringBuilder(String.valueOf(i2).length() + 48), "Keyset-Entry at position ", i2, " didn't parse correctly"));
        }
        return (zzhag) list.get(i2);
    }

    public final Object zzg(zzgzu zzgzuVar, Class cls) throws GeneralSecurityException {
        if (!(zzgzuVar instanceof zzhhv)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhhv zzhhvVar = (zzhhv) zzgzuVar;
        zzhpj zzhpjVarZzb = zzj().zzb();
        int i2 = zzhau.zza;
        int iZza = zzhpjVarZzb.zza();
        boolean z2 = true;
        int i3 = 0;
        boolean z3 = false;
        for (zzhpi zzhpiVar : zzhpjVarZzb.zzb()) {
            if (zzhpiVar.zzk() == 3) {
                if (!zzhpiVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhpiVar.zzc())));
                }
                if (zzhpiVar.zzd() == zzhpw.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhpiVar.zzc())));
                }
                if (zzhpiVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhpiVar.zzc())));
                }
                if (zzhpiVar.zzc() == iZza) {
                    if (z3) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z3 = true;
                }
                z2 &= zzhpiVar.zzb().zzc() == zzhoz.ASYMMETRIC_PUBLIC;
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z3 && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i4 = 0; i4 < zzd(); i4++) {
            List list = this.zza;
            if (((zzhag) list.get(i4)).zzi() || !zzl(((zzhag) list.get(i4)).zzj())) {
                String strZza = zzhpjVarZzb.zzd(i4).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i4).length() + 44 + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i4);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhhvVar.zza(zzj(), this.zzb, cls);
    }

    public /* synthetic */ zzhai(List list, zzhip zzhipVar, byte[] bArr) {
        this(list, zzhipVar);
    }

    private zzhai(List list, zzhip zzhipVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhipVar;
        if (zzhgz.zza.zza()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            boolean zZzd = false;
            while (it.hasNext()) {
                zzhag zzhagVar = (zzhag) it.next();
                if (!hashSet.contains(Integer.valueOf(zzhagVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhagVar.zzc()));
                    zZzd |= zzhagVar.zzd();
                } else {
                    int iZzc = zzhagVar.zzc();
                    throw new GeneralSecurityException(Z.n(new StringBuilder(String.valueOf(iZzc).length() + 121), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!zZzd) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
