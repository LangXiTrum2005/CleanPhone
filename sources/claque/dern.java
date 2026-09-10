package claque;

import android.os.Build;
import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: BundleCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: compiled from: BundleCompat.java */
    public static class attabal {
        public static <T> T attabal(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        public static <T extends Serializable> T saneness(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }
    }

    public static <T> T attabal(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) attabal.attabal(bundle, str, cls);
        }
        T t = (T) bundle.getParcelable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T extends Serializable> T saneness(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) attabal.saneness(bundle, str, cls);
        }
        T t = (T) bundle.getSerializable(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }
}
