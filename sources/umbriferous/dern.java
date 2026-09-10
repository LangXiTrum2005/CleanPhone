package umbriferous;

/* JADX INFO: compiled from: AutoValue_InstallIdProvider_InstallIds.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern extends supplicat.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f39090attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f39091dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f39092saneness;

    public dern(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f39090attabal = str;
        this.f39092saneness = str2;
        this.f39091dern = str3;
    }

    @Override // umbriferous.supplicat.attabal
    public String dern() {
        return this.f39090attabal;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof supplicat.attabal) {
            supplicat.attabal attabalVar = (supplicat.attabal) obj;
            if (this.f39090attabal.equals(attabalVar.dern()) && ((str = this.f39092saneness) != null ? str.equals(attabalVar.marial()) : attabalVar.marial() == null) && ((str2 = this.f39091dern) != null ? str2.equals(attabalVar.wireman()) : attabalVar.wireman() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f39090attabal.hashCode() ^ 1000003) * 1000003;
        String str = this.f39092saneness;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f39091dern;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // umbriferous.supplicat.attabal
    public String marial() {
        return this.f39092saneness;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f39090attabal + ", firebaseInstallationId=" + this.f39092saneness + ", firebaseAuthenticationToken=" + this.f39091dern + "}";
    }

    @Override // umbriferous.supplicat.attabal
    public String wireman() {
        return this.f39091dern;
    }
}
