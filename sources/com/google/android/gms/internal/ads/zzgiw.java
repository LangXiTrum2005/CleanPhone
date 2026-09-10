package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgiw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgis
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgiw.zzd((zzgfk) zzgekVar);
            }
        }, zzgfk.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgit
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgiw.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgiu
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgiw.zzc((zzgfb) zzgdxVar, zzgeoVar);
            }
        }, zzgfb.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgiv
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgiw.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgfb zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzgqk zzgqkVarZzd = zzgqk.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgqkVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzgqkVarZzd.zzf().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzgqkVarZzd.zzg().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgfg zzgfgVarZzf = zzgfk.zzf();
            zzgfgVarZzf.zza(zzgqkVarZzd.zzf().zzg().zzd());
            zzgfgVarZzf.zzc(zzgqkVarZzd.zzg().zzh().zzd());
            zzgfgVarZzf.zzd(zzgqkVarZzd.zzf().zzf().zza());
            zzgfgVarZzf.zze(zzgqkVarZzd.zzg().zzg().zza());
            zzgfgVarZzf.zzb(zzf(zzgqkVarZzd.zzg().zzg().zzb()));
            zzgfgVarZzf.zzf(zzg(zzgnhVar.zzc()));
            zzgfk zzgfkVarZzg = zzgfgVarZzf.zzg();
            zzgez zzgezVarZza = zzgfb.zza();
            zzgezVarZza.zzd(zzgfkVarZzg);
            zzgezVarZza.zza(zzgvp.zzb(zzgqkVarZzd.zzf().zzg().zzA(), zzgeoVar));
            zzgezVarZza.zzb(zzgvp.zzb(zzgqkVarZzd.zzg().zzh().zzA(), zzgeoVar));
            zzgezVarZza.zzc(zzgnhVar.zzf());
            return zzgezVarZza.zze();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzgfk zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgqn zzgqnVarZzc = zzgqn.zzc(zzgniVar.zzc().zzh(), zzgxb.zza());
            if (zzgqnVarZzc.zzf().zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgfg zzgfgVarZzf = zzgfk.zzf();
            zzgfgVarZzf.zza(zzgqnVarZzc.zzd().zza());
            zzgfgVarZzf.zzc(zzgqnVarZzc.zzf().zza());
            zzgfgVarZzf.zzd(zzgqnVarZzc.zzd().zzf().zza());
            zzgfgVarZzf.zze(zzgqnVarZzc.zzf().zzh().zza());
            zzgfgVarZzf.zzb(zzf(zzgqnVarZzc.zzf().zzh().zzb()));
            zzgfgVarZzf.zzf(zzg(zzgniVar.zzc().zzg()));
            return zzgfgVarZzf.zzg();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfb zzgfbVar, zzgeo zzgeoVar) {
        zzgqi zzgqiVarZzb = zzgqk.zzb();
        zzgqo zzgqoVarZzb = zzgqq.zzb();
        zzgqu zzgquVarZzb = zzgqw.zzb();
        zzgquVarZzb.zza(zzgfbVar.zzb().zzd());
        zzgqoVarZzb.zzb((zzgqw) zzgquVarZzb.zzbr());
        byte[] bArrZzd = zzgfbVar.zzd().zzd(zzgeoVar);
        zzgqoVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        zzgqiVarZzb.zza((zzgqq) zzgqoVarZzb.zzbr());
        zzgrz zzgrzVarZzb = zzgsb.zzb();
        zzgrzVarZzb.zzb(zzh(zzgfbVar.zzb()));
        byte[] bArrZzd2 = zzgfbVar.zze().zzd(zzgeoVar);
        zzgrzVarZzb.zza(zzgwj.zzv(bArrZzd2, 0, bArrZzd2.length));
        zzgqiVarZzb.zzb((zzgsb) zzgrzVarZzb.zzbr());
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgqk) zzgqiVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzi(zzgfbVar.zzb().zzh()), zzgfbVar.zzf());
    }

    public static /* synthetic */ zzgni zzd(zzgfk zzgfkVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgql zzgqlVarZza = zzgqn.zza();
        zzgqr zzgqrVarZzb = zzgqt.zzb();
        zzgqu zzgquVarZzb = zzgqw.zzb();
        zzgquVarZzb.zza(zzgfkVar.zzd());
        zzgqrVarZzb.zzb((zzgqw) zzgquVarZzb.zzbr());
        zzgqrVarZzb.zza(zzgfkVar.zzb());
        zzgqlVarZza.zza((zzgqt) zzgqrVarZzb.zzbr());
        zzgsc zzgscVarZzc = zzgse.zzc();
        zzgscVarZzc.zzb(zzh(zzgfkVar));
        zzgscVarZzc.zza(zzgfkVar.zzc());
        zzgqlVarZza.zzb((zzgse) zzgscVarZzc.zzbr());
        zzgsnVarZza.zzc(((zzgqn) zzgqlVarZza.zzbr()).zzaN());
        zzgsnVarZza.zza(zzi(zzgfkVar.zzh()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgfh zzf(zzgry zzgryVar) throws GeneralSecurityException {
        int iOrdinal = zzgryVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfh.zza;
        }
        if (iOrdinal == 2) {
            return zzgfh.zzd;
        }
        if (iOrdinal == 3) {
            return zzgfh.zzc;
        }
        if (iOrdinal == 4) {
            return zzgfh.zze;
        }
        if (iOrdinal == 5) {
            return zzgfh.zzb;
        }
        throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse HashType: ", zzgryVar.zza()));
    }

    private static zzgfi zzg(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzgfi.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgfi.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzgfi.zzb;
    }

    private static zzgsh zzh(zzgfk zzgfkVar) throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgsf zzgsfVarZzc = zzgsh.zzc();
        zzgsfVarZzc.zzb(zzgfkVar.zze());
        zzgfh zzgfhVarZzg = zzgfkVar.zzg();
        if (zzgfh.zza.equals(zzgfhVarZzg)) {
            zzgryVar = zzgry.SHA1;
        } else if (zzgfh.zzb.equals(zzgfhVarZzg)) {
            zzgryVar = zzgry.SHA224;
        } else if (zzgfh.zzc.equals(zzgfhVarZzg)) {
            zzgryVar = zzgry.SHA256;
        } else if (zzgfh.zzd.equals(zzgfhVarZzg)) {
            zzgryVar = zzgry.SHA384;
        } else {
            if (!zzgfh.zze.equals(zzgfhVarZzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzgfhVarZzg)));
            }
            zzgryVar = zzgry.SHA512;
        }
        zzgsfVarZzc.zza(zzgryVar);
        return (zzgsh) zzgsfVarZzc.zzbr();
    }

    private static zzgtp zzi(zzgfi zzgfiVar) throws GeneralSecurityException {
        if (zzgfi.zza.equals(zzgfiVar)) {
            return zzgtp.TINK;
        }
        if (zzgfi.zzb.equals(zzgfiVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzgfi.zzc.equals(zzgfiVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfiVar)));
    }
}
