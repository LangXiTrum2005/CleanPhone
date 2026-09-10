package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhuk {
    public static final /* synthetic */ int zza = 0;
    private static final zzhxc zzb;
    private static final zzhxc zzc;
    private static final zzhjl zzd;
    private static final zzhji zze;
    private static final zzhig zzf;
    private static final zzhid zzg;
    private static final zzhig zzh;
    private static final zzhid zzi;
    private static final zzhhs zzj;

    static {
        zzhxc zzhxcVarZza = zzhkl.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzb = zzhxcVarZza;
        zzhxc zzhxcVarZza2 = zzhkl.zza("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        zzc = zzhxcVarZza2;
        zzd = zzhjl.zzd(zzhuj.zza, zzhro.class, zzhka.class);
        zze = zzhji.zzd(zzhue.zza, zzhxcVarZza, zzhka.class);
        zzf = zzhig.zzd(zzhuf.zza, zzhrv.class, zzhjz.class);
        zzg = zzhid.zzd(zzhug.zza, zzhxcVarZza2, zzhjz.class);
        zzh = zzhig.zzd(zzhuh.zza, zzhrp.class, zzhjz.class);
        zzi = zzhid.zzd(zzhui.zza, zzhxcVarZza, zzhjz.class);
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhpw.RAW, zzhrn.zzd);
        zzhhrVarZza.zza(zzhpw.TINK, zzhrn.zza);
        zzhhrVarZza.zza(zzhpw.CRUNCHY, zzhrn.zzb);
        zzhhrVarZza.zza(zzhpw.LEGACY, zzhrn.zzc);
        zzj = zzhhrVarZza.zzb();
    }

    public static void zza(zzhje zzhjeVar) throws GeneralSecurityException {
        zzhjeVar.zzd(zzd);
        zzhjeVar.zze(zze);
        zzhjeVar.zzb(zzf);
        zzhjeVar.zzc(zzg);
        zzhjeVar.zzb(zzh);
        zzhjeVar.zzc(zzi);
    }

    public static /* synthetic */ zzhka zzb(zzhro zzhroVar) {
        zzhpc zzhpcVarZze = zzhpd.zze();
        zzhpcVarZze.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zzhpcVarZze.zzb(zzhol.zzc().zzaM());
        zzhpcVarZze.zzc((zzhpw) zzj.zzb(zzhroVar.zzc()));
        return zzhka.zza((zzhpd) zzhpcVarZze.zzbu());
    }

    public static /* synthetic */ zzhro zzc(zzhka zzhkaVar) throws GeneralSecurityException {
        if (!zzhkaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(zzhkaVar.zzc().zza())));
        }
        try {
            if (zzhol.zzb(zzhkaVar.zzc().zzb(), zziab.zza()).zza() == 0) {
                return zzhro.zzb((zzhrn) zzj.zzc(zzhkaVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzibg e2) {
            throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
        }
    }

    public static /* synthetic */ zzhrv zze(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhop zzhopVarZzc = zzhop.zzc(zzhjzVar.zzb(), zziab.zza());
            if (zzhopVarZzc.zza() == 0) {
                return zzhrv.zzc((zzhrn) zzj.zzc(zzhjzVar.zzd()), zzhxc.zza(zzhopVarZzc.zzb().zzy()), zzhjzVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
        }
    }

    public static /* synthetic */ zzhjz zzf(zzhrp zzhrpVar, zzhar zzharVar) {
        zzhom zzhomVarZze = zzhon.zze();
        zzhomVarZze.zzb(zzh(zzhrpVar.zze()));
        byte[] bArrZzc = zzhrpVar.zzf().zzc(zzharVar);
        zzhomVarZze.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return zzhjz.zza("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", ((zzhon) zzhomVarZze.zzbu()).zzaM(), zzhoz.ASYMMETRIC_PRIVATE, (zzhpw) zzj.zzb(zzhrpVar.zzd().zzc()), zzhrpVar.zze().zzb());
    }

    public static /* synthetic */ zzhrp zzg(zzhjz zzhjzVar, zzhar zzharVar) throws GeneralSecurityException {
        if (!zzhjzVar.zzg().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(zzhjzVar.zzg())));
        }
        try {
            zzhon zzhonVarZzd = zzhon.zzd(zzhjzVar.zzb(), zziab.zza());
            if (zzhonVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhop zzhopVarZzc = zzhonVarZzd.zzc();
            if (zzhopVarZzc.zza() == 0) {
                return zzhrp.zzc(zzhrv.zzc((zzhrn) zzj.zzc(zzhjzVar.zzd()), zzhxc.zza(zzhopVarZzc.zzb().zzy()), zzhjzVar.zze()), zzhxe.zza(zzhonVarZzd.zzb().zzy(), zzharVar));
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzibg unused) {
            throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
        }
    }

    private static zzhop zzh(zzhrv zzhrvVar) {
        zzhoo zzhooVarZzd = zzhop.zzd();
        byte[] bArrZzc = zzhrvVar.zzd().zzc();
        zzhooVarZzd.zza(zzhzl.zzs(bArrZzc, 0, bArrZzc.length));
        return (zzhop) zzhooVarZzd.zzbu();
    }
}
