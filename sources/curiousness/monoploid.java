package curiousness;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: AesGcmKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid extends curiousness.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final adultoid f24436attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f24437dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f24438saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f24439wireman;

    /* JADX INFO: compiled from: AesGcmKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public adultoid f24440attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f24441dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f24442saneness;

        public monoploid attabal() throws GeneralSecurityException {
            adultoid adultoidVar = this.f24440attabal;
            if (adultoidVar == null || this.f24442saneness == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (adultoidVar.wireman() != this.f24442saneness.dern()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f24440attabal.attabal() && this.f24441dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24440attabal.attabal() && this.f24441dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new monoploid(this.f24440attabal, this.f24442saneness, saneness(), this.f24441dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f24441dern = num;
            return this;
        }

        public saneness marial(adultoid adultoidVar) {
            this.f24440attabal = adultoidVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f24440attabal.beachfront() == adultoid.dern.f24292dern) {
                return hobby.trm.f27847attabal;
            }
            if (this.f24440attabal.beachfront() == adultoid.dern.f24293saneness) {
                return hobby.trm.attabal(this.f24441dern.intValue());
            }
            if (this.f24440attabal.beachfront() == adultoid.dern.f24291attabal) {
                return hobby.trm.saneness(this.f24441dern.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f24440attabal.beachfront());
        }

        public saneness wireman(ebullioscopic.dern dernVar) {
            this.f24442saneness = dernVar;
            return this;
        }

        public saneness() {
            this.f24440attabal = null;
            this.f24442saneness = null;
            this.f24441dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f24439wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public adultoid saneness() {
        return this.f24436attabal;
    }

    @Override // curiousness.saneness
    public ebullioscopic.attabal dern() {
        return this.f24437dern;
    }

    public ebullioscopic.dern marial() {
        return this.f24438saneness;
    }

    public monoploid(adultoid adultoidVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f24436attabal = adultoidVar;
        this.f24438saneness = dernVar;
        this.f24437dern = attabalVar;
        this.f24439wireman = num;
    }
}
