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
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class X6 implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X6 f23341a = new X6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LocationManager f23342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HandlerThread f23343c;
    public static GoogleApiClient d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f23344e;
    public static boolean f;

    static {
        HandlerThread handlerThread = new HandlerThread("LThread");
        f23343c = handlerThread;
        f23344e = "X6";
        D4.a(handlerThread, "LThread");
        Context contextD = Uc.d();
        if (contextD != null) {
            Object systemService = contextD.getSystemService("location");
            f23342b = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        }
    }

    public static boolean c() {
        try {
            return AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_FINE_LOCATION") || AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_COARSE_LOCATION");
        } catch (Exception unused) {
            String TAG = f23344e;
            Intrinsics.e(TAG, "TAG");
            return false;
        }
    }

    public static boolean e() {
        int i2;
        Context contextD = Uc.d();
        if (contextD != null) {
            if (Build.VERSION.SDK_INT < 28) {
                try {
                    i2 = Settings.Secure.getInt(contextD.getContentResolver(), "location_mode");
                } catch (Settings.SettingNotFoundException unused) {
                    i2 = 0;
                }
                return i2 != 0;
            }
            LocationManager locationManager = f23342b;
            if (locationManager != null && locationManager.isLocationEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        LocationManager locationManager = f23342b;
        if (locationManager != null) {
            Criteria criteria = new Criteria();
            criteria.setBearingAccuracy(2);
            criteria.setPowerRequirement(2);
            criteria.setCostAllowed(false);
            String bestProvider = locationManager.getBestProvider(criteria, true);
            if (bestProvider == null) {
                String TAG = f23344e;
                Intrinsics.e(TAG, "TAG");
            } else {
                String TAG2 = f23344e;
                Intrinsics.e(TAG2, "TAG");
                locationManager.requestSingleUpdate(bestProvider, this, f23343c.getLooper());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0107 A[Catch: all -> 0x002e, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0011, B:77:0x0149, B:79:0x0155, B:80:0x015a, B:82:0x0167, B:83:0x016f, B:85:0x0175, B:81:0x015f, B:11:0x0031, B:13:0x0037, B:15:0x003d, B:17:0x0041, B:22:0x006d, B:24:0x0071, B:26:0x007d, B:34:0x0095, B:36:0x009f, B:38:0x00ab, B:40:0x00b2, B:41:0x00c1, B:54:0x00e9, B:56:0x00f9, B:57:0x0107, B:73:0x012b, B:75:0x013a, B:31:0x0089, B:20:0x0062), top: B:97:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:95:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized HashMap b() {
        HashMap map;
        Location location;
        Location locationA;
        long time;
        boolean z2;
        boolean z3;
        boolean z4;
        int accuracy;
        boolean z5;
        boolean z6;
        boolean z7;
        map = new HashMap();
        String strH = Uc.f23270a.h();
        if (strH != null) {
            LinkedHashMap linkedHashMap = O2.f23027a;
            Config configA = M2.a("signals", strH, null);
            Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
            if (((SignalsConfig) configA).getIce().getLocationEnabled()) {
                try {
                    if (e() || !c()) {
                        location = null;
                        locationA = null;
                    } else {
                        if (f) {
                            try {
                                Context contextD = Uc.d();
                                Intrinsics.c(contextD);
                                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(contextD);
                                Intrinsics.e(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                                Task lastLocation = fusedLocationProviderClient.getLastLocation();
                                Intrinsics.e(lastLocation, "getLastLocation(...)");
                                location = (Location) lastLocation.getResult();
                            } catch (Exception unused) {
                                location = null;
                            } catch (IncompatibleClassChangeError e2) {
                                String TAG = f23344e;
                                Intrinsics.e(TAG, "TAG");
                                e2.toString();
                                location = null;
                            }
                        } else {
                            location = null;
                        }
                        try {
                            locationA = (f23342b == null || !AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_COARSE_LOCATION")) ? null : a(2, 2);
                        } catch (Exception unused2) {
                            String TAG2 = f23344e;
                            Intrinsics.e(TAG2, "TAG");
                        }
                    }
                } catch (Exception unused3) {
                    location = null;
                }
                if (location == null || locationA != null) {
                    if (location == null) {
                        String TAG3 = f23344e;
                        Intrinsics.e(TAG3, "TAG");
                        Objects.toString(locationA);
                        if (locationA != null) {
                            locationA.getTime();
                        }
                    } else if (locationA == null) {
                        String TAG4 = f23344e;
                        Intrinsics.e(TAG4, "TAG");
                        location.toString();
                        location.getTime();
                    } else {
                        time = location.getTime() - locationA.getTime();
                        if (time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (time < -120000) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (time > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z2) {
                            String TAG5 = f23344e;
                            Intrinsics.e(TAG5, "TAG");
                            location.toString();
                            location.getTime();
                        } else if (z3) {
                            String TAG6 = f23344e;
                            Intrinsics.e(TAG6, "TAG");
                            locationA.toString();
                            locationA.getTime();
                        } else {
                            accuracy = (int) (location.getAccuracy() - locationA.getAccuracy());
                            if (accuracy > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (accuracy < 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (accuracy > 200) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (!z6 || (z4 && !(z5 && z7))) {
                                String TAG7 = f23344e;
                                Intrinsics.e(TAG7, "TAG");
                                location.toString();
                                location.getTime();
                            } else {
                                String TAG8 = f23344e;
                                Intrinsics.e(TAG8, "TAG");
                                locationA.toString();
                                locationA.getTime();
                            }
                        }
                    }
                    location = locationA;
                } else {
                    String TAG9 = f23344e;
                    Intrinsics.e(TAG9, "TAG");
                    location = null;
                }
            } else {
                location = null;
            }
        } else {
            if (e()) {
                location = null;
                locationA = null;
            } else {
                location = null;
                locationA = null;
            }
            if (location == null) {
            }
            if (location == null) {
                String TAG10 = f23344e;
                Intrinsics.e(TAG10, "TAG");
                Objects.toString(locationA);
                if (locationA != null) {
                    locationA.getTime();
                }
            } else if (locationA == null) {
                String TAG11 = f23344e;
                Intrinsics.e(TAG11, "TAG");
                location.toString();
                location.getTime();
            } else {
                time = location.getTime() - locationA.getTime();
                if (time > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (time < -120000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (time > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2) {
                    String TAG12 = f23344e;
                    Intrinsics.e(TAG12, "TAG");
                    location.toString();
                    location.getTime();
                } else if (z3) {
                    String TAG13 = f23344e;
                    Intrinsics.e(TAG13, "TAG");
                    locationA.toString();
                    locationA.getTime();
                } else {
                    accuracy = (int) (location.getAccuracy() - locationA.getAccuracy());
                    if (accuracy > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (accuracy < 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (accuracy > 200) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z6) {
                    }
                    String TAG14 = f23344e;
                    Intrinsics.e(TAG14, "TAG");
                    location.toString();
                    location.getTime();
                }
            }
            location = locationA;
        }
        HashMap mapA = location != null ? a(location, true, AbstractC3290wa.a(Uc.d(), "android.permission.ACCESS_FINE_LOCATION") ? a(1, 3) : null) : a(AbstractC2936ab.b(), false, null);
        for (Map.Entry entry : mapA.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    public final synchronized void d() {
        try {
            if (c() && e()) {
                a();
                try {
                    ReflectionFactory reflectionFactory = Reflection.f43333a;
                    reflectionFactory.b(GoogleApiClient.class).l();
                    reflectionFactory.b(FusedLocationProviderClient.class).l();
                    reflectionFactory.b(LocationServices.class).l();
                    a(Uc.d());
                } catch (NoClassDefFoundError unused) {
                }
            }
        } catch (Exception unused2) {
            String TAG = f23344e;
            Intrinsics.e(TAG, "TAG");
        }
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        LocationManager locationManager;
        Intrinsics.f(location, "location");
        try {
            String TAG = f23344e;
            Intrinsics.e(TAG, "TAG");
            location.getTime();
            location.getLatitude();
            location.getLongitude();
            location.getAccuracy();
            if (!c() || (locationManager = f23342b) == null) {
                return;
            }
            locationManager.removeUpdates(this);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String provider) {
        Intrinsics.f(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String provider) {
        Intrinsics.f(provider, "provider");
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i2, Bundle bundle) {
    }

    public static void a(Context context) {
        try {
            GoogleApiClient googleApiClient = d;
            if (googleApiClient == null) {
                String TAG = f23344e;
                Intrinsics.e(TAG, "TAG");
                Intrinsics.c(context);
                GoogleApiClient googleApiClientBuild = new GoogleApiClient.Builder(context).addConnectionCallbacks(new W6()).addOnConnectionFailedListener(new A.N()).addApi(LocationServices.API).build();
                d = googleApiClientBuild;
                if (googleApiClientBuild != null) {
                    googleApiClientBuild.connect();
                    return;
                }
                return;
            }
            googleApiClient.connect();
        } catch (Exception unused) {
            String TAG2 = f23344e;
            Intrinsics.e(TAG2, "TAG");
        }
    }

    public static final void a(ConnectionResult it) {
        Intrinsics.f(it, "it");
        f = false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[DONT_INVERT, PHI: r1
  0x0054: PHI (r1v4 android.location.Location) = 
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v3 android.location.Location)
  (r1v5 android.location.Location)
 binds: [B:31:0x0054, B:17:0x0044, B:19:0x004a, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057 A[LOOP:0: B:15:0x003a->B:26:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x005a A[EDGE_INSN: B:38:0x005a->B:28:0x005a BREAK  A[LOOP:0: B:15:0x003a->B:26:0x0057], SYNTHETIC] */
    public static Location a(int i2, int i3) {
        String bestProvider;
        Location lastKnownLocation;
        Criteria criteria = new Criteria();
        criteria.setAccuracy(i2);
        criteria.setPowerRequirement(i3);
        criteria.setCostAllowed(false);
        LocationManager locationManager = f23342b;
        Location lastKnownLocation2 = null;
        if (locationManager != null && (bestProvider = locationManager.getBestProvider(criteria, true)) != null) {
            try {
                lastKnownLocation = locationManager.getLastKnownLocation(bestProvider);
            } catch (Exception unused) {
                lastKnownLocation = null;
            }
            if (lastKnownLocation != null || i2 == 1) {
                lastKnownLocation2 = lastKnownLocation;
            } else {
                LocationManager locationManager2 = f23342b;
                if (locationManager2 != null) {
                    List<String> providers = locationManager2.getProviders(true);
                    Intrinsics.e(providers, "getProviders(...)");
                    int size = providers.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i4 = size - 1;
                            String str = providers.get(size);
                            try {
                                LocationManager locationManager3 = f23342b;
                                if (locationManager3 != null && locationManager3.isProviderEnabled(str)) {
                                    try {
                                        lastKnownLocation2 = locationManager3.getLastKnownLocation(str);
                                    } catch (SecurityException unused2) {
                                    }
                                    if (lastKnownLocation2 != null) {
                                        break;
                                    }
                                    if (i4 < 0) {
                                        break;
                                        break;
                                    }
                                    size = i4;
                                } else {
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size = i4;
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
        }
        String TAG = f23344e;
        Intrinsics.e(TAG, "TAG");
        return lastKnownLocation2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007d  */
    public static HashMap a(Location location, boolean z2, Location location2) {
        HashMap map = new HashMap();
        Context contextD = Uc.d();
        if (contextD != null) {
            if (location != null) {
                if (location.getTime() > 0) {
                    map.put("u-ll-ts", Long.valueOf(location.getTime()));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(location.getLatitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append(location.getLongitude());
                sb.append(AbstractJsonLexerKt.COMMA);
                sb.append((int) location.getAccuracy());
                map.put("u-latlong-accu", sb.toString());
                map.put("sdk-collected", Integer.valueOf(z2 ? 1 : 0));
            }
            String strH = Uc.f23270a.h();
            if (strH != null) {
                LinkedHashMap linkedHashMap = O2.f23027a;
                Config configA = M2.a("signals", strH, null);
                Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig");
                if (((SignalsConfig) configA).getIce().getLocationEnabled()) {
                    map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
                }
            } else {
                map.put("loc-allowed", Integer.valueOf(e() ? 1 : 0));
            }
            if (location2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location2.getLatitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(location2.getLongitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append((int) location2.getAccuracy());
                map.put("u-latlong-accu-fine", sb2.toString());
                map.put("u-ll-ts-fine", Long.valueOf(location2.getTime()));
            }
            if (e() && c()) {
                if (AbstractC3290wa.a(contextD, "android.permission.ACCESS_COARSE_LOCATION")) {
                    map.put("loc-granularity", "coarse");
                }
            } else {
                map.put("loc-granularity", "none");
                return map;
            }
        }
        return map;
    }
}
