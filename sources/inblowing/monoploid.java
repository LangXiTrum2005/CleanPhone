package inblowing;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: Dependency.java */
/* JADX INFO: loaded from: classes3.dex */
public final class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final cuirassed<?> f28555attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f28556dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f28557saneness;

    public monoploid(Class<?> cls, int i, int i2) {
        this((cuirassed<?>) cuirassed.saneness(cls), i, i2);
    }

    public static monoploid apical(cuirassed<?> cuirassedVar) {
        return new monoploid(cuirassedVar, 1, 0);
    }

    public static monoploid attabal(Class<?> cls) {
        return new monoploid(cls, 0, 2);
    }

    public static monoploid cutely(Class<?> cls) {
        return new monoploid(cls, 0, 1);
    }

    public static monoploid formularize(Class<?> cls) {
        return new monoploid(cls, 1, 0);
    }

    public static monoploid impassible(cuirassed<?> cuirassedVar) {
        return new monoploid(cuirassedVar, 1, 1);
    }

    @Deprecated
    public static monoploid impromptu(Class<?> cls) {
        return new monoploid(cls, 0, 0);
    }

    public static monoploid kowloon(Class<?> cls) {
        return new monoploid(cls, 2, 0);
    }

    public static String saneness(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static monoploid taiyuan(cuirassed<?> cuirassedVar) {
        return new monoploid(cuirassedVar, 0, 1);
    }

    public static monoploid triweekly(Class<?> cls) {
        return new monoploid(cls, 1, 1);
    }

    public boolean beachfront() {
        return this.f28557saneness == 1;
    }

    public boolean competently() {
        return this.f28557saneness == 2;
    }

    public cuirassed<?> dern() {
        return this.f28555attabal;
    }

    public boolean equals(Object obj) {
        if (obj instanceof monoploid) {
            monoploid monoploidVar = (monoploid) obj;
            if (this.f28555attabal.equals(monoploidVar.f28555attabal) && this.f28557saneness == monoploidVar.f28557saneness && this.f28556dern == monoploidVar.f28556dern) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28555attabal.hashCode() ^ 1000003) * 1000003) ^ this.f28557saneness) * 1000003) ^ this.f28556dern;
    }

    public boolean marial() {
        return this.f28556dern == 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f28555attabal);
        sb.append(", type=");
        int i = this.f28557saneness;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(saneness(this.f28556dern));
        sb.append("}");
        return sb.toString();
    }

    public boolean wireman() {
        return this.f28556dern == 2;
    }

    public monoploid(cuirassed<?> cuirassedVar, int i, int i2) {
        this.f28555attabal = (cuirassed) cord.dern(cuirassedVar, "Null dependency anInterface.");
        this.f28557saneness = i;
        this.f28556dern = i2;
    }
}
