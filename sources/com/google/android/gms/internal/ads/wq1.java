package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wq1 implements hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f21585a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21586b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w50 f21587c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        sq1 sq1Var = sq1.f20032a;
        ep1 ep1Var = ep1.f14042b;
        map.put(sq1Var, ep1Var);
        map2.put(ep1Var, sq1Var);
        sq1 sq1Var2 = sq1.f20033b;
        ep1 ep1Var2 = ep1.f14043c;
        map.put(sq1Var2, ep1Var2);
        map2.put(ep1Var2, sq1Var2);
        sq1 sq1Var3 = sq1.f20034c;
        ep1 ep1Var3 = ep1.f14044d;
        map.put(sq1Var3, ep1Var3);
        map2.put(ep1Var3, sq1Var3);
        f21587c = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static hf1 b(ip1 ip1Var) {
        try {
            int i10 = rj1.f19601a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerD = v71.d();
            if (providerD != null) {
                return dq1.c(ip1Var, providerD);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) qq1.f19168g.f19169a.zza("RSA");
            BigInteger bigInteger = ip1Var.f15814c;
            gp1 gp1Var = ip1Var.f15813b;
            return new zp1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, gp1Var.f14927b)), (sq1) f21587c.a(gp1Var.f14929d), ip1Var.f15815d.b(), gp1Var.f14928c.equals(fp1.f14503d) ? f21586b : f21585a);
        }
    }
}
