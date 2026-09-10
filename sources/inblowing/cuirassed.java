package inblowing;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: Qualified.java */
/* JADX INFO: loaded from: classes3.dex */
public final class cuirassed<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Class<? extends Annotation> f28529attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Class<T> f28530saneness;

    /* JADX INFO: compiled from: Qualified.java */
    public @interface attabal {
    }

    public cuirassed(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f28529attabal = cls;
        this.f28530saneness = cls2;
    }

    public static <T> cuirassed<T> attabal(Class<? extends Annotation> cls, Class<T> cls2) {
        return new cuirassed<>(cls, cls2);
    }

    public static <T> cuirassed<T> saneness(Class<T> cls) {
        return new cuirassed<>(attabal.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cuirassed.class != obj.getClass()) {
            return false;
        }
        cuirassed cuirassedVar = (cuirassed) obj;
        if (this.f28530saneness.equals(cuirassedVar.f28530saneness)) {
            return this.f28529attabal.equals(cuirassedVar.f28529attabal);
        }
        return false;
    }

    public int hashCode() {
        return (this.f28530saneness.hashCode() * 31) + this.f28529attabal.hashCode();
    }

    public String toString() {
        if (this.f28529attabal == attabal.class) {
            return this.f28530saneness.getName();
        }
        return "@" + this.f28529attabal.getName() + " " + this.f28530saneness.getName();
    }
}
