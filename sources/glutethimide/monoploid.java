package glutethimide;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ModelLoaderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class monoploid {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final molybdenite f27268attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final attabal f27269saneness;

    /* JADX INFO: compiled from: ModelLoaderRegistry.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<Class<?>, C0620attabal<?>> f27270attabal = new HashMap();

        /* JADX INFO: renamed from: glutethimide.monoploid$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ModelLoaderRegistry.java */
        public static class C0620attabal<Model> {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final List<kowloon<Model, ?>> f27271attabal;

            public C0620attabal(List<kowloon<Model, ?>> list) {
                this.f27271attabal = list;
            }
        }

        public void attabal() {
            this.f27270attabal.clear();
        }

        public <Model> void dern(Class<Model> cls, List<kowloon<Model, ?>> list) {
            if (this.f27270attabal.put(cls, new C0620attabal<>(list)) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }

        public <Model> List<kowloon<Model, ?>> saneness(Class<Model> cls) {
            C0620attabal<?> c0620attabal = this.f27270attabal.get(cls);
            if (c0620attabal == null) {
                return null;
            }
            return (List<kowloon<Model, ?>>) c0620attabal.f27271attabal;
        }
    }

    public monoploid(technofreak.competently<List<Throwable>> competentlyVar) {
        this(new molybdenite(competentlyVar));
    }

    public static <A> Class<A> saneness(A a) {
        return (Class<A>) a.getClass();
    }

    public synchronized <Model, Data> void attabal(Class<Model> cls, Class<Data> cls2, arytenoidectomy<? extends Model, ? extends Data> arytenoidectomyVar) {
        this.f27268attabal.saneness(cls, cls2, arytenoidectomyVar);
        this.f27269saneness.attabal();
    }

    public synchronized List<Class<?>> dern(Class<?> cls) {
        return this.f27268attabal.competently(cls);
    }

    public final synchronized <A> List<kowloon<A, ?>> marial(Class<A> cls) {
        List<kowloon<A, ?>> listSaneness;
        listSaneness = this.f27269saneness.saneness(cls);
        if (listSaneness == null) {
            listSaneness = Collections.unmodifiableList(this.f27268attabal.marial(cls));
            this.f27269saneness.dern(cls, listSaneness);
        }
        return listSaneness;
    }

    public <A> List<kowloon<A, ?>> wireman(A a) {
        List<kowloon<A, ?>> listMarial = marial(saneness(a));
        if (listMarial.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a);
        }
        int size = listMarial.size();
        List<kowloon<A, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            kowloon<A, ?> kowloonVar = listMarial.get(i);
            if (kowloonVar.attabal(a)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(kowloonVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(a, listMarial);
        }
        return arrayList;
    }

    public monoploid(molybdenite molybdeniteVar) {
        this.f27269saneness = new attabal();
        this.f27268attabal = molybdeniteVar;
    }
}
