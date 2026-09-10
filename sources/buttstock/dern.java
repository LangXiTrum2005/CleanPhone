package buttstock;

import java.util.Set;

/* JADX INFO: compiled from: AutoValue_RolloutsState.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern extends marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<wireman> f15208attabal;

    public dern(Set<wireman> set) {
        if (set == null) {
            throw new NullPointerException("Null rolloutAssignments");
        }
        this.f15208attabal = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof marial) {
            return this.f15208attabal.equals(((marial) obj).saneness());
        }
        return false;
    }

    public int hashCode() {
        return this.f15208attabal.hashCode() ^ 1000003;
    }

    @Override // buttstock.marial
    public Set<wireman> saneness() {
        return this.f15208attabal;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f15208attabal + "}";
    }
}
