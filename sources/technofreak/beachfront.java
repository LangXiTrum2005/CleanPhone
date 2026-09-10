package technofreak;

/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront<F, S> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final F f38671attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final S f38672saneness;

    public beachfront(F f, S s) {
        this.f38671attabal = f;
        this.f38672saneness = s;
    }

    public static <A, B> beachfront<A, B> attabal(A a, B b) {
        return new beachfront<>(a, b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof beachfront)) {
            return false;
        }
        beachfront beachfrontVar = (beachfront) obj;
        return marial.attabal(beachfrontVar.f38671attabal, this.f38671attabal) && marial.attabal(beachfrontVar.f38672saneness, this.f38672saneness);
    }

    public int hashCode() {
        F f = this.f38671attabal;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f38672saneness;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f38671attabal + " " + this.f38672saneness + "}";
    }
}
