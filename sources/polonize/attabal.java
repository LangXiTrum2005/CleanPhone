package polonize;

import java.util.List;

/* JADX INFO: compiled from: AutoValue_HeartBeatResult.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f35548attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final List<String> f35549saneness;

    public attabal(String str, List<String> list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f35548attabal = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f35549saneness = list;
    }

    @Override // polonize.kowloon
    public String dern() {
        return this.f35548attabal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kowloon) {
            kowloon kowloonVar = (kowloon) obj;
            if (this.f35548attabal.equals(kowloonVar.dern()) && this.f35549saneness.equals(kowloonVar.saneness())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f35548attabal.hashCode() ^ 1000003) * 1000003) ^ this.f35549saneness.hashCode();
    }

    @Override // polonize.kowloon
    public List<String> saneness() {
        return this.f35549saneness;
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f35548attabal + ", usedDates=" + this.f35549saneness + "}";
    }
}
