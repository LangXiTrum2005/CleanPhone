package amount;

/* JADX INFO: compiled from: AutoValue_StaticSessionData_OsData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yemenite extends kattegat.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f4398attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f4399dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f4400saneness;

    public yemenite(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f4398attabal = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f4400saneness = str2;
        this.f4399dern = z;
    }

    @Override // amount.kattegat.dern
    public String dern() {
        return this.f4400saneness;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kattegat.dern) {
            kattegat.dern dernVar = (kattegat.dern) obj;
            if (this.f4398attabal.equals(dernVar.wireman()) && this.f4400saneness.equals(dernVar.dern()) && this.f4399dern == dernVar.saneness()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4398attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4400saneness.hashCode()) * 1000003) ^ (this.f4399dern ? 1231 : 1237);
    }

    @Override // amount.kattegat.dern
    public boolean saneness() {
        return this.f4399dern;
    }

    public String toString() {
        return "OsData{osRelease=" + this.f4398attabal + ", osCodeName=" + this.f4400saneness + ", isRooted=" + this.f4399dern + "}";
    }

    @Override // amount.kattegat.dern
    public String wireman() {
        return this.f4398attabal;
    }
}
