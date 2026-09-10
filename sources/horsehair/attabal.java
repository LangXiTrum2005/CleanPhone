package horsehair;

import hobby.trm;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCmacKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final beachfront f27920attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f27921dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f27922saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f27923wireman;

    /* JADX INFO: compiled from: AesCmacKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public beachfront f27924attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f27925dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f27926saneness;

        public attabal attabal() throws GeneralSecurityException {
            beachfront beachfrontVar = this.f27924attabal;
            if (beachfrontVar == null || this.f27926saneness == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (beachfrontVar.wireman() != this.f27926saneness.dern()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f27924attabal.attabal() && this.f27925dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f27924attabal.attabal() && this.f27925dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new attabal(this.f27924attabal, this.f27926saneness, saneness(), this.f27925dern);
        }

        public saneness dern(ebullioscopic.dern dernVar) throws GeneralSecurityException {
            this.f27926saneness = dernVar;
            return this;
        }

        public saneness marial(beachfront beachfrontVar) {
            this.f27924attabal = beachfrontVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f27924attabal.beachfront() == beachfront.dern.f27933wireman) {
                return trm.f27847attabal;
            }
            if (this.f27924attabal.beachfront() == beachfront.dern.f27931dern || this.f27924attabal.beachfront() == beachfront.dern.f27932saneness) {
                return trm.attabal(this.f27925dern.intValue());
            }
            if (this.f27924attabal.beachfront() == beachfront.dern.f27930attabal) {
                return trm.saneness(this.f27925dern.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f27924attabal.beachfront());
        }

        public saneness wireman(@Nullable Integer num) {
            this.f27925dern = num;
            return this;
        }

        public saneness() {
            this.f27924attabal = null;
            this.f27926saneness = null;
            this.f27925dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f27923wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public beachfront saneness() {
        return this.f27920attabal;
    }

    @Override // horsehair.arytenoidectomy
    public ebullioscopic.attabal dern() {
        return this.f27921dern;
    }

    public ebullioscopic.dern marial() {
        return this.f27922saneness;
    }

    public attabal(beachfront beachfrontVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f27920attabal = beachfrontVar;
        this.f27922saneness = dernVar;
        this.f27921dern = attabalVar;
        this.f27923wireman = num;
    }
}
