package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesEaxKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class formularize extends curiousness.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final arytenoidectomy f24374attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24375dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24376saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24377wireman;

    /* JADX INFO: compiled from: AesEaxKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public arytenoidectomy f24378attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24379dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f24380saneness;

        public formularize attabal() throws GeneralSecurityException {
            arytenoidectomy arytenoidectomyVar = this.f24378attabal;
            if (arytenoidectomyVar == null || this.f24380saneness == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (arytenoidectomyVar.wireman() != this.f24380saneness.dern()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f24378attabal.attabal() && this.f24379dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24378attabal.attabal() && this.f24379dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new formularize(this.f24378attabal, this.f24380saneness, saneness(), this.f24379dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f24379dern = num;
            return this;
        }

        public saneness marial(arytenoidectomy arytenoidectomyVar) {
            this.f24378attabal = arytenoidectomyVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f24378attabal.beachfront() == arytenoidectomy.dern.f24323dern) {
                return hobby.trm.f27847attabal;
            }
            if (this.f24378attabal.beachfront() == arytenoidectomy.dern.f24324saneness) {
                return hobby.trm.attabal(this.f24379dern.intValue());
            }
            if (this.f24378attabal.beachfront() == arytenoidectomy.dern.f24322attabal) {
                return hobby.trm.saneness(this.f24379dern.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f24378attabal.beachfront());
        }

        public saneness wireman(ebullioscopic.dern dernVar) {
            this.f24380saneness = dernVar;
            return this;
        }

        public saneness() {
            this.f24378attabal = null;
            this.f24380saneness = null;
            this.f24379dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24377wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public arytenoidectomy saneness() {
        return this.f24374attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24375dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24376saneness;
    }

    public formularize(arytenoidectomy arytenoidectomyVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24374attabal = arytenoidectomyVar;
        this.f24376saneness = dernVar;
        this.f24375dern = attabalVar;
        this.f24377wireman = num;
    }
}
