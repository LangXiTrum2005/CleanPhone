package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class su0 {
    public static final String a(byte[] bArr, byte[] bArr2, String str, wh0 wh0Var) {
        iw0 iw0VarD;
        if (str != null) {
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 11));
                    try {
                        ks1 ks1Var = ks1.f16518a;
                        int i10 = tr1.f20473a;
                        bn1 bn1VarE = bn1.E(byteArrayInputStream, ks1.f16519b);
                        byteArrayInputStream.close();
                        iw0VarD = iw0.d(bn1VarE);
                        if (iw0VarD != null) {
                            try {
                                vc1.c();
                                byte[] bArrA = ((xe1) iw0VarD.A(rb0.f19510n, xe1.class)).a(bArr, bArr2);
                                wh0Var.f21514a.put("ds", "1");
                                return new String(bArrA, StandardCharsets.UTF_8);
                            } catch (UnsupportedOperationException | GeneralSecurityException e10) {
                                zze.zza("Failed to decrypt ".concat(e10.toString()));
                                zzt.zzh().d("CryptoUtils.decrypt", e10);
                                wh0Var.f21514a.put("dsf", e10.toString());
                            }
                        }
                    } catch (Throwable th2) {
                        byteArrayInputStream.close();
                        throw th2;
                    }
                } catch (IOException unused) {
                    throw new GeneralSecurityException("Parse keyset failed");
                }
            } catch (GeneralSecurityException e11) {
                zze.zza("Failed to get keysethandle".concat(e11.toString()));
                zzt.zzh().d("CryptoUtils.getHandle", e11);
                iw0VarD = null;
            }
        }
        return null;
    }
}
