package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rotuma extends sealless.marial.wireman.AbstractC0023marial.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4329attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4330saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    public static final class saneness extends sealless.marial.wireman.AbstractC0023marial.saneness.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4331attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4332saneness;

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.saneness.attabal
        public sealless.marial.wireman.AbstractC0023marial.saneness attabal() {
            String str;
            String str2 = this.f4331attabal;
            if (str2 != null && (str = this.f4332saneness) != null) {
                return new rotuma(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4331attabal == null) {
                sb.append(" rolloutId");
            }
            if (this.f4332saneness == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.saneness.attabal
        public sealless.marial.wireman.AbstractC0023marial.saneness.attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f4332saneness = str;
            return this;
        }

        @Override // amount.sealless.marial.wireman.AbstractC0023marial.saneness.attabal
        public sealless.marial.wireman.AbstractC0023marial.saneness.attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f4331attabal = str;
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial.saneness
    public String dern() {
        return this.f4330saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.AbstractC0023marial.saneness) {
            sealless.marial.wireman.AbstractC0023marial.saneness sanenessVar = (sealless.marial.wireman.AbstractC0023marial.saneness) obj;
            if (this.f4329attabal.equals(sanenessVar.saneness()) && this.f4330saneness.equals(sanenessVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4329attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4330saneness.hashCode();
    }

    @Override // amount.sealless.marial.wireman.AbstractC0023marial.saneness
    public String saneness() {
        return this.f4329attabal;
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f4329attabal + ", variantId=" + this.f4330saneness + "}";
    }

    public rotuma(String str, String str2) {
        this.f4329attabal = str;
        this.f4330saneness = str2;
    }
}
