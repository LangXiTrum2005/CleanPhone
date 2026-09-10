package ocellation;

/* JADX INFO: compiled from: SystemIdInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f34028attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f34029saneness;

    public competently(String str, int i) {
        this.f34028attabal = str;
        this.f34029saneness = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof competently)) {
            return false;
        }
        competently competentlyVar = (competently) obj;
        if (this.f34029saneness != competentlyVar.f34029saneness) {
            return false;
        }
        return this.f34028attabal.equals(competentlyVar.f34028attabal);
    }

    public int hashCode() {
        return (this.f34028attabal.hashCode() * 31) + this.f34029saneness;
    }
}
