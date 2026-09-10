package amount;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class preprohormone extends sealless.marial.wireman.beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<sealless.marial.wireman.AbstractC0023marial> f4327attabal;

    /* JADX INFO: compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    public static final class saneness extends sealless.marial.wireman.beachfront.attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public List<sealless.marial.wireman.AbstractC0023marial> f4328attabal;

        @Override // amount.sealless.marial.wireman.beachfront.attabal
        public sealless.marial.wireman.beachfront attabal() {
            List<sealless.marial.wireman.AbstractC0023marial> list = this.f4328attabal;
            if (list != null) {
                return new preprohormone(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        @Override // amount.sealless.marial.wireman.beachfront.attabal
        public sealless.marial.wireman.beachfront.attabal saneness(List<sealless.marial.wireman.AbstractC0023marial> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f4328attabal = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sealless.marial.wireman.beachfront) {
            return this.f4327attabal.equals(((sealless.marial.wireman.beachfront) obj).saneness());
        }
        return false;
    }

    public int hashCode() {
        return this.f4327attabal.hashCode() ^ 1000003;
    }

    @Override // amount.sealless.marial.wireman.beachfront
    public List<sealless.marial.wireman.AbstractC0023marial> saneness() {
        return this.f4327attabal;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f4327attabal + "}";
    }

    public preprohormone(List<sealless.marial.wireman.AbstractC0023marial> list) {
        this.f4327attabal = list;
    }
}
