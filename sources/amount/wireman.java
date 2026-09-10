package amount;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman extends sealless.attabal.AbstractC0007attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4392attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4393dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4394saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    public static final class saneness extends sealless.attabal.AbstractC0007attabal.AbstractC0008attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public String f4395attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public String f4396dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f4397saneness;

        @Override // amount.sealless.attabal.AbstractC0007attabal.AbstractC0008attabal
        public sealless.attabal.AbstractC0007attabal attabal() {
            String str;
            String str2;
            String str3 = this.f4395attabal;
            if (str3 != null && (str = this.f4397saneness) != null && (str2 = this.f4396dern) != null) {
                return new wireman(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4395attabal == null) {
                sb.append(" arch");
            }
            if (this.f4397saneness == null) {
                sb.append(" libraryName");
            }
            if (this.f4396dern == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.attabal.AbstractC0007attabal.AbstractC0008attabal
        public sealless.attabal.AbstractC0007attabal.AbstractC0008attabal dern(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f4396dern = str;
            return this;
        }

        @Override // amount.sealless.attabal.AbstractC0007attabal.AbstractC0008attabal
        public sealless.attabal.AbstractC0007attabal.AbstractC0008attabal saneness(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f4395attabal = str;
            return this;
        }

        @Override // amount.sealless.attabal.AbstractC0007attabal.AbstractC0008attabal
        public sealless.attabal.AbstractC0007attabal.AbstractC0008attabal wireman(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f4397saneness = str;
            return this;
        }
    }

    @Override // amount.sealless.attabal.AbstractC0007attabal
    public String dern() {
        return this.f4393dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.attabal.AbstractC0007attabal) {
            sealless.attabal.AbstractC0007attabal abstractC0007attabal = (sealless.attabal.AbstractC0007attabal) obj;
            if (this.f4392attabal.equals(abstractC0007attabal.saneness()) && this.f4394saneness.equals(abstractC0007attabal.wireman()) && this.f4393dern.equals(abstractC0007attabal.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4392attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4394saneness.hashCode()) * 1000003) ^ this.f4393dern.hashCode();
    }

    @Override // amount.sealless.attabal.AbstractC0007attabal
    public String saneness() {
        return this.f4392attabal;
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f4392attabal + ", libraryName=" + this.f4394saneness + ", buildId=" + this.f4393dern + "}";
    }

    @Override // amount.sealless.attabal.AbstractC0007attabal
    public String wireman() {
        return this.f4394saneness;
    }

    public wireman(String str, String str2, String str3) {
        this.f4392attabal = str;
        this.f4394saneness = str2;
        this.f4393dern = str3;
    }
}
