package androidx.core.location;

import A.AbstractC0912t;
import android.location.LocationRequest;
import android.os.Build;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequestCompat {

    public static class Api19Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class f4342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f4343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f4344c;
        public static Method d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Method f4345e;
        public static Method f;
    }

    public static class Api31Impl {
        public static LocationRequest a(LocationRequestCompat locationRequestCompat) {
            locationRequestCompat.getClass();
            return new LocationRequest.Builder(0L).setQuality(0).setMinUpdateIntervalMillis(0L).setDurationMillis(0L).setMaxUpdates(0).setMinUpdateDistanceMeters(0.0f).setMaxUpdateDelayMillis(0L).build();
        }
    }

    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    public final LocationRequest a(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.a(this);
        }
        Object obj = null;
        try {
            if (Api19Impl.f4342a == null) {
                Api19Impl.f4342a = Class.forName("android.location.LocationRequest");
            }
            Method method = Api19Impl.f4343b;
            Class cls = Long.TYPE;
            if (method == null) {
                Method declaredMethod = Api19Impl.f4342a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                Api19Impl.f4343b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = Api19Impl.f4343b.invoke(null, str, 0L, Float.valueOf(0.0f), Boolean.FALSE);
            if (objInvoke != null) {
                Method method2 = Api19Impl.f4344c;
                Class cls2 = Integer.TYPE;
                if (method2 == null) {
                    Method declaredMethod2 = Api19Impl.f4342a.getDeclaredMethod("setQuality", cls2);
                    Api19Impl.f4344c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Api19Impl.f4344c.invoke(objInvoke, 0);
                if (Api19Impl.d == null) {
                    Method declaredMethod3 = Api19Impl.f4342a.getDeclaredMethod("setFastestInterval", cls);
                    Api19Impl.d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Api19Impl.d.invoke(objInvoke, 0L);
                if (Api19Impl.f4345e == null) {
                    Method declaredMethod4 = Api19Impl.f4342a.getDeclaredMethod("setNumUpdates", cls2);
                    Api19Impl.f4345e = declaredMethod4;
                    declaredMethod4.setAccessible(true);
                }
                Api19Impl.f4345e.invoke(objInvoke, 0);
                if (Api19Impl.f == null) {
                    Method declaredMethod5 = Api19Impl.f4342a.getDeclaredMethod("setExpireIn", cls);
                    Api19Impl.f = declaredMethod5;
                    declaredMethod5.setAccessible(true);
                }
                Api19Impl.f.invoke(objInvoke, 0L);
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return AbstractC0912t.f(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        ((LocationRequestCompat) obj).getClass();
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        int i2 = (int) 0;
        return (i2 * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[@");
        Object obj = TimeUtils.f4414a;
        synchronized (obj) {
            sb.append(TimeUtils.f4415b, 0, TimeUtils.b(0L));
        }
        sb.append(", duration=");
        synchronized (obj) {
            sb.append(TimeUtils.f4415b, 0, TimeUtils.b(0L));
        }
        sb.append(", maxUpdates=0");
        if (0.0f > 0.0d) {
            sb.append(", minUpdateDistance=0.0");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
