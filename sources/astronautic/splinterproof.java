package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RsaSsaPssPublicKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class splinterproof extends treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final peridotite f14717attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f14718dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final BigInteger f14719saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f14720wireman;

    /* JADX INFO: compiled from: RsaSsaPssPublicKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public peridotite f14721attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f14722dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public BigInteger f14723saneness;

        public splinterproof attabal() throws GeneralSecurityException {
            if (this.f14721attabal == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            BigInteger bigInteger = this.f14723saneness;
            if (bigInteger == null) {
                throw new GeneralSecurityException("Cannot build without modulus");
            }
            int iBitLength = bigInteger.bitLength();
            int iWireman = this.f14721attabal.wireman();
            if (iBitLength != iWireman) {
                throw new GeneralSecurityException("Got modulus size " + iBitLength + ", but parameters requires modulus size " + iWireman);
            }
            if (this.f14721attabal.attabal() && this.f14722dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14721attabal.attabal() && this.f14722dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new splinterproof(this.f14721attabal, this.f14723saneness, saneness(), this.f14722dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f14722dern = num;
            return this;
        }

        public saneness marial(peridotite peridotiteVar) {
            this.f14721attabal = peridotiteVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f14721attabal.impromptu() == peridotite.wireman.f14658wireman) {
                return hobby.trm.f27847attabal;
            }
            if (this.f14721attabal.impromptu() == peridotite.wireman.f14656dern || this.f14721attabal.impromptu() == peridotite.wireman.f14657saneness) {
                return hobby.trm.attabal(this.f14722dern.intValue());
            }
            if (this.f14721attabal.impromptu() == peridotite.wireman.f14655attabal) {
                return hobby.trm.saneness(this.f14722dern.intValue());
            }
            throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + this.f14721attabal.impromptu());
        }

        public saneness wireman(BigInteger bigInteger) {
            this.f14723saneness = bigInteger;
            return this;
        }

        public saneness() {
            this.f14721attabal = null;
            this.f14723saneness = null;
            this.f14722dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f14720wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public peridotite saneness() {
        return this.f14717attabal;
    }

    @Override // astronautic.treadless
    public ebullioscopic.attabal dern() {
        return this.f14718dern;
    }

    public BigInteger marial() {
        return this.f14719saneness;
    }

    public splinterproof(peridotite peridotiteVar, BigInteger bigInteger, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f14717attabal = peridotiteVar;
        this.f14719saneness = bigInteger;
        this.f14718dern = attabalVar;
        this.f14720wireman = num;
    }
}
