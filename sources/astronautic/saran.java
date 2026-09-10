package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPkcs1PublicKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saran extends treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final seminary f14692attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f14693dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BigInteger f14694saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f14695wireman;

    /* JADX INFO: compiled from: RsaSsaPkcs1PublicKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public seminary f14696attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f14697dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public BigInteger f14698saneness;

        public saran attabal() throws GeneralSecurityException {
            if (this.f14696attabal == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.f14698saneness;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iWireman = this.f14696attabal.wireman();
            if (iBitLength != iWireman) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iWireman);
            }
            if (this.f14696attabal.attabal() && this.f14697dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14696attabal.attabal() && this.f14697dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new saran(this.f14696attabal, this.f14698saneness, saneness(), this.f14697dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f14697dern = num;
            return this;
        }

        public saneness marial(seminary seminaryVar) {
            this.f14696attabal = seminaryVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f14696attabal.beachfront() == seminary.wireman.f14716wireman) {
                return hobby.trm.f27847attabal;
            }
            if (this.f14696attabal.beachfront() == seminary.wireman.f14714dern || this.f14696attabal.beachfront() == seminary.wireman.f14715saneness) {
                return hobby.trm.attabal(this.f14697dern.intValue());
            }
            if (this.f14696attabal.beachfront() == seminary.wireman.f14713attabal) {
                return hobby.trm.saneness(this.f14697dern.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + this.f14696attabal.beachfront());
        }

        public saneness wireman(BigInteger bigInteger) {
            this.f14698saneness = bigInteger;
            return this;
        }

        public saneness() {
            this.f14696attabal = null;
            this.f14698saneness = null;
            this.f14697dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f14695wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public seminary saneness() {
        return this.f14692attabal;
    }

    @Override // astronautic.treadless
    public ebullioscopic.attabal dern() {
        return this.f14693dern;
    }

    public BigInteger marial() {
        return this.f14694saneness;
    }

    public saran(seminary seminaryVar, BigInteger bigInteger, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f14692attabal = seminaryVar;
        this.f14694saneness = bigInteger;
        this.f14693dern = attabalVar;
        this.f14695wireman = num;
    }
}
