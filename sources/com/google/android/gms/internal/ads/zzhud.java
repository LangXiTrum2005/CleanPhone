package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhud implements zzhaq {
    static final zzhhs zza;
    static final zzhhs zzb;
    static final zzhhs zzc;
    public static final /* synthetic */ int zzd = 0;
    private static final byte[] zze = new byte[0];
    private static final byte[] zzf = {0};
    private final ECPublicKey zzg;
    private final String zzh;
    private final zzhvv zzi;
    private final byte[] zzj;
    private final byte[] zzk;

    @Nullable
    private final Provider zzl;

    static {
        zzhhr zzhhrVarZza = zzhhs.zza();
        zzhhrVarZza.zza(zzhwl.SHA256, zzhrb.zza);
        zzhhrVarZza.zza(zzhwl.SHA384, zzhrb.zzb);
        zzhhrVarZza.zza(zzhwl.SHA512, zzhrb.zzc);
        zza = zzhhrVarZza.zzb();
        zzhhr zzhhrVarZza2 = zzhhs.zza();
        zzhhrVarZza2.zza(zzhvv.IEEE_P1363, zzhrc.zza);
        zzhhrVarZza2.zza(zzhvv.DER, zzhrc.zzb);
        zzb = zzhhrVarZza2.zzb();
        zzhhr zzhhrVarZza3 = zzhhs.zza();
        zzhhrVarZza3.zza(zzhvu.NIST_P256, zzhra.zza);
        zzhhrVarZza3.zza(zzhvu.NIST_P384, zzhra.zzb);
        zzhhrVarZza3.zza(zzhvu.NIST_P521, zzhra.zzc);
        zzc = zzhhrVarZza3.zzb();
    }

    private zzhud(ECPublicKey eCPublicKey, zzhwl zzhwlVar, zzhvv zzhvvVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.zzh = zzhwz.zza(zzhwlVar);
        this.zzg = eCPublicKey;
        this.zzi = zzhvvVar;
        this.zzj = bArr;
        this.zzk = bArr2;
        this.zzl = provider;
    }

    public static zzhaq zzb(zzhri zzhriVar, @Nullable Provider provider) throws GeneralSecurityException {
        return new zzhud((ECPublicKey) (provider != null ? KeyFactory.getInstance("EC", provider) : (KeyFactory) zzhwc.zzf.zzb("EC")).generatePublic(new ECPublicKeySpec(zzhriVar.zzd(), zzhvw.zzb((zzhvu) zzc.zzb(zzhriVar.zzf().zzd())))), (zzhwl) zza.zzb(zzhriVar.zzf().zze()), (zzhvv) zzb.zzb(zzhriVar.zzf().zzc()), zzhriVar.zze().zzc(), zzhriVar.zzf().zzf().equals(zzhrd.zzc) ? zzf : zze, provider);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[RETURN] */
    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b2;
        int i7;
        byte b3;
        String str;
        Provider provider;
        Signature signature;
        byte[] bArr3;
        if (this.zzi == zzhvv.IEEE_P1363) {
            EllipticCurve curve = this.zzg.getParams().getCurve();
            int length = bArr.length;
            int iBitLength = (zzhhq.zzc(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
            if (length != iBitLength + iBitLength) {
                throw new GeneralSecurityException("Invalid signature");
            }
            bArr = zzhvw.zza(bArr);
        }
        int length2 = bArr.length;
        if (length2 >= 8 && bArr[0] == 48) {
            int i8 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i8 == 129) {
                i8 = bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i8 >= 128) {
                    i2 = 2;
                    if (i8 == (length2 - 1) - i2 && bArr[i2 + 1] == 2 && (i6 = (i5 = (i4 = i2 + 3) + (i3 = bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) < length2 && i3 != 0) {
                        b2 = bArr[i4];
                        if ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128 && ((i3 <= 1 || b2 != 0 || (bArr[i2 + 4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128) && bArr[i5] == 2)) {
                            i7 = bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i5 + 2 + i7 == length2 && i7 != 0) {
                                b3 = bArr[i2 + 5 + i3];
                                if ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128 && (i7 <= 1 || b3 != 0 || (bArr[i2 + 6 + i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >= 128)) {
                                    str = this.zzh;
                                    provider = this.zzl;
                                    if (provider != null) {
                                        signature = Signature.getInstance(str, provider);
                                    } else {
                                        signature = (Signature) zzhwc.zzc.zzb(str);
                                    }
                                    signature.initVerify(this.zzg);
                                    signature.update(bArr2);
                                    bArr3 = this.zzk;
                                    if (bArr3.length > 0) {
                                        signature.update(bArr3);
                                    }
                                    try {
                                        if (signature.verify(bArr)) {
                                            return;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    throw new GeneralSecurityException("Invalid signature");
                                }
                            }
                        }
                    }
                }
            } else if (i8 != 128 && i8 <= 129) {
                i2 = 1;
                if (i8 == (length2 - 1) - i2) {
                    b2 = bArr[i4];
                    if ((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128) {
                        i7 = bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if (i5 + 2 + i7 == length2) {
                            b3 = bArr[i2 + 5 + i3];
                            if ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) < 128) {
                                str = this.zzh;
                                provider = this.zzl;
                                if (provider != null) {
                                    signature = Signature.getInstance(str, provider);
                                } else {
                                    signature = (Signature) zzhwc.zzc.zzb(str);
                                }
                                signature.initVerify(this.zzg);
                                signature.update(bArr2);
                                bArr3 = this.zzk;
                                if (bArr3.length > 0) {
                                    signature.update(bArr3);
                                }
                                if (signature.verify(bArr)) {
                                    return;
                                }
                                throw new GeneralSecurityException("Invalid signature");
                            }
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzj;
        int length = bArr3.length;
        if (length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhkl.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
