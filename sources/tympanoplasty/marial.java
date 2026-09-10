package tympanoplasty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ResourceDecoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<String> f39053attabal = new ArrayList();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Map<String, List<attabal<?, ?>>> f39054saneness = new HashMap();

    /* JADX INFO: compiled from: ResourceDecoderRegistry.java */
    public static class attabal<T, R> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<T> f39055attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final maggot.marial<T, R> f39056dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Class<R> f39057saneness;

        public attabal(Class<T> cls, Class<R> cls2, maggot.marial<T, R> marialVar) {
            this.f39055attabal = cls;
            this.f39057saneness = cls2;
            this.f39056dern = marialVar;
        }

        public boolean attabal(Class<?> cls, Class<?> cls2) {
            return this.f39055attabal.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f39057saneness);
        }
    }

    public synchronized <T, R> void attabal(String str, maggot.marial<T, R> marialVar, Class<T> cls, Class<R> cls2) {
        dern(str).add(new attabal<>(cls, cls2, marialVar));
    }

    public final synchronized List<attabal<?, ?>> dern(String str) {
        List<attabal<?, ?>> arrayList;
        try {
            if (!this.f39053attabal.contains(str)) {
                this.f39053attabal.add(str);
            }
            arrayList = this.f39054saneness.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f39054saneness.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void marial(List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f39053attabal);
            this.f39053attabal.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f39053attabal.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f39053attabal.add(str);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized <T, R> List<maggot.marial<T, R>> saneness(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f39053attabal.iterator();
        while (it.hasNext()) {
            List<attabal<?, ?>> list = this.f39054saneness.get(it.next());
            if (list != null) {
                for (attabal<?, ?> attabalVar : list) {
                    if (attabalVar.attabal(cls, cls2)) {
                        arrayList.add(attabalVar.f39056dern);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> wireman(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f39053attabal.iterator();
        while (it.hasNext()) {
            List<attabal<?, ?>> list = this.f39054saneness.get(it.next());
            if (list != null) {
                for (attabal<?, ?> attabalVar : list) {
                    if (attabalVar.attabal(cls, cls2) && !arrayList.contains(attabalVar.f39057saneness)) {
                        arrayList.add(attabalVar.f39057saneness);
                    }
                }
            }
        }
        return arrayList;
    }
}
