package staphylococcal;

import com.google.android.datatransport.Priority;

/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wireman<T> {
    public static <T> wireman<T> beachfront(T t) {
        return new attabal(null, t, Priority.DEFAULT, null, null);
    }

    public static <T> wireman<T> competently(T t, beachfront beachfrontVar) {
        return new attabal(null, t, Priority.DEFAULT, beachfrontVar, null);
    }

    public static <T> wireman<T> impromptu(T t) {
        return new attabal(null, t, Priority.HIGHEST, null, null);
    }

    public abstract Integer attabal();

    public abstract T dern();

    public abstract beachfront marial();

    public abstract marial saneness();

    public abstract Priority wireman();
}
