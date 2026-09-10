package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmSivKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dovishness extends curiousness.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cord f24367attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24368dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24369saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24370wireman;

    /* JADX INFO: compiled from: AesGcmSivKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public cord f24371attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24372dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f24373saneness;

        public dovishness attabal() throws GeneralSecurityException {
            cord cordVar = this.f24371attabal;
            if (cordVar == null || this.f24373saneness == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (cordVar.dern() != this.f24373saneness.dern()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f24371attabal.attabal() && this.f24372dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24371attabal.attabal() && this.f24372dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new dovishness(this.f24371attabal, this.f24373saneness, saneness(), this.f24372dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f24372dern = num;
            return this;
        }

        public saneness marial(cord cordVar) {
            this.f24371attabal = cordVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f24371attabal.wireman() == cord.dern.f24352dern) {
                return hobby.trm.f27847attabal;
            }
            if (this.f24371attabal.wireman() == cord.dern.f24353saneness) {
                return hobby.trm.attabal(this.f24372dern.intValue());
            }
            if (this.f24371attabal.wireman() == cord.dern.f24351attabal) {
                return hobby.trm.saneness(this.f24372dern.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f24371attabal.wireman());
        }

        public saneness wireman(ebullioscopic.dern dernVar) {
            this.f24373saneness = dernVar;
            return this;
        }

        public saneness() {
            this.f24371attabal = null;
            this.f24373saneness = null;
            this.f24372dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24370wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public cord saneness() {
        return this.f24367attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24368dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24369saneness;
    }

    public dovishness(cord cordVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24367attabal = cordVar;
        this.f24369saneness = dernVar;
        this.f24368dern = attabalVar;
        this.f24370wireman = num;
    }
}
