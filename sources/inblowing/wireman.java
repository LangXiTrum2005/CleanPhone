package inblowing;

import java.util.Set;

/* JADX INFO: compiled from: ComponentContainer.java */
/* JADX INFO: loaded from: classes3.dex */
public interface wireman {
    default <T> T attabal(Class<T> cls) {
        return (T) impromptu(cuirassed.saneness(cls));
    }

    default <T> friedmanite.saneness<T> beachfront(Class<T> cls) {
        return dern(cuirassed.saneness(cls));
    }

    <T> friedmanite.saneness<Set<T>> competently(cuirassed<T> cuirassedVar);

    <T> friedmanite.saneness<T> dern(cuirassed<T> cuirassedVar);

    default <T> T impromptu(cuirassed<T> cuirassedVar) {
        friedmanite.saneness<T> sanenessVarDern = dern(cuirassedVar);
        if (sanenessVarDern == null) {
            return null;
        }
        return sanenessVarDern.get();
    }

    <T> friedmanite.attabal<T> marial(cuirassed<T> cuirassedVar);

    default <T> Set<T> saneness(cuirassed<T> cuirassedVar) {
        return competently(cuirassedVar).get();
    }

    default <T> friedmanite.attabal<T> taiyuan(Class<T> cls) {
        return marial(cuirassed.saneness(cls));
    }

    default <T> Set<T> wireman(Class<T> cls) {
        return saneness(cuirassed.saneness(cls));
    }
}
