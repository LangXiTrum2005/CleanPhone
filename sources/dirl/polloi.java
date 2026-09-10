package dirl;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class polloi extends molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f25274attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f25275saneness;

    public polloi(int i, long j) {
        this.f25274attabal = i;
        this.f25275saneness = j;
    }

    @Override // dirl.molybdenite
    public final int attabal() {
        return this.f25274attabal;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof molybdenite) {
            molybdenite molybdeniteVar = (molybdenite) obj;
            if (this.f25274attabal == molybdeniteVar.attabal() && this.f25275saneness == molybdeniteVar.saneness()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f25275saneness;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f25274attabal ^ 1000003) * 1000003);
    }

    @Override // dirl.molybdenite
    public final long saneness() {
        return this.f25275saneness;
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f25274attabal + ", eventTimestamp=" + this.f25275saneness + "}";
    }
}
