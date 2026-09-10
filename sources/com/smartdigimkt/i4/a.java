package com.smartdigimkt.i4;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PowerManager;
import com.smartdigimkt.p4.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f35834b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35835c = 1;
    public static final int d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f35836e = 3;
    public static final int f = 4;
    private static final int g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f35837h = 16;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f35838i = 7;
    private static final String j = "Requirements";
    private static final String[] k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35839a;

    /* JADX INFO: renamed from: com.smartdigimkt.i4.a$a, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0505a {
    }

    public a(int i2, boolean z2, boolean z3) {
        this(i2 | (z2 ? 16 : 0) | (z3 ? 8 : 0));
    }

    private static void a(String str) {
    }

    public int b() {
        return this.f35839a;
    }

    public boolean c() {
        return (this.f35839a & 16) != 0;
    }

    public boolean d() {
        return (this.f35839a & 8) != 0;
    }

    public String toString() {
        return super.toString();
    }

    public a(int i2) {
        this.f35839a = i2;
    }

    private boolean b(Context context) {
        if (!d()) {
            return true;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i2 = f0.f37540a;
        if (i2 >= 23) {
            if (powerManager.isDeviceIdleMode()) {
                return false;
            }
        } else if (i2 >= 20) {
            if (powerManager.isInteractive()) {
                return false;
            }
        } else if (powerManager.isScreenOn()) {
            return false;
        }
        return true;
    }

    private boolean c(Context context) {
        int iA = a();
        if (iA == 0) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            a("No network info or no connection.");
            return false;
        }
        if (!a(connectivityManager)) {
            return false;
        }
        if (iA == 1) {
            return true;
        }
        if (iA == 3) {
            boolean zIsRoaming = activeNetworkInfo.isRoaming();
            a("Roaming: " + zIsRoaming);
            return !zIsRoaming;
        }
        boolean zA = a(connectivityManager, activeNetworkInfo);
        a("Metered network: " + zA);
        if (iA == 2) {
            return !zA;
        }
        if (iA == 4) {
            return zA;
        }
        throw new IllegalStateException();
    }

    public int a() {
        return this.f35839a & 7;
    }

    public boolean d(Context context) {
        return c(context) && a(context) && b(context);
    }

    private boolean a(Context context) {
        if (!c()) {
            return true;
        }
        Intent intentD = androidx.datastore.preferences.protobuf.a.d("android.intent.action.BATTERY_CHANGED", context, null);
        if (intentD == null) {
            return false;
        }
        int intExtra = intentD.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        if (f0.f37540a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            a("No active network.");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean z2 = networkCapabilities == null || !networkCapabilities.hasCapability(16);
        a("Network capability validated: " + z2);
        return !z2;
    }

    private static boolean a(ConnectivityManager connectivityManager, NetworkInfo networkInfo) {
        if (f0.f37540a >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        int type = networkInfo.getType();
        return (type == 1 || type == 7 || type == 9) ? false : true;
    }
}
