package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f4333a = new WeakHashMap();

    public static class Api19Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class f4334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f4335b;

        public static boolean a(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (f4334a == null) {
                    f4334a = Class.forName("android.location.LocationRequest");
                }
                if (f4335b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4334a, LocationListener.class, Looper.class);
                    f4335b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestA = locationRequestCompat.a(str);
                if (locationRequestA == null) {
                    return false;
                }
                f4335b.invoke(locationManager, locationRequestA, locationListenerCompat, looper);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }

        public static boolean b(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            try {
                if (f4334a == null) {
                    f4334a = Class.forName("android.location.LocationRequest");
                }
                if (f4335b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4334a, LocationListener.class, Looper.class);
                    f4335b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestA = locationRequestCompat.a(str);
                if (locationRequestA == null) {
                    return false;
                }
                synchronized (LocationManagerCompat.f4333a) {
                    try {
                        f4335b.invoke(locationManager, locationRequestA, locationListenerTransport, Looper.getMainLooper());
                        locationListenerTransport.getClass();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    public static class Api24Impl {
        public static boolean a(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        public static boolean b(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        public static boolean c(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            if (handler == null) {
                throw new IllegalArgumentException();
            }
            SimpleArrayMap simpleArrayMap = GnssListenersHolder.f4338a;
            synchronized (simpleArrayMap) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.get(callback);
                    if (preRGnssStatusTransport == null) {
                        preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                    } else {
                        preRGnssStatusTransport.f4341b = null;
                    }
                    Preconditions.a("invalid null executor", executor != null);
                    if (preRGnssStatusTransport.f4341b != null) {
                        throw new IllegalStateException((String) null);
                    }
                    preRGnssStatusTransport.f4341b = executor;
                    if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, preRGnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void d(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        public static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).f4341b = null;
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    public static class Api28Impl {
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static class Api30Impl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Class f4336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f4337b;

        public static void a(LocationManager locationManager, String str, CancellationSignal cancellationSignal, Executor executor, final Consumer<Location> consumer) {
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: androidx.core.location.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept((Location) obj);
                }
            });
        }

        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            SimpleArrayMap simpleArrayMap = GnssListenersHolder.f4338a;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                    if (gnssStatusTransport == null) {
                        gnssStatusTransport = new GnssStatusTransport(callback);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, gnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean c(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            try {
                if (f4336a == null) {
                    f4336a = Class.forName("android.location.LocationRequest");
                }
                if (f4337b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f4336a, Executor.class, LocationListener.class);
                    f4337b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestA = locationRequestCompat.a(str);
                if (locationRequestA == null) {
                    return false;
                }
                f4337b.invoke(locationManager, locationRequestA, executor, locationListenerCompat);
                return true;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    public static class Api31Impl {
        public static boolean a(LocationManager locationManager, String str) {
            return locationManager.hasProvider(str);
        }

        public static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        public static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    public static final class CancellableLocationListener implements LocationListener {
        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            synchronized (this) {
            }
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i2, Bundle bundle) {
        }
    }

    public static class GnssListenersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SimpleArrayMap f4338a = new SimpleArrayMap(0);

        static {
            new SimpleArrayMap(0);
        }
    }

    public static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public final void onStatusChanged(int i2) {
        }
    }

    public static class GnssStatusTransport extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f4339a;

        public GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.a("invalid null callback", callback != null);
            this.f4339a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i2) {
            this.f4339a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            new GnssStatusWrapper(gnssStatus);
            this.f4339a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            this.f4339a.getClass();
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            this.f4339a.getClass();
        }
    }

    public static class GpsStatusTransport implements GpsStatus.Listener {
        @Override // android.location.GpsStatus.Listener
        public final void onGpsStatusChanged(int i2) {
        }
    }

    public static final class InlineHandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Looper.myLooper();
            throw null;
        }
    }

    public static class LocationListenerKey {
        public final boolean equals(Object obj) {
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            ((LocationListenerKey) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            return Objects.hash(null, null);
        }
    }

    public static class LocationListenerTransport implements LocationListener {
        @Override // android.location.LocationListener
        public final void onFlushComplete(int i2) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i2, Bundle bundle) {
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
        }
    }

    public static class PreRGnssStatusTransport extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GnssStatusCompat.Callback f4340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile Executor f4341b;

        public PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.a("invalid null callback", callback != null);
            this.f4340a = callback;
        }

        @Override // android.location.GnssStatus.Callback
        public final void onFirstFix(int i2) {
            Executor executor = this.f4341b;
            if (executor == null) {
                return;
            }
            executor.execute(new b(this, executor, i2));
        }

        @Override // android.location.GnssStatus.Callback
        public final void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f4341b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.c
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.PreRGnssStatusTransport preRGnssStatusTransport = this.X;
                    Executor executor2 = executor;
                    GnssStatus gnssStatus2 = gnssStatus;
                    if (preRGnssStatusTransport.f4341b != executor2) {
                        return;
                    }
                    GnssStatusCompat.Callback callback = preRGnssStatusTransport.f4340a;
                    new GnssStatusWrapper(gnssStatus2);
                    callback.getClass();
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStarted() {
            Executor executor = this.f4341b;
            if (executor == null) {
                return;
            }
            executor.execute(new b(this, executor, 2, (byte) 0));
        }

        @Override // android.location.GnssStatus.Callback
        public final void onStopped() {
            Executor executor = this.f4341b;
            if (executor == null) {
                return;
            }
            executor.execute(new b(this, executor, 1, (byte) 0));
        }
    }
}
