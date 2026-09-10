package tympanoplasty;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ResourceEncoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<attabal<?>> f39047attabal = new ArrayList();

    /* JADX INFO: compiled from: ResourceEncoderRegistry.java */
    public static final class attabal<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<T> f39048attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final maggot.beachfront<T> f39049saneness;

        public attabal(Class<T> cls, maggot.beachfront<T> beachfrontVar) {
            this.f39048attabal = cls;
            this.f39049saneness = beachfrontVar;
        }

        public boolean attabal(Class<?> cls) {
            return this.f39048attabal.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void attabal(Class<Z> cls, maggot.beachfront<Z> beachfrontVar) {
        this.f39047attabal.add(new attabal<>(cls, beachfrontVar));
    }

    public synchronized <Z> maggot.beachfront<Z> saneness(Class<Z> cls) {
        int size = this.f39047attabal.size();
        for (int i = 0; i < size; i++) {
            attabal<?> attabalVar = this.f39047attabal.get(i);
            if (attabalVar.attabal(cls)) {
                return (maggot.beachfront<Z>) attabalVar.f39049saneness;
            }
        }
        return null;
    }
}
