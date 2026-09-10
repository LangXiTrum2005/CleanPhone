package neuropteran;

import java.util.Set;

/* JADX INFO: compiled from: AutoValue_ConfigUpdate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<String> f33882attabal;

    public attabal(Set<String> set) {
        if (set == null) {
            throw new NullPointerException("Null updatedKeys");
        }
        this.f33882attabal = set;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saneness) {
            return this.f33882attabal.equals(((saneness) obj).saneness());
        }
        return false;
    }

    public int hashCode() {
        return this.f33882attabal.hashCode() ^ 1000003;
    }

    @Override // neuropteran.saneness
    public Set<String> saneness() {
        return this.f33882attabal;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f33882attabal + "}";
    }
}
