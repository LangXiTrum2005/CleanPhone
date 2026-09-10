package astronautic;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: EcdsaPrivateKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends milliradian {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f14688attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.saneness f14689saneness;

    /* JADX INFO: renamed from: astronautic.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EcdsaPrivateKey.java */
    public static class C0120saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public dern f14690attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ebullioscopic.saneness f14691saneness;

        public static void wireman(BigInteger bigInteger, ECPoint eCPoint, astronautic.attabal.dern dernVar) throws GeneralSecurityException {
            BigInteger order = dernVar.attabal().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            }
            if (!hobby.competently.apical(bigInteger, dernVar.attabal()).equals(eCPoint)) {
                throw new GeneralSecurityException("Invalid private value");
            }
        }

        public saneness attabal() throws GeneralSecurityException {
            if (this.f14690attabal == null) {
                throw new GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            ebullioscopic.saneness sanenessVar = this.f14691saneness;
            if (sanenessVar == null) {
                throw new GeneralSecurityException("Cannot build without a private value");
            }
            wireman(sanenessVar.saneness(discernable.beachfront.attabal()), this.f14690attabal.beachfront(), this.f14690attabal.saneness().dern());
            return new saneness(this.f14690attabal, this.f14691saneness);
        }

        public C0120saneness dern(dern dernVar) {
            this.f14690attabal = dernVar;
            return this;
        }

        public C0120saneness saneness(ebullioscopic.saneness sanenessVar) {
            this.f14691saneness = sanenessVar;
            return this;
        }

        public C0120saneness() {
            this.f14690attabal = null;
            this.f14691saneness = null;
        }
    }

    public static C0120saneness marial() {
        return new C0120saneness();
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public astronautic.attabal saneness() {
        return this.f14688attabal.saneness();
    }

    public ebullioscopic.saneness competently() {
        return this.f14689saneness;
    }

    @Override // astronautic.milliradian
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public dern wireman() {
        return this.f14688attabal;
    }

    public saneness(dern dernVar, ebullioscopic.saneness sanenessVar) {
        this.f14688attabal = dernVar;
        this.f14689saneness = sanenessVar;
    }
}
