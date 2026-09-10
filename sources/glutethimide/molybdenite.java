package glutethimide;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: MultiModelLoaderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class molybdenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<saneness<?, ?>> f27261attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Set<saneness<?, ?>> f27262dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f27263saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final technofreak.competently<List<Throwable>> f27264wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final dern f27260marial = new dern();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final kowloon<Object, Object> f27259beachfront = new attabal();

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class attabal implements kowloon<Object, Object> {
        @Override // glutethimide.kowloon
        public boolean attabal(Object obj) {
            return false;
        }

        @Override // glutethimide.kowloon
        public kowloon.attabal<Object> saneness(Object obj, int i, int i2, maggot.wireman wiremanVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class dern {
        public <Model, Data> polloi<Model, Data> attabal(List<kowloon<Model, Data>> list, technofreak.competently<List<Throwable>> competentlyVar) {
            return new polloi<>(list, competentlyVar);
        }
    }

    /* JADX INFO: compiled from: MultiModelLoaderFactory.java */
    public static class saneness<Model, Data> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<Model> f27265attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final arytenoidectomy<? extends Model, ? extends Data> f27266dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<Data> f27267saneness;

        public saneness(Class<Model> cls, Class<Data> cls2, arytenoidectomy<? extends Model, ? extends Data> arytenoidectomyVar) {
            this.f27265attabal = cls;
            this.f27267saneness = cls2;
            this.f27266dern = arytenoidectomyVar;
        }

        public boolean attabal(Class<?> cls) {
            return this.f27265attabal.isAssignableFrom(cls);
        }

        public boolean saneness(Class<?> cls, Class<?> cls2) {
            return attabal(cls) && this.f27267saneness.isAssignableFrom(cls2);
        }
    }

    public molybdenite(technofreak.competently<List<Throwable>> competentlyVar) {
        this(competentlyVar, f27260marial);
    }

    public static <Model, Data> kowloon<Model, Data> beachfront() {
        return (kowloon<Model, Data>) f27259beachfront;
    }

    public final <Model, Data> void attabal(Class<Model> cls, Class<Data> cls2, arytenoidectomy<? extends Model, ? extends Data> arytenoidectomyVar, boolean z) {
        saneness<?, ?> sanenessVar = new saneness<>(cls, cls2, arytenoidectomyVar);
        List<saneness<?, ?>> list = this.f27261attabal;
        list.add(z ? list.size() : 0, sanenessVar);
    }

    public synchronized List<Class<?>> competently(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (saneness<?, ?> sanenessVar : this.f27261attabal) {
            if (!arrayList.contains(sanenessVar.f27267saneness) && sanenessVar.attabal(cls)) {
                arrayList.add(sanenessVar.f27267saneness);
            }
        }
        return arrayList;
    }

    public final <Model, Data> kowloon<Model, Data> dern(saneness<?, ?> sanenessVar) {
        return (kowloon) com.bumptech.glide.util.apical.wireman(sanenessVar.f27266dern.wireman(this));
    }

    public synchronized <Model> List<kowloon<Model, ?>> marial(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (saneness<?, ?> sanenessVar : this.f27261attabal) {
                if (!this.f27262dern.contains(sanenessVar) && sanenessVar.attabal(cls)) {
                    this.f27262dern.add(sanenessVar);
                    arrayList.add(dern(sanenessVar));
                    this.f27262dern.remove(sanenessVar);
                }
            }
        } catch (Throwable th) {
            this.f27262dern.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> void saneness(Class<Model> cls, Class<Data> cls2, arytenoidectomy<? extends Model, ? extends Data> arytenoidectomyVar) {
        attabal(cls, cls2, arytenoidectomyVar, true);
    }

    public synchronized <Model, Data> kowloon<Model, Data> wireman(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (saneness<?, ?> sanenessVar : this.f27261attabal) {
                if (this.f27262dern.contains(sanenessVar)) {
                    z = true;
                } else if (sanenessVar.saneness(cls, cls2)) {
                    this.f27262dern.add(sanenessVar);
                    arrayList.add(dern(sanenessVar));
                    this.f27262dern.remove(sanenessVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f27263saneness.attabal(arrayList, this.f27264wireman);
            }
            if (arrayList.size() == 1) {
                return (kowloon) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
            return beachfront();
        } catch (Throwable th) {
            this.f27262dern.clear();
            throw th;
        }
    }

    public molybdenite(technofreak.competently<List<Throwable>> competentlyVar, dern dernVar) {
        this.f27261attabal = new ArrayList();
        this.f27262dern = new HashSet();
        this.f27264wireman = competentlyVar;
        this.f27263saneness = dernVar;
    }
}
