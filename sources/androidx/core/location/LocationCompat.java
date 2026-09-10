package androidx.core.location;

import android.location.Location;
import android.os.Bundle;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class LocationCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f4330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Integer f4331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f4332c;
    public static Integer d;

    public static class Api26Impl {
        public static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        public static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        public static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        public static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        public static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        public static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        public static void g(Location location) {
            try {
                LocationCompat.a().setByte(location, (byte) (LocationCompat.a().getByte(location) & (~LocationCompat.b())));
            } catch (IllegalAccessException e2) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e2);
                throw illegalAccessError;
            } catch (NoSuchFieldException e3) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e3);
                throw noSuchFieldError;
            }
        }

        public static void h(Location location) {
            try {
                LocationCompat.a().setByte(location, (byte) (LocationCompat.a().getByte(location) & (~LocationCompat.c())));
            } catch (IllegalAccessException e2) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e2);
                throw illegalAccessError;
            } catch (NoSuchFieldException e3) {
                NoSuchFieldError noSuchFieldError = new NoSuchFieldError();
                noSuchFieldError.initCause(e3);
                throw noSuchFieldError;
            }
        }

        public static void i(Location location) {
            try {
                LocationCompat.a().setByte(location, (byte) (LocationCompat.a().getByte(location) & (~LocationCompat.d())));
            } catch (IllegalAccessException | NoSuchFieldException e2) {
                IllegalAccessError illegalAccessError = new IllegalAccessError();
                illegalAccessError.initCause(e2);
                throw illegalAccessError;
            }
        }

        public static void j(Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        public static void k(Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        public static void l(Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }
    }

    public static class Api28Impl {
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean zHasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean zHasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean zHasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean zHasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean zHasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean zHasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (zHasAltitude) {
                    location.setAltitude(altitude);
                }
                if (zHasSpeed) {
                    location.setSpeed(speed);
                }
                if (zHasBearing) {
                    location.setBearing(bearing);
                }
                if (zHasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (zHasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (zHasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    public static class Api29Impl {
        public static void a(Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.a(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        public static void b(Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.b(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        public static void c(Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                Api28Impl.c(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    public static class Api33Impl {
        public static void a(Location location) {
            location.removeBearingAccuracy();
        }

        public static void b(Location location) {
            location.removeSpeedAccuracy();
        }

        public static void c(Location location) {
            location.removeVerticalAccuracy();
        }
    }

    public static class Api34Impl {
        public static float a(Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        public static double b(Location location) {
            return location.getMslAltitudeMeters();
        }

        public static boolean c(Location location) {
            return location.hasMslAltitude();
        }

        public static boolean d(Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        public static void e(Location location) {
            location.removeMslAltitude();
        }

        public static void f(Location location) {
            location.removeMslAltitudeAccuracy();
        }

        public static void g(Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        public static void h(Location location, double d) {
            location.setMslAltitudeMeters(d);
        }
    }

    public static Field a() throws NoSuchFieldException {
        if (f4330a == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            f4330a = declaredField;
            declaredField.setAccessible(true);
        }
        return f4330a;
    }

    public static int b() throws NoSuchFieldException {
        if (f4332c == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f4332c = Integer.valueOf(declaredField.getInt(null));
        }
        return f4332c.intValue();
    }

    public static int c() throws NoSuchFieldException {
        if (f4331b == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            f4331b = Integer.valueOf(declaredField.getInt(null));
        }
        return f4331b.intValue();
    }

    public static int d() throws NoSuchFieldException {
        if (d == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            d = Integer.valueOf(declaredField.getInt(null));
        }
        return d.intValue();
    }
}
