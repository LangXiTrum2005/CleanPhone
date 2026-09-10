package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPssPrivateKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mathsort extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final splinterproof f14617attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ebullioscopic.saneness f14618beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ebullioscopic.saneness f14619competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.saneness f14620dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ebullioscopic.saneness f14621marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.saneness f14622saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ebullioscopic.saneness f14623wireman;

    /* JADX INFO: compiled from: RsaSsaPssPrivateKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public splinterproof f14624attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14625beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14626competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14627dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14628marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14629saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14630wireman;

        public mathsort attabal() throws GeneralSecurityException {
            splinterproof splinterproofVar = this.f14624attabal;
            if (splinterproofVar == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f14627dern == null || this.f14630wireman == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.f14629saneness == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f14628marial == null || this.f14625beachfront == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f14626competently == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerMarial = splinterproofVar.saneness().marial();
            BigInteger bigIntegerMarial2 = this.f14624attabal.marial();
            BigInteger bigIntegerSaneness = this.f14627dern.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness2 = this.f14630wireman.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness3 = this.f14629saneness.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness4 = this.f14628marial.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness5 = this.f14625beachfront.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness6 = this.f14626competently.saneness(discernable.beachfront.attabal());
            if (!bigIntegerSaneness.isProbablePrime(10)) {
                throw new GeneralSecurityException("p is not a prime");
            }
            if (!bigIntegerSaneness2.isProbablePrime(10)) {
                throw new GeneralSecurityException("q is not a prime");
            }
            if (!bigIntegerSaneness.multiply(bigIntegerSaneness2).equals(bigIntegerMarial2)) {
                throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            BigInteger bigInteger = BigInteger.ONE;
            BigInteger bigIntegerSubtract = bigIntegerSaneness.subtract(bigInteger);
            BigInteger bigIntegerSubtract2 = bigIntegerSaneness2.subtract(bigInteger);
            if (!bigIntegerMarial.multiply(bigIntegerSaneness3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger)) {
                throw new GeneralSecurityException("D is invalid.");
            }
            if (!bigIntegerMarial.multiply(bigIntegerSaneness4).mod(bigIntegerSubtract).equals(bigInteger)) {
                throw new GeneralSecurityException("dP is invalid.");
            }
            if (!bigIntegerMarial.multiply(bigIntegerSaneness5).mod(bigIntegerSubtract2).equals(bigInteger)) {
                throw new GeneralSecurityException("dQ is invalid.");
            }
            if (bigIntegerSaneness2.multiply(bigIntegerSaneness6).mod(bigIntegerSaneness).equals(bigInteger)) {
                return new mathsort(this.f14624attabal, this.f14627dern, this.f14630wireman, this.f14629saneness, this.f14628marial, this.f14625beachfront, this.f14626competently);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public saneness beachfront(splinterproof splinterproofVar) {
            this.f14624attabal = splinterproofVar;
            return this;
        }

        public saneness dern(ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2) {
            this.f14628marial = sanenessVar;
            this.f14625beachfront = sanenessVar2;
            return this;
        }

        public saneness marial(ebullioscopic.saneness sanenessVar) {
            this.f14629saneness = sanenessVar;
            return this;
        }

        public saneness saneness(ebullioscopic.saneness sanenessVar) {
            this.f14626competently = sanenessVar;
            return this;
        }

        public saneness wireman(ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2) {
            this.f14627dern = sanenessVar;
            this.f14630wireman = sanenessVar2;
            return this;
        }

        public saneness() {
            this.f14624attabal = null;
            this.f14629saneness = null;
            this.f14627dern = null;
            this.f14630wireman = null;
            this.f14628marial = null;
            this.f14625beachfront = null;
            this.f14626competently = null;
        }
    }

    public static saneness marial() {
        return new saneness();
    }

    public ebullioscopic.saneness apical() {
        return this.f14623wireman;
    }

    public ebullioscopic.saneness beachfront() {
        return this.f14619competently;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public peridotite saneness() {
        return this.f14617attabal.saneness();
    }

    public ebullioscopic.saneness cutely() {
        return this.f14620dern;
    }

    public ebullioscopic.saneness formularize() {
        return this.f14622saneness;
    }

    @Override // astronautic.milliradian
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public splinterproof wireman() {
        return this.f14617attabal;
    }

    public ebullioscopic.saneness impromptu() {
        return this.f14621marial;
    }

    public ebullioscopic.saneness taiyuan() {
        return this.f14618beachfront;
    }

    public mathsort(splinterproof splinterproofVar, ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2, ebullioscopic.saneness sanenessVar3, ebullioscopic.saneness sanenessVar4, ebullioscopic.saneness sanenessVar5, ebullioscopic.saneness sanenessVar6) {
        this.f14617attabal = splinterproofVar;
        this.f14620dern = sanenessVar;
        this.f14623wireman = sanenessVar2;
        this.f14622saneness = sanenessVar3;
        this.f14621marial = sanenessVar4;
        this.f14618beachfront = sanenessVar5;
        this.f14619competently = sanenessVar6;
    }
}
