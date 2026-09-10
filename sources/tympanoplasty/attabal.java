package tympanoplasty;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: EncoderRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final List<C0814attabal<?>> f39044attabal = new ArrayList();

    /* JADX INFO: renamed from: tympanoplasty.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EncoderRegistry.java */
    public static final class C0814attabal<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<T> f39045attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final maggot.attabal<T> f39046saneness;

        public C0814attabal(Class<T> cls, maggot.attabal<T> attabalVar) {
            this.f39045attabal = cls;
            this.f39046saneness = attabalVar;
        }

        public boolean attabal(Class<?> cls) {
            return this.f39045attabal.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void attabal(Class<T> cls, maggot.attabal<T> attabalVar) {
        this.f39044attabal.add(new C0814attabal<>(cls, attabalVar));
    }

    public synchronized <T> maggot.attabal<T> saneness(Class<T> cls) {
        for (C0814attabal<?> c0814attabal : this.f39044attabal) {
            if (c0814attabal.attabal(cls)) {
                return (maggot.attabal<T>) c0814attabal.f39046saneness;
            }
        }
        return null;
    }
}
