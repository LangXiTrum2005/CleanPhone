package inblowing;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import saneness.retroflection;

/* JADX INFO: compiled from: ComponentRuntime.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly implements wireman, raise.attabal {

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final friedmanite.saneness<Set<Object>> f28577taiyuan = new friedmanite.saneness() { // from class: inblowing.cutely
        @Override // friedmanite.saneness
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<dern<?>, friedmanite.saneness<?>> f28578attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final molybdenite f28579beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final AtomicReference<Boolean> f28580competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<cuirassed<?>, adultoid<?>> f28581dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final taiyuan f28582impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Set<String> f28583marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<cuirassed<?>, friedmanite.saneness<?>> f28584saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final List<friedmanite.saneness<ComponentRegistrar>> f28585wireman;

    public static /* synthetic */ Object cutely(triweekly triweeklyVar, dern dernVar) {
        triweeklyVar.getClass();
        return dernVar.impromptu().attabal(new stratoscope(dernVar, triweeklyVar));
    }

    public static saneness impassible(Executor executor) {
        return new saneness(executor);
    }

    public static <T> List<T> monoploid(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final List<Runnable> adultoid() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<dern<?>, friedmanite.saneness<?>> entry : this.f28578attabal.entrySet()) {
            dern<?> key = entry.getKey();
            if (!key.arytenoidectomy()) {
                friedmanite.saneness<?> value = entry.getValue();
                for (cuirassed<? super Object> cuirassedVar : key.cutely()) {
                    if (!map.containsKey(cuirassedVar)) {
                        map.put(cuirassedVar, new HashSet());
                    }
                    ((Set) map.get(cuirassedVar)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f28581dern.containsKey(entry2.getKey())) {
                final adultoid<?> adultoidVar = this.f28581dern.get(entry2.getKey());
                for (final friedmanite.saneness sanenessVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: inblowing.impassible
                        @Override // java.lang.Runnable
                        public final void run() {
                            adultoidVar.attabal(sanenessVar);
                        }
                    });
                }
            } else {
                this.f28581dern.put((cuirassed) entry2.getKey(), adultoid.saneness((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public void arytenoidectomy(boolean z) {
        HashMap map;
        if (retroflection.attabal(this.f28580competently, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f28578attabal);
            }
            kowloon(map, z);
        }
    }

    @Override // inblowing.wireman
    public synchronized <T> friedmanite.saneness<Set<T>> competently(cuirassed<T> cuirassedVar) {
        adultoid<?> adultoidVar = this.f28581dern.get(cuirassedVar);
        if (adultoidVar != null) {
            return adultoidVar;
        }
        return (friedmanite.saneness<Set<T>>) f28577taiyuan;
    }

    @Override // inblowing.wireman
    public synchronized <T> friedmanite.saneness<T> dern(cuirassed<T> cuirassedVar) {
        cord.dern(cuirassedVar, "Null interface requested.");
        return (friedmanite.saneness) this.f28584saneness.get(cuirassedVar);
    }

    public final List<Runnable> graveside(List<dern<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (dern<?> dernVar : list) {
            if (dernVar.arytenoidectomy()) {
                final friedmanite.saneness<?> sanenessVar = this.f28578attabal.get(dernVar);
                for (cuirassed<? super Object> cuirassedVar : dernVar.cutely()) {
                    if (this.f28584saneness.containsKey(cuirassedVar)) {
                        final preprohormone preprohormoneVar = (preprohormone) this.f28584saneness.get(cuirassedVar);
                        arrayList.add(new Runnable() { // from class: inblowing.formularize
                            @Override // java.lang.Runnable
                            public final void run() {
                                preprohormoneVar.competently(sanenessVar);
                            }
                        });
                    } else {
                        this.f28584saneness.put(cuirassedVar, sanenessVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void kowloon(Map<dern<?>, friedmanite.saneness<?>> map, boolean z) {
        for (Map.Entry<dern<?>, friedmanite.saneness<?>> entry : map.entrySet()) {
            dern<?> key = entry.getKey();
            friedmanite.saneness<?> value = entry.getValue();
            if (key.triweekly() || (key.kowloon() && z)) {
                value.get();
            }
        }
        this.f28579beachfront.wireman();
    }

    @Override // inblowing.wireman
    public <T> friedmanite.attabal<T> marial(cuirassed<T> cuirassedVar) {
        friedmanite.saneness<T> sanenessVarDern = dern(cuirassedVar);
        if (sanenessVarDern == null) {
            return preprohormone.marial();
        }
        return sanenessVarDern instanceof preprohormone ? (preprohormone) sanenessVarDern : preprohormone.beachfront(sanenessVarDern);
    }

    public final void molybdenite() {
        for (dern<?> dernVar : this.f28578attabal.keySet()) {
            for (monoploid monoploidVar : dernVar.competently()) {
                if (monoploidVar.competently() && !this.f28581dern.containsKey(monoploidVar.dern())) {
                    this.f28581dern.put(monoploidVar.dern(), adultoid.saneness(Collections.EMPTY_SET));
                } else if (this.f28584saneness.containsKey(monoploidVar.dern())) {
                    continue;
                } else {
                    if (monoploidVar.beachfront()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", dernVar, monoploidVar.dern()));
                    }
                    if (!monoploidVar.competently()) {
                        this.f28584saneness.put(monoploidVar.dern(), preprohormone.marial());
                    }
                }
            }
        }
    }

    public final void polloi() {
        Boolean bool = this.f28580competently.get();
        if (bool != null) {
            kowloon(this.f28578attabal, bool.booleanValue());
        }
    }

    public final void triweekly(List<dern<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<friedmanite.saneness<ComponentRegistrar>> it = this.f28585wireman.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f28582impromptu.attabal(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator<dern<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : it2.next().cutely().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f28583marial.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f28583marial.add(obj.toString());
                    }
                }
            }
            if (this.f28578attabal.isEmpty()) {
                arytenoidectomy.attabal(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f28578attabal.keySet());
                arrayList2.addAll(list);
                arytenoidectomy.attabal(arrayList2);
            }
            for (final dern<?> dernVar : list) {
                this.f28578attabal.put(dernVar, new graveside(new friedmanite.saneness() { // from class: inblowing.apical
                    @Override // friedmanite.saneness
                    public final Object get() {
                        return triweekly.cutely(this.f28518attabal, dernVar);
                    }
                }));
            }
            arrayList.addAll(graveside(list));
            arrayList.addAll(adultoid());
            molybdenite();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        polloi();
    }

    public triweekly(Executor executor, Iterable<friedmanite.saneness<ComponentRegistrar>> iterable, Collection<dern<?>> collection2, taiyuan taiyuanVar) {
        this.f28578attabal = new HashMap();
        this.f28584saneness = new HashMap();
        this.f28581dern = new HashMap();
        this.f28583marial = new HashSet();
        this.f28580competently = new AtomicReference<>();
        molybdenite molybdeniteVar = new molybdenite(executor);
        this.f28579beachfront = molybdeniteVar;
        this.f28582impromptu = taiyuanVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dern.monoploid(molybdeniteVar, molybdenite.class, silty.wireman.class, silty.dern.class));
        arrayList.add(dern.monoploid(this, raise.attabal.class, new Class[0]));
        for (dern<?> dernVar : collection2) {
            if (dernVar != null) {
                arrayList.add(dernVar);
            }
        }
        this.f28585wireman = monoploid(iterable);
        triweekly(arrayList);
    }

    /* JADX INFO: compiled from: ComponentRuntime.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Executor f28586attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final List<friedmanite.saneness<ComponentRegistrar>> f28588saneness = new ArrayList();

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final List<dern<?>> f28587dern = new ArrayList();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public taiyuan f28589wireman = taiyuan.f28576attabal;

        public saneness(Executor executor) {
            this.f28586attabal = executor;
        }

        public saneness beachfront(taiyuan taiyuanVar) {
            this.f28589wireman = taiyuanVar;
            return this;
        }

        public saneness dern(final ComponentRegistrar componentRegistrar) {
            this.f28588saneness.add(new friedmanite.saneness() { // from class: inblowing.kowloon
                @Override // friedmanite.saneness
                public final Object get() {
                    return triweekly.saneness.attabal(componentRegistrar);
                }
            });
            return this;
        }

        public triweekly marial() {
            return new triweekly(this.f28586attabal, this.f28588saneness, this.f28587dern, this.f28589wireman);
        }

        public saneness saneness(dern<?> dernVar) {
            this.f28587dern.add(dernVar);
            return this;
        }

        public saneness wireman(Collection<friedmanite.saneness<ComponentRegistrar>> collection2) {
            this.f28588saneness.addAll(collection2);
            return this;
        }

        public static /* synthetic */ ComponentRegistrar attabal(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
