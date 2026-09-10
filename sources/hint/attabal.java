package hint;

import javax.annotation.Nonnull;

/* JADX INFO: compiled from: AutoValue_LibraryVersion.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal extends beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f27726attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f27727saneness;

    public attabal(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f27726attabal = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f27727saneness = str2;
    }

    @Override // hint.beachfront
    @Nonnull
    public String dern() {
        return this.f27727saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beachfront) {
            beachfront beachfrontVar = (beachfront) obj;
            if (this.f27726attabal.equals(beachfrontVar.saneness()) && this.f27727saneness.equals(beachfrontVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f27726attabal.hashCode() ^ 1000003) * 1000003) ^ this.f27727saneness.hashCode();
    }

    @Override // hint.beachfront
    @Nonnull
    public String saneness() {
        return this.f27726attabal;
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f27726attabal + ", version=" + this.f27727saneness + "}";
    }
}
