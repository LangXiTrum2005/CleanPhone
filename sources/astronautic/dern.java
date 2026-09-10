package astronautic;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: EcdsaPublicKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern extends treadless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final astronautic.attabal f14571attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f14572dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ECPoint f14573saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f14574wireman;

    /* JADX INFO: compiled from: EcdsaPublicKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public astronautic.attabal f14575attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f14576dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ECPoint f14577saneness;

        public dern attabal() throws GeneralSecurityException {
            astronautic.attabal attabalVar = this.f14575attabal;
            if (attabalVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            ECPoint eCPoint = this.f14577saneness;
            if (eCPoint == null) {
                throw new GeneralSecurityException("Cannot build without public point");
            }
            hobby.competently.saneness(eCPoint, attabalVar.dern().attabal().getCurve());
            if (this.f14575attabal.attabal() && this.f14576dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14575attabal.attabal() && this.f14576dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new dern(this.f14575attabal, this.f14577saneness, saneness(), this.f14576dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f14576dern = num;
            return this;
        }

        public saneness marial(ECPoint eCPoint) {
            this.f14577saneness = eCPoint;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f14575attabal.beachfront() == astronautic.attabal.beachfront.f14549wireman) {
                return hobby.trm.f27847attabal;
            }
            if (this.f14575attabal.beachfront() == astronautic.attabal.beachfront.f14547dern || this.f14575attabal.beachfront() == astronautic.attabal.beachfront.f14548saneness) {
                return hobby.trm.attabal(this.f14576dern.intValue());
            }
            if (this.f14575attabal.beachfront() == astronautic.attabal.beachfront.f14546attabal) {
                return hobby.trm.saneness(this.f14576dern.intValue());
            }
            throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + this.f14575attabal.beachfront());
        }

        public saneness wireman(astronautic.attabal attabalVar) {
            this.f14575attabal = attabalVar;
            return this;
        }

        public saneness() {
            this.f14575attabal = null;
            this.f14577saneness = null;
            this.f14576dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f14574wireman;
    }

    public ECPoint beachfront() {
        return this.f14573saneness;
    }

    @Override // astronautic.treadless
    public ebullioscopic.attabal dern() {
        return this.f14572dern;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public astronautic.attabal saneness() {
        return this.f14571attabal;
    }

    public dern(astronautic.attabal attabalVar, ECPoint eCPoint, ebullioscopic.attabal attabalVar2, @Nullable Integer num) {
        this.f14571attabal = attabalVar;
        this.f14573saneness = eCPoint;
        this.f14572dern = attabalVar2;
        this.f14574wireman = num;
    }
}
