package curiousness;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: LegacyKmsEnvelopeAeadParameters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mathsort extends curiousness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f24420attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final dern f24421dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f24422saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final curiousness.dern f24423wireman;

    /* JADX INFO: compiled from: LegacyKmsEnvelopeAeadParameters.java */
    public static final class dern {
        private final String name;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f24424attabal = new dern("ASSUME_AES_GCM");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final dern f24428saneness = new dern("ASSUME_XCHACHA20POLY1305");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final dern f24426dern = new dern("ASSUME_CHACHA20POLY1305");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final dern f24429wireman = new dern("ASSUME_AES_CTR_HMAC");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final dern f24427marial = new dern("ASSUME_AES_EAX");

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final dern f24425beachfront = new dern("ASSUME_AES_GCM_SIV");

        public dern(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: LegacyKmsEnvelopeAeadParameters.java */
    public static class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        @Nullable
        public wireman f24430attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        @Nullable
        public dern f24431dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        @Nullable
        public String f24432saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        @Nullable
        public curiousness.dern f24433wireman;

        public static boolean saneness(dern dernVar, curiousness.dern dernVar2) {
            if (dernVar.equals(dern.f24424attabal) && (dernVar2 instanceof adultoid)) {
                return true;
            }
            if (dernVar.equals(dern.f24426dern) && (dernVar2 instanceof yemenite)) {
                return true;
            }
            if (dernVar.equals(dern.f24428saneness) && (dernVar2 instanceof gusty)) {
                return true;
            }
            if (dernVar.equals(dern.f24429wireman) && (dernVar2 instanceof apical)) {
                return true;
            }
            if (dernVar.equals(dern.f24427marial) && (dernVar2 instanceof arytenoidectomy)) {
                return true;
            }
            return dernVar.equals(dern.f24425beachfront) && (dernVar2 instanceof cord);
        }

        public mathsort attabal() throws GeneralSecurityException {
            if (this.f24430attabal == null) {
                this.f24430attabal = wireman.f24435saneness;
            }
            if (this.f24432saneness == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f24431dern == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            curiousness.dern dernVar = this.f24433wireman;
            if (dernVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (dernVar.attabal()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (saneness(this.f24431dern, this.f24433wireman)) {
                return new mathsort(this.f24430attabal, this.f24432saneness, this.f24431dern, this.f24433wireman);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f24431dern.toString() + " when new keys are picked according to " + this.f24433wireman + ".");
        }

        public saneness beachfront(wireman wiremanVar) {
            this.f24430attabal = wiremanVar;
            return this;
        }

        public saneness dern(curiousness.dern dernVar) {
            this.f24433wireman = dernVar;
            return this;
        }

        public saneness marial(String str) {
            this.f24432saneness = str;
            return this;
        }

        public saneness wireman(dern dernVar) {
            this.f24431dern = dernVar;
            return this;
        }

        public saneness() {
        }
    }

    /* JADX INFO: compiled from: LegacyKmsEnvelopeAeadParameters.java */
    public static final class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f24434attabal = new wireman("TINK");

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final wireman f24435saneness = new wireman("NO_PREFIX");
        private final String name;

        public wireman(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static saneness saneness() {
        return new saneness();
    }

    @Override // discernable.molybdenite
    public boolean attabal() {
        return this.f24420attabal != wireman.f24435saneness;
    }

    public curiousness.dern dern() {
        return this.f24423wireman;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mathsort)) {
            return false;
        }
        mathsort mathsortVar = (mathsort) obj;
        return mathsortVar.f24421dern.equals(this.f24421dern) && mathsortVar.f24423wireman.equals(this.f24423wireman) && mathsortVar.f24422saneness.equals(this.f24422saneness) && mathsortVar.f24420attabal.equals(this.f24420attabal);
    }

    public int hashCode() {
        return Objects.hash(mathsort.class, this.f24422saneness, this.f24421dern, this.f24423wireman, this.f24420attabal);
    }

    public wireman marial() {
        return this.f24420attabal;
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f24422saneness + ", dekParsingStrategy: " + this.f24421dern + ", dekParametersForNewKeys: " + this.f24423wireman + ", variant: " + this.f24420attabal + ")";
    }

    public String wireman() {
        return this.f24422saneness;
    }

    public mathsort(wireman wiremanVar, String str, dern dernVar, curiousness.dern dernVar2) {
        this.f24420attabal = wiremanVar;
        this.f24422saneness = str;
        this.f24421dern = dernVar;
        this.f24423wireman = dernVar2;
    }
}
