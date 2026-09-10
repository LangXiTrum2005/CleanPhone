package amount;

/* JADX INFO: compiled from: AutoValue_StaticSessionData.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope extends kattegat {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kattegat.attabal f4359attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final kattegat.saneness f4360dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final kattegat.dern f4361saneness;

    public stratoscope(kattegat.attabal attabalVar, kattegat.dern dernVar, kattegat.saneness sanenessVar) {
        if (attabalVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f4359attabal = attabalVar;
        if (dernVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f4361saneness = dernVar;
        if (sanenessVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f4360dern = sanenessVar;
    }

    @Override // amount.kattegat
    public kattegat.attabal attabal() {
        return this.f4359attabal;
    }

    @Override // amount.kattegat
    public kattegat.saneness dern() {
        return this.f4360dern;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kattegat) {
            kattegat kattegatVar = (kattegat) obj;
            if (this.f4359attabal.equals(kattegatVar.attabal()) && this.f4361saneness.equals(kattegatVar.wireman()) && this.f4360dern.equals(kattegatVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f4359attabal.hashCode() ^ 1000003) * 1000003) ^ this.f4361saneness.hashCode()) * 1000003) ^ this.f4360dern.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f4359attabal + ", osData=" + this.f4361saneness + ", deviceData=" + this.f4360dern + "}";
    }

    @Override // amount.kattegat
    public kattegat.dern wireman() {
        return this.f4361saneness;
    }
}
