package environ;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: TranscoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<attabal<?, ?>> f25866attabal = new ArrayList();

    /* JADX INFO: compiled from: TranscoderRegistry.java */
    public static final class attabal<Z, R> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<Z> f25867attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final marial<Z, R> f25868dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<R> f25869saneness;

        public attabal(Class<Z> cls, Class<R> cls2, marial<Z, R> marialVar) {
            this.f25867attabal = cls;
            this.f25869saneness = cls2;
            this.f25868dern = marialVar;
        }

        public boolean attabal(Class<?> cls, Class<?> cls2) {
            return this.f25867attabal.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f25869saneness);
        }
    }

    public synchronized <Z, R> marial<Z, R> attabal(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return competently.saneness();
        }
        for (attabal<?, ?> attabalVar : this.f25866attabal) {
            if (attabalVar.attabal(cls, cls2)) {
                return (marial<Z, R>) attabalVar.f25868dern;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> void dern(Class<Z> cls, Class<R> cls2, marial<Z, R> marialVar) {
        this.f25866attabal.add(new attabal<>(cls, cls2, marialVar));
    }

    public synchronized <Z, R> List<Class<R>> saneness(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (attabal<?, ?> attabalVar : this.f25866attabal) {
            if (attabalVar.attabal(cls, cls2) && !arrayList.contains(attabalVar.f25869saneness)) {
                arrayList.add(attabalVar.f25869saneness);
            }
        }
        return arrayList;
    }
}
