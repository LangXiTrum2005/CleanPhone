package horsehair;

import hobby.trm;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: HmacKey.java */
/* JADX INFO: loaded from: classes3.dex */
public final class taiyuan extends arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final triweekly f27967attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final ebullioscopic.attabal f27968dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ebullioscopic.dern f27969saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final Integer f27970wireman;

    /* JADX INFO: compiled from: HmacKey.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public triweekly f27971attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public Integer f27972dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public ebullioscopic.dern f27973saneness;

        public taiyuan attabal() throws GeneralSecurityException {
            triweekly triweeklyVar = this.f27971attabal;
            if (triweeklyVar == null || this.f27973saneness == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (triweeklyVar.marial() != this.f27973saneness.dern()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f27971attabal.attabal() && this.f27972dern == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f27971attabal.attabal() && this.f27972dern != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new taiyuan(this.f27971attabal, this.f27973saneness, saneness(), this.f27972dern);
        }

        public saneness dern(@Nullable Integer num) {
            this.f27972dern = num;
            return this;
        }

        public saneness marial(triweekly triweeklyVar) {
            this.f27971attabal = triweeklyVar;
            return this;
        }

        public final ebullioscopic.attabal saneness() {
            if (this.f27971attabal.competently() == triweekly.wireman.f27990wireman) {
                return trm.f27847attabal;
            }
            if (this.f27971attabal.competently() == triweekly.wireman.f27988dern || this.f27971attabal.competently() == triweekly.wireman.f27989saneness) {
                return trm.attabal(this.f27972dern.intValue());
            }
            if (this.f27971attabal.competently() == triweekly.wireman.f27987attabal) {
                return trm.saneness(this.f27972dern.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f27971attabal.competently());
        }

        public saneness wireman(ebullioscopic.dern dernVar) {
            this.f27973saneness = dernVar;
            return this;
        }

        public saneness() {
            this.f27971attabal = null;
            this.f27973saneness = null;
            this.f27972dern = null;
        }
    }

    public static saneness wireman() {
        return new saneness();
    }

    @Override // discernable.impromptu
    @Nullable
    public Integer attabal() {
        return this.f27970wireman;
    }

    @Override // discernable.impromptu
    /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
    public triweekly saneness() {
        return this.f27967attabal;
    }

    @Override // horsehair.arytenoidectomy
    public ebullioscopic.attabal dern() {
        return this.f27968dern;
    }

    public ebullioscopic.dern marial() {
        return this.f27969saneness;
    }

    public taiyuan(triweekly triweeklyVar, ebullioscopic.dern dernVar, ebullioscopic.attabal attabalVar, @Nullable Integer num) {
        this.f27967attabal = triweeklyVar;
        this.f27969saneness = dernVar;
        this.f27968dern = attabalVar;
        this.f27970wireman = num;
    }
}
