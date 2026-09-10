package picketboat;

import android.content.Intent;
import android.os.Build;
import java.io.Serializable;

/* JADX INFO: compiled from: IntentCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: compiled from: IntentCompat.java */
    public static class attabal {
        public static <T> T attabal(Intent intent, String str, Class<T> cls) {
            return (T) intent.getParcelableExtra(str, cls);
        }

        public static <T extends Serializable> T saneness(Intent intent, String str, Class<T> cls) {
            return (T) intent.getSerializableExtra(str, cls);
        }
    }

    public static <T> T attabal(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) attabal.attabal(intent, str, cls);
        }
        T t = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static <T extends Serializable> T saneness(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) attabal.saneness(intent, str, cls);
        }
        T t = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }
}
