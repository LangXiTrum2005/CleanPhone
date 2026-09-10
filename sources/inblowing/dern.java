package inblowing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Component.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<cuirassed<? super T>> f28531attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Set<Class<?>> f28532beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f28533dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final competently<T> f28534marial;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<monoploid> f28535saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f28536wireman;

    @SafeVarargs
    public static <T> saneness<T> beachfront(Class<T> cls, Class<? super T>... clsArr) {
        return new saneness<>(cls, clsArr);
    }

    public static <T> saneness<T> dern(cuirassed<T> cuirassedVar) {
        return new saneness<>(cuirassedVar, new cuirassed[0]);
    }

    public static <T> dern<T> formularize(final T t, Class<T> cls) {
        return impassible(cls).beachfront(new competently() { // from class: inblowing.attabal
            @Override // inblowing.competently
            public final Object attabal(wireman wiremanVar) {
                return dern.saneness(t, wiremanVar);
            }
        }).wireman();
    }

    public static <T> saneness<T> impassible(Class<T> cls) {
        return marial(cls).competently();
    }

    public static <T> saneness<T> marial(Class<T> cls) {
        return new saneness<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> dern<T> monoploid(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return beachfront(cls, clsArr).beachfront(new competently() { // from class: inblowing.saneness
            @Override // inblowing.competently
            public final Object attabal(wireman wiremanVar) {
                return dern.attabal(t, wiremanVar);
            }
        }).wireman();
    }

    @SafeVarargs
    public static <T> saneness<T> wireman(cuirassed<T> cuirassedVar, cuirassed<? super T>... cuirassedVarArr) {
        return new saneness<>(cuirassedVar, cuirassedVarArr);
    }

    public Set<Class<?>> apical() {
        return this.f28532beachfront;
    }

    public boolean arytenoidectomy() {
        return this.f28536wireman == 0;
    }

    public Set<monoploid> competently() {
        return this.f28535saneness;
    }

    public Set<cuirassed<? super T>> cutely() {
        return this.f28531attabal;
    }

    public competently<T> impromptu() {
        return this.f28534marial;
    }

    public boolean kowloon() {
        return this.f28533dern == 2;
    }

    public dern<T> polloi(competently<T> competentlyVar) {
        return new dern<>(this.name, this.f28531attabal, this.f28535saneness, this.f28533dern, this.f28536wireman, competentlyVar, this.f28532beachfront);
    }

    public String taiyuan() {
        return this.name;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f28531attabal.toArray()) + ">{" + this.f28533dern + ", type=" + this.f28536wireman + ", deps=" + Arrays.toString(this.f28535saneness.toArray()) + "}";
    }

    public boolean triweekly() {
        return this.f28533dern == 1;
    }

    /* JADX INFO: compiled from: Component.java */
    public static class saneness<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Set<cuirassed<? super T>> f28537attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final Set<Class<?>> f28538beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f28539dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public competently<T> f28540marial;
        private String name;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Set<monoploid> f28541saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f28542wireman;

        public saneness<T> beachfront(competently<T> competentlyVar) {
            this.f28540marial = (competently) cord.dern(competentlyVar, "Null factory");
            return this;
        }

        public final saneness<T> competently() {
            this.f28542wireman = 1;
            return this;
        }

        public final void cutely(cuirassed<?> cuirassedVar) {
            cord.attabal(!this.f28537attabal.contains(cuirassedVar), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public saneness<T> dern() {
            return taiyuan(1);
        }

        public saneness<T> impromptu(String str) {
            this.name = str;
            return this;
        }

        public saneness<T> marial() {
            return taiyuan(2);
        }

        public saneness<T> saneness(monoploid monoploidVar) {
            cord.dern(monoploidVar, "Null dependency");
            cutely(monoploidVar.dern());
            this.f28541saneness.add(monoploidVar);
            return this;
        }

        public final saneness<T> taiyuan(int i) {
            cord.wireman(this.f28539dern == 0, "Instantiation type has already been set.");
            this.f28539dern = i;
            return this;
        }

        public dern<T> wireman() {
            cord.wireman(this.f28540marial != null, "Missing required property: factory.");
            return new dern<>(this.name, new HashSet(this.f28537attabal), new HashSet(this.f28541saneness), this.f28539dern, this.f28542wireman, this.f28540marial, this.f28538beachfront);
        }

        @SafeVarargs
        public saneness(Class<T> cls, Class<? super T>... clsArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.f28537attabal = hashSet;
            this.f28541saneness = new HashSet();
            this.f28539dern = 0;
            this.f28542wireman = 0;
            this.f28538beachfront = new HashSet();
            cord.dern(cls, "Null interface");
            hashSet.add(cuirassed.saneness(cls));
            for (Class<? super T> cls2 : clsArr) {
                cord.dern(cls2, "Null interface");
                this.f28537attabal.add(cuirassed.saneness(cls2));
            }
        }

        @SafeVarargs
        public saneness(cuirassed<T> cuirassedVar, cuirassed<? super T>... cuirassedVarArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.f28537attabal = hashSet;
            this.f28541saneness = new HashSet();
            this.f28539dern = 0;
            this.f28542wireman = 0;
            this.f28538beachfront = new HashSet();
            cord.dern(cuirassedVar, "Null interface");
            hashSet.add(cuirassedVar);
            for (cuirassed<? super T> cuirassedVar2 : cuirassedVarArr) {
                cord.dern(cuirassedVar2, "Null interface");
            }
            Collections.addAll(this.f28537attabal, cuirassedVarArr);
        }
    }

    public dern(String str, Set<cuirassed<? super T>> set, Set<monoploid> set2, int i, int i2, competently<T> competentlyVar, Set<Class<?>> set3) {
        this.name = str;
        this.f28531attabal = Collections.unmodifiableSet(set);
        this.f28535saneness = Collections.unmodifiableSet(set2);
        this.f28533dern = i;
        this.f28536wireman = i2;
        this.f28534marial = competentlyVar;
        this.f28532beachfront = Collections.unmodifiableSet(set3);
    }

    public static /* synthetic */ Object attabal(Object obj, wireman wiremanVar) {
        return obj;
    }

    public static /* synthetic */ Object saneness(Object obj, wireman wiremanVar) {
        return obj;
    }
}
