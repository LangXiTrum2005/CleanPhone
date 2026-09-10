package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class dp1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f13616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f13617f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f13618a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f13619b = gp1.f14925e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ep1 f13620c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fp1 f13621d = fp1.f14504e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f13616e = bigIntegerValueOf;
        f13617f = bigIntegerValueOf.pow(NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final void a(int i10) {
        this.f13618a = Integer.valueOf(i10);
    }

    public final gp1 b() throws GeneralSecurityException {
        Integer num = this.f13618a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f13619b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f13620c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f13621d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f13618a));
        }
        BigInteger bigInteger = this.f13619b;
        int iCompareTo = bigInteger.compareTo(gp1.f14925e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f13616e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f13617f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new gp1(this.f13618a.intValue(), this.f13619b, this.f13621d, this.f13620c);
    }
}
