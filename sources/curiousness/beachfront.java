package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesCtrHmacAeadKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends curiousness.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final apical f24340attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.dern f24341dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    @Nullable
    public final Integer f24342marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24343saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final ebullioscopic.attabal f24344wireman;

    /* JADX INFO: compiled from: AesCtrHmacAeadKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public apical f24345attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f24346dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f24347saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public Integer f24348wireman;

        public beachfront attabal() throws GeneralSecurityException {
            apical apicalVar = this.f24345attabal;
            if (apicalVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f24347saneness == null || this.f24346dern == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (apicalVar.dern() != this.f24347saneness.dern()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f24345attabal.marial() != this.f24346dern.dern()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f24345attabal.attabal() && this.f24348wireman == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24345attabal.attabal() && this.f24348wireman != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new beachfront(this.f24345attabal, this.f24347saneness, this.f24346dern, saneness(), this.f24348wireman);
        }

        public saneness beachfront(apical apicalVar) {
            this.f24345attabal = apicalVar;
            return this;
        }

        public saneness dern(ebullioscopic.dern dernVar) {
            this.f24347saneness = dernVar;
            return this;
        }

        public saneness marial(@Nullable Integer num) {
            this.f24348wireman = num;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f24345attabal.impromptu() == apical.wireman.f24316dern) {
                return hobby.trm.f27847attabal;
            }
            if (this.f24345attabal.impromptu() == apical.wireman.f24317saneness) {
                return hobby.trm.attabal(this.f24348wireman.intValue());
            }
            if (this.f24345attabal.impromptu() == apical.wireman.f24315attabal) {
                return hobby.trm.saneness(this.f24348wireman.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f24345attabal.impromptu());
        }

        public saneness wireman(ebullioscopic.dern dernVar) {
            this.f24346dern = dernVar;
            return this;
        }

        public saneness() {
            this.f24345attabal = null;
            this.f24347saneness = null;
            this.f24346dern = null;
            this.f24348wireman = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24342marial;
    }

    public ebullioscopic.dern beachfront() {
        return this.f24341dern;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public apical saneness() {
        return this.f24340attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24344wireman;
    }

    public ebullioscopic.dern marial() {
        return this.f24343saneness;
    }

    public beachfront(apical apicalVar, ebullioscopic.dern dernVar, ebullioscopic.dern dernVar2, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24340attabal = apicalVar;
        this.f24343saneness = dernVar;
        this.f24341dern = dernVar2;
        this.f24344wireman = attabalVar;
        this.f24342marial = num;
    }
}
