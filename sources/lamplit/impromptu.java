package lamplit;

/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public T f32587attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public T f32588saneness;

    public static boolean attabal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof technofreak.beachfront)) {
            return false;
        }
        technofreak.beachfront beachfrontVar = (technofreak.beachfront) obj;
        return attabal(beachfrontVar.f38671attabal, this.f32587attabal) && attabal(beachfrontVar.f38672saneness, this.f32588saneness);
    }

    public int hashCode() {
        T t = this.f32587attabal;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f32588saneness;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public void saneness(T t, T t2) {
        this.f32587attabal = t;
        this.f32588saneness = t2;
    }

    public String toString() {
        return "Pair{" + this.f32587attabal + " " + this.f32588saneness + "}";
    }
}
