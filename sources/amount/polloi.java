package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi extends sealless.marial.wireman.attabal.saneness.AbstractC0016marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f4322attabal;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> f4323saneness;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f4324attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public byte f4325dern;
        private String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> f4326saneness;

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial attabal() {
            String str;
            List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list;
            if (this.f4325dern == 1 && (str = this.name) != null && (list = this.f4326saneness) != null) {
                return new polloi(str, this.f4324attabal, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.name == null) {
                sb.append(" name");
            }
            if ((1 & this.f4325dern) == 0) {
                sb.append(" importance");
            }
            if (this.f4326saneness == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal dern(int i) {
            this.f4324attabal = i;
            this.f4325dern = (byte) (this.f4325dern | 1);
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal saneness(List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f4326saneness = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal
        public sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0017attabal wireman(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial
    public int dern() {
        return this.f4322attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness.AbstractC0016marial) {
            sealless.marial.wireman.attabal.saneness.AbstractC0016marial abstractC0016marial = (sealless.marial.wireman.attabal.saneness.AbstractC0016marial) obj;
            if (this.name.equals(abstractC0016marial.wireman()) && this.f4322attabal == abstractC0016marial.dern() && this.f4323saneness.equals(abstractC0016marial.saneness())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.f4322attabal) * 1000003) ^ this.f4323saneness.hashCode();
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial
    public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> saneness() {
        return this.f4323saneness;
    }

    public String toString() {
        return "Thread{name=" + this.name + ", importance=" + this.f4322attabal + ", frames=" + this.f4323saneness + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0016marial
    public String wireman() {
        return this.name;
    }

    public polloi(String str, int i, List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial.AbstractC0018saneness> list) {
        this.name = str;
        this.f4322attabal = i;
        this.f4323saneness = list;
    }
}
