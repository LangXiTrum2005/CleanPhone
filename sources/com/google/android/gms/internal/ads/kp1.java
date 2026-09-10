package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kp1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f16500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f16501h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f16502a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f16503b = np1.f17883g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public lp1 f16504c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public lp1 f16505d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f16506e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mp1 f16507f = mp1.f17511e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f16500g = bigIntegerValueOf;
        f16501h = bigIntegerValueOf.pow(NotificationCompat.FLAG_LOCAL_ONLY);
    }

    public final void a(int i10) {
        this.f16502a = Integer.valueOf(i10);
    }

    public final void b(int i10) throws GeneralSecurityException {
        if (i10 < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i10)));
        }
        this.f16506e = Integer.valueOf(i10);
    }

    public final np1 c() throws GeneralSecurityException {
        Integer num = this.f16502a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f16503b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f16504c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f16505d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f16507f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f16506e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f16502a, Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f29616n)));
        }
        if (this.f16504c != this.f16505d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f16503b;
        int iCompareTo = bigInteger.compareTo(np1.f17883g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f16500g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f16501h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new np1(this.f16502a.intValue(), this.f16503b, this.f16507f, this.f16504c, this.f16505d, this.f16506e.intValue());
    }
}
