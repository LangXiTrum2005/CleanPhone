package earstone;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: ObjectAnimatorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize {

    /* JADX INFO: compiled from: ObjectAnimatorUtils.java */
    public static class attabal {
        public static <T, V> ObjectAnimator attabal(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }

    public static <T> ObjectAnimator attabal(T t, Property<T, PointF> property, Path path) {
        return attabal.attabal(t, property, path);
    }
}
