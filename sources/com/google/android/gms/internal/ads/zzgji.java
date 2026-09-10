package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgji {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgji.zzd((zzggf) zzgekVar);
            }
        }, zzggf.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgji.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgjg
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgji.zzc((zzgfx) zzgdxVar, zzgeoVar);
            }
        }, zzgfx.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgjh
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgji.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzgfx zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzgri zzgriVarZzd = zzgri.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgriVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggc zzggcVarZzc = zzggf.zzc();
            zzggcVarZzc.zzb(zzgriVarZzd.zzf().zzd());
            zzggcVarZzc.zza(12);
            zzggcVarZzc.zzc(16);
            zzggcVarZzc.zzd(zzf(zzgnhVar.zzc()));
            zzggf zzggfVarZze = zzggcVarZzc.zze();
            zzgfv zzgfvVarZza = zzgfx.zza();
            zzgfvVarZza.zzc(zzggfVarZze);
            zzgfvVarZza.zzb(zzgvp.zzb(zzgriVarZzd.zzf().zzA(), zzgeoVar));
            zzgfvVarZza.zza(zzgnhVar.zzf());
            return zzgfvVarZza.zzd();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzggf zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgrl zzgrlVarZzf = zzgrl.zzf(zzgniVar.zzc().zzh(), zzgxb.zza());
            if (zzgrlVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzggc zzggcVarZzc = zzggf.zzc();
            zzggcVarZzc.zzb(zzgrlVarZzf.zza());
            zzggcVarZzc.zza(12);
            zzggcVarZzc.zzc(16);
            zzggcVarZzc.zzd(zzf(zzgniVar.zzc().zzg()));
            return zzggcVarZzc.zze();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzgfx zzgfxVar, zzgeo zzgeoVar) {
        zzgrg zzgrgVarZzb = zzgri.zzb();
        byte[] bArrZzd = zzgfxVar.zzd().zzd(zzgeoVar);
        zzgrgVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzgri) zzgrgVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzgfxVar.zzb().zzd()), zzgfxVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggf zzggfVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgrj zzgrjVarZzc = zzgrl.zzc();
        zzgrjVarZzc.zza(zzggfVar.zzb());
        zzgsnVarZza.zzc(((zzgrl) zzgrjVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzggfVar.zzd()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzggd zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzggd.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggd.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzggd.zzb;
    }

    private static zzgtp zzg(zzggd zzggdVar) throws GeneralSecurityException {
        if (zzggd.zza.equals(zzggdVar)) {
            return zzgtp.TINK;
        }
        if (zzggd.zzb.equals(zzggdVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggd.zzc.equals(zzggdVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggdVar)));
    }
}
