package escorial;

/* JADX INFO: compiled from: AutoValue_ExternalPrivacyContext.java */
/* JADX INFO: loaded from: classes2.dex */
public final class beachfront extends impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final formularize f25881attabal;

    /* JADX INFO: compiled from: AutoValue_ExternalPrivacyContext.java */
    public static final class saneness extends impassible.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public formularize f25882attabal;

        @Override // escorial.impassible.attabal
        public impassible attabal() {
            return new beachfront(this.f25882attabal);
        }

        @Override // escorial.impassible.attabal
        public impassible.attabal saneness(formularize formularizeVar) {
            this.f25882attabal = formularizeVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof impassible)) {
            return false;
        }
        formularize formularizeVar = this.f25881attabal;
        formularize formularizeVarSaneness = ((impassible) obj).saneness();
        if (formularizeVar == null) {
            return formularizeVarSaneness == null;
        }
        return formularizeVar.equals(formularizeVarSaneness);
    }

    public int hashCode() {
        formularize formularizeVar = this.f25881attabal;
        return (formularizeVar == null ? 0 : formularizeVar.hashCode()) ^ 1000003;
    }

    @Override // escorial.impassible
    public formularize saneness() {
        return this.f25881attabal;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f25881attabal + "}";
    }

    public beachfront(formularize formularizeVar) {
        this.f25881attabal = formularizeVar;
    }
}
