package escorial;

/* JADX INFO: compiled from: AutoValue_ExternalPRequestContext.java */
/* JADX INFO: loaded from: classes2.dex */
public final class marial extends formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Integer f25916attabal;

    /* JADX INFO: compiled from: AutoValue_ExternalPRequestContext.java */
    public static final class saneness extends formularize.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Integer f25917attabal;

        @Override // escorial.formularize.attabal
        public formularize attabal() {
            return new marial(this.f25917attabal);
        }

        @Override // escorial.formularize.attabal
        public formularize.attabal saneness(Integer num) {
            this.f25917attabal = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof formularize)) {
            return false;
        }
        Integer num = this.f25916attabal;
        Integer numSaneness = ((formularize) obj).saneness();
        if (num == null) {
            return numSaneness == null;
        }
        return num.equals(numSaneness);
    }

    public int hashCode() {
        Integer num = this.f25916attabal;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    @Override // escorial.formularize
    public Integer saneness() {
        return this.f25916attabal;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f25916attabal + "}";
    }

    public marial(Integer num) {
        this.f25916attabal = num;
    }
}
