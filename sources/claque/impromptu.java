package claque;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: HandlerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu {

    /* JADX INFO: compiled from: HandlerCompat.java */
    public static class attabal {
        public static Handler attabal(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler attabal(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return attabal.attabal(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
