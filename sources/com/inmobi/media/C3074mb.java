package com.inmobi.media;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.provider.Settings;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.inmobi.media.C3074mb;
import com.unity3d.services.UnityAdsConstants;
import formularization.attabal;
import formularization.beachfront;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3074mb implements LocationListener {
    public static final C3074mb a = new C3074mb();
    public static final LocationManager b;
    public static final HandlerThread c;
    public static GoogleApiClient d;
    public static final String e;
    public static boolean f;
    public static final attabal g;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        c = handlerThread;
        e = C3074mb.class.getSimpleName();
        g = beachfront.saneness(false, 1, null);
        H6.a(handlerThread, "LThread");
        Context context = Ji.a;
        if (context != null) {
            Object systemService = context.getSystemService("location");
            b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static Location c() {
        try {
            Context context = Ji.a;
            Intrinsics.beachfront(context);
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
            Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "getLastLocation(...)");
            return lastLocation.getResult();
        } catch (Exception unused) {
            return null;
        } catch (IncompatibleClassChangeError e2) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            e2.toString();
            return null;
        }
    }

    public static boolean d() {
        try {
            return Kf.a(Ji.a, "android.permission.ACCESS_FINE_LOCATION") || Kf.a(Ji.a, "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i;
        Context context = Ji.a;
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            LocationManager locationManager = b;
            return locationManager != null && locationManager.isLocationEnabled();
        }
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i = 0;
        }
        return i != 0;
    }

    public static boolean f() {
        try {
            polloi.saneness(GoogleApiClient.class).taiyuan();
            polloi.saneness(FusedLocationProviderClient.class).taiyuan();
            polloi.saneness(LocationServices.class).taiyuan();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C3049lb c3049lb;
        attabal attabalVar;
        if (continuationImpl instanceof C3049lb) {
            c3049lb = (C3049lb) continuationImpl;
            int i = c3049lb.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3049lb.d = i - Integer.MIN_VALUE;
            } else {
                c3049lb = new C3049lb(this, continuationImpl);
            }
        } else {
            c3049lb = new C3049lb(this, continuationImpl);
        }
        Object obj = c3049lb.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3049lb.d;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = g;
            c3049lb.a = attabalVar2;
            c3049lb.d = 1;
            if (attabalVar2.attabal(null, c3049lb) == objBeachfront) {
                return objBeachfront;
            }
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c3049lb.a;
            dern.saneness(obj);
        }
        try {
            try {
                C3074mb c3074mb = a;
                if (d() && e()) {
                    c3074mb.b();
                    if (!f()) {
                        a(Ji.a);
                    }
                }
            } catch (Exception e2) {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                e2.getMessage();
            }
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }

    public final void b() {
        LocationManager locationManager = b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider != null) {
                Intrinsics.checkNotNullExpressionValue(e, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, c.getLooper());
            } else {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            }
        }
        Unit unit = Unit.f29295attabal;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        Intrinsics.checkNotNullParameter(location, "location");
        try {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!d() || (locationManager = b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e2) {
            taiyuan taiyuanVar = P9.a;
            AbstractC2973i9.a(e2);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                String TAG = e;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Intrinsics.beachfront(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new C3024kb()).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() { // from class: adsuki.mercenary
                    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
                    public final void onConnectionFailed(ConnectionResult connectionResult) {
                        C3074mb.a(connectionResult);
                    }
                }).addApi(LocationServices.API).build();
                d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception e2) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            e2.getMessage();
        }
    }

    public static final void a(ConnectionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f = false;
    }

    public static Location a() {
        Location location;
        Location locationC;
        Location locationA;
        try {
            if (e() && d()) {
                locationC = f ? c() : null;
                try {
                    locationA = (b == null || !Kf.a(Ji.a, "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
                } catch (Exception e2) {
                    location = locationC;
                    e = e2;
                    String TAG = e;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    e.getMessage();
                    locationC = location;
                }
            } else {
                locationC = null;
                locationA = null;
            }
        } catch (Exception e3) {
            e = e3;
            location = null;
        }
        if (locationC == null && locationA == null) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return null;
        }
        return a(locationC, locationA);
    }

    public static Location a(Location location, Location location2) {
        if (location == null) {
            String TAG = e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            if (location2 != null) {
                location2.getTime();
            }
            Objects.toString(location2);
            return location2;
        }
        if (location2 == null) {
            String TAG2 = e;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        long time = location.getTime() - location2.getTime();
        boolean z = time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        boolean z2 = time < -120000;
        boolean z3 = time > 0;
        if (z) {
            String TAG3 = e;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            location.getTime();
            location.toString();
            return location;
        }
        if (z2) {
            String TAG4 = e;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z4 = accuracy > 0;
        boolean z5 = accuracy < 0;
        boolean z6 = accuracy > 200;
        if (!z5 && (!z3 || (z4 && z6))) {
            String TAG5 = e;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            location2.getTime();
            location2.toString();
            return location2;
        }
        String TAG6 = e;
        Intrinsics.checkNotNullExpressionValue(TAG6, "TAG");
        location.getTime();
        location.toString();
        return location;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[DONT_INVERT, PHI: r1
  0x0057: PHI (r1v4 android.location.Location) = 
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v5 android.location.Location)
 binds: [B:31:0x0057, B:17:0x0047, B:19:0x004d, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:15:0x003d->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x005d A[EDGE_INSN: B:38:0x005d->B:28:0x005d BREAK  A[LOOP:0: B:15:0x003d->B:26:0x005a], SYNTHETIC] */
    public static Location a(int i, int i2) {
        String bestProvider;
        Location lastKnownLocation;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i);
        criteria.setPowerRequirement(i2);
        criteria.setCostAllowed(false);
        LocationManager locationManager = b;
        Location lastKnownLocation2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null || i == 1) {
                lastKnownLocation2 = lastKnownLocation;
            } else {
                LocationManager locationManager2 = b;
                if (locationManager2 != null) {
                    Intrinsics.beachfront(locationManager2);
                    List<String> providers = locationManager2.getProviders(true);
                    Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i3 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        lastKnownLocation2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (lastKnownLocation2 != null) {
                                        break;
                                    }
                                    if (i3 < 0) {
                                        break;
                                        break;
                                    }
                                    size = i3;
                                } else {
                                    if (i3 < 0) {
                                        break;
                                    }
                                    size = i3;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
        String TAG = e;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return lastKnownLocation2;
    }

    public static HashMap a(Location location, boolean z, Location location2) {
        HashMap map = new HashMap();
        Context context = Ji.a;
        if (context != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                map.put("u-latlong-accu", a(location));
                map.put("sdk-collected", Integer.valueOf(z ? 1 : 0));
            }
            C3180qh c3180qh = Yi.a;
            if (Ji.b() == null || Yi.a().getLocationEnabled()) {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                map.put("u-latlong-accu-fine", a(location2));
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && d()) {
                if (Kf.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", "none");
                return map;
            }
        }
        return map;
    }

    public static String a(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy());
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
