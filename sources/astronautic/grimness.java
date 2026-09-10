package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1PrivateKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class grimness extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f14578attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ebullioscopic.saneness f14579beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ebullioscopic.saneness f14580competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.saneness f14581dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final ebullioscopic.saneness f14582marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.saneness f14583saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ebullioscopic.saneness f14584wireman;

    /* JADX INFO: compiled from: RsaSsaPkcs1PrivateKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public saran f14585attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14586beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14587competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14588dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14589marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14590saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public ebullioscopic.saneness f14591wireman;

        public grimness attabal() throws GeneralSecurityException {
            saran saranVar = this.f14585attabal;
            if (saranVar == null) {
                throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.f14588dern == null || this.f14591wireman == null) {
                throw new GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.f14590saneness == null) {
                throw new GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.f14589marial == null || this.f14586beachfront == null) {
                throw new GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.f14587competently == null) {
                throw new GeneralSecurityException("Cannot build without CRT coefficient");
            }
            BigInteger bigIntegerMarial = saranVar.saneness().marial();
            BigInteger bigIntegerMarial2 = this.f14585attabal.marial();
            BigInteger bigIntegerSaneness = this.f14588dern.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness2 = this.f14591wireman.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness3 = this.f14590saneness.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness4 = this.f14589marial.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness5 = this.f14586beachfront.saneness(discernable.beachfront.attabal());
            BigInteger bigIntegerSaneness6 = this.f14587competently.saneness(discernable.beachfront.attabal());
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
                return new grimness(this.f14585attabal, this.f14588dern, this.f14591wireman, this.f14590saneness, this.f14589marial, this.f14586beachfront, this.f14587competently);
            }
            throw new GeneralSecurityException("qInv is invalid.");
        }

        public saneness beachfront(saran saranVar) {
            this.f14585attabal = saranVar;
            return this;
        }

        public saneness dern(ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2) {
            this.f14589marial = sanenessVar;
            this.f14586beachfront = sanenessVar2;
            return this;
        }

        public saneness marial(ebullioscopic.saneness sanenessVar) {
            this.f14590saneness = sanenessVar;
            return this;
        }

        public saneness saneness(ebullioscopic.saneness sanenessVar) {
            this.f14587competently = sanenessVar;
            return this;
        }

        public saneness wireman(ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2) {
            this.f14588dern = sanenessVar;
            this.f14591wireman = sanenessVar2;
            return this;
        }

        public saneness() {
            this.f14585attabal = null;
            this.f14590saneness = null;
            this.f14588dern = null;
            this.f14591wireman = null;
            this.f14589marial = null;
            this.f14586beachfront = null;
            this.f14587competently = null;
        }
    }

    public static saneness marial() {
        return new saneness();
    }

    public ebullioscopic.saneness apical() {
        return this.f14584wireman;
    }

    public ebullioscopic.saneness beachfront() {
        return this.f14580competently;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public seminary saneness() {
        return this.f14578attabal.saneness();
    }

    public ebullioscopic.saneness cutely() {
        return this.f14581dern;
    }

    public ebullioscopic.saneness formularize() {
        return this.f14583saneness;
    }

    @Override // astronautic.milliradian
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public saran wireman() {
        return this.f14578attabal;
    }

    public ebullioscopic.saneness impromptu() {
        return this.f14582marial;
    }

    public ebullioscopic.saneness taiyuan() {
        return this.f14579beachfront;
    }

    public grimness(saran saranVar, ebullioscopic.saneness sanenessVar, ebullioscopic.saneness sanenessVar2, ebullioscopic.saneness sanenessVar3, ebullioscopic.saneness sanenessVar4, ebullioscopic.saneness sanenessVar5, ebullioscopic.saneness sanenessVar6) {
        this.f14578attabal = saranVar;
        this.f14581dern = sanenessVar;
        this.f14584wireman = sanenessVar2;
        this.f14583saneness = sanenessVar3;
        this.f14582marial = sanenessVar4;
        this.f14579beachfront = sanenessVar5;
        this.f14580competently = sanenessVar6;
    }
}
