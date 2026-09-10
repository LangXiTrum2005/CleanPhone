package amount;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_AppData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class trm extends kattegat.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4386attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final gelandelaufer.beachfront f4387beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f4388dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f4389marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4390saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f4391wireman;

    public trm(String str, String str2, String str3, String str4, int i, gelandelaufer.beachfront beachfrontVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f4386attabal = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f4390saneness = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f4388dern = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f4391wireman = str4;
        this.f4389marial = i;
        if (beachfrontVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f4387beachfront = beachfrontVar;
    }

    @Override // amount.kattegat.attabal
    public String attabal() {
        return this.f4386attabal;
    }

    @Override // amount.kattegat.attabal
    public String beachfront() {
        return this.f4390saneness;
    }

    @Override // amount.kattegat.attabal
    public String competently() {
        return this.f4388dern;
    }

    @Override // amount.kattegat.attabal
    public int dern() {
        return this.f4389marial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kattegat.attabal) {
            kattegat.attabal attabalVar = (kattegat.attabal) obj;
            if (this.f4386attabal.equals(attabalVar.attabal()) && this.f4390saneness.equals(attabalVar.beachfront()) && this.f4388dern.equals(attabalVar.competently()) && this.f4391wireman.equals(attabalVar.marial()) && this.f4389marial == attabalVar.dern() && this.f4387beachfront.equals(attabalVar.wireman())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((this.f4386attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4390saneness.hashCode()) * 1000003) ^ this.f4388dern.hashCode()) * 1000003) ^ this.f4391wireman.hashCode()) * 1000003) ^ this.f4389marial) * 1000003) ^ this.f4387beachfront.hashCode();
    }

    @Override // amount.kattegat.attabal
    public String marial() {
        return this.f4391wireman;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f4386attabal + ", versionCode=" + this.f4390saneness + ", versionName=" + this.f4388dern + ", installUuid=" + this.f4391wireman + ", deliveryMechanism=" + this.f4389marial + ", developmentPlatformProvider=" + this.f4387beachfront + "}";
    }

    @Override // amount.kattegat.attabal
    public gelandelaufer.beachfront wireman() {
        return this.f4387beachfront;
    }
}
