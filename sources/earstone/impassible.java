package earstone;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PropertyValuesHolderUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class impassible {

    /* JADX INFO: compiled from: PropertyValuesHolderUtils.java */
    public static class attabal {
        public static <V> PropertyValuesHolder attabal(Property<?, V> property, Path path) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
    }

    public static PropertyValuesHolder attabal(Property<?, PointF> property, Path path) {
        return attabal.attabal(property, path);
    }
}
