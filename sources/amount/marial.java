package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial extends sealless.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4295attabal;
    private final String value;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    public static final class saneness extends sealless.dern.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4296attabal;
        private String value;

        @Override // amount.sealless.dern.attabal
        public sealless.dern attabal() {
            String str;
            String str2 = this.f4296attabal;
            if (str2 != null && (str = this.value) != null) {
                return new marial(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4296attabal == null) {
                sb.append(" key");
            }
            if (this.value == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.dern.attabal
        public sealless.dern.attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.value = str;
            return this;
        }

        @Override // amount.sealless.dern.attabal
        public sealless.dern.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f4296attabal = str;
            return this;
        }
    }

    @Override // amount.sealless.dern
    public String dern() {
        return this.value;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.dern) {
            sealless.dern dernVar = (sealless.dern) obj;
            if (this.f4295attabal.equals(dernVar.saneness()) && this.value.equals(dernVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4295attabal.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    @Override // amount.sealless.dern
    public String saneness() {
        return this.f4295attabal;
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f4295attabal + ", value=" + this.value + "}";
    }

    public marial(String str, String str2) {
        this.f4295attabal = str;
        this.value = str2;
    }
}
