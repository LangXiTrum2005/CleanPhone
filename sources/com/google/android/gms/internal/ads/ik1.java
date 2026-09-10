package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 {
    public static ik1 a(sj1 sj1Var, Provider provider) throws GeneralSecurityException {
        ik1 ik1Var = new ik1();
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            sj1Var.f19984d.b();
            new SecretKeySpec(((zq1) sj1Var.f19983c.f20839b).b(), "AES");
            return ik1Var;
        } catch (NoSuchAlgorithmException e10) {
            throw new GeneralSecurityException("AES-CMAC not available.", e10);
        }
    }
}
