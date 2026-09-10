package ocellation;

/* JADX INFO: compiled from: Preference.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f34076attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Long f34077saneness;

    public wireman(String str, boolean z) {
        this(str, z ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wireman)) {
            return false;
        }
        wireman wiremanVar = (wireman) obj;
        if (!this.f34076attabal.equals(wiremanVar.f34076attabal)) {
            return false;
        }
        Long l = this.f34077saneness;
        Long l2 = wiremanVar.f34077saneness;
        if (l != null) {
            return l.equals(l2);
        }
        return l2 == null;
    }

    public int hashCode() {
        int iHashCode = this.f34076attabal.hashCode() * 31;
        Long l = this.f34077saneness;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public wireman(String str, long j) {
        this.f34076attabal = str;
        this.f34077saneness = Long.valueOf(j);
    }
}
