package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* JADX INFO: loaded from: classes3.dex */
public final class triweekly extends sealless.marial.wireman.attabal.saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> f4376attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sealless.attabal f4377dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> f4378marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sealless.marial.wireman.attabal.saneness.dern f4379saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final sealless.marial.wireman.attabal.saneness.AbstractC0021wireman f4380wireman;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    public static final class saneness extends sealless.marial.wireman.attabal.saneness.AbstractC0020saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> f4381attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public sealless.attabal f4382dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> f4383marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public sealless.marial.wireman.attabal.saneness.dern f4384saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman f4385wireman;

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness attabal() {
            List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> list;
            sealless.marial.wireman.attabal.saneness.AbstractC0021wireman abstractC0021wireman = this.f4385wireman;
            if (abstractC0021wireman != null && (list = this.f4383marial) != null) {
                return new triweekly(this.f4381attabal, this.f4384saneness, this.f4382dern, abstractC0021wireman, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f4385wireman == null) {
                sb.append(" signal");
            }
            if (this.f4383marial == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness.AbstractC0020saneness beachfront(List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> list) {
            this.f4381attabal = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness.AbstractC0020saneness dern(List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f4383marial = list;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness.AbstractC0020saneness marial(sealless.marial.wireman.attabal.saneness.AbstractC0021wireman abstractC0021wireman) {
            if (abstractC0021wireman == null) {
                throw new NullPointerException("Null signal");
            }
            this.f4385wireman = abstractC0021wireman;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness.AbstractC0020saneness saneness(sealless.attabal attabalVar) {
            this.f4382dern = attabalVar;
            return this;
        }

        @Override // amount.sealless.marial.wireman.attabal.saneness.AbstractC0020saneness
        public sealless.marial.wireman.attabal.saneness.AbstractC0020saneness wireman(sealless.marial.wireman.attabal.saneness.dern dernVar) {
            this.f4384saneness = dernVar;
            return this;
        }
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness
    public List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> beachfront() {
        return this.f4376attabal;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness
    public List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> dern() {
        return this.f4378marial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.attabal.saneness) {
            sealless.marial.wireman.attabal.saneness sanenessVar = (sealless.marial.wireman.attabal.saneness) obj;
            List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> list = this.f4376attabal;
            if (list != null ? list.equals(sanenessVar.beachfront()) : sanenessVar.beachfront() == null) {
                sealless.marial.wireman.attabal.saneness.dern dernVar = this.f4379saneness;
                if (dernVar != null ? dernVar.equals(sanenessVar.wireman()) : sanenessVar.wireman() == null) {
                    sealless.attabal attabalVar = this.f4377dern;
                    if (attabalVar != null ? attabalVar.equals(sanenessVar.saneness()) : sanenessVar.saneness() == null) {
                        if (this.f4380wireman.equals(sanenessVar.marial()) && this.f4378marial.equals(sanenessVar.dern())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> list = this.f4376attabal;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        sealless.marial.wireman.attabal.saneness.dern dernVar = this.f4379saneness;
        int iHashCode2 = (iHashCode ^ (dernVar == null ? 0 : dernVar.hashCode())) * 1000003;
        sealless.attabal attabalVar = this.f4377dern;
        return ((((iHashCode2 ^ (attabalVar != null ? attabalVar.hashCode() : 0)) * 1000003) ^ this.f4380wireman.hashCode()) * 1000003) ^ this.f4378marial.hashCode();
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness
    public sealless.marial.wireman.attabal.saneness.AbstractC0021wireman marial() {
        return this.f4380wireman;
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness
    public sealless.attabal saneness() {
        return this.f4377dern;
    }

    public String toString() {
        return "Execution{threads=" + this.f4376attabal + ", exception=" + this.f4379saneness + ", appExitInfo=" + this.f4377dern + ", signal=" + this.f4380wireman + ", binaries=" + this.f4378marial + "}";
    }

    @Override // amount.sealless.marial.wireman.attabal.saneness
    public sealless.marial.wireman.attabal.saneness.dern wireman() {
        return this.f4379saneness;
    }

    public triweekly(List<sealless.marial.wireman.attabal.saneness.AbstractC0016marial> list, sealless.marial.wireman.attabal.saneness.dern dernVar, sealless.attabal attabalVar, sealless.marial.wireman.attabal.saneness.AbstractC0021wireman abstractC0021wireman, List<sealless.marial.wireman.attabal.saneness.AbstractC0013attabal> list2) {
        this.f4376attabal = list;
        this.f4379saneness = dernVar;
        this.f4377dern = attabalVar;
        this.f4380wireman = abstractC0021wireman;
        this.f4378marial = list2;
    }
}
