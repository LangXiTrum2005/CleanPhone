package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjn {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvoVarZzb = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzgvoVarZzb;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjj
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnm zza(zzgek zzgekVar) {
                return zzgjn.zzd((zzggq) zzgekVar);
            }
        }, zzggq.class, zzgni.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjk
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgek zza(zzgnm zzgnmVar) {
                return zzgjn.zzb((zzgni) zzgnmVar);
            }
        }, zzgvoVarZzb, zzgni.class);
        zze = zzglh.zzb(new zzglf() { // from class: com.google.android.gms.internal.ads.zzgjl
            @Override // com.google.android.gms.internal.ads.zzglf
            public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                return zzgjn.zzc((zzggi) zzgdxVar, zzgeoVar);
            }
        }, zzggi.class, zzgnh.class);
        zzf = zzgld.zzb(new zzglb() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzglb
            public final zzgdx zza(zzgnm zzgnmVar, zzgeo zzgeoVar) {
                return zzgjn.zza((zzgnh) zzgnmVar, zzgeoVar);
            }
        }, zzgvoVarZzb, zzgnh.class);
    }

    public static /* synthetic */ zzggi zza(zzgnh zzgnhVar, zzgeo zzgeoVar) throws GeneralSecurityException {
        if (!zzgnhVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzgro zzgroVarZzd = zzgro.zzd(zzgnhVar.zze(), zzgxb.zza());
            if (zzgroVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzggn zzggnVarZzc = zzggq.zzc();
            zzggnVarZzc.zza(zzgroVarZzd.zzf().zzd());
            zzggnVarZzc.zzb(zzf(zzgnhVar.zzc()));
            zzggq zzggqVarZzc = zzggnVarZzc.zzc();
            zzggg zzgggVarZza = zzggi.zza();
            zzgggVarZza.zzc(zzggqVarZzc);
            zzgggVarZza.zzb(zzgvp.zzb(zzgroVarZzd.zzf().zzA(), zzgeoVar));
            zzgggVarZza.zza(zzgnhVar.zzf());
            return zzgggVarZza.zzd();
        } catch (zzgyg unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzggq zzb(zzgni zzgniVar) throws GeneralSecurityException {
        if (!zzgniVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgniVar.zzc().zzi())));
        }
        try {
            zzgrr zzgrrVarZzf = zzgrr.zzf(zzgniVar.zzc().zzh(), zzgxb.zza());
            if (zzgrrVarZzf.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzggn zzggnVarZzc = zzggq.zzc();
            zzggnVarZzc.zza(zzgrrVarZzf.zza());
            zzggnVarZzc.zzb(zzf(zzgniVar.zzc().zzg()));
            return zzggnVarZzc.zzc();
        } catch (zzgyg e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzgnh zzc(zzggi zzggiVar, zzgeo zzgeoVar) {
        zzgrm zzgrmVarZzb = zzgro.zzb();
        byte[] bArrZzd = zzggiVar.zzd().zzd(zzgeoVar);
        zzgrmVarZzb.zza(zzgwj.zzv(bArrZzd, 0, bArrZzd.length));
        return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgro) zzgrmVarZzb.zzbr()).zzaN(), zzgsj.SYMMETRIC, zzg(zzggiVar.zzb().zzd()), zzggiVar.zze());
    }

    public static /* synthetic */ zzgni zzd(zzggq zzggqVar) {
        zzgsn zzgsnVarZza = zzgsp.zza();
        zzgsnVarZza.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgrp zzgrpVarZzc = zzgrr.zzc();
        zzgrpVarZzc.zza(zzggqVar.zzb());
        zzgsnVarZza.zzc(((zzgrr) zzgrpVarZzc.zzbr()).zzaN());
        zzgsnVarZza.zza(zzg(zzggqVar.zzd()));
        return zzgni.zzb((zzgsp) zzgsnVarZza.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) throws GeneralSecurityException {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzggo zzf(zzgtp zzgtpVar) throws GeneralSecurityException {
        int iOrdinal = zzgtpVar.ordinal();
        if (iOrdinal == 1) {
            return zzggo.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzggo.zzc;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException(AbstractC3950lJ.p("Unable to parse OutputPrefixType: ", zzgtpVar.zza()));
            }
        }
        return zzggo.zzb;
    }

    private static zzgtp zzg(zzggo zzggoVar) throws GeneralSecurityException {
        if (zzggo.zza.equals(zzggoVar)) {
            return zzgtp.TINK;
        }
        if (zzggo.zzb.equals(zzggoVar)) {
            return zzgtp.CRUNCHY;
        }
        if (zzggo.zzc.equals(zzggoVar)) {
            return zzgtp.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggoVar)));
    }
}
