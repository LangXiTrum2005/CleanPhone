package endosteum;

import java.security.MessageDigest;

/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes2.dex */
public final class attabal implements maggot.saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final maggot.saneness f25712dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final maggot.saneness f25713saneness;

    public attabal(maggot.saneness sanenessVar, maggot.saneness sanenessVar2) {
        this.f25713saneness = sanenessVar;
        this.f25712dern = sanenessVar2;
    }

    @Override // maggot.saneness
    public void attabal(MessageDigest messageDigest) {
        this.f25713saneness.attabal(messageDigest);
        this.f25712dern.attabal(messageDigest);
    }

    @Override // maggot.saneness
    public boolean equals(Object obj) {
        if (obj instanceof attabal) {
            attabal attabalVar = (attabal) obj;
            if (this.f25713saneness.equals(attabalVar.f25713saneness) && this.f25712dern.equals(attabalVar.f25712dern)) {
                return true;
            }
        }
        return false;
    }

    @Override // maggot.saneness
    public int hashCode() {
        return (this.f25713saneness.hashCode() * 31) + this.f25712dern.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f25713saneness + ", signature=" + this.f25712dern + '}';
    }
}
