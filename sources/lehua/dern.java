package lehua;

/* JADX INFO: compiled from: AutoValue_SendRequest.java */
/* JADX INFO: loaded from: classes2.dex */
public final class dern extends kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final arytenoidectomy f32669attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final staphylococcal.wireman<?> f32670dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final staphylococcal.dern f32671marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f32672saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final staphylococcal.competently<?, byte[]> f32673wireman;

    /* JADX INFO: compiled from: AutoValue_SendRequest.java */
    public static final class saneness extends kowloon.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public arytenoidectomy f32674attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public staphylococcal.wireman<?> f32675dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public staphylococcal.dern f32676marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f32677saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public staphylococcal.competently<?, byte[]> f32678wireman;

        @Override // lehua.kowloon.attabal
        public kowloon attabal() {
            String str = "";
            if (this.f32674attabal == null) {
                str = " transportContext";
            }
            if (this.f32677saneness == null) {
                str = str + " transportName";
            }
            if (this.f32675dern == null) {
                str = str + " event";
            }
            if (this.f32678wireman == null) {
                str = str + " transformer";
            }
            if (this.f32676marial == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new dern(this.f32674attabal, this.f32677saneness, this.f32675dern, this.f32678wireman, this.f32676marial);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // lehua.kowloon.attabal
        public kowloon.attabal beachfront(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f32677saneness = str;
            return this;
        }

        @Override // lehua.kowloon.attabal
        public kowloon.attabal dern(staphylococcal.wireman<?> wiremanVar) {
            if (wiremanVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f32675dern = wiremanVar;
            return this;
        }

        @Override // lehua.kowloon.attabal
        public kowloon.attabal marial(arytenoidectomy arytenoidectomyVar) {
            if (arytenoidectomyVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f32674attabal = arytenoidectomyVar;
            return this;
        }

        @Override // lehua.kowloon.attabal
        public kowloon.attabal saneness(staphylococcal.dern dernVar) {
            if (dernVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f32676marial = dernVar;
            return this;
        }

        @Override // lehua.kowloon.attabal
        public kowloon.attabal wireman(staphylococcal.competently<?, byte[]> competentlyVar) {
            if (competentlyVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f32678wireman = competentlyVar;
            return this;
        }
    }

    @Override // lehua.kowloon
    public arytenoidectomy beachfront() {
        return this.f32669attabal;
    }

    @Override // lehua.kowloon
    public String competently() {
        return this.f32672saneness;
    }

    @Override // lehua.kowloon
    public staphylococcal.wireman<?> dern() {
        return this.f32670dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kowloon) {
            kowloon kowloonVar = (kowloon) obj;
            if (this.f32669attabal.equals(kowloonVar.beachfront()) && this.f32672saneness.equals(kowloonVar.competently()) && this.f32670dern.equals(kowloonVar.dern()) && this.f32673wireman.equals(kowloonVar.marial()) && this.f32671marial.equals(kowloonVar.saneness())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f32669attabal.hashCode() ^ 1000003) * 1000003) ^ this.f32672saneness.hashCode()) * 1000003) ^ this.f32670dern.hashCode()) * 1000003) ^ this.f32673wireman.hashCode()) * 1000003) ^ this.f32671marial.hashCode();
    }

    @Override // lehua.kowloon
    public staphylococcal.competently<?, byte[]> marial() {
        return this.f32673wireman;
    }

    @Override // lehua.kowloon
    public staphylococcal.dern saneness() {
        return this.f32671marial;
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f32669attabal + ", transportName=" + this.f32672saneness + ", event=" + this.f32670dern + ", transformer=" + this.f32673wireman + ", encoding=" + this.f32671marial + "}";
    }

    public dern(arytenoidectomy arytenoidectomyVar, String str, staphylococcal.wireman<?> wiremanVar, staphylococcal.competently<?, byte[]> competentlyVar, staphylococcal.dern dernVar) {
        this.f32669attabal = arytenoidectomyVar;
        this.f32672saneness = str;
        this.f32670dern = wiremanVar;
        this.f32673wireman = competentlyVar;
        this.f32671marial = dernVar;
    }
}
