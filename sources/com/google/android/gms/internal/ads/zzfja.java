package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfja {
    public zzfja() {
        try {
            zzhav.zza();
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzhai zzhaiVarZzf = zzhai.zzf(zzhaa.zzb(zzhja.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgzt.zzb(zzhaiVarZzf, zzgzs.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzdwy zzdwyVar) {
        zzhai zzhaiVarZzc;
        if (str != null && (zzhaiVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgzq) zzhaiVarZzc.zzg(zzhhd.zza(), zzgzq.class)).zza(bArr, bArr2);
                zzdwyVar.zzc().put("ds", "1");
                return new String(bArrZza, "UTF-8");
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e2) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e2.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.decrypt");
                zzdwyVar.zzc().put("dsf", e2.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzhai zzc(String str) {
        try {
            try {
                return zzgzt.zza(zzgzr.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e2) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e2.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CryptoUtils.getHandle");
            return null;
        }
    }
}
