package inblowing;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: RestrictedComponentContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class stratoscope implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<cuirassed<?>> f28567attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Set<Class<?>> f28568beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final wireman f28569competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<cuirassed<?>> f28570dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Set<cuirassed<?>> f28571marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<cuirassed<?>> f28572saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Set<cuirassed<?>> f28573wireman;

    /* JADX INFO: compiled from: RestrictedComponentContainer.java */
    public static class attabal implements silty.dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Set<Class<?>> f28574attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final silty.dern f28575saneness;

        public attabal(Set<Class<?>> set, silty.dern dernVar) {
            this.f28574attabal = set;
            this.f28575saneness = dernVar;
        }
    }

    public stratoscope(dern<?> dernVar, wireman wiremanVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (monoploid monoploidVar : dernVar.competently()) {
            if (monoploidVar.marial()) {
                if (monoploidVar.competently()) {
                    hashSet4.add(monoploidVar.dern());
                } else {
                    hashSet.add(monoploidVar.dern());
                }
            } else if (monoploidVar.wireman()) {
                hashSet3.add(monoploidVar.dern());
            } else if (monoploidVar.competently()) {
                hashSet5.add(monoploidVar.dern());
            } else {
                hashSet2.add(monoploidVar.dern());
            }
        }
        if (!dernVar.apical().isEmpty()) {
            hashSet.add(cuirassed.saneness(silty.dern.class));
        }
        this.f28567attabal = Collections.unmodifiableSet(hashSet);
        this.f28572saneness = Collections.unmodifiableSet(hashSet2);
        this.f28570dern = Collections.unmodifiableSet(hashSet3);
        this.f28573wireman = Collections.unmodifiableSet(hashSet4);
        this.f28571marial = Collections.unmodifiableSet(hashSet5);
        this.f28568beachfront = dernVar.apical();
        this.f28569competently = wiremanVar;
    }

    @Override // inblowing.wireman
    public <T> T attabal(Class<T> cls) {
        if (!this.f28567attabal.contains(cuirassed.saneness(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f28569competently.attabal(cls);
        return !cls.equals(silty.dern.class) ? t : (T) new attabal(this.f28568beachfront, (silty.dern) t);
    }

    @Override // inblowing.wireman
    public <T> friedmanite.saneness<T> beachfront(Class<T> cls) {
        return dern(cuirassed.saneness(cls));
    }

    @Override // inblowing.wireman
    public <T> friedmanite.saneness<Set<T>> competently(cuirassed<T> cuirassedVar) {
        if (this.f28571marial.contains(cuirassedVar)) {
            return this.f28569competently.competently(cuirassedVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cuirassedVar));
    }

    @Override // inblowing.wireman
    public <T> friedmanite.saneness<T> dern(cuirassed<T> cuirassedVar) {
        if (this.f28572saneness.contains(cuirassedVar)) {
            return this.f28569competently.dern(cuirassedVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cuirassedVar));
    }

    @Override // inblowing.wireman
    public <T> T impromptu(cuirassed<T> cuirassedVar) {
        if (this.f28567attabal.contains(cuirassedVar)) {
            return (T) this.f28569competently.impromptu(cuirassedVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cuirassedVar));
    }

    @Override // inblowing.wireman
    public <T> friedmanite.attabal<T> marial(cuirassed<T> cuirassedVar) {
        if (this.f28570dern.contains(cuirassedVar)) {
            return this.f28569competently.marial(cuirassedVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cuirassedVar));
    }

    @Override // inblowing.wireman
    public <T> Set<T> saneness(cuirassed<T> cuirassedVar) {
        if (this.f28573wireman.contains(cuirassedVar)) {
            return this.f28569competently.saneness(cuirassedVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cuirassedVar));
    }

    @Override // inblowing.wireman
    public <T> friedmanite.attabal<T> taiyuan(Class<T> cls) {
        return marial(cuirassed.saneness(cls));
    }
}
